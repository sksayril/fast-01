package io.flutter.plugins.imagepicker;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import k7.r;

public class p {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f10581a;

        /* renamed from: b  reason: collision with root package name */
        private String f10582b;

        /* renamed from: io.flutter.plugins.imagepicker.p$a$a  reason: collision with other inner class name */
        public static final class C0158a {

            /* renamed from: a  reason: collision with root package name */
            private String f10583a;

            /* renamed from: b  reason: collision with root package name */
            private String f10584b;

            public a a() {
                a aVar = new a();
                aVar.b(this.f10583a);
                aVar.c(this.f10584b);
                return aVar;
            }

            public C0158a b(String str) {
                this.f10583a = str;
                return this;
            }

            public C0158a c(String str) {
                this.f10584b = str;
                return this;
            }
        }

        a() {
        }

        static a a(ArrayList<Object> arrayList) {
            a aVar = new a();
            aVar.b((String) arrayList.get(0));
            aVar.c((String) arrayList.get(1));
            return aVar;
        }

        public void b(String str) {
            if (str != null) {
                this.f10581a = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"code\" is null.");
        }

        public void c(String str) {
            this.f10582b = str;
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> d() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.f10581a);
            arrayList.add(this.f10582b);
            return arrayList;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private c f10585a;

        /* renamed from: b  reason: collision with root package name */
        private a f10586b;

        /* renamed from: c  reason: collision with root package name */
        private List<String> f10587c;

        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private c f10588a;

            /* renamed from: b  reason: collision with root package name */
            private a f10589b;

            /* renamed from: c  reason: collision with root package name */
            private List<String> f10590c;

            public b a() {
                b bVar = new b();
                bVar.d(this.f10588a);
                bVar.b(this.f10589b);
                bVar.c(this.f10590c);
                return bVar;
            }

            public a b(a aVar) {
                this.f10589b = aVar;
                return this;
            }

            public a c(List<String> list) {
                this.f10590c = list;
                return this;
            }

            public a d(c cVar) {
                this.f10588a = cVar;
                return this;
            }
        }

        b() {
        }

        static b a(ArrayList<Object> arrayList) {
            b bVar = new b();
            Object obj = arrayList.get(0);
            a aVar = null;
            bVar.d(obj == null ? null : c.values()[((Integer) obj).intValue()]);
            Object obj2 = arrayList.get(1);
            if (obj2 != null) {
                aVar = a.a((ArrayList) obj2);
            }
            bVar.b(aVar);
            bVar.c((List) arrayList.get(2));
            return bVar;
        }

        public void b(a aVar) {
            this.f10586b = aVar;
        }

        public void c(List<String> list) {
            if (list != null) {
                this.f10587c = list;
                return;
            }
            throw new IllegalStateException("Nonnull field \"paths\" is null.");
        }

        public void d(c cVar) {
            if (cVar != null) {
                this.f10585a = cVar;
                return;
            }
            throw new IllegalStateException("Nonnull field \"type\" is null.");
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> e() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            c cVar = this.f10585a;
            ArrayList<Object> arrayList2 = null;
            arrayList.add(cVar == null ? null : Integer.valueOf(cVar.index));
            a aVar = this.f10586b;
            if (aVar != null) {
                arrayList2 = aVar.d();
            }
            arrayList.add(arrayList2);
            arrayList.add(this.f10587c);
            return arrayList;
        }
    }

    public enum c {
        IMAGE(0),
        VIDEO(1);
        
        final int index;

        private c(int i10) {
            this.index = i10;
        }
    }

    public static class d extends RuntimeException {

        /* renamed from: m  reason: collision with root package name */
        public final String f10591m;

        /* renamed from: n  reason: collision with root package name */
        public final Object f10592n;

        public d(String str, String str2, Object obj) {
            super(str2);
            this.f10591m = str;
            this.f10592n = obj;
        }
    }

    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        private Boolean f10593a;

        /* renamed from: b  reason: collision with root package name */
        private Boolean f10594b;

        e() {
        }

        static e a(ArrayList<Object> arrayList) {
            e eVar = new e();
            eVar.d((Boolean) arrayList.get(0));
            eVar.e((Boolean) arrayList.get(1));
            return eVar;
        }

        public Boolean b() {
            return this.f10593a;
        }

        public Boolean c() {
            return this.f10594b;
        }

        public void d(Boolean bool) {
            if (bool != null) {
                this.f10593a = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"allowMultiple\" is null.");
        }

        public void e(Boolean bool) {
            if (bool != null) {
                this.f10594b = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"usePhotoPicker\" is null.");
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> f() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.f10593a);
            arrayList.add(this.f10594b);
            return arrayList;
        }
    }

    public interface f {
        void a(i iVar, e eVar, j<List<String>> jVar);

        void b(l lVar, h hVar, e eVar, j<List<String>> jVar);

        void c(l lVar, n nVar, e eVar, j<List<String>> jVar);

        b d();
    }

    private static class g extends r {

        /* renamed from: d  reason: collision with root package name */
        public static final g f10595d = new g();

        private g() {
        }

        /* access modifiers changed from: protected */
        public Object g(byte b10, ByteBuffer byteBuffer) {
            switch (b10) {
                case Byte.MIN_VALUE:
                    return a.a((ArrayList) f(byteBuffer));
                case -127:
                    return b.a((ArrayList) f(byteBuffer));
                case -126:
                    return e.a((ArrayList) f(byteBuffer));
                case -125:
                    return h.a((ArrayList) f(byteBuffer));
                case -124:
                    return i.a((ArrayList) f(byteBuffer));
                case -123:
                    return l.a((ArrayList) f(byteBuffer));
                case -122:
                    return n.a((ArrayList) f(byteBuffer));
                default:
                    return super.g(b10, byteBuffer);
            }
        }

        /* access modifiers changed from: protected */
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            ArrayList<Object> f10;
            if (obj instanceof a) {
                byteArrayOutputStream.write(128);
                f10 = ((a) obj).d();
            } else if (obj instanceof b) {
                byteArrayOutputStream.write(129);
                f10 = ((b) obj).e();
            } else if (obj instanceof e) {
                byteArrayOutputStream.write(130);
                f10 = ((e) obj).f();
            } else if (obj instanceof h) {
                byteArrayOutputStream.write(131);
                f10 = ((h) obj).h();
            } else if (obj instanceof i) {
                byteArrayOutputStream.write(132);
                f10 = ((i) obj).d();
            } else if (obj instanceof l) {
                byteArrayOutputStream.write(133);
                f10 = ((l) obj).f();
            } else if (obj instanceof n) {
                byteArrayOutputStream.write(134);
                p(byteArrayOutputStream, ((n) obj).d());
                return;
            } else {
                super.p(byteArrayOutputStream, obj);
                return;
            }
            p(byteArrayOutputStream, f10);
        }
    }

    public static final class h {

        /* renamed from: a  reason: collision with root package name */
        private Double f10596a;

        /* renamed from: b  reason: collision with root package name */
        private Double f10597b;

        /* renamed from: c  reason: collision with root package name */
        private Long f10598c;

        h() {
        }

        static h a(ArrayList<Object> arrayList) {
            Long l10;
            h hVar = new h();
            hVar.f((Double) arrayList.get(0));
            hVar.e((Double) arrayList.get(1));
            Object obj = arrayList.get(2);
            if (obj == null) {
                l10 = null;
            } else {
                l10 = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            hVar.g(l10);
            return hVar;
        }

        public Double b() {
            return this.f10597b;
        }

        public Double c() {
            return this.f10596a;
        }

        public Long d() {
            return this.f10598c;
        }

        public void e(Double d10) {
            this.f10597b = d10;
        }

        public void f(Double d10) {
            this.f10596a = d10;
        }

        public void g(Long l10) {
            if (l10 != null) {
                this.f10598c = l10;
                return;
            }
            throw new IllegalStateException("Nonnull field \"quality\" is null.");
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> h() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.f10596a);
            arrayList.add(this.f10597b);
            arrayList.add(this.f10598c);
            return arrayList;
        }
    }

    public static final class i {

        /* renamed from: a  reason: collision with root package name */
        private h f10599a;

        i() {
        }

        static i a(ArrayList<Object> arrayList) {
            i iVar = new i();
            Object obj = arrayList.get(0);
            iVar.c(obj == null ? null : h.a((ArrayList) obj));
            return iVar;
        }

        public h b() {
            return this.f10599a;
        }

        public void c(h hVar) {
            if (hVar != null) {
                this.f10599a = hVar;
                return;
            }
            throw new IllegalStateException("Nonnull field \"imageSelectionOptions\" is null.");
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> d() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            h hVar = this.f10599a;
            arrayList.add(hVar == null ? null : hVar.h());
            return arrayList;
        }
    }

    public interface j<T> {
        void a(T t9);

        void b(Throwable th);
    }

    public enum k {
        REAR(0),
        FRONT(1);
        
        final int index;

        private k(int i10) {
            this.index = i10;
        }
    }

    public static final class l {

        /* renamed from: a  reason: collision with root package name */
        private m f10600a;

        /* renamed from: b  reason: collision with root package name */
        private k f10601b;

        l() {
        }

        static l a(ArrayList<Object> arrayList) {
            l lVar = new l();
            Object obj = arrayList.get(0);
            k kVar = null;
            lVar.e(obj == null ? null : m.values()[((Integer) obj).intValue()]);
            Object obj2 = arrayList.get(1);
            if (obj2 != null) {
                kVar = k.values()[((Integer) obj2).intValue()];
            }
            lVar.d(kVar);
            return lVar;
        }

        public k b() {
            return this.f10601b;
        }

        public m c() {
            return this.f10600a;
        }

        public void d(k kVar) {
            this.f10601b = kVar;
        }

        public void e(m mVar) {
            if (mVar != null) {
                this.f10600a = mVar;
                return;
            }
            throw new IllegalStateException("Nonnull field \"type\" is null.");
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> f() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            m mVar = this.f10600a;
            Integer num = null;
            arrayList.add(mVar == null ? null : Integer.valueOf(mVar.index));
            k kVar = this.f10601b;
            if (kVar != null) {
                num = Integer.valueOf(kVar.index);
            }
            arrayList.add(num);
            return arrayList;
        }
    }

    public enum m {
        CAMERA(0),
        GALLERY(1);
        
        final int index;

        private m(int i10) {
            this.index = i10;
        }
    }

    public static final class n {

        /* renamed from: a  reason: collision with root package name */
        private Long f10602a;

        static n a(ArrayList<Object> arrayList) {
            Long l10;
            n nVar = new n();
            Object obj = arrayList.get(0);
            if (obj == null) {
                l10 = null;
            } else {
                l10 = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            nVar.c(l10);
            return nVar;
        }

        public Long b() {
            return this.f10602a;
        }

        public void c(Long l10) {
            this.f10602a = l10;
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> d() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.f10602a);
            return arrayList;
        }
    }

    protected static ArrayList<Object> a(Throwable th) {
        Object obj;
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof d) {
            d dVar = (d) th;
            arrayList.add(dVar.f10591m);
            arrayList.add(dVar.getMessage());
            obj = dVar.f10592n;
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            obj = "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th);
        }
        arrayList.add(obj);
        return arrayList;
    }
}
