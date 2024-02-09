package kotlin.jvm.internal;

import x8.b;
import x8.h;

public abstract class s extends c implements h {

    /* renamed from: m  reason: collision with root package name */
    private final boolean f11076m;

    public s() {
        this.f11076m = false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        boolean z9 = false;
        this.f11076m = (i10 & 2) == 2 ? true : z9;
    }

    public b compute() {
        return this.f11076m ? this : super.compute();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public h getReflected() {
        if (!this.f11076m) {
            return (h) super.getReflected();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            return getOwner().equals(sVar.getOwner()) && getName().equals(sVar.getName()) && getSignature().equals(sVar.getSignature()) && l.a(getBoundReceiver(), sVar.getBoundReceiver());
        } else if (obj instanceof h) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
