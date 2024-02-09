package c0;

import g8.n;
import g8.s;
import j8.d;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.l;
import r8.p;
import z.f;

public final class b implements f<d> {

    /* renamed from: a  reason: collision with root package name */
    private final f<d> f3540a;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", l = {85}, m = "invokeSuspend")
    static final class a extends k implements p<d, d<? super d>, Object> {

        /* renamed from: m  reason: collision with root package name */
        int f3541m;

        /* renamed from: n  reason: collision with root package name */
        /* synthetic */ Object f3542n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ p<d, d<? super d>, Object> f3543o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p<? super d, ? super d<? super d>, ? extends Object> pVar, d<? super a> dVar) {
            super(2, dVar);
            this.f3543o = pVar;
        }

        /* renamed from: b */
        public final Object invoke(d dVar, d<? super d> dVar2) {
            return ((a) create(dVar, dVar2)).invokeSuspend(s.f8976a);
        }

        public final d<s> create(Object obj, d<?> dVar) {
            a aVar = new a(this.f3543o, dVar);
            aVar.f3542n = obj;
            return aVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object d10 = d.d();
            int i10 = this.f3541m;
            if (i10 == 0) {
                n.b(obj);
                p<d, d<? super d>, Object> pVar = this.f3543o;
                this.f3541m = 1;
                obj = pVar.invoke((d) this.f3542n, this);
                if (obj == d10) {
                    return d10;
                }
            } else if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d dVar = (d) obj;
            ((a) dVar).f();
            return dVar;
        }
    }

    public b(f<d> fVar) {
        l.e(fVar, "delegate");
        this.f3540a = fVar;
    }

    public Object a(p<? super d, ? super d<? super d>, ? extends Object> pVar, d<? super d> dVar) {
        return this.f3540a.a(new a(pVar, (d<? super a>) null), dVar);
    }

    public e9.b<d> b() {
        return this.f3540a.b();
    }
}
