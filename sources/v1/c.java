package v1;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import n1.h;
import p1.i;
import p1.p;
import p1.u;
import q1.e;
import q1.m;
import w1.x;
import x1.d;
import y1.b;

public class c implements e {

    /* renamed from: f  reason: collision with root package name */
    private static final Logger f12693f = Logger.getLogger(u.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final x f12694a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f12695b;

    /* renamed from: c  reason: collision with root package name */
    private final e f12696c;

    /* renamed from: d  reason: collision with root package name */
    private final d f12697d;

    /* renamed from: e  reason: collision with root package name */
    private final b f12698e;

    public c(Executor executor, e eVar, x xVar, d dVar, b bVar) {
        this.f12695b = executor;
        this.f12696c = eVar;
        this.f12694a = xVar;
        this.f12697d = dVar;
        this.f12698e = bVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object d(p pVar, i iVar) {
        this.f12697d.i(pVar, iVar);
        this.f12694a.a(pVar, 1);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(p pVar, h hVar, i iVar) {
        try {
            m a10 = this.f12696c.a(pVar.b());
            if (a10 == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{pVar.b()});
                f12693f.warning(format);
                hVar.a(new IllegalArgumentException(format));
                return;
            }
            this.f12698e.g(new b(this, pVar, a10.b(iVar)));
            hVar.a((Exception) null);
        } catch (Exception e10) {
            Logger logger = f12693f;
            logger.warning("Error scheduling event " + e10.getMessage());
            hVar.a(e10);
        }
    }

    public void a(p pVar, i iVar, h hVar) {
        this.f12695b.execute(new a(this, pVar, hVar, iVar));
    }
}
