package n7;

import android.app.Activity;
import io.flutter.plugins.camera.h0;
import io.flutter.plugins.camera.y;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import o7.a;
import w7.b;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, a<?>> f11402a = new HashMap();

    public static d k(b bVar, y yVar, Activity activity, h0 h0Var, b bVar2) {
        d dVar = new d();
        dVar.l(bVar.f(yVar, false));
        dVar.m(bVar.j(yVar));
        dVar.n(bVar.g(yVar));
        x7.b h10 = bVar.h(yVar, activity, h0Var);
        dVar.u(h10);
        dVar.o(bVar.d(yVar, h10));
        dVar.p(bVar.e(yVar));
        dVar.q(bVar.b(yVar, h10));
        dVar.r(bVar.i(yVar));
        dVar.s(bVar.c(yVar));
        dVar.t(bVar.a(yVar, bVar2, yVar.s()));
        dVar.v(bVar.k(yVar));
        return dVar;
    }

    public Collection<a<?>> a() {
        return this.f11402a.values();
    }

    public a b() {
        return (a) this.f11402a.get("AUTO_FOCUS");
    }

    public p7.a c() {
        return (p7.a) this.f11402a.get("EXPOSURE_LOCK");
    }

    public q7.a d() {
        a aVar = this.f11402a.get("EXPOSURE_OFFSET");
        Objects.requireNonNull(aVar);
        return (q7.a) aVar;
    }

    public r7.a e() {
        a aVar = this.f11402a.get("EXPOSURE_POINT");
        Objects.requireNonNull(aVar);
        return (r7.a) aVar;
    }

    public s7.a f() {
        a aVar = this.f11402a.get("FLASH");
        Objects.requireNonNull(aVar);
        return (s7.a) aVar;
    }

    public t7.a g() {
        a aVar = this.f11402a.get("FOCUS_POINT");
        Objects.requireNonNull(aVar);
        return (t7.a) aVar;
    }

    public w7.a h() {
        a aVar = this.f11402a.get("RESOLUTION");
        Objects.requireNonNull(aVar);
        return (w7.a) aVar;
    }

    public x7.b i() {
        a aVar = this.f11402a.get("SENSOR_ORIENTATION");
        Objects.requireNonNull(aVar);
        return (x7.b) aVar;
    }

    public y7.a j() {
        a aVar = this.f11402a.get("ZOOM_LEVEL");
        Objects.requireNonNull(aVar);
        return (y7.a) aVar;
    }

    public void l(a aVar) {
        this.f11402a.put("AUTO_FOCUS", aVar);
    }

    public void m(p7.a aVar) {
        this.f11402a.put("EXPOSURE_LOCK", aVar);
    }

    public void n(q7.a aVar) {
        this.f11402a.put("EXPOSURE_OFFSET", aVar);
    }

    public void o(r7.a aVar) {
        this.f11402a.put("EXPOSURE_POINT", aVar);
    }

    public void p(s7.a aVar) {
        this.f11402a.put("FLASH", aVar);
    }

    public void q(t7.a aVar) {
        this.f11402a.put("FOCUS_POINT", aVar);
    }

    public void r(u7.a aVar) {
        this.f11402a.put("FPS_RANGE", aVar);
    }

    public void s(v7.a aVar) {
        this.f11402a.put("NOISE_REDUCTION", aVar);
    }

    public void t(w7.a aVar) {
        this.f11402a.put("RESOLUTION", aVar);
    }

    public void u(x7.b bVar) {
        this.f11402a.put("SENSOR_ORIENTATION", bVar);
    }

    public void v(y7.a aVar) {
        this.f11402a.put("ZOOM_LEVEL", aVar);
    }
}
