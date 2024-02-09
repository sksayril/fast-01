package i2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public class b {

    public static class a extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(java.lang.String r3, android.os.Parcel r4) {
            /*
                r2 = this;
                int r0 = r4.dataPosition()
                int r4 = r4.dataSize()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " Parcel: pos="
                r1.append(r3)
                r1.append(r0)
                java.lang.String r3 = " size="
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i2.b.a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    public static int A(Parcel parcel) {
        int r9 = r(parcel);
        int y9 = y(parcel, r9);
        int dataPosition = parcel.dataPosition();
        if (j(r9) == 20293) {
            int i10 = y9 + dataPosition;
            if (i10 >= dataPosition && i10 <= parcel.dataSize()) {
                return i10;
            }
            throw new a("Size read is invalid start=" + dataPosition + " end=" + i10, parcel);
        }
        throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(r9))), parcel);
    }

    private static void B(Parcel parcel, int i10, int i11, int i12) {
        if (i11 != i12) {
            String hexString = Integer.toHexString(i11);
            throw new a("Expected size " + i12 + " got " + i11 + " (0x" + hexString + ")", parcel);
        }
    }

    private static void C(Parcel parcel, int i10, int i11) {
        int y9 = y(parcel, i10);
        if (y9 != i11) {
            String hexString = Integer.toHexString(y9);
            throw new a("Expected size " + i11 + " got " + y9 + " (0x" + hexString + ")", parcel);
        }
    }

    public static Bundle a(Parcel parcel, int i10) {
        int y9 = y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (y9 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + y9);
        return readBundle;
    }

    public static byte[] b(Parcel parcel, int i10) {
        int y9 = y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (y9 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + y9);
        return createByteArray;
    }

    public static int[] c(Parcel parcel, int i10) {
        int y9 = y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (y9 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + y9);
        return createIntArray;
    }

    public static <T extends Parcelable> T d(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int y9 = y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (y9 == 0) {
            return null;
        }
        T t9 = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + y9);
        return t9;
    }

    public static String e(Parcel parcel, int i10) {
        int y9 = y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (y9 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + y9);
        return readString;
    }

    public static ArrayList<String> f(Parcel parcel, int i10) {
        int y9 = y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (y9 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + y9);
        return createStringArrayList;
    }

    public static <T> T[] g(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int y9 = y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (y9 == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + y9);
        return createTypedArray;
    }

    public static <T> ArrayList<T> h(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int y9 = y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (y9 == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + y9);
        return createTypedArrayList;
    }

    public static void i(Parcel parcel, int i10) {
        if (parcel.dataPosition() != i10) {
            throw new a("Overread allowed size end=" + i10, parcel);
        }
    }

    public static int j(int i10) {
        return (char) i10;
    }

    public static boolean k(Parcel parcel, int i10) {
        C(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean l(Parcel parcel, int i10) {
        int y9 = y(parcel, i10);
        if (y9 == 0) {
            return null;
        }
        B(parcel, i10, y9, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static byte m(Parcel parcel, int i10) {
        C(parcel, i10, 4);
        return (byte) parcel.readInt();
    }

    public static double n(Parcel parcel, int i10) {
        C(parcel, i10, 8);
        return parcel.readDouble();
    }

    public static Double o(Parcel parcel, int i10) {
        int y9 = y(parcel, i10);
        if (y9 == 0) {
            return null;
        }
        B(parcel, i10, y9, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float p(Parcel parcel, int i10) {
        C(parcel, i10, 4);
        return parcel.readFloat();
    }

    public static Float q(Parcel parcel, int i10) {
        int y9 = y(parcel, i10);
        if (y9 == 0) {
            return null;
        }
        B(parcel, i10, y9, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int r(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder s(Parcel parcel, int i10) {
        int y9 = y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (y9 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + y9);
        return readStrongBinder;
    }

    public static int t(Parcel parcel, int i10) {
        C(parcel, i10, 4);
        return parcel.readInt();
    }

    public static Integer u(Parcel parcel, int i10) {
        int y9 = y(parcel, i10);
        if (y9 == 0) {
            return null;
        }
        B(parcel, i10, y9, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static void v(Parcel parcel, int i10, List list, ClassLoader classLoader) {
        int y9 = y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (y9 != 0) {
            parcel.readList(list, classLoader);
            parcel.setDataPosition(dataPosition + y9);
        }
    }

    public static long w(Parcel parcel, int i10) {
        C(parcel, i10, 8);
        return parcel.readLong();
    }

    public static Long x(Parcel parcel, int i10) {
        int y9 = y(parcel, i10);
        if (y9 == 0) {
            return null;
        }
        B(parcel, i10, y9, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int y(Parcel parcel, int i10) {
        return (i10 & -65536) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static void z(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + y(parcel, i10));
    }
}
