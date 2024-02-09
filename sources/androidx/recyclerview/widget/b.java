package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import java.util.List;

class b {

    /* renamed from: a  reason: collision with root package name */
    final C0059b f2958a;

    /* renamed from: b  reason: collision with root package name */
    final a f2959b = new a();

    /* renamed from: c  reason: collision with root package name */
    final List<View> f2960c = new ArrayList();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        long f2961a = 0;

        /* renamed from: b  reason: collision with root package name */
        a f2962b;

        a() {
        }

        private void c() {
            if (this.f2962b == null) {
                this.f2962b = new a();
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int i10) {
            if (i10 >= 64) {
                a aVar = this.f2962b;
                if (aVar != null) {
                    aVar.a(i10 - 64);
                    return;
                }
                return;
            }
            this.f2961a &= ~(1 << i10);
        }

        /* access modifiers changed from: package-private */
        public int b(int i10) {
            a aVar = this.f2962b;
            return aVar == null ? i10 >= 64 ? Long.bitCount(this.f2961a) : Long.bitCount(this.f2961a & ((1 << i10) - 1)) : i10 < 64 ? Long.bitCount(this.f2961a & ((1 << i10) - 1)) : aVar.b(i10 - 64) + Long.bitCount(this.f2961a);
        }

        /* access modifiers changed from: package-private */
        public boolean d(int i10) {
            if (i10 < 64) {
                return (this.f2961a & (1 << i10)) != 0;
            }
            c();
            return this.f2962b.d(i10 - 64);
        }

        /* access modifiers changed from: package-private */
        public boolean e(int i10) {
            if (i10 >= 64) {
                c();
                return this.f2962b.e(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f2961a;
            boolean z9 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f2961a = j12;
            long j13 = j10 - 1;
            this.f2961a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f2962b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    g(63);
                }
                this.f2962b.e(0);
            }
            return z9;
        }

        /* access modifiers changed from: package-private */
        public void f() {
            this.f2961a = 0;
            a aVar = this.f2962b;
            if (aVar != null) {
                aVar.f();
            }
        }

        /* access modifiers changed from: package-private */
        public void g(int i10) {
            if (i10 >= 64) {
                c();
                this.f2962b.g(i10 - 64);
                return;
            }
            this.f2961a |= 1 << i10;
        }

        public String toString() {
            if (this.f2962b == null) {
                return Long.toBinaryString(this.f2961a);
            }
            return this.f2962b.toString() + "xx" + Long.toBinaryString(this.f2961a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b  reason: collision with other inner class name */
    interface C0059b {
        View a(int i10);

        i.b0 b(View view);

        void c(int i10);

        void d(View view);

        int e();

        void f(int i10);

        void g();

        int h(View view);
    }

    b(C0059b bVar) {
        this.f2958a = bVar;
    }

    private int e(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int e10 = this.f2958a.e();
        int i11 = i10;
        while (i11 < e10) {
            int b10 = i10 - (i11 - this.f2959b.b(i11));
            if (b10 == 0) {
                while (this.f2959b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += b10;
        }
        return -1;
    }

    private boolean n(View view) {
        if (!this.f2960c.remove(view)) {
            return false;
        }
        this.f2958a.d(view);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void a(int i10) {
        int e10 = e(i10);
        this.f2959b.e(e10);
        this.f2958a.c(e10);
    }

    /* access modifiers changed from: package-private */
    public View b(int i10) {
        int size = this.f2960c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = this.f2960c.get(i11);
            i.b0 b10 = this.f2958a.b(view);
            if (b10.k() == i10 && !b10.q() && !b10.s()) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View c(int i10) {
        return this.f2958a.a(e(i10));
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f2958a.e() - this.f2960c.size();
    }

    /* access modifiers changed from: package-private */
    public View f(int i10) {
        return this.f2958a.a(i10);
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f2958a.e();
    }

    /* access modifiers changed from: package-private */
    public int h(View view) {
        int h10 = this.f2958a.h(view);
        if (h10 != -1 && !this.f2959b.d(h10)) {
            return h10 - this.f2959b.b(h10);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public boolean i(View view) {
        return this.f2960c.contains(view);
    }

    /* access modifiers changed from: package-private */
    public void j() {
        this.f2959b.f();
        for (int size = this.f2960c.size() - 1; size >= 0; size--) {
            this.f2958a.d(this.f2960c.get(size));
            this.f2960c.remove(size);
        }
        this.f2958a.g();
    }

    /* access modifiers changed from: package-private */
    public void k(int i10) {
        int e10 = e(i10);
        View a10 = this.f2958a.a(e10);
        if (a10 != null) {
            if (this.f2959b.e(e10)) {
                n(a10);
            }
            this.f2958a.f(e10);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean l(View view) {
        int h10 = this.f2958a.h(view);
        if (h10 == -1) {
            n(view);
            return true;
        } else if (!this.f2959b.d(h10)) {
            return false;
        } else {
            this.f2959b.e(h10);
            n(view);
            this.f2958a.f(h10);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void m(View view) {
        int h10 = this.f2958a.h(view);
        if (h10 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f2959b.d(h10)) {
            this.f2959b.a(h10);
            n(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f2959b.toString() + ", hidden list:" + this.f2960c.size();
    }
}
