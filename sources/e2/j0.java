package e2;

import android.util.Log;

class j0 {

    /* renamed from: e  reason: collision with root package name */
    private static final j0 f8363e = new j0(true, 3, 1, (String) null, (Throwable) null);

    /* renamed from: a  reason: collision with root package name */
    final boolean f8364a;

    /* renamed from: b  reason: collision with root package name */
    final String f8365b;

    /* renamed from: c  reason: collision with root package name */
    final Throwable f8366c;

    /* renamed from: d  reason: collision with root package name */
    final int f8367d;

    private j0(boolean z9, int i10, int i11, String str, Throwable th) {
        this.f8364a = z9;
        this.f8367d = i10;
        this.f8365b = str;
        this.f8366c = th;
    }

    /* synthetic */ j0(boolean z9, int i10, int i11, String str, Throwable th, i0 i0Var) {
        this(false, 1, 5, (String) null, (Throwable) null);
    }

    @Deprecated
    static j0 b() {
        return f8363e;
    }

    static j0 c(String str) {
        return new j0(false, 1, 5, str, (Throwable) null);
    }

    static j0 d(String str, Throwable th) {
        return new j0(false, 1, 5, str, th);
    }

    static j0 f(int i10) {
        return new j0(true, i10, 1, (String) null, (Throwable) null);
    }

    static j0 g(int i10, int i11, String str, Throwable th) {
        return new j0(false, i10, i11, str, th);
    }

    /* access modifiers changed from: package-private */
    public String a() {
        return this.f8365b;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        if (!this.f8364a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.f8366c != null) {
                Log.d("GoogleCertificatesRslt", a(), this.f8366c);
            } else {
                Log.d("GoogleCertificatesRslt", a());
            }
        }
    }
}
