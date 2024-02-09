package h2;

import android.os.IBinder;
import android.os.Parcel;

final class q0 implements m {

    /* renamed from: c  reason: collision with root package name */
    private final IBinder f9248c;

    q0(IBinder iBinder) {
        this.f9248c = iBinder;
    }

    public final void M2(l lVar, g gVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(lVar != null ? lVar.asBinder() : null);
            if (gVar != null) {
                obtain.writeInt(1);
                g1.a(gVar, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f9248c.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f9248c;
    }
}
