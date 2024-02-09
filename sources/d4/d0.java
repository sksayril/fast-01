package d4;

import d4.g0;
import java.util.Objects;

final class d0 extends g0.b {

    /* renamed from: a  reason: collision with root package name */
    private final int f7982a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7983b;

    /* renamed from: c  reason: collision with root package name */
    private final int f7984c;

    /* renamed from: d  reason: collision with root package name */
    private final long f7985d;

    /* renamed from: e  reason: collision with root package name */
    private final long f7986e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f7987f;

    /* renamed from: g  reason: collision with root package name */
    private final int f7988g;

    /* renamed from: h  reason: collision with root package name */
    private final String f7989h;

    /* renamed from: i  reason: collision with root package name */
    private final String f7990i;

    d0(int i10, String str, int i11, long j10, long j11, boolean z9, int i12, String str2, String str3) {
        this.f7982a = i10;
        Objects.requireNonNull(str, "Null model");
        this.f7983b = str;
        this.f7984c = i11;
        this.f7985d = j10;
        this.f7986e = j11;
        this.f7987f = z9;
        this.f7988g = i12;
        Objects.requireNonNull(str2, "Null manufacturer");
        this.f7989h = str2;
        Objects.requireNonNull(str3, "Null modelClass");
        this.f7990i = str3;
    }

    public int a() {
        return this.f7982a;
    }

    public int b() {
        return this.f7984c;
    }

    public long d() {
        return this.f7986e;
    }

    public boolean e() {
        return this.f7987f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.b)) {
            return false;
        }
        g0.b bVar = (g0.b) obj;
        return this.f7982a == bVar.a() && this.f7983b.equals(bVar.g()) && this.f7984c == bVar.b() && this.f7985d == bVar.j() && this.f7986e == bVar.d() && this.f7987f == bVar.e() && this.f7988g == bVar.i() && this.f7989h.equals(bVar.f()) && this.f7990i.equals(bVar.h());
    }

    public String f() {
        return this.f7989h;
    }

    public String g() {
        return this.f7983b;
    }

    public String h() {
        return this.f7990i;
    }

    public int hashCode() {
        long j10 = this.f7985d;
        long j11 = this.f7986e;
        return ((((((((((((((((this.f7982a ^ 1000003) * 1000003) ^ this.f7983b.hashCode()) * 1000003) ^ this.f7984c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f7987f ? 1231 : 1237)) * 1000003) ^ this.f7988g) * 1000003) ^ this.f7989h.hashCode()) * 1000003) ^ this.f7990i.hashCode();
    }

    public int i() {
        return this.f7988g;
    }

    public long j() {
        return this.f7985d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f7982a + ", model=" + this.f7983b + ", availableProcessors=" + this.f7984c + ", totalRam=" + this.f7985d + ", diskSpace=" + this.f7986e + ", isEmulator=" + this.f7987f + ", state=" + this.f7988g + ", manufacturer=" + this.f7989h + ", modelClass=" + this.f7990i + "}";
    }
}
