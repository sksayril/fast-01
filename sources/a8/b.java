package a8;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private c f44a;

    /* renamed from: b  reason: collision with root package name */
    private c f45b;

    /* renamed from: c  reason: collision with root package name */
    private final long f46c;

    /* renamed from: d  reason: collision with root package name */
    private final long f47d;

    public b(long j10, long j11) {
        this.f46c = j10;
        this.f47d = j11;
        this.f44a = c.a(j10);
        this.f45b = c.a(j11);
    }

    public c a() {
        return this.f44a;
    }

    public c b() {
        return this.f45b;
    }

    public void c() {
        this.f44a = c.a(this.f46c);
        this.f45b = c.a(this.f47d);
    }
}
