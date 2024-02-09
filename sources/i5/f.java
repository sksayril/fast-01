package i5;

import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.p;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import n5.b;

public final class f extends n5.a {
    private static final Reader F = new a();
    private static final Object G = new Object();
    private Object[] B = new Object[32];
    private int C = 0;
    private String[] D = new String[32];
    private int[] E = new int[32];

    class a extends Reader {
        a() {
        }

        public void close() {
            throw new AssertionError();
        }

        public int read(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public f(k kVar) {
        super(F);
        X(kVar);
    }

    private void S(b bVar) {
        if (G() != bVar) {
            throw new IllegalStateException("Expected " + bVar + " but was " + G() + r());
        }
    }

    private Object U() {
        return this.B[this.C - 1];
    }

    private Object V() {
        Object[] objArr = this.B;
        int i10 = this.C - 1;
        this.C = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    private void X(Object obj) {
        int i10 = this.C;
        Object[] objArr = this.B;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.B = Arrays.copyOf(objArr, i11);
            this.E = Arrays.copyOf(this.E, i11);
            this.D = (String[]) Arrays.copyOf(this.D, i11);
        }
        Object[] objArr2 = this.B;
        int i12 = this.C;
        this.C = i12 + 1;
        objArr2[i12] = obj;
    }

    private String r() {
        return " at path " + n();
    }

    public void C() {
        S(b.NULL);
        V();
        int i10 = this.C;
        if (i10 > 0) {
            int[] iArr = this.E;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public String E() {
        b G2 = G();
        b bVar = b.STRING;
        if (G2 == bVar || G2 == b.NUMBER) {
            String i10 = ((p) V()).i();
            int i11 = this.C;
            if (i11 > 0) {
                int[] iArr = this.E;
                int i12 = i11 - 1;
                iArr[i12] = iArr[i12] + 1;
            }
            return i10;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + G2 + r());
    }

    public b G() {
        if (this.C == 0) {
            return b.END_DOCUMENT;
        }
        Object U = U();
        if (U instanceof Iterator) {
            boolean z9 = this.B[this.C - 2] instanceof n;
            Iterator it = (Iterator) U;
            if (!it.hasNext()) {
                return z9 ? b.END_OBJECT : b.END_ARRAY;
            }
            if (z9) {
                return b.NAME;
            }
            X(it.next());
            return G();
        } else if (U instanceof n) {
            return b.BEGIN_OBJECT;
        } else {
            if (U instanceof h) {
                return b.BEGIN_ARRAY;
            }
            if (U instanceof p) {
                p pVar = (p) U;
                if (pVar.G()) {
                    return b.STRING;
                }
                if (pVar.D()) {
                    return b.BOOLEAN;
                }
                if (pVar.F()) {
                    return b.NUMBER;
                }
                throw new AssertionError();
            } else if (U instanceof m) {
                return b.NULL;
            } else {
                if (U == G) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    public void Q() {
        if (G() == b.NAME) {
            z();
            this.D[this.C - 2] = "null";
        } else {
            V();
            int i10 = this.C;
            if (i10 > 0) {
                this.D[i10 - 1] = "null";
            }
        }
        int i11 = this.C;
        if (i11 > 0) {
            int[] iArr = this.E;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
    }

    /* access modifiers changed from: package-private */
    public k T() {
        b G2 = G();
        if (G2 == b.NAME || G2 == b.END_ARRAY || G2 == b.END_OBJECT || G2 == b.END_DOCUMENT) {
            throw new IllegalStateException("Unexpected " + G2 + " when reading a JsonElement.");
        }
        k kVar = (k) U();
        Q();
        return kVar;
    }

    public void W() {
        S(b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) U()).next();
        X(entry.getValue());
        X(new p((String) entry.getKey()));
    }

    public void a() {
        S(b.BEGIN_ARRAY);
        X(((h) U()).iterator());
        this.E[this.C - 1] = 0;
    }

    public void b() {
        S(b.BEGIN_OBJECT);
        X(((n) U()).A().iterator());
    }

    public void close() {
        this.B = new Object[]{G};
        this.C = 1;
    }

    public void k() {
        S(b.END_ARRAY);
        V();
        V();
        int i10 = this.C;
        if (i10 > 0) {
            int[] iArr = this.E;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public void l() {
        S(b.END_OBJECT);
        V();
        V();
        int i10 = this.C;
        if (i10 > 0) {
            int[] iArr = this.E;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public String n() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.C;
            if (i10 >= i11) {
                return sb.toString();
            }
            Object[] objArr = this.B;
            if (objArr[i10] instanceof h) {
                i10++;
                if (i10 < i11 && (objArr[i10] instanceof Iterator)) {
                    sb.append('[');
                    sb.append(this.E[i10]);
                    sb.append(']');
                }
            } else if ((objArr[i10] instanceof n) && (i10 = i10 + 1) < i11 && (objArr[i10] instanceof Iterator)) {
                sb.append('.');
                String[] strArr = this.D;
                if (strArr[i10] != null) {
                    sb.append(strArr[i10]);
                }
            }
            i10++;
        }
    }

    public boolean o() {
        b G2 = G();
        return (G2 == b.END_OBJECT || G2 == b.END_ARRAY) ? false : true;
    }

    public boolean t() {
        S(b.BOOLEAN);
        boolean c10 = ((p) V()).c();
        int i10 = this.C;
        if (i10 > 0) {
            int[] iArr = this.E;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return c10;
    }

    public String toString() {
        return f.class.getSimpleName() + r();
    }

    public double u() {
        b G2 = G();
        b bVar = b.NUMBER;
        if (G2 == bVar || G2 == b.STRING) {
            double z9 = ((p) U()).z();
            if (p() || (!Double.isNaN(z9) && !Double.isInfinite(z9))) {
                V();
                int i10 = this.C;
                if (i10 > 0) {
                    int[] iArr = this.E;
                    int i11 = i10 - 1;
                    iArr[i11] = iArr[i11] + 1;
                }
                return z9;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + z9);
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + G2 + r());
    }

    public int w() {
        b G2 = G();
        b bVar = b.NUMBER;
        if (G2 == bVar || G2 == b.STRING) {
            int A = ((p) U()).A();
            V();
            int i10 = this.C;
            if (i10 > 0) {
                int[] iArr = this.E;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return A;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + G2 + r());
    }

    public long y() {
        b G2 = G();
        b bVar = b.NUMBER;
        if (G2 == bVar || G2 == b.STRING) {
            long B2 = ((p) U()).B();
            V();
            int i10 = this.C;
            if (i10 > 0) {
                int[] iArr = this.E;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return B2;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + G2 + r());
    }

    public String z() {
        S(b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) U()).next();
        String str = (String) entry.getKey();
        this.D[this.C - 1] = str;
        X(entry.getValue());
        return str;
    }
}
