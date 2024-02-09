package b0;

import androidx.datastore.preferences.protobuf.k0;
import androidx.datastore.preferences.protobuf.l0;
import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.t1;
import androidx.datastore.preferences.protobuf.y;
import androidx.datastore.preferences.protobuf.z0;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

public final class f extends y<f, a> implements s0 {
    /* access modifiers changed from: private */
    public static final f DEFAULT_INSTANCE;
    private static volatile z0<f> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private l0<String, h> preferences_ = l0.f();

    public static final class a extends y.a<f, a> implements s0 {
        private a() {
            super(f.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(e eVar) {
            this();
        }

        public a C(String str, h hVar) {
            Objects.requireNonNull(str);
            Objects.requireNonNull(hVar);
            x();
            ((f) this.f2125n).N().put(str, hVar);
            return this;
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final k0<String, h> f3371a = k0.d(t1.b.STRING, "", t1.b.MESSAGE, h.U());
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        y.J(f.class, fVar);
    }

    private f() {
    }

    /* access modifiers changed from: private */
    public Map<String, h> N() {
        return P();
    }

    private l0<String, h> P() {
        if (!this.preferences_.n()) {
            this.preferences_ = this.preferences_.r();
        }
        return this.preferences_;
    }

    private l0<String, h> Q() {
        return this.preferences_;
    }

    public static a R() {
        return (a) DEFAULT_INSTANCE.u();
    }

    public static f S(InputStream inputStream) {
        return (f) y.H(DEFAULT_INSTANCE, inputStream);
    }

    public Map<String, h> O() {
        return Collections.unmodifiableMap(Q());
    }

    /* access modifiers changed from: protected */
    public final Object x(y.f fVar, Object obj, Object obj2) {
        switch (e.f3370a[fVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new a((e) null);
            case 3:
                return y.G(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f3371a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<f> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (f.class) {
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
