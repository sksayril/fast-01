package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.core.view.accessibility.c;
import androidx.core.view.x;
import e3.i;

public class d extends FrameLayout {

    /* renamed from: m  reason: collision with root package name */
    private final AccessibilityManager f7050m;

    /* renamed from: n  reason: collision with root package name */
    private final c.b f7051n;

    /* renamed from: o  reason: collision with root package name */
    private c f7052o;

    /* renamed from: p  reason: collision with root package name */
    private b f7053p;

    class a implements c.b {
        a() {
        }

        public void onTouchExplorationStateChanged(boolean z9) {
            d.this.setClickableOrFocusableBasedOnAccessibility(z9);
        }
    }

    protected d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.C0);
        int i10 = i.E0;
        if (obtainStyledAttributes.hasValue(i10)) {
            x.n0(this, (float) obtainStyledAttributes.getDimensionPixelSize(i10, 0));
        }
        obtainStyledAttributes.recycle();
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        this.f7050m = accessibilityManager;
        a aVar = new a();
        this.f7051n = aVar;
        c.a(accessibilityManager, aVar);
        setClickableOrFocusableBasedOnAccessibility(accessibilityManager.isTouchExplorationEnabled());
    }

    /* access modifiers changed from: private */
    public void setClickableOrFocusableBasedOnAccessibility(boolean z9) {
        setClickable(!z9);
        setFocusable(z9);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f7053p;
        if (bVar != null) {
            bVar.onViewAttachedToWindow(this);
        }
        x.d0(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f7053p;
        if (bVar != null) {
            bVar.onViewDetachedFromWindow(this);
        }
        c.b(this.f7050m, this.f7051n);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        c cVar = this.f7052o;
        if (cVar != null) {
            cVar.a(this, i10, i11, i12, i13);
        }
    }

    /* access modifiers changed from: package-private */
    public void setOnAttachStateChangeListener(b bVar) {
        this.f7053p = bVar;
    }

    /* access modifiers changed from: package-private */
    public void setOnLayoutChangeListener(c cVar) {
        this.f7052o = cVar;
    }
}
