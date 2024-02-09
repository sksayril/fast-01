package d4;

import d4.g0;
import java.util.Objects;

final class e0 extends g0.c {

    /* renamed from: a  reason: collision with root package name */
    private final String f7995a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7996b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f7997c;

    e0(String str, String str2, boolean z9) {
        Objects.requireNonNull(str, "Null osRelease");
        this.f7995a = str;
        Objects.requireNonNull(str2, "Null osCodeName");
        this.f7996b = str2;
        this.f7997c = z9;
    }

    public boolean b() {
        return this.f7997c;
    }

    public String c() {
        return this.f7996b;
    }

    public String d() {
        return this.f7995a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.c)) {
            return false;
        }
        g0.c cVar = (g0.c) obj;
        return this.f7995a.equals(cVar.d()) && this.f7996b.equals(cVar.c()) && this.f7997c == cVar.b();
    }

    public int hashCode() {
        return ((((this.f7995a.hashCode() ^ 1000003) * 1000003) ^ this.f7996b.hashCode()) * 1000003) ^ (this.f7997c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f7995a + ", osCodeName=" + this.f7996b + ", isRooted=" + this.f7997c + "}";
    }
}
