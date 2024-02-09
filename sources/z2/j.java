package z2;

public final class j extends n {

    /* renamed from: p  reason: collision with root package name */
    public final float f13503p;

    public j(float f10) {
        super(2, Float.valueOf(Math.max(f10, 0.0f)));
        this.f13503p = Math.max(f10, 0.0f);
    }

    public String toString() {
        float f10 = this.f13503p;
        return "[Gap: length=" + f10 + "]";
    }
}
