package p3;

import java.util.Objects;

public final class h {
    private static String a(int i10, int i11, String str) {
        if (i10 < 0) {
            return j.a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        } else if (i11 >= 0) {
            return j.a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i11);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private static String b(int i10, int i11, String str) {
        if (i10 < 0) {
            return j.a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        } else if (i11 >= 0) {
            return j.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i11);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private static String c(int i10, int i11, int i12) {
        if (i10 < 0 || i10 > i12) {
            return b(i10, i12, "start index");
        }
        if (i11 < 0 || i11 > i12) {
            return b(i11, i12, "end index");
        }
        return j.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
    }

    public static void d(boolean z9) {
        if (!z9) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(boolean z9, Object obj) {
        if (!z9) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void f(boolean z9, String str, int i10, int i11) {
        if (!z9) {
            throw new IllegalArgumentException(j.a(str, Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    public static int g(int i10, int i11) {
        return h(i10, i11, "index");
    }

    public static int h(int i10, int i11, String str) {
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        throw new IndexOutOfBoundsException(a(i10, i11, str));
    }

    public static <T> T i(T t9) {
        Objects.requireNonNull(t9);
        return t9;
    }

    public static <T> T j(T t9, Object obj) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static int k(int i10, int i11) {
        return l(i10, i11, "index");
    }

    public static int l(int i10, int i11, String str) {
        if (i10 >= 0 && i10 <= i11) {
            return i10;
        }
        throw new IndexOutOfBoundsException(b(i10, i11, str));
    }

    public static void m(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException(c(i10, i11, i12));
        }
    }

    public static void n(boolean z9, Object obj) {
        if (!z9) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void o(boolean z9, String str, Object obj) {
        if (!z9) {
            throw new IllegalStateException(j.a(str, obj));
        }
    }
}
