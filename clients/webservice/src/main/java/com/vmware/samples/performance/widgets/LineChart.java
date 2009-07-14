package com.vmware.samples.performance.widgets;

/* 
 * Copyright 2002-2004 The Apache Software Foundation
 * Licensed  under the  Apache License,  Version 2.0  (the "License");
 * you may not use  this file  except in  compliance with the License.
 * You may obtain a copy of the License at 
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed  under the  License is distributed on an "AS IS" BASIS,
 * WITHOUT  WARRANTIES OR CONDITIONS  OF ANY KIND, either  express  or
 * implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

//package org.apache.excalibur.instrument.client;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JComponent;

/**
 * Draws a nice pretty chart given a set of data.
 * 
 * @author <a href="mailto:dev@avalon.apache.org">Avalon Development Team</a>
 */
public class LineChart extends JComponent implements MouseListener,
		MouseMotionListener {
	/** Stores the time-zone offset for this JVM. */
	private static long m_zoneOffset;
	private static final long serialVersionUID = 1L;

	private Color m_lineColor = Color.red;
	private Color m_lightLineColor = new Color(255, 128, 128);
	private Color m_lightGridColor = new Color(192, 192, 192);
	private Color m_darkGridColor = new Color(128, 128, 128);
	private Color m_frameColor = Color.black;
	private Color m_crossColor = Color.blue;
	private Color m_maskFrameColor = new Color(128, 128, 255, 192);
	private Color m_maskColor = new Color(224, 224, 255, 192);

	/** Number of sample points between vertical lines. */
	private int m_lineSampleInterval;

	/** The number of milliseconds represented by each data sample. */
	private long m_sampleInterval;

	/**
	 * Format of the text which is displayed along the x (time) axis of the
	 * chart.
	 */
	private String m_format;

	/**
	 * Format of the text which is displayed over the component as the user
	 * moves the mouse over the line chart.
	 */
	private String m_dFormat;

	/** Number of sample points to use when calculating the moving average. */
	private int m_averageWindow;

	/** True if Antialiasing should be used when rendering the chart. */
	private boolean m_antialias;

	/** Time of the last sample point. */
	private long m_time;

	/** Sample point data. */
	private int[] m_values;

	/** Moving average of the sample point data. */
	private float[] m_averageWindowValues;

	/** Minimum value in m_values. */
	private int m_min;

	/** Maximum value in m_values. */
	private int m_max;

	/** Integer number format. */
	private DecimalFormat m_intFormat = new DecimalFormat("###,###,###,##0");

	/** Decimal number format. */
	private DecimalFormat m_floatFormat = new DecimalFormat(
			"###,###,###,##0.00");

	private boolean m_mouseOver;
	private boolean m_mousePressed;
	private int m_mouseX;
	private int m_mouseY;

	/*---------------------------------------------------------------
	 * Static Initializer
	 *-------------------------------------------------------------*/
	static {
		Calendar now = Calendar.getInstance();
		m_zoneOffset = now.get(Calendar.ZONE_OFFSET);
	}

	/*---------------------------------------------------------------
	 * Constructor
	 *-------------------------------------------------------------*/
	/**
	 * @param lineSampleInterval
	 *            The interval in data points at which to place vertical lines
	 *            and labels along the x (time) axis.
	 * @param sampleInterval
	 *            The number of milliseconds represented by each data sample.
	 * @param format
	 *            Format of the text which is displayed along the x (time) axis
	 *            of the chart. The text will display the time of the line chart
	 *            at a particular interval. The text should take the format
	 *            "{0}/{1}/{2} {3}:{4}:{5}.{6}" where {0} is replaced by the
	 *            year, {1} by the month, {2} by the day, {3} by the hour, {4}
	 *            by the minute, {5} by the second, and {6} by the hundereths of
	 *            a second.
	 * @param detailFormat
	 *            Format of the text which is displayed over the component as
	 *            the user moves the mouse over the line chart. The text will
	 *            display the exact value of the line chart at a particular
	 *            point. The text should take the format
	 *            "{0}/{1}/{2} {3}:{4}:{5}.{6}" where {0} is replaced by the
	 *            year, {1} by the month, {2} by the day, {3} by the hour, {4}
	 *            by the minute, {5} by the second, and {6} by the hundereths of
	 *            a second.
	 * @param averageWindow
	 *            Number of data points to do a moving average over when the
	 *            mouse is pressed on the component.
	 * @param antialias
	 *            True if Antialiasing should be used when rendering the chart.
	 */
	public LineChart(int lineSampleInterval, long sampleInterval,
			String format, String detailFormat, int averageWindow,
			boolean antialias) {
		m_lineSampleInterval = lineSampleInterval;
		m_sampleInterval = sampleInterval;
		m_format = format;
		m_dFormat = detailFormat;
		m_averageWindow = averageWindow;
		m_antialias = antialias;

		setBackground(Color.white);
		setValues(new int[0], System.currentTimeMillis());
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	/*---------------------------------------------------------------
	 * Methods
	 *-------------------------------------------------------------*/
	/**
	 * Sets the antialias flag to control whether or not antialiasing will be
	 * used when rendering the component.
	 * 
	 * @param antialias
	 *            True to use antialiasing.
	 */
	public void setAntialias(boolean antialias) {
		m_antialias = antialias;
	}

	/**
	 * Sets the data samples to be displayed by the line chart.
	 * 
	 * @param values
	 *            Array of data samples.
	 * @param time
	 *            The time of the start of the last sample point.
	 */
	public void setValues(int[] values, long time) {
		int max = 0;
		int min = Integer.MAX_VALUE;
		for (int v : values) {
			if (v > max) {
				max = v;
			}
			if (v < min) {
				min = v;
			}
		}
		if ((max - min) < 10) {
			max += ((10 - (max - min)) / 2);
			min -= (10 - (max - min));
		}
		if (min < 0) {
			max += -min;
			min = 0;
		}

		float[] averageValues = new float[values.length];
		if (m_averageWindow > 1) {
			int total = 0;
			for (int i = 0; i < values.length; i++) {
				total += values[i];
				if (i >= m_averageWindow - 1) {
					if (i >= m_averageWindow) {
						total -= values[i - m_averageWindow];
					}
					averageValues[i] = (float) total / m_averageWindow;
				} else {
					averageValues[i] = Float.MIN_VALUE;
				}
			}
		}

		synchronized (this) {
			m_time = time;
			m_values = values;
			m_averageWindowValues = averageValues;
			m_min = min;
			m_max = max;
		}

		repaint();
	}

	private String getFormattedTime(Date dTime, boolean detailed) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dTime);

		int v;
		String year, month, day, hour, minute, second, hundreths;

		// Substitute the year
		v = calendar.get(Calendar.YEAR);
		year = Integer.toString(v);

		// Substitute the month
		v = calendar.get(Calendar.MONTH) - Calendar.JANUARY + 1;
		if (v < 10) {
			month = "0" + Integer.toString(v);
		} else {
			month = Integer.toString(v);
		}

		// Substitute the Day
		v = calendar.get(Calendar.DAY_OF_MONTH);
		if (v < 10) {
			day = "0" + Integer.toString(v);
		} else {
			day = Integer.toString(v);
		}

		// Substitute the Hour
		v = calendar.get(Calendar.HOUR_OF_DAY);
		if (v < 10) {
			hour = "0" + Integer.toString(v);
		} else {
			hour = Integer.toString(v);
		}

		// Substitute the Minute
		v = calendar.get(Calendar.MINUTE);
		if (v < 10) {
			minute = "0" + Integer.toString(v);
		} else {
			minute = Integer.toString(v);
		}

		// Substitute the Second
		v = calendar.get(Calendar.SECOND);
		if (v < 10) {
			second = "0" + Integer.toString(v);
		} else {
			second = Integer.toString(v);
		}

		// Substitute the Hudreths of a Second
		v = calendar.get(Calendar.MILLISECOND) / 10;
		if (v < 10) {
			hundreths = "0" + Integer.toString(v);
		} else {
			hundreths = Integer.toString(v);
		}

		String format;
		if (detailed) {
			format = MessageFormat.format(m_dFormat, new Object[] { year,
					month, day, hour, minute, second, hundreths });
		} else {
			format = MessageFormat.format(m_format, new Object[] { year, month,
					day, hour, minute, second, hundreths });
		}
		return format;
	}

	/**
	 * Draws the horizontal lines which make up the background of the chart.
	 * 
	 * @param g
	 *            Graphics object to paint with.
	 * @param yLabelInterval
	 *            Interval at which the lines should be labeled.
	 * @param fontHeight
	 *            The height of the current font.
	 * @param chartLeft
	 *            Left edge of the chart.
	 * @param chartTop
	 *            Top edge of the chart.
	 * @param chartWidth
	 *            Width of the chart.
	 * @param chartHeight
	 *            Height of the chart.
	 */
	private void paintHorizontalGrid(Graphics g, int yLabelInterval,
			int fontHeight, int chartLeft, int chartTop, int chartWidth,
			int chartHeight) {
		if (chartHeight > 0) {
			int horizonalLineLabeledInterval = (int) Math
					.ceil((float) fontHeight
							/ ((long) yLabelInterval * chartHeight / (m_max - m_min)));
			int horizontalLineNumber = 0;
			for (int i = ((int) Math.ceil((float) m_min / yLabelInterval))
					* yLabelInterval; i < m_max; i += yLabelInterval) {
				// Calculate the location of the line on the y-axis. Be careful
				// of very large numbers.
				int y = chartTop
						+ chartHeight
						- (int) ((long) chartHeight * (i - m_min) / (m_max - m_min));

				if (horizontalLineNumber >= horizonalLineLabeledInterval) {
					horizontalLineNumber = 0;
				}
				if (horizontalLineNumber == 0) {
					String lbl = m_intFormat.format(i);
					g.setColor(m_frameColor);
					g.drawString(lbl, chartLeft - 5
							- g.getFontMetrics().stringWidth(lbl), y
							+ (fontHeight >> 1));

					g.setColor(m_darkGridColor);
				} else {
					g.setColor(m_lightGridColor);
				}
				horizontalLineNumber++;

				if (chartWidth > 0) {
					g.drawLine(chartLeft, y, chartLeft + chartWidth, y);
				}
			}
		}
	}

	/**
	 * Draws the vertical lines which make up the background of the chart.
	 * 
	 * @param g
	 *            Graphics object to paint with.
	 * @param fontHeight
	 *            The height of the current font.
	 * @param chartLeft
	 *            Left edge of the chart.
	 * @param chartTop
	 *            Top edge of the chart.
	 * @param chartWidth
	 *            Width of the chart.
	 * @param chartHeight
	 *            Height of the chart.
	 */
	private void paintVerticalGrid(Graphics g, int fontHeight, int chartLeft,
			int chartTop, int chartWidth, int chartHeight) {
		if (chartWidth > 0) {
			FontMetrics fontMetrics = g.getFontMetrics();

			// Figure out how wide a label is for formatting.
			String format = MessageFormat.format(m_format, "00", "00", "00",
					"00");
			int fw = fontMetrics.stringWidth(format) + 10;

			// Figure out what internal of lines we can place labels under.
			int verticalLineLabeledInterval;
			if ((m_values.length > 0) && (chartWidth > 0)) {
				verticalLineLabeledInterval = (int) Math
						.ceil((float) fw
								/ (m_lineSampleInterval * chartWidth / (m_values.length)));
			} else {
				verticalLineLabeledInterval = 1;
			}

			// Calculate a base time for drawing the vertical lines.
			long baseTime = ((m_time - m_values.length * m_sampleInterval) / (m_sampleInterval * m_lineSampleInterval))
					* (m_sampleInterval * m_lineSampleInterval) - m_zoneOffset;

			// Draw each of the lines.
			int verticalLineNumber = 0;
			for (int i = 0; i < m_values.length; i++) {
				long time = m_time - (m_values.length - i - 1)
						* m_sampleInterval;
				if ((((time - baseTime) / m_sampleInterval) % m_lineSampleInterval) == 0) {
					int x = chartLeft + i * chartWidth / (m_values.length - 1);

					// Draw a label under the line if line should have a label.
					if ((verticalLineNumber >= verticalLineLabeledInterval)
							|| (verticalLineNumber == 0)) {
						format = getFormattedTime(new Date(time), false);

						if (x - fontMetrics.stringWidth(format) / 2 >= chartLeft) {
							g.setColor(m_frameColor);
							g.drawString(format, x
									- fontMetrics.stringWidth(format) / 2,
									chartTop + chartHeight + fontHeight);

							g.setColor(m_darkGridColor);
							verticalLineNumber = 1;
						} else {
							g.setColor(m_lightGridColor);
						}
					} else {
						g.setColor(m_lightGridColor);
						verticalLineNumber++;
					}

					// Draw the vertical line
					if (chartHeight > 0) {
						g.drawLine(x, chartTop, x, chartTop + chartHeight);
					}
				}
			}
		}
	}

	/**
	 * Draws the frame around the whole chart.
	 * 
	 * @param g
	 *            Graphics object to paint with.
	 * @param chartLeft
	 *            Left edge of the chart.
	 * @param chartTop
	 *            Top edge of the chart.
	 * @param chartWidth
	 *            Width of the chart.
	 * @param chartHeight
	 *            Height of the chart.
	 */
	private void paintFrame(Graphics g, int chartLeft, int chartTop,
			int chartWidth, int chartHeight) {
		if ((chartWidth > 0) && (chartHeight > 0)) {
			g.setColor(m_frameColor);
			g.drawLine(chartLeft, chartTop, chartLeft, chartTop + chartHeight);
			g.drawLine(chartLeft, chartTop + chartHeight, chartLeft
					+ chartWidth, chartTop + chartHeight);
		}
	}

	/**
	 * Draws the data values which to be displayed in the chart.
	 * 
	 * @param g
	 *            Graphics object to paint with.
	 * @param chartLeft
	 *            Left edge of the chart.
	 * @param chartTop
	 *            Top edge of the chart.
	 * @param chartWidth
	 *            Width of the chart.
	 * @param chartHeight
	 *            Height of the chart.
	 */
	private void paintValues(Graphics g, int chartLeft, int chartTop,
			int chartWidth, int chartHeight) {
		if ((m_averageWindow > 0) && (m_mousePressed)) {
			g.setColor(m_lightLineColor);
		} else {
			g.setColor(m_lineColor);
		}

		int lastX = 0;
		int lastY = 0;
		for (int i = 0; i < m_values.length; i++) {
			// Calculate the location of the point on the x-axis.
			int x = chartLeft + i * chartWidth / (m_values.length - 1);

			// Calculate the location of the line on the y-axis. Be careful
			// of very large numbers.
			int y = chartTop
					+ chartHeight
					- (int) ((long) chartHeight * (m_values[i] - m_min) / (m_max - m_min));

			if (i > 0) {
				g.drawLine(lastX, lastY, x, y);
			}

			lastX = x;
			lastY = y;
		}

		// Draw the averaged values of the chart
		if ((m_averageWindow > 0) && (m_mousePressed)) {
			g.setColor(m_lineColor);
			lastX = 0;
			lastY = 0;
			for (int i = m_averageWindow; i < m_averageWindowValues.length; i++) {
				// Calculate the location of the point on the x-axis.
				int x = chartLeft + i * chartWidth
						/ (m_averageWindowValues.length - 1);

				// Calculate the location of the line on the y-axis. Be careful
				// of very large
				// numbers. The float value average valus makes this easy here.
				int y = chartTop
						+ chartHeight
						- (int) (chartHeight
								* (m_averageWindowValues[i] - m_min) / (m_max - m_min));

				if (i > m_averageWindow) {
					g.drawLine(lastX, lastY, x, y);
				}

				lastX = x;
				lastY = y;
			}
		}
	}

	/**
	 * Draws the overlay label at the specified location.
	 * 
	 * @param g
	 *            Graphics object to paint with.
	 * @param fontHeight
	 *            The height of the current font.
	 * @param chartLeft
	 *            Left edge of the chart.
	 * @param chartTop
	 *            Top edge of the chart.
	 * @param chartWidth
	 *            Width of the chart.
	 * @param chartHeight
	 *            Height of the chart.
	 */
	private void paintOverlayAt(Graphics g, int fontHeight, int chartLeft,
			int chartTop, int chartWidth, int chartHeight, int mouseDataPointX,
			int mouseDataPointY, String mouseDataPointValue,
			long mouseDataPointTime) {
		// Draw a cross at the point being to be labeled.
		g.setColor(m_crossColor);
		g.drawLine(mouseDataPointX, chartTop, mouseDataPointX, chartTop
				+ chartHeight);
		g.drawLine(chartLeft, mouseDataPointY, chartLeft + chartWidth,
				mouseDataPointY);

		// Get the text of the label
		String mouseDataPointLabel = mouseDataPointValue + " : "
				+ getFormattedTime(new Date(mouseDataPointTime), true);
		int mouseDataPointLabelWidth = g.getFontMetrics().stringWidth(
				mouseDataPointLabel);
		int mouseDataPointLabelLeft;
		int mouseDataPointLabelTop;

		// If the point is near the edges of the chart, then it
		// would run off the chart. To avoid this, the label is
		// moved around relative to the location of the cross.
		// Decide where it should go.
		if (mouseDataPointX + 5 + mouseDataPointLabelWidth < chartLeft
				+ chartWidth) {
			// Ok on the right
			mouseDataPointLabelLeft = mouseDataPointX + 4;
			if (mouseDataPointY + 5 + fontHeight < chartTop + chartHeight) {
				// Ok on the bottom
				mouseDataPointLabelTop = mouseDataPointY + 4;
			} else {
				// Must go on the top
				mouseDataPointLabelTop = mouseDataPointY - 4 - fontHeight;
			}
		} else {
			// Must go on the left
			mouseDataPointLabelLeft = mouseDataPointX - 4
					- mouseDataPointLabelWidth;
			if (mouseDataPointY + 5 + fontHeight < chartTop + chartHeight) {
				// Ok on the bottom
				mouseDataPointLabelTop = mouseDataPointY + 4;
			} else {
				// Must go on the top
				mouseDataPointLabelTop = mouseDataPointY - 4 - fontHeight;
			}
		}

		// Draw an outline around the location of the label.
		g.setColor(m_maskFrameColor);
		g.drawRect(mouseDataPointLabelLeft - 1, mouseDataPointLabelTop - 1,
				mouseDataPointLabelWidth + 2, fontHeight + 2);

		// Draw the background of the label. By default this is partly
		// transparent and
		// looks better on top of the outline.
		g.setColor(m_maskColor);
		g.fillRect(mouseDataPointLabelLeft - 1, mouseDataPointLabelTop - 1,
				mouseDataPointLabelWidth + 2, fontHeight + 2);

		// Draw the text of the label.
		g.setColor(m_crossColor);
		g.drawString(mouseDataPointLabel, mouseDataPointLabelLeft,
				mouseDataPointLabelTop + fontHeight);
	}

	/**
	 * Draws the overlay label at the mouse location.
	 * 
	 * @param g
	 *            Graphics object to paint with.
	 * @param fontHeight
	 *            The height of the current font.
	 * @param chartLeft
	 *            Left edge of the chart.
	 * @param chartTop
	 *            Top edge of the chart.
	 * @param chartWidth
	 *            Width of the chart.
	 * @param chartHeight
	 *            Height of the chart.
	 */
	private void paintOverlay(Graphics g, int fontHeight, int chartLeft,
			int chartTop, int chartWidth, int chartHeight) {
		if ((m_mouseOver) && (m_mouseX >= chartLeft)
				&& (m_mouseX <= chartLeft + chartWidth)) {
			// Figure out the index of the data point where the mouse is.
			int index = Math.round((float) (m_values.length - 1)
					* (m_mouseX - chartLeft) / chartWidth);

			// Draw the label
			int mouseDataPointX = 0;
			int mouseDataPointY = 0;
			String mouseDataPointValue = null;
			long mouseDataPointTime = 0;
			boolean showLabel = false;

			if ((m_averageWindow > 0) && (m_mousePressed)) {
				if ((index >= m_averageWindow)
						&& (index < m_averageWindowValues.length)) {
					// Draw the label for the average data

					// Calculate the location of the point on the x-axis.
					mouseDataPointX = chartLeft + index * chartWidth
							/ (m_averageWindowValues.length - 1);

					// Calculate the location of the line on the y-axis. Be
					// careful of very large numbers. The float value
					// average valus makes this easy here.
					mouseDataPointY = chartTop
							+ chartHeight
							- (int) (chartHeight
									* (m_averageWindowValues[index] - m_min) / (m_max - m_min));

					// Round the average value to 2 decimal places.
					mouseDataPointValue = m_floatFormat
							.format(m_averageWindowValues[index]);

					// Get the time at the mouse data point
					mouseDataPointTime = m_time
							- (m_averageWindowValues.length - index - 1)
							* m_sampleInterval;

					showLabel = true;
				}
			} else {
				if ((index >= 0) && (index < m_values.length)) {
					// Draw the label for the regular data.

					// Calculate the location of the point on the x-axis.
					mouseDataPointX = chartLeft + index * chartWidth
							/ (m_values.length - 1);

					// Calculate the location of the line on the y-axis.
					// Be careful of very large numbers.
					mouseDataPointY = chartTop
							+ chartHeight
							- (int) ((long) chartHeight
									* (m_values[index] - m_min) / (m_max - m_min));

					// Get the average value.
					mouseDataPointValue = m_intFormat.format(m_values[index]);

					// Get the time at the mouse data point
					mouseDataPointTime = m_time - (m_values.length - index - 1)
							* m_sampleInterval;

					showLabel = true;
				}
			}

			if (showLabel) {
				paintOverlayAt(g, fontHeight, chartLeft, chartTop, chartWidth,
						chartHeight, mouseDataPointX, mouseDataPointY,
						mouseDataPointValue, mouseDataPointTime);
			}
		}
	}

	/**
	 * Paints the component.
	 * 
	 * @param g
	 *            Graphics to paint the chart onto.
	 */
	@Override
	public synchronized void paintComponent(Graphics g) {
		Dimension size = getSize();
		Insets insets = getInsets();

		// If we directly test whether g is a Graphics2D using instanceof then
		// the class
		// must exist. If it exists then it will be a Graphics2D.
		if (g.getClass().getName().indexOf("Graphics2D") >= 0) {
			Graphics2D g2 = (Graphics2D) g;
			if (m_antialias) {
				g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
						RenderingHints.VALUE_ANTIALIAS_ON);
			} else {
				g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
						RenderingHints.VALUE_ANTIALIAS_OFF);
			}
		}

		g.setColor(getBackground());
		g.fillRect(insets.left, insets.top, size.width - insets.left
				- insets.right, size.height - insets.top - insets.bottom);

		// Resolve the vertical interval
		int yLabelInterval = 1;
		while ((m_max - m_min) / yLabelInterval > 20) {
			yLabelInterval *= 10;
		}

		FontMetrics fontMetrics = g.getFontMetrics();
		int maxYLabelWidth = fontMetrics.stringWidth(m_intFormat.format(m_max));
		int fontHeight = fontMetrics.getAscent();
		int fontHalfHeight = fontHeight / 2;

		int chartLeft = insets.left + maxYLabelWidth + 5;
		int chartTop = insets.top + 5;
		int chartWidth = size.width - chartLeft - insets.right - 1 - 5;
		int chartHeight = size.height - chartTop - insets.bottom - 1
				- fontHeight;

		// Draw the horizontal grid (Left to Right lines)
		paintHorizontalGrid(g, yLabelInterval, fontHeight, chartLeft, chartTop,
				chartWidth, chartHeight);

		// Draw the vertical grid (Top to Bottom lines)
		if (m_values.length > 1) {
			paintVerticalGrid(g, fontHeight, chartLeft, chartTop, chartWidth,
					chartHeight);
		}

		// Draw the frame
		paintFrame(g, chartLeft, chartTop, chartWidth, chartHeight);

		if ((chartWidth > 0) && (chartHeight > 0) && (m_values.length > 1)) {
			// Draw the the values that make up the data of the chart.
			paintValues(g, chartLeft, chartTop, chartWidth, chartHeight);

			// Make the label visible if the user tracks over any part of the
			// chart.
			paintOverlay(g, fontHeight, chartLeft, chartTop, chartWidth,
					chartHeight);
		}
	}

	/*---------------------------------------------------------------
	 * MouseListener Methods
	 *-------------------------------------------------------------*/
	/**
	 * Called when the mouse is clicked ont the component.
	 * 
	 * @param event
	 *            Event which describes the action.
	 */
	public void mouseClicked(MouseEvent event) {
	}

	/**
	 * Called when the mouse is pressed ont the component.
	 * 
	 * @param event
	 *            Event which describes the action.
	 */
	public void mousePressed(MouseEvent event) {
		m_mousePressed = true;
	}

	/**
	 * Called when the mouse is released ont the component.
	 * 
	 * @param event
	 *            Event which describes the action.
	 */
	public void mouseReleased(MouseEvent event) {
		m_mousePressed = false;
	}

	/**
	 * Called when the mouse is enters the component.
	 * 
	 * @param event
	 *            Event which describes the action.
	 */
	public void mouseEntered(MouseEvent event) {
		m_mouseOver = true;
		repaint();
	}

	/**
	 * Called when the mouse is exits the component.
	 * 
	 * @param event
	 *            Event which describes the action.
	 */
	public void mouseExited(MouseEvent event) {
		m_mouseOver = false;
		repaint();
	}

	/*---------------------------------------------------------------
	 * MouseMotionListener Methods
	 *-------------------------------------------------------------*/
	/**
	 * Called when the mouse is dragged over the component.
	 * 
	 * @param event
	 *            Event which describes the motion.
	 */
	public void mouseDragged(MouseEvent event) {
		m_mouseX = event.getX();
		m_mouseY = event.getY();
		repaint();
	}

	/**
	 * Called when the mouse is moved over the component.
	 * 
	 * @param event
	 *            Event which describes the motion.
	 */
	public void mouseMoved(MouseEvent event) {
		m_mouseX = event.getX();
		m_mouseY = event.getY();
		repaint();
	}
}
