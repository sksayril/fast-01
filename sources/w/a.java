package w;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: n  reason: collision with root package name */
    public static final a f12752n = new C0218a();

    /* renamed from: m  reason: collision with root package name */
    private final Parcelable f12753m;

    /* renamed from: w.a$a  reason: collision with other inner class name */
    static class C0218a extends a {
        C0218a() {
            super((C0218a) null);
        }
    }

    static class b implements Parcelable.ClassLoaderCreator<a> {
        b() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        /* renamed from: b */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f12752n;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: c */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    private a() {
        this.f12753m = null;
    }

    protected a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f12753m = readParcelable == null ? f12752n : readParcelable;
    }

    protected a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f12753m = parcelable == f12752n ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    /* synthetic */ a(C0218a aVar) {
        this();
    }

    public final Parcelable a() {
        return this.f12753m;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f12753m, i10);
    }
}
