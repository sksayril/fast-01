package v5;

public final class a {
    public static float a(float f10, float f11, float f12, float f13) {
        double d10 = (double) (f10 - f12);
        double d11 = (double) (f11 - f13);
        return (float) Math.sqrt((d10 * d10) + (d11 * d11));
    }

    public static float b(int i10, int i11, int i12, int i13) {
        double d10 = (double) (i10 - i12);
        double d11 = (double) (i11 - i13);
        return (float) Math.sqrt((d10 * d10) + (d11 * d11));
    }

    public static int c(float f10) {
        return (int) (f10 + (f10 < 0.0f ? -0.5f : 0.5f));
    }

    public static int d(int[] iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        return i10;
    }
}
