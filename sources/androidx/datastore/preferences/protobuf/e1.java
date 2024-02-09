package androidx.datastore.preferences.protobuf;

final class e1 implements p0 {

    /* renamed from: a  reason: collision with root package name */
    private final r0 f1916a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1917b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f1918c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1919d;

    e1(r0 r0Var, String str, Object[] objArr) {
        char charAt;
        this.f1916a = r0Var;
        this.f1917b = str;
        this.f1918c = objArr;
        char charAt2 = str.charAt(0);
        if (charAt2 >= 55296) {
            char c10 = charAt2 & 8191;
            int i10 = 13;
            int i11 = 1;
            while (true) {
                int i12 = i11 + 1;
                charAt = str.charAt(i11);
                if (charAt < 55296) {
                    break;
                }
                c10 |= (charAt & 8191) << i10;
                i10 += 13;
                i11 = i12;
            }
            charAt2 = c10 | (charAt << i10);
        }
        this.f1919d = charAt2;
    }

    public boolean a() {
        return (this.f1919d & 2) == 2;
    }

    public b1 b() {
        return (this.f1919d & 1) == 1 ? b1.PROTO2 : b1.PROTO3;
    }

    public r0 c() {
        return this.f1916a;
    }

    /* access modifiers changed from: package-private */
    public Object[] d() {
        return this.f1918c;
    }

    /* access modifiers changed from: package-private */
    public String e() {
        return this.f1917b;
    }
}
