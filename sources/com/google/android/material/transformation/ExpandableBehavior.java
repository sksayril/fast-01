package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.x;
import java.util.List;

public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public int f7064a = 0;

    class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ View f7065m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f7066n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ i3.a f7067o;

        a(View view, int i10, i3.a aVar) {
            this.f7065m = view;
            this.f7066n = i10;
            this.f7067o = aVar;
        }

        public boolean onPreDraw() {
            this.f7065m.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f7064a == this.f7066n) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                i3.a aVar = this.f7067o;
                expandableBehavior.G((View) aVar, this.f7065m, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private boolean E(boolean z9) {
        if (!z9) {
            return this.f7064a == 1;
        }
        int i10 = this.f7064a;
        return i10 == 0 || i10 == 2;
    }

    /* access modifiers changed from: protected */
    public i3.a F(CoordinatorLayout coordinatorLayout, View view) {
        List<View> r9 = coordinatorLayout.r(view);
        int size = r9.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = r9.get(i10);
            if (e(coordinatorLayout, view, view2)) {
                return (i3.a) view2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract boolean G(View view, View view2, boolean z9, boolean z10);

    public abstract boolean e(CoordinatorLayout coordinatorLayout, View view, View view2);

    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        i3.a aVar = (i3.a) view2;
        if (!E(aVar.a())) {
            return false;
        }
        this.f7064a = aVar.a() ? 1 : 2;
        return G((View) aVar, view, aVar.a(), true);
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        i3.a F;
        if (x.P(view) || (F = F(coordinatorLayout, view)) == null || !E(F.a())) {
            return false;
        }
        int i11 = F.a() ? 1 : 2;
        this.f7064a = i11;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i11, F));
        return false;
    }
}
