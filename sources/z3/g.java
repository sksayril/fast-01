package z3;

import android.util.Log;

public class g {

    /* renamed from: c  reason: collision with root package name */
    static final g f13580c = new g("FirebaseCrashlytics");

    /* renamed from: a  reason: collision with root package name */
    private final String f13581a;

    /* renamed from: b  reason: collision with root package name */
    private int f13582b = 4;

    public g(String str) {
        this.f13581a = str;
    }

    private boolean a(int i10) {
        return this.f13582b <= i10 || Log.isLoggable(this.f13581a, i10);
    }

    public static g f() {
        return f13580c;
    }

    public void b(String str) {
        c(str, (Throwable) null);
    }

    public void c(String str, Throwable th) {
        if (a(3)) {
            Log.d(this.f13581a, str, th);
        }
    }

    public void d(String str) {
        e(str, (Throwable) null);
    }

    public void e(String str, Throwable th) {
        if (a(6)) {
            Log.e(this.f13581a, str, th);
        }
    }

    public void g(String str) {
        h(str, (Throwable) null);
    }

    public void h(String str, Throwable th) {
        if (a(4)) {
            Log.i(this.f13581a, str, th);
        }
    }

    public void i(String str) {
        j(str, (Throwable) null);
    }

    public void j(String str, Throwable th) {
        if (a(2)) {
            Log.v(this.f13581a, str, th);
        }
    }

    public void k(String str) {
        l(str, (Throwable) null);
    }

    public void l(String str, Throwable th) {
        if (a(5)) {
            Log.w(this.f13581a, str, th);
        }
    }
}
