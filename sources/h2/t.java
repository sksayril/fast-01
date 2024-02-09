package h2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.a;
import i2.c;
import java.util.ArrayList;
import java.util.List;

public class t extends a {
    public static final Parcelable.Creator<t> CREATOR = new y();

    /* renamed from: m  reason: collision with root package name */
    private final int f9256m;

    /* renamed from: n  reason: collision with root package name */
    private List f9257n;

    public t(int i10, List list) {
        this.f9256m = i10;
        this.f9257n = list;
    }

    public final int d() {
        return this.f9256m;
    }

    public final List f() {
        return this.f9257n;
    }

    public final void g(n nVar) {
        if (this.f9257n == null) {
            this.f9257n = new ArrayList();
        }
        this.f9257n.add(nVar);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.m(parcel, 1, this.f9256m);
        c.w(parcel, 2, this.f9257n, false);
        c.b(parcel, a10);
    }
}
