package u2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {

    /* renamed from: c  reason: collision with root package name */
    private final IBinder f12468c;

    /* renamed from: d  reason: collision with root package name */
    private final String f12469d;

    protected a(IBinder iBinder, String str) {
        this.f12468c = iBinder;
        this.f12469d = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel B(int i10, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f12468c.transact(i10, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final Parcel J() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f12469d);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final void Y(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f12468c.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f12468c;
    }
}
