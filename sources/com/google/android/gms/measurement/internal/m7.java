package com.google.android.gms.measurement.internal;

import android.os.Bundle;

public final class m7 {
    public static <T> T a(Bundle bundle, String str, Class<T> cls, T t9) {
        T t10 = bundle.get(str);
        if (t10 == null) {
            return t9;
        }
        if (cls.isAssignableFrom(t10.getClass())) {
            return t10;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", new Object[]{str, cls.getCanonicalName(), t10.getClass().getCanonicalName()}));
    }

    public static void b(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }
}
