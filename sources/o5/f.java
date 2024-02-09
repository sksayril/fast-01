package o5;

public final class f extends m {

    /* renamed from: o  reason: collision with root package name */
    private static final f f11617o;

    static {
        f fVar = new f();
        f11617o = fVar;
        fVar.setStackTrace(m.f11631n);
    }

    private f() {
    }

    private f(Throwable th) {
        super(th);
    }

    public static f a() {
        return m.f11630m ? new f() : f11617o;
    }

    public static f b(Throwable th) {
        return m.f11630m ? new f(th) : f11617o;
    }
}
