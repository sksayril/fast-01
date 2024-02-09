package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.view.c;
import androidx.core.view.u;
import androidx.core.view.x;
import androidx.core.widget.j;
import androidx.core.widget.k;
import f.a;

public class l extends EditText implements u {

    /* renamed from: m  reason: collision with root package name */
    private final e f957m;

    /* renamed from: n  reason: collision with root package name */
    private final c0 f958n;

    /* renamed from: o  reason: collision with root package name */
    private final b0 f959o;

    /* renamed from: p  reason: collision with root package name */
    private final k f960p;

    /* renamed from: q  reason: collision with root package name */
    private final m f961q;

    public l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.editTextStyle);
    }

    public l(Context context, AttributeSet attributeSet, int i10) {
        super(x0.b(context), attributeSet, i10);
        v0.a(this, getContext());
        e eVar = new e(this);
        this.f957m = eVar;
        eVar.e(attributeSet, i10);
        c0 c0Var = new c0(this);
        this.f958n = c0Var;
        c0Var.m(attributeSet, i10);
        c0Var.b();
        this.f959o = new b0(this);
        this.f960p = new k();
        m mVar = new m(this);
        this.f961q = mVar;
        mVar.c(attributeSet, i10);
        b(mVar);
    }

    public c a(c cVar) {
        return this.f960p.a(this, cVar);
    }

    /* access modifiers changed from: package-private */
    public void b(m mVar) {
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
        e eVar = this.f957m;
        if (eVar != null) {
            eVar.b();
        }
        c0 c0Var = this.f958n;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return j.o(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f957m;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f957m;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f959o;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x0010
            androidx.appcompat.widget.b0 r0 = r2.f959o
            if (r0 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            android.view.textclassifier.TextClassifier r0 = r0.a()
            return r0
        L_0x0010:
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.l.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] C;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f958n.r(this, onCreateInputConnection, editorInfo);
        InputConnection a10 = o.a(onCreateInputConnection, editorInfo, this);
        if (!(a10 == null || Build.VERSION.SDK_INT > 30 || (C = x.C(this)) == null)) {
            u.a.d(editorInfo, C);
            a10 = u.c.c(this, a10, editorInfo);
        }
        return this.f961q.d(a10, editorInfo);
    }

    public boolean onDragEvent(DragEvent dragEvent) {
        if (x.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public boolean onTextContextMenuItem(int i10) {
        if (x.b(this, i10)) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f957m;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f957m;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(j.p(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        this.f961q.e(z9);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f961q.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f957m;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f957m;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        c0 c0Var = this.f958n;
        if (c0Var != null) {
            c0Var.q(context, i10);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        b0 b0Var;
        if (Build.VERSION.SDK_INT >= 28 || (b0Var = this.f959o) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            b0Var.b(textClassifier);
        }
    }
}
