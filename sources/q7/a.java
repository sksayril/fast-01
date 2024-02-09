package q7;

import android.annotation.SuppressLint;
import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import io.flutter.plugins.camera.y;

public class a extends n7.a<Double> {

    /* renamed from: b  reason: collision with root package name */
    private double f12024b = 0.0d;

    public a(y yVar) {
        super(yVar);
    }

    public void a(CaptureRequest.Builder builder) {
        if (b()) {
            builder.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf((int) this.f12024b));
        }
    }

    public boolean b() {
        return true;
    }

    public double c() {
        return this.f11401a.e();
    }

    public double d() {
        Range<Integer> d10 = this.f11401a.d();
        return (d10 == null ? 0.0d : (double) d10.getUpper().intValue()) * c();
    }

    public double e() {
        Range<Integer> d10 = this.f11401a.d();
        return (d10 == null ? 0.0d : (double) d10.getLower().intValue()) * c();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public Double f() {
        return Double.valueOf(this.f12024b);
    }

    public void g(Double d10) {
        this.f12024b = d10.doubleValue() / c();
    }
}
