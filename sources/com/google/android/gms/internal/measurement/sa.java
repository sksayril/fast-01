package com.google.android.gms.internal.measurement;

final class sa implements ba {

    /* renamed from: a  reason: collision with root package name */
    private final da f5594a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5595b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f5596c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5597d;

    sa(da daVar, String str, Object[] objArr) {
        this.f5594a = daVar;
        this.f5595b = str;
        this.f5596c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f5597d = charAt;
            return;
        }
        char c10 = charAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 >= 55296) {
                c10 |= (charAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            } else {
                this.f5597d = c10 | (charAt2 << i10);
                return;
            }
        }
    }

    public final ra a() {
        int i10 = this.f5597d;
        return (i10 & 1) != 0 ? ra.PROTO2 : (i10 & 4) == 4 ? ra.EDITIONS : ra.PROTO3;
    }

    public final boolean b() {
        return (this.f5597d & 2) == 2;
    }

    /* access modifiers changed from: package-private */
    public final String c() {
        return this.f5595b;
    }

    /* access modifiers changed from: package-private */
    public final Object[] d() {
        return this.f5596c;
    }

    public final da zza() {
        return this.f5594a;
    }
}
