package o4;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import m4.b;
import m4.c;
import m4.d;
import m4.f;
import m4.g;

final class e implements m4.e, g {

    /* renamed from: a  reason: collision with root package name */
    private e f11606a = null;

    /* renamed from: b  reason: collision with root package name */
    private boolean f11607b = true;

    /* renamed from: c  reason: collision with root package name */
    private final JsonWriter f11608c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<?>, d<?>> f11609d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<Class<?>, f<?>> f11610e;

    /* renamed from: f  reason: collision with root package name */
    private final d<Object> f11611f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f11612g;

    e(Writer writer, Map<Class<?>, d<?>> map, Map<Class<?>, f<?>> map2, d<Object> dVar, boolean z9) {
        this.f11608c = new JsonWriter(writer);
        this.f11609d = map;
        this.f11610e = map2;
        this.f11611f = dVar;
        this.f11612g = z9;
    }

    private boolean t(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e w(String str, Object obj) {
        y();
        this.f11608c.name(str);
        if (obj != null) {
            return k(obj, false);
        }
        this.f11608c.nullValue();
        return this;
    }

    private e x(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        y();
        this.f11608c.name(str);
        return k(obj, false);
    }

    private void y() {
        if (this.f11607b) {
            e eVar = this.f11606a;
            if (eVar != null) {
                eVar.y();
                this.f11606a.f11607b = false;
                this.f11606a = null;
                this.f11608c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    public m4.e a(c cVar, int i10) {
        return n(cVar.b(), i10);
    }

    public m4.e b(c cVar, double d10) {
        return m(cVar.b(), d10);
    }

    public m4.e c(c cVar, Object obj) {
        return p(cVar.b(), obj);
    }

    public m4.e f(c cVar, long j10) {
        return o(cVar.b(), j10);
    }

    public m4.e g(c cVar, boolean z9) {
        return q(cVar.b(), z9);
    }

    public e h(double d10) {
        y();
        this.f11608c.value(d10);
        return this;
    }

    public e i(int i10) {
        y();
        this.f11608c.value((long) i10);
        return this;
    }

    public e j(long j10) {
        y();
        this.f11608c.value(j10);
        return this;
    }

    /* access modifiers changed from: package-private */
    public e k(Object obj, boolean z9) {
        int i10 = 0;
        if (z9 && t(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new b(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.f11608c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f11608c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return s((byte[]) obj);
            }
            this.f11608c.beginArray();
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i10 < length) {
                    this.f11608c.value((long) iArr[i10]);
                    i10++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i10 < length2) {
                    j(jArr[i10]);
                    i10++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i10 < length3) {
                    this.f11608c.value(dArr[i10]);
                    i10++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i10 < length4) {
                    this.f11608c.value(zArr[i10]);
                    i10++;
                }
            } else if (obj instanceof Number[]) {
                for (Number k10 : (Number[]) obj) {
                    k(k10, false);
                }
            } else {
                for (Object k11 : (Object[]) obj) {
                    k(k11, false);
                }
            }
            this.f11608c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f11608c.beginArray();
            for (Object k12 : (Collection) obj) {
                k(k12, false);
            }
            this.f11608c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f11608c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    p((String) key, entry.getValue());
                } catch (ClassCastException e10) {
                    throw new b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e10);
                }
            }
            this.f11608c.endObject();
            return this;
        } else {
            d dVar = this.f11609d.get(obj.getClass());
            if (dVar != null) {
                return v(dVar, obj, z9);
            }
            f fVar = this.f11610e.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            } else if (!(obj instanceof Enum)) {
                return v(this.f11611f, obj, z9);
            } else {
                if (obj instanceof f) {
                    i(((f) obj).getNumber());
                } else {
                    d(((Enum) obj).name());
                }
                return this;
            }
        }
    }

    /* renamed from: l */
    public e d(String str) {
        y();
        this.f11608c.value(str);
        return this;
    }

    public e m(String str, double d10) {
        y();
        this.f11608c.name(str);
        return h(d10);
    }

    public e n(String str, int i10) {
        y();
        this.f11608c.name(str);
        return i(i10);
    }

    public e o(String str, long j10) {
        y();
        this.f11608c.name(str);
        return j(j10);
    }

    public e p(String str, Object obj) {
        return this.f11612g ? x(str, obj) : w(str, obj);
    }

    public e q(String str, boolean z9) {
        y();
        this.f11608c.name(str);
        return e(z9);
    }

    /* renamed from: r */
    public e e(boolean z9) {
        y();
        this.f11608c.value(z9);
        return this;
    }

    public e s(byte[] bArr) {
        y();
        if (bArr == null) {
            this.f11608c.nullValue();
        } else {
            this.f11608c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public void u() {
        y();
        this.f11608c.flush();
    }

    /* access modifiers changed from: package-private */
    public e v(d<Object> dVar, Object obj, boolean z9) {
        if (!z9) {
            this.f11608c.beginObject();
        }
        dVar.a(obj, this);
        if (!z9) {
            this.f11608c.endObject();
        }
        return this;
    }
}
