package n6;

import android.graphics.Rect;
import android.util.Log;
import m6.p;

public class n extends q {

    /* renamed from: b  reason: collision with root package name */
    private static final String f11397b = "n";

    /* access modifiers changed from: protected */
    public float c(p pVar, p pVar2) {
        if (pVar.f11243m <= 0 || pVar.f11244n <= 0) {
            return 0.0f;
        }
        p k10 = pVar.k(pVar2);
        float f10 = (((float) k10.f11243m) * 1.0f) / ((float) pVar.f11243m);
        if (f10 > 1.0f) {
            f10 = (float) Math.pow((double) (1.0f / f10), 1.1d);
        }
        float f11 = ((((float) pVar2.f11243m) * 1.0f) / ((float) k10.f11243m)) * ((((float) pVar2.f11244n) * 1.0f) / ((float) k10.f11244n));
        return f10 * (((1.0f / f11) / f11) / f11);
    }

    public Rect d(p pVar, p pVar2) {
        p k10 = pVar.k(pVar2);
        String str = f11397b;
        Log.i(str, "Preview: " + pVar + "; Scaled: " + k10 + "; Want: " + pVar2);
        int i10 = (k10.f11243m - pVar2.f11243m) / 2;
        int i11 = (k10.f11244n - pVar2.f11244n) / 2;
        return new Rect(-i10, -i11, k10.f11243m - i10, k10.f11244n - i11);
    }
}
