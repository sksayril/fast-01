package w2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import i2.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class g extends i2.a {
    public static final Parcelable.Creator<g> CREATOR = new b0();

    /* renamed from: m  reason: collision with root package name */
    private final List f12837m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f12838n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f12839o;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final ArrayList f12840a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private boolean f12841b = false;

        /* renamed from: c  reason: collision with root package name */
        private boolean f12842c = false;

        public a a(LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.f12840a.add(locationRequest);
            }
            return this;
        }

        public g b() {
            return new g(this.f12840a, this.f12841b, this.f12842c);
        }
    }

    g(List list, boolean z9, boolean z10) {
        this.f12837m = list;
        this.f12838n = z9;
        this.f12839o = z10;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.w(parcel, 1, Collections.unmodifiableList(this.f12837m), false);
        c.c(parcel, 2, this.f12838n);
        c.c(parcel, 3, this.f12839o);
        c.b(parcel, a10);
    }
}
