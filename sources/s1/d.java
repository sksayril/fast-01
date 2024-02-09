package s1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class d {

    /* renamed from: c  reason: collision with root package name */
    private static final d f12152c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final String f12153a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f12154b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f12155a = "";

        /* renamed from: b  reason: collision with root package name */
        private List<c> f12156b = new ArrayList();

        a() {
        }

        public d a() {
            return new d(this.f12155a, Collections.unmodifiableList(this.f12156b));
        }

        public a b(List<c> list) {
            this.f12156b = list;
            return this;
        }

        public a c(String str) {
            this.f12155a = str;
            return this;
        }
    }

    d(String str, List<c> list) {
        this.f12153a = str;
        this.f12154b = list;
    }

    public static a c() {
        return new a();
    }

    @p4.d(tag = 2)
    public List<c> a() {
        return this.f12154b;
    }

    @p4.d(tag = 1)
    public String b() {
        return this.f12153a;
    }
}
