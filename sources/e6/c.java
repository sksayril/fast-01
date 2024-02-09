package e6;

import java.util.ArrayList;
import java.util.List;

final class c {

    /* renamed from: a  reason: collision with root package name */
    private final List<b> f8513a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8514b;

    c(List<b> list, int i10) {
        this.f8513a = new ArrayList(list);
        this.f8514b = i10;
    }

    /* access modifiers changed from: package-private */
    public List<b> a() {
        return this.f8513a;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f8514b;
    }

    /* access modifiers changed from: package-private */
    public boolean c(List<b> list) {
        return this.f8513a.equals(list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f8513a.equals(((c) obj).f8513a);
    }

    public int hashCode() {
        return this.f8513a.hashCode();
    }

    public String toString() {
        return "{ " + this.f8513a + " }";
    }
}
