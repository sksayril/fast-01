package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import h2.o;
import i2.a;
import i2.c;
import java.util.Collections;
import java.util.List;

public final class LocationResult extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationResult> CREATOR = new c();

    /* renamed from: n  reason: collision with root package name */
    static final List f5794n = Collections.emptyList();

    /* renamed from: m  reason: collision with root package name */
    private final List f5795m;

    LocationResult(List list) {
        this.f5795m = list;
    }

    public Location d() {
        int size = this.f5795m.size();
        if (size == 0) {
            return null;
        }
        return (Location) this.f5795m.get(size - 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.google.android.gms.location.LocationResult
            r1 = 0
            if (r0 == 0) goto L_0x008c
            com.google.android.gms.location.LocationResult r10 = (com.google.android.gms.location.LocationResult) r10
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L_0x0016
            java.util.List r0 = r9.f5795m
            java.util.List r10 = r10.f5795m
            boolean r10 = r0.equals(r10)
            return r10
        L_0x0016:
            java.util.List r0 = r9.f5795m
            int r0 = r0.size()
            java.util.List r2 = r10.f5795m
            int r2 = r2.size()
            if (r0 == r2) goto L_0x0025
            return r1
        L_0x0025:
            java.util.List r0 = r9.f5795m
            java.util.Iterator r0 = r0.iterator()
            java.util.List r10 = r10.f5795m
            java.util.Iterator r10 = r10.iterator()
        L_0x0031:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x008a
            java.lang.Object r2 = r0.next()
            android.location.Location r2 = (android.location.Location) r2
            java.lang.Object r3 = r10.next()
            android.location.Location r3 = (android.location.Location) r3
            double r4 = r2.getLatitude()
            double r6 = r3.getLatitude()
            int r4 = java.lang.Double.compare(r4, r6)
            if (r4 == 0) goto L_0x0052
            return r1
        L_0x0052:
            double r4 = r2.getLongitude()
            double r6 = r3.getLongitude()
            int r4 = java.lang.Double.compare(r4, r6)
            if (r4 == 0) goto L_0x0061
            return r1
        L_0x0061:
            long r4 = r2.getTime()
            long r6 = r3.getTime()
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x006e
            return r1
        L_0x006e:
            long r4 = r2.getElapsedRealtimeNanos()
            long r6 = r3.getElapsedRealtimeNanos()
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x007b
            return r1
        L_0x007b:
            java.lang.String r2 = r2.getProvider()
            java.lang.String r3 = r3.getProvider()
            boolean r2 = h2.o.a(r2, r3)
            if (r2 != 0) goto L_0x0031
            return r1
        L_0x008a:
            r10 = 1
            return r10
        L_0x008c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationResult.equals(java.lang.Object):boolean");
    }

    public List<Location> f() {
        return this.f5795m;
    }

    public int hashCode() {
        return o.b(this.f5795m);
    }

    public String toString() {
        return "LocationResult".concat(String.valueOf(this.f5795m));
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.w(parcel, 1, f(), false);
        c.b(parcel, a10);
    }
}
