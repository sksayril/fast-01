package b0;

import a0.b;
import android.content.Context;
import b9.j0;
import c0.d;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.m;
import r8.l;
import x8.h;
import z.f;

public final class c implements t8.a<Context, f<d>> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final String f3362a;

    /* renamed from: b  reason: collision with root package name */
    private final l<Context, List<z.d<d>>> f3363b;

    /* renamed from: c  reason: collision with root package name */
    private final j0 f3364c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f3365d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private volatile f<d> f3366e;

    static final class a extends m implements r8.a<File> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Context f3367m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ c f3368n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, c cVar) {
            super(0);
            this.f3367m = context;
            this.f3368n = cVar;
        }

        /* renamed from: b */
        public final File invoke() {
            Context context = this.f3367m;
            kotlin.jvm.internal.l.d(context, "applicationContext");
            return b.a(context, this.f3368n.f3362a);
        }
    }

    public c(String str, b<d> bVar, l<? super Context, ? extends List<? extends z.d<d>>> lVar, j0 j0Var) {
        kotlin.jvm.internal.l.e(str, "name");
        kotlin.jvm.internal.l.e(lVar, "produceMigrations");
        kotlin.jvm.internal.l.e(j0Var, "scope");
        this.f3362a = str;
        this.f3363b = lVar;
        this.f3364c = j0Var;
    }

    /* renamed from: c */
    public f<d> a(Context context, h<?> hVar) {
        f<d> fVar;
        kotlin.jvm.internal.l.e(context, "thisRef");
        kotlin.jvm.internal.l.e(hVar, "property");
        f<d> fVar2 = this.f3366e;
        if (fVar2 != null) {
            return fVar2;
        }
        synchronized (this.f3365d) {
            if (this.f3366e == null) {
                Context applicationContext = context.getApplicationContext();
                c0.c cVar = c0.c.f3544a;
                l<Context, List<z.d<d>>> lVar = this.f3363b;
                kotlin.jvm.internal.l.d(applicationContext, "applicationContext");
                this.f3366e = cVar.a((b<d>) null, lVar.invoke(applicationContext), this.f3364c, new a(applicationContext, this));
            }
            fVar = this.f3366e;
            kotlin.jvm.internal.l.b(fVar);
        }
        return fVar;
    }
}
