package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import f.a;

public class p extends ImageButton {

    /* renamed from: m  reason: collision with root package name */
    private final e f1012m;

    /* renamed from: n  reason: collision with root package name */
    private final q f1013n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f1014o;

    public p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.imageButtonStyle);
    }

    public p(Context context, AttributeSet attributeSet, int i10) {
        super(x0.b(context), attributeSet, i10);
        this.f1014o = false;
        v0.a(this, getContext());
        e eVar = new e(this);
        this.f1012m = eVar;
        eVar.e(attributeSet, i10);
        q qVar = new q(this);
        this.f1013n = qVar;
        qVar.g(attributeSet, i10);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1012m;
        if (eVar != null) {
            eVar.b();
        }
        q qVar = this.f1013n;
        if (qVar != null) {
            qVar.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1012m;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1012m;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        q qVar = this.f1013n;
        if (qVar != null) {
            return qVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        q qVar = this.f1013n;
        if (qVar != null) {
            return qVar.e();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f1013n.f() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1012m;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1012m;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        q qVar = this.f1013n;
        if (qVar != null) {
            qVar.c();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        q qVar = this.f1013n;
        if (!(qVar == null || drawable == null || this.f1014o)) {
            qVar.h(drawable);
        }
        super.setImageDrawable(drawable);
        q qVar2 = this.f1013n;
        if (qVar2 != null) {
            qVar2.c();
            if (!this.f1014o) {
                this.f1013n.b();
            }
        }
    }

    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f1014o = true;
    }

    public void setImageResource(int i10) {
        this.f1013n.i(i10);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        q qVar = this.f1013n;
        if (qVar != null) {
            qVar.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1012m;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1012m;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        q qVar = this.f1013n;
        if (qVar != null) {
            qVar.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        q qVar = this.f1013n;
        if (qVar != null) {
            qVar.k(mode);
        }
    }
}
