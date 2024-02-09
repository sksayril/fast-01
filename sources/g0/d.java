package g0;

import android.view.animation.Interpolator;

abstract class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f8831a;

    /* renamed from: b  reason: collision with root package name */
    private final float f8832b;

    protected d(float[] fArr) {
        this.f8831a = fArr;
        this.f8832b = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f8831a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f10), fArr.length - 2);
        float f11 = this.f8832b;
        float f12 = (f10 - (((float) min) * f11)) / f11;
        float[] fArr2 = this.f8831a;
        return fArr2[min] + (f12 * (fArr2[min + 1] - fArr2[min]));
    }
}
