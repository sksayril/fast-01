package g9;

import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class t<E> {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f9031a = AtomicReferenceFieldUpdater.newUpdater(t.class, Object.class, "_cur");
    private volatile Object _cur;

    public t(boolean z9) {
        this._cur = new u(8, z9);
    }

    public final boolean a(E e10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9031a;
        while (true) {
            u uVar = (u) atomicReferenceFieldUpdater.get(this);
            int a10 = uVar.a(e10);
            if (a10 == 0) {
                return true;
            }
            if (a10 == 1) {
                b.a(f9031a, this, uVar, uVar.i());
            } else if (a10 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9031a;
        while (true) {
            u uVar = (u) atomicReferenceFieldUpdater.get(this);
            if (!uVar.d()) {
                b.a(f9031a, this, uVar, uVar.i());
            } else {
                return;
            }
        }
    }

    public final int c() {
        return ((u) f9031a.get(this)).f();
    }

    public final E d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9031a;
        while (true) {
            u uVar = (u) atomicReferenceFieldUpdater.get(this);
            E j10 = uVar.j();
            if (j10 != u.f9035h) {
                return j10;
            }
            b.a(f9031a, this, uVar, uVar.i());
        }
    }
}
