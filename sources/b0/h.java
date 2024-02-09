package b0;

import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.y;
import androidx.datastore.preferences.protobuf.z0;
import b0.g;
import java.util.Objects;

public final class h extends y<h, a> implements s0 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile z0<h> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    public static final class a extends y.a<h, a> implements s0 {
        private a() {
            super(h.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(e eVar) {
            this();
        }

        public a C(boolean z9) {
            x();
            ((h) this.f2125n).d0(z9);
            return this;
        }

        public a D(double d10) {
            x();
            ((h) this.f2125n).e0(d10);
            return this;
        }

        public a E(float f10) {
            x();
            ((h) this.f2125n).f0(f10);
            return this;
        }

        public a F(int i10) {
            x();
            ((h) this.f2125n).g0(i10);
            return this;
        }

        public a G(long j10) {
            x();
            ((h) this.f2125n).h0(j10);
            return this;
        }

        public a H(String str) {
            x();
            ((h) this.f2125n).i0(str);
            return this;
        }

        public a I(g.a aVar) {
            x();
            ((h) this.f2125n).j0(aVar);
            return this;
        }
    }

    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        VALUE_NOT_SET(0);
        
        private final int value;

        private b(int i10) {
            this.value = i10;
        }

        public static b forNumber(int i10) {
            switch (i10) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                default:
                    return null;
            }
        }

        @Deprecated
        public static b valueOf(int i10) {
            return forNumber(i10);
        }

        public int getNumber() {
            return this.value;
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        y.J(h.class, hVar);
    }

    private h() {
    }

    public static h U() {
        return DEFAULT_INSTANCE;
    }

    public static a c0() {
        return (a) DEFAULT_INSTANCE.u();
    }

    /* access modifiers changed from: private */
    public void d0(boolean z9) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z9);
    }

    /* access modifiers changed from: private */
    public void e0(double d10) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d10);
    }

    /* access modifiers changed from: private */
    public void f0(float f10) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f10);
    }

    /* access modifiers changed from: private */
    public void g0(int i10) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i10);
    }

    /* access modifiers changed from: private */
    public void h0(long j10) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j10);
    }

    /* access modifiers changed from: private */
    public void i0(String str) {
        Objects.requireNonNull(str);
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* access modifiers changed from: private */
    public void j0(g.a aVar) {
        this.value_ = aVar.a();
        this.valueCase_ = 6;
    }

    public boolean T() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public double V() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public float W() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public int X() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public long Y() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0;
    }

    public String Z() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public g a0() {
        return this.valueCase_ == 6 ? (g) this.value_ : g.P();
    }

    public b b0() {
        return b.forNumber(this.valueCase_);
    }

    /* access modifiers changed from: protected */
    public final Object x(y.f fVar, Object obj, Object obj2) {
        switch (e.f3370a[fVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new a((e) null);
            case 3:
                return y.G(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<h> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (h.class) {
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
