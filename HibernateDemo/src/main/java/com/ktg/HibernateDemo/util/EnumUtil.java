package com.ktg.HibernateDemo.util;



public class EnumUtil {
	
	
	 private EnumUtil() {
	    }

	    public static <T extends Enum<T>> T getEnumFromString(Class<T> enumType, String name, T defaultValue) {
	        if (StringUtil.isEmpty(name)) {
	            return defaultValue;
	        }
	        try {
	            return Enum.valueOf(enumType, name.toUpperCase());
	        } catch (IllegalArgumentException e) {
	            return defaultValue;
	        }
	    }
	    
	    public static String getStringFromEnum(Enum enm) {
	        if (enm != null) {
	            return enm.name().toLowerCase();
	        }
	        return null;
	    }

}
