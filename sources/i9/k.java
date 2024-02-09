package i9;

import b9.n0;

public final class k extends h {

    /* renamed from: o  reason: collision with root package name */
    public final Runnable f9644o;

    public k(Runnable runnable, long j10, i iVar) {
        super(j10, iVar);
        this.f9644o = runnable;
    }

    public void run() {
        try {
            this.f9644o.run();
        } finally {
            this.f9642n.a();
        }
    }

    public String toString() {
        return "Task[" + n0.a(this.f9644o) + '@' + n0.b(this.f9644o) + ", " + this.f9641m + ", " + this.f9642n + ']';
    }
}
