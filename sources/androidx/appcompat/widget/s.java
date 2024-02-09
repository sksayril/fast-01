package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import f.a;

public class s extends MultiAutoCompleteTextView {

    /* renamed from: p  reason: collision with root package name */
    private static final int[] f1034p = {16843126};

    /* renamed from: m  reason: collision with root package name */
    private final e f1035m;

    /* renamed from: n  reason: collision with root package name */
    private final c0 f1036n;

    /* renamed from: o  reason: collision with root package name */
    private final m f1037o;

    public s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.autoCompleteTextViewStyle);
    }

    public s(Context context, AttributeSet attributeSet, int i10) {
        super(x0.b(context), attributeSet, i10);
        v0.a(this, getContext());
        a1 u9 = a1.u(getContext(), attributeSet, f1034p, i10, 0);
        if (u9.r(0)) {
            setDropDownBackgroundDrawable(u9.f(0));
        }
        u9.v();
        e eVar = new e(this);
        this.f1035m = eVar;
        eVar.e(attributeSet, i10);
        c0 c0Var = new c0(this);
        this.f1036n = c0Var;
        c0Var.m(attributeSet, i10);
        c0Var.b();
        m mVar = new m(this);
        this.f1037o = mVar;
        mVar.c(attributeSet, i10);
        a(mVar);
    }

    /* access modifiers changed from: package-private */
    public void a(m mVar) {
        KeyListener keyListener = getKeyListener();
        if (mVar.b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            int inputType = super.getInputType();
            KeyListener a10 = mVar.a(keyListener);
            if (a10 != keyListener) {
                super.setKeyListener(a10);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1035m;
        if (eVar != null) {
            eVar.b();
        }
        c0 c0Var = this.f1036n;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1035m;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1035m;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f1037o.d(o.a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1035m;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1035m;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(g.a.b(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        this.f1037o.e(z9);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1037o.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1035m;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1035m;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        c0 c0Var = this.f1036n;
        if (c0Var != null) {
            c0Var.q(context, i10);
        }
    }
}
