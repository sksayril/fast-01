package h;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;

public class c extends Drawable implements Drawable.Callback {

    /* renamed from: m  reason: collision with root package name */
    private Drawable f9097m;

    public c(Drawable drawable) {
        b(drawable);
    }

    public Drawable a() {
        return this.f9097m;
    }

    public void b(Drawable drawable) {
        Drawable drawable2 = this.f9097m;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f9097m = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f9097m.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f9097m.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f9097m.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f9097m.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f9097m.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f9097m.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f9097m.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f9097m.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f9097m.getPadding(rect);
    }

    public int[] getState() {
        return this.f9097m.getState();
    }

    public Region getTransparentRegion() {
        return this.f9097m.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return a.h(this.f9097m);
    }

    public boolean isStateful() {
        return this.f9097m.isStateful();
    }

    public void jumpToCurrentState() {
        this.f9097m.jumpToCurrentState();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f9097m.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i10) {
        return this.f9097m.setLevel(i10);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    public void setAlpha(int i10) {
        this.f9097m.setAlpha(i10);
    }

    public void setAutoMirrored(boolean z9) {
        a.j(this.f9097m, z9);
    }

    public void setChangingConfigurations(int i10) {
        this.f9097m.setChangingConfigurations(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f9097m.setColorFilter(colorFilter);
    }

    public void setDither(boolean z9) {
        this.f9097m.setDither(z9);
    }

    public void setFilterBitmap(boolean z9) {
        this.f9097m.setFilterBitmap(z9);
    }

    public void setHotspot(float f10, float f11) {
        a.k(this.f9097m, f10, f11);
    }

    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        a.l(this.f9097m, i10, i11, i12, i13);
    }

    public boolean setState(int[] iArr) {
        return this.f9097m.setState(iArr);
    }

    public void setTint(int i10) {
        a.n(this.f9097m, i10);
    }

    public void setTintList(ColorStateList colorStateList) {
        a.o(this.f9097m, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        a.p(this.f9097m, mode);
    }

    public boolean setVisible(boolean z9, boolean z10) {
        return super.setVisible(z9, z10) || this.f9097m.setVisible(z9, z10);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
