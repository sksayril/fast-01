package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

public class f0 extends ToggleButton {

    /* renamed from: m  reason: collision with root package name */
    private final e f896m;

    /* renamed from: n  reason: collision with root package name */
    private final c0 f897n;

    /* renamed from: o  reason: collision with root package name */
    private n f898o;

    public f0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    public f0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        v0.a(this, getContext());
        e eVar = new e(this);
        this.f896m = eVar;
        eVar.e(attributeSet, i10);
        c0 c0Var = new c0(this);
        this.f897n = c0Var;
        c0Var.m(attributeSet, i10);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    private n getEmojiTextViewHelper() {
        if (this.f898o == null) {
            this.f898o = new n(this);
        }
        return this.f898o;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f896m;
        if (eVar != null) {
            eVar.b();
        }
        c0 c0Var = this.f897n;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f896m;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f896m;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().c(z9);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f896m;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f896m;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().d(z9);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f896m;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f896m;
        if (eVar != null) {
            eVar.j(mode);
        }
    }
}
