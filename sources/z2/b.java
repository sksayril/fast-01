package z2;

import android.graphics.Bitmap;
import android.os.RemoteException;
import h2.p;
import u2.s;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static s f13476a;

    public static a a() {
        try {
            return new a(f().c());
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public static a b(float f10) {
        try {
            return new a(f().I0(f10));
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public static a c(String str) {
        p.k(str, "assetName must not be null");
        try {
            return new a(f().Y0(str));
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public static a d(Bitmap bitmap) {
        p.k(bitmap, "image must not be null");
        try {
            return new a(f().o1(bitmap));
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public static void e(s sVar) {
        if (f13476a == null) {
            f13476a = (s) p.k(sVar, "delegate must not be null");
        }
    }

    private static s f() {
        return (s) p.k(f13476a, "IBitmapDescriptorFactory is not initialized");
    }
}
