package h6;

import o5.j;
import o5.p;
import u5.b;

final class c {

    /* renamed from: a  reason: collision with root package name */
    private final b f9384a;

    /* renamed from: b  reason: collision with root package name */
    private final p f9385b;

    /* renamed from: c  reason: collision with root package name */
    private final p f9386c;

    /* renamed from: d  reason: collision with root package name */
    private final p f9387d;

    /* renamed from: e  reason: collision with root package name */
    private final p f9388e;

    /* renamed from: f  reason: collision with root package name */
    private final int f9389f;

    /* renamed from: g  reason: collision with root package name */
    private final int f9390g;

    /* renamed from: h  reason: collision with root package name */
    private final int f9391h;

    /* renamed from: i  reason: collision with root package name */
    private final int f9392i;

    c(c cVar) {
        this.f9384a = cVar.f9384a;
        this.f9385b = cVar.f9385b;
        this.f9386c = cVar.f9386c;
        this.f9387d = cVar.f9387d;
        this.f9388e = cVar.f9388e;
        this.f9389f = cVar.f9389f;
        this.f9390g = cVar.f9390g;
        this.f9391h = cVar.f9391h;
        this.f9392i = cVar.f9392i;
    }

    c(b bVar, p pVar, p pVar2, p pVar3, p pVar4) {
        boolean z9 = false;
        boolean z10 = pVar == null || pVar2 == null;
        z9 = (pVar3 == null || pVar4 == null) ? true : z9;
        if (!z10 || !z9) {
            if (z10) {
                pVar = new p(0.0f, pVar3.d());
                pVar2 = new p(0.0f, pVar4.d());
            } else if (z9) {
                pVar3 = new p((float) (bVar.r() - 1), pVar.d());
                pVar4 = new p((float) (bVar.r() - 1), pVar2.d());
            }
            this.f9384a = bVar;
            this.f9385b = pVar;
            this.f9386c = pVar2;
            this.f9387d = pVar3;
            this.f9388e = pVar4;
            this.f9389f = (int) Math.min(pVar.c(), pVar2.c());
            this.f9390g = (int) Math.max(pVar3.c(), pVar4.c());
            this.f9391h = (int) Math.min(pVar.d(), pVar3.d());
            this.f9392i = (int) Math.max(pVar2.d(), pVar4.d());
            return;
        }
        throw j.a();
    }

    static c j(c cVar, c cVar2) {
        return cVar == null ? cVar2 : cVar2 == null ? cVar : new c(cVar.f9384a, cVar.f9385b, cVar.f9386c, cVar2.f9387d, cVar2.f9388e);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h6.c a(int r13, int r14, boolean r15) {
        /*
            r12 = this;
            o5.p r0 = r12.f9385b
            o5.p r1 = r12.f9386c
            o5.p r2 = r12.f9387d
            o5.p r3 = r12.f9388e
            if (r13 <= 0) goto L_0x0029
            if (r15 == 0) goto L_0x000e
            r4 = r0
            goto L_0x000f
        L_0x000e:
            r4 = r2
        L_0x000f:
            float r5 = r4.d()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L_0x0018
            r5 = 0
        L_0x0018:
            o5.p r13 = new o5.p
            float r4 = r4.c()
            float r5 = (float) r5
            r13.<init>(r4, r5)
            if (r15 == 0) goto L_0x0026
            r8 = r13
            goto L_0x002a
        L_0x0026:
            r10 = r13
            r8 = r0
            goto L_0x002b
        L_0x0029:
            r8 = r0
        L_0x002a:
            r10 = r2
        L_0x002b:
            if (r14 <= 0) goto L_0x005b
            if (r15 == 0) goto L_0x0032
            o5.p r13 = r12.f9386c
            goto L_0x0034
        L_0x0032:
            o5.p r13 = r12.f9388e
        L_0x0034:
            float r0 = r13.d()
            int r0 = (int) r0
            int r0 = r0 + r14
            u5.b r14 = r12.f9384a
            int r14 = r14.n()
            if (r0 < r14) goto L_0x004a
            u5.b r14 = r12.f9384a
            int r14 = r14.n()
            int r0 = r14 + -1
        L_0x004a:
            o5.p r14 = new o5.p
            float r13 = r13.c()
            float r0 = (float) r0
            r14.<init>(r13, r0)
            if (r15 == 0) goto L_0x0058
            r9 = r14
            goto L_0x005c
        L_0x0058:
            r11 = r14
            r9 = r1
            goto L_0x005d
        L_0x005b:
            r9 = r1
        L_0x005c:
            r11 = r3
        L_0x005d:
            h6.c r13 = new h6.c
            u5.b r7 = r12.f9384a
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: h6.c.a(int, int, boolean):h6.c");
    }

    /* access modifiers changed from: package-private */
    public p b() {
        return this.f9386c;
    }

    /* access modifiers changed from: package-private */
    public p c() {
        return this.f9388e;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f9390g;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f9392i;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f9389f;
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f9391h;
    }

    /* access modifiers changed from: package-private */
    public p h() {
        return this.f9385b;
    }

    /* access modifiers changed from: package-private */
    public p i() {
        return this.f9387d;
    }
}
