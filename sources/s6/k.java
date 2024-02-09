package s6;

final class k {

    /* renamed from: a  reason: collision with root package name */
    private final j f12285a;

    /* renamed from: b  reason: collision with root package name */
    final Runnable f12286b;

    k(j jVar, Runnable runnable) {
        this.f12285a = jVar;
        this.f12286b = runnable;
    }

    public Integer a() {
        j jVar = this.f12285a;
        if (jVar != null) {
            return Integer.valueOf(jVar.a());
        }
        return null;
    }

    public boolean b() {
        j jVar = this.f12285a;
        return jVar != null && jVar.b();
    }
}
