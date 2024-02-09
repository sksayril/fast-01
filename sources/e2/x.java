package e2;

import java.lang.ref.WeakReference;

abstract class x extends v {

    /* renamed from: e  reason: collision with root package name */
    private static final WeakReference f8375e = new WeakReference((Object) null);

    /* renamed from: d  reason: collision with root package name */
    private WeakReference f8376d = f8375e;

    x(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: package-private */
    public final byte[] e3() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f8376d.get();
            if (bArr == null) {
                bArr = f3();
                this.f8376d = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    public abstract byte[] f3();
}
