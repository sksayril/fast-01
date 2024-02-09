package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: m  reason: collision with root package name */
    public int f96m;

    /* renamed from: n  reason: collision with root package name */
    public int f97n;

    /* renamed from: o  reason: collision with root package name */
    public int f98o;

    /* renamed from: p  reason: collision with root package name */
    public int f99p;

    /* renamed from: q  reason: collision with root package name */
    public int f100q;

    static class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        a() {
        }

        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f96m = parcel.readInt();
        this.f98o = parcel.readInt();
        this.f99p = parcel.readInt();
        this.f100q = parcel.readInt();
        this.f97n = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f96m);
        parcel.writeInt(this.f98o);
        parcel.writeInt(this.f99p);
        parcel.writeInt(this.f100q);
        parcel.writeInt(this.f97n);
    }
}
