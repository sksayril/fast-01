package p4;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import m4.b;
import m4.c;
import m4.d;
import m4.e;

final class f implements e {

    /* renamed from: f  reason: collision with root package name */
    private static final Charset f11880f = Charset.forName("UTF-8");

    /* renamed from: g  reason: collision with root package name */
    private static final c f11881g = c.a("key").b(a.b().c(1).a()).a();

    /* renamed from: h  reason: collision with root package name */
    private static final c f11882h = c.a("value").b(a.b().c(2).a()).a();

    /* renamed from: i  reason: collision with root package name */
    private static final d<Map.Entry<Object, Object>> f11883i = e.f11879a;

    /* renamed from: a  reason: collision with root package name */
    private OutputStream f11884a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, d<?>> f11885b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<Class<?>, m4.f<?>> f11886c;

    /* renamed from: d  reason: collision with root package name */
    private final d<Object> f11887d;

    /* renamed from: e  reason: collision with root package name */
    private final i f11888e = new i(this);

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11889a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                p4.d$a[] r0 = p4.d.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11889a = r0
                p4.d$a r1 = p4.d.a.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11889a     // Catch:{ NoSuchFieldError -> 0x001d }
                p4.d$a r1 = p4.d.a.SIGNED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11889a     // Catch:{ NoSuchFieldError -> 0x0028 }
                p4.d$a r1 = p4.d.a.FIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p4.f.a.<clinit>():void");
        }
    }

    f(OutputStream outputStream, Map<Class<?>, d<?>> map, Map<Class<?>, m4.f<?>> map2, d<Object> dVar) {
        this.f11884a = outputStream;
        this.f11885b = map;
        this.f11886c = map2;
        this.f11887d = dVar;
    }

    private static ByteBuffer p(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private <T> long q(d<T> dVar, T t9) {
        OutputStream outputStream;
        b bVar = new b();
        try {
            outputStream = this.f11884a;
            this.f11884a = bVar;
            dVar.a(t9, this);
            this.f11884a = outputStream;
            long a10 = bVar.a();
            bVar.close();
            return a10;
        } catch (Throwable th) {
            try {
                bVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private <T> f r(d<T> dVar, c cVar, T t9, boolean z9) {
        long q9 = q(dVar, t9);
        if (z9 && q9 == 0) {
            return this;
        }
        x((v(cVar) << 3) | 2);
        y(q9);
        dVar.a(t9, this);
        return this;
    }

    private <T> f s(m4.f<T> fVar, c cVar, T t9, boolean z9) {
        this.f11888e.b(cVar, z9);
        fVar.a(t9, this.f11888e);
        return this;
    }

    private static d u(c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new b("Field has no @Protobuf config");
    }

    private static int v(c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new b("Field has no @Protobuf config");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void w(Map.Entry entry, e eVar) {
        eVar.c(f11881g, entry.getKey());
        eVar.c(f11882h, entry.getValue());
    }

    private void x(int i10) {
        while (true) {
            int i11 = (((long) (i10 & -128)) > 0 ? 1 : (((long) (i10 & -128)) == 0 ? 0 : -1));
            OutputStream outputStream = this.f11884a;
            if (i11 != 0) {
                outputStream.write((i10 & 127) | 128);
                i10 >>>= 7;
            } else {
                outputStream.write(i10 & 127);
                return;
            }
        }
    }

    private void y(long j10) {
        while (true) {
            int i10 = ((-128 & j10) > 0 ? 1 : ((-128 & j10) == 0 ? 0 : -1));
            OutputStream outputStream = this.f11884a;
            if (i10 != 0) {
                outputStream.write((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } else {
                outputStream.write(((int) j10) & 127);
                return;
            }
        }
    }

    public e b(c cVar, double d10) {
        return e(cVar, d10, true);
    }

    public e c(c cVar, Object obj) {
        return i(cVar, obj, true);
    }

    /* access modifiers changed from: package-private */
    public e e(c cVar, double d10, boolean z9) {
        if (z9 && d10 == 0.0d) {
            return this;
        }
        x((v(cVar) << 3) | 1);
        this.f11884a.write(p(8).putDouble(d10).array());
        return this;
    }

    /* access modifiers changed from: package-private */
    public e h(c cVar, float f10, boolean z9) {
        if (z9 && f10 == 0.0f) {
            return this;
        }
        x((v(cVar) << 3) | 5);
        this.f11884a.write(p(4).putFloat(f10).array());
        return this;
    }

    /* access modifiers changed from: package-private */
    public e i(c cVar, Object obj, boolean z9) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z9 && charSequence.length() == 0) {
                return this;
            }
            x((v(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f11880f);
            x(bytes.length);
            this.f11884a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object i10 : (Collection) obj) {
                i(cVar, i10, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry r9 : ((Map) obj).entrySet()) {
                r(f11883i, cVar, r9, false);
            }
            return this;
        } else if (obj instanceof Double) {
            return e(cVar, ((Double) obj).doubleValue(), z9);
        } else {
            if (obj instanceof Float) {
                return h(cVar, ((Float) obj).floatValue(), z9);
            }
            if (obj instanceof Number) {
                return m(cVar, ((Number) obj).longValue(), z9);
            }
            if (obj instanceof Boolean) {
                return o(cVar, ((Boolean) obj).booleanValue(), z9);
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z9 && bArr.length == 0) {
                    return this;
                }
                x((v(cVar) << 3) | 2);
                x(bArr.length);
                this.f11884a.write(bArr);
                return this;
            }
            d dVar = this.f11885b.get(obj.getClass());
            if (dVar != null) {
                return r(dVar, cVar, obj, z9);
            }
            m4.f fVar = this.f11886c.get(obj.getClass());
            return fVar != null ? s(fVar, cVar, obj, z9) : obj instanceof c ? a(cVar, ((c) obj).getNumber()) : obj instanceof Enum ? a(cVar, ((Enum) obj).ordinal()) : r(this.f11887d, cVar, obj, z9);
        }
    }

    /* renamed from: j */
    public f a(c cVar, int i10) {
        return k(cVar, i10, true);
    }

    /* access modifiers changed from: package-private */
    public f k(c cVar, int i10, boolean z9) {
        if (z9 && i10 == 0) {
            return this;
        }
        d u9 = u(cVar);
        int i11 = a.f11889a[u9.intEncoding().ordinal()];
        if (i11 == 1) {
            x(u9.tag() << 3);
            x(i10);
        } else if (i11 == 2) {
            x(u9.tag() << 3);
            x((i10 << 1) ^ (i10 >> 31));
        } else if (i11 == 3) {
            x((u9.tag() << 3) | 5);
            this.f11884a.write(p(4).putInt(i10).array());
        }
        return this;
    }

    /* renamed from: l */
    public f f(c cVar, long j10) {
        return m(cVar, j10, true);
    }

    /* access modifiers changed from: package-private */
    public f m(c cVar, long j10, boolean z9) {
        if (z9 && j10 == 0) {
            return this;
        }
        d u9 = u(cVar);
        int i10 = a.f11889a[u9.intEncoding().ordinal()];
        if (i10 == 1) {
            x(u9.tag() << 3);
            y(j10);
        } else if (i10 == 2) {
            x(u9.tag() << 3);
            y((j10 >> 63) ^ (j10 << 1));
        } else if (i10 == 3) {
            x((u9.tag() << 3) | 1);
            this.f11884a.write(p(8).putLong(j10).array());
        }
        return this;
    }

    /* renamed from: n */
    public f g(c cVar, boolean z9) {
        return o(cVar, z9, true);
    }

    /* access modifiers changed from: package-private */
    public f o(c cVar, boolean z9, boolean z10) {
        return k(cVar, z9 ? 1 : 0, z10);
    }

    /* access modifiers changed from: package-private */
    public f t(Object obj) {
        if (obj == null) {
            return this;
        }
        d dVar = this.f11885b.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, this);
            return this;
        }
        throw new b("No encoder for " + obj.getClass());
    }
}
