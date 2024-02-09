package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.accessibility.d;
import androidx.recyclerview.widget.i;

public class GridLayoutManager extends LinearLayoutManager {
    boolean F = false;
    int G = -1;
    final SparseIntArray H = new SparseIntArray();
    final SparseIntArray I = new SparseIntArray();
    c J = new a();
    final Rect K = new Rect();

    public static final class a extends c {
        public int b(int i10) {
            return 1;
        }
    }

    public static class b extends i.o {

        /* renamed from: e  reason: collision with root package name */
        int f2878e = -1;

        /* renamed from: f  reason: collision with root package name */
        int f2879f = 0;

        public b(int i10, int i11) {
            super(i10, i11);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public int b() {
            return this.f2878e;
        }

        public int c() {
            return this.f2879f;
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final SparseIntArray f2880a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        private boolean f2881b = false;

        public int a(int i10, int i11) {
            int b10 = b(i10);
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                int b11 = b(i14);
                i12 += b11;
                if (i12 == i11) {
                    i13++;
                    i12 = 0;
                } else if (i12 > i11) {
                    i13++;
                    i12 = b11;
                }
            }
            return i12 + b10 > i11 ? i13 + 1 : i13;
        }

        public abstract int b(int i10);

        public void c() {
            this.f2880a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Y0(i.n.J(context, attributeSet, i10, i11).f3171b);
    }

    private int X0(i.u uVar, i.y yVar, int i10) {
        if (!yVar.b()) {
            return this.J.a(i10, this.G);
        }
        int d10 = uVar.d(i10);
        if (d10 != -1) {
            return this.J.a(d10, this.G);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    public boolean H0() {
        return this.B == null && !this.F;
    }

    public int L(i.u uVar, i.y yVar) {
        if (this.f2882q == 0) {
            return this.G;
        }
        if (yVar.a() < 1) {
            return 0;
        }
        return X0(uVar, yVar, yVar.a() - 1) + 1;
    }

    public void W0(boolean z9) {
        if (!z9) {
            super.W0(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public void Y0(int i10) {
        if (i10 != this.G) {
            this.F = true;
            if (i10 >= 1) {
                this.G = i10;
                this.J.c();
                D0();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i10);
        }
    }

    public boolean d(i.o oVar) {
        return oVar instanceof b;
    }

    public void e0(i.u uVar, i.y yVar, View view, d dVar) {
        boolean z9;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.d0(view, dVar);
            return;
        }
        b bVar = (b) layoutParams;
        int X0 = X0(uVar, yVar, bVar.a());
        if (this.f2882q == 0) {
            int b10 = bVar.b();
            i12 = bVar.c();
            i10 = 1;
            z10 = this.G > 1 && bVar.c() == this.G;
            z9 = false;
            i13 = b10;
            i11 = X0;
        } else {
            i12 = 1;
            i11 = bVar.b();
            i10 = bVar.c();
            z10 = this.G > 1 && bVar.c() == this.G;
            z9 = false;
            i13 = X0;
        }
        dVar.N(d.C0033d.a(i13, i12, i11, i10, z10, z9));
    }

    public void g0(i iVar, int i10, int i11) {
        this.J.c();
    }

    public void h0(i iVar) {
        this.J.c();
    }

    public void i0(i iVar, int i10, int i11, int i12) {
        this.J.c();
    }

    public void j0(i iVar, int i10, int i11) {
        this.J.c();
    }

    public void l0(i iVar, int i10, int i11, Object obj) {
        this.J.c();
    }

    public i.o n() {
        return this.f2882q == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    public i.o o(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    public i.o p(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    public int v(i.u uVar, i.y yVar) {
        if (this.f2882q == 1) {
            return this.G;
        }
        if (yVar.a() < 1) {
            return 0;
        }
        return X0(uVar, yVar, yVar.a() - 1) + 1;
    }
}
