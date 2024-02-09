package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.graphics.e;
import androidx.core.text.b;
import androidx.core.widget.b;
import androidx.core.widget.j;
import androidx.core.widget.l;
import g.a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class d0 extends TextView implements l, b {

    /* renamed from: m  reason: collision with root package name */
    private final e f854m;

    /* renamed from: n  reason: collision with root package name */
    private final c0 f855n;

    /* renamed from: o  reason: collision with root package name */
    private final b0 f856o;

    /* renamed from: p  reason: collision with root package name */
    private n f857p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f858q;

    /* renamed from: r  reason: collision with root package name */
    private Future<androidx.core.text.b> f859r;

    public d0(Context context) {
        this(context, (AttributeSet) null);
    }

    public d0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public d0(Context context, AttributeSet attributeSet, int i10) {
        super(x0.b(context), attributeSet, i10);
        this.f858q = false;
        v0.a(this, getContext());
        e eVar = new e(this);
        this.f854m = eVar;
        eVar.e(attributeSet, i10);
        c0 c0Var = new c0(this);
        this.f855n = c0Var;
        c0Var.m(attributeSet, i10);
        c0Var.b();
        this.f856o = new b0(this);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    private void c() {
        Future<androidx.core.text.b> future = this.f859r;
        if (future != null) {
            try {
                this.f859r = null;
                j.l(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    private n getEmojiTextViewHelper() {
        if (this.f857p == null) {
            this.f857p = new n(this);
        }
        return this.f857p;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f854m;
        if (eVar != null) {
            eVar.b();
        }
        c0 c0Var = this.f855n;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.f1871a) {
            return super.getAutoSizeMaxTextSize();
        }
        c0 c0Var = this.f855n;
        if (c0Var != null) {
            return c0Var.e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.f1871a) {
            return super.getAutoSizeMinTextSize();
        }
        c0 c0Var = this.f855n;
        if (c0Var != null) {
            return c0Var.f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.f1871a) {
            return super.getAutoSizeStepGranularity();
        }
        c0 c0Var = this.f855n;
        if (c0Var != null) {
            return c0Var.g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.f1871a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        c0 c0Var = this.f855n;
        return c0Var != null ? c0Var.h() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (b.f1871a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        c0 c0Var = this.f855n;
        if (c0Var != null) {
            return c0Var.i();
        }
        return 0;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return j.o(super.getCustomSelectionActionModeCallback());
    }

    public int getFirstBaselineToTopHeight() {
        return j.a(this);
    }

    public int getLastBaselineToBottomHeight() {
        return j.b(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f854m;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f854m;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f855n.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f855n.k();
    }

    public CharSequence getText() {
        c();
        return super.getText();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f856o;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x0010
            androidx.appcompat.widget.b0 r0 = r2.f856o
            if (r0 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            android.view.textclassifier.TextClassifier r0 = r0.a()
            return r0
        L_0x0010:
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.d0.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    public b.a getTextMetricsParamsCompat() {
        return j.e(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f855n.r(this, onCreateInputConnection, editorInfo);
        return o.a(onCreateInputConnection, editorInfo, this);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        c0 c0Var = this.f855n;
        if (c0Var != null) {
            c0Var.o(z9, i10, i11, i12, i13);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        c();
        super.onMeasure(i10, i11);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        c0 c0Var = this.f855n;
        if (c0Var != null && !androidx.core.widget.b.f1871a && c0Var.l()) {
            this.f855n.c();
        }
    }

    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().c(z9);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (androidx.core.widget.b.f1871a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        c0 c0Var = this.f855n;
        if (c0Var != null) {
            c0Var.t(i10, i11, i12, i13);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (androidx.core.widget.b.f1871a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        c0 c0Var = this.f855n;
        if (c0Var != null) {
            c0Var.u(iArr, i10);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (androidx.core.widget.b.f1871a) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        c0 c0Var = this.f855n;
        if (c0Var != null) {
            c0Var.v(i10);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f854m;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f854m;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f855n;
        if (c0Var != null) {
            c0Var.p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f855n;
        if (c0Var != null) {
            c0Var.p();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b10 = i10 != 0 ? a.b(context, i10) : null;
        Drawable b11 = i11 != 0 ? a.b(context, i11) : null;
        Drawable b12 = i12 != 0 ? a.b(context, i12) : null;
        if (i13 != 0) {
            drawable = a.b(context, i13);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(b10, b11, b12, drawable);
        c0 c0Var = this.f855n;
        if (c0Var != null) {
            c0Var.p();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f855n;
        if (c0Var != null) {
            c0Var.p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b10 = i10 != 0 ? a.b(context, i10) : null;
        Drawable b11 = i11 != 0 ? a.b(context, i11) : null;
        Drawable b12 = i12 != 0 ? a.b(context, i12) : null;
        if (i13 != 0) {
            drawable = a.b(context, i13);
        }
        setCompoundDrawablesWithIntrinsicBounds(b10, b11, b12, drawable);
        c0 c0Var = this.f855n;
        if (c0Var != null) {
            c0Var.p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f855n;
        if (c0Var != null) {
            c0Var.p();
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

    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i10);
        } else {
            j.i(this, i10);
        }
    }

    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i10);
        } else {
            j.j(this, i10);
        }
    }

    public void setLineHeight(int i10) {
        j.k(this, i10);
    }

    public void setPrecomputedText(androidx.core.text.b bVar) {
        j.l(this, bVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f854m;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f854m;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f855n.w(colorStateList);
        this.f855n.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f855n.x(mode);
        this.f855n.b();
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        c0 c0Var = this.f855n;
        if (c0Var != null) {
            c0Var.q(context, i10);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        b0 b0Var;
        if (Build.VERSION.SDK_INT >= 28 || (b0Var = this.f856o) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            b0Var.b(textClassifier);
        }
    }

    public void setTextFuture(Future<androidx.core.text.b> future) {
        this.f859r = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(b.a aVar) {
        j.n(this, aVar);
    }

    public void setTextSize(int i10, float f10) {
        if (androidx.core.widget.b.f1871a) {
            super.setTextSize(i10, f10);
            return;
        }
        c0 c0Var = this.f855n;
        if (c0Var != null) {
            c0Var.A(i10, f10);
        }
    }

    public void setTypeface(Typeface typeface, int i10) {
        if (!this.f858q) {
            Typeface typeface2 = null;
            if (typeface != null && i10 > 0) {
                typeface2 = e.a(getContext(), typeface, i10);
            }
            this.f858q = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i10);
            } finally {
                this.f858q = false;
            }
        }
    }
}
