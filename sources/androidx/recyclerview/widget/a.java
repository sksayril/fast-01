package androidx.recyclerview.widget;

import androidx.core.util.e;
import androidx.core.util.f;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import java.util.List;

class a implements g.a {

    /* renamed from: a  reason: collision with root package name */
    private e<b> f2946a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<b> f2947b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<b> f2948c;

    /* renamed from: d  reason: collision with root package name */
    final C0058a f2949d;

    /* renamed from: e  reason: collision with root package name */
    Runnable f2950e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f2951f;

    /* renamed from: g  reason: collision with root package name */
    final g f2952g;

    /* renamed from: h  reason: collision with root package name */
    private int f2953h;

    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    interface C0058a {
        void a(int i10, int i11);

        void b(b bVar);

        i.b0 c(int i10);

        void d(int i10, int i11);

        void e(int i10, int i11);

        void f(int i10, int i11);

        void g(b bVar);

        void h(int i10, int i11, Object obj);
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        int f2954a;

        /* renamed from: b  reason: collision with root package name */
        int f2955b;

        /* renamed from: c  reason: collision with root package name */
        Object f2956c;

        /* renamed from: d  reason: collision with root package name */
        int f2957d;

        b(int i10, int i11, int i12, Object obj) {
            this.f2954a = i10;
            this.f2955b = i11;
            this.f2957d = i12;
            this.f2956c = obj;
        }

        /* access modifiers changed from: package-private */
        public String a() {
            int i10 = this.f2954a;
            return i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f2954a;
            if (i10 != bVar.f2954a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f2957d - this.f2955b) == 1 && this.f2957d == bVar.f2955b && this.f2955b == bVar.f2957d) {
                return true;
            }
            if (this.f2957d != bVar.f2957d || this.f2955b != bVar.f2955b) {
                return false;
            }
            Object obj2 = this.f2956c;
            Object obj3 = bVar.f2956c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f2954a * 31) + this.f2955b) * 31) + this.f2957d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f2955b + "c:" + this.f2957d + ",p:" + this.f2956c + "]";
        }
    }

    a(C0058a aVar) {
        this(aVar, false);
    }

    a(C0058a aVar, boolean z9) {
        this.f2946a = new f(30);
        this.f2947b = new ArrayList<>();
        this.f2948c = new ArrayList<>();
        this.f2953h = 0;
        this.f2949d = aVar;
        this.f2951f = z9;
        this.f2952g = new g(this);
    }

    private void c(b bVar) {
        q(bVar);
    }

    private void d(b bVar) {
        q(bVar);
    }

    private void f(b bVar) {
        char c10;
        boolean z9;
        boolean z10;
        int i10 = bVar.f2955b;
        int i11 = bVar.f2957d + i10;
        char c11 = 65535;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f2949d.c(i12) != null || h(i12)) {
                if (c11 == 0) {
                    k(b(2, i10, i13, (Object) null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 1;
            } else {
                if (c11 == 1) {
                    q(b(2, i10, i13, (Object) null));
                    z9 = true;
                } else {
                    z9 = false;
                }
                c10 = 0;
            }
            if (z9) {
                i12 -= i13;
                i11 -= i13;
                i13 = 1;
            } else {
                i13++;
            }
            i12++;
            c11 = c10;
        }
        if (i13 != bVar.f2957d) {
            a(bVar);
            bVar = b(2, i10, i13, (Object) null);
        }
        if (c11 == 0) {
            k(bVar);
        } else {
            q(bVar);
        }
    }

    private void g(b bVar) {
        int i10 = bVar.f2955b;
        int i11 = bVar.f2957d + i10;
        int i12 = i10;
        char c10 = 65535;
        int i13 = 0;
        while (i10 < i11) {
            if (this.f2949d.c(i10) != null || h(i10)) {
                if (c10 == 0) {
                    k(b(4, i12, i13, bVar.f2956c));
                    i12 = i10;
                    i13 = 0;
                }
                c10 = 1;
            } else {
                if (c10 == 1) {
                    q(b(4, i12, i13, bVar.f2956c));
                    i12 = i10;
                    i13 = 0;
                }
                c10 = 0;
            }
            i13++;
            i10++;
        }
        if (i13 != bVar.f2957d) {
            Object obj = bVar.f2956c;
            a(bVar);
            bVar = b(4, i12, i13, obj);
        }
        if (c10 == 0) {
            k(bVar);
        } else {
            q(bVar);
        }
    }

    private boolean h(int i10) {
        int size = this.f2948c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f2948c.get(i11);
            int i12 = bVar.f2954a;
            if (i12 == 8) {
                if (n(bVar.f2957d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f2955b;
                int i14 = bVar.f2957d + i13;
                while (i13 < i14) {
                    if (n(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i10;
        int i11 = bVar.f2954a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int u9 = u(bVar.f2955b, i11);
        int i12 = bVar.f2955b;
        int i13 = bVar.f2954a;
        if (i13 == 2) {
            i10 = 0;
        } else if (i13 == 4) {
            i10 = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f2957d; i15++) {
            int u10 = u(bVar.f2955b + (i10 * i15), bVar.f2954a);
            int i16 = bVar.f2954a;
            if (i16 == 2 ? u10 == u9 : i16 == 4 && u10 == u9 + 1) {
                i14++;
            } else {
                b b10 = b(i16, u9, i14, bVar.f2956c);
                l(b10, i12);
                a(b10);
                if (bVar.f2954a == 4) {
                    i12 += i14;
                }
                u9 = u10;
                i14 = 1;
            }
        }
        Object obj = bVar.f2956c;
        a(bVar);
        if (i14 > 0) {
            b b11 = b(bVar.f2954a, u9, i14, obj);
            l(b11, i12);
            a(b11);
        }
    }

    private void q(b bVar) {
        this.f2948c.add(bVar);
        int i10 = bVar.f2954a;
        if (i10 == 1) {
            this.f2949d.e(bVar.f2955b, bVar.f2957d);
        } else if (i10 == 2) {
            this.f2949d.d(bVar.f2955b, bVar.f2957d);
        } else if (i10 == 4) {
            this.f2949d.h(bVar.f2955b, bVar.f2957d, bVar.f2956c);
        } else if (i10 == 8) {
            this.f2949d.a(bVar.f2955b, bVar.f2957d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int u(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        for (int size = this.f2948c.size() - 1; size >= 0; size--) {
            b bVar = this.f2948c.get(size);
            int i18 = bVar.f2954a;
            if (i18 == 8) {
                int i19 = bVar.f2955b;
                int i20 = bVar.f2957d;
                if (i19 < i20) {
                    i14 = i19;
                    i13 = i20;
                } else {
                    i13 = i19;
                    i14 = i20;
                }
                if (i10 < i14 || i10 > i13) {
                    if (i10 < i19) {
                        if (i11 == 1) {
                            bVar.f2955b = i19 + 1;
                            i15 = i20 + 1;
                        } else if (i11 == 2) {
                            bVar.f2955b = i19 - 1;
                            i15 = i20 - 1;
                        }
                        bVar.f2957d = i15;
                    }
                } else if (i14 == i19) {
                    if (i11 == 1) {
                        i17 = i20 + 1;
                    } else {
                        if (i11 == 2) {
                            i17 = i20 - 1;
                        }
                        i10++;
                    }
                    bVar.f2957d = i17;
                    i10++;
                } else {
                    if (i11 == 1) {
                        i16 = i19 + 1;
                    } else {
                        if (i11 == 2) {
                            i16 = i19 - 1;
                        }
                        i10--;
                    }
                    bVar.f2955b = i16;
                    i10--;
                }
            } else {
                int i21 = bVar.f2955b;
                if (i21 > i10) {
                    if (i11 == 1) {
                        i12 = i21 + 1;
                    } else if (i11 == 2) {
                        i12 = i21 - 1;
                    }
                    bVar.f2955b = i12;
                } else if (i18 == 1) {
                    i10 -= bVar.f2957d;
                } else if (i18 == 2) {
                    i10 += bVar.f2957d;
                }
            }
        }
        for (int size2 = this.f2948c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f2948c.get(size2);
            if (bVar2.f2954a == 8) {
                int i22 = bVar2.f2957d;
                if (i22 != bVar2.f2955b && i22 >= 0) {
                }
            } else if (bVar2.f2957d > 0) {
            }
            this.f2948c.remove(size2);
            a(bVar2);
        }
        return i10;
    }

    public void a(b bVar) {
        if (!this.f2951f) {
            bVar.f2956c = null;
            this.f2946a.a(bVar);
        }
    }

    public b b(int i10, int i11, int i12, Object obj) {
        b b10 = this.f2946a.b();
        if (b10 == null) {
            return new b(i10, i11, i12, obj);
        }
        b10.f2954a = i10;
        b10.f2955b = i11;
        b10.f2957d = i12;
        b10.f2956c = obj;
        return b10;
    }

    public int e(int i10) {
        int size = this.f2947b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f2947b.get(i11);
            int i12 = bVar.f2954a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f2955b;
                    if (i13 <= i10) {
                        int i14 = bVar.f2957d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f2955b;
                    if (i15 == i10) {
                        i10 = bVar.f2957d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f2957d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f2955b <= i10) {
                i10 += bVar.f2957d;
            }
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        int size = this.f2948c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f2949d.b(this.f2948c.get(i10));
        }
        s(this.f2948c);
        this.f2953h = 0;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        i();
        int size = this.f2947b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f2947b.get(i10);
            int i11 = bVar.f2954a;
            if (i11 == 1) {
                this.f2949d.b(bVar);
                this.f2949d.e(bVar.f2955b, bVar.f2957d);
            } else if (i11 == 2) {
                this.f2949d.b(bVar);
                this.f2949d.f(bVar.f2955b, bVar.f2957d);
            } else if (i11 == 4) {
                this.f2949d.b(bVar);
                this.f2949d.h(bVar.f2955b, bVar.f2957d, bVar.f2956c);
            } else if (i11 == 8) {
                this.f2949d.b(bVar);
                this.f2949d.a(bVar.f2955b, bVar.f2957d);
            }
            Runnable runnable = this.f2950e;
            if (runnable != null) {
                runnable.run();
            }
        }
        s(this.f2947b);
        this.f2953h = 0;
    }

    /* access modifiers changed from: package-private */
    public void l(b bVar, int i10) {
        this.f2949d.g(bVar);
        int i11 = bVar.f2954a;
        if (i11 == 2) {
            this.f2949d.f(i10, bVar.f2957d);
        } else if (i11 == 4) {
            this.f2949d.h(i10, bVar.f2957d, bVar.f2956c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: package-private */
    public int m(int i10) {
        return n(i10, 0);
    }

    /* access modifiers changed from: package-private */
    public int n(int i10, int i11) {
        int size = this.f2948c.size();
        while (i11 < size) {
            b bVar = this.f2948c.get(i11);
            int i12 = bVar.f2954a;
            if (i12 == 8) {
                int i13 = bVar.f2955b;
                if (i13 == i10) {
                    i10 = bVar.f2957d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f2957d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f2955b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f2957d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f2957d;
                }
            }
            i11++;
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public boolean o(int i10) {
        return (i10 & this.f2953h) != 0;
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return this.f2947b.size() > 0;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        this.f2952g.b(this.f2947b);
        int size = this.f2947b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f2947b.get(i10);
            int i11 = bVar.f2954a;
            if (i11 == 1) {
                c(bVar);
            } else if (i11 == 2) {
                f(bVar);
            } else if (i11 == 4) {
                g(bVar);
            } else if (i11 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f2950e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f2947b.clear();
    }

    /* access modifiers changed from: package-private */
    public void s(List<b> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a(list.get(i10));
        }
        list.clear();
    }

    /* access modifiers changed from: package-private */
    public void t() {
        s(this.f2947b);
        s(this.f2948c);
        this.f2953h = 0;
    }
}
