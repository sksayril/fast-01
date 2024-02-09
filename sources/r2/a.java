package r2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {

    /* renamed from: c  reason: collision with root package name */
    private final IBinder f12077c;

    /* renamed from: d  reason: collision with root package name */
    private final String f12078d;

    protected a(IBinder iBinder, String str) {
        this.f12077c = iBinder;
        this.f12078d = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel B() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f12078d);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final void J(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f12077c.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final void Y(int i10, Parcel parcel) {
        try {
            this.f12077c.transact(1, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f12077c;
    }
}
