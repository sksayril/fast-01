package com.google.common.collect;

import java.util.Map;
import p3.c;

public final class y {

    private enum a implements c<Map.Entry<?, ?>, Object> {
        KEY {
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE {
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        };
    }

    static boolean a(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    static <K> c<Map.Entry<K, ?>, K> b() {
        return a.KEY;
    }

    static String c(Map<?, ?> map) {
        StringBuilder a10 = g.a(map.size());
        a10.append('{');
        boolean z9 = true;
        for (Map.Entry next : map.entrySet()) {
            if (!z9) {
                a10.append(", ");
            }
            z9 = false;
            a10.append(next.getKey());
            a10.append('=');
            a10.append(next.getValue());
        }
        a10.append('}');
        return a10.toString();
    }

    static <V> c<Map.Entry<?, V>, V> d() {
        return a.VALUE;
    }
}
