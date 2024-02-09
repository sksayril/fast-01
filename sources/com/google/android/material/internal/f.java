package com.google.android.material.internal;

import android.widget.ImageButton;

public class f extends ImageButton {

    /* renamed from: m  reason: collision with root package name */
    private int f7043m;

    public final void b(int i10, boolean z9) {
        super.setVisibility(i10);
        if (z9) {
            this.f7043m = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f7043m;
    }

    public void setVisibility(int i10) {
        b(i10, true);
    }
}
