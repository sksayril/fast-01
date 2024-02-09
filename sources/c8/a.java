package c8;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import k7.r;

public class a {

    /* renamed from: c8.a$a  reason: collision with other inner class name */
    public static class C0083a extends RuntimeException {

        /* renamed from: m  reason: collision with root package name */
        public final String f3866m;

        /* renamed from: n  reason: collision with root package name */
        public final Object f3867n;

        public C0083a(String str, String str2, Object obj) {
            super(str2);
            this.f3866m = str;
            this.f3867n = obj;
        }
    }

    public interface b {
        Boolean a(String str);

        void b();

        Boolean c(String str, Map<String, String> map);

        Boolean d(String str, d dVar);
    }

    private static class c extends r {

        /* renamed from: d  reason: collision with root package name */
        public static final c f3868d = new c();

        private c() {
        }

        /* access modifiers changed from: protected */
        public Object g(byte b10, ByteBuffer byteBuffer) {
            return b10 != Byte.MIN_VALUE ? super.g(b10, byteBuffer) : d.a((ArrayList) f(byteBuffer));
        }

        /* access modifiers changed from: protected */
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof d) {
                byteArrayOutputStream.write(128);
                p(byteArrayOutputStream, ((d) obj).h());
                return;
            }
            super.p(byteArrayOutputStream, obj);
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private Boolean f3869a;

        /* renamed from: b  reason: collision with root package name */
        private Boolean f3870b;

        /* renamed from: c  reason: collision with root package name */
        private Map<String, String> f3871c;

        d() {
        }

        static d a(ArrayList<Object> arrayList) {
            d dVar = new d();
            dVar.f((Boolean) arrayList.get(0));
            dVar.e((Boolean) arrayList.get(1));
            dVar.g((Map) arrayList.get(2));
            return dVar;
        }

        public Boolean b() {
            return this.f3870b;
        }

        public Boolean c() {
            return this.f3869a;
        }

        public Map<String, String> d() {
            return this.f3871c;
        }

        public void e(Boolean bool) {
            if (bool != null) {
                this.f3870b = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
        }

        public void f(Boolean bool) {
            if (bool != null) {
                this.f3869a = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
        }

        public void g(Map<String, String> map) {
            if (map != null) {
                this.f3871c = map;
                return;
            }
            throw new IllegalStateException("Nonnull field \"headers\" is null.");
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> h() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.f3869a);
            arrayList.add(this.f3870b);
            arrayList.add(this.f3871c);
            return arrayList;
        }
    }

    protected static ArrayList<Object> a(Throwable th) {
        Object obj;
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof C0083a) {
            C0083a aVar = (C0083a) th;
            arrayList.add(aVar.f3866m);
            arrayList.add(aVar.getMessage());
            obj = aVar.f3867n;
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            obj = "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th);
        }
        arrayList.add(obj);
        return arrayList;
    }
}
