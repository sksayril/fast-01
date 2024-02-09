package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.x;

class d {

    /* renamed from: a  reason: collision with root package name */
    private final View f6866a;

    /* renamed from: b  reason: collision with root package name */
    private int f6867b;

    /* renamed from: c  reason: collision with root package name */
    private int f6868c;

    /* renamed from: d  reason: collision with root package name */
    private int f6869d;

    /* renamed from: e  reason: collision with root package name */
    private int f6870e;

    public d(View view) {
        this.f6866a = view;
    }

    private void e() {
        View view = this.f6866a;
        x.W(view, this.f6869d - (view.getTop() - this.f6867b));
        View view2 = this.f6866a;
        x.V(view2, this.f6870e - (view2.getLeft() - this.f6868c));
    }

    public int a() {
        return this.f6869d;
    }

    public void b() {
        this.f6867b = this.f6866a.getTop();
        this.f6868c = this.f6866a.getLeft();
        e();
    }

    public boolean c(int i10) {
        if (this.f6870e == i10) {
            return false;
        }
        this.f6870e = i10;
        e();
        return true;
    }

    public boolean d(int i10) {
        if (this.f6869d == i10) {
            return false;
        }
        this.f6869d = i10;
        e();
        return true;
    }
}
