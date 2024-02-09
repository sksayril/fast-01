package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Map;

public final class p7 {

    /* renamed from: c  reason: collision with root package name */
    public static final p7 f6429c = new p7((Boolean) null, (Boolean) null, 100);

    /* renamed from: a  reason: collision with root package name */
    private final EnumMap<a, Boolean> f6430a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6431b;

    public enum a {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");
        
        public final String zze;

        private a(String str) {
            this.zze = str;
        }
    }

    public p7(Boolean bool, Boolean bool2, int i10) {
        EnumMap<a, Boolean> enumMap = new EnumMap<>(a.class);
        this.f6430a = enumMap;
        enumMap.put(a.AD_STORAGE, bool);
        enumMap.put(a.ANALYTICS_STORAGE, bool2);
        this.f6431b = i10;
    }

    private p7(EnumMap<a, Boolean> enumMap, int i10) {
        EnumMap<a, Boolean> enumMap2 = new EnumMap<>(a.class);
        this.f6430a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f6431b = i10;
    }

    static char a(Boolean bool) {
        if (bool == null) {
            return '-';
        }
        return bool.booleanValue() ? '1' : '0';
    }

    public static p7 c(Bundle bundle, int i10) {
        if (bundle == null) {
            return new p7((Boolean) null, (Boolean) null, i10);
        }
        EnumMap enumMap = new EnumMap(a.class);
        for (a aVar : o7.STORAGE.zzd) {
            enumMap.put(aVar, q(bundle.getString(aVar.zze)));
        }
        return new p7(enumMap, i10);
    }

    public static p7 e(String str) {
        return f(str, 100);
    }

    public static p7 f(String str, int i10) {
        EnumMap enumMap = new EnumMap(a.class);
        if (str != null) {
            a[] zza = o7.STORAGE.zza();
            for (int i11 = 0; i11 < zza.length; i11++) {
                a aVar = zza[i11];
                int i12 = i11 + 2;
                if (i12 < str.length()) {
                    enumMap.put(aVar, g(str.charAt(i12)));
                }
            }
        }
        return new p7(enumMap, i10);
    }

    static Boolean g(char c10) {
        if (c10 == '0') {
            return Boolean.FALSE;
        }
        if (c10 != '1') {
            return null;
        }
        return Boolean.TRUE;
    }

    static String h(int i10) {
        return i10 != -20 ? i10 != -10 ? i10 != 0 ? i10 != 30 ? i10 != 90 ? i10 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API";
    }

    public static String i(Bundle bundle) {
        String string;
        for (a aVar : o7.STORAGE.zzd) {
            if (bundle.containsKey(aVar.zze) && (string = bundle.getString(aVar.zze)) != null && q(string) == null) {
                return string;
            }
        }
        return null;
    }

    static String j(boolean z9) {
        return z9 ? "granted" : "denied";
    }

    public static boolean k(int i10, int i11) {
        return i10 <= i11;
    }

    private static int n(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    static Boolean q(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final int b() {
        return this.f6431b;
    }

    public final p7 d(p7 p7Var) {
        EnumMap enumMap = new EnumMap(a.class);
        for (a aVar : o7.STORAGE.zzd) {
            Boolean bool = this.f6430a.get(aVar);
            Boolean bool2 = p7Var.f6430a.get(aVar);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                bool = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
            }
            enumMap.put(aVar, bool);
        }
        return new p7(enumMap, 100);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p7)) {
            return false;
        }
        p7 p7Var = (p7) obj;
        for (a aVar : o7.STORAGE.zzd) {
            if (n(this.f6430a.get(aVar)) != n(p7Var.f6430a.get(aVar))) {
                return false;
            }
        }
        return this.f6431b == p7Var.f6431b;
    }

    public final int hashCode() {
        int i10 = this.f6431b * 17;
        for (Boolean n10 : this.f6430a.values()) {
            i10 = (i10 * 31) + n(n10);
        }
        return i10;
    }

    public final boolean l(a aVar) {
        Boolean bool = this.f6430a.get(aVar);
        return bool == null || bool.booleanValue();
    }

    public final boolean m(p7 p7Var, a... aVarArr) {
        for (a aVar : aVarArr) {
            if (!p7Var.l(aVar) && l(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final Bundle o() {
        Bundle bundle = new Bundle();
        for (Map.Entry next : this.f6430a.entrySet()) {
            Boolean bool = (Boolean) next.getValue();
            if (bool != null) {
                bundle.putString(((a) next.getKey()).zze, j(bool.booleanValue()));
            }
        }
        return bundle;
    }

    public final p7 p(p7 p7Var) {
        EnumMap enumMap = new EnumMap(a.class);
        for (a aVar : o7.STORAGE.zzd) {
            Boolean bool = this.f6430a.get(aVar);
            if (bool == null) {
                bool = p7Var.f6430a.get(aVar);
            }
            enumMap.put(aVar, bool);
        }
        return new p7(enumMap, this.f6431b);
    }

    public final boolean r(p7 p7Var, a... aVarArr) {
        for (a aVar : aVarArr) {
            Boolean bool = this.f6430a.get(aVar);
            Boolean bool2 = p7Var.f6430a.get(aVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final Boolean s() {
        return this.f6430a.get(a.AD_STORAGE);
    }

    public final boolean t(p7 p7Var) {
        return r(p7Var, (a[]) this.f6430a.keySet().toArray(new a[0]));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(h(this.f6431b));
        for (a aVar : o7.STORAGE.zzd) {
            sb.append(",");
            sb.append(aVar.zze);
            sb.append("=");
            Boolean bool = this.f6430a.get(aVar);
            sb.append(bool == null ? "uninitialized" : bool.booleanValue() ? "granted" : "denied");
        }
        return sb.toString();
    }

    public final Boolean u() {
        return this.f6430a.get(a.ANALYTICS_STORAGE);
    }

    public final String v() {
        StringBuilder sb = new StringBuilder("G1");
        for (a aVar : o7.STORAGE.zza()) {
            sb.append(a(this.f6430a.get(aVar)));
        }
        return sb.toString();
    }

    public final String w() {
        StringBuilder sb = new StringBuilder("G2");
        for (a aVar : o7.STORAGE.zza()) {
            Boolean bool = this.f6430a.get(aVar);
            sb.append(bool == null ? 'g' : bool.booleanValue() ? 'G' : 'D');
        }
        return sb.toString();
    }

    public final boolean x() {
        return l(a.AD_STORAGE);
    }

    public final boolean y() {
        return l(a.ANALYTICS_STORAGE);
    }

    public final boolean z() {
        for (Boolean bool : this.f6430a.values()) {
            if (bool != null) {
                return true;
            }
        }
        return false;
    }
}
