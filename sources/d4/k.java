package d4;

import d4.f0;
import java.util.Objects;

final class k extends f0.e.c {

    /* renamed from: a  reason: collision with root package name */
    private final int f8046a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8047b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8048c;

    /* renamed from: d  reason: collision with root package name */
    private final long f8049d;

    /* renamed from: e  reason: collision with root package name */
    private final long f8050e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f8051f;

    /* renamed from: g  reason: collision with root package name */
    private final int f8052g;

    /* renamed from: h  reason: collision with root package name */
    private final String f8053h;

    /* renamed from: i  reason: collision with root package name */
    private final String f8054i;

    static final class b extends f0.e.c.a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f8055a;

        /* renamed from: b  reason: collision with root package name */
        private String f8056b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f8057c;

        /* renamed from: d  reason: collision with root package name */
        private Long f8058d;

        /* renamed from: e  reason: collision with root package name */
        private Long f8059e;

        /* renamed from: f  reason: collision with root package name */
        private Boolean f8060f;

        /* renamed from: g  reason: collision with root package name */
        private Integer f8061g;

        /* renamed from: h  reason: collision with root package name */
        private String f8062h;

        /* renamed from: i  reason: collision with root package name */
        private String f8063i;

        b() {
        }

        public f0.e.c a() {
            String str = "";
            if (this.f8055a == null) {
                str = str + " arch";
            }
            if (this.f8056b == null) {
                str = str + " model";
            }
            if (this.f8057c == null) {
                str = str + " cores";
            }
            if (this.f8058d == null) {
                str = str + " ram";
            }
            if (this.f8059e == null) {
                str = str + " diskSpace";
            }
            if (this.f8060f == null) {
                str = str + " simulator";
            }
            if (this.f8061g == null) {
                str = str + " state";
            }
            if (this.f8062h == null) {
                str = str + " manufacturer";
            }
            if (this.f8063i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new k(this.f8055a.intValue(), this.f8056b, this.f8057c.intValue(), this.f8058d.longValue(), this.f8059e.longValue(), this.f8060f.booleanValue(), this.f8061g.intValue(), this.f8062h, this.f8063i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f0.e.c.a b(int i10) {
            this.f8055a = Integer.valueOf(i10);
            return this;
        }

        public f0.e.c.a c(int i10) {
            this.f8057c = Integer.valueOf(i10);
            return this;
        }

        public f0.e.c.a d(long j10) {
            this.f8059e = Long.valueOf(j10);
            return this;
        }

        public f0.e.c.a e(String str) {
            Objects.requireNonNull(str, "Null manufacturer");
            this.f8062h = str;
            return this;
        }

        public f0.e.c.a f(String str) {
            Objects.requireNonNull(str, "Null model");
            this.f8056b = str;
            return this;
        }

        public f0.e.c.a g(String str) {
            Objects.requireNonNull(str, "Null modelClass");
            this.f8063i = str;
            return this;
        }

        public f0.e.c.a h(long j10) {
            this.f8058d = Long.valueOf(j10);
            return this;
        }

        public f0.e.c.a i(boolean z9) {
            this.f8060f = Boolean.valueOf(z9);
            return this;
        }

        public f0.e.c.a j(int i10) {
            this.f8061g = Integer.valueOf(i10);
            return this;
        }
    }

    private k(int i10, String str, int i11, long j10, long j11, boolean z9, int i12, String str2, String str3) {
        this.f8046a = i10;
        this.f8047b = str;
        this.f8048c = i11;
        this.f8049d = j10;
        this.f8050e = j11;
        this.f8051f = z9;
        this.f8052g = i12;
        this.f8053h = str2;
        this.f8054i = str3;
    }

    public int b() {
        return this.f8046a;
    }

    public int c() {
        return this.f8048c;
    }

    public long d() {
        return this.f8050e;
    }

    public String e() {
        return this.f8053h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.c)) {
            return false;
        }
        f0.e.c cVar = (f0.e.c) obj;
        return this.f8046a == cVar.b() && this.f8047b.equals(cVar.f()) && this.f8048c == cVar.c() && this.f8049d == cVar.h() && this.f8050e == cVar.d() && this.f8051f == cVar.j() && this.f8052g == cVar.i() && this.f8053h.equals(cVar.e()) && this.f8054i.equals(cVar.g());
    }

    public String f() {
        return this.f8047b;
    }

    public String g() {
        return this.f8054i;
    }

    public long h() {
        return this.f8049d;
    }

    public int hashCode() {
        long j10 = this.f8049d;
        long j11 = this.f8050e;
        return ((((((((((((((((this.f8046a ^ 1000003) * 1000003) ^ this.f8047b.hashCode()) * 1000003) ^ this.f8048c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f8051f ? 1231 : 1237)) * 1000003) ^ this.f8052g) * 1000003) ^ this.f8053h.hashCode()) * 1000003) ^ this.f8054i.hashCode();
    }

    public int i() {
        return this.f8052g;
    }

    public boolean j() {
        return this.f8051f;
    }

    public String toString() {
        return "Device{arch=" + this.f8046a + ", model=" + this.f8047b + ", cores=" + this.f8048c + ", ram=" + this.f8049d + ", diskSpace=" + this.f8050e + ", simulator=" + this.f8051f + ", state=" + this.f8052g + ", manufacturer=" + this.f8053h + ", modelClass=" + this.f8054i + "}";
    }
}
