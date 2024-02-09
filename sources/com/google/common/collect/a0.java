package com.google.common.collect;

public final class a0 {
    static boolean a(z<?, ?> zVar, Object obj) {
        if (obj == zVar) {
            return true;
        }
        if (obj instanceof z) {
            return zVar.a().equals(((z) obj).a());
        }
        return false;
    }
}
