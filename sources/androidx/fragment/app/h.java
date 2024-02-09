package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.h0;
import androidx.core.view.x;
import f0.c;
import java.util.ArrayList;

public final class h extends FrameLayout {

    /* renamed from: m  reason: collision with root package name */
    private ArrayList<View> f2487m;

    /* renamed from: n  reason: collision with root package name */
    private ArrayList<View> f2488n;

    /* renamed from: o  reason: collision with root package name */
    private View.OnApplyWindowInsetsListener f2489o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f2490p = true;

    h(Context context, AttributeSet attributeSet, n nVar) {
        super(context, attributeSet);
        String str;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f8725h);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(c.f8726i) : classAttribute;
        String string = obtainStyledAttributes.getString(c.f8727j);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment g02 = nVar.g0(id);
        if (classAttribute != null && g02 == null) {
            if (id <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment a10 = nVar.p0().a(context.getClassLoader(), classAttribute);
            a10.y0(context, attributeSet, (Bundle) null);
            nVar.l().l(true).c(this, a10, string).h();
        }
        nVar.R0(this);
    }

    private void a(View view) {
        ArrayList<View> arrayList = this.f2488n;
        if (arrayList != null && arrayList.contains(view)) {
            if (this.f2487m == null) {
                this.f2487m = new ArrayList<>();
            }
            this.f2487m.add(view);
        }
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (n.y0(view) != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    /* access modifiers changed from: protected */
    public boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z9) {
        if (n.y0(view) != null) {
            return super.addViewInLayout(view, i10, layoutParams, z9);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        h0 v9 = h0.v(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f2489o;
        h0 v10 = onApplyWindowInsetsListener != null ? h0.v(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : x.X(this, v9);
        if (!v10.n()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                x.g(getChildAt(i10), v10);
            }
        }
        return windowInsets;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.f2490p && this.f2487m != null) {
            for (int i10 = 0; i10 < this.f2487m.size(); i10++) {
                super.drawChild(canvas, this.f2487m.get(i10), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j10) {
        ArrayList<View> arrayList;
        if (!this.f2490p || (arrayList = this.f2487m) == null || arrayList.size() <= 0 || !this.f2487m.contains(view)) {
            return super.drawChild(canvas, view, j10);
        }
        return false;
    }

    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f2488n;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f2487m;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f2490p = true;
            }
        }
        super.endViewTransition(view);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z9) {
        if (z9) {
            a(view);
        }
        super.removeDetachedView(view, z9);
    }

    public void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    public void removeViewAt(int i10) {
        a(getChildAt(i10));
        super.removeViewAt(i10);
    }

    public void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            a(getChildAt(i12));
        }
        super.removeViews(i10, i11);
    }

    public void removeViewsInLayout(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            a(getChildAt(i12));
        }
        super.removeViewsInLayout(i10, i11);
    }

    /* access modifiers changed from: package-private */
    public void setDrawDisappearingViewsLast(boolean z9) {
        this.f2490p = z9;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f2489o = onApplyWindowInsetsListener;
    }

    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f2488n == null) {
                this.f2488n = new ArrayList<>();
            }
            this.f2488n.add(view);
        }
        super.startViewTransition(view);
    }
}
