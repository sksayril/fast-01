package d4;

import d4.f0;
import java.util.List;
import java.util.Objects;

final class y extends f0.e.d.f {

    /* renamed from: a  reason: collision with root package name */
    private final List<f0.e.d.C0122e> f8174a;

    static final class b extends f0.e.d.f.a {

        /* renamed from: a  reason: collision with root package name */
        private List<f0.e.d.C0122e> f8175a;

        b() {
        }

        public f0.e.d.f a() {
            String str = "";
            if (this.f8175a == null) {
                str = str + " rolloutAssignments";
            }
            if (str.isEmpty()) {
                return new y(this.f8175a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f0.e.d.f.a b(List<f0.e.d.C0122e> list) {
            Objects.requireNonNull(list, "Null rolloutAssignments");
            this.f8175a = list;
            return this;
        }
    }

    private y(List<f0.e.d.C0122e> list) {
        this.f8174a = list;
    }

    public List<f0.e.d.C0122e> b() {
        return this.f8174a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.d.f) {
            return this.f8174a.equals(((f0.e.d.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f8174a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f8174a + "}";
    }
}
