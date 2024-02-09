package n9;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import b9.j0;
import b9.k0;
import b9.l0;
import b9.r1;
import b9.x0;
import c7.a;
import g8.n;
import g8.p;
import g8.s;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import k7.k;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.j;
import o9.l;
import o9.o;

public final class m implements c7.a, q {

    /* renamed from: m  reason: collision with root package name */
    private final j0 f11435m = k0.a(x0.c());

    /* renamed from: n  reason: collision with root package name */
    private k f11436n;

    /* renamed from: o  reason: collision with root package name */
    private k f11437o;

    /* renamed from: p  reason: collision with root package name */
    private p f11438p;

    /* renamed from: q  reason: collision with root package name */
    private Context f11439q;

    /* renamed from: r  reason: collision with root package name */
    private k7.c f11440r;

    /* renamed from: s  reason: collision with root package name */
    private l f11441s;

    /* renamed from: t  reason: collision with root package name */
    private final ConcurrentHashMap<String, o> f11442t = new ConcurrentHashMap<>();

    /* renamed from: u  reason: collision with root package name */
    private final Handler f11443u = new Handler(Looper.getMainLooper());

    /* renamed from: v  reason: collision with root package name */
    private Runnable f11444v;

    /* renamed from: w  reason: collision with root package name */
    private a f11445w = new a();

    private static final class a implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        private final WeakReference<ConcurrentMap<String, o>> f11446m;

        /* renamed from: n  reason: collision with root package name */
        private final WeakReference<k> f11447n;

        /* renamed from: o  reason: collision with root package name */
        private final WeakReference<Handler> f11448o;

        /* renamed from: p  reason: collision with root package name */
        private final WeakReference<q> f11449p;

        public a(ConcurrentMap<String, o> concurrentMap, k kVar, Handler handler, q qVar) {
            kotlin.jvm.internal.l.e(concurrentMap, "mediaPlayers");
            kotlin.jvm.internal.l.e(kVar, "methodChannel");
            kotlin.jvm.internal.l.e(handler, "handler");
            kotlin.jvm.internal.l.e(qVar, "updateCallback");
            this.f11446m = new WeakReference<>(concurrentMap);
            this.f11447n = new WeakReference<>(kVar);
            this.f11448o = new WeakReference<>(handler);
            this.f11449p = new WeakReference<>(qVar);
        }

        public void run() {
            ConcurrentMap concurrentMap = (ConcurrentMap) this.f11446m.get();
            k kVar = (k) this.f11447n.get();
            Handler handler = (Handler) this.f11448o.get();
            q qVar = (q) this.f11449p.get();
            if (concurrentMap != null && kVar != null && handler != null && qVar != null) {
                boolean z9 = false;
                for (o oVar : concurrentMap.values()) {
                    if (oVar.u()) {
                        Integer i10 = oVar.i();
                        p k10 = oVar.k();
                        g8.l[] lVarArr = new g8.l[1];
                        lVarArr[0] = p.a("value", Integer.valueOf(i10 != null ? i10.intValue() : 0));
                        k10.e("audio.onCurrentPosition", f0.e(lVarArr));
                        z9 = true;
                    }
                }
                if (z9) {
                    handler.postDelayed(this, 200);
                } else {
                    qVar.a();
                }
            } else if (qVar != null) {
                qVar.a();
            }
        }
    }

    /* synthetic */ class b extends j implements r8.p<k7.j, k.d, s> {
        b(Object obj) {
            super(2, obj, m.class, "methodHandler", "methodHandler(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", 0);
        }

        public final void d(k7.j jVar, k.d dVar) {
            kotlin.jvm.internal.l.e(jVar, "p0");
            kotlin.jvm.internal.l.e(dVar, "p1");
            ((m) this.receiver).J(jVar, dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            d((k7.j) obj, (k.d) obj2);
            return s.f8976a;
        }
    }

    /* synthetic */ class c extends j implements r8.p<k7.j, k.d, s> {
        c(Object obj) {
            super(2, obj, m.class, "globalMethodHandler", "globalMethodHandler(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", 0);
        }

        public final void d(k7.j jVar, k.d dVar) {
            kotlin.jvm.internal.l.e(jVar, "p0");
            kotlin.jvm.internal.l.e(dVar, "p1");
            ((m) this.receiver).r(jVar, dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            d((k7.j) obj, (k.d) obj2);
            return s.f8976a;
        }
    }

    @f(c = "xyz.luan.audioplayers.AudioplayersPlugin$safeCall$1", f = "AudioplayersPlugin.kt", l = {}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.k implements r8.p<j0, j8.d<? super s>, Object> {

        /* renamed from: m  reason: collision with root package name */
        int f11450m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ r8.p<k7.j, k.d, s> f11451n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ k7.j f11452o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ k.d f11453p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(r8.p<? super k7.j, ? super k.d, s> pVar, k7.j jVar, k.d dVar, j8.d<? super d> dVar2) {
            super(2, dVar2);
            this.f11451n = pVar;
            this.f11452o = jVar;
            this.f11453p = dVar;
        }

        public final j8.d<s> create(Object obj, j8.d<?> dVar) {
            return new d(this.f11451n, this.f11452o, this.f11453p, dVar);
        }

        public final Object invoke(j0 j0Var, j8.d<? super s> dVar) {
            return ((d) create(j0Var, dVar)).invokeSuspend(s.f8976a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.d();
            if (this.f11450m == 0) {
                n.b(obj);
                try {
                    this.f11451n.invoke(this.f11452o, this.f11453p);
                } catch (Exception e10) {
                    this.f11453p.b("Unexpected AndroidAudioError", e10.getMessage(), e10);
                }
                return s.f8976a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: private */
    public static final void B(m mVar, String str) {
        kotlin.jvm.internal.l.e(mVar, "this$0");
        kotlin.jvm.internal.l.e(str, "$message");
        p pVar = mVar.f11438p;
        if (pVar == null) {
            kotlin.jvm.internal.l.p("globalEvents");
            pVar = null;
        }
        pVar.e("audio.onLog", f0.e(p.a("value", str)));
    }

    /* access modifiers changed from: private */
    public static final void E(o oVar, String str) {
        kotlin.jvm.internal.l.e(oVar, "$player");
        kotlin.jvm.internal.l.e(str, "$message");
        oVar.k().e("audio.onLog", f0.e(p.a("value", str)));
    }

    /* access modifiers changed from: private */
    public static final void G(o oVar, boolean z9) {
        kotlin.jvm.internal.l.e(oVar, "$player");
        oVar.k().e("audio.onPrepared", f0.e(p.a("value", Boolean.valueOf(z9))));
    }

    /* access modifiers changed from: private */
    public static final void I(o oVar) {
        kotlin.jvm.internal.l.e(oVar, "$player");
        p.f(oVar.k(), "audio.onSeekComplete", (Map) null, 2, (Object) null);
        p k10 = oVar.k();
        g8.l[] lVarArr = new g8.l[1];
        Integer i10 = oVar.i();
        lVarArr[0] = p.a("value", Integer.valueOf(i10 != null ? i10.intValue() : 0));
        k10.e("audio.onCurrentPosition", f0.e(lVarArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: n9.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: n9.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: o9.l} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v13 */
    /* JADX WARNING: type inference failed for: r6v14 */
    /* JADX WARNING: type inference failed for: r6v15 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02fe, code lost:
        r2.a(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void J(k7.j r20, k7.k.d r21) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = r21
            java.lang.String r3 = "playerId"
            java.lang.Object r3 = r0.a(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x0011
            return
        L_0x0011:
            java.lang.String r4 = r0.f10996a
            java.lang.String r5 = "create"
            boolean r4 = kotlin.jvm.internal.l.a(r4, r5)
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x006f
            n9.p r0 = new n9.p
            k7.d r4 = new k7.d
            k7.c r7 = r1.f11440r
            if (r7 != 0) goto L_0x002b
            java.lang.String r7 = "binaryMessenger"
            kotlin.jvm.internal.l.p(r7)
            r7 = r6
        L_0x002b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "xyz.luan/audioplayers/events/"
            r8.append(r9)
            r8.append(r3)
            java.lang.String r8 = r8.toString()
            r4.<init>(r7, r8)
            r0.<init>(r4)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, o9.o> r4 = r1.f11442t
            o9.o r7 = new o9.o
            n9.a r8 = r1.f11445w
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 63
            r16 = 0
            n9.a r8 = n9.a.c(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            o9.l r9 = r1.f11441s
            if (r9 != 0) goto L_0x0060
            java.lang.String r9 = "soundPoolManager"
            kotlin.jvm.internal.l.p(r9)
            goto L_0x0061
        L_0x0060:
            r6 = r9
        L_0x0061:
            r7.<init>(r1, r0, r8, r6)
            r4.put(r3, r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2.a(r0)
            return
        L_0x006f:
            o9.o r4 = r1.q(r3)
            java.lang.String r7 = r0.f10996a     // Catch:{ Exception -> 0x0331 }
            if (r7 == 0) goto L_0x032d
            int r8 = r7.hashCode()     // Catch:{ Exception -> 0x0331 }
            r9 = 46
            java.lang.String r10 = "message is required"
            java.lang.String r11 = "message"
            r12 = 0
            switch(r8) {
                case -1757019252: goto L_0x0312;
                case -1722943962: goto L_0x02c4;
                case -1660487654: goto L_0x029b;
                case -1630329231: goto L_0x027b;
                case -934426579: goto L_0x026c;
                case -402284771: goto L_0x0242;
                case -159032046: goto L_0x0208;
                case 3526264: goto L_0x01df;
                case 3540994: goto L_0x01d0;
                case 85887754: goto L_0x01b4;
                case 106440182: goto L_0x01a5;
                case 670514716: goto L_0x017b;
                case 910310901: goto L_0x0144;
                case 1090594823: goto L_0x0135;
                case 1671767583: goto L_0x011f;
                case 1771699022: goto L_0x00e3;
                case 1902436987: goto L_0x00d0;
                case 2096116872: goto L_0x0087;
                default: goto L_0x0085;
            }
        L_0x0085:
            goto L_0x032d
        L_0x0087:
            java.lang.String r3 = "setReleaseMode"
            boolean r3 = r7.equals(r3)     // Catch:{ Exception -> 0x0331 }
            if (r3 != 0) goto L_0x0091
            goto L_0x032d
        L_0x0091:
            java.lang.String r3 = "releaseMode"
            java.lang.Object r0 = r0.a(r3)     // Catch:{ Exception -> 0x0331 }
            r13 = r0
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x0331 }
            if (r13 != 0) goto L_0x009d
            goto L_0x00bd
        L_0x009d:
            kotlin.jvm.internal.l.b(r13)     // Catch:{ Exception -> 0x0331 }
            char[] r14 = new char[r5]     // Catch:{ Exception -> 0x0331 }
            r14[r12] = r9     // Catch:{ Exception -> 0x0331 }
            r15 = 0
            r16 = 0
            r17 = 6
            r18 = 0
            java.util.List r0 = z8.p.X(r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x0331 }
            java.lang.Object r0 = h8.v.s(r0)     // Catch:{ Exception -> 0x0331 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0331 }
            java.lang.String r0 = n9.n.c(r0)     // Catch:{ Exception -> 0x0331 }
            n9.s r6 = n9.s.valueOf(r0)     // Catch:{ Exception -> 0x0331 }
        L_0x00bd:
            if (r6 == 0) goto L_0x00c4
            r4.K(r6)     // Catch:{ Exception -> 0x0331 }
            goto L_0x02fe
        L_0x00c4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0331 }
            java.lang.String r3 = "releaseMode is required"
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0331 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x0331 }
            throw r0     // Catch:{ Exception -> 0x0331 }
        L_0x00d0:
            java.lang.String r3 = "setAudioContext"
            boolean r3 = r7.equals(r3)     // Catch:{ Exception -> 0x0331 }
            if (r3 != 0) goto L_0x00da
            goto L_0x032d
        L_0x00da:
            n9.a r0 = n9.n.b(r20)     // Catch:{ Exception -> 0x0331 }
            r4.P(r0)     // Catch:{ Exception -> 0x0331 }
            goto L_0x02fe
        L_0x00e3:
            java.lang.String r3 = "setSourceBytes"
            boolean r3 = r7.equals(r3)     // Catch:{ Exception -> 0x0331 }
            if (r3 != 0) goto L_0x00ed
            goto L_0x032d
        L_0x00ed:
            java.lang.String r3 = "bytes"
            java.lang.Object r0 = r0.a(r3)     // Catch:{ Exception -> 0x0331 }
            byte[] r0 = (byte[]) r0     // Catch:{ Exception -> 0x0331 }
            if (r0 == 0) goto L_0x0113
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0331 }
            r6 = 23
            if (r3 < r6) goto L_0x0107
            p9.a r3 = new p9.a     // Catch:{ Exception -> 0x0331 }
            r3.<init>((byte[]) r0)     // Catch:{ Exception -> 0x0331 }
            r4.L(r3)     // Catch:{ Exception -> 0x0331 }
            goto L_0x02fe
        L_0x0107:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0331 }
            java.lang.String r3 = "Operation not supported on Android <= M"
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0331 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x0331 }
            throw r0     // Catch:{ Exception -> 0x0331 }
        L_0x0113:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0331 }
            java.lang.String r3 = "bytes are required"
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0331 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x0331 }
            throw r0     // Catch:{ Exception -> 0x0331 }
        L_0x011f:
            java.lang.String r0 = "dispose"
            boolean r0 = r7.equals(r0)     // Catch:{ Exception -> 0x0331 }
            if (r0 != 0) goto L_0x0129
            goto L_0x032d
        L_0x0129:
            android.os.Handler r0 = r1.f11443u     // Catch:{ Exception -> 0x0331 }
            n9.j r6 = new n9.j     // Catch:{ Exception -> 0x0331 }
            r6.<init>(r4, r1, r3)     // Catch:{ Exception -> 0x0331 }
            r0.post(r6)     // Catch:{ Exception -> 0x0331 }
            goto L_0x02fe
        L_0x0135:
            java.lang.String r0 = "release"
            boolean r0 = r7.equals(r0)     // Catch:{ Exception -> 0x0331 }
            if (r0 != 0) goto L_0x013f
            goto L_0x032d
        L_0x013f:
            r4.E()     // Catch:{ Exception -> 0x0331 }
            goto L_0x02fe
        L_0x0144:
            java.lang.String r3 = "emitError"
            boolean r3 = r7.equals(r3)     // Catch:{ Exception -> 0x0331 }
            if (r3 != 0) goto L_0x014e
            goto L_0x032d
        L_0x014e:
            java.lang.String r3 = "code"
            java.lang.Object r3 = r0.a(r3)     // Catch:{ Exception -> 0x0331 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0331 }
            if (r3 == 0) goto L_0x016f
            java.lang.Object r0 = r0.a(r11)     // Catch:{ Exception -> 0x0331 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0331 }
            if (r0 == 0) goto L_0x0165
            r4.r(r3, r0, r6)     // Catch:{ Exception -> 0x0331 }
            goto L_0x02fe
        L_0x0165:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0331 }
            java.lang.String r3 = r10.toString()     // Catch:{ Exception -> 0x0331 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x0331 }
            throw r0     // Catch:{ Exception -> 0x0331 }
        L_0x016f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0331 }
            java.lang.String r3 = "code is required"
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0331 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x0331 }
            throw r0     // Catch:{ Exception -> 0x0331 }
        L_0x017b:
            java.lang.String r3 = "setVolume"
            boolean r3 = r7.equals(r3)     // Catch:{ Exception -> 0x0331 }
            if (r3 != 0) goto L_0x0185
            goto L_0x032d
        L_0x0185:
            java.lang.String r3 = "volume"
            java.lang.Object r0 = r0.a(r3)     // Catch:{ Exception -> 0x0331 }
            java.lang.Double r0 = (java.lang.Double) r0     // Catch:{ Exception -> 0x0331 }
            if (r0 == 0) goto L_0x0199
            double r6 = r0.doubleValue()     // Catch:{ Exception -> 0x0331 }
            float r0 = (float) r6     // Catch:{ Exception -> 0x0331 }
            r4.M(r0)     // Catch:{ Exception -> 0x0331 }
            goto L_0x02fe
        L_0x0199:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0331 }
            java.lang.String r3 = "volume is required"
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0331 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x0331 }
            throw r0     // Catch:{ Exception -> 0x0331 }
        L_0x01a5:
            java.lang.String r0 = "pause"
            boolean r0 = r7.equals(r0)     // Catch:{ Exception -> 0x0331 }
            if (r0 != 0) goto L_0x01af
            goto L_0x032d
        L_0x01af:
            r4.C()     // Catch:{ Exception -> 0x0331 }
            goto L_0x02fe
        L_0x01b4:
            java.lang.String r0 = "getDuration"
            boolean r0 = r7.equals(r0)     // Catch:{ Exception -> 0x0331 }
            if (r0 != 0) goto L_0x01be
            goto L_0x032d
        L_0x01be:
            java.lang.Integer r0 = r4.j()     // Catch:{ Exception -> 0x0331 }
            if (r0 == 0) goto L_0x01c8
            int r12 = r0.intValue()     // Catch:{ Exception -> 0x0331 }
        L_0x01c8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x0331 }
            r2.a(r0)     // Catch:{ Exception -> 0x0331 }
            return
        L_0x01d0:
            java.lang.String r0 = "stop"
            boolean r0 = r7.equals(r0)     // Catch:{ Exception -> 0x0331 }
            if (r0 != 0) goto L_0x01da
            goto L_0x032d
        L_0x01da:
            r4.O()     // Catch:{ Exception -> 0x0331 }
            goto L_0x02fe
        L_0x01df:
            java.lang.String r3 = "seek"
            boolean r3 = r7.equals(r3)     // Catch:{ Exception -> 0x0331 }
            if (r3 != 0) goto L_0x01e9
            goto L_0x032d
        L_0x01e9:
            java.lang.String r3 = "position"
            java.lang.Object r0 = r0.a(r3)     // Catch:{ Exception -> 0x0331 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x0331 }
            if (r0 == 0) goto L_0x01fc
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x0331 }
            r4.F(r0)     // Catch:{ Exception -> 0x0331 }
            goto L_0x02fe
        L_0x01fc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0331 }
            java.lang.String r3 = "position is required"
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0331 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x0331 }
            throw r0     // Catch:{ Exception -> 0x0331 }
        L_0x0208:
            java.lang.String r3 = "setSourceUrl"
            boolean r3 = r7.equals(r3)     // Catch:{ Exception -> 0x0331 }
            if (r3 != 0) goto L_0x0212
            goto L_0x032d
        L_0x0212:
            java.lang.String r3 = "url"
            java.lang.Object r3 = r0.a(r3)     // Catch:{ Exception -> 0x0331 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0331 }
            if (r3 == 0) goto L_0x0236
            java.lang.String r6 = "isLocal"
            java.lang.Object r0 = r0.a(r6)     // Catch:{ Exception -> 0x0331 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0331 }
            if (r0 != 0) goto L_0x0228
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0331 }
        L_0x0228:
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0331 }
            p9.c r6 = new p9.c     // Catch:{ Exception -> 0x0331 }
            r6.<init>(r3, r0)     // Catch:{ Exception -> 0x0331 }
            r4.L(r6)     // Catch:{ Exception -> 0x0331 }
            goto L_0x02fe
        L_0x0236:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0331 }
            java.lang.String r3 = "url is required"
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0331 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x0331 }
            throw r0     // Catch:{ Exception -> 0x0331 }
        L_0x0242:
            java.lang.String r3 = "setPlaybackRate"
            boolean r3 = r7.equals(r3)     // Catch:{ Exception -> 0x0331 }
            if (r3 != 0) goto L_0x024c
            goto L_0x032d
        L_0x024c:
            java.lang.String r3 = "playbackRate"
            java.lang.Object r0 = r0.a(r3)     // Catch:{ Exception -> 0x0331 }
            java.lang.Double r0 = (java.lang.Double) r0     // Catch:{ Exception -> 0x0331 }
            if (r0 == 0) goto L_0x0260
            double r6 = r0.doubleValue()     // Catch:{ Exception -> 0x0331 }
            float r0 = (float) r6     // Catch:{ Exception -> 0x0331 }
            r4.J(r0)     // Catch:{ Exception -> 0x0331 }
            goto L_0x02fe
        L_0x0260:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0331 }
            java.lang.String r3 = "playbackRate is required"
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0331 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x0331 }
            throw r0     // Catch:{ Exception -> 0x0331 }
        L_0x026c:
            java.lang.String r0 = "resume"
            boolean r0 = r7.equals(r0)     // Catch:{ Exception -> 0x0331 }
            if (r0 != 0) goto L_0x0276
            goto L_0x032d
        L_0x0276:
            r4.D()     // Catch:{ Exception -> 0x0331 }
            goto L_0x02fe
        L_0x027b:
            java.lang.String r3 = "emitLog"
            boolean r3 = r7.equals(r3)     // Catch:{ Exception -> 0x0331 }
            if (r3 != 0) goto L_0x0285
            goto L_0x032d
        L_0x0285:
            java.lang.Object r0 = r0.a(r11)     // Catch:{ Exception -> 0x0331 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0331 }
            if (r0 == 0) goto L_0x0291
            r4.s(r0)     // Catch:{ Exception -> 0x0331 }
            goto L_0x02fe
        L_0x0291:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0331 }
            java.lang.String r3 = r10.toString()     // Catch:{ Exception -> 0x0331 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x0331 }
            throw r0     // Catch:{ Exception -> 0x0331 }
        L_0x029b:
            java.lang.String r3 = "setBalance"
            boolean r3 = r7.equals(r3)     // Catch:{ Exception -> 0x0331 }
            if (r3 != 0) goto L_0x02a5
            goto L_0x032d
        L_0x02a5:
            java.lang.String r3 = "balance"
            java.lang.Object r0 = r0.a(r3)     // Catch:{ Exception -> 0x0331 }
            java.lang.Double r0 = (java.lang.Double) r0     // Catch:{ Exception -> 0x0331 }
            if (r0 == 0) goto L_0x02b8
            double r6 = r0.doubleValue()     // Catch:{ Exception -> 0x0331 }
            float r0 = (float) r6     // Catch:{ Exception -> 0x0331 }
            r4.G(r0)     // Catch:{ Exception -> 0x0331 }
            goto L_0x02fe
        L_0x02b8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0331 }
            java.lang.String r3 = "balance is required"
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0331 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x0331 }
            throw r0     // Catch:{ Exception -> 0x0331 }
        L_0x02c4:
            java.lang.String r3 = "setPlayerMode"
            boolean r3 = r7.equals(r3)     // Catch:{ Exception -> 0x0331 }
            if (r3 != 0) goto L_0x02cd
            goto L_0x032d
        L_0x02cd:
            java.lang.String r3 = "playerMode"
            java.lang.Object r0 = r0.a(r3)     // Catch:{ Exception -> 0x0331 }
            r13 = r0
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x0331 }
            if (r13 != 0) goto L_0x02d9
            goto L_0x02f9
        L_0x02d9:
            kotlin.jvm.internal.l.b(r13)     // Catch:{ Exception -> 0x0331 }
            char[] r14 = new char[r5]     // Catch:{ Exception -> 0x0331 }
            r14[r12] = r9     // Catch:{ Exception -> 0x0331 }
            r15 = 0
            r16 = 0
            r17 = 6
            r18 = 0
            java.util.List r0 = z8.p.X(r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x0331 }
            java.lang.Object r0 = h8.v.s(r0)     // Catch:{ Exception -> 0x0331 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0331 }
            java.lang.String r0 = n9.n.c(r0)     // Catch:{ Exception -> 0x0331 }
            n9.r r6 = n9.r.valueOf(r0)     // Catch:{ Exception -> 0x0331 }
        L_0x02f9:
            if (r6 == 0) goto L_0x0306
            r4.H(r6)     // Catch:{ Exception -> 0x0331 }
        L_0x02fe:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0331 }
            r2.a(r0)     // Catch:{ Exception -> 0x0331 }
            goto L_0x033b
        L_0x0306:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0331 }
            java.lang.String r3 = "playerMode is required"
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0331 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x0331 }
            throw r0     // Catch:{ Exception -> 0x0331 }
        L_0x0312:
            java.lang.String r0 = "getCurrentPosition"
            boolean r0 = r7.equals(r0)     // Catch:{ Exception -> 0x0331 }
            if (r0 != 0) goto L_0x031b
            goto L_0x032d
        L_0x031b:
            java.lang.Integer r0 = r4.i()     // Catch:{ Exception -> 0x0331 }
            if (r0 == 0) goto L_0x0325
            int r12 = r0.intValue()     // Catch:{ Exception -> 0x0331 }
        L_0x0325:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x0331 }
            r2.a(r0)     // Catch:{ Exception -> 0x0331 }
            return
        L_0x032d:
            r21.c()     // Catch:{ Exception -> 0x0331 }
            return
        L_0x0331:
            r0 = move-exception
            java.lang.String r3 = r0.getMessage()
            java.lang.String r4 = "AndroidAudioError"
            r2.b(r4, r3, r0)
        L_0x033b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.m.J(k7.j, k7.k$d):void");
    }

    /* access modifiers changed from: private */
    public static final void K(o oVar, m mVar, String str) {
        kotlin.jvm.internal.l.e(oVar, "$player");
        kotlin.jvm.internal.l.e(mVar, "this$0");
        kotlin.jvm.internal.l.e(str, "$playerId");
        oVar.e();
        mVar.f11442t.remove(str);
    }

    /* access modifiers changed from: private */
    public static final void L(m mVar, k7.j jVar, k.d dVar) {
        kotlin.jvm.internal.l.e(mVar, "this$0");
        kotlin.jvm.internal.l.e(jVar, "call");
        kotlin.jvm.internal.l.e(dVar, "response");
        mVar.N(jVar, dVar, new b(mVar));
    }

    /* access modifiers changed from: private */
    public static final void M(m mVar, k7.j jVar, k.d dVar) {
        kotlin.jvm.internal.l.e(mVar, "this$0");
        kotlin.jvm.internal.l.e(jVar, "call");
        kotlin.jvm.internal.l.e(dVar, "response");
        mVar.N(jVar, dVar, new c(mVar));
    }

    private final void N(k7.j jVar, k.d dVar, r8.p<? super k7.j, ? super k.d, s> pVar) {
        r1 unused = i.d(this.f11435m, x0.b(), (l0) null, new d(pVar, jVar, dVar, (j8.d<? super d>) null), 2, (Object) null);
    }

    private final o q(String str) {
        o oVar = this.f11442t.get(str);
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalStateException("Player has not yet been created or has already been disposed.".toString());
    }

    /* access modifiers changed from: private */
    public final void r(k7.j jVar, k.d dVar) {
        String str = jVar.f10996a;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1630329231) {
                if (hashCode != 910310901) {
                    if (hashCode == 1902436987 && str.equals("setAudioContext")) {
                        AudioManager p10 = p();
                        p10.setMode(this.f11445w.e());
                        p10.setSpeakerphoneOn(this.f11445w.g());
                        this.f11445w = n.b(jVar);
                    }
                } else if (str.equals("emitError")) {
                    String str2 = (String) jVar.a("code");
                    if (str2 != null) {
                        String str3 = (String) jVar.a("message");
                        if (str3 != null) {
                            y(str2, str3, (Object) null);
                        } else {
                            throw new IllegalStateException("message is required".toString());
                        }
                    } else {
                        throw new IllegalStateException("code is required".toString());
                    }
                }
            } else if (str.equals("emitLog")) {
                String str4 = (String) jVar.a("message");
                if (str4 != null) {
                    A(str4);
                } else {
                    throw new IllegalStateException("message is required".toString());
                }
            }
            dVar.a(1);
            return;
        }
        dVar.c();
    }

    /* access modifiers changed from: private */
    public static final void t(o oVar) {
        kotlin.jvm.internal.l.e(oVar, "$player");
        p.f(oVar.k(), "audio.onComplete", (Map) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void v(o oVar) {
        kotlin.jvm.internal.l.e(oVar, "$player");
        p k10 = oVar.k();
        g8.l[] lVarArr = new g8.l[1];
        Integer j10 = oVar.j();
        lVarArr[0] = p.a("value", Integer.valueOf(j10 != null ? j10.intValue() : 0));
        k10.e("audio.onDuration", f0.e(lVarArr));
    }

    /* access modifiers changed from: private */
    public static final void x(o oVar, String str, String str2, Object obj) {
        kotlin.jvm.internal.l.e(oVar, "$player");
        oVar.k().d(str, str2, obj);
    }

    /* access modifiers changed from: private */
    public static final void z(m mVar, String str, String str2, Object obj) {
        kotlin.jvm.internal.l.e(mVar, "this$0");
        p pVar = mVar.f11438p;
        if (pVar == null) {
            kotlin.jvm.internal.l.p("globalEvents");
            pVar = null;
        }
        pVar.d(str, str2, obj);
    }

    public final void A(String str) {
        kotlin.jvm.internal.l.e(str, "message");
        this.f11443u.post(new b(this, str));
    }

    public final void C() {
        O();
    }

    public final void D(o oVar, String str) {
        kotlin.jvm.internal.l.e(oVar, "player");
        kotlin.jvm.internal.l.e(str, "message");
        this.f11443u.post(new h(oVar, str));
    }

    public final void F(o oVar, boolean z9) {
        kotlin.jvm.internal.l.e(oVar, "player");
        this.f11443u.post(new k(oVar, z9));
    }

    public final void H(o oVar) {
        kotlin.jvm.internal.l.e(oVar, "player");
        this.f11443u.post(new f(oVar));
    }

    public void O() {
        Runnable runnable = this.f11444v;
        if (runnable != null) {
            this.f11443u.post(runnable);
        }
    }

    public void a() {
        Runnable runnable = this.f11444v;
        if (runnable != null) {
            this.f11443u.removeCallbacks(runnable);
        }
    }

    public final Context o() {
        Context context = this.f11439q;
        if (context == null) {
            kotlin.jvm.internal.l.p("context");
            context = null;
        }
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.d(applicationContext, "getApplicationContext(...)");
        return applicationContext;
    }

    public void onAttachedToEngine(a.b bVar) {
        kotlin.jvm.internal.l.e(bVar, "binding");
        Context a10 = bVar.a();
        kotlin.jvm.internal.l.d(a10, "getApplicationContext(...)");
        this.f11439q = a10;
        k7.c b10 = bVar.b();
        kotlin.jvm.internal.l.d(b10, "getBinaryMessenger(...)");
        this.f11440r = b10;
        this.f11441s = new l(this);
        k kVar = new k(bVar.b(), "xyz.luan/audioplayers");
        this.f11436n = kVar;
        kVar.e(new l(this));
        k kVar2 = new k(bVar.b(), "xyz.luan/audioplayers.global");
        this.f11437o = kVar2;
        kVar2.e(new c(this));
        ConcurrentHashMap<String, o> concurrentHashMap = this.f11442t;
        k kVar3 = this.f11436n;
        if (kVar3 == null) {
            kotlin.jvm.internal.l.p("methods");
            kVar3 = null;
        }
        this.f11444v = new a(concurrentHashMap, kVar3, this.f11443u, this);
        this.f11438p = new p(new k7.d(bVar.b(), "xyz.luan/audioplayers.global/events"));
    }

    public void onDetachedFromEngine(a.b bVar) {
        kotlin.jvm.internal.l.e(bVar, "binding");
        a();
        p pVar = null;
        this.f11443u.removeCallbacksAndMessages((Object) null);
        this.f11444v = null;
        Collection<o> values = this.f11442t.values();
        kotlin.jvm.internal.l.d(values, "<get-values>(...)");
        for (o e10 : values) {
            e10.e();
        }
        this.f11442t.clear();
        k0.c(this.f11435m, (CancellationException) null, 1, (Object) null);
        l lVar = this.f11441s;
        if (lVar == null) {
            kotlin.jvm.internal.l.p("soundPoolManager");
            lVar = null;
        }
        lVar.d();
        p pVar2 = this.f11438p;
        if (pVar2 == null) {
            kotlin.jvm.internal.l.p("globalEvents");
        } else {
            pVar = pVar2;
        }
        pVar.c();
    }

    public final AudioManager p() {
        Context context = this.f11439q;
        if (context == null) {
            kotlin.jvm.internal.l.p("context");
            context = null;
        }
        Object systemService = context.getApplicationContext().getSystemService("audio");
        kotlin.jvm.internal.l.c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return (AudioManager) systemService;
    }

    public final void s(o oVar) {
        kotlin.jvm.internal.l.e(oVar, "player");
        this.f11443u.post(new e(oVar));
    }

    public final void u(o oVar) {
        kotlin.jvm.internal.l.e(oVar, "player");
        this.f11443u.post(new g(oVar));
    }

    public final void w(o oVar, String str, String str2, Object obj) {
        kotlin.jvm.internal.l.e(oVar, "player");
        this.f11443u.post(new i(oVar, str, str2, obj));
    }

    public final void y(String str, String str2, Object obj) {
        this.f11443u.post(new d(this, str, str2, obj));
    }
}
