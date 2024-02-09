package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.x;
import f.f;
import f.j;

public class ButtonBarLayout extends LinearLayout {

    /* renamed from: m  reason: collision with root package name */
    private boolean f654m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f655n;

    /* renamed from: o  reason: collision with root package name */
    private int f656o = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = j.N0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        x.e0(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f654m = obtainStyledAttributes.getBoolean(j.O0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f654m);
        }
    }

    private int a(int i10) {
        int childCount = getChildCount();
        while (i10 < childCount) {
            if (getChildAt(i10).getVisibility() == 0) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    private boolean b() {
        return this.f655n;
    }

    private void setStacked(boolean z9) {
        if (this.f655n == z9) {
            return;
        }
        if (!z9 || this.f654m) {
            this.f655n = z9;
            setOrientation(z9 ? 1 : 0);
            setGravity(z9 ? 8388613 : 80);
            View findViewById = findViewById(f.spacer);
            if (findViewById != null) {
                findViewById.setVisibility(z9 ? 8 : 4);
            }
            for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                bringChildToFront(getChildAt(childCount));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        boolean z9;
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = 0;
        if (this.f654m) {
            if (size > this.f656o && b()) {
                setStacked(false);
            }
            this.f656o = size;
        }
        if (b() || View.MeasureSpec.getMode(i10) != 1073741824) {
            i12 = i10;
            z9 = false;
        } else {
            i12 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z9 = true;
        }
        super.onMeasure(i12, i11);
        if (this.f654m && !b()) {
            if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                setStacked(true);
                z9 = true;
            }
        }
        if (z9) {
            super.onMeasure(i10, i11);
        }
        int a10 = a(0);
        if (a10 >= 0) {
            View childAt = getChildAt(a10);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (b()) {
                int a11 = a(a10 + 1);
                if (a11 >= 0) {
                    paddingTop += getChildAt(a11).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i13 = paddingTop;
            } else {
                i13 = paddingTop + getPaddingBottom();
            }
        }
        if (x.A(this) != i13) {
            setMinimumHeight(i13);
            if (i11 == 0) {
                super.onMeasure(i10, i11);
            }
        }
    }

    public void setAllowStacking(boolean z9) {
        if (this.f654m != z9) {
            this.f654m = z9;
            if (!z9 && b()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
