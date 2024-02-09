package androidx.core.util;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final float f1676a;

    /* renamed from: b  reason: collision with root package name */
    private final float f1677b;

    public i(float f10, float f11) {
        this.f1676a = h.c(f10, "width");
        this.f1677b = h.c(f11, "height");
    }

    public float a() {
        return this.f1677b;
    }

    public float b() {
        return this.f1676a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return iVar.f1676a == this.f1676a && iVar.f1677b == this.f1677b;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f1676a) ^ Float.floatToIntBits(this.f1677b);
    }

    public String toString() {
        return this.f1676a + "x" + this.f1677b;
    }
}
