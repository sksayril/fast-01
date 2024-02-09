package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.p7;
import java.util.EnumMap;
import java.util.Map;

public final class z {

    /* renamed from: f  reason: collision with root package name */
    public static final z f6758f = new z((Boolean) null, 100);

    /* renamed from: a  reason: collision with root package name */
    private final int f6759a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6760b;

    /* renamed from: c  reason: collision with root package name */
    private final Boolean f6761c;

    /* renamed from: d  reason: collision with root package name */
    private final String f6762d;

    /* renamed from: e  reason: collision with root package name */
    private final EnumMap<p7.a, Boolean> f6763e;

    z(Boolean bool, int i10) {
        this(bool, i10, (Boolean) null, (String) null);
    }

    z(Boolean bool, int i10, Boolean bool2, String str) {
        EnumMap<p7.a, Boolean> enumMap = new EnumMap<>(p7.a.class);
        this.f6763e = enumMap;
        enumMap.put(p7.a.AD_USER_DATA, bool);
        this.f6759a = i10;
        this.f6760b = k();
        this.f6761c = bool2;
        this.f6762d = str;
    }

    private z(EnumMap<p7.a, Boolean> enumMap, int i10) {
        this(enumMap, i10, (Boolean) null, (String) null);
    }

    private z(EnumMap<p7.a, Boolean> enumMap, int i10, Boolean bool, String str) {
        EnumMap<p7.a, Boolean> enumMap2 = new EnumMap<>(p7.a.class);
        this.f6763e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f6759a = i10;
        this.f6760b = k();
        this.f6761c = bool;
        this.f6762d = str;
    }

    public static z b(Bundle bundle, int i10) {
        Boolean bool = null;
        if (bundle == null) {
            return new z((Boolean) null, i10);
        }
        EnumMap enumMap = new EnumMap(p7.a.class);
        for (p7.a aVar : o7.DMA.zza()) {
            enumMap.put(aVar, p7.q(bundle.getString(aVar.zze)));
        }
        if (bundle.containsKey("is_dma_region")) {
            bool = Boolean.valueOf(bundle.getString("is_dma_region"));
        }
        return new z((EnumMap<p7.a, Boolean>) enumMap, i10, bool, bundle.getString("cps_display_str"));
    }

    public static z c(String str) {
        if (str == null || str.length() <= 0) {
            return f6758f;
        }
        String[] split = str.split(":");
        int parseInt = Integer.parseInt(split[0]);
        EnumMap enumMap = new EnumMap(p7.a.class);
        p7.a[] zza = o7.DMA.zza();
        int length = zza.length;
        int i10 = 1;
        int i11 = 0;
        while (i11 < length) {
            enumMap.put(zza[i11], p7.g(split[i10].charAt(0)));
            i11++;
            i10++;
        }
        return new z((EnumMap<p7.a, Boolean>) enumMap, parseInt);
    }

    public static Boolean d(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return p7.q(bundle.getString("ad_personalization"));
    }

    private final String k() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6759a);
        for (p7.a aVar : o7.DMA.zza()) {
            sb.append(":");
            sb.append(p7.a(this.f6763e.get(aVar)));
        }
        return sb.toString();
    }

    public final int a() {
        return this.f6759a;
    }

    public final Bundle e() {
        Bundle bundle = new Bundle();
        for (Map.Entry next : this.f6763e.entrySet()) {
            Boolean bool = (Boolean) next.getValue();
            if (bool != null) {
                bundle.putString(((p7.a) next.getKey()).zze, p7.j(bool.booleanValue()));
            }
        }
        Boolean bool2 = this.f6761c;
        if (bool2 != null) {
            bundle.putString("is_dma_region", bool2.toString());
        }
        String str = this.f6762d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f6760b.equalsIgnoreCase(zVar.f6760b) && y.a(this.f6761c, zVar.f6761c)) {
            return y.a(this.f6762d, zVar.f6762d);
        }
        return false;
    }

    public final Boolean f() {
        return this.f6763e.get(p7.a.AD_USER_DATA);
    }

    public final Boolean g() {
        return this.f6761c;
    }

    public final String h() {
        return this.f6762d;
    }

    public final int hashCode() {
        Boolean bool = this.f6761c;
        int i10 = bool == null ? 3 : bool == Boolean.TRUE ? 7 : 13;
        String str = this.f6762d;
        return this.f6760b.hashCode() + (i10 * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    public final String i() {
        return this.f6760b;
    }

    public final boolean j() {
        for (Boolean bool : this.f6763e.values()) {
            if (bool != null) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(p7.h(this.f6759a));
        for (p7.a aVar : o7.DMA.zza()) {
            sb.append(",");
            sb.append(aVar.zze);
            sb.append("=");
            Boolean bool = this.f6763e.get(aVar);
            sb.append(bool == null ? "uninitialized" : bool.booleanValue() ? "granted" : "denied");
        }
        if (this.f6761c != null) {
            sb.append(",isDmaRegion=");
            sb.append(this.f6761c);
        }
        if (this.f6762d != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(this.f6762d);
        }
        return sb.toString();
    }
}
