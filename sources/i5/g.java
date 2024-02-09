package i5;

import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.p;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import n5.c;

public final class g extends c {
    private static final Writer A = new a();
    private static final p B = new p("closed");

    /* renamed from: x  reason: collision with root package name */
    private final List<k> f9505x = new ArrayList();

    /* renamed from: y  reason: collision with root package name */
    private String f9506y;

    /* renamed from: z  reason: collision with root package name */
    private k f9507z = m.f7529a;

    class a extends Writer {
        a() {
        }

        public void close() {
            throw new AssertionError();
        }

        public void flush() {
            throw new AssertionError();
        }

        public void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public g() {
        super(A);
    }

    private k M() {
        List<k> list = this.f9505x;
        return list.get(list.size() - 1);
    }

    private void N(k kVar) {
        if (this.f9506y != null) {
            if (!kVar.l() || m()) {
                ((n) M()).z(this.f9506y, kVar);
            }
            this.f9506y = null;
        } else if (this.f9505x.isEmpty()) {
            this.f9507z = kVar;
        } else {
            k M = M();
            if (M instanceof h) {
                ((h) M).z(kVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public c F(long j10) {
        N(new p((Number) Long.valueOf(j10)));
        return this;
    }

    public c G(Boolean bool) {
        if (bool == null) {
            return r();
        }
        N(new p(bool));
        return this;
    }

    public c H(Number number) {
        if (number == null) {
            return r();
        }
        if (!o()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        N(new p(number));
        return this;
    }

    public c I(String str) {
        if (str == null) {
            return r();
        }
        N(new p(str));
        return this;
    }

    public c J(boolean z9) {
        N(new p(Boolean.valueOf(z9)));
        return this;
    }

    public k L() {
        if (this.f9505x.isEmpty()) {
            return this.f9507z;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f9505x);
    }

    public void close() {
        if (this.f9505x.isEmpty()) {
            this.f9505x.add(B);
            return;
        }
        throw new IOException("Incomplete document");
    }

    public c e() {
        h hVar = new h();
        N(hVar);
        this.f9505x.add(hVar);
        return this;
    }

    public void flush() {
    }

    public c g() {
        n nVar = new n();
        N(nVar);
        this.f9505x.add(nVar);
        return this;
    }

    public c k() {
        if (this.f9505x.isEmpty() || this.f9506y != null) {
            throw new IllegalStateException();
        } else if (M() instanceof h) {
            List<k> list = this.f9505x;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public c l() {
        if (this.f9505x.isEmpty() || this.f9506y != null) {
            throw new IllegalStateException();
        } else if (M() instanceof n) {
            List<k> list = this.f9505x;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public c p(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f9505x.isEmpty() || this.f9506y != null) {
            throw new IllegalStateException();
        } else if (M() instanceof n) {
            this.f9506y = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public c r() {
        N(m.f7529a);
        return this;
    }
}
