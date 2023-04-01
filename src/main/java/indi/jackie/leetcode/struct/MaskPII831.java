package indi.jackie.leetcode.struct;

/**
 * @author jackie chen
 * @create 2023/4/1
 * @description MaskPII831
 */
public class MaskPII831 {
    private static final String EMAIL = "@";

    private static final String[] countryPrefix = new String[]{"", "+*-", "+**-", "+***-"};

    public String maskPII(String s) {
        if (s.contains(EMAIL)) {
            return maskEmail(s);
        } else {
            return maskPhone(s);
        }
    }

    private String maskPhone(String s) {
        s = s.replaceAll("[^0-9]", "");
        return countryPrefix[s.length() - 10] + "***-***-" + s.substring(s.length() - 4);
    }

    private String maskEmail(String s) {
        s = s.toLowerCase();
        int atIndex = s.indexOf('@');
        return s.charAt(0) + "*****" + s.substring(atIndex - 1);
    }
}
