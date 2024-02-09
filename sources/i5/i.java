package i5;

import com.google.gson.e;
import com.google.gson.s;
import com.google.gson.u;
import com.google.gson.v;
import com.google.gson.w;
import com.google.gson.x;
import n5.c;

public final class i extends w<Number> {

    /* renamed from: b  reason: collision with root package name */
    private static final x f9514b = g(u.LAZILY_PARSED_NUMBER);

    /* renamed from: a  reason: collision with root package name */
    private final v f9515a;

    class a implements x {
        a() {
        }

        public <T> w<T> create(e eVar, m5.a<T> aVar) {
            if (aVar.c() == Number.class) {
                return i.this;
            }
            return null;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9517a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                n5.b[] r0 = n5.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9517a = r0
                n5.b r1 = n5.b.NULL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9517a     // Catch:{ NoSuchFieldError -> 0x001d }
                n5.b r1 = n5.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9517a     // Catch:{ NoSuchFieldError -> 0x0028 }
                n5.b r1 = n5.b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i5.i.b.<clinit>():void");
        }
    }

    private i(v vVar) {
        this.f9515a = vVar;
    }

    public static x f(v vVar) {
        return vVar == u.LAZILY_PARSED_NUMBER ? f9514b : g(vVar);
    }

    private static x g(v vVar) {
        return new a();
    }

    /* renamed from: h */
    public Number c(n5.a aVar) {
        n5.b G = aVar.G();
        int i10 = b.f9517a[G.ordinal()];
        if (i10 == 1) {
            aVar.C();
            return null;
        } else if (i10 == 2 || i10 == 3) {
            return this.f9515a.readNumber(aVar);
        } else {
            throw new s("Expecting number, got: " + G);
        }
    }

    /* renamed from: i */
    public void e(c cVar, Number number) {
        cVar.H(number);
    }
}
