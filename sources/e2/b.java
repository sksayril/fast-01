package e2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import f.j;
import h2.o;
import i2.a;
import i2.c;

public final class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new n();

    /* renamed from: q  reason: collision with root package name */
    public static final b f8327q = new b(0);

    /* renamed from: m  reason: collision with root package name */
    final int f8328m;

    /* renamed from: n  reason: collision with root package name */
    private final int f8329n;

    /* renamed from: o  reason: collision with root package name */
    private final PendingIntent f8330o;

    /* renamed from: p  reason: collision with root package name */
    private final String f8331p;

    public b(int i10) {
        this(i10, (PendingIntent) null, (String) null);
    }

    b(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f8328m = i10;
        this.f8329n = i11;
        this.f8330o = pendingIntent;
        this.f8331p = str;
    }

    public b(int i10, PendingIntent pendingIntent) {
        this(i10, pendingIntent, (String) null);
    }

    public b(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str);
    }

    static String l(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case j.f8662o3 /*23*/:
                        return "API_DISABLED";
                    case j.f8667p3 /*24*/:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i10 + ")";
                }
        }
    }

    public int d() {
        return this.f8329n;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f8329n == bVar.f8329n && o.a(this.f8330o, bVar.f8330o) && o.a(this.f8331p, bVar.f8331p);
    }

    public String f() {
        return this.f8331p;
    }

    public PendingIntent g() {
        return this.f8330o;
    }

    public int hashCode() {
        return o.b(Integer.valueOf(this.f8329n), this.f8330o, this.f8331p);
    }

    public boolean i() {
        return (this.f8329n == 0 || this.f8330o == null) ? false : true;
    }

    public boolean k() {
        return this.f8329n == 0;
    }

    public String toString() {
        o.a c10 = o.c(this);
        c10.a("statusCode", l(this.f8329n));
        c10.a("resolution", this.f8330o);
        c10.a("message", this.f8331p);
        return c10.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.m(parcel, 1, this.f8328m);
        c.m(parcel, 2, d());
        c.s(parcel, 3, g(), i10, false);
        c.t(parcel, 4, f(), false);
        c.b(parcel, a10);
    }
}
