package u7;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import io.flutter.plugins.camera.i0;
import io.flutter.plugins.camera.y;

public class a extends n7.a<Range<Integer>> {

    /* renamed from: c  reason: collision with root package name */
    private static final Range<Integer> f12537c = new Range<>(30, 30);

    /* renamed from: b  reason: collision with root package name */
    private Range<Integer> f12538b;

    public a(y yVar) {
        super(yVar);
        Range<Integer> range;
        if (c()) {
            this.f12538b = f12537c;
            return;
        }
        Range<Integer>[] o10 = yVar.o();
        if (o10 != null) {
            for (Range<Integer> range2 : o10) {
                int intValue = range2.getUpper().intValue();
                if (intValue >= 10 && ((range = this.f12538b) == null || intValue > range.getUpper().intValue())) {
                    this.f12538b = range2;
                }
            }
        }
    }

    private boolean c() {
        String a10 = i0.a();
        String b10 = i0.b();
        return a10 != null && a10.equals("google") && b10 != null && b10.equals("Pixel 4a");
    }

    public void a(CaptureRequest.Builder builder) {
        if (b()) {
            builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, this.f12538b);
        }
    }

    public boolean b() {
        return true;
    }
}
