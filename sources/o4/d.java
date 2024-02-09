package o4;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import m4.e;
import m4.f;
import m4.g;

public final class d implements n4.b<d> {

    /* renamed from: e  reason: collision with root package name */
    private static final m4.d<Object> f11596e = a.f11593a;

    /* renamed from: f  reason: collision with root package name */
    private static final f<String> f11597f = c.f11595a;

    /* renamed from: g  reason: collision with root package name */
    private static final f<Boolean> f11598g = b.f11594a;

    /* renamed from: h  reason: collision with root package name */
    private static final b f11599h = new b((a) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, m4.d<?>> f11600a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, f<?>> f11601b = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public m4.d<Object> f11602c = f11596e;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f11603d = false;

    class a implements m4.a {
        a() {
        }

        public String a(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                b(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }

        public void b(Object obj, Writer writer) {
            e eVar = new e(writer, d.this.f11600a, d.this.f11601b, d.this.f11602c, d.this.f11603d);
            eVar.k(obj, false);
            eVar.u();
        }
    }

    private static final class b implements f<Date> {

        /* renamed from: a  reason: collision with root package name */
        private static final DateFormat f11605a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f11605a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: b */
        public void a(Date date, g gVar) {
            gVar.d(f11605a.format(date));
        }
    }

    public d() {
        p(String.class, f11597f);
        p(Boolean.class, f11598g);
        p(Date.class, f11599h);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void l(Object obj, e eVar) {
        throw new m4.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public m4.a i() {
        return new a();
    }

    public d j(n4.a aVar) {
        aVar.a(this);
        return this;
    }

    public d k(boolean z9) {
        this.f11603d = z9;
        return this;
    }

    /* renamed from: o */
    public <T> d a(Class<T> cls, m4.d<? super T> dVar) {
        this.f11600a.put(cls, dVar);
        this.f11601b.remove(cls);
        return this;
    }

    public <T> d p(Class<T> cls, f<? super T> fVar) {
        this.f11601b.put(cls, fVar);
        this.f11600a.remove(cls);
        return this;
    }
}
