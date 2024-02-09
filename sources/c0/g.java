package c0;

import g8.n;
import g8.s;
import j8.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import r8.p;

public final class g {

    @f(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {329}, m = "invokeSuspend")
    static final class a extends k implements p<d, d<? super d>, Object> {

        /* renamed from: m  reason: collision with root package name */
        int f3549m;

        /* renamed from: n  reason: collision with root package name */
        /* synthetic */ Object f3550n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ p<a, d<? super s>, Object> f3551o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p<? super a, ? super d<? super s>, ? extends Object> pVar, d<? super a> dVar) {
            super(2, dVar);
            this.f3551o = pVar;
        }

        /* renamed from: b */
        public final Object invoke(d dVar, d<? super d> dVar2) {
            return ((a) create(dVar, dVar2)).invokeSuspend(s.f8976a);
        }

        public final d<s> create(Object obj, d<?> dVar) {
            a aVar = new a(this.f3551o, dVar);
            aVar.f3550n = obj;
            return aVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object d10 = d.d();
            int i10 = this.f3549m;
            if (i10 == 0) {
                n.b(obj);
                a c10 = ((d) this.f3550n).c();
                p<a, d<? super s>, Object> pVar = this.f3551o;
                this.f3550n = c10;
                this.f3549m = 1;
                return pVar.invoke(c10, this) == d10 ? d10 : c10;
            } else if (i10 == 1) {
                a aVar = (a) this.f3550n;
                n.b(obj);
                return aVar;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public static final Object a(z.f<d> fVar, p<? super a, ? super d<? super s>, ? extends Object> pVar, d<? super d> dVar) {
        return fVar.a(new a(pVar, (d<? super a>) null), dVar);
    }
}
