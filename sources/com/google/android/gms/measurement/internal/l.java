package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.p7;
import java.util.EnumMap;

final class l {

    /* renamed from: a  reason: collision with root package name */
    private final EnumMap<p7.a, k> f6267a;

    l() {
        this.f6267a = new EnumMap<>(p7.a.class);
    }

    private l(EnumMap<p7.a, k> enumMap) {
        EnumMap<p7.a, k> enumMap2 = new EnumMap<>(p7.a.class);
        this.f6267a = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public static l b(String str) {
        EnumMap enumMap = new EnumMap(p7.a.class);
        if (str.length() >= p7.a.values().length) {
            int i10 = 0;
            if (str.charAt(0) == '1') {
                p7.a[] values = p7.a.values();
                int length = values.length;
                int i11 = 1;
                while (i10 < length) {
                    enumMap.put(values[i10], k.zza(str.charAt(i11)));
                    i10++;
                    i11++;
                }
                return new l(enumMap);
            }
        }
        return new l();
    }

    public final k a(p7.a aVar) {
        k kVar = this.f6267a.get(aVar);
        return kVar == null ? k.UNSET : kVar;
    }

    public final void c(p7.a aVar, int i10) {
        k kVar = k.UNSET;
        if (i10 != -20) {
            if (i10 == -10) {
                kVar = k.MANIFEST;
            } else if (i10 != 0) {
                if (i10 == 30) {
                    kVar = k.INITIALIZATION;
                }
            }
            this.f6267a.put(aVar, kVar);
        }
        kVar = k.API;
        this.f6267a.put(aVar, kVar);
    }

    public final void d(p7.a aVar, k kVar) {
        this.f6267a.put(aVar, kVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("1");
        for (p7.a aVar : p7.a.values()) {
            k kVar = this.f6267a.get(aVar);
            if (kVar == null) {
                kVar = k.UNSET;
            }
            sb.append(kVar.zzj);
        }
        return sb.toString();
    }
}
