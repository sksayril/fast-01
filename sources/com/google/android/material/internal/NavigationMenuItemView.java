package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.m0;
import androidx.core.content.res.h;
import androidx.core.view.accessibility.d;
import androidx.core.view.x;
import androidx.core.widget.j;
import e3.c;
import e3.e;

public class NavigationMenuItemView extends b implements k.a {
    private static final int[] R = {16842912};
    private final int H;
    private boolean I;
    boolean J;
    private final CheckedTextView K;
    private FrameLayout L;
    private g M;
    private ColorStateList N;
    private boolean O;
    private Drawable P;
    private final androidx.core.view.a Q;

    class a extends androidx.core.view.a {
        a() {
        }

        public void g(View view, d dVar) {
            super.g(view, dVar);
            dVar.J(NavigationMenuItemView.this.J);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a aVar = new a();
        this.Q = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(e3.g.design_navigation_menu_item, this, true);
        this.H = context.getResources().getDimensionPixelSize(c.design_navigation_icon_size);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(e.design_menu_item_text);
        this.K = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        x.g0(checkedTextView, aVar);
    }

    private void B() {
        int i10;
        m0.a aVar;
        if (D()) {
            this.K.setVisibility(8);
            FrameLayout frameLayout = this.L;
            if (frameLayout != null) {
                aVar = (m0.a) frameLayout.getLayoutParams();
                i10 = -1;
            } else {
                return;
            }
        } else {
            this.K.setVisibility(0);
            FrameLayout frameLayout2 = this.L;
            if (frameLayout2 != null) {
                aVar = (m0.a) frameLayout2.getLayoutParams();
                i10 = -2;
            } else {
                return;
            }
        }
        aVar.width = i10;
        this.L.setLayoutParams(aVar);
    }

    private StateListDrawable C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(f.a.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(R, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean D() {
        return this.M.getTitle() == null && this.M.getIcon() == null && this.M.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.L == null) {
                this.L = (FrameLayout) ((ViewStub) findViewById(e.design_menu_item_action_area_stub)).inflate();
            }
            this.L.removeAllViews();
            this.L.addView(view);
        }
    }

    public boolean d() {
        return false;
    }

    public void e(g gVar, int i10) {
        this.M = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            x.j0(this, C());
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.getTitle());
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.getContentDescription());
        d1.a(this, gVar.getTooltipText());
        B();
    }

    public g getItemData() {
        return this.M;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        g gVar = this.M;
        if (gVar != null && gVar.isCheckable() && this.M.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, R);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z9) {
        refreshDrawableState();
        if (this.J != z9) {
            this.J = z9;
            this.Q.l(this.K, 2048);
        }
    }

    public void setChecked(boolean z9) {
        refreshDrawableState();
        this.K.setChecked(z9);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, 0, i10, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.O) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.a.q(drawable).mutate();
                androidx.core.graphics.drawable.a.o(drawable, this.N);
            }
            int i10 = this.H;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.I) {
            if (this.P == null) {
                Drawable d10 = h.d(getResources(), e3.d.navigation_empty_icon, getContext().getTheme());
                this.P = d10;
                if (d10 != null) {
                    int i11 = this.H;
                    d10.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.P;
        }
        j.h(this.K, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i10) {
        this.K.setCompoundDrawablePadding(i10);
    }

    /* access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        this.N = colorStateList;
        this.O = colorStateList != null;
        g gVar = this.M;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setNeedsEmptyIcon(boolean z9) {
        this.I = z9;
    }

    public void setTextAppearance(int i10) {
        j.m(this.K, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.K.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.K.setText(charSequence);
    }
}
