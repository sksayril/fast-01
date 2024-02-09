package r7;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Size;
import io.flutter.embedding.engine.systemchannels.j;
import io.flutter.plugins.camera.b0;
import io.flutter.plugins.camera.y;
import n7.e;
import x7.b;

public class a extends n7.a<e> {

    /* renamed from: b  reason: collision with root package name */
    private Size f12124b;

    /* renamed from: c  reason: collision with root package name */
    private e f12125c;

    /* renamed from: d  reason: collision with root package name */
    private MeteringRectangle f12126d;

    /* renamed from: e  reason: collision with root package name */
    private final b f12127e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f12128f = false;

    /* renamed from: g  reason: collision with root package name */
    public MeteringRectangle[] f12129g;

    public a(y yVar, b bVar) {
        super(yVar);
        this.f12127e = bVar;
    }

    private void b() {
        MeteringRectangle b10;
        if (this.f12124b != null) {
            if (this.f12125c == null) {
                b10 = null;
            } else {
                j.f c10 = this.f12127e.c();
                if (c10 == null) {
                    c10 = this.f12127e.b().c();
                }
                b10 = b0.b(this.f12124b, this.f12125c.f11403a.doubleValue(), this.f12125c.f11404b.doubleValue(), c10);
            }
            this.f12126d = b10;
            return;
        }
        throw new AssertionError("The cameraBoundaries should be set (using `ExposurePointFeature.setCameraBoundaries(Size)`) before updating the exposure point.");
    }

    public void a(CaptureRequest.Builder builder) {
        if (c()) {
            if (!this.f12128f) {
                this.f12129g = (MeteringRectangle[]) builder.get(CaptureRequest.CONTROL_AE_REGIONS);
                this.f12128f = true;
            }
            MeteringRectangle meteringRectangle = this.f12126d;
            if (meteringRectangle != null) {
                builder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{meteringRectangle});
                return;
            }
            builder.set(CaptureRequest.CONTROL_AE_REGIONS, this.f12129g);
        }
    }

    public boolean c() {
        Integer b10 = this.f11401a.b();
        return b10 != null && b10.intValue() > 0;
    }

    public void d(Size size) {
        this.f12124b = size;
        b();
    }

    public void e(e eVar) {
        if (eVar == null || eVar.f11403a == null || eVar.f11404b == null) {
            eVar = null;
        }
        this.f12125c = eVar;
        b();
    }
}
