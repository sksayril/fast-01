package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

class c<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    private d f6863a;

    /* renamed from: b  reason: collision with root package name */
    private int f6864b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f6865c = 0;

    public c() {
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int D() {
        d dVar = this.f6863a;
        if (dVar != null) {
            return dVar.a();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void E(CoordinatorLayout coordinatorLayout, V v9, int i10) {
        coordinatorLayout.I(v9, i10);
    }

    public boolean F(int i10) {
        d dVar = this.f6863a;
        if (dVar != null) {
            return dVar.d(i10);
        }
        this.f6864b = i10;
        return false;
    }

    public boolean l(CoordinatorLayout coordinatorLayout, V v9, int i10) {
        E(coordinatorLayout, v9, i10);
        if (this.f6863a == null) {
            this.f6863a = new d(v9);
        }
        this.f6863a.b();
        int i11 = this.f6864b;
        if (i11 != 0) {
            this.f6863a.d(i11);
            this.f6864b = 0;
        }
        int i12 = this.f6865c;
        if (i12 == 0) {
            return true;
        }
        this.f6863a.c(i12);
        this.f6865c = 0;
        return true;
    }
}
