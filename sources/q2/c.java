package q2;

import android.os.Parcel;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final ClassLoader f11983a = c.class.getClassLoader();

    private c() {
    }

    public static void a(Parcel parcel, boolean z9) {
        parcel.writeInt(1);
    }

    public static boolean b(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
