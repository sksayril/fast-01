package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.i;
import f.j;

class t extends PopupWindow {

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f1046b = false;

    /* renamed from: a  reason: collision with root package name */
    private boolean f1047a;

    public t(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }

    private void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        a1 u9 = a1.u(context, attributeSet, j.Y1, i10, i11);
        int i12 = j.f8591a2;
        if (u9.r(i12)) {
            b(u9.a(i12, false));
        }
        setBackgroundDrawable(u9.f(j.Z1));
        u9.v();
    }

    private void b(boolean z9) {
        if (f1046b) {
            this.f1047a = z9;
        } else {
            i.a(this, z9);
        }
    }

    public void showAsDropDown(View view, int i10, int i11) {
        if (f1046b && this.f1047a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f1046b && this.f1047a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }

    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f1046b && this.f1047a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }
}
