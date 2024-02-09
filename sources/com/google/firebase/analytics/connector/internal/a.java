package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.q7;
import com.google.android.gms.measurement.internal.r7;
import com.google.common.collect.n;
import com.google.common.collect.q;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final q<String> f7191a = q.F("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* renamed from: b  reason: collision with root package name */
    private static final n<String> f7192b = n.E("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c  reason: collision with root package name */
    private static final n<String> f7193c = n.D("auto", "app", "am");

    /* renamed from: d  reason: collision with root package name */
    private static final n<String> f7194d = n.C("_r", "_dbg");

    /* renamed from: e  reason: collision with root package name */
    private static final n<String> f7195e = new n.a().e(r7.f6512a).e(r7.f6513b).f();

    /* renamed from: f  reason: collision with root package name */
    private static final n<String> f7196f = n.C("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static String a(String str) {
        String a10 = q7.a(str);
        return a10 != null ? a10 : str;
    }

    public static void b(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1);
        }
    }

    public static boolean c(String str, Bundle bundle) {
        if (f7192b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        n<String> nVar = f7194d;
        int size = nVar.size();
        int i10 = 0;
        while (i10 < size) {
            String str2 = nVar.get(i10);
            i10++;
            if (bundle.containsKey(str2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(String str, String str2, Bundle bundle) {
        String str3;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!f(str) || bundle == null) {
            return false;
        }
        n<String> nVar = f7194d;
        int size = nVar.size();
        int i10 = 0;
        while (i10 < size) {
            String str4 = nVar.get(i10);
            i10++;
            if (bundle.containsKey(str4)) {
                return false;
            }
        }
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 101200:
                if (str.equals("fcm")) {
                    c10 = 0;
                    break;
                }
                break;
            case 101230:
                if (str.equals("fdl")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3142703:
                if (str.equals("fiam")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                str3 = "fcm_integration";
                break;
            case 1:
                str3 = "fdl_integration";
                break;
            case 2:
                str3 = "fiam_integration";
                break;
            default:
                return false;
        }
        bundle.putString("_cis", str3);
        return true;
    }

    public static boolean e(String str) {
        return !f7191a.contains(str);
    }

    public static boolean f(String str) {
        return !f7193c.contains(str);
    }
}
