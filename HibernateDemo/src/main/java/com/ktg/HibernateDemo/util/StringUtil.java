package com.ktg.HibernateDemo.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Date;
import java.util.Random;

public class StringUtil {
	
	 private StringUtil() {
	    }

	    /**
	     * Checks whether the given string is empty or <code>null</code>.
	     *
	     * @param str the string to be checked
	     * @return true if the string is <code>null</code> or empty
	     * (<code>length == 0</code>)
	     */
	    public static boolean isEmpty(String str) {
	        return null == str || str.isEmpty();
	    }

	    /**
	     * Trims the given string in <code>null</code> safe way.
	     *
	     * @param str the string to be trimmed
	     * @return null if <code>str</code> is null, else the trimmed string
	     */
	    public static String trim(String str) {
	        return null == str ? null : str.trim();
	    }

	    public static String randomString() {
	        long time = System.currentTimeMillis();
	        Random random = new Random();
	        int rand = random.nextInt(10000);
	        return String.format("%020d%04d", time, rand);
	    }

	    public static String urlEncode(String in) {
	        try {
	            return URLEncoder.encode(in, "UTF-8");
	        } catch (UnsupportedEncodingException ex) {
	            throw new IllegalStateException("Unexpected: ", ex);
	        }
	    }

	    public static String dateToLong(Date dt) {
	        return dt == null ? null : String.format("%020d", dt.getTime());
	    }

	    /**
	     * Escapes all '%' and '_' characters in the string using '\\' and encloses
	     * the string using '%', so that this string can be used in an SQL like
	     * condition.
	     *
	     * @param str the string to be converted
	     * @return converted string. <code>null</code> if <code>str</code> is
	     * <code>null</code>.
	     */
	    public static String createSearchKey(String str) {
	        if (null == str) {
	            return null;
	        }
	        return "%" + str.replaceAll("([%_])", "\\\\$1") + "%";
	    }

}
