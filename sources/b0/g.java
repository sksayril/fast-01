package b0;

import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.y;
import androidx.datastore.preferences.protobuf.z0;
import java.util.List;

public final class g extends y<g, a> implements s0 {
    /* access modifiers changed from: private */
    public static final g DEFAULT_INSTANCE;
    private static volatile z0<g> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private a0.i<String> strings_ = y.y();

    public static final class a extends y.a<g, a> implements s0 {
        private a() {
            super(g.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(e eVar) {
            this();
        }

        public a C(Iterable<String> iterable) {
            x();
            ((g) this.f2125n).N(iterable);
            return this;
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        y.J(g.class, gVar);
    }

    private g() {
    }

    /* access modifiers changed from: private */
    public void N(Iterable<String> iterable) {
        O();
        androidx.datastore.preferences.protobuf.a.j(iterable, this.strings_);
    }

    private void O() {
        if (!this.strings_.x()) {
            this.strings_ = y.E(this.strings_);
        }
    }

    public static g P() {
        return DEFAULT_INSTANCE;
    }

    public static a R() {
        return (a) DEFAULT_INSTANCE.u();
    }

    public List<String> Q() {
        return this.strings_;
    }

    /* access modifiers changed from: protected */
    public final Object x(y.f fVar, Object obj, Object obj2) {
        switch (e.f3370a[fVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a((e) null);
            case 3:
                return y.G(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<g> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (g.class) {
                        z0Var = PARSER;
                        if (z0Var == null) {
                            z0Var = new y.b<>(DEFAULT_INSTANCE);
                            PARSER = z0Var;
                        }
                    }
                }
                return z0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
