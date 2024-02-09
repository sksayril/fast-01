package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

final class f extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    int f1484a;

    /* renamed from: b  reason: collision with root package name */
    Drawable.ConstantState f1485b;

    /* renamed from: c  reason: collision with root package name */
    ColorStateList f1486c = null;

    /* renamed from: d  reason: collision with root package name */
    PorterDuff.Mode f1487d = d.f1476s;

    f(f fVar) {
        if (fVar != null) {
            this.f1484a = fVar.f1484a;
            this.f1485b = fVar.f1485b;
            this.f1486c = fVar.f1486c;
            this.f1487d = fVar.f1487d;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return this.f1485b != null;
    }

    public int getChangingConfigurations() {
        int i10 = this.f1484a;
        Drawable.ConstantState constantState = this.f1485b;
        return i10 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    public Drawable newDrawable() {
        return newDrawable((Resources) null);
    }

    public Drawable newDrawable(Resources resources) {
        return new e(this, resources);
    }
}
