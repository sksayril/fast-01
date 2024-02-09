package n6;

import android.graphics.Rect;
import m6.p;

public class o extends q {
    private static float e(float f10) {
        return f10 < 1.0f ? 1.0f / f10 : f10;
    }

    /* access modifiers changed from: protected */
    public float c(p pVar, p pVar2) {
        int i10 = pVar.f11243m;
        if (i10 <= 0 || pVar.f11244n <= 0) {
            return 0.0f;
        }
        float e10 = (1.0f / e((((float) i10) * 1.0f) / ((float) pVar2.f11243m))) / e((((float) pVar.f11244n) * 1.0f) / ((float) pVar2.f11244n));
        float e11 = e(((((float) pVar.f11243m) * 1.0f) / ((float) pVar.f11244n)) / ((((float) pVar2.f11243m) * 1.0f) / ((float) pVar2.f11244n)));
        return e10 * (((1.0f / e11) / e11) / e11);
    }

    public Rect d(p pVar, p pVar2) {
        return new Rect(0, 0, pVar2.f11243m, pVar2.f11244n);
    }
}
