package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import e0.f;
import f.j;

class n {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f989a;

    /* renamed from: b  reason: collision with root package name */
    private final f f990b;

    n(TextView textView) {
        this.f989a = textView;
        this.f990b = new f(textView, false);
    }

    /* access modifiers changed from: package-private */
    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f990b.a(inputFilterArr);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void b(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f989a.getContext().obtainStyledAttributes(attributeSet, j.f8619g0, i10, 0);
        try {
            int i11 = j.f8689u0;
            boolean z9 = true;
            if (obtainStyledAttributes.hasValue(i11)) {
                z9 = obtainStyledAttributes.getBoolean(i11, true);
            }
            obtainStyledAttributes.recycle();
            d(z9);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public void c(boolean z9) {
        this.f990b.b(z9);
    }

    /* access modifiers changed from: package-private */
    public void d(boolean z9) {
        this.f990b.c(z9);
    }
}
