package i5;

import com.google.gson.e;
import com.google.gson.u;
import com.google.gson.v;
import com.google.gson.w;
import com.google.gson.x;
import h5.h;
import java.util.ArrayList;
import n5.c;

public final class j extends w<Object> {

    /* renamed from: c  reason: collision with root package name */
    private static final x f9518c = g(u.DOUBLE);

    /* renamed from: a  reason: collision with root package name */
    private final e f9519a;

    /* renamed from: b  reason: collision with root package name */
    private final v f9520b;

    class a implements x {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ v f9521m;

        a(v vVar) {
            this.f9521m = vVar;
        }

        public <T> w<T> create(e eVar, m5.a<T> aVar) {
            if (aVar.c() == Object.class) {
                return new j(eVar, this.f9521m, (a) null);
            }
            return null;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9522a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                n5.b[] r0 = n5.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9522a = r0
                n5.b r1 = n5.b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9522a     // Catch:{ NoSuchFieldError -> 0x001d }
                n5.b r1 = n5.b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9522a     // Catch:{ NoSuchFieldError -> 0x0028 }
                n5.b r1 = n5.b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9522a     // Catch:{ NoSuchFieldError -> 0x0033 }
                n5.b r1 = n5.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f9522a     // Catch:{ NoSuchFieldError -> 0x003e }
                n5.b r1 = n5.b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f9522a     // Catch:{ NoSuchFieldError -> 0x0049 }
                n5.b r1 = n5.b.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i5.j.b.<clinit>():void");
        }
    }

    private j(e eVar, v vVar) {
        this.f9519a = eVar;
        this.f9520b = vVar;
    }

    /* synthetic */ j(e eVar, v vVar, a aVar) {
        this(eVar, vVar);
    }

    public static x f(v vVar) {
        return vVar == u.DOUBLE ? f9518c : g(vVar);
    }

    private static x g(v vVar) {
        return new a(vVar);
    }

    public Object c(n5.a aVar) {
        switch (b.f9522a[aVar.G().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.o()) {
                    arrayList.add(c(aVar));
                }
                aVar.k();
                return arrayList;
            case 2:
                h hVar = new h();
                aVar.b();
                while (aVar.o()) {
                    hVar.put(aVar.z(), c(aVar));
                }
                aVar.l();
                return hVar;
            case 3:
                return aVar.E();
            case 4:
                return this.f9520b.readNumber(aVar);
            case 5:
                return Boolean.valueOf(aVar.t());
            case 6:
                aVar.C();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    public void e(c cVar, Object obj) {
        if (obj == null) {
            cVar.r();
            return;
        }
        w<?> k10 = this.f9519a.k(obj.getClass());
        if (k10 instanceof j) {
            cVar.g();
            cVar.l();
            return;
        }
        k10.e(cVar, obj);
    }
}
