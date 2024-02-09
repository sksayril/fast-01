package io.flutter.plugins.firebase.core;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k7.r;

public class p {

    public interface a {
        void d(String str, Boolean bool, g<Void> gVar);

        void e(String str, Boolean bool, g<Void> gVar);

        void f(String str, g<Void> gVar);
    }

    public interface b {
        void a(String str, e eVar, g<f> gVar);

        void b(g<List<f>> gVar);

        void c(g<e> gVar);
    }

    private static class c extends r {

        /* renamed from: d  reason: collision with root package name */
        public static final c f10341d = new c();

        private c() {
        }

        /* access modifiers changed from: protected */
        public Object g(byte b10, ByteBuffer byteBuffer) {
            return b10 != Byte.MIN_VALUE ? b10 != -127 ? super.g(b10, byteBuffer) : f.a((ArrayList) f(byteBuffer)) : e.a((ArrayList) f(byteBuffer));
        }

        /* access modifiers changed from: protected */
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            ArrayList<Object> f10;
            if (obj instanceof e) {
                byteArrayOutputStream.write(128);
                f10 = ((e) obj).x();
            } else if (obj instanceof f) {
                byteArrayOutputStream.write(129);
                f10 = ((f) obj).f();
            } else {
                super.p(byteArrayOutputStream, obj);
                return;
            }
            p(byteArrayOutputStream, f10);
        }
    }

    public static class d extends RuntimeException {

        /* renamed from: m  reason: collision with root package name */
        public final String f10342m;

        /* renamed from: n  reason: collision with root package name */
        public final Object f10343n;
    }

    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        private String f10344a;

        /* renamed from: b  reason: collision with root package name */
        private String f10345b;

        /* renamed from: c  reason: collision with root package name */
        private String f10346c;

        /* renamed from: d  reason: collision with root package name */
        private String f10347d;

        /* renamed from: e  reason: collision with root package name */
        private String f10348e;

        /* renamed from: f  reason: collision with root package name */
        private String f10349f;

        /* renamed from: g  reason: collision with root package name */
        private String f10350g;

        /* renamed from: h  reason: collision with root package name */
        private String f10351h;

        /* renamed from: i  reason: collision with root package name */
        private String f10352i;

        /* renamed from: j  reason: collision with root package name */
        private String f10353j;

        /* renamed from: k  reason: collision with root package name */
        private String f10354k;

        /* renamed from: l  reason: collision with root package name */
        private String f10355l;

        /* renamed from: m  reason: collision with root package name */
        private String f10356m;

        /* renamed from: n  reason: collision with root package name */
        private String f10357n;

        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private String f10358a;

            /* renamed from: b  reason: collision with root package name */
            private String f10359b;

            /* renamed from: c  reason: collision with root package name */
            private String f10360c;

            /* renamed from: d  reason: collision with root package name */
            private String f10361d;

            /* renamed from: e  reason: collision with root package name */
            private String f10362e;

            /* renamed from: f  reason: collision with root package name */
            private String f10363f;

            /* renamed from: g  reason: collision with root package name */
            private String f10364g;

            /* renamed from: h  reason: collision with root package name */
            private String f10365h;

            /* renamed from: i  reason: collision with root package name */
            private String f10366i;

            /* renamed from: j  reason: collision with root package name */
            private String f10367j;

            /* renamed from: k  reason: collision with root package name */
            private String f10368k;

            /* renamed from: l  reason: collision with root package name */
            private String f10369l;

            /* renamed from: m  reason: collision with root package name */
            private String f10370m;

            /* renamed from: n  reason: collision with root package name */
            private String f10371n;

            public e a() {
                e eVar = new e();
                eVar.k(this.f10358a);
                eVar.m(this.f10359b);
                eVar.t(this.f10360c);
                eVar.u(this.f10361d);
                eVar.n(this.f10362e);
                eVar.o(this.f10363f);
                eVar.v(this.f10364g);
                eVar.s(this.f10365h);
                eVar.w(this.f10366i);
                eVar.p(this.f10367j);
                eVar.j(this.f10368k);
                eVar.r(this.f10369l);
                eVar.q(this.f10370m);
                eVar.l(this.f10371n);
                return eVar;
            }

            public a b(String str) {
                this.f10358a = str;
                return this;
            }

            public a c(String str) {
                this.f10359b = str;
                return this;
            }

            public a d(String str) {
                this.f10363f = str;
                return this;
            }

            public a e(String str) {
                this.f10360c = str;
                return this;
            }

            public a f(String str) {
                this.f10361d = str;
                return this;
            }

            public a g(String str) {
                this.f10364g = str;
                return this;
            }

            public a h(String str) {
                this.f10366i = str;
                return this;
            }
        }

        e() {
        }

        static e a(ArrayList<Object> arrayList) {
            e eVar = new e();
            eVar.k((String) arrayList.get(0));
            eVar.m((String) arrayList.get(1));
            eVar.t((String) arrayList.get(2));
            eVar.u((String) arrayList.get(3));
            eVar.n((String) arrayList.get(4));
            eVar.o((String) arrayList.get(5));
            eVar.v((String) arrayList.get(6));
            eVar.s((String) arrayList.get(7));
            eVar.w((String) arrayList.get(8));
            eVar.p((String) arrayList.get(9));
            eVar.j((String) arrayList.get(10));
            eVar.r((String) arrayList.get(11));
            eVar.q((String) arrayList.get(12));
            eVar.l((String) arrayList.get(13));
            return eVar;
        }

        public String b() {
            return this.f10344a;
        }

        public String c() {
            return this.f10345b;
        }

        public String d() {
            return this.f10348e;
        }

        public String e() {
            return this.f10349f;
        }

        public String f() {
            return this.f10346c;
        }

        public String g() {
            return this.f10347d;
        }

        public String h() {
            return this.f10350g;
        }

        public String i() {
            return this.f10352i;
        }

        public void j(String str) {
            this.f10354k = str;
        }

        public void k(String str) {
            if (str != null) {
                this.f10344a = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
        }

        public void l(String str) {
            this.f10357n = str;
        }

        public void m(String str) {
            if (str != null) {
                this.f10345b = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"appId\" is null.");
        }

        public void n(String str) {
            this.f10348e = str;
        }

        public void o(String str) {
            this.f10349f = str;
        }

        public void p(String str) {
            this.f10353j = str;
        }

        public void q(String str) {
            this.f10356m = str;
        }

        public void r(String str) {
            this.f10355l = str;
        }

        public void s(String str) {
            this.f10351h = str;
        }

        public void t(String str) {
            if (str != null) {
                this.f10346c = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
        }

        public void u(String str) {
            if (str != null) {
                this.f10347d = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"projectId\" is null.");
        }

        public void v(String str) {
            this.f10350g = str;
        }

        public void w(String str) {
            this.f10352i = str;
        }

        public ArrayList<Object> x() {
            ArrayList<Object> arrayList = new ArrayList<>(14);
            arrayList.add(this.f10344a);
            arrayList.add(this.f10345b);
            arrayList.add(this.f10346c);
            arrayList.add(this.f10347d);
            arrayList.add(this.f10348e);
            arrayList.add(this.f10349f);
            arrayList.add(this.f10350g);
            arrayList.add(this.f10351h);
            arrayList.add(this.f10352i);
            arrayList.add(this.f10353j);
            arrayList.add(this.f10354k);
            arrayList.add(this.f10355l);
            arrayList.add(this.f10356m);
            arrayList.add(this.f10357n);
            return arrayList;
        }
    }

    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        private String f10372a;

        /* renamed from: b  reason: collision with root package name */
        private e f10373b;

        /* renamed from: c  reason: collision with root package name */
        private Boolean f10374c;

        /* renamed from: d  reason: collision with root package name */
        private Map<String, Object> f10375d;

        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private String f10376a;

            /* renamed from: b  reason: collision with root package name */
            private e f10377b;

            /* renamed from: c  reason: collision with root package name */
            private Boolean f10378c;

            /* renamed from: d  reason: collision with root package name */
            private Map<String, Object> f10379d;

            public f a() {
                f fVar = new f();
                fVar.c(this.f10376a);
                fVar.d(this.f10377b);
                fVar.b(this.f10378c);
                fVar.e(this.f10379d);
                return fVar;
            }

            public a b(Boolean bool) {
                this.f10378c = bool;
                return this;
            }

            public a c(String str) {
                this.f10376a = str;
                return this;
            }

            public a d(e eVar) {
                this.f10377b = eVar;
                return this;
            }

            public a e(Map<String, Object> map) {
                this.f10379d = map;
                return this;
            }
        }

        f() {
        }

        static f a(ArrayList<Object> arrayList) {
            f fVar = new f();
            fVar.c((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            fVar.d(obj == null ? null : e.a((ArrayList) obj));
            fVar.b((Boolean) arrayList.get(2));
            fVar.e((Map) arrayList.get(3));
            return fVar;
        }

        public void b(Boolean bool) {
            this.f10374c = bool;
        }

        public void c(String str) {
            if (str != null) {
                this.f10372a = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"name\" is null.");
        }

        public void d(e eVar) {
            if (eVar != null) {
                this.f10373b = eVar;
                return;
            }
            throw new IllegalStateException("Nonnull field \"options\" is null.");
        }

        public void e(Map<String, Object> map) {
            if (map != null) {
                this.f10375d = map;
                return;
            }
            throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
        }

        public ArrayList<Object> f() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            arrayList.add(this.f10372a);
            e eVar = this.f10373b;
            arrayList.add(eVar == null ? null : eVar.x());
            arrayList.add(this.f10374c);
            arrayList.add(this.f10375d);
            return arrayList;
        }
    }

    public interface g<T> {
        void a(T t9);

        void b(Throwable th);
    }

    protected static ArrayList<Object> a(Throwable th) {
        Object obj;
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof d) {
            d dVar = (d) th;
            arrayList.add(dVar.f10342m);
            arrayList.add(dVar.getMessage());
            obj = dVar.f10343n;
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            obj = "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th);
        }
        arrayList.add(obj);
        return arrayList;
    }
}
