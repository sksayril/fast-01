package f3;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

public class g implements TypeEvaluator<Matrix> {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f8764a = new float[9];

    /* renamed from: b  reason: collision with root package name */
    private final float[] f8765b = new float[9];

    /* renamed from: c  reason: collision with root package name */
    private final Matrix f8766c = new Matrix();

    /* renamed from: a */
    public Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f8764a);
        matrix2.getValues(this.f8765b);
        for (int i10 = 0; i10 < 9; i10++) {
            float[] fArr = this.f8765b;
            float f11 = fArr[i10];
            float[] fArr2 = this.f8764a;
            fArr[i10] = fArr2[i10] + ((f11 - fArr2[i10]) * f10);
        }
        this.f8766c.setValues(this.f8765b);
        return this.f8766c;
    }
}
