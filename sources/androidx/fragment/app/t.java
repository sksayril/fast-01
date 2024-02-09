package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
final class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new a();

    /* renamed from: m  reason: collision with root package name */
    final String f2569m;

    /* renamed from: n  reason: collision with root package name */
    final String f2570n;

    /* renamed from: o  reason: collision with root package name */
    final boolean f2571o;

    /* renamed from: p  reason: collision with root package name */
    final int f2572p;

    /* renamed from: q  reason: collision with root package name */
    final int f2573q;

    /* renamed from: r  reason: collision with root package name */
    final String f2574r;

    /* renamed from: s  reason: collision with root package name */
    final boolean f2575s;

    /* renamed from: t  reason: collision with root package name */
    final boolean f2576t;

    /* renamed from: u  reason: collision with root package name */
    final boolean f2577u;

    /* renamed from: v  reason: collision with root package name */
    final Bundle f2578v;

    /* renamed from: w  reason: collision with root package name */
    final boolean f2579w;

    /* renamed from: x  reason: collision with root package name */
    final int f2580x;

    /* renamed from: y  reason: collision with root package name */
    Bundle f2581y;

    class a implements Parcelable.Creator<t> {
        a() {
        }

        /* renamed from: a */
        public t createFromParcel(Parcel parcel) {
            return new t(parcel);
        }

        /* renamed from: b */
        public t[] newArray(int i10) {
            return new t[i10];
        }
    }

    t(Parcel parcel) {
        this.f2569m = parcel.readString();
        this.f2570n = parcel.readString();
        boolean z9 = true;
        this.f2571o = parcel.readInt() != 0;
        this.f2572p = parcel.readInt();
        this.f2573q = parcel.readInt();
        this.f2574r = parcel.readString();
        this.f2575s = parcel.readInt() != 0;
        this.f2576t = parcel.readInt() != 0;
        this.f2577u = parcel.readInt() != 0;
        this.f2578v = parcel.readBundle();
        this.f2579w = parcel.readInt() == 0 ? false : z9;
        this.f2581y = parcel.readBundle();
        this.f2580x = parcel.readInt();
    }

    t(Fragment fragment) {
        this.f2569m = fragment.getClass().getName();
        this.f2570n = fragment.f2320r;
        this.f2571o = fragment.f2328z;
        this.f2572p = fragment.I;
        this.f2573q = fragment.J;
        this.f2574r = fragment.K;
        this.f2575s = fragment.N;
        this.f2576t = fragment.f2327y;
        this.f2577u = fragment.M;
        this.f2578v = fragment.f2321s;
        this.f2579w = fragment.L;
        this.f2580x = fragment.f2306d0.ordinal();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f2569m);
        sb.append(" (");
        sb.append(this.f2570n);
        sb.append(")}:");
        if (this.f2571o) {
            sb.append(" fromLayout");
        }
        if (this.f2573q != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2573q));
        }
        String str = this.f2574r;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f2574r);
        }
        if (this.f2575s) {
            sb.append(" retainInstance");
        }
        if (this.f2576t) {
            sb.append(" removing");
        }
        if (this.f2577u) {
            sb.append(" detached");
        }
        if (this.f2579w) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f2569m);
        parcel.writeString(this.f2570n);
        parcel.writeInt(this.f2571o ? 1 : 0);
        parcel.writeInt(this.f2572p);
        parcel.writeInt(this.f2573q);
        parcel.writeString(this.f2574r);
        parcel.writeInt(this.f2575s ? 1 : 0);
        parcel.writeInt(this.f2576t ? 1 : 0);
        parcel.writeInt(this.f2577u ? 1 : 0);
        parcel.writeBundle(this.f2578v);
        parcel.writeInt(this.f2579w ? 1 : 0);
        parcel.writeBundle(this.f2581y);
        parcel.writeInt(this.f2580x);
    }
}
