package n5;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Objects;

public class c implements Closeable, Flushable {

    /* renamed from: v  reason: collision with root package name */
    private static final String[] f11310v = new String[128];

    /* renamed from: w  reason: collision with root package name */
    private static final String[] f11311w;

    /* renamed from: m  reason: collision with root package name */
    private final Writer f11312m;

    /* renamed from: n  reason: collision with root package name */
    private int[] f11313n = new int[32];

    /* renamed from: o  reason: collision with root package name */
    private int f11314o = 0;

    /* renamed from: p  reason: collision with root package name */
    private String f11315p;

    /* renamed from: q  reason: collision with root package name */
    private String f11316q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f11317r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f11318s;

    /* renamed from: t  reason: collision with root package name */
    private String f11319t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f11320u;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f11310v[i10] = String.format("\\u%04x", new Object[]{Integer.valueOf(i10)});
        }
        String[] strArr = f11310v;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f11311w = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        w(6);
        this.f11316q = ":";
        this.f11320u = true;
        Objects.requireNonNull(writer, "out == null");
        this.f11312m = writer;
    }

    private void E(String str) {
        String str2;
        String[] strArr = this.f11318s ? f11311w : f11310v;
        this.f11312m.write(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i10 < i11) {
                this.f11312m.write(str, i10, i11 - i10);
            }
            this.f11312m.write(str2);
            i10 = i11 + 1;
        }
        if (i10 < length) {
            this.f11312m.write(str, i10, length - i10);
        }
        this.f11312m.write(34);
    }

    private void K() {
        if (this.f11319t != null) {
            a();
            E(this.f11319t);
            this.f11319t = null;
        }
    }

    private void a() {
        int u9 = u();
        if (u9 == 5) {
            this.f11312m.write(44);
        } else if (u9 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        q();
        y(4);
    }

    private void b() {
        int u9 = u();
        if (u9 == 1) {
            y(2);
        } else if (u9 == 2) {
            this.f11312m.append(',');
        } else if (u9 != 4) {
            if (u9 != 6) {
                if (u9 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f11317r) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            y(7);
            return;
        } else {
            this.f11312m.append(this.f11316q);
            y(5);
            return;
        }
        q();
    }

    private c h(int i10, int i11, char c10) {
        int u9 = u();
        if (u9 != i11 && u9 != i10) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f11319t == null) {
            this.f11314o--;
            if (u9 == i11) {
                q();
            }
            this.f11312m.write(c10);
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.f11319t);
        }
    }

    private void q() {
        if (this.f11315p != null) {
            this.f11312m.write(10);
            int i10 = this.f11314o;
            for (int i11 = 1; i11 < i10; i11++) {
                this.f11312m.write(this.f11315p);
            }
        }
    }

    private c t(int i10, char c10) {
        b();
        w(i10);
        this.f11312m.write(c10);
        return this;
    }

    private int u() {
        int i10 = this.f11314o;
        if (i10 != 0) {
            return this.f11313n[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void w(int i10) {
        int i11 = this.f11314o;
        int[] iArr = this.f11313n;
        if (i11 == iArr.length) {
            this.f11313n = Arrays.copyOf(iArr, i11 * 2);
        }
        int[] iArr2 = this.f11313n;
        int i12 = this.f11314o;
        this.f11314o = i12 + 1;
        iArr2[i12] = i10;
    }

    private void y(int i10) {
        this.f11313n[this.f11314o - 1] = i10;
    }

    public final void A(String str) {
        String str2;
        if (str.length() == 0) {
            this.f11315p = null;
            str2 = ":";
        } else {
            this.f11315p = str;
            str2 = ": ";
        }
        this.f11316q = str2;
    }

    public final void C(boolean z9) {
        this.f11317r = z9;
    }

    public final void D(boolean z9) {
        this.f11320u = z9;
    }

    public c F(long j10) {
        K();
        b();
        this.f11312m.write(Long.toString(j10));
        return this;
    }

    public c G(Boolean bool) {
        if (bool == null) {
            return r();
        }
        K();
        b();
        this.f11312m.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c H(Number number) {
        if (number == null) {
            return r();
        }
        K();
        String obj = number.toString();
        if (this.f11317r || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            b();
            this.f11312m.append(obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public c I(String str) {
        if (str == null) {
            return r();
        }
        K();
        b();
        E(str);
        return this;
    }

    public c J(boolean z9) {
        K();
        b();
        this.f11312m.write(z9 ? "true" : "false");
        return this;
    }

    public void close() {
        this.f11312m.close();
        int i10 = this.f11314o;
        if (i10 > 1 || (i10 == 1 && this.f11313n[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f11314o = 0;
    }

    public c e() {
        K();
        return t(1, '[');
    }

    public void flush() {
        if (this.f11314o != 0) {
            this.f11312m.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public c g() {
        K();
        return t(3, '{');
    }

    public c k() {
        return h(1, 2, ']');
    }

    public c l() {
        return h(3, 5, '}');
    }

    public final boolean m() {
        return this.f11320u;
    }

    public final boolean n() {
        return this.f11318s;
    }

    public boolean o() {
        return this.f11317r;
    }

    public c p(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f11319t != null) {
            throw new IllegalStateException();
        } else if (this.f11314o != 0) {
            this.f11319t = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public c r() {
        if (this.f11319t != null) {
            if (this.f11320u) {
                K();
            } else {
                this.f11319t = null;
                return this;
            }
        }
        b();
        this.f11312m.write("null");
        return this;
    }

    public final void z(boolean z9) {
        this.f11318s = z9;
    }
}
