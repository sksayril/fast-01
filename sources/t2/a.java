package t2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {

    /* renamed from: c  reason: collision with root package name */
    private final IBinder f12333c;

    /* renamed from: d  reason: collision with root package name */
    private final String f12334d;

    protected a(IBinder iBinder, String str) {
        this.f12333c = iBinder;
        this.f12334d = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel B() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f12334d);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final Parcel J(int i10, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f12333c.transact(i10, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final void Y(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f12333c.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f12333c;
    }
}
