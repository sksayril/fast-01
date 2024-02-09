package com.amazonaws.util.json;

import java.io.EOFException;
import java.io.Reader;
import java.io.Writer;
import n5.a;
import n5.b;
import n5.c;

final class GsonFactory implements AwsJsonFactory {

    /* renamed from: com.amazonaws.util.json.GsonFactory$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f4776a;

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
                f4776a = r0
                n5.b r1 = n5.b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4776a     // Catch:{ NoSuchFieldError -> 0x001d }
                n5.b r1 = n5.b.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4776a     // Catch:{ NoSuchFieldError -> 0x0028 }
                n5.b r1 = n5.b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f4776a     // Catch:{ NoSuchFieldError -> 0x0033 }
                n5.b r1 = n5.b.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f4776a     // Catch:{ NoSuchFieldError -> 0x003e }
                n5.b r1 = n5.b.NAME     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f4776a     // Catch:{ NoSuchFieldError -> 0x0049 }
                n5.b r1 = n5.b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f4776a     // Catch:{ NoSuchFieldError -> 0x0054 }
                n5.b r1 = n5.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f4776a     // Catch:{ NoSuchFieldError -> 0x0060 }
                n5.b r1 = n5.b.NULL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f4776a     // Catch:{ NoSuchFieldError -> 0x006c }
                n5.b r1 = n5.b.STRING     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f4776a     // Catch:{ NoSuchFieldError -> 0x0078 }
                n5.b r1 = n5.b.END_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.util.json.GsonFactory.AnonymousClass1.<clinit>():void");
        }
    }

    private static final class GsonReader implements AwsJsonReader {

        /* renamed from: a  reason: collision with root package name */
        private final a f4777a;

        public GsonReader(Reader reader) {
            this.f4777a = new a(reader);
        }

        public void a() {
            this.f4777a.b();
        }

        public void b() {
            this.f4777a.l();
        }

        public String c() {
            b G = this.f4777a.G();
            if (!b.NULL.equals(G)) {
                return b.BOOLEAN.equals(G) ? this.f4777a.t() ? "true" : "false" : this.f4777a.E();
            }
            this.f4777a.C();
            return null;
        }

        public void close() {
            this.f4777a.close();
        }

        public void d() {
            this.f4777a.Q();
        }

        public boolean e() {
            b G = this.f4777a.G();
            return b.BEGIN_ARRAY.equals(G) || b.BEGIN_OBJECT.equals(G);
        }

        public AwsJsonToken f() {
            try {
                return GsonFactory.d(this.f4777a.G());
            } catch (EOFException unused) {
                return null;
            }
        }

        public String g() {
            return this.f4777a.z();
        }

        public boolean hasNext() {
            return this.f4777a.o();
        }
    }

    private static final class GsonWriter implements AwsJsonWriter {

        /* renamed from: a  reason: collision with root package name */
        private final c f4778a;

        public GsonWriter(Writer writer) {
            this.f4778a = new c(writer);
        }

        public AwsJsonWriter a() {
            this.f4778a.g();
            return this;
        }

        public AwsJsonWriter b() {
            this.f4778a.l();
            return this;
        }

        public AwsJsonWriter c(String str) {
            this.f4778a.I(str);
            return this;
        }

        public void close() {
            this.f4778a.close();
        }

        public AwsJsonWriter d(String str) {
            this.f4778a.p(str);
            return this;
        }
    }

    GsonFactory() {
    }

    /* access modifiers changed from: private */
    public static AwsJsonToken d(b bVar) {
        if (bVar == null) {
            return null;
        }
        switch (AnonymousClass1.f4776a[bVar.ordinal()]) {
            case 1:
                return AwsJsonToken.BEGIN_ARRAY;
            case 2:
                return AwsJsonToken.END_ARRAY;
            case 3:
                return AwsJsonToken.BEGIN_OBJECT;
            case 4:
                return AwsJsonToken.END_OBJECT;
            case 5:
                return AwsJsonToken.FIELD_NAME;
            case 6:
                return AwsJsonToken.VALUE_BOOLEAN;
            case 7:
                return AwsJsonToken.VALUE_NUMBER;
            case 8:
                return AwsJsonToken.VALUE_NULL;
            case 9:
                return AwsJsonToken.VALUE_STRING;
            case 10:
                return null;
            default:
                return AwsJsonToken.UNKNOWN;
        }
    }

    public AwsJsonWriter a(Writer writer) {
        return new GsonWriter(writer);
    }

    public AwsJsonReader b(Reader reader) {
        return new GsonReader(reader);
    }
}
