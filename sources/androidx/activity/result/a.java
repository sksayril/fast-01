package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0004a();

    /* renamed from: m  reason: collision with root package name */
    private final int f199m;

    /* renamed from: n  reason: collision with root package name */
    private final Intent f200n;

    /* renamed from: androidx.activity.result.a$a  reason: collision with other inner class name */
    class C0004a implements Parcelable.Creator<a> {
        C0004a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(int i10, Intent intent) {
        this.f199m = i10;
        this.f200n = intent;
    }

    a(Parcel parcel) {
        this.f199m = parcel.readInt();
        this.f200n = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    public static String c(int i10) {
        return i10 != -1 ? i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED" : "RESULT_OK";
    }

    public Intent a() {
        return this.f200n;
    }

    public int b() {
        return this.f199m;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + c(this.f199m) + ", data=" + this.f200n + '}';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f199m);
        parcel.writeInt(this.f200n == null ? 0 : 1);
        Intent intent = this.f200n;
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }
}
