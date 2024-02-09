package b9;

public class u1 extends y1 implements x {

    /* renamed from: o  reason: collision with root package name */
    private final boolean f3493o = I0();

    public u1(r1 r1Var) {
        super(true);
        g0(r1Var);
    }

    private final boolean I0() {
        y1 w9;
        r c02 = c0();
        s sVar = c02 instanceof s ? (s) c02 : null;
        if (!(sVar == null || (w9 = sVar.w()) == null)) {
            while (!w9.Z()) {
                r c03 = w9.c0();
                s sVar2 = c03 instanceof s ? (s) c03 : null;
                if (sVar2 != null) {
                    w9 = sVar2.w();
                    if (w9 == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean Z() {
        return this.f3493o;
    }

    public boolean a0() {
        return true;
    }
}
