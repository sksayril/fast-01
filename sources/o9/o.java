package o9;

import android.content.Context;
import android.media.AudioManager;
import g8.k;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.l;
import n9.m;
import n9.p;
import n9.r;
import n9.s;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final m f11676a;

    /* renamed from: b  reason: collision with root package name */
    private final p f11677b;

    /* renamed from: c  reason: collision with root package name */
    private n9.a f11678c;

    /* renamed from: d  reason: collision with root package name */
    private final l f11679d;

    /* renamed from: e  reason: collision with root package name */
    private j f11680e;

    /* renamed from: f  reason: collision with root package name */
    private p9.b f11681f;

    /* renamed from: g  reason: collision with root package name */
    private float f11682g = 1.0f;

    /* renamed from: h  reason: collision with root package name */
    private float f11683h;

    /* renamed from: i  reason: collision with root package name */
    private float f11684i = 1.0f;

    /* renamed from: j  reason: collision with root package name */
    private s f11685j = s.RELEASE;

    /* renamed from: k  reason: collision with root package name */
    private r f11686k = r.MEDIA_PLAYER;

    /* renamed from: l  reason: collision with root package name */
    private boolean f11687l = true;

    /* renamed from: m  reason: collision with root package name */
    private boolean f11688m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f11689n;

    /* renamed from: o  reason: collision with root package name */
    private int f11690o = -1;

    /* renamed from: p  reason: collision with root package name */
    private final c f11691p = new c(this);

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11692a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                n9.r[] r0 = n9.r.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                n9.r r1 = n9.r.MEDIA_PLAYER     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                n9.r r1 = n9.r.LOW_LATENCY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f11692a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o9.o.a.<clinit>():void");
        }
    }

    /* synthetic */ class b extends j implements r8.a<g8.s> {
        b(Object obj) {
            super(0, obj, o.class, "actuallyPlay", "actuallyPlay()V", 0);
        }

        public final void d() {
            ((o) this.receiver).b();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            d();
            return g8.s.f8976a;
        }
    }

    public o(m mVar, p pVar, n9.a aVar, l lVar) {
        l.e(mVar, "ref");
        l.e(pVar, "eventHandler");
        l.e(aVar, "context");
        l.e(lVar, "soundPoolManager");
        this.f11676a = mVar;
        this.f11677b = pVar;
        this.f11678c = aVar;
        this.f11679d = lVar;
    }

    private final void N(j jVar, float f10, float f11) {
        jVar.m(Math.min(1.0f, 1.0f - f11) * f10, Math.min(1.0f, f11 + 1.0f) * f10);
    }

    /* access modifiers changed from: private */
    public final void b() {
        if (!this.f11689n && !this.f11687l) {
            j jVar = this.f11680e;
            this.f11689n = true;
            if (jVar == null) {
                t();
            } else if (this.f11688m) {
                jVar.start();
                this.f11676a.C();
            }
        }
    }

    private final void c(j jVar) {
        jVar.i(this.f11684i);
        N(jVar, this.f11682g, this.f11683h);
        jVar.d(v());
        jVar.f();
    }

    private final j d() {
        int i10 = a.f11692a[this.f11686k.ordinal()];
        if (i10 == 1) {
            return new i(this);
        }
        if (i10 == 2) {
            return new m(this, this.f11679d);
        }
        throw new k();
    }

    private final j l() {
        j jVar = this.f11680e;
        if (this.f11687l || jVar == null) {
            j d10 = d();
            this.f11680e = d10;
            this.f11687l = false;
            return d10;
        } else if (!this.f11688m) {
            return jVar;
        } else {
            jVar.c();
            I(false);
            return jVar;
        }
    }

    private final void t() {
        j d10 = d();
        this.f11680e = d10;
        p9.b bVar = this.f11681f;
        if (bVar != null) {
            d10.k(bVar);
            c(d10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001b A[Catch:{ all -> 0x0022 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001c A[Catch:{ all -> 0x0022 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int w() {
        /*
            r3 = this;
            r0 = 0
            g8.m$a r1 = g8.m.f8970m     // Catch:{ all -> 0x0022 }
            o9.j r1 = r3.f11680e     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x000c
            java.lang.Integer r1 = r1.n()     // Catch:{ all -> 0x0022 }
            goto L_0x000d
        L_0x000c:
            r1 = r0
        L_0x000d:
            if (r1 != 0) goto L_0x0010
            goto L_0x0018
        L_0x0010:
            int r2 = r1.intValue()     // Catch:{ all -> 0x0022 }
            if (r2 != 0) goto L_0x0018
            r2 = 1
            goto L_0x0019
        L_0x0018:
            r2 = 0
        L_0x0019:
            if (r2 != 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r1 = r0
        L_0x001d:
            java.lang.Object r1 = g8.m.a(r1)     // Catch:{ all -> 0x0022 }
            goto L_0x002d
        L_0x0022:
            r1 = move-exception
            g8.m$a r2 = g8.m.f8970m
            java.lang.Object r1 = g8.n.a(r1)
            java.lang.Object r1 = g8.m.a(r1)
        L_0x002d:
            boolean r2 = g8.m.c(r1)
            if (r2 == 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r0 = r1
        L_0x0035:
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x003e
            int r0 = r0.intValue()
            goto L_0x003f
        L_0x003e:
            r0 = -1
        L_0x003f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.o.w():int");
    }

    public final void A() {
        j jVar;
        boolean z9 = true;
        I(true);
        this.f11676a.u(this);
        if (this.f11689n) {
            j jVar2 = this.f11680e;
            if (jVar2 != null) {
                jVar2.start();
            }
            this.f11676a.C();
        }
        if (this.f11690o >= 0) {
            j jVar3 = this.f11680e;
            if (jVar3 == null || !jVar3.h()) {
                z9 = false;
            }
            if (!z9 && (jVar = this.f11680e) != null) {
                jVar.j(this.f11690o);
            }
        }
    }

    public final void B() {
        this.f11676a.H(this);
    }

    public final void C() {
        j jVar;
        if (this.f11689n) {
            this.f11689n = false;
            if (this.f11688m && (jVar = this.f11680e) != null) {
                jVar.b();
            }
        }
    }

    public final void D() {
        this.f11691p.g(new b(this));
    }

    public final void E() {
        j jVar;
        this.f11691p.f();
        if (!this.f11687l) {
            if (this.f11689n && (jVar = this.f11680e) != null) {
                jVar.stop();
            }
            L((p9.b) null);
            this.f11680e = null;
        }
    }

    public final void F(int i10) {
        if (this.f11688m) {
            j jVar = this.f11680e;
            boolean z9 = true;
            if (jVar == null || !jVar.h()) {
                z9 = false;
            }
            if (!z9) {
                j jVar2 = this.f11680e;
                if (jVar2 != null) {
                    jVar2.j(i10);
                }
                i10 = -1;
            }
        }
        this.f11690o = i10;
    }

    public final void G(float f10) {
        j jVar;
        if (!(this.f11683h == f10)) {
            this.f11683h = f10;
            if (!this.f11687l && (jVar = this.f11680e) != null) {
                N(jVar, this.f11682g, f10);
            }
        }
    }

    public final void H(r rVar) {
        l.e(rVar, "value");
        if (this.f11686k != rVar) {
            this.f11686k = rVar;
            j jVar = this.f11680e;
            if (jVar != null) {
                this.f11690o = w();
                I(false);
                jVar.a();
            }
            t();
        }
    }

    public final void I(boolean z9) {
        if (this.f11688m != z9) {
            this.f11688m = z9;
            this.f11676a.F(this, z9);
        }
    }

    public final void J(float f10) {
        if (!(this.f11684i == f10)) {
            this.f11684i = f10;
            j jVar = this.f11680e;
            if (jVar != null) {
                jVar.i(f10);
            }
        }
    }

    public final void K(s sVar) {
        j jVar;
        l.e(sVar, "value");
        if (this.f11685j != sVar) {
            this.f11685j = sVar;
            if (!this.f11687l && (jVar = this.f11680e) != null) {
                jVar.d(v());
            }
        }
    }

    public final void L(p9.b bVar) {
        if (!l.a(this.f11681f, bVar)) {
            this.f11681f = bVar;
            if (bVar != null) {
                j l10 = l();
                l10.k(bVar);
                c(l10);
                return;
            }
            this.f11687l = true;
            I(false);
            this.f11689n = false;
            j jVar = this.f11680e;
            if (jVar != null) {
                jVar.a();
                return;
            }
            return;
        }
        this.f11676a.F(this, true);
    }

    public final void M(float f10) {
        j jVar;
        if (!(this.f11682g == f10)) {
            this.f11682g = f10;
            if (!this.f11687l && (jVar = this.f11680e) != null) {
                N(jVar, f10, this.f11683h);
            }
        }
    }

    public final void O() {
        this.f11691p.f();
        if (!this.f11687l) {
            if (this.f11685j != s.RELEASE) {
                C();
                if (this.f11688m) {
                    j jVar = this.f11680e;
                    boolean z9 = true;
                    if (jVar == null || !jVar.h()) {
                        z9 = false;
                    }
                    if (z9) {
                        j jVar2 = this.f11680e;
                        if (jVar2 != null) {
                            jVar2.stop();
                        }
                        I(false);
                        j jVar3 = this.f11680e;
                        if (jVar3 != null) {
                            jVar3.f();
                            return;
                        }
                        return;
                    }
                    F(0);
                    return;
                }
                return;
            }
            E();
        }
    }

    public final void P(n9.a aVar) {
        l.e(aVar, "audioContext");
        if (!l.a(this.f11678c, aVar)) {
            if (this.f11678c.d() != null && aVar.d() == null) {
                this.f11691p.f();
            }
            this.f11678c = n9.a.c(aVar, false, false, 0, 0, (Integer) null, 0, 63, (Object) null);
            g().setMode(this.f11678c.e());
            g().setSpeakerphoneOn(this.f11678c.g());
            j jVar = this.f11680e;
            if (jVar != null) {
                jVar.stop();
                I(false);
                jVar.l(this.f11678c);
                p9.b bVar = this.f11681f;
                if (bVar != null) {
                    jVar.k(bVar);
                    c(jVar);
                }
            }
        }
    }

    public final void e() {
        E();
        this.f11677b.c();
    }

    public final Context f() {
        return this.f11676a.o();
    }

    public final AudioManager g() {
        return this.f11676a.p();
    }

    public final n9.a h() {
        return this.f11678c;
    }

    public final Integer i() {
        j jVar;
        if (!this.f11688m || (jVar = this.f11680e) == null) {
            return null;
        }
        return jVar.n();
    }

    public final Integer j() {
        j jVar;
        if (!this.f11688m || (jVar = this.f11680e) == null) {
            return null;
        }
        return jVar.g();
    }

    public final p k() {
        return this.f11677b;
    }

    public final boolean m() {
        return this.f11689n;
    }

    public final boolean n() {
        return this.f11688m;
    }

    public final float o() {
        return this.f11684i;
    }

    public final p9.b p() {
        return this.f11681f;
    }

    public final float q() {
        return this.f11682g;
    }

    public final void r(String str, String str2, Object obj) {
        this.f11676a.w(this, str, str2, obj);
    }

    public final void s(String str) {
        l.e(str, "message");
        this.f11676a.D(this, str);
    }

    public final boolean u() {
        if (this.f11689n && this.f11688m) {
            j jVar = this.f11680e;
            if (jVar != null && jVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final boolean v() {
        return this.f11685j == s.LOOP;
    }

    public final void x(int i10) {
    }

    public final void y() {
        if (this.f11685j != s.LOOP) {
            O();
        }
        this.f11676a.s(this);
    }

    public final boolean z(int i10, int i11) {
        String str;
        String str2;
        I(false);
        if (i10 == 100) {
            str = "MEDIA_ERROR_SERVER_DIED";
        } else {
            str = "MEDIA_ERROR_UNKNOWN {what:" + i10 + '}';
        }
        if (i11 == Integer.MIN_VALUE) {
            str2 = "MEDIA_ERROR_SYSTEM";
        } else if (i11 == -1010) {
            str2 = "MEDIA_ERROR_UNSUPPORTED";
        } else if (i11 == -1007) {
            str2 = "MEDIA_ERROR_MALFORMED";
        } else if (i11 == -1004) {
            str2 = "MEDIA_ERROR_IO";
        } else if (i11 != -110) {
            str2 = "MEDIA_ERROR_UNKNOWN {extra:" + i11 + '}';
        } else {
            str2 = "MEDIA_ERROR_TIMED_OUT";
        }
        r(str, str2, (Object) null);
        return false;
    }
}
