package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.p;
import androidx.core.view.accessibility.d;
import androidx.core.view.x;

public class CheckableImageButton extends p implements Checkable {

    /* renamed from: q  reason: collision with root package name */
    private static final int[] f7028q = {16842912};

    /* renamed from: p  reason: collision with root package name */
    private boolean f7029p;

    class a extends androidx.core.view.a {
        a() {
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        public void g(View view, d dVar) {
            super.g(view, dVar);
            dVar.J(true);
            dVar.K(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        x.g0(this, new a());
    }

    public boolean isChecked() {
        return this.f7029p;
    }

    public int[] onCreateDrawableState(int i10) {
        if (!this.f7029p) {
            return super.onCreateDrawableState(i10);
        }
        int[] iArr = f7028q;
        return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i10 + iArr.length), iArr);
    }

    public void setChecked(boolean z9) {
        if (this.f7029p != z9) {
            this.f7029p = z9;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void toggle() {
        setChecked(!this.f7029p);
    }
}
