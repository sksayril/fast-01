package o;

import android.content.res.ColorStateList;

class b implements d {
    b() {
    }

    private e n(c cVar) {
        return (e) cVar.e();
    }

    public ColorStateList a(c cVar) {
        return n(cVar).b();
    }

    public float b(c cVar) {
        return n(cVar).c();
    }

    public void c(c cVar, float f10) {
        n(cVar).g(f10, cVar.d(), cVar.c());
        o(cVar);
    }

    public float d(c cVar) {
        return j(cVar) * 2.0f;
    }

    public void e(c cVar) {
        c(cVar, b(cVar));
    }

    public float f(c cVar) {
        return j(cVar) * 2.0f;
    }

    public void g() {
    }

    public void h(c cVar, ColorStateList colorStateList) {
        n(cVar).f(colorStateList);
    }

    public void i(c cVar) {
        c(cVar, b(cVar));
    }

    public float j(c cVar) {
        return n(cVar).d();
    }

    public float k(c cVar) {
        return cVar.b().getElevation();
    }

    public void l(c cVar, float f10) {
        n(cVar).h(f10);
    }

    public void m(c cVar, float f10) {
        cVar.b().setElevation(f10);
    }

    public void o(c cVar) {
        if (!cVar.d()) {
            cVar.a(0, 0, 0, 0);
            return;
        }
        float b10 = b(cVar);
        float j10 = j(cVar);
        int ceil = (int) Math.ceil((double) f.a(b10, j10, cVar.c()));
        int ceil2 = (int) Math.ceil((double) f.b(b10, j10, cVar.c()));
        cVar.a(ceil, ceil2, ceil, ceil2);
    }
}
