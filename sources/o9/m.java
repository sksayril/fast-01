package o9;

import android.media.SoundPool;
import g8.d;
import g8.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.l;
import n9.a;
import p9.b;
import p9.c;

public final class m implements j {

    /* renamed from: a  reason: collision with root package name */
    private final o f11667a;

    /* renamed from: b  reason: collision with root package name */
    private final l f11668b;

    /* renamed from: c  reason: collision with root package name */
    private Integer f11669c;

    /* renamed from: d  reason: collision with root package name */
    private Integer f11670d;

    /* renamed from: e  reason: collision with root package name */
    private a f11671e;

    /* renamed from: f  reason: collision with root package name */
    private n f11672f;

    public m(o oVar, l lVar) {
        l.e(oVar, "wrappedPlayer");
        l.e(lVar, "soundPoolManager");
        this.f11667a = oVar;
        this.f11668b = lVar;
        a h10 = oVar.h();
        this.f11671e = h10;
        lVar.b(32, h10);
        n e10 = lVar.e(this.f11671e);
        if (e10 != null) {
            this.f11672f = e10;
            return;
        }
        throw new IllegalStateException(("Could not create SoundPool " + this.f11671e).toString());
    }

    private final SoundPool r() {
        return this.f11672f.c();
    }

    private final int u(boolean z9) {
        return z9 ? -1 : 0;
    }

    private final void v(a aVar) {
        if (!l.a(this.f11671e.a(), aVar.a())) {
            a();
            this.f11668b.b(32, aVar);
            n e10 = this.f11668b.e(aVar);
            if (e10 != null) {
                this.f11672f = e10;
            } else {
                throw new IllegalStateException(("Could not create SoundPool " + aVar).toString());
            }
        }
        this.f11671e = aVar;
    }

    private final Void x(String str) {
        throw new UnsupportedOperationException("LOW_LATENCY mode does not support: " + str);
    }

    public void a() {
        stop();
        Integer num = this.f11669c;
        if (num != null) {
            int intValue = num.intValue();
            c s9 = s();
            if (s9 != null) {
                synchronized (this.f11672f.d()) {
                    List list = this.f11672f.d().get(s9);
                    if (list != null) {
                        if (v.x(list) == this) {
                            this.f11672f.d().remove(s9);
                            r().unload(intValue);
                            this.f11672f.b().remove(Integer.valueOf(intValue));
                            o oVar = this.f11667a;
                            oVar.s("unloaded soundId " + intValue);
                        } else {
                            list.remove(this);
                        }
                        this.f11669c = null;
                        s sVar = s.f8976a;
                    }
                }
            }
        }
    }

    public void b() {
        Integer num = this.f11670d;
        if (num != null) {
            r().pause(num.intValue());
        }
    }

    public void c() {
    }

    public void d(boolean z9) {
        Integer num = this.f11670d;
        if (num != null) {
            r().setLoop(num.intValue(), u(z9));
        }
    }

    public boolean e() {
        return false;
    }

    public void f() {
    }

    public /* bridge */ /* synthetic */ Integer g() {
        return (Integer) p();
    }

    public boolean h() {
        return false;
    }

    public void i(float f10) {
        Integer num = this.f11670d;
        if (num != null) {
            r().setRate(num.intValue(), f10);
        }
    }

    public void j(int i10) {
        if (i10 == 0) {
            Integer num = this.f11670d;
            if (num != null) {
                int intValue = num.intValue();
                stop();
                if (this.f11667a.m()) {
                    r().resume(intValue);
                    return;
                }
                return;
            }
            return;
        }
        x("seek");
        throw new d();
    }

    public void k(b bVar) {
        l.e(bVar, "source");
        bVar.a(this);
    }

    public void l(a aVar) {
        l.e(aVar, "context");
        v(aVar);
    }

    public void m(float f10, float f11) {
        Integer num = this.f11670d;
        if (num != null) {
            r().setVolume(num.intValue(), f10, f11);
        }
    }

    public /* bridge */ /* synthetic */ Integer n() {
        return (Integer) o();
    }

    public Void o() {
        return null;
    }

    public Void p() {
        return null;
    }

    public final Integer q() {
        return this.f11669c;
    }

    public final c s() {
        b p10 = this.f11667a.p();
        if (p10 instanceof c) {
            return (c) p10;
        }
        return null;
    }

    public void start() {
        Integer num = this.f11670d;
        Integer num2 = this.f11669c;
        if (num != null) {
            r().resume(num.intValue());
        } else if (num2 != null) {
            this.f11670d = Integer.valueOf(r().play(num2.intValue(), this.f11667a.q(), this.f11667a.q(), 0, u(this.f11667a.v()), this.f11667a.o()));
        }
    }

    public void stop() {
        Integer num = this.f11670d;
        if (num != null) {
            r().stop(num.intValue());
            this.f11670d = null;
        }
    }

    public final o t() {
        return this.f11667a;
    }

    public final void w(c cVar) {
        o oVar;
        String str;
        l.e(cVar, "urlSource");
        if (this.f11669c != null) {
            a();
        }
        synchronized (this.f11672f.d()) {
            Map<c, List<m>> d10 = this.f11672f.d();
            List<m> list = d10.get(cVar);
            if (list == null) {
                list = new ArrayList<>();
                d10.put(cVar, list);
            }
            List list2 = list;
            m mVar = (m) v.n(list2);
            if (mVar != null) {
                boolean n10 = mVar.f11667a.n();
                this.f11667a.I(n10);
                this.f11669c = mVar.f11669c;
                oVar = this.f11667a;
                str = "Reusing soundId " + this.f11669c + " for " + cVar + " is prepared=" + n10 + ' ' + this;
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                this.f11667a.I(false);
                this.f11667a.s("Fetching actual URL for " + cVar);
                String d11 = cVar.d();
                this.f11667a.s("Now loading " + d11);
                int load = r().load(d11, 1);
                this.f11672f.b().put(Integer.valueOf(load), this);
                this.f11669c = Integer.valueOf(load);
                oVar = this.f11667a;
                str = "time to call load() for " + cVar + ": " + (System.currentTimeMillis() - currentTimeMillis) + " player=" + this;
            }
            oVar.s(str);
            list2.add(this);
        }
    }
}
