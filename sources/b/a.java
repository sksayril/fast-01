package b;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public interface a extends IInterface {

    /* renamed from: a  reason: collision with root package name */
    public static final String f3359a = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    /* renamed from: b.a$a  reason: collision with other inner class name */
    public static abstract class C0066a extends Binder implements a {

        /* renamed from: b.a$a$a  reason: collision with other inner class name */
        private static class C0067a implements a {

            /* renamed from: c  reason: collision with root package name */
            private IBinder f3360c;

            C0067a(IBinder iBinder) {
                this.f3360c = iBinder;
            }

            public void B2(String str, int i10, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3359a);
                    obtain.writeString(str);
                    obtain.writeInt(i10);
                    obtain.writeString(str2);
                    b.b(obtain, notification, 0);
                    this.f3360c.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f3360c;
            }
        }

        public static a B(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(a.f3359a);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0067a(iBinder) : (a) queryLocalInterface;
        }
    }

    public static class b {
        /* access modifiers changed from: private */
        public static <T extends Parcelable> void b(Parcel parcel, T t9, int i10) {
            if (t9 != null) {
                parcel.writeInt(1);
                t9.writeToParcel(parcel, i10);
                return;
            }
            parcel.writeInt(0);
        }
    }

    void B2(String str, int i10, String str2, Notification notification);
}
