package s2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {

    /* renamed from: c  reason: collision with root package name */
    private final IBinder f12167c;

    /* renamed from: d  reason: collision with root package name */
    private final String f12168d;

    protected a(IBinder iBinder, String str) {
        this.f12167c = iBinder;
        this.f12168d = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel B(int i10, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f12167c.transact(i10, parcel, parcel, 0);
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
        obtain.writeInterfaceToken(this.f12168d);
        return obtain;
    }

    public final IBinder asBinder() {
        return this.f12167c;
    }
}
