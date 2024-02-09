package z2;

public final class g extends d {

    /* renamed from: q  reason: collision with root package name */
    public final a f13500q;

    /* renamed from: r  reason: collision with root package name */
    public final float f13501r;

    public g(a aVar) {
        this(aVar, 10.0f);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g(z2.a r3, float r4) {
        /*
            r2 = this;
            java.lang.String r0 = "bitmapDescriptor must not be null"
            java.lang.Object r0 = h2.p.k(r3, r0)
            z2.a r0 = (z2.a) r0
            r1 = 0
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0015
            r2.<init>(r0, r4)
            r2.f13500q = r3
            r2.f13501r = r4
            return
        L_0x0015:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "refWidth must be positive"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.g.<init>(z2.a, float):void");
    }

    public String toString() {
        String valueOf = String.valueOf(this.f13500q);
        float f10 = this.f13501r;
        return "[CustomCap: bitmapDescriptor=" + valueOf + " refWidth=" + f10 + "]";
    }
}
