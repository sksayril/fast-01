package t3;

import h2.p;

public class l extends Exception {
    @Deprecated
    protected l() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(String str) {
        super(str);
        p.g(str, "Detail message must not be empty");
    }
}
