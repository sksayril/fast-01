package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

class d extends Drawable implements Drawable.Callback, c, b {

    /* renamed from: s  reason: collision with root package name */
    static final PorterDuff.Mode f1476s = PorterDuff.Mode.SRC_IN;

    /* renamed from: m  reason: collision with root package name */
    private int f1477m;

    /* renamed from: n  reason: collision with root package name */
    private PorterDuff.Mode f1478n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f1479o;

    /* renamed from: p  reason: collision with root package name */
    f f1480p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f1481q;

    /* renamed from: r  reason: collision with root package name */
    Drawable f1482r;

    d(Drawable drawable) {
        this.f1480p = d();
        a(drawable);
    }

    d(f fVar, Resources resources) {
        this.f1480p = fVar;
        e(resources);
    }

    private f d() {
        return new f(this.f1480p);
    }

    private void e(Resources resources) {
        Drawable.ConstantState constantState;
        f fVar = this.f1480p;
        if (fVar != null && (constantState = fVar.f1485b) != null) {
            a(constantState.newDrawable(resources));
        }
    }

    private boolean f(int[] iArr) {
        if (!c()) {
            return false;
        }
        f fVar = this.f1480p;
        ColorStateList colorStateList = fVar.f1486c;
        PorterDuff.Mode mode = fVar.f1487d;
        if (colorStateList == null || mode == null) {
            this.f1479o = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f1479o && colorForState == this.f1477m && mode == this.f1478n)) {
                setColorFilter(colorForState, mode);
                this.f1477m = colorForState;
                this.f1478n = mode;
                this.f1479o = true;
                return true;
            }
        }
        return false;
    }

    public final void a(Drawable drawable) {
        Drawable drawable2 = this.f1482r;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1482r = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            f fVar = this.f1480p;
            if (fVar != null) {
                fVar.f1485b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public final Drawable b() {
        return this.f1482r;
    }

    /* access modifiers changed from: protected */
    public boolean c() {
        throw null;
    }

    public void draw(Canvas canvas) {
        this.f1482r.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        f fVar = this.f1480p;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.f1482r.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        f fVar = this.f1480p;
        if (fVar == null || !fVar.a()) {
            return null;
        }
        this.f1480p.f1484a = getChangingConfigurations();
        return this.f1480p;
    }

    public Drawable getCurrent() {
        return this.f1482r.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f1482r.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f1482r.getIntrinsicWidth();
    }

    public int getLayoutDirection() {
        return a.f(this.f1482r);
    }

    public int getMinimumHeight() {
        return this.f1482r.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f1482r.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f1482r.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f1482r.getPadding(rect);
    }

    public int[] getState() {
        return this.f1482r.getState();
    }

    public Region getTransparentRegion() {
        return this.f1482r.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return a.h(this.f1482r);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f1480p;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = r1.c()
            if (r0 == 0) goto L_0x000d
            androidx.core.graphics.drawable.f r0 = r1.f1480p
            if (r0 == 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r0.f1486c
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001e
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r1.f1482r
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.d.isStateful():boolean");
    }

    public void jumpToCurrentState() {
        this.f1482r.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f1481q && super.mutate() == this) {
            this.f1480p = d();
            Drawable drawable = this.f1482r;
            if (drawable != null) {
                drawable.mutate();
            }
            f fVar = this.f1480p;
            if (fVar != null) {
                Drawable drawable2 = this.f1482r;
                fVar.f1485b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f1481q = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1482r;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i10) {
        return a.m(this.f1482r, i10);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i10) {
        return this.f1482r.setLevel(i10);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    public void setAlpha(int i10) {
        this.f1482r.setAlpha(i10);
    }

    public void setAutoMirrored(boolean z9) {
        a.j(this.f1482r, z9);
    }

    public void setChangingConfigurations(int i10) {
        this.f1482r.setChangingConfigurations(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1482r.setColorFilter(colorFilter);
    }

    public void setDither(boolean z9) {
        this.f1482r.setDither(z9);
    }

    public void setFilterBitmap(boolean z9) {
        this.f1482r.setFilterBitmap(z9);
    }

    public boolean setState(int[] iArr) {
        return f(iArr) || this.f1482r.setState(iArr);
    }

    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f1480p.f1486c = colorStateList;
        f(getState());
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f1480p.f1487d = mode;
        f(getState());
    }

    public boolean setVisible(boolean z9, boolean z10) {
        return super.setVisible(z9, z10) || this.f1482r.setVisible(z9, z10);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
