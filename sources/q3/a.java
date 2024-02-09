package q3;

import p3.h;

public final class a extends b {
    public static int a(int i10, int i11, int i12) {
        h.f(i11 <= i12, "min (%s) must be less than or equal to max (%s)", i11, i12);
        return Math.min(Math.max(i10, i11), i12);
    }
}
