package e2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import h2.r1;
import i2.a;
import i2.c;
import o2.b;
import o2.d;

public final class e0 extends a {
    public static final Parcelable.Creator<e0> CREATOR = new f0();

    /* renamed from: m  reason: collision with root package name */
    private final String f8346m;

    /* renamed from: n  reason: collision with root package name */
    private final v f8347n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f8348o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f8349p;

    e0(String str, IBinder iBinder, boolean z9, boolean z10) {
        this.f8346m = str;
        w wVar = null;
        if (iBinder != null) {
            try {
                b c10 = r1.J(iBinder).c();
                byte[] bArr = c10 == null ? null : (byte[]) d.Y(c10);
                if (bArr != null) {
                    wVar = new w(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e10);
            }
        }
        this.f8347n = wVar;
        this.f8348o = z9;
        this.f8349p = z10;
    }

    e0(String str, v vVar, boolean z9, boolean z10) {
        this.f8346m = str;
        this.f8347n = vVar;
        this.f8348o = z9;
        this.f8349p = z10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f8346m, false);
        v vVar = this.f8347n;
        if (vVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            vVar = null;
        }
        c.l(parcel, 2, vVar, false);
        c.c(parcel, 3, this.f8348o);
        c.c(parcel, 4, this.f8349p);
        c.b(parcel, a10);
    }
}
