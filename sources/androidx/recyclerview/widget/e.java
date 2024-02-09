package androidx.recyclerview.widget;

import androidx.core.os.n;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

final class e implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    static final ThreadLocal<e> f3044q = new ThreadLocal<>();

    /* renamed from: r  reason: collision with root package name */
    static Comparator<c> f3045r = new a();

    /* renamed from: m  reason: collision with root package name */
    ArrayList<i> f3046m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    long f3047n;

    /* renamed from: o  reason: collision with root package name */
    long f3048o;

    /* renamed from: p  reason: collision with root package name */
    private ArrayList<c> f3049p = new ArrayList<>();

    static class a implements Comparator<c> {
        a() {
        }

        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            i iVar = cVar.f3057d;
            if ((iVar == null) != (cVar2.f3057d == null)) {
                return iVar == null ? 1 : -1;
            }
            boolean z9 = cVar.f3054a;
            if (z9 != cVar2.f3054a) {
                return z9 ? -1 : 1;
            }
            int i10 = cVar2.f3055b - cVar.f3055b;
            if (i10 != 0) {
                return i10;
            }
            int i11 = cVar.f3056c - cVar2.f3056c;
            if (i11 != 0) {
                return i11;
            }
            return 0;
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        int f3050a;

        /* renamed from: b  reason: collision with root package name */
        int f3051b;

        /* renamed from: c  reason: collision with root package name */
        int[] f3052c;

        /* renamed from: d  reason: collision with root package name */
        int f3053d;

        b() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int[] iArr = this.f3052c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3053d = 0;
        }

        /* access modifiers changed from: package-private */
        public void b(i iVar, boolean z9) {
            this.f3053d = 0;
            int[] iArr = this.f3052c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            i.n nVar = iVar.f3104x;
        }

        /* access modifiers changed from: package-private */
        public boolean c(int i10) {
            if (this.f3052c != null) {
                int i11 = this.f3053d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f3052c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void d(int i10, int i11) {
            this.f3050a = i10;
            this.f3051b = i11;
        }
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3054a;

        /* renamed from: b  reason: collision with root package name */
        public int f3055b;

        /* renamed from: c  reason: collision with root package name */
        public int f3056c;

        /* renamed from: d  reason: collision with root package name */
        public i f3057d;

        /* renamed from: e  reason: collision with root package name */
        public int f3058e;

        c() {
        }

        public void a() {
            this.f3054a = false;
            this.f3055b = 0;
            this.f3056c = 0;
            this.f3057d = null;
            this.f3058e = 0;
        }
    }

    e() {
    }

    private void b() {
        c cVar;
        int size = this.f3046m.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = this.f3046m.get(i11);
            if (iVar.getWindowVisibility() == 0) {
                iVar.f3091q0.b(iVar, false);
                i10 += iVar.f3091q0.f3053d;
            }
        }
        this.f3049p.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            i iVar2 = this.f3046m.get(i13);
            if (iVar2.getWindowVisibility() == 0) {
                b bVar = iVar2.f3091q0;
                int abs = Math.abs(bVar.f3050a) + Math.abs(bVar.f3051b);
                for (int i14 = 0; i14 < bVar.f3053d * 2; i14 += 2) {
                    if (i12 >= this.f3049p.size()) {
                        cVar = new c();
                        this.f3049p.add(cVar);
                    } else {
                        cVar = this.f3049p.get(i12);
                    }
                    int[] iArr = bVar.f3052c;
                    int i15 = iArr[i14 + 1];
                    cVar.f3054a = i15 <= abs;
                    cVar.f3055b = abs;
                    cVar.f3056c = i15;
                    cVar.f3057d = iVar2;
                    cVar.f3058e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f3049p, f3045r);
    }

    private void c(c cVar, long j10) {
        i.b0 i10 = i(cVar.f3057d, cVar.f3058e, cVar.f3054a ? Long.MAX_VALUE : j10);
        if (i10 != null && i10.f3121b != null && i10.p() && !i10.q()) {
            h((i) i10.f3121b.get(), j10);
        }
    }

    private void d(long j10) {
        int i10 = 0;
        while (i10 < this.f3049p.size()) {
            c cVar = this.f3049p.get(i10);
            if (cVar.f3057d != null) {
                c(cVar, j10);
                cVar.a();
                i10++;
            } else {
                return;
            }
        }
    }

    static boolean e(i iVar, int i10) {
        int g10 = iVar.f3090q.g();
        for (int i11 = 0; i11 < g10; i11++) {
            i.b0 J = i.J(iVar.f3090q.f(i11));
            if (J.f3122c == i10 && !J.q()) {
                return true;
            }
        }
        return false;
    }

    private void h(i iVar, long j10) {
        if (iVar != null) {
            if (iVar.O && iVar.f3090q.g() != 0) {
                iVar.o0();
            }
            b bVar = iVar.f3091q0;
            bVar.b(iVar, true);
            if (bVar.f3053d != 0) {
                try {
                    n.a("RV Nested Prefetch");
                    iVar.f3093r0.c((i.g) null);
                    for (int i10 = 0; i10 < bVar.f3053d * 2; i10 += 2) {
                        i(iVar, bVar.f3052c[i10], j10);
                    }
                } finally {
                    n.b();
                }
            }
        }
    }

    private i.b0 i(i iVar, int i10, long j10) {
        if (e(iVar, i10)) {
            return null;
        }
        i.u uVar = iVar.f3084n;
        try {
            iVar.d0();
            i.b0 A = uVar.A(i10, false, j10);
            if (A != null) {
                if (!A.p() || A.q()) {
                    uVar.a(A, false);
                } else {
                    uVar.t(A.f3120a);
                }
            }
            return A;
        } finally {
            iVar.f0(false);
        }
    }

    public void a(i iVar) {
        this.f3046m.add(iVar);
    }

    /* access modifiers changed from: package-private */
    public void f(i iVar, int i10, int i11) {
        if (iVar.isAttachedToWindow() && this.f3047n == 0) {
            this.f3047n = iVar.getNanoTime();
            iVar.post(this);
        }
        iVar.f3091q0.d(i10, i11);
    }

    /* access modifiers changed from: package-private */
    public void g(long j10) {
        b();
        d(j10);
    }

    public void j(i iVar) {
        this.f3046m.remove(iVar);
    }

    public void run() {
        try {
            n.a("RV Prefetch");
            if (!this.f3046m.isEmpty()) {
                int size = this.f3046m.size();
                long j10 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    i iVar = this.f3046m.get(i10);
                    if (iVar.getWindowVisibility() == 0) {
                        j10 = Math.max(iVar.getDrawingTime(), j10);
                    }
                }
                if (j10 != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j10) + this.f3048o);
                    this.f3047n = 0;
                    n.b();
                }
            }
        } finally {
            this.f3047n = 0;
            n.b();
        }
    }
}
