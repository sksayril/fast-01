package s1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p1.m;
import p4.d;

public final class a {

    /* renamed from: e  reason: collision with root package name */
    private static final a f12135e = new C0208a().b();

    /* renamed from: a  reason: collision with root package name */
    private final f f12136a;

    /* renamed from: b  reason: collision with root package name */
    private final List<d> f12137b;

    /* renamed from: c  reason: collision with root package name */
    private final b f12138c;

    /* renamed from: d  reason: collision with root package name */
    private final String f12139d;

    /* renamed from: s1.a$a  reason: collision with other inner class name */
    public static final class C0208a {

        /* renamed from: a  reason: collision with root package name */
        private f f12140a = null;

        /* renamed from: b  reason: collision with root package name */
        private List<d> f12141b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private b f12142c = null;

        /* renamed from: d  reason: collision with root package name */
        private String f12143d = "";

        C0208a() {
        }

        public C0208a a(d dVar) {
            this.f12141b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f12140a, Collections.unmodifiableList(this.f12141b), this.f12142c, this.f12143d);
        }

        public C0208a c(String str) {
            this.f12143d = str;
            return this;
        }

        public C0208a d(b bVar) {
            this.f12142c = bVar;
            return this;
        }

        public C0208a e(f fVar) {
            this.f12140a = fVar;
            return this;
        }
    }

    a(f fVar, List<d> list, b bVar, String str) {
        this.f12136a = fVar;
        this.f12137b = list;
        this.f12138c = bVar;
        this.f12139d = str;
    }

    public static C0208a e() {
        return new C0208a();
    }

    @d(tag = 4)
    public String a() {
        return this.f12139d;
    }

    @d(tag = 3)
    public b b() {
        return this.f12138c;
    }

    @d(tag = 2)
    public List<d> c() {
        return this.f12137b;
    }

    @d(tag = 1)
    public f d() {
        return this.f12136a;
    }

    public byte[] f() {
        return m.a(this);
    }
}
