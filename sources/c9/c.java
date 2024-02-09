package c9;

import android.os.Handler;
import android.os.Looper;
import b9.v1;
import b9.x0;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

public final class c extends d {
    private volatile c _immediate;

    /* renamed from: o  reason: collision with root package name */
    private final Handler f3881o;

    /* renamed from: p  reason: collision with root package name */
    private final String f3882p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f3883q;

    /* renamed from: r  reason: collision with root package name */
    private final c f3884r;

    public c(Handler handler, String str) {
        this(handler, str, false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Handler handler, String str, int i10, g gVar) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private c(Handler handler, String str, boolean z9) {
        super((g) null);
        c cVar = null;
        this.f3881o = handler;
        this.f3882p = str;
        this.f3883q = z9;
        this._immediate = z9 ? this : cVar;
        c cVar2 = this._immediate;
        if (cVar2 == null) {
            cVar2 = new c(handler, str, true);
            this._immediate = cVar2;
        }
        this.f3884r = cVar2;
    }

    private final void N(j8.g gVar, Runnable runnable) {
        v1.c(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        x0.b().I(gVar, runnable);
    }

    public void I(j8.g gVar, Runnable runnable) {
        if (!this.f3881o.post(runnable)) {
            N(gVar, runnable);
        }
    }

    public boolean J(j8.g gVar) {
        return !this.f3883q || !l.a(Looper.myLooper(), this.f3881o.getLooper());
    }

    /* renamed from: O */
    public c L() {
        return this.f3884r;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f3881o == this.f3881o;
    }

    public int hashCode() {
        return System.identityHashCode(this.f3881o);
    }

    public String toString() {
        String M = M();
        if (M != null) {
            return M;
        }
        String str = this.f3882p;
        if (str == null) {
            str = this.f3881o.toString();
        }
        if (!this.f3883q) {
            return str;
        }
        return str + ".immediate";
    }
}
