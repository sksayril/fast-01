package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

public class r {

    /* renamed from: a  reason: collision with root package name */
    private int f1801a;

    /* renamed from: b  reason: collision with root package name */
    private int f1802b;

    public r(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f1801a | this.f1802b;
    }

    public void b(View view, View view2, int i10) {
        c(view, view2, i10, 0);
    }

    public void c(View view, View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f1802b = i10;
        } else {
            this.f1801a = i10;
        }
    }

    public void d(View view, int i10) {
        if (i10 == 1) {
            this.f1802b = 0;
        } else {
            this.f1801a = 0;
        }
    }
}
