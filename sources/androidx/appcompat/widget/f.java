package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.widget.b;
import androidx.core.widget.j;
import androidx.core.widget.l;
import f.a;

public class f extends Button implements b, l {

    /* renamed from: m  reason: collision with root package name */
    private final e f893m;

    /* renamed from: n  reason: collision with root package name */
    private final c0 f894n;

    /* renamed from: o  reason: collision with root package name */
    private n f895o;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.buttonStyle);
    }

    public f(Context context, AttributeSet attributeSet, int i10) {
        super(x0.b(context), attributeSet, i10);
        v0.a(this, getContext());
        e eVar = new e(this);
        this.f893m = eVar;
        eVar.e(attributeSet, i10);
        c0 c0Var = new c0(this);
        this.f894n = c0Var;
        c0Var.m(attributeSet, i10);
        c0Var.b();
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    private n getEmojiTextViewHelper() {
        if (this.f895o == null) {
            this.f895o = new n(this);
        }
        return this.f895o;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f893m;
        if (eVar != null) {
            eVar.b();
        }
        c0 c0Var = this.f894n;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.f1871a) {
            return super.getAutoSizeMaxTextSize();
        }
        c0 c0Var = this.f894n;
        if (c0Var != null) {
            return c0Var.e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.f1871a) {
            return super.getAutoSizeMinTextSize();
        }
        c0 c0Var = this.f894n;
        if (c0Var != null) {
            return c0Var.f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.f1871a) {
            return super.getAutoSizeStepGranularity();
        }
        c0 c0Var = this.f894n;
        if (c0Var != null) {
            return c0Var.g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.f1871a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        c0 c0Var = this.f894n;
        return c0Var != null ? c0Var.h() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (b.f1871a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        c0 c0Var = this.f894n;
        if (c0Var != null) {
            return c0Var.i();
        }
        return 0;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return j.o(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f893m;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f893m;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f894n.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f894n.k();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        c0 c0Var = this.f894n;
        if (c0Var != null) {
            c0Var.o(z9, i10, i11, i12, i13);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        c0 c0Var = this.f894n;
        if (c0Var != null && !b.f1871a && c0Var.l()) {
            this.f894n.c();
        }
    }

    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().c(z9);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (b.f1871a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        c0 c0Var = this.f894n;
        if (c0Var != null) {
            c0Var.t(i10, i11, i12, i13);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (b.f1871a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        c0 c0Var = this.f894n;
        if (c0Var != null) {
            c0Var.u(iArr, i10);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (b.f1871a) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        c0 c0Var = this.f894n;
        if (c0Var != null) {
            c0Var.v(i10);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f893m;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f893m;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(j.p(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().d(z9);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z9) {
        c0 c0Var = this.f894n;
        if (c0Var != null) {
            c0Var.s(z9);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f893m;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f893m;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f894n.w(colorStateList);
        this.f894n.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f894n.x(mode);
        this.f894n.b();
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        c0 c0Var = this.f894n;
        if (c0Var != null) {
            c0Var.q(context, i10);
        }
    }

    public void setTextSize(int i10, float f10) {
        if (b.f1871a) {
            super.setTextSize(i10, f10);
            return;
        }
        c0 c0Var = this.f894n;
        if (c0Var != null) {
            c0Var.A(i10, f10);
        }
    }
}
