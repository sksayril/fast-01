package h2;

public final class q {

    /* renamed from: b  reason: collision with root package name */
    private static q f9245b;

    /* renamed from: c  reason: collision with root package name */
    private static final r f9246c = new r(0, false, false, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    private r f9247a;

    private q() {
    }

    public static synchronized q b() {
        q qVar;
        synchronized (q.class) {
            if (f9245b == null) {
                f9245b = new q();
            }
            qVar = f9245b;
        }
        return qVar;
    }

    public r a() {
        return this.f9247a;
    }

    public final synchronized void c(r rVar) {
        if (rVar == null) {
            this.f9247a = f9246c;
            return;
        }
        r rVar2 = this.f9247a;
        if (rVar2 == null || rVar2.k() < rVar.k()) {
            this.f9247a = rVar;
        }
    }
}
