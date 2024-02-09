package f6;

import o5.f;
import u5.a;

final class s {

    /* renamed from: a  reason: collision with root package name */
    private final a f8804a;

    /* renamed from: b  reason: collision with root package name */
    private final m f8805b = new m();

    /* renamed from: c  reason: collision with root package name */
    private final StringBuilder f8806c = new StringBuilder();

    s(a aVar) {
        this.f8804a = aVar;
    }

    private n b(int i10) {
        char c10;
        int f10 = f(i10, 5);
        if (f10 == 15) {
            return new n(i10 + 5, '$');
        }
        if (f10 >= 5 && f10 < 15) {
            return new n(i10 + 5, (char) ((f10 + 48) - 5));
        }
        int f11 = f(i10, 6);
        if (f11 >= 32 && f11 < 58) {
            return new n(i10 + 6, (char) (f11 + 33));
        }
        switch (f11) {
            case 58:
                c10 = '*';
                break;
            case 59:
                c10 = ',';
                break;
            case 60:
                c10 = '-';
                break;
            case 61:
                c10 = '.';
                break;
            case 62:
                c10 = '/';
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: " + f11);
        }
        return new n(i10 + 6, c10);
    }

    private n d(int i10) {
        char c10;
        int f10 = f(i10, 5);
        if (f10 == 15) {
            return new n(i10 + 5, '$');
        }
        if (f10 >= 5 && f10 < 15) {
            return new n(i10 + 5, (char) ((f10 + 48) - 5));
        }
        int f11 = f(i10, 7);
        if (f11 >= 64 && f11 < 90) {
            return new n(i10 + 7, (char) (f11 + 1));
        }
        if (f11 >= 90 && f11 < 116) {
            return new n(i10 + 7, (char) (f11 + 7));
        }
        switch (f(i10, 8)) {
            case 232:
                c10 = '!';
                break;
            case 233:
                c10 = '\"';
                break;
            case 234:
                c10 = '%';
                break;
            case 235:
                c10 = '&';
                break;
            case 236:
                c10 = '\'';
                break;
            case 237:
                c10 = '(';
                break;
            case 238:
                c10 = ')';
                break;
            case 239:
                c10 = '*';
                break;
            case 240:
                c10 = '+';
                break;
            case 241:
                c10 = ',';
                break;
            case 242:
                c10 = '-';
                break;
            case 243:
                c10 = '.';
                break;
            case 244:
                c10 = '/';
                break;
            case 245:
                c10 = ':';
                break;
            case 246:
                c10 = ';';
                break;
            case 247:
                c10 = '<';
                break;
            case 248:
                c10 = '=';
                break;
            case 249:
                c10 = '>';
                break;
            case 250:
                c10 = '?';
                break;
            case 251:
                c10 = '_';
                break;
            case 252:
                c10 = ' ';
                break;
            default:
                throw f.a();
        }
        return new n(i10 + 8, c10);
    }

    private p e(int i10) {
        int i11 = i10 + 7;
        if (i11 > this.f8804a.k()) {
            int f10 = f(i10, 4);
            return f10 == 0 ? new p(this.f8804a.k(), 10, 10) : new p(this.f8804a.k(), f10 - 1, 10);
        }
        int f11 = f(i10, 7) - 8;
        return new p(i11, f11 / 11, f11 % 11);
    }

    static int g(a aVar, int i10, int i11) {
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            if (aVar.e(i10 + i13)) {
                i12 |= 1 << ((i11 - i13) - 1);
            }
        }
        return i12;
    }

    private boolean h(int i10) {
        int i11 = i10 + 3;
        if (i11 > this.f8804a.k()) {
            return false;
        }
        while (i10 < i11) {
            if (this.f8804a.e(i10)) {
                return false;
            }
            i10++;
        }
        return true;
    }

    private boolean i(int i10) {
        int i11;
        if (i10 + 1 > this.f8804a.k()) {
            return false;
        }
        int i12 = 0;
        while (i12 < 5 && (i11 = i12 + i10) < this.f8804a.k()) {
            if (i12 == 2) {
                if (!this.f8804a.e(i10 + 2)) {
                    return false;
                }
            } else if (this.f8804a.e(i11)) {
                return false;
            }
            i12++;
        }
        return true;
    }

    private boolean j(int i10) {
        int i11;
        if (i10 + 1 > this.f8804a.k()) {
            return false;
        }
        int i12 = 0;
        while (i12 < 4 && (i11 = i12 + i10) < this.f8804a.k()) {
            if (this.f8804a.e(i11)) {
                return false;
            }
            i12++;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        r6 = f(r6, 6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean k(int r6) {
        /*
            r5 = this;
            int r0 = r6 + 5
            u5.a r1 = r5.f8804a
            int r1 = r1.k()
            r2 = 0
            if (r0 <= r1) goto L_0x000c
            return r2
        L_0x000c:
            r0 = 5
            int r1 = r5.f(r6, r0)
            r3 = 1
            r4 = 16
            if (r1 < r0) goto L_0x0019
            if (r1 >= r4) goto L_0x0019
            return r3
        L_0x0019:
            int r0 = r6 + 6
            u5.a r1 = r5.f8804a
            int r1 = r1.k()
            if (r0 <= r1) goto L_0x0024
            return r2
        L_0x0024:
            r0 = 6
            int r6 = r5.f(r6, r0)
            if (r6 < r4) goto L_0x0030
            r0 = 63
            if (r6 >= r0) goto L_0x0030
            r2 = 1
        L_0x0030:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.s.k(int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        r5 = f(r5, 8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean l(int r5) {
        /*
            r4 = this;
            int r0 = r5 + 5
            u5.a r1 = r4.f8804a
            int r1 = r1.k()
            r2 = 0
            if (r0 <= r1) goto L_0x000c
            return r2
        L_0x000c:
            r0 = 5
            int r1 = r4.f(r5, r0)
            r3 = 1
            if (r1 < r0) goto L_0x0019
            r0 = 16
            if (r1 >= r0) goto L_0x0019
            return r3
        L_0x0019:
            int r0 = r5 + 7
            u5.a r1 = r4.f8804a
            int r1 = r1.k()
            if (r0 <= r1) goto L_0x0024
            return r2
        L_0x0024:
            r0 = 7
            int r0 = r4.f(r5, r0)
            r1 = 64
            if (r0 < r1) goto L_0x0032
            r1 = 116(0x74, float:1.63E-43)
            if (r0 >= r1) goto L_0x0032
            return r3
        L_0x0032:
            int r0 = r5 + 8
            u5.a r1 = r4.f8804a
            int r1 = r1.k()
            if (r0 <= r1) goto L_0x003d
            return r2
        L_0x003d:
            r0 = 8
            int r5 = r4.f(r5, r0)
            r0 = 232(0xe8, float:3.25E-43)
            if (r5 < r0) goto L_0x004c
            r0 = 253(0xfd, float:3.55E-43)
            if (r5 >= r0) goto L_0x004c
            r2 = 1
        L_0x004c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.s.l(int):boolean");
    }

    private boolean m(int i10) {
        if (i10 + 7 > this.f8804a.k()) {
            return i10 + 4 <= this.f8804a.k();
        }
        int i11 = i10;
        while (true) {
            int i12 = i10 + 3;
            if (i11 >= i12) {
                return this.f8804a.e(i12);
            }
            if (this.f8804a.e(i11)) {
                return true;
            }
            i11++;
        }
    }

    private l n() {
        while (k(this.f8805b.a())) {
            n b10 = b(this.f8805b.a());
            this.f8805b.h(b10.a());
            if (b10.c()) {
                return new l(new o(this.f8805b.a(), this.f8806c.toString()), true);
            }
            this.f8806c.append(b10.b());
        }
        if (h(this.f8805b.a())) {
            this.f8805b.b(3);
            this.f8805b.g();
        } else if (i(this.f8805b.a())) {
            if (this.f8805b.a() + 5 < this.f8804a.k()) {
                this.f8805b.b(5);
            } else {
                this.f8805b.h(this.f8804a.k());
            }
            this.f8805b.f();
        }
        return new l();
    }

    private o o() {
        l n10;
        boolean b10;
        do {
            int a10 = this.f8805b.a();
            n10 = this.f8805b.c() ? n() : this.f8805b.d() ? p() : q();
            b10 = n10.b();
            if (!(a10 != this.f8805b.a()) && !b10) {
                break;
            }
        } while (!b10);
        return n10.a();
    }

    private l p() {
        while (l(this.f8805b.a())) {
            n d10 = d(this.f8805b.a());
            this.f8805b.h(d10.a());
            if (d10.c()) {
                return new l(new o(this.f8805b.a(), this.f8806c.toString()), true);
            }
            this.f8806c.append(d10.b());
        }
        if (h(this.f8805b.a())) {
            this.f8805b.b(3);
            this.f8805b.g();
        } else if (i(this.f8805b.a())) {
            if (this.f8805b.a() + 5 < this.f8804a.k()) {
                this.f8805b.b(5);
            } else {
                this.f8805b.h(this.f8804a.k());
            }
            this.f8805b.e();
        }
        return new l();
    }

    private l q() {
        while (m(this.f8805b.a())) {
            p e10 = e(this.f8805b.a());
            this.f8805b.h(e10.a());
            if (e10.d()) {
                return new l(e10.e() ? new o(this.f8805b.a(), this.f8806c.toString()) : new o(this.f8805b.a(), this.f8806c.toString(), e10.c()), true);
            }
            this.f8806c.append(e10.b());
            if (e10.e()) {
                return new l(new o(this.f8805b.a(), this.f8806c.toString()), true);
            }
            this.f8806c.append(e10.c());
        }
        if (j(this.f8805b.a())) {
            this.f8805b.e();
            this.f8805b.b(4);
        }
        return new l();
    }

    /* access modifiers changed from: package-private */
    public String a(StringBuilder sb, int i10) {
        String str = null;
        while (true) {
            o c10 = c(i10, str);
            String a10 = r.a(c10.b());
            if (a10 != null) {
                sb.append(a10);
            }
            String valueOf = c10.d() ? String.valueOf(c10.c()) : null;
            if (i10 == c10.a()) {
                return sb.toString();
            }
            i10 = c10.a();
            str = valueOf;
        }
    }

    /* access modifiers changed from: package-private */
    public o c(int i10, String str) {
        this.f8806c.setLength(0);
        if (str != null) {
            this.f8806c.append(str);
        }
        this.f8805b.h(i10);
        o o10 = o();
        return (o10 == null || !o10.d()) ? new o(this.f8805b.a(), this.f8806c.toString()) : new o(this.f8805b.a(), this.f8806c.toString(), o10.c());
    }

    /* access modifiers changed from: package-private */
    public int f(int i10, int i11) {
        return g(this.f8804a, i10, i11);
    }
}
