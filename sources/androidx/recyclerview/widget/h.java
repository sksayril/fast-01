package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.i;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    protected final i.n f3067a;

    /* renamed from: b  reason: collision with root package name */
    private int f3068b;

    /* renamed from: c  reason: collision with root package name */
    final Rect f3069c;

    static class a extends h {
        a(i.n nVar) {
            super(nVar, (a) null);
        }

        public int d(View view) {
            return this.f3067a.z(view) + ((i.o) view.getLayoutParams()).rightMargin;
        }

        public int e(View view) {
            return this.f3067a.y(view) - ((i.o) view.getLayoutParams()).leftMargin;
        }

        public int f() {
            return this.f3067a.O() - this.f3067a.G();
        }

        public int g() {
            return this.f3067a.F();
        }

        public int h() {
            return (this.f3067a.O() - this.f3067a.F()) - this.f3067a.G();
        }
    }

    static class b extends h {
        b(i.n nVar) {
            super(nVar, (a) null);
        }

        public int d(View view) {
            return this.f3067a.w(view) + ((i.o) view.getLayoutParams()).bottomMargin;
        }

        public int e(View view) {
            return this.f3067a.A(view) - ((i.o) view.getLayoutParams()).topMargin;
        }

        public int f() {
            return this.f3067a.B() - this.f3067a.E();
        }

        public int g() {
            return this.f3067a.H();
        }

        public int h() {
            return (this.f3067a.B() - this.f3067a.H()) - this.f3067a.E();
        }
    }

    private h(i.n nVar) {
        this.f3068b = Integer.MIN_VALUE;
        this.f3069c = new Rect();
        this.f3067a = nVar;
    }

    /* synthetic */ h(i.n nVar, a aVar) {
        this(nVar);
    }

    public static h a(i.n nVar) {
        return new a(nVar);
    }

    public static h b(i.n nVar, int i10) {
        if (i10 == 0) {
            return a(nVar);
        }
        if (i10 == 1) {
            return c(nVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static h c(i.n nVar) {
        return new b(nVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();
}
