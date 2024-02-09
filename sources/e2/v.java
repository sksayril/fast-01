package e2;

import android.os.RemoteException;
import android.util.Log;
import h2.p;
import h2.r1;
import h2.s1;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import o2.b;
import o2.d;

abstract class v extends r1 {

    /* renamed from: c  reason: collision with root package name */
    private final int f8373c;

    protected v(byte[] bArr) {
        p.a(bArr.length == 25);
        this.f8373c = Arrays.hashCode(bArr);
    }

    protected static byte[] Y(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public final int b() {
        return this.f8373c;
    }

    public final b c() {
        return d.e3(e3());
    }

    /* access modifiers changed from: package-private */
    public abstract byte[] e3();

    public final boolean equals(Object obj) {
        b c10;
        if (obj != null && (obj instanceof s1)) {
            try {
                s1 s1Var = (s1) obj;
                if (s1Var.b() != this.f8373c || (c10 = s1Var.c()) == null) {
                    return false;
                }
                return Arrays.equals(e3(), (byte[]) d.Y(c10));
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8373c;
    }
}
