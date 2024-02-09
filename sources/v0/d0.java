package v0;

import android.graphics.Matrix;
import android.view.View;

class d0 {
    d0() {
    }

    public void a(View view) {
        throw null;
    }

    public float b(View view) {
        Float f10 = (Float) view.getTag(i.save_non_transition_alpha);
        float alpha = view.getAlpha();
        return f10 != null ? alpha / f10.floatValue() : alpha;
    }

    public void c(View view) {
        throw null;
    }

    public void d(View view, int i10, int i11, int i12, int i13) {
        view.setLeft(i10);
        view.setTop(i11);
        view.setRight(i12);
        view.setBottom(i13);
    }

    public void e(View view, float f10) {
        throw null;
    }

    public void f(View view, Matrix matrix) {
        throw null;
    }

    public void g(View view, Matrix matrix) {
        throw null;
    }
}
