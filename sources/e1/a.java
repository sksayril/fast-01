package e1;

public enum a {
    denied,
    deniedForever,
    whileInUse,
    always;

    /* renamed from: e1.a$a  reason: collision with other inner class name */
    static /* synthetic */ class C0130a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8316a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                e1.a[] r0 = e1.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8316a = r0
                e1.a r1 = e1.a.denied     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8316a     // Catch:{ NoSuchFieldError -> 0x001d }
                e1.a r1 = e1.a.deniedForever     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8316a     // Catch:{ NoSuchFieldError -> 0x0028 }
                e1.a r1 = e1.a.whileInUse     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8316a     // Catch:{ NoSuchFieldError -> 0x0033 }
                e1.a r1 = e1.a.always     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e1.a.C0130a.<clinit>():void");
        }
    }

    public int toInt() {
        int i10 = C0130a.f8316a[ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        throw new IndexOutOfBoundsException();
    }
}
