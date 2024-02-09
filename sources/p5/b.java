package p5;

import java.util.Map;
import o5.c;
import o5.e;
import o5.l;
import o5.n;

public final class b implements l {
    public void c() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005e A[LOOP:0: B:29:0x005c->B:30:0x005e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o5.n d(o5.c r11, java.util.Map<o5.e, ?> r12) {
        /*
            r10 = this;
            r5.a r0 = new r5.a
            u5.b r11 = r11.a()
            r0.<init>(r11)
            r11 = 0
            r1 = 0
            p5.a r2 = r0.a(r11)     // Catch:{ j -> 0x002b, f -> 0x0025 }
            o5.p[] r3 = r2.b()     // Catch:{ j -> 0x002b, f -> 0x0025 }
            q5.a r4 = new q5.a     // Catch:{ j -> 0x0023, f -> 0x0021 }
            r4.<init>()     // Catch:{ j -> 0x0023, f -> 0x0021 }
            u5.e r2 = r4.c(r2)     // Catch:{ j -> 0x0023, f -> 0x0021 }
            r4 = r3
            r3 = r1
            r1 = r2
            r2 = r3
            goto L_0x002f
        L_0x0021:
            r2 = move-exception
            goto L_0x0027
        L_0x0023:
            r2 = move-exception
            goto L_0x002d
        L_0x0025:
            r2 = move-exception
            r3 = r1
        L_0x0027:
            r4 = r3
            r3 = r2
            r2 = r1
            goto L_0x002f
        L_0x002b:
            r2 = move-exception
            r3 = r1
        L_0x002d:
            r4 = r3
            r3 = r1
        L_0x002f:
            if (r1 != 0) goto L_0x004e
            r1 = 1
            p5.a r0 = r0.a(r1)     // Catch:{ j -> 0x0046, f -> 0x0044 }
            o5.p[] r4 = r0.b()     // Catch:{ j -> 0x0046, f -> 0x0044 }
            q5.a r1 = new q5.a     // Catch:{ j -> 0x0046, f -> 0x0044 }
            r1.<init>()     // Catch:{ j -> 0x0046, f -> 0x0044 }
            u5.e r1 = r1.c(r0)     // Catch:{ j -> 0x0046, f -> 0x0044 }
            goto L_0x004e
        L_0x0044:
            r11 = move-exception
            goto L_0x0047
        L_0x0046:
            r11 = move-exception
        L_0x0047:
            if (r2 != 0) goto L_0x004d
            if (r3 == 0) goto L_0x004c
            throw r3
        L_0x004c:
            throw r11
        L_0x004d:
            throw r2
        L_0x004e:
            r6 = r4
            if (r12 == 0) goto L_0x0066
            o5.e r0 = o5.e.NEED_RESULT_POINT_CALLBACK
            java.lang.Object r12 = r12.get(r0)
            o5.q r12 = (o5.q) r12
            if (r12 == 0) goto L_0x0066
            int r0 = r6.length
        L_0x005c:
            if (r11 >= r0) goto L_0x0066
            r2 = r6[r11]
            r12.a(r2)
            int r11 = r11 + 1
            goto L_0x005c
        L_0x0066:
            o5.n r11 = new o5.n
            java.lang.String r3 = r1.i()
            byte[] r4 = r1.e()
            int r5 = r1.c()
            o5.a r7 = o5.a.AZTEC
            long r8 = java.lang.System.currentTimeMillis()
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.util.List r12 = r1.a()
            if (r12 == 0) goto L_0x0089
            o5.o r0 = o5.o.BYTE_SEGMENTS
            r11.h(r0, r12)
        L_0x0089:
            java.lang.String r12 = r1.b()
            if (r12 == 0) goto L_0x0094
            o5.o r0 = o5.o.ERROR_CORRECTION_LEVEL
            r11.h(r0, r12)
        L_0x0094:
            o5.o r12 = o5.o.SYMBOLOGY_IDENTIFIER
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "]z"
            r0.append(r2)
            int r1 = r1.h()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r11.h(r12, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.b.d(o5.c, java.util.Map):o5.n");
    }

    public n e(c cVar) {
        return d(cVar, (Map<e, ?>) null);
    }
}
