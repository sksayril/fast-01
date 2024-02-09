package e6;

import d6.c;
import java.util.Objects;

final class b {

    /* renamed from: a  reason: collision with root package name */
    private final d6.b f8510a;

    /* renamed from: b  reason: collision with root package name */
    private final d6.b f8511b;

    /* renamed from: c  reason: collision with root package name */
    private final c f8512c;

    b(d6.b bVar, d6.b bVar2, c cVar) {
        this.f8510a = bVar;
        this.f8511b = bVar2;
        this.f8512c = cVar;
    }

    /* access modifiers changed from: package-private */
    public c a() {
        return this.f8512c;
    }

    /* access modifiers changed from: package-private */
    public d6.b b() {
        return this.f8510a;
    }

    /* access modifiers changed from: package-private */
    public d6.b c() {
        return this.f8511b;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.f8511b == null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(this.f8510a, bVar.f8510a) && Objects.equals(this.f8511b, bVar.f8511b) && Objects.equals(this.f8512c, bVar.f8512c);
    }

    public int hashCode() {
        return (Objects.hashCode(this.f8510a) ^ Objects.hashCode(this.f8511b)) ^ Objects.hashCode(this.f8512c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        sb.append(this.f8510a);
        sb.append(" , ");
        sb.append(this.f8511b);
        sb.append(" : ");
        c cVar = this.f8512c;
        sb.append(cVar == null ? "null" : Integer.valueOf(cVar.c()));
        sb.append(" ]");
        return sb.toString();
    }
}
