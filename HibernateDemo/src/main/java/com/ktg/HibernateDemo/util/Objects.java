package com.ktg.HibernateDemo.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TimeZone;

public class Objects {

    private static final MathContext MATH_CONTEXT = MathContext.DECIMAL32;
    private static final Integer IO_BUFFER_SIZE = 1024;
    private static final Integer IO_FLUSH_INTERVAL = 5;
    private static final String SDF_ddMMMyy = "dd MMM yy";
    private static final String SDF_ddMMMyyyy = "dd MMM yyyy";
    private static final String SDF_ddMMyy = "dd/MM/yy";
    private static final String SDF_ddMMMyyyyHHmm = "dd MMM yyyy HH:mm";

    public static boolean isEmpty(String string) {
        return string == null || string.isEmpty();
    }

    public static boolean isEmpty(Collection c) {
        return c == null || c.isEmpty();
    }

    public static boolean isNull(Object o) {
        return o == null;
    }

    public static int size(Collection c) {
        return c == null ? 0 : c.size();
    }

    public static int size(String s) {
        return s == null ? 0 : s.length();
    }

    public static int size(Map m) {
        return m == null ? 0 : m.size();
    }

    public static <T> boolean contains(Collection<T> c, T o) {
        return isEmpty(c) ? false : c.contains(o);
    }

    public static <T> boolean remove(Collection<T> c, T o) {
        return isEmpty(c) ? false : c.remove(o);
    }

    public static boolean equals(Object o1, Object o2) {
        return o1 == o2 || (o1 != null && o1.equals(o2));
    }

    public static <T extends Enum<T>> Optional<T> getEnum(Class<T> e, Number b, T defautl) {
        if (b != null) {
            int pos = b.intValue() - 1;
            T[] enums = e.getEnumConstants();
            if (pos >= 0 && pos < enums.length) {
                return Optional.of(enums[pos]);
            }
        }

        return Optional.ofNullable(defautl);
    }

    public static <T extends Enum<T>> Optional<Byte> getByte(Enum<T> e, Byte defautl) {
        if (e != null) {
            Integer val = e.ordinal() + 1;
            return Optional.of(val.byteValue());
        }
        return Optional.ofNullable(defautl);
    }

    public static Long getLongTime(Date date) {
        return date != null ? date.getTime() : null;
    }

    public static BigDecimal add(BigDecimal bd1, BigDecimal bd2) {
        bd1 = bd1 == null ? BigDecimal.ZERO : bd1;
        bd2 = bd2 == null ? BigDecimal.ZERO : bd2;
        return bd1.add(bd2, MATH_CONTEXT);
    }

    public static BigDecimal sub(BigDecimal bd1, BigDecimal bd2) {
        bd1 = bd1 == null ? BigDecimal.ZERO : bd1;
        bd2 = bd2 == null ? BigDecimal.ZERO : bd2;
        return bd1.subtract(bd2, MATH_CONTEXT);
    }

    public static BigDecimal mul(BigDecimal bd1, BigDecimal bd2) {
        bd1 = bd1 == null ? BigDecimal.ZERO : bd1;
        bd2 = bd2 == null ? BigDecimal.ZERO : bd2;
        return bd1.multiply(bd2, MATH_CONTEXT);
    }

    public static BigDecimal div(BigDecimal bd1, BigDecimal bd2) {
        if (bd2 == null || bd2.compareTo(BigDecimal.ZERO) == 0) {
            return null;
        }
        bd1 = bd1 == null ? BigDecimal.ZERO : bd1;
        return bd1.divide(bd2, MATH_CONTEXT);
    }

    public static long copy(InputStream is, OutputStream os) throws IOException {
        byte[] buffer = new byte[IO_BUFFER_SIZE];

        long copied = 0;
        int count = 1;
        while (is.available() > 0) {
            int read = is.read(buffer);
            os.write(buffer, 0, read);
            if (count % IO_FLUSH_INTERVAL == 0) {
                os.flush();
            }
            copied += read;
            count++;
        }

        os.flush();

        return copied;
    }

    public static String format_ddMMMyyyy(Date date, String timezone) {
        return formatDate(date, SDF_ddMMMyyyy, timezone);
    }

    public static String format_ddMMMyy(Date date, String timezone) {
        return formatDate(date, SDF_ddMMMyy, timezone);
    }

    public static String format_ddMMMyy(Long date, String timezone) {
        return format_ddMMMyy(date != null ? new Date(date) : null, timezone);
    }

    public static Date parse_ddMMMyy(String s) throws ParseException {
        return parseDate(s, SDF_ddMMMyy);
    }

    public static String format_ddMMMyyyy(Long date, String timezone) {
        return format_ddMMMyyyy(date != null ? new Date(date) : null, timezone);
    }

    public static Date parse_ddMMMyyyy(String s) throws ParseException {
        return parseDate(s, SDF_ddMMMyyyy);
    }

    public static String format_ddMMMyyyyHHmm(Date date, String timezone) {
        return formatDate(date, SDF_ddMMMyyyyHHmm, timezone);
    }

    public static Date parse_ddMMMyyyyHHmm(String s) throws ParseException {
        return parseDate(s, SDF_ddMMMyyyyHHmm);
    }

    public static String format_ddMMyy(Date date, String timezone) {
        return formatDate(date, SDF_ddMMyy, timezone);
    }

    public static Date parse_ddMMyy(String s) throws ParseException {
        return parseDate(s, SDF_ddMMyy);
    }

    private static String formatDate(Date date, String pattern, String timezone) {
        if (date != null) {
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            if (timezone != null) {
                sdf.setTimeZone(TimeZone.getTimeZone(timezone));
            }
            return sdf.format(date);
        }
        return "";
    }

    private static Date parseDate(String dateString, String pattern) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.parse(dateString);
    }

    public static String strJoin(List aArr, String sSep) {
        StringBuilder sbStr = new StringBuilder();
        for (int i = 0, il = aArr.size(); i < il; i++) {
            if (i > 0)
                sbStr.append(sSep);
            sbStr.append(aArr.get(i).toString());
        }
        return sbStr.toString();
    }
}
