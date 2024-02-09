package o;

import android.graphics.drawable.Drawable;

class f extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private static final double f11476a = Math.cos(Math.toRadians(45.0d));

    static float a(float f10, float f11, boolean z9) {
        return z9 ? (float) (((double) f10) + ((1.0d - f11476a) * ((double) f11))) : f10;
    }

    static float b(float f10, float f11, boolean z9) {
        float f12 = f10 * 1.5f;
        return z9 ? (float) (((double) f12) + ((1.0d - f11476a) * ((double) f11))) : f12;
    }
}
