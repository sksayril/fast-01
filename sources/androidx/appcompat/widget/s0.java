package androidx.appcompat.widget;

class s0 {

    /* renamed from: a  reason: collision with root package name */
    private int f1038a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f1039b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f1040c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    private int f1041d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    private int f1042e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f1043f = 0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1044g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1045h = false;

    s0() {
    }

    public int a() {
        return this.f1044g ? this.f1038a : this.f1039b;
    }

    public int b() {
        return this.f1038a;
    }

    public int c() {
        return this.f1039b;
    }

    public int d() {
        return this.f1044g ? this.f1039b : this.f1038a;
    }

    public void e(int i10, int i11) {
        this.f1045h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f1042e = i10;
            this.f1038a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1043f = i11;
            this.f1039b = i11;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f1044g
            if (r2 != r0) goto L_0x0005
            return
        L_0x0005:
            r1.f1044g = r2
            boolean r0 = r1.f1045h
            if (r0 == 0) goto L_0x002b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L_0x001d
            int r2 = r1.f1041d
            if (r2 == r0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            int r2 = r1.f1042e
        L_0x0016:
            r1.f1038a = r2
            int r2 = r1.f1040c
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x001d:
            int r2 = r1.f1040c
            if (r2 == r0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            int r2 = r1.f1042e
        L_0x0024:
            r1.f1038a = r2
            int r2 = r1.f1041d
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x002b:
            int r2 = r1.f1042e
            r1.f1038a = r2
        L_0x002f:
            int r2 = r1.f1043f
        L_0x0031:
            r1.f1039b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.s0.f(boolean):void");
    }

    public void g(int i10, int i11) {
        this.f1040c = i10;
        this.f1041d = i11;
        this.f1045h = true;
        if (this.f1044g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f1038a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f1039b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f1038a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1039b = i11;
        }
    }
}
