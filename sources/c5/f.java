package c5;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final d f3718a;

    /* renamed from: b  reason: collision with root package name */
    private final d f3719b;

    /* renamed from: c  reason: collision with root package name */
    private final double f3720c;

    public f() {
        this((d) null, (d) null, 0.0d, 7, (g) null);
    }

    public f(d dVar, d dVar2, double d10) {
        l.e(dVar, "performance");
        l.e(dVar2, "crashlytics");
        this.f3718a = dVar;
        this.f3719b = dVar2;
        this.f3720c = d10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(d dVar, d dVar2, double d10, int i10, g gVar) {
        this((i10 & 1) != 0 ? d.COLLECTION_SDK_NOT_INSTALLED : dVar, (i10 & 2) != 0 ? d.COLLECTION_SDK_NOT_INSTALLED : dVar2, (i10 & 4) != 0 ? 1.0d : d10);
    }

    public final d a() {
        return this.f3719b;
    }

    public final d b() {
        return this.f3718a;
    }

    public final double c() {
        return this.f3720c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f3718a == fVar.f3718a && this.f3719b == fVar.f3719b && l.a(Double.valueOf(this.f3720c), Double.valueOf(fVar.f3720c));
    }

    public int hashCode() {
        return (((this.f3718a.hashCode() * 31) + this.f3719b.hashCode()) * 31) + Double.doubleToLongBits(this.f3720c);
    }

    public String toString() {
        return "DataCollectionStatus(performance=" + this.f3718a + ", crashlytics=" + this.f3719b + ", sessionSamplingRate=" + this.f3720c + ')';
    }
}
