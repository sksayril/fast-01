package v7;

import android.hardware.camera2.CaptureRequest;
import io.flutter.plugins.camera.n0;
import io.flutter.plugins.camera.y;
import java.util.HashMap;

public class a extends n7.a<b> {

    /* renamed from: b  reason: collision with root package name */
    private b f12750b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<b, Integer> f12751c;

    public a(y yVar) {
        super(yVar);
        b bVar = b.fast;
        this.f12750b = bVar;
        HashMap<b, Integer> hashMap = new HashMap<>();
        this.f12751c = hashMap;
        hashMap.put(b.off, 0);
        hashMap.put(bVar, 1);
        hashMap.put(b.highQuality, 2);
        if (n0.d()) {
            hashMap.put(b.minimal, 3);
            hashMap.put(b.zeroShutterLag, 4);
        }
    }

    public void a(CaptureRequest.Builder builder) {
        if (b()) {
            builder.set(CaptureRequest.NOISE_REDUCTION_MODE, this.f12751c.get(this.f12750b));
        }
    }

    public boolean b() {
        int[] c10 = this.f11401a.c();
        return c10 != null && c10.length > 0;
    }
}
