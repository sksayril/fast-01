package n3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p.g;

public class a extends w.a {
    public static final Parcelable.Creator<a> CREATOR = new C0186a();

    /* renamed from: o  reason: collision with root package name */
    public final g<String, Bundle> f11295o;

    /* renamed from: n3.a$a  reason: collision with other inner class name */
    static class C0186a implements Parcelable.ClassLoaderCreator<a> {
        C0186a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, (ClassLoader) null, (C0186a) null);
        }

        /* renamed from: b */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader, (C0186a) null);
        }

        /* renamed from: c */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    private a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f11295o = new g<>(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f11295o.put(strArr[i10], bundleArr[i10]);
        }
    }

    /* synthetic */ a(Parcel parcel, ClassLoader classLoader, C0186a aVar) {
        this(parcel, classLoader);
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f11295o = new g<>();
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f11295o + "}";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        int size = this.f11295o.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i11 = 0; i11 < size; i11++) {
            strArr[i11] = this.f11295o.i(i11);
            bundleArr[i11] = this.f11295o.m(i11);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
