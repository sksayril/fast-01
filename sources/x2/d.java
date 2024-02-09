package x2;

import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.widget.FrameLayout;
import com.google.android.gms.maps.GoogleMapOptions;
import h2.p;
import o2.a;

public class d extends FrameLayout {

    /* renamed from: m  reason: collision with root package name */
    private final m f13151m;

    public d(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.f13151m = new m(this, context, googleMapOptions);
        setClickable(true);
    }

    public void a(f fVar) {
        p.e("getMapAsync() must be called on the main thread");
        p.k(fVar, "callback must not be null.");
        this.f13151m.p(fVar);
    }

    public void b(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.f13151m.c(bundle);
            if (this.f13151m.b() == null) {
                a.i(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void c() {
        this.f13151m.d();
    }

    public void d() {
        this.f13151m.e();
    }

    public void e(Bundle bundle) {
        this.f13151m.f(bundle);
    }

    public void f() {
        this.f13151m.g();
    }

    public void g() {
        this.f13151m.h();
    }
}
