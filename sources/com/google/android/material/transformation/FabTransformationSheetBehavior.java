package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.x;
import com.google.android.material.transformation.FabTransformationBehavior;
import e3.a;
import f3.h;
import f3.j;
import java.util.HashMap;
import java.util.Map;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: g  reason: collision with root package name */
    private Map<View, Integer> f7093g;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void c0(View view, boolean z9) {
        int i10;
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z9) {
                this.f7093g = new HashMap(childCount);
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = coordinatorLayout.getChildAt(i11);
                boolean z10 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z10) {
                    Map<View, Integer> map = this.f7093g;
                    if (z9) {
                        map.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        i10 = 4;
                    } else if (map != null && map.containsKey(childAt)) {
                        i10 = this.f7093g.get(childAt).intValue();
                    }
                    x.q0(childAt, i10);
                }
            }
            if (!z9) {
                this.f7093g = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean G(View view, View view2, boolean z9, boolean z10) {
        c0(view2, z9);
        return super.G(view, view2, z9, z10);
    }

    /* access modifiers changed from: protected */
    public FabTransformationBehavior.e a0(Context context, boolean z9) {
        int i10 = z9 ? a.mtrl_fab_transformation_sheet_expand_spec : a.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.e eVar = new FabTransformationBehavior.e();
        eVar.f7086a = h.b(context, i10);
        eVar.f7087b = new j(17, 0.0f, 0.0f);
        return eVar;
    }
}
