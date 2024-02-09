package c;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import c.a;

@SuppressLint({"BanParcelableUsage"})
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: m  reason: collision with root package name */
    final boolean f3530m = false;

    /* renamed from: n  reason: collision with root package name */
    final Handler f3531n = null;

    /* renamed from: o  reason: collision with root package name */
    a f3532o;

    class a implements Parcelable.Creator<b> {
        a() {
        }

        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* renamed from: b */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* renamed from: c.b$b  reason: collision with other inner class name */
    class C0075b extends a.C0073a {
        C0075b() {
        }

        public void W2(int i10, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f3531n;
            if (handler != null) {
                handler.post(new c(i10, bundle));
            } else {
                bVar.a(i10, bundle);
            }
        }
    }

    class c implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final int f3534m;

        /* renamed from: n  reason: collision with root package name */
        final Bundle f3535n;

        c(int i10, Bundle bundle) {
            this.f3534m = i10;
            this.f3535n = bundle;
        }

        public void run() {
            b.this.a(this.f3534m, this.f3535n);
        }
    }

    b(Parcel parcel) {
        this.f3532o = a.C0073a.B(parcel.readStrongBinder());
    }

    /* access modifiers changed from: protected */
    public void a(int i10, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            if (this.f3532o == null) {
                this.f3532o = new C0075b();
            }
            parcel.writeStrongBinder(this.f3532o.asBinder());
        }
    }
}
