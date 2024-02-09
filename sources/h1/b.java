package h1;

import k7.k;

class b implements k.c {

    /* renamed from: m  reason: collision with root package name */
    private final a f9103m;

    b(a aVar) {
        this.f9103m = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        r8.a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c3, code lost:
        r8.a((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(k7.j r7, k7.k.d r8) {
        /*
            r6 = this;
            java.lang.String r0 = r7.f10996a
            r0.hashCode()
            int r1 = r0.hashCode()
            r2 = -1
            switch(r1) {
                case -1367724422: goto L_0x002f;
                case 86129172: goto L_0x0024;
                case 451310959: goto L_0x0019;
                case 890723587: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0039
        L_0x000e:
            java.lang.String r1 = "hasCustomVibrationsSupport"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0017
            goto L_0x0039
        L_0x0017:
            r2 = 3
            goto L_0x0039
        L_0x0019:
            java.lang.String r1 = "vibrate"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0022
            goto L_0x0039
        L_0x0022:
            r2 = 2
            goto L_0x0039
        L_0x0024:
            java.lang.String r1 = "hasAmplitudeControl"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002d
            goto L_0x0039
        L_0x002d:
            r2 = 1
            goto L_0x0039
        L_0x002f:
            java.lang.String r1 = "cancel"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r2 = 0
        L_0x0039:
            r0 = 0
            switch(r2) {
                case 0: goto L_0x00ba;
                case 1: goto L_0x00a2;
                case 2: goto L_0x0049;
                case 3: goto L_0x0042;
                default: goto L_0x003d;
            }
        L_0x003d:
            r8.c()
            goto L_0x00c6
        L_0x0042:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
        L_0x0044:
            r8.a(r7)
            goto L_0x00c6
        L_0x0049:
            java.lang.String r1 = "duration"
            java.lang.Object r1 = r7.a(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.String r2 = "pattern"
            java.lang.Object r2 = r7.a(r2)
            java.util.List r2 = (java.util.List) r2
            java.lang.String r3 = "repeat"
            java.lang.Object r3 = r7.a(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.String r4 = "intensities"
            java.lang.Object r4 = r7.a(r4)
            java.util.List r4 = (java.util.List) r4
            java.lang.String r5 = "amplitude"
            java.lang.Object r7 = r7.a(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            int r5 = r2.size()
            if (r5 <= 0) goto L_0x008f
            int r5 = r4.size()
            if (r5 <= 0) goto L_0x008f
            h1.a r7 = r6.f9103m
            r7.d(r2, r3, r4)
            goto L_0x00c3
        L_0x008f:
            int r4 = r2.size()
            if (r4 <= 0) goto L_0x009b
            h1.a r7 = r6.f9103m
            r7.c(r2, r3)
            goto L_0x00c3
        L_0x009b:
            h1.a r2 = r6.f9103m
            long r3 = (long) r1
            r2.b(r3, r7)
            goto L_0x00c3
        L_0x00a2:
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r7 < r0) goto L_0x00b7
            h1.a r7 = r6.f9103m
            android.os.Vibrator r7 = r7.a()
            boolean r7 = r7.hasAmplitudeControl()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L_0x0044
        L_0x00b7:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L_0x0044
        L_0x00ba:
            h1.a r7 = r6.f9103m
            android.os.Vibrator r7 = r7.a()
            r7.cancel()
        L_0x00c3:
            r8.a(r0)
        L_0x00c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.b.onMethodCall(k7.j, k7.k$d):void");
    }
}
