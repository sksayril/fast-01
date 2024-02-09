package d8;

import f.j;
import u0.a;

public final class e {
    public static void a(String str) {
        a.c(c(str));
    }

    public static void b(String str, int i10) {
        a.a(c(str), i10);
    }

    private static String c(String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, j.K0) + "...";
    }

    public static void d() {
        a.f();
    }

    public static void e(String str, int i10) {
        a.d(c(str), i10);
    }
}
