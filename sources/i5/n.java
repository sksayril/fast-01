package i5;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class n {
    public static final com.google.gson.w<BigInteger> A = new h();
    public static final com.google.gson.x B;
    public static final com.google.gson.w<StringBuilder> C;
    public static final com.google.gson.x D;
    public static final com.google.gson.w<StringBuffer> E;
    public static final com.google.gson.x F;
    public static final com.google.gson.w<URL> G;
    public static final com.google.gson.x H;
    public static final com.google.gson.w<URI> I;
    public static final com.google.gson.x J;
    public static final com.google.gson.w<InetAddress> K;
    public static final com.google.gson.x L;
    public static final com.google.gson.w<UUID> M;
    public static final com.google.gson.x N;
    public static final com.google.gson.w<Currency> O;
    public static final com.google.gson.x P;
    public static final com.google.gson.w<Calendar> Q;
    public static final com.google.gson.x R;
    public static final com.google.gson.w<Locale> S;
    public static final com.google.gson.x T;
    public static final com.google.gson.w<com.google.gson.k> U;
    public static final com.google.gson.x V;
    public static final com.google.gson.x W = new t();

    /* renamed from: a  reason: collision with root package name */
    public static final com.google.gson.w<Class> f9556a;

    /* renamed from: b  reason: collision with root package name */
    public static final com.google.gson.x f9557b;

    /* renamed from: c  reason: collision with root package name */
    public static final com.google.gson.w<BitSet> f9558c;

    /* renamed from: d  reason: collision with root package name */
    public static final com.google.gson.x f9559d;

    /* renamed from: e  reason: collision with root package name */
    public static final com.google.gson.w<Boolean> f9560e;

    /* renamed from: f  reason: collision with root package name */
    public static final com.google.gson.w<Boolean> f9561f = new c0();

    /* renamed from: g  reason: collision with root package name */
    public static final com.google.gson.x f9562g;

    /* renamed from: h  reason: collision with root package name */
    public static final com.google.gson.w<Number> f9563h;

    /* renamed from: i  reason: collision with root package name */
    public static final com.google.gson.x f9564i;

    /* renamed from: j  reason: collision with root package name */
    public static final com.google.gson.w<Number> f9565j;

    /* renamed from: k  reason: collision with root package name */
    public static final com.google.gson.x f9566k;

    /* renamed from: l  reason: collision with root package name */
    public static final com.google.gson.w<Number> f9567l;

    /* renamed from: m  reason: collision with root package name */
    public static final com.google.gson.x f9568m;

    /* renamed from: n  reason: collision with root package name */
    public static final com.google.gson.w<AtomicInteger> f9569n;

    /* renamed from: o  reason: collision with root package name */
    public static final com.google.gson.x f9570o;

    /* renamed from: p  reason: collision with root package name */
    public static final com.google.gson.w<AtomicBoolean> f9571p;

    /* renamed from: q  reason: collision with root package name */
    public static final com.google.gson.x f9572q;

    /* renamed from: r  reason: collision with root package name */
    public static final com.google.gson.w<AtomicIntegerArray> f9573r;

    /* renamed from: s  reason: collision with root package name */
    public static final com.google.gson.x f9574s;

    /* renamed from: t  reason: collision with root package name */
    public static final com.google.gson.w<Number> f9575t = new b();

    /* renamed from: u  reason: collision with root package name */
    public static final com.google.gson.w<Number> f9576u = new c();

    /* renamed from: v  reason: collision with root package name */
    public static final com.google.gson.w<Number> f9577v = new d();

    /* renamed from: w  reason: collision with root package name */
    public static final com.google.gson.w<Character> f9578w;

    /* renamed from: x  reason: collision with root package name */
    public static final com.google.gson.x f9579x;

    /* renamed from: y  reason: collision with root package name */
    public static final com.google.gson.w<String> f9580y;

    /* renamed from: z  reason: collision with root package name */
    public static final com.google.gson.w<BigDecimal> f9581z = new g();

    class a extends com.google.gson.w<AtomicIntegerArray> {
        a() {
        }

        /* renamed from: f */
        public AtomicIntegerArray c(n5.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.o()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.w()));
                } catch (NumberFormatException e10) {
                    throw new com.google.gson.s((Throwable) e10);
                }
            }
            aVar.k();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
            }
            return atomicIntegerArray;
        }

        /* renamed from: g */
        public void e(n5.c cVar, AtomicIntegerArray atomicIntegerArray) {
            cVar.e();
            int length = atomicIntegerArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                cVar.F((long) atomicIntegerArray.get(i10));
            }
            cVar.k();
        }
    }

    static /* synthetic */ class a0 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9582a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                n5.b[] r0 = n5.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9582a = r0
                n5.b r1 = n5.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9582a     // Catch:{ NoSuchFieldError -> 0x001d }
                n5.b r1 = n5.b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9582a     // Catch:{ NoSuchFieldError -> 0x0028 }
                n5.b r1 = n5.b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9582a     // Catch:{ NoSuchFieldError -> 0x0033 }
                n5.b r1 = n5.b.NULL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f9582a     // Catch:{ NoSuchFieldError -> 0x003e }
                n5.b r1 = n5.b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f9582a     // Catch:{ NoSuchFieldError -> 0x0049 }
                n5.b r1 = n5.b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f9582a     // Catch:{ NoSuchFieldError -> 0x0054 }
                n5.b r1 = n5.b.END_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f9582a     // Catch:{ NoSuchFieldError -> 0x0060 }
                n5.b r1 = n5.b.NAME     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f9582a     // Catch:{ NoSuchFieldError -> 0x006c }
                n5.b r1 = n5.b.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f9582a     // Catch:{ NoSuchFieldError -> 0x0078 }
                n5.b r1 = n5.b.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i5.n.a0.<clinit>():void");
        }
    }

    class b extends com.google.gson.w<Number> {
        b() {
        }

        /* renamed from: f */
        public Number c(n5.a aVar) {
            if (aVar.G() == n5.b.NULL) {
                aVar.C();
                return null;
            }
            try {
                return Long.valueOf(aVar.y());
            } catch (NumberFormatException e10) {
                throw new com.google.gson.s((Throwable) e10);
            }
        }

        /* renamed from: g */
        public void e(n5.c cVar, Number number) {
            cVar.H(number);
        }
    }

    class b0 extends com.google.gson.w<Boolean> {
        b0() {
        }

        /* renamed from: f */
        public Boolean c(n5.a aVar) {
            n5.b G = aVar.G();
            if (G != n5.b.NULL) {
                return G == n5.b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.E())) : Boolean.valueOf(aVar.t());
            }
            aVar.C();
            return null;
        }

        /* renamed from: g */
        public void e(n5.c cVar, Boolean bool) {
            cVar.G(bool);
        }
    }

    class c extends com.google.gson.w<Number> {
        c() {
        }

        /* renamed from: f */
        public Number c(n5.a aVar) {
            if (aVar.G() != n5.b.NULL) {
                return Float.valueOf((float) aVar.u());
            }
            aVar.C();
            return null;
        }

        /* renamed from: g */
        public void e(n5.c cVar, Number number) {
            cVar.H(number);
        }
    }

    class c0 extends com.google.gson.w<Boolean> {
        c0() {
        }

        /* renamed from: f */
        public Boolean c(n5.a aVar) {
            if (aVar.G() != n5.b.NULL) {
                return Boolean.valueOf(aVar.E());
            }
            aVar.C();
            return null;
        }

        /* renamed from: g */
        public void e(n5.c cVar, Boolean bool) {
            cVar.I(bool == null ? "null" : bool.toString());
        }
    }

    class d extends com.google.gson.w<Number> {
        d() {
        }

        /* renamed from: f */
        public Number c(n5.a aVar) {
            if (aVar.G() != n5.b.NULL) {
                return Double.valueOf(aVar.u());
            }
            aVar.C();
            return null;
        }

        /* renamed from: g */
        public void e(n5.c cVar, Number number) {
            cVar.H(number);
        }
    }

    class d0 extends com.google.gson.w<Number> {
        d0() {
        }

        /* renamed from: f */
        public Number c(n5.a aVar) {
            if (aVar.G() == n5.b.NULL) {
                aVar.C();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.w());
            } catch (NumberFormatException e10) {
                throw new com.google.gson.s((Throwable) e10);
            }
        }

        /* renamed from: g */
        public void e(n5.c cVar, Number number) {
            cVar.H(number);
        }
    }

    class e extends com.google.gson.w<Character> {
        e() {
        }

        /* renamed from: f */
        public Character c(n5.a aVar) {
            if (aVar.G() == n5.b.NULL) {
                aVar.C();
                return null;
            }
            String E = aVar.E();
            if (E.length() == 1) {
                return Character.valueOf(E.charAt(0));
            }
            throw new com.google.gson.s("Expecting character, got: " + E);
        }

        /* renamed from: g */
        public void e(n5.c cVar, Character ch) {
            cVar.I(ch == null ? null : String.valueOf(ch));
        }
    }

    class e0 extends com.google.gson.w<Number> {
        e0() {
        }

        /* renamed from: f */
        public Number c(n5.a aVar) {
            if (aVar.G() == n5.b.NULL) {
                aVar.C();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.w());
            } catch (NumberFormatException e10) {
                throw new com.google.gson.s((Throwable) e10);
            }
        }

        /* renamed from: g */
        public void e(n5.c cVar, Number number) {
            cVar.H(number);
        }
    }

    class f extends com.google.gson.w<String> {
        f() {
        }

        /* renamed from: f */
        public String c(n5.a aVar) {
            n5.b G = aVar.G();
            if (G != n5.b.NULL) {
                return G == n5.b.BOOLEAN ? Boolean.toString(aVar.t()) : aVar.E();
            }
            aVar.C();
            return null;
        }

        /* renamed from: g */
        public void e(n5.c cVar, String str) {
            cVar.I(str);
        }
    }

    class f0 extends com.google.gson.w<Number> {
        f0() {
        }

        /* renamed from: f */
        public Number c(n5.a aVar) {
            if (aVar.G() == n5.b.NULL) {
                aVar.C();
                return null;
            }
            try {
                return Integer.valueOf(aVar.w());
            } catch (NumberFormatException e10) {
                throw new com.google.gson.s((Throwable) e10);
            }
        }

        /* renamed from: g */
        public void e(n5.c cVar, Number number) {
            cVar.H(number);
        }
    }

    class g extends com.google.gson.w<BigDecimal> {
        g() {
        }

        /* renamed from: f */
        public BigDecimal c(n5.a aVar) {
            if (aVar.G() == n5.b.NULL) {
                aVar.C();
                return null;
            }
            try {
                return new BigDecimal(aVar.E());
            } catch (NumberFormatException e10) {
                throw new com.google.gson.s((Throwable) e10);
            }
        }

        /* renamed from: g */
        public void e(n5.c cVar, BigDecimal bigDecimal) {
            cVar.H(bigDecimal);
        }
    }

    class g0 extends com.google.gson.w<AtomicInteger> {
        g0() {
        }

        /* renamed from: f */
        public AtomicInteger c(n5.a aVar) {
            try {
                return new AtomicInteger(aVar.w());
            } catch (NumberFormatException e10) {
                throw new com.google.gson.s((Throwable) e10);
            }
        }

        /* renamed from: g */
        public void e(n5.c cVar, AtomicInteger atomicInteger) {
            cVar.F((long) atomicInteger.get());
        }
    }

    class h extends com.google.gson.w<BigInteger> {
        h() {
        }

        /* renamed from: f */
        public BigInteger c(n5.a aVar) {
            if (aVar.G() == n5.b.NULL) {
                aVar.C();
                return null;
            }
            try {
                return new BigInteger(aVar.E());
            } catch (NumberFormatException e10) {
                throw new com.google.gson.s((Throwable) e10);
            }
        }

        /* renamed from: g */
        public void e(n5.c cVar, BigInteger bigInteger) {
            cVar.H(bigInteger);
        }
    }

    class h0 extends com.google.gson.w<AtomicBoolean> {
        h0() {
        }

        /* renamed from: f */
        public AtomicBoolean c(n5.a aVar) {
            return new AtomicBoolean(aVar.t());
        }

        /* renamed from: g */
        public void e(n5.c cVar, AtomicBoolean atomicBoolean) {
            cVar.J(atomicBoolean.get());
        }
    }

    class i extends com.google.gson.w<StringBuilder> {
        i() {
        }

        /* renamed from: f */
        public StringBuilder c(n5.a aVar) {
            if (aVar.G() != n5.b.NULL) {
                return new StringBuilder(aVar.E());
            }
            aVar.C();
            return null;
        }

        /* renamed from: g */
        public void e(n5.c cVar, StringBuilder sb) {
            cVar.I(sb == null ? null : sb.toString());
        }
    }

    private static final class i0<T extends Enum<T>> extends com.google.gson.w<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, T> f9583a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        private final Map<T, String> f9584b = new HashMap();

        class a implements PrivilegedAction<Void> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Field f9585a;

            a(Field field) {
                this.f9585a = field;
            }

            /* renamed from: a */
            public Void run() {
                this.f9585a.setAccessible(true);
                return null;
            }
        }

        public i0(Class<T> cls) {
            try {
                for (Field field : cls.getDeclaredFields()) {
                    if (field.isEnumConstant()) {
                        AccessController.doPrivileged(new a(field));
                        Enum enumR = (Enum) field.get((Object) null);
                        String name = enumR.name();
                        g5.c cVar = (g5.c) field.getAnnotation(g5.c.class);
                        if (cVar != null) {
                            name = cVar.value();
                            for (String put : cVar.alternate()) {
                                this.f9583a.put(put, enumR);
                            }
                        }
                        this.f9583a.put(name, enumR);
                        this.f9584b.put(enumR, name);
                    }
                }
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        /* renamed from: f */
        public T c(n5.a aVar) {
            if (aVar.G() != n5.b.NULL) {
                return (Enum) this.f9583a.get(aVar.E());
            }
            aVar.C();
            return null;
        }

        /* renamed from: g */
        public void e(n5.c cVar, T t9) {
            cVar.I(t9 == null ? null : this.f9584b.get(t9));
        }
    }

    class j extends com.google.gson.w<StringBuffer> {
        j() {
        }

        /* renamed from: f */
        public StringBuffer c(n5.a aVar) {
            if (aVar.G() != n5.b.NULL) {
                return new StringBuffer(aVar.E());
            }
            aVar.C();
            return null;
        }

        /* renamed from: g */
        public void e(n5.c cVar, StringBuffer stringBuffer) {
            cVar.I(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    class k extends com.google.gson.w<Class> {
        k() {
        }

        /* renamed from: f */
        public Class c(n5.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        /* renamed from: g */
        public void e(n5.c cVar, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    class l extends com.google.gson.w<URL> {
        l() {
        }

        /* renamed from: f */
        public URL c(n5.a aVar) {
            if (aVar.G() == n5.b.NULL) {
                aVar.C();
                return null;
            }
            String E = aVar.E();
            if ("null".equals(E)) {
                return null;
            }
            return new URL(E);
        }

        /* renamed from: g */
        public void e(n5.c cVar, URL url) {
            cVar.I(url == null ? null : url.toExternalForm());
        }
    }

    class m extends com.google.gson.w<URI> {
        m() {
        }

        /* renamed from: f */
        public URI c(n5.a aVar) {
            if (aVar.G() == n5.b.NULL) {
                aVar.C();
                return null;
            }
            try {
                String E = aVar.E();
                if ("null".equals(E)) {
                    return null;
                }
                return new URI(E);
            } catch (URISyntaxException e10) {
                throw new com.google.gson.l((Throwable) e10);
            }
        }

        /* renamed from: g */
        public void e(n5.c cVar, URI uri) {
            cVar.I(uri == null ? null : uri.toASCIIString());
        }
    }

    /* renamed from: i5.n$n  reason: collision with other inner class name */
    class C0149n extends com.google.gson.w<InetAddress> {
        C0149n() {
        }

        /* renamed from: f */
        public InetAddress c(n5.a aVar) {
            if (aVar.G() != n5.b.NULL) {
                return InetAddress.getByName(aVar.E());
            }
            aVar.C();
            return null;
        }

        /* renamed from: g */
        public void e(n5.c cVar, InetAddress inetAddress) {
            cVar.I(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    class o extends com.google.gson.w<UUID> {
        o() {
        }

        /* renamed from: f */
        public UUID c(n5.a aVar) {
            if (aVar.G() != n5.b.NULL) {
                return UUID.fromString(aVar.E());
            }
            aVar.C();
            return null;
        }

        /* renamed from: g */
        public void e(n5.c cVar, UUID uuid) {
            cVar.I(uuid == null ? null : uuid.toString());
        }
    }

    class p extends com.google.gson.w<Currency> {
        p() {
        }

        /* renamed from: f */
        public Currency c(n5.a aVar) {
            return Currency.getInstance(aVar.E());
        }

        /* renamed from: g */
        public void e(n5.c cVar, Currency currency) {
            cVar.I(currency.getCurrencyCode());
        }
    }

    class q extends com.google.gson.w<Calendar> {
        q() {
        }

        /* renamed from: f */
        public Calendar c(n5.a aVar) {
            if (aVar.G() == n5.b.NULL) {
                aVar.C();
                return null;
            }
            aVar.b();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (aVar.G() != n5.b.END_OBJECT) {
                String z9 = aVar.z();
                int w9 = aVar.w();
                if ("year".equals(z9)) {
                    i10 = w9;
                } else if ("month".equals(z9)) {
                    i11 = w9;
                } else if ("dayOfMonth".equals(z9)) {
                    i12 = w9;
                } else if ("hourOfDay".equals(z9)) {
                    i13 = w9;
                } else if ("minute".equals(z9)) {
                    i14 = w9;
                } else if ("second".equals(z9)) {
                    i15 = w9;
                }
            }
            aVar.l();
            return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
        }

        /* renamed from: g */
        public void e(n5.c cVar, Calendar calendar) {
            if (calendar == null) {
                cVar.r();
                return;
            }
            cVar.g();
            cVar.p("year");
            cVar.F((long) calendar.get(1));
            cVar.p("month");
            cVar.F((long) calendar.get(2));
            cVar.p("dayOfMonth");
            cVar.F((long) calendar.get(5));
            cVar.p("hourOfDay");
            cVar.F((long) calendar.get(11));
            cVar.p("minute");
            cVar.F((long) calendar.get(12));
            cVar.p("second");
            cVar.F((long) calendar.get(13));
            cVar.l();
        }
    }

    class r extends com.google.gson.w<Locale> {
        r() {
        }

        /* renamed from: f */
        public Locale c(n5.a aVar) {
            Locale locale;
            String str = null;
            if (aVar.G() == n5.b.NULL) {
                aVar.C();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.E(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            }
            if (nextToken2 == null && str == null) {
                return new Locale(nextToken);
            }
            if (str == null) {
                return locale;
            }
            locale = new Locale(nextToken, nextToken2, str);
            return locale;
        }

        /* renamed from: g */
        public void e(n5.c cVar, Locale locale) {
            cVar.I(locale == null ? null : locale.toString());
        }
    }

    class s extends com.google.gson.w<com.google.gson.k> {
        s() {
        }

        /* renamed from: f */
        public com.google.gson.k c(n5.a aVar) {
            if (aVar instanceof f) {
                return ((f) aVar).T();
            }
            switch (a0.f9582a[aVar.G().ordinal()]) {
                case 1:
                    return new com.google.gson.p((Number) new h5.g(aVar.E()));
                case 2:
                    return new com.google.gson.p(Boolean.valueOf(aVar.t()));
                case 3:
                    return new com.google.gson.p(aVar.E());
                case 4:
                    aVar.C();
                    return com.google.gson.m.f7529a;
                case 5:
                    com.google.gson.h hVar = new com.google.gson.h();
                    aVar.a();
                    while (aVar.o()) {
                        hVar.z(c(aVar));
                    }
                    aVar.k();
                    return hVar;
                case 6:
                    com.google.gson.n nVar = new com.google.gson.n();
                    aVar.b();
                    while (aVar.o()) {
                        nVar.z(aVar.z(), c(aVar));
                    }
                    aVar.l();
                    return nVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        /* renamed from: g */
        public void e(n5.c cVar, com.google.gson.k kVar) {
            if (kVar == null || kVar.l()) {
                cVar.r();
            } else if (kVar.y()) {
                com.google.gson.p g10 = kVar.g();
                if (g10.F()) {
                    cVar.H(g10.C());
                } else if (g10.D()) {
                    cVar.J(g10.c());
                } else {
                    cVar.I(g10.i());
                }
            } else if (kVar.k()) {
                cVar.e();
                Iterator<com.google.gson.k> it = kVar.d().iterator();
                while (it.hasNext()) {
                    e(cVar, it.next());
                }
                cVar.k();
            } else if (kVar.o()) {
                cVar.g();
                for (Map.Entry next : kVar.f().A()) {
                    cVar.p((String) next.getKey());
                    e(cVar, (com.google.gson.k) next.getValue());
                }
                cVar.l();
            } else {
                throw new IllegalArgumentException("Couldn't write " + kVar.getClass());
            }
        }
    }

    class t implements com.google.gson.x {
        t() {
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [m5.a, m5.a<T>] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <T> com.google.gson.w<T> create(com.google.gson.e r2, m5.a<T> r3) {
            /*
                r1 = this;
                java.lang.Class<java.lang.Enum> r2 = java.lang.Enum.class
                java.lang.Class r3 = r3.c()
                boolean r0 = r2.isAssignableFrom(r3)
                if (r0 == 0) goto L_0x001f
                if (r3 != r2) goto L_0x000f
                goto L_0x001f
            L_0x000f:
                boolean r2 = r3.isEnum()
                if (r2 != 0) goto L_0x0019
                java.lang.Class r3 = r3.getSuperclass()
            L_0x0019:
                i5.n$i0 r2 = new i5.n$i0
                r2.<init>(r3)
                return r2
            L_0x001f:
                r2 = 0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: i5.n.t.create(com.google.gson.e, m5.a):com.google.gson.w");
        }
    }

    class u implements com.google.gson.x {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ m5.a f9587m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ com.google.gson.w f9588n;

        u(m5.a aVar, com.google.gson.w wVar) {
            this.f9587m = aVar;
            this.f9588n = wVar;
        }

        public <T> com.google.gson.w<T> create(com.google.gson.e eVar, m5.a<T> aVar) {
            if (aVar.equals(this.f9587m)) {
                return this.f9588n;
            }
            return null;
        }
    }

    class v extends com.google.gson.w<BitSet> {
        v() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L_0x0069;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
            if (r8.w() != 0) goto L_0x0069;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x006e A[SYNTHETIC] */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.BitSet c(n5.a r8) {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.a()
                n5.b r1 = r8.G()
                r2 = 0
                r3 = 0
            L_0x000e:
                n5.b r4 = n5.b.END_ARRAY
                if (r1 == r4) goto L_0x0075
                int[] r4 = i5.n.a0.f9582a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L_0x0063
                r6 = 2
                if (r4 == r6) goto L_0x005e
                r6 = 3
                if (r4 != r6) goto L_0x0047
                java.lang.String r1 = r8.E()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0030 }
                if (r1 == 0) goto L_0x002e
                goto L_0x0069
            L_0x002e:
                r5 = 0
                goto L_0x0069
            L_0x0030:
                com.google.gson.s r8 = new com.google.gson.s
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>((java.lang.String) r0)
                throw r8
            L_0x0047:
                com.google.gson.s r8 = new com.google.gson.s
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>((java.lang.String) r0)
                throw r8
            L_0x005e:
                boolean r5 = r8.t()
                goto L_0x0069
            L_0x0063:
                int r1 = r8.w()
                if (r1 == 0) goto L_0x002e
            L_0x0069:
                if (r5 == 0) goto L_0x006e
                r0.set(r3)
            L_0x006e:
                int r3 = r3 + 1
                n5.b r1 = r8.G()
                goto L_0x000e
            L_0x0075:
                r8.k()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: i5.n.v.c(n5.a):java.util.BitSet");
        }

        /* renamed from: g */
        public void e(n5.c cVar, BitSet bitSet) {
            cVar.e();
            int length = bitSet.length();
            for (int i10 = 0; i10 < length; i10++) {
                cVar.F(bitSet.get(i10) ? 1 : 0);
            }
            cVar.k();
        }
    }

    class w implements com.google.gson.x {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Class f9589m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ com.google.gson.w f9590n;

        w(Class cls, com.google.gson.w wVar) {
            this.f9589m = cls;
            this.f9590n = wVar;
        }

        public <T> com.google.gson.w<T> create(com.google.gson.e eVar, m5.a<T> aVar) {
            if (aVar.c() == this.f9589m) {
                return this.f9590n;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f9589m.getName() + ",adapter=" + this.f9590n + "]";
        }
    }

    class x implements com.google.gson.x {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Class f9591m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Class f9592n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ com.google.gson.w f9593o;

        x(Class cls, Class cls2, com.google.gson.w wVar) {
            this.f9591m = cls;
            this.f9592n = cls2;
            this.f9593o = wVar;
        }

        public <T> com.google.gson.w<T> create(com.google.gson.e eVar, m5.a<T> aVar) {
            Class<? super T> c10 = aVar.c();
            if (c10 == this.f9591m || c10 == this.f9592n) {
                return this.f9593o;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f9592n.getName() + "+" + this.f9591m.getName() + ",adapter=" + this.f9593o + "]";
        }
    }

    class y implements com.google.gson.x {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Class f9594m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Class f9595n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ com.google.gson.w f9596o;

        y(Class cls, Class cls2, com.google.gson.w wVar) {
            this.f9594m = cls;
            this.f9595n = cls2;
            this.f9596o = wVar;
        }

        public <T> com.google.gson.w<T> create(com.google.gson.e eVar, m5.a<T> aVar) {
            Class<? super T> c10 = aVar.c();
            if (c10 == this.f9594m || c10 == this.f9595n) {
                return this.f9596o;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f9594m.getName() + "+" + this.f9595n.getName() + ",adapter=" + this.f9596o + "]";
        }
    }

    class z implements com.google.gson.x {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Class f9597m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ com.google.gson.w f9598n;

        class a extends com.google.gson.w<T1> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Class f9599a;

            a(Class cls) {
                this.f9599a = cls;
            }

            public T1 c(n5.a aVar) {
                T1 c10 = z.this.f9598n.c(aVar);
                if (c10 == null || this.f9599a.isInstance(c10)) {
                    return c10;
                }
                throw new com.google.gson.s("Expected a " + this.f9599a.getName() + " but was " + c10.getClass().getName());
            }

            public void e(n5.c cVar, T1 t12) {
                z.this.f9598n.e(cVar, t12);
            }
        }

        z(Class cls, com.google.gson.w wVar) {
            this.f9597m = cls;
            this.f9598n = wVar;
        }

        public <T2> com.google.gson.w<T2> create(com.google.gson.e eVar, m5.a<T2> aVar) {
            Class<? super T2> c10 = aVar.c();
            if (!this.f9597m.isAssignableFrom(c10)) {
                return null;
            }
            return new a(c10);
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f9597m.getName() + ",adapter=" + this.f9598n + "]";
        }
    }

    static {
        com.google.gson.w<Class> b10 = new k().b();
        f9556a = b10;
        f9557b = a(Class.class, b10);
        com.google.gson.w<BitSet> b11 = new v().b();
        f9558c = b11;
        f9559d = a(BitSet.class, b11);
        b0 b0Var = new b0();
        f9560e = b0Var;
        f9562g = b(Boolean.TYPE, Boolean.class, b0Var);
        d0 d0Var = new d0();
        f9563h = d0Var;
        f9564i = b(Byte.TYPE, Byte.class, d0Var);
        e0 e0Var = new e0();
        f9565j = e0Var;
        f9566k = b(Short.TYPE, Short.class, e0Var);
        f0 f0Var = new f0();
        f9567l = f0Var;
        f9568m = b(Integer.TYPE, Integer.class, f0Var);
        com.google.gson.w<AtomicInteger> b12 = new g0().b();
        f9569n = b12;
        f9570o = a(AtomicInteger.class, b12);
        com.google.gson.w<AtomicBoolean> b13 = new h0().b();
        f9571p = b13;
        f9572q = a(AtomicBoolean.class, b13);
        com.google.gson.w<AtomicIntegerArray> b14 = new a().b();
        f9573r = b14;
        f9574s = a(AtomicIntegerArray.class, b14);
        e eVar = new e();
        f9578w = eVar;
        f9579x = b(Character.TYPE, Character.class, eVar);
        f fVar = new f();
        f9580y = fVar;
        B = a(String.class, fVar);
        i iVar = new i();
        C = iVar;
        D = a(StringBuilder.class, iVar);
        j jVar = new j();
        E = jVar;
        F = a(StringBuffer.class, jVar);
        l lVar = new l();
        G = lVar;
        H = a(URL.class, lVar);
        m mVar = new m();
        I = mVar;
        J = a(URI.class, mVar);
        C0149n nVar = new C0149n();
        K = nVar;
        L = e(InetAddress.class, nVar);
        o oVar = new o();
        M = oVar;
        N = a(UUID.class, oVar);
        com.google.gson.w<Currency> b15 = new p().b();
        O = b15;
        P = a(Currency.class, b15);
        q qVar = new q();
        Q = qVar;
        R = d(Calendar.class, GregorianCalendar.class, qVar);
        r rVar = new r();
        S = rVar;
        T = a(Locale.class, rVar);
        s sVar = new s();
        U = sVar;
        V = e(com.google.gson.k.class, sVar);
    }

    public static <TT> com.google.gson.x a(Class<TT> cls, com.google.gson.w<TT> wVar) {
        return new w(cls, wVar);
    }

    public static <TT> com.google.gson.x b(Class<TT> cls, Class<TT> cls2, com.google.gson.w<? super TT> wVar) {
        return new x(cls, cls2, wVar);
    }

    public static <TT> com.google.gson.x c(m5.a<TT> aVar, com.google.gson.w<TT> wVar) {
        return new u(aVar, wVar);
    }

    public static <TT> com.google.gson.x d(Class<TT> cls, Class<? extends TT> cls2, com.google.gson.w<? super TT> wVar) {
        return new y(cls, cls2, wVar);
    }

    public static <T1> com.google.gson.x e(Class<T1> cls, com.google.gson.w<T1> wVar) {
        return new z(cls, wVar);
    }
}
