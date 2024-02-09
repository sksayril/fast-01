package d4;

import d4.f0;
import java.util.List;
import java.util.Objects;

final class f extends f0.d {

    /* renamed from: a  reason: collision with root package name */
    private final List<f0.d.b> f7998a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7999b;

    static final class b extends f0.d.a {

        /* renamed from: a  reason: collision with root package name */
        private List<f0.d.b> f8000a;

        /* renamed from: b  reason: collision with root package name */
        private String f8001b;

        b() {
        }

        public f0.d a() {
            String str = "";
            if (this.f8000a == null) {
                str = str + " files";
            }
            if (str.isEmpty()) {
                return new f(this.f8000a, this.f8001b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f0.d.a b(List<f0.d.b> list) {
            Objects.requireNonNull(list, "Null files");
            this.f8000a = list;
            return this;
        }

        public f0.d.a c(String str) {
            this.f8001b = str;
            return this;
        }
    }

    private f(List<f0.d.b> list, String str) {
        this.f7998a = list;
        this.f7999b = str;
    }

    public List<f0.d.b> b() {
        return this.f7998a;
    }

    public String c() {
        return this.f7999b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.d)) {
            return false;
        }
        f0.d dVar = (f0.d) obj;
        if (this.f7998a.equals(dVar.b())) {
            String str = this.f7999b;
            String c10 = dVar.c();
            if (str == null) {
                if (c10 == null) {
                    return true;
                }
            } else if (str.equals(c10)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f7998a.hashCode() ^ 1000003) * 1000003;
        String str = this.f7999b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f7998a + ", orgId=" + this.f7999b + "}";
    }
}
