package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.n;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* renamed from: m  reason: collision with root package name */
    ArrayList<t> f2553m;

    /* renamed from: n  reason: collision with root package name */
    ArrayList<String> f2554n;

    /* renamed from: o  reason: collision with root package name */
    b[] f2555o;

    /* renamed from: p  reason: collision with root package name */
    int f2556p;

    /* renamed from: q  reason: collision with root package name */
    String f2557q = null;

    /* renamed from: r  reason: collision with root package name */
    ArrayList<String> f2558r = new ArrayList<>();

    /* renamed from: s  reason: collision with root package name */
    ArrayList<Bundle> f2559s = new ArrayList<>();

    /* renamed from: t  reason: collision with root package name */
    ArrayList<n.l> f2560t;

    class a implements Parcelable.Creator<p> {
        a() {
        }

        /* renamed from: a */
        public p createFromParcel(Parcel parcel) {
            return new p(parcel);
        }

        /* renamed from: b */
        public p[] newArray(int i10) {
            return new p[i10];
        }
    }

    public p() {
    }

    public p(Parcel parcel) {
        this.f2553m = parcel.createTypedArrayList(t.CREATOR);
        this.f2554n = parcel.createStringArrayList();
        this.f2555o = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f2556p = parcel.readInt();
        this.f2557q = parcel.readString();
        this.f2558r = parcel.createStringArrayList();
        this.f2559s = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f2560t = parcel.createTypedArrayList(n.l.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedList(this.f2553m);
        parcel.writeStringList(this.f2554n);
        parcel.writeTypedArray(this.f2555o, i10);
        parcel.writeInt(this.f2556p);
        parcel.writeString(this.f2557q);
        parcel.writeStringList(this.f2558r);
        parcel.writeTypedList(this.f2559s);
        parcel.writeTypedList(this.f2560t);
    }
}
