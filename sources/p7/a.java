package p7;

import android.annotation.SuppressLint;
import android.hardware.camera2.CaptureRequest;
import io.flutter.plugins.camera.y;

public class a extends n7.a<b> {

    /* renamed from: b  reason: collision with root package name */
    private b f11936b = b.auto;

    public a(y yVar) {
        super(yVar);
    }

    public void a(CaptureRequest.Builder builder) {
        if (b()) {
            builder.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.valueOf(this.f11936b == b.locked));
        }
    }

    public boolean b() {
        return true;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public b c() {
        return this.f11936b;
    }

    public void d(b bVar) {
        this.f11936b = bVar;
    }
}
