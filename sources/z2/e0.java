package z2;

import android.os.RemoteException;
import u2.n;

final class e0 implements b0 {

    /* renamed from: b  reason: collision with root package name */
    private final n f13488b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a0 f13489c;

    e0(a0 a0Var) {
        this.f13489c = a0Var;
        this.f13488b = a0Var.f13470m;
    }

    public final y a(int i10, int i11, int i12) {
        try {
            return this.f13488b.N0(i10, i11, i12);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
