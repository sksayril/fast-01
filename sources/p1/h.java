package p1;

import java.util.Arrays;
import java.util.Objects;
import n1.b;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final b f11830a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f11831b;

    public h(b bVar, byte[] bArr) {
        Objects.requireNonNull(bVar, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.f11830a = bVar;
        this.f11831b = bArr;
    }

    public byte[] a() {
        return this.f11831b;
    }

    public b b() {
        return this.f11830a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f11830a.equals(hVar.f11830a)) {
            return false;
        }
        return Arrays.equals(this.f11831b, hVar.f11831b);
    }

    public int hashCode() {
        return ((this.f11830a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f11831b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f11830a + ", bytes=[...]}";
    }
}
