package com.google.gson;

import h5.g;
import java.math.BigDecimal;

public enum u implements v {
    DOUBLE {
        public Double readNumber(n5.a aVar) {
            return Double.valueOf(aVar.u());
        }
    },
    LAZILY_PARSED_NUMBER {
        public Number readNumber(n5.a aVar) {
            return new g(aVar.E());
        }
    },
    LONG_OR_DOUBLE {
        /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|(2:12|13)(1:11)) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
            return r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
            throw new n5.d("JSON forbids NaN and infinities: " + r2 + "; at path " + r7.n());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0068, code lost:
            throw new com.google.gson.o("Cannot parse " + r1 + "; at path " + r7.n(), r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
            r2 = java.lang.Double.valueOf(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r2.isInfinite() != false) goto L_0x001f;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Number readNumber(n5.a r7) {
            /*
                r6 = this;
                java.lang.String r0 = "; at path "
                java.lang.String r1 = r7.E()
                long r2 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x000f }
                java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch:{ NumberFormatException -> 0x000f }
                return r7
            L_0x000f:
                java.lang.Double r2 = java.lang.Double.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0047 }
                boolean r3 = r2.isInfinite()     // Catch:{ NumberFormatException -> 0x0047 }
                if (r3 != 0) goto L_0x001f
                boolean r3 = r2.isNaN()     // Catch:{ NumberFormatException -> 0x0047 }
                if (r3 == 0) goto L_0x0025
            L_0x001f:
                boolean r3 = r7.p()     // Catch:{ NumberFormatException -> 0x0047 }
                if (r3 == 0) goto L_0x0026
            L_0x0025:
                return r2
            L_0x0026:
                n5.d r3 = new n5.d     // Catch:{ NumberFormatException -> 0x0047 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0047 }
                r4.<init>()     // Catch:{ NumberFormatException -> 0x0047 }
                java.lang.String r5 = "JSON forbids NaN and infinities: "
                r4.append(r5)     // Catch:{ NumberFormatException -> 0x0047 }
                r4.append(r2)     // Catch:{ NumberFormatException -> 0x0047 }
                r4.append(r0)     // Catch:{ NumberFormatException -> 0x0047 }
                java.lang.String r2 = r7.n()     // Catch:{ NumberFormatException -> 0x0047 }
                r4.append(r2)     // Catch:{ NumberFormatException -> 0x0047 }
                java.lang.String r2 = r4.toString()     // Catch:{ NumberFormatException -> 0x0047 }
                r3.<init>(r2)     // Catch:{ NumberFormatException -> 0x0047 }
                throw r3     // Catch:{ NumberFormatException -> 0x0047 }
            L_0x0047:
                r2 = move-exception
                com.google.gson.o r3 = new com.google.gson.o
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Cannot parse "
                r4.append(r5)
                r4.append(r1)
                r4.append(r0)
                java.lang.String r7 = r7.n()
                r4.append(r7)
                java.lang.String r7 = r4.toString()
                r3.<init>(r7, r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.u.c.readNumber(n5.a):java.lang.Number");
        }
    },
    BIG_DECIMAL {
        public BigDecimal readNumber(n5.a aVar) {
            String E = aVar.E();
            try {
                return new BigDecimal(E);
            } catch (NumberFormatException e10) {
                throw new o("Cannot parse " + E + "; at path " + aVar.n(), e10);
            }
        }
    };
}
