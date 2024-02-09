package d4;

import d4.f0;
import java.util.Arrays;
import java.util.Objects;

final class g extends f0.d.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f8003a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f8004b;

    static final class b extends f0.d.b.a {

        /* renamed from: a  reason: collision with root package name */
        private String f8005a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f8006b;

        b() {
        }

        public f0.d.b a() {
            String str = "";
            if (this.f8005a == null) {
                str = str + " filename";
            }
            if (this.f8006b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new g(this.f8005a, this.f8006b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f0.d.b.a b(byte[] bArr) {
            Objects.requireNonNull(bArr, "Null contents");
            this.f8006b = bArr;
            return this;
        }

        public f0.d.b.a c(String str) {
            Objects.requireNonNull(str, "Null filename");
            this.f8005a = str;
            return this;
        }
    }

    private g(String str, byte[] bArr) {
        this.f8003a = str;
        this.f8004b = bArr;
    }

    public byte[] b() {
        return this.f8004b;
    }

    public String c() {
        return this.f8003a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.d.b)) {
            return false;
        }
        f0.d.b bVar = (f0.d.b) obj;
        if (this.f8003a.equals(bVar.c())) {
            if (Arrays.equals(this.f8004b, bVar instanceof g ? ((g) bVar).f8004b : bVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f8003a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f8004b);
    }

    public String toString() {
        return "File{filename=" + this.f8003a + ", contents=" + Arrays.toString(this.f8004b) + "}";
    }
}
