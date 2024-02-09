package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.i;

class k {
    static int a(i.y yVar, h hVar, View view, View view2, i.n nVar, boolean z9) {
        if (nVar.t() == 0 || yVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z9) {
            return Math.abs(nVar.I(view) - nVar.I(view2)) + 1;
        }
        return Math.min(hVar.h(), hVar.d(view2) - hVar.e(view));
    }

    static int b(i.y yVar, h hVar, View view, View view2, i.n nVar, boolean z9, boolean z10) {
        if (nVar.t() == 0 || yVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z10 ? Math.max(0, (yVar.a() - Math.max(nVar.I(view), nVar.I(view2))) - 1) : Math.max(0, Math.min(nVar.I(view), nVar.I(view2)));
        if (!z9) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(hVar.d(view2) - hVar.e(view))) / ((float) (Math.abs(nVar.I(view) - nVar.I(view2)) + 1)))) + ((float) (hVar.g() - hVar.e(view))));
    }

    static int c(i.y yVar, h hVar, View view, View view2, i.n nVar, boolean z9) {
        if (nVar.t() == 0 || yVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z9) {
            return yVar.a();
        }
        return (int) ((((float) (hVar.d(view2) - hVar.e(view))) / ((float) (Math.abs(nVar.I(view) - nVar.I(view2)) + 1))) * ((float) yVar.a()));
    }
}
