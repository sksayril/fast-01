package m3;

import h.c;

public class a extends c {

    /* renamed from: n  reason: collision with root package name */
    static final double f11200n = Math.cos(Math.toRadians(45.0d));

    public static float c(float f10, float f11, boolean z9) {
        return z9 ? (float) (((double) f10) + ((1.0d - f11200n) * ((double) f11))) : f10;
    }

    public static float d(float f10, float f11, boolean z9) {
        float f12 = f10 * 1.5f;
        return z9 ? (float) (((double) f12) + ((1.0d - f11200n) * ((double) f11))) : f12;
    }
}
