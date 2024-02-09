package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import e0.a;
import f.j;

class m {

    /* renamed from: a  reason: collision with root package name */
    private final EditText f973a;

    /* renamed from: b  reason: collision with root package name */
    private final a f974b;

    m(EditText editText) {
        this.f973a = editText;
        this.f974b = new a(editText, false);
    }

    /* access modifiers changed from: package-private */
    public KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.f974b.a(keyListener) : keyListener;
    }

    /* access modifiers changed from: package-private */
    public boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void c(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f973a.getContext().obtainStyledAttributes(attributeSet, j.f8619g0, i10, 0);
        try {
            int i11 = j.f8689u0;
            boolean z9 = true;
            if (obtainStyledAttributes.hasValue(i11)) {
                z9 = obtainStyledAttributes.getBoolean(i11, true);
            }
            obtainStyledAttributes.recycle();
            e(z9);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f974b.b(inputConnection, editorInfo);
    }

    /* access modifiers changed from: package-private */
    public void e(boolean z9) {
        this.f974b.c(z9);
    }
}
