package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import v4.d;
import x4.a;
import x4.b;

public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final long f7463b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f7464c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d  reason: collision with root package name */
    private static f f7465d;

    /* renamed from: a  reason: collision with root package name */
    private final a f7466a;

    private f(a aVar) {
        this.f7466a = aVar;
    }

    public static f c() {
        return d(b.b());
    }

    public static f d(a aVar) {
        if (f7465d == null) {
            f7465d = new f(aVar);
        }
        return f7465d;
    }

    static boolean g(String str) {
        return f7464c.matcher(str).matches();
    }

    static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f7466a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f7463b;
    }
}
