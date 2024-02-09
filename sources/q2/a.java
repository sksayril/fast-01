package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {

    /* renamed from: c  reason: collision with root package name */
    private final IBinder f11981c;

    /* renamed from: d  reason: collision with root package name */
    private final String f11982d = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    protected a(IBinder iBinder, String str) {
        this.f11981c = iBinder;
    }

    /* access modifiers changed from: protected */
    public final Parcel B() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f11982d);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final Parcel J(int i10, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f11981c.transact(i10, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f11981c;
    }
}
