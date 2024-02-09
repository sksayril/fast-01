package o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

class e extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private float f11465a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f11466b;

    /* renamed from: c  reason: collision with root package name */
    private final RectF f11467c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f11468d;

    /* renamed from: e  reason: collision with root package name */
    private float f11469e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11470f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f11471g;

    /* renamed from: h  reason: collision with root package name */
    private ColorStateList f11472h;

    /* renamed from: i  reason: collision with root package name */
    private PorterDuffColorFilter f11473i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f11474j;

    /* renamed from: k  reason: collision with root package name */
    private PorterDuff.Mode f11475k;

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f11472h = colorStateList;
        this.f11466b.setColor(colorStateList.getColorForState(getState(), this.f11472h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f11467c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f11468d.set(rect);
        if (this.f11470f) {
            float b10 = f.b(this.f11469e, this.f11465a, this.f11471g);
            this.f11468d.inset((int) Math.ceil((double) f.a(this.f11469e, this.f11465a, this.f11471g)), (int) Math.ceil((double) b10));
            this.f11467c.set(this.f11468d);
        }
    }

    public ColorStateList b() {
        return this.f11472h;
    }

    /* access modifiers changed from: package-private */
    public float c() {
        return this.f11469e;
    }

    public float d() {
        return this.f11465a;
    }

    public void draw(Canvas canvas) {
        boolean z9;
        Paint paint = this.f11466b;
        if (this.f11473i == null || paint.getColorFilter() != null) {
            z9 = false;
        } else {
            paint.setColorFilter(this.f11473i);
            z9 = true;
        }
        RectF rectF = this.f11467c;
        float f10 = this.f11465a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z9) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void g(float f10, boolean z9, boolean z10) {
        if (f10 != this.f11469e || this.f11470f != z9 || this.f11471g != z10) {
            this.f11469e = f10;
            this.f11470f = z9;
            this.f11471g = z10;
            i((Rect) null);
            invalidateSelf();
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f11468d, this.f11465a);
    }

    /* access modifiers changed from: package-private */
    public void h(float f10) {
        if (f10 != this.f11465a) {
            this.f11465a = f10;
            i((Rect) null);
            invalidateSelf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f11472h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f11474j
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f11472h
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.e.isStateful():boolean");
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f11472h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z9 = colorForState != this.f11466b.getColor();
        if (z9) {
            this.f11466b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f11474j;
        if (colorStateList2 == null || (mode = this.f11475k) == null) {
            return z9;
        }
        this.f11473i = a(colorStateList2, mode);
        return true;
    }

    public void setAlpha(int i10) {
        this.f11466b.setAlpha(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f11466b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f11474j = colorStateList;
        this.f11473i = a(colorStateList, this.f11475k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f11475k = mode;
        this.f11473i = a(this.f11474j, mode);
        invalidateSelf();
    }
}
