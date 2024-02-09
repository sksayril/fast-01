package com.google.android.gms.measurement.internal;

import h2.p;

public final class o9 {
    public static String a(String str, String[] strArr, String[] strArr2) {
        p.j(strArr);
        p.j(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i10 = 0; i10 < min; i10++) {
            String str2 = strArr[i10];
            if ((str == null && str2 == null) ? true : str == null ? false : str.equals(str2)) {
                return strArr2[i10];
            }
        }
        return null;
    }
}
