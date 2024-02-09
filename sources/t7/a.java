package t7;

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
    private Size f12451b;

    /* renamed from: c  reason: collision with root package name */
    private e f12452c;

    /* renamed from: d  reason: collision with root package name */
    private MeteringRectangle f12453d;

    /* renamed from: e  reason: collision with root package name */
    private final b f12454e;

    public a(y yVar, b bVar) {
        super(yVar);
        this.f12454e = bVar;
    }

    private void b() {
        MeteringRectangle b10;
        if (this.f12451b != null) {
            if (this.f12452c == null) {
                b10 = null;
            } else {
                j.f c10 = this.f12454e.c();
                if (c10 == null) {
                    c10 = this.f12454e.b().c();
                }
                b10 = b0.b(this.f12451b, this.f12452c.f11403a.doubleValue(), this.f12452c.f11404b.doubleValue(), c10);
            }
            this.f12453d = b10;
            return;
        }
        throw new AssertionError("The cameraBoundaries should be set (using `FocusPointFeature.setCameraBoundaries(Size)`) before updating the focus point.");
    }

    public void a(CaptureRequest.Builder builder) {
        MeteringRectangle[] meteringRectangleArr;
        if (c()) {
            CaptureRequest.Key key = CaptureRequest.CONTROL_AF_REGIONS;
            MeteringRectangle meteringRectangle = this.f12453d;
            if (meteringRectangle == null) {
                meteringRectangleArr = null;
            } else {
                meteringRectangleArr = new MeteringRectangle[]{meteringRectangle};
            }
            builder.set(key, meteringRectangleArr);
        }
    }

    public boolean c() {
        Integer r9 = this.f11401a.r();
        return r9 != null && r9.intValue() > 0;
    }

    public void d(Size size) {
        this.f12451b = size;
        b();
    }

    public void e(e eVar) {
        if (eVar == null || eVar.f11403a == null || eVar.f11404b == null) {
            eVar = null;
        }
        this.f12452c = eVar;
        b();
    }
}
