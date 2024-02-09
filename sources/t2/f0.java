package t2;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;
import h2.d;
import i2.a;
import i2.c;
import java.util.Iterator;
import java.util.List;
import l2.o;

@Deprecated
public final class f0 extends a {
    public static final Parcelable.Creator<f0> CREATOR = new g0();

    /* renamed from: m  reason: collision with root package name */
    LocationRequest f12354m;

    f0(LocationRequest locationRequest, List list, boolean z9, boolean z10, String str, boolean z11, boolean z12, String str2, long j10) {
        WorkSource workSource;
        LocationRequest.a aVar = new LocationRequest.a(locationRequest);
        if (list != null) {
            if (list.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    o.a(workSource, dVar.f9140m, dVar.f9141n);
                }
            }
            aVar.l(workSource);
        }
        if (z9) {
            aVar.b(1);
        }
        if (z10) {
            aVar.k(2);
        }
        if (str != null) {
            aVar.j(str);
        } else if (str2 != null) {
            aVar.j(str2);
        }
        if (z11) {
            aVar.i(true);
        }
        if (z12) {
            aVar.h(true);
        }
        if (j10 != Long.MAX_VALUE) {
            aVar.d(j10);
        }
        this.f12354m = aVar.a();
    }

    @Deprecated
    public static f0 d(String str, LocationRequest locationRequest) {
        return new f0(locationRequest, (List) null, false, false, (String) null, false, false, (String) null, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f0) {
            return h2.o.a(this.f12354m, ((f0) obj).f12354m);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12354m.hashCode();
    }

    public final String toString() {
        return this.f12354m.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.s(parcel, 1, this.f12354m, i10, false);
        c.b(parcel, a10);
    }
}
