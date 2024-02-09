package p4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import m4.d;
import m4.e;
import m4.f;
import n4.b;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, d<?>> f11891a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, f<?>> f11892b;

    /* renamed from: c  reason: collision with root package name */
    private final d<Object> f11893c;

    public static final class a implements b<a> {

        /* renamed from: d  reason: collision with root package name */
        private static final d<Object> f11894d = g.f11890a;

        /* renamed from: a  reason: collision with root package name */
        private final Map<Class<?>, d<?>> f11895a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        private final Map<Class<?>, f<?>> f11896b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        private d<Object> f11897c = f11894d;

        /* access modifiers changed from: private */
        public static /* synthetic */ void e(Object obj, e eVar) {
            throw new m4.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.f11895a), new HashMap(this.f11896b), this.f11897c);
        }

        public a d(n4.a aVar) {
            aVar.a(this);
            return this;
        }

        /* renamed from: f */
        public <U> a a(Class<U> cls, d<? super U> dVar) {
            this.f11895a.put(cls, dVar);
            this.f11896b.remove(cls);
            return this;
        }
    }

    h(Map<Class<?>, d<?>> map, Map<Class<?>, f<?>> map2, d<Object> dVar) {
        this.f11891a = map;
        this.f11892b = map2;
        this.f11893c = dVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new f(outputStream, this.f11891a, this.f11892b, this.f11893c).t(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
