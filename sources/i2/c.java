package i2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class c {
    private static void A(Parcel parcel, Parcelable parcelable, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i10);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static int a(Parcel parcel) {
        return x(parcel, 20293);
    }

    public static void b(Parcel parcel, int i10) {
        y(parcel, i10);
    }

    public static void c(Parcel parcel, int i10, boolean z9) {
        z(parcel, i10, 4);
        parcel.writeInt(z9 ? 1 : 0);
    }

    public static void d(Parcel parcel, int i10, Boolean bool, boolean z9) {
        if (bool != null) {
            z(parcel, i10, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z9) {
            z(parcel, i10, 0);
        }
    }

    public static void e(Parcel parcel, int i10, Bundle bundle, boolean z9) {
        if (bundle != null) {
            int x9 = x(parcel, i10);
            parcel.writeBundle(bundle);
            y(parcel, x9);
        } else if (z9) {
            z(parcel, i10, 0);
        }
    }

    public static void f(Parcel parcel, int i10, byte b10) {
        z(parcel, i10, 4);
        parcel.writeInt(b10);
    }

    public static void g(Parcel parcel, int i10, byte[] bArr, boolean z9) {
        if (bArr != null) {
            int x9 = x(parcel, i10);
            parcel.writeByteArray(bArr);
            y(parcel, x9);
        } else if (z9) {
            z(parcel, i10, 0);
        }
    }

    public static void h(Parcel parcel, int i10, double d10) {
        z(parcel, i10, 8);
        parcel.writeDouble(d10);
    }

    public static void i(Parcel parcel, int i10, Double d10, boolean z9) {
        if (d10 != null) {
            z(parcel, i10, 8);
            parcel.writeDouble(d10.doubleValue());
        } else if (z9) {
            z(parcel, i10, 0);
        }
    }

    public static void j(Parcel parcel, int i10, float f10) {
        z(parcel, i10, 4);
        parcel.writeFloat(f10);
    }

    public static void k(Parcel parcel, int i10, Float f10, boolean z9) {
        if (f10 != null) {
            z(parcel, i10, 4);
            parcel.writeFloat(f10.floatValue());
        } else if (z9) {
            z(parcel, i10, 0);
        }
    }

    public static void l(Parcel parcel, int i10, IBinder iBinder, boolean z9) {
        if (iBinder != null) {
            int x9 = x(parcel, i10);
            parcel.writeStrongBinder(iBinder);
            y(parcel, x9);
        } else if (z9) {
            z(parcel, i10, 0);
        }
    }

    public static void m(Parcel parcel, int i10, int i11) {
        z(parcel, i10, 4);
        parcel.writeInt(i11);
    }

    public static void n(Parcel parcel, int i10, int[] iArr, boolean z9) {
        if (iArr != null) {
            int x9 = x(parcel, i10);
            parcel.writeIntArray(iArr);
            y(parcel, x9);
        } else if (z9) {
            z(parcel, i10, 0);
        }
    }

    public static void o(Parcel parcel, int i10, Integer num, boolean z9) {
        if (num != null) {
            z(parcel, i10, 4);
            parcel.writeInt(num.intValue());
        } else if (z9) {
            z(parcel, i10, 0);
        }
    }

    public static void p(Parcel parcel, int i10, List list, boolean z9) {
        if (list != null) {
            int x9 = x(parcel, i10);
            parcel.writeList(list);
            y(parcel, x9);
        } else if (z9) {
            z(parcel, i10, 0);
        }
    }

    public static void q(Parcel parcel, int i10, long j10) {
        z(parcel, i10, 8);
        parcel.writeLong(j10);
    }

    public static void r(Parcel parcel, int i10, Long l10, boolean z9) {
        if (l10 != null) {
            z(parcel, i10, 8);
            parcel.writeLong(l10.longValue());
        } else if (z9) {
            z(parcel, i10, 0);
        }
    }

    public static void s(Parcel parcel, int i10, Parcelable parcelable, int i11, boolean z9) {
        if (parcelable != null) {
            int x9 = x(parcel, i10);
            parcelable.writeToParcel(parcel, i11);
            y(parcel, x9);
        } else if (z9) {
            z(parcel, i10, 0);
        }
    }

    public static void t(Parcel parcel, int i10, String str, boolean z9) {
        if (str != null) {
            int x9 = x(parcel, i10);
            parcel.writeString(str);
            y(parcel, x9);
        } else if (z9) {
            z(parcel, i10, 0);
        }
    }

    public static void u(Parcel parcel, int i10, List<String> list, boolean z9) {
        if (list != null) {
            int x9 = x(parcel, i10);
            parcel.writeStringList(list);
            y(parcel, x9);
        } else if (z9) {
            z(parcel, i10, 0);
        }
    }

    public static <T extends Parcelable> void v(Parcel parcel, int i10, T[] tArr, int i11, boolean z9) {
        if (tArr != null) {
            int x9 = x(parcel, i10);
            parcel.writeInt(r7);
            for (T t9 : tArr) {
                if (t9 == null) {
                    parcel.writeInt(0);
                } else {
                    A(parcel, t9, i11);
                }
            }
            y(parcel, x9);
        } else if (z9) {
            z(parcel, i10, 0);
        }
    }

    public static <T extends Parcelable> void w(Parcel parcel, int i10, List<T> list, boolean z9) {
        if (list != null) {
            int x9 = x(parcel, i10);
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                Parcelable parcelable = (Parcelable) list.get(i11);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    A(parcel, parcelable, 0);
                }
            }
            y(parcel, x9);
        } else if (z9) {
            z(parcel, i10, 0);
        }
    }

    private static int x(Parcel parcel, int i10) {
        parcel.writeInt(i10 | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void y(Parcel parcel, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(dataPosition - i10);
        parcel.setDataPosition(dataPosition);
    }

    private static void z(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | (i11 << 16));
    }
}
