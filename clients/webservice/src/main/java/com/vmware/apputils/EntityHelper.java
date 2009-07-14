package com.vmware.apputils;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.vmware.vim.sms.EntityReference;
import com.vmware.vim.sms.EntityReferenceEntityType;

/**
 * Helper methods for using entity reference objects.
 */
public class EntityHelper {
	private static Log log = new Log();

	/** Maps managed object id prefixes to entity types */
	private static HashMap<String, EntityReferenceEntityType> moIdPrefixToEntityTypeMap = new HashMap<String, EntityReferenceEntityType>();

	/** Maps entity types to managed object id prefixes */
	private static HashMap<EntityReferenceEntityType, String> entityTypeToMoIdPrefixMap = new HashMap<EntityReferenceEntityType, String>();

	/** Maps entity types to MOR types */
	private static HashMap<EntityReferenceEntityType, String> entityTypeToMORTypeMap = new HashMap<EntityReferenceEntityType, String>();

	static {
		moIdPrefixToEntityTypeMap.put("datacenter",
				EntityReferenceEntityType.datacenter);
		moIdPrefixToEntityTypeMap.put("domain-c",
				EntityReferenceEntityType.cluster);
		moIdPrefixToEntityTypeMap.put("host", EntityReferenceEntityType.host);
		moIdPrefixToEntityTypeMap.put("resgroup",
				EntityReferenceEntityType.resourcePool);
		moIdPrefixToEntityTypeMap.put("datastore",
				EntityReferenceEntityType.datastore);
		moIdPrefixToEntityTypeMap.put("vm", EntityReferenceEntityType.vm);

		entityTypeToMoIdPrefixMap.put(EntityReferenceEntityType.datacenter,
				"datacenter");
		entityTypeToMoIdPrefixMap.put(EntityReferenceEntityType.cluster,
				"domain-c");
		entityTypeToMoIdPrefixMap.put(EntityReferenceEntityType.host, "host");
		entityTypeToMoIdPrefixMap.put(EntityReferenceEntityType.resourcePool,
				"resgroup");
		entityTypeToMoIdPrefixMap.put(EntityReferenceEntityType.datastore,
				"datastore");
		entityTypeToMoIdPrefixMap.put(EntityReferenceEntityType.vm, "vm");

		entityTypeToMORTypeMap.put(EntityReferenceEntityType.datacenter,
				"Datacenter");
		entityTypeToMORTypeMap.put(EntityReferenceEntityType.cluster,
				"ClusterComputeResource");
		entityTypeToMORTypeMap
				.put(EntityReferenceEntityType.host, "HostSystem");
		entityTypeToMORTypeMap.put(EntityReferenceEntityType.resourcePool,
				"ResourcePool");
		entityTypeToMORTypeMap.put(EntityReferenceEntityType.datastore,
				"Datastore");
		entityTypeToMORTypeMap.put(EntityReferenceEntityType.vm,
				"VirtualMachine");
	}

	/**
	 * Takes a VC ManagedObjectReference Id and constructs a valid
	 * EntityReference from it.
	 * 
	 * @param mor
	 *            managed object reference to translate
	 * 
	 * @return EntityReference
	 * @throws ArgumentHandlingException
	 *             if input mor is invalid
	 */
	public static EntityReference parseEntityReference(
			com.vmware.vim.ManagedObjectReference mor)
			throws ArgumentHandlingException {
		if (mor == null) {
			return null;
		}

		String extractedEntityTypeStr = null;
		Pattern pattern = Pattern.compile("^[a-z]+\\-[a-z]*");
		Matcher matcher = pattern.matcher(mor.get_value());
		if (matcher.find()) {
			extractedEntityTypeStr = matcher.group();
		}
		if (extractedEntityTypeStr == null) {
			/**
			 * This means the user has not sent a valid ManagedObjectReference
			 */
			log.logLine("Invalid MOR - value field is in invalid format: "
					+ mor.get_value());
			throw new ArgumentHandlingException(
					"Invalid MOR - value field is in invalid format");
		}

		int len = extractedEntityTypeStr.length();
		if (extractedEntityTypeStr.charAt(len - 1) == '-') {
			extractedEntityTypeStr = extractedEntityTypeStr.substring(0,
					len - 1);
		}

		/** Look up the entity type using the type map */
		EntityReferenceEntityType extractedEntityType = moIdPrefixToEntityTypeMap
				.get(extractedEntityTypeStr);

		if (extractedEntityType == null) {
			log.logLine("Invalid MOR - unknown object type : "
					+ mor.get_value());
			throw new ArgumentHandlingException(
					"Invalid MOR - unknown object type");
		}

		/**
		 * If we reach here, we expected to find a trailing number Id
		 */
		String extractedEntityId = null;
		pattern = Pattern.compile("[0-9]+$");
		matcher = pattern.matcher(mor.get_value());
		if (matcher.find()) {
			extractedEntityId = matcher.group();
		}
		if (extractedEntityId == null) {
			/**
			 * This means the user has not sent a VC ManagedObjectReference Id
			 */
			log.logLine("Invalid MOR - invalid id : " + mor.get_value());
			throw new ArgumentHandlingException("Invalid MOR - invalid id");
		}

		EntityReference convertedRef = new EntityReference();
		convertedRef.setId(extractedEntityId);
		convertedRef.setType(extractedEntityType);
		return convertedRef;
	}

	/**
	 * Converts the given entity reference, which represents a managed object,
	 * to a ManagedObjectReference type.
	 * 
	 * @param entity
	 *            MO entity reference
	 * 
	 * @return ManagedObjectReference
	 * @throws ArgumentHandlingException
	 *             if an invalid entity is specified
	 */
	public static com.vmware.vim.ManagedObjectReference parseMOR(
			EntityReference entity) throws ArgumentHandlingException {

		EntityReferenceEntityType entityType = entity.getType();

		if (entityType == null) {
			log.logLine("Invalid entity type: " + entity.getType());
			throw new ArgumentHandlingException("Invalid entity type");
		}

		String morType = entityTypeToMORTypeMap.get(entityType);
		String idPrefix = entityTypeToMoIdPrefixMap.get(entityType);
		if (idPrefix.indexOf('-') == -1) {
			idPrefix = idPrefix.concat("-");
		}

		String moid = idPrefix.concat(entity.getId());

		com.vmware.vim.ManagedObjectReference mor = new com.vmware.vim.ManagedObjectReference(
				moid);
		mor.setType(morType);
		return mor;
	}
}
