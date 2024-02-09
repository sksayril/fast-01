package x4;

public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private static b f13197a;

    private b() {
    }

    public static b b() {
        if (f13197a == null) {
            f13197a = new b();
        }
        return f13197a;
    }

    public long a() {
        return System.currentTimeMillis();
    }
}
