package com.google.android.gms.internal.measurement;

final class w9 implements ea {

    /* renamed from: a  reason: collision with root package name */
    private ea[] f5680a;

    w9(ea... eaVarArr) {
        this.f5680a = eaVarArr;
    }

    public final ba a(Class<?> cls) {
        for (ea eaVar : this.f5680a) {
            if (eaVar.b(cls)) {
                return eaVar.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }

    public final boolean b(Class<?> cls) {
        for (ea b10 : this.f5680a) {
            if (b10.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
