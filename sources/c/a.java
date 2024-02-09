package c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public interface a extends IInterface {

    /* renamed from: b  reason: collision with root package name */
    public static final String f3528b = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* renamed from: c.a$a  reason: collision with other inner class name */
    public static abstract class C0073a extends Binder implements a {

        /* renamed from: c.a$a$a  reason: collision with other inner class name */
        private static class C0074a implements a {

            /* renamed from: c  reason: collision with root package name */
            private IBinder f3529c;

            C0074a(IBinder iBinder) {
                this.f3529c = iBinder;
            }

            public IBinder asBinder() {
                return this.f3529c;
            }
        }

        public C0073a() {
            attachInterface(this, a.f3528b);
        }

        public static a B(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(a.f3528b);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0074a(iBinder) : (a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = a.f3528b;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            } else if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                W2(parcel.readInt(), (Bundle) b.b(parcel, Bundle.CREATOR));
                return true;
            }
        }
    }

    public static class b {
        /* access modifiers changed from: private */
        public static <T> T b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void W2(int i10, Bundle bundle);
}
