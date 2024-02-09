package com.amazonaws.services.s3.internal;

import java.util.regex.Pattern;

public enum BucketNameUtils {
    ;
    
    private static final Pattern IP_ADDRESS_PATTERN = null;
    private static final int MAX_BUCKET_NAME_LENGTH = 63;
    private static final int MIN_BUCKET_NAME_LENGTH = 3;

    static {
        IP_ADDRESS_PATTERN = Pattern.compile("(\\d+\\.){3}\\d+");
    }

    private static boolean exception(boolean z9, String str) {
        if (!z9) {
            return false;
        }
        throw new IllegalArgumentException(str);
    }

    public static boolean isDNSBucketName(String str) {
        return isValidV2BucketName(str);
    }

    public static boolean isValidV2BucketName(String str) {
        return isValidV2BucketName(str, false);
    }

    private static boolean isValidV2BucketName(String str, boolean z9) {
        String str2;
        char charAt;
        if (str == null) {
            str2 = "Bucket name cannot be null";
        } else if (str.length() < 3 || str.length() > MAX_BUCKET_NAME_LENGTH) {
            str2 = "Bucket name should be between 3 and 63 characters long";
        } else if (IP_ADDRESS_PATTERN.matcher(str).matches()) {
            str2 = "Bucket name must not be formatted as an IP Address";
        } else {
            int i10 = 0;
            char c10 = 0;
            while (true) {
                if (i10 < str.length()) {
                    charAt = str.charAt(i10);
                    if (charAt >= 'A' && charAt <= 'Z') {
                        str2 = "Bucket name should not contain uppercase characters";
                        break;
                    } else if (charAt == ' ' || charAt == 9 || charAt == 13 || charAt == 10) {
                        str2 = "Bucket name should not contain white space";
                    } else {
                        if (charAt == '.') {
                            if (c10 == 0) {
                                str2 = "Bucket name should not begin with a period";
                                break;
                            } else if (c10 == '.') {
                                str2 = "Bucket name should not contain two adjacent periods";
                                break;
                            } else if (c10 == '-') {
                                return exception(z9, "Bucket name should not contain dashes next to periods");
                            }
                        } else if (charAt == '-') {
                            if (c10 == '.') {
                                return exception(z9, "Bucket name should not contain dashes next to periods");
                            }
                            if (c10 == 0) {
                                str2 = "Bucket name should not begin with a '-'";
                                break;
                            }
                        } else if (charAt < '0' || ((charAt > '9' && charAt < 'a') || charAt > 'z')) {
                            str2 = "Bucket name should not contain '" + charAt + "'";
                        }
                        i10++;
                        c10 = charAt;
                    }
                } else if (c10 != '.' && c10 != '-') {
                    return !str.contains(".");
                } else {
                    str2 = "Bucket name should not end with '-' or '.'";
                }
            }
            str2 = "Bucket name should not contain '" + charAt + "'";
        }
        return exception(z9, str2);
    }

    public static void validateBucketName(String str) {
        isValidV2BucketName(str, true);
    }
}
