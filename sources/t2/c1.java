package t2;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.LocationRequest;
import g2.d;
import w2.g;

public final class c1 extends a implements d1 {
    c1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    public final void B1(h0 h0Var) {
        Parcel B = B();
        n.c(B, h0Var);
        Y(59, B);
    }

    public final void F2(d0 d0Var, d dVar) {
        Parcel B = B();
        n.c(B, d0Var);
        n.d(B, dVar);
        Y(89, B);
    }

    public final void T2(g gVar, h1 h1Var, String str) {
        Parcel B = B();
        n.c(B, gVar);
        n.d(B, h1Var);
        B.writeString((String) null);
        Y(63, B);
    }

    public final Location c() {
        Parcel J = J(7, B());
        Location location = (Location) n.a(J, Location.CREATOR);
        J.recycle();
        return location;
    }

    public final void g1(w2.d dVar, f1 f1Var) {
        Parcel B = B();
        n.c(B, dVar);
        n.d(B, f1Var);
        Y(82, B);
    }

    public final void v0(d0 d0Var, LocationRequest locationRequest, d dVar) {
        Parcel B = B();
        n.c(B, d0Var);
        n.c(B, locationRequest);
        n.d(B, dVar);
        Y(88, B);
    }
}
