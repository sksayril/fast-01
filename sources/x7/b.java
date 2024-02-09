package x7;

import android.app.Activity;
import android.hardware.camera2.CaptureRequest;
import io.flutter.embedding.engine.systemchannels.j;
import io.flutter.plugins.camera.h0;
import io.flutter.plugins.camera.y;
import n7.a;

public class b extends a<Integer> {

    /* renamed from: b  reason: collision with root package name */
    private Integer f13221b = 0;

    /* renamed from: c  reason: collision with root package name */
    private final a f13222c;

    /* renamed from: d  reason: collision with root package name */
    private j.f f13223d;

    public b(y yVar, Activity activity, h0 h0Var) {
        super(yVar);
        boolean z9 = false;
        e(Integer.valueOf(yVar.h()));
        a a10 = a.a(activity, h0Var, yVar.a() == 0 ? true : z9, this.f13221b.intValue());
        this.f13222c = a10;
        a10.k();
    }

    public void a(CaptureRequest.Builder builder) {
    }

    public a b() {
        return this.f13222c;
    }

    public j.f c() {
        return this.f13223d;
    }

    public void d(j.f fVar) {
        this.f13223d = fVar;
    }

    public void e(Integer num) {
        this.f13221b = num;
    }

    public void f() {
        this.f13223d = null;
    }
}
