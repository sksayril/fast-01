package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import h2.p;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public final class w4 {

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReference<String[]> f6645b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicReference<String[]> f6646c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicReference<String[]> f6647d = new AtomicReference<>();

    /* renamed from: a  reason: collision with root package name */
    private final v4 f6648a;

    public w4(v4 v4Var) {
        this.f6648a = v4Var;
    }

    private static String d(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        p.j(strArr);
        p.j(strArr2);
        p.j(atomicReference);
        p.a(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str3 = strArr[i10];
            if (str == str3 || (str != null && str.equals(str3))) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i10] == null) {
                        strArr3[i10] = strArr2[i10] + "(" + strArr[i10] + ")";
                    }
                    str2 = strArr3[i10];
                }
                return str2;
            }
        }
        return str;
    }

    private final String e(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Bundle bundle : objArr) {
            String a10 = bundle instanceof Bundle ? a(bundle) : String.valueOf(bundle);
            if (a10 != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(a10);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f6648a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(f(str));
            sb.append("=");
            Object obj = bundle.get(str);
            sb.append(obj instanceof Bundle ? e(new Object[]{obj}) : obj instanceof Object[] ? e((Object[]) obj) : obj instanceof ArrayList ? e(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb.append("}]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String b(i0 i0Var) {
        String str = null;
        if (i0Var == null) {
            return null;
        }
        if (!this.f6648a.zza()) {
            return i0Var.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(i0Var.f6114o);
        sb.append(",name=");
        sb.append(c(i0Var.f6112m));
        sb.append(",params=");
        d0 d0Var = i0Var.f6113n;
        if (d0Var != null) {
            str = !this.f6648a.zza() ? d0Var.toString() : a(d0Var.i());
        }
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String c(String str) {
        if (str == null) {
            return null;
        }
        return !this.f6648a.zza() ? str : d(str, q7.f6468c, q7.f6466a, f6645b);
    }

    /* access modifiers changed from: protected */
    public final String f(String str) {
        if (str == null) {
            return null;
        }
        return !this.f6648a.zza() ? str : d(str, s7.f6540b, s7.f6539a, f6646c);
    }

    /* access modifiers changed from: protected */
    public final String g(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f6648a.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return d(str, r7.f6513b, r7.f6512a, f6647d);
        }
        return "experiment_id" + "(" + str + ")";
    }
}
