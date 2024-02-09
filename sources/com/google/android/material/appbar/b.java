package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.e;
import androidx.core.view.h0;
import androidx.core.view.x;
import java.util.List;
import t.a;

abstract class b extends c<View> {

    /* renamed from: d  reason: collision with root package name */
    final Rect f6859d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    final Rect f6860e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private int f6861f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f6862g;

    public b() {
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static int M(int i10) {
        if (i10 == 0) {
            return 8388659;
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public void E(CoordinatorLayout coordinatorLayout, View view, int i10) {
        int i11;
        View G = G(coordinatorLayout.r(view));
        if (G != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.f6859d;
            rect.set(coordinatorLayout.getPaddingLeft() + fVar.leftMargin, G.getBottom() + fVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - fVar.rightMargin, ((coordinatorLayout.getHeight() + G.getBottom()) - coordinatorLayout.getPaddingBottom()) - fVar.bottomMargin);
            h0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && x.w(coordinatorLayout) && !x.w(view)) {
                rect.left += lastWindowInsets.i();
                rect.right -= lastWindowInsets.j();
            }
            Rect rect2 = this.f6860e;
            e.a(M(fVar.f1183c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
            int H = H(G);
            view.layout(rect2.left, rect2.top - H, rect2.right, rect2.bottom - H);
            i11 = rect2.top - G.getBottom();
        } else {
            super.E(coordinatorLayout, view, i10);
            i11 = 0;
        }
        this.f6861f = i11;
    }

    /* access modifiers changed from: package-private */
    public abstract View G(List<View> list);

    /* access modifiers changed from: package-private */
    public final int H(View view) {
        if (this.f6862g == 0) {
            return 0;
        }
        float I = I(view);
        int i10 = this.f6862g;
        return a.b((int) (I * ((float) i10)), 0, i10);
    }

    /* access modifiers changed from: package-private */
    public float I(View view) {
        return 1.0f;
    }

    public final int J() {
        return this.f6862g;
    }

    /* access modifiers changed from: package-private */
    public int K(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    public final int L() {
        return this.f6861f;
    }

    public final void N(int i10) {
        this.f6862g = i10;
    }

    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        View G;
        int i14 = view.getLayoutParams().height;
        if ((i14 != -1 && i14 != -2) || (G = G(coordinatorLayout.r(view))) == null) {
            return false;
        }
        if (!x.w(G) || x.w(view)) {
            View view2 = view;
        } else {
            View view3 = view;
            x.o0(view, true);
            if (x.w(view)) {
                view.requestLayout();
                return true;
            }
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size == 0) {
            size = coordinatorLayout.getHeight();
        }
        coordinatorLayout.J(view, i10, i11, View.MeasureSpec.makeMeasureSpec((size - G.getMeasuredHeight()) + K(G), i14 == -1 ? 1073741824 : Integer.MIN_VALUE), i13);
        return true;
    }
}
