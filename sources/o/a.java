package o;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;

public class a extends FrameLayout {

    /* renamed from: s  reason: collision with root package name */
    private static final int[] f11457s = {16842801};

    /* renamed from: t  reason: collision with root package name */
    private static final d f11458t;

    /* renamed from: m  reason: collision with root package name */
    private boolean f11459m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f11460n;

    /* renamed from: o  reason: collision with root package name */
    int f11461o;

    /* renamed from: p  reason: collision with root package name */
    int f11462p;

    /* renamed from: q  reason: collision with root package name */
    final Rect f11463q;

    /* renamed from: r  reason: collision with root package name */
    private final c f11464r;

    static {
        b bVar = new b();
        f11458t = bVar;
        bVar.g();
    }

    public ColorStateList getCardBackgroundColor() {
        return f11458t.a(this.f11464r);
    }

    public float getCardElevation() {
        return f11458t.k(this.f11464r);
    }

    public int getContentPaddingBottom() {
        return this.f11463q.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f11463q.left;
    }

    public int getContentPaddingRight() {
        return this.f11463q.right;
    }

    public int getContentPaddingTop() {
        return this.f11463q.top;
    }

    public float getMaxCardElevation() {
        return f11458t.b(this.f11464r);
    }

    public boolean getPreventCornerOverlap() {
        return this.f11460n;
    }

    public float getRadius() {
        return f11458t.j(this.f11464r);
    }

    public boolean getUseCompatPadding() {
        return this.f11459m;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        d dVar = f11458t;
        if (!(dVar instanceof b)) {
            int mode = View.MeasureSpec.getMode(i10);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) dVar.f(this.f11464r)), View.MeasureSpec.getSize(i10)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i11);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) dVar.d(this.f11464r)), View.MeasureSpec.getSize(i11)), mode2);
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        f11458t.h(this.f11464r, ColorStateList.valueOf(i10));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f11458t.h(this.f11464r, colorStateList);
    }

    public void setCardElevation(float f10) {
        f11458t.m(this.f11464r, f10);
    }

    public void setMaxCardElevation(float f10) {
        f11458t.c(this.f11464r, f10);
    }

    public void setMinimumHeight(int i10) {
        this.f11462p = i10;
        super.setMinimumHeight(i10);
    }

    public void setMinimumWidth(int i10) {
        this.f11461o = i10;
        super.setMinimumWidth(i10);
    }

    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z9) {
        if (z9 != this.f11460n) {
            this.f11460n = z9;
            f11458t.i(this.f11464r);
        }
    }

    public void setRadius(float f10) {
        f11458t.l(this.f11464r, f10);
    }

    public void setUseCompatPadding(boolean z9) {
        if (this.f11459m != z9) {
            this.f11459m = z9;
            f11458t.e(this.f11464r);
        }
    }
}
