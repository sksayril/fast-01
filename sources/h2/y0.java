package h2;

import android.util.Log;

public abstract class y0 {

    /* renamed from: a  reason: collision with root package name */
    private Object f9266a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f9267b = false;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c f9268c;

    public y0(c cVar, Object obj) {
        this.f9268c = cVar;
        this.f9266a = obj;
    }

    /* access modifiers changed from: protected */
    public abstract void a(Object obj);

    /* access modifiers changed from: protected */
    public abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            obj = this.f9266a;
            if (this.f9267b) {
                String obj2 = toString();
                Log.w("GmsClient", "Callback proxy " + obj2 + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                a(obj);
            } catch (RuntimeException e10) {
                throw e10;
            }
        }
        synchronized (this) {
            this.f9267b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f9266a = null;
        }
    }

    public final void e() {
        d();
        synchronized (this.f9268c.f9127r) {
            this.f9268c.f9127r.remove(this);
        }
    }
}
