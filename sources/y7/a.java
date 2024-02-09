package y7;

import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import io.flutter.plugins.camera.n0;
import io.flutter.plugins.camera.y;

public class a extends n7.a<Float> {

    /* renamed from: g  reason: collision with root package name */
    private static final Float f13316g = Float.valueOf(1.0f);

    /* renamed from: b  reason: collision with root package name */
    private final boolean f13317b;

    /* renamed from: c  reason: collision with root package name */
    private final Rect f13318c;

    /* renamed from: d  reason: collision with root package name */
    private Float f13319d;

    /* renamed from: e  reason: collision with root package name */
    private Float f13320e;

    /* renamed from: f  reason: collision with root package name */
    private final Float f13321f;

    public a(y yVar) {
        super(yVar);
        Float p10;
        Float f10 = f13316g;
        this.f13319d = f10;
        this.f13320e = f10;
        Rect g10 = yVar.g();
        this.f13318c = g10;
        boolean z9 = false;
        if (g10 == null) {
            this.f13321f = this.f13320e;
            this.f13317b = false;
            return;
        }
        if (n0.g()) {
            this.f13320e = yVar.i();
            p10 = yVar.q();
        } else {
            this.f13320e = f10;
            p10 = yVar.p();
            if (p10 == null || p10.floatValue() < this.f13320e.floatValue()) {
                p10 = this.f13320e;
            }
        }
        this.f13321f = p10;
        this.f13317b = Float.compare(this.f13321f.floatValue(), this.f13320e.floatValue()) > 0 ? true : z9;
    }

    public void a(CaptureRequest.Builder builder) {
        if (b()) {
            if (n0.g()) {
                builder.set(CaptureRequest.CONTROL_ZOOM_RATIO, b.a(this.f13319d.floatValue(), this.f13320e.floatValue(), this.f13321f.floatValue()));
                return;
            }
            builder.set(CaptureRequest.SCALER_CROP_REGION, b.b(this.f13319d.floatValue(), this.f13318c, this.f13320e.floatValue(), this.f13321f.floatValue()));
        }
    }

    public boolean b() {
        return this.f13317b;
    }

    public float c() {
        return this.f13321f.floatValue();
    }

    public float d() {
        return this.f13320e.floatValue();
    }

    public void e(Float f10) {
        this.f13319d = f10;
    }
}
