package e0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.d;

class h implements TransformationMethod {

    /* renamed from: m  reason: collision with root package name */
    private final TransformationMethod f8315m;

    h(TransformationMethod transformationMethod) {
        this.f8315m = transformationMethod;
    }

    public TransformationMethod a() {
        return this.f8315m;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f8315m;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || d.b().d() != 1) ? charSequence : d.b().o(charSequence);
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z9, int i10, Rect rect) {
        TransformationMethod transformationMethod = this.f8315m;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z9, i10, rect);
        }
    }
}
