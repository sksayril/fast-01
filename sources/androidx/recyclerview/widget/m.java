package androidx.recyclerview.widget;

import android.view.View;

class m {

    /* renamed from: a  reason: collision with root package name */
    final b f3210a;

    /* renamed from: b  reason: collision with root package name */
    a f3211b = new a();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f3212a = 0;

        /* renamed from: b  reason: collision with root package name */
        int f3213b;

        /* renamed from: c  reason: collision with root package name */
        int f3214c;

        /* renamed from: d  reason: collision with root package name */
        int f3215d;

        /* renamed from: e  reason: collision with root package name */
        int f3216e;

        a() {
        }

        /* access modifiers changed from: package-private */
        public void a(int i10) {
            this.f3212a = i10 | this.f3212a;
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            int i10 = this.f3212a;
            if ((i10 & 7) != 0 && (i10 & (c(this.f3215d, this.f3213b) << 0)) == 0) {
                return false;
            }
            int i11 = this.f3212a;
            if ((i11 & 112) != 0 && (i11 & (c(this.f3215d, this.f3214c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f3212a;
            if ((i12 & 1792) != 0 && (i12 & (c(this.f3216e, this.f3213b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f3212a;
            return (i13 & 28672) == 0 || (i13 & (c(this.f3216e, this.f3214c) << 12)) != 0;
        }

        /* access modifiers changed from: package-private */
        public int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f3212a = 0;
        }

        /* access modifiers changed from: package-private */
        public void e(int i10, int i11, int i12, int i13) {
            this.f3213b = i10;
            this.f3214c = i11;
            this.f3215d = i12;
            this.f3216e = i13;
        }
    }

    interface b {
        View a(int i10);

        int b();

        int c(View view);

        int d();

        int e(View view);
    }

    m(b bVar) {
        this.f3210a = bVar;
    }

    /* access modifiers changed from: package-private */
    public View a(int i10, int i11, int i12, int i13) {
        int d10 = this.f3210a.d();
        int b10 = this.f3210a.b();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View a10 = this.f3210a.a(i10);
            this.f3211b.e(d10, b10, this.f3210a.c(a10), this.f3210a.e(a10));
            if (i12 != 0) {
                this.f3211b.d();
                this.f3211b.a(i12);
                if (this.f3211b.b()) {
                    return a10;
                }
            }
            if (i13 != 0) {
                this.f3211b.d();
                this.f3211b.a(i13);
                if (this.f3211b.b()) {
                    view = a10;
                }
            }
            i10 += i14;
        }
        return view;
    }
}
