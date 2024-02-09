package t2;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import i2.a;
import i2.c;
import java.util.Arrays;
import java.util.List;

public final class b0 extends a {
    public static final Parcelable.Creator<b0> CREATOR = new w0();

    /* renamed from: m  reason: collision with root package name */
    private final int f12336m;

    /* renamed from: n  reason: collision with root package name */
    private final int f12337n;

    /* renamed from: o  reason: collision with root package name */
    private final String f12338o;

    /* renamed from: p  reason: collision with root package name */
    private final String f12339p;

    /* renamed from: q  reason: collision with root package name */
    private final int f12340q;

    /* renamed from: r  reason: collision with root package name */
    private final String f12341r;

    /* renamed from: s  reason: collision with root package name */
    private final b0 f12342s;

    /* renamed from: t  reason: collision with root package name */
    private final List f12343t;

    static {
        Process.myUid();
        Process.myPid();
    }

    b0(int i10, int i11, String str, String str2, String str3, int i12, List list, b0 b0Var) {
        this.f12336m = i10;
        this.f12337n = i11;
        this.f12338o = str;
        this.f12339p = str2;
        this.f12341r = str3;
        this.f12340q = i12;
        this.f12343t = s0.z(list);
        this.f12342s = b0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            return this.f12336m == b0Var.f12336m && this.f12337n == b0Var.f12337n && this.f12340q == b0Var.f12340q && this.f12338o.equals(b0Var.f12338o) && l0.a(this.f12339p, b0Var.f12339p) && l0.a(this.f12341r, b0Var.f12341r) && l0.a(this.f12342s, b0Var.f12342s) && this.f12343t.equals(b0Var.f12343t);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12336m), this.f12338o, this.f12339p, this.f12341r});
    }

    public final String toString() {
        int length = this.f12338o.length() + 18;
        String str = this.f12339p;
        if (str != null) {
            length += str.length();
        }
        StringBuilder sb = new StringBuilder(length);
        sb.append(this.f12336m);
        sb.append("/");
        sb.append(this.f12338o);
        if (this.f12339p != null) {
            sb.append("[");
            if (this.f12339p.startsWith(this.f12338o)) {
                sb.append(this.f12339p, this.f12338o.length(), this.f12339p.length());
            } else {
                sb.append(this.f12339p);
            }
            sb.append("]");
        }
        if (this.f12341r != null) {
            sb.append("/");
            sb.append(Integer.toHexString(this.f12341r.hashCode()));
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.m(parcel, 1, this.f12336m);
        c.m(parcel, 2, this.f12337n);
        c.t(parcel, 3, this.f12338o, false);
        c.t(parcel, 4, this.f12339p, false);
        c.m(parcel, 5, this.f12340q);
        c.t(parcel, 6, this.f12341r, false);
        c.s(parcel, 7, this.f12342s, i10, false);
        c.w(parcel, 8, this.f12343t, false);
        c.b(parcel, a10);
    }
}
