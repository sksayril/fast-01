package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.firebase.crashlytics.internal.common.c0;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import t4.d;
import z3.g;

public class b0 implements c0 {

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f7278g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h  reason: collision with root package name */
    private static final String f7279h = Pattern.quote("/");

    /* renamed from: a  reason: collision with root package name */
    private final d0 f7280a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f7281b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7282c;

    /* renamed from: d  reason: collision with root package name */
    private final d f7283d;

    /* renamed from: e  reason: collision with root package name */
    private final x f7284e;

    /* renamed from: f  reason: collision with root package name */
    private c0.a f7285f;

    public b0(Context context, String str, d dVar, x xVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str != null) {
            this.f7281b = context;
            this.f7282c = str;
            this.f7283d = dVar;
            this.f7284e = xVar;
            this.f7280a = new d0();
        } else {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
    }

    private synchronized String b(String str, SharedPreferences sharedPreferences) {
        String e10;
        e10 = e(UUID.randomUUID().toString());
        g f10 = g.f();
        f10.i("Created new Crashlytics installation ID: " + e10 + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", e10).putString("firebase.installation.id", str).apply();
        return e10;
    }

    static String c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    private static String e(String str) {
        if (str == null) {
            return null;
        }
        return f7278g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    static boolean k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    private String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", (String) null);
    }

    private String m(String str) {
        return str.replaceAll(f7279h, "");
    }

    private boolean n() {
        c0.a aVar = this.f7285f;
        return aVar == null || (aVar.d() == null && this.f7284e.d());
    }

    public synchronized c0.a a() {
        c0.a b10;
        if (!n()) {
            return this.f7285f;
        }
        g.f().i("Determining Crashlytics installation ID...");
        SharedPreferences q9 = i.q(this.f7281b);
        String string = q9.getString("firebase.installation.id", (String) null);
        g f10 = g.f();
        f10.i("Cached Firebase Installation ID: " + string);
        if (this.f7284e.d()) {
            String d10 = d();
            g f11 = g.f();
            f11.i("Fetched Firebase Installation ID: " + d10);
            if (d10 == null) {
                d10 = string == null ? c() : string;
            }
            b10 = d10.equals(string) ? c0.a.a(l(q9), d10) : c0.a.a(b(d10, q9), d10);
        } else {
            b10 = k(string) ? c0.a.b(l(q9)) : c0.a.b(b(c(), q9));
        }
        this.f7285f = b10;
        g f12 = g.f();
        f12.i("Install IDs: " + this.f7285f);
        return this.f7285f;
    }

    public String d() {
        try {
            return (String) q0.f(this.f7283d.a());
        } catch (Exception e10) {
            g.f().l("Failed to retrieve Firebase Installation ID.", e10);
            return null;
        }
    }

    public String f() {
        return this.f7282c;
    }

    public String g() {
        return this.f7280a.a(this.f7281b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", new Object[]{m(Build.MANUFACTURER), m(Build.MODEL)});
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }
}
