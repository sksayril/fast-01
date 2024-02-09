package io.flutter.embedding.engine.systemchannels;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k7.j;
import k7.k;
import k7.s;

public class l {

    /* renamed from: a  reason: collision with root package name */
    private final k f9914a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public g f9915b;

    /* renamed from: c  reason: collision with root package name */
    private final k.c f9916c;

    class a implements k.c {
        a() {
        }

        private void b(j jVar, k.d dVar) {
            try {
                l.this.f9915b.e(((Integer) jVar.b()).intValue());
                dVar.a((Object) null);
            } catch (IllegalStateException e10) {
                dVar.b("error", l.c(e10), (Object) null);
            }
        }

        private void c(j jVar, k.d dVar) {
            k.d dVar2 = dVar;
            Map map = (Map) jVar.b();
            boolean z9 = true;
            boolean z10 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
            ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
            if (z10) {
                try {
                    l.this.f9915b.f(new d(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), d.a.HYBRID_ONLY, wrap));
                } catch (IllegalStateException e10) {
                    dVar2.b("error", l.c(e10), (Object) null);
                    return;
                }
            } else {
                if (!map.containsKey("hybridFallback") || !((Boolean) map.get("hybridFallback")).booleanValue()) {
                    z9 = false;
                }
                d.a aVar = z9 ? d.a.TEXTURE_WITH_HYBRID_FALLBACK : d.a.TEXTURE_WITH_VIRTUAL_FALLBACK;
                int intValue = ((Integer) map.get("id")).intValue();
                String str = (String) map.get("viewType");
                double d10 = 0.0d;
                double doubleValue = map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d;
                if (map.containsKey("left")) {
                    d10 = ((Double) map.get("left")).doubleValue();
                }
                long d11 = l.this.f9915b.d(new d(intValue, str, doubleValue, d10, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), aVar, wrap));
                if (d11 != -2) {
                    dVar2.a(Long.valueOf(d11));
                    return;
                } else if (!z9) {
                    throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                }
            }
            dVar2.a((Object) null);
        }

        private void d(j jVar, k.d dVar) {
            try {
                l.this.f9915b.h(((Integer) ((Map) jVar.b()).get("id")).intValue());
                dVar.a((Object) null);
            } catch (IllegalStateException e10) {
                dVar.b("error", l.c(e10), (Object) null);
            }
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void e(k.d dVar, c cVar) {
            if (cVar == null) {
                dVar.b("error", "Failed to resize the platform view", (Object) null);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("width", Double.valueOf((double) cVar.f9918a));
            hashMap.put("height", Double.valueOf((double) cVar.f9919b));
            dVar.a(hashMap);
        }

        private void f(j jVar, k.d dVar) {
            Map map = (Map) jVar.b();
            try {
                l.this.f9915b.b(((Integer) map.get("id")).intValue(), ((Double) map.get("top")).doubleValue(), ((Double) map.get("left")).doubleValue());
                dVar.a((Object) null);
            } catch (IllegalStateException e10) {
                dVar.b("error", l.c(e10), (Object) null);
            }
        }

        private void g(j jVar, k.d dVar) {
            Map map = (Map) jVar.b();
            try {
                l.this.f9915b.g(new e(((Integer) map.get("id")).intValue(), ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue()), new k(dVar));
            } catch (IllegalStateException e10) {
                dVar.b("error", l.c(e10), (Object) null);
            }
        }

        private void h(j jVar, k.d dVar) {
            Map map = (Map) jVar.b();
            try {
                l.this.f9915b.c(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
                dVar.a((Object) null);
            } catch (IllegalStateException e10) {
                dVar.b("error", l.c(e10), (Object) null);
            }
        }

        private void i(j jVar, k.d dVar) {
            try {
                l.this.f9915b.a(((Boolean) jVar.b()).booleanValue());
                dVar.a((Object) null);
            } catch (IllegalStateException e10) {
                dVar.b("error", l.c(e10), (Object) null);
            }
        }

        private void j(j jVar, k.d dVar) {
            k.d dVar2;
            k.d dVar3 = dVar;
            List list = (List) jVar.b();
            f fVar = r2;
            f fVar2 = fVar;
            f fVar3 = new f(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue());
            try {
                l.this.f9915b.i(fVar);
                dVar2 = dVar;
                try {
                    dVar2.a((Object) null);
                } catch (IllegalStateException e10) {
                    e = e10;
                }
            } catch (IllegalStateException e11) {
                e = e11;
                dVar2 = dVar;
                dVar2.b("error", l.c(e), (Object) null);
            }
        }

        public void onMethodCall(j jVar, k.d dVar) {
            if (l.this.f9915b != null) {
                x6.b.f("PlatformViewsChannel", "Received '" + jVar.f10996a + "' message.");
                String str = jVar.f10996a;
                str.hashCode();
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -1352294148:
                        if (str.equals("create")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1019779949:
                        if (str.equals("offset")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -934437708:
                        if (str.equals("resize")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case -756050293:
                        if (str.equals("clearFocus")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case -308988850:
                        if (str.equals("synchronizeToNativeViewHierarchy")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case 110550847:
                        if (str.equals("touch")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case 576796989:
                        if (str.equals("setDirection")) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case 1671767583:
                        if (str.equals("dispose")) {
                            c10 = 7;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        c(jVar, dVar);
                        return;
                    case 1:
                        f(jVar, dVar);
                        return;
                    case 2:
                        g(jVar, dVar);
                        return;
                    case 3:
                        b(jVar, dVar);
                        return;
                    case 4:
                        i(jVar, dVar);
                        return;
                    case 5:
                        j(jVar, dVar);
                        return;
                    case 6:
                        h(jVar, dVar);
                        return;
                    case 7:
                        d(jVar, dVar);
                        return;
                    default:
                        dVar.c();
                        return;
                }
            }
        }
    }

    public interface b {
        void a(c cVar);
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f9918a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9919b;

        public c(int i10, int i11) {
            this.f9918a = i10;
            this.f9919b = i11;
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f9920a;

        /* renamed from: b  reason: collision with root package name */
        public final String f9921b;

        /* renamed from: c  reason: collision with root package name */
        public final double f9922c;

        /* renamed from: d  reason: collision with root package name */
        public final double f9923d;

        /* renamed from: e  reason: collision with root package name */
        public final double f9924e;

        /* renamed from: f  reason: collision with root package name */
        public final double f9925f;

        /* renamed from: g  reason: collision with root package name */
        public final int f9926g;

        /* renamed from: h  reason: collision with root package name */
        public final a f9927h;

        /* renamed from: i  reason: collision with root package name */
        public final ByteBuffer f9928i;

        public enum a {
            TEXTURE_WITH_VIRTUAL_FALLBACK,
            TEXTURE_WITH_HYBRID_FALLBACK,
            HYBRID_ONLY
        }

        public d(int i10, String str, double d10, double d11, double d12, double d13, int i11, a aVar, ByteBuffer byteBuffer) {
            this.f9920a = i10;
            this.f9921b = str;
            this.f9924e = d10;
            this.f9925f = d11;
            this.f9922c = d12;
            this.f9923d = d13;
            this.f9926g = i11;
            this.f9927h = aVar;
            this.f9928i = byteBuffer;
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f9929a;

        /* renamed from: b  reason: collision with root package name */
        public final double f9930b;

        /* renamed from: c  reason: collision with root package name */
        public final double f9931c;

        public e(int i10, double d10, double d11) {
            this.f9929a = i10;
            this.f9930b = d10;
            this.f9931c = d11;
        }
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final int f9932a;

        /* renamed from: b  reason: collision with root package name */
        public final Number f9933b;

        /* renamed from: c  reason: collision with root package name */
        public final Number f9934c;

        /* renamed from: d  reason: collision with root package name */
        public final int f9935d;

        /* renamed from: e  reason: collision with root package name */
        public final int f9936e;

        /* renamed from: f  reason: collision with root package name */
        public final Object f9937f;

        /* renamed from: g  reason: collision with root package name */
        public final Object f9938g;

        /* renamed from: h  reason: collision with root package name */
        public final int f9939h;

        /* renamed from: i  reason: collision with root package name */
        public final int f9940i;

        /* renamed from: j  reason: collision with root package name */
        public final float f9941j;

        /* renamed from: k  reason: collision with root package name */
        public final float f9942k;

        /* renamed from: l  reason: collision with root package name */
        public final int f9943l;

        /* renamed from: m  reason: collision with root package name */
        public final int f9944m;

        /* renamed from: n  reason: collision with root package name */
        public final int f9945n;

        /* renamed from: o  reason: collision with root package name */
        public final int f9946o;

        /* renamed from: p  reason: collision with root package name */
        public final long f9947p;

        public f(int i10, Number number, Number number2, int i11, int i12, Object obj, Object obj2, int i13, int i14, float f10, float f11, int i15, int i16, int i17, int i18, long j10) {
            this.f9932a = i10;
            this.f9933b = number;
            this.f9934c = number2;
            this.f9935d = i11;
            this.f9936e = i12;
            this.f9937f = obj;
            this.f9938g = obj2;
            this.f9939h = i13;
            this.f9940i = i14;
            this.f9941j = f10;
            this.f9942k = f11;
            this.f9943l = i15;
            this.f9944m = i16;
            this.f9945n = i17;
            this.f9946o = i18;
            this.f9947p = j10;
        }
    }

    public interface g {
        void a(boolean z9);

        void b(int i10, double d10, double d11);

        void c(int i10, int i11);

        long d(d dVar);

        void e(int i10);

        void f(d dVar);

        void g(e eVar, b bVar);

        void h(int i10);

        void i(f fVar);
    }

    public l(y6.a aVar) {
        a aVar2 = new a();
        this.f9916c = aVar2;
        k kVar = new k(aVar, "flutter/platform_views", s.f11011b);
        this.f9914a = kVar;
        kVar.e(aVar2);
    }

    /* access modifiers changed from: private */
    public static String c(Exception exc) {
        return x6.b.d(exc);
    }

    public void d(int i10) {
        k kVar = this.f9914a;
        if (kVar != null) {
            kVar.c("viewFocused", Integer.valueOf(i10));
        }
    }

    public void e(g gVar) {
        this.f9915b = gVar;
    }
}
