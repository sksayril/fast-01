package p0;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import b9.j0;
import b9.k0;
import b9.l0;
import b9.x0;
import g8.n;
import g8.s;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import r3.d;
import r8.p;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f11749a = new b((g) null);

    /* renamed from: p0.a$a  reason: collision with other inner class name */
    private static final class C0195a extends a {
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final q0.b f11750b;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$deleteRegistrationsAsync$1", f = "MeasurementManagerFutures.kt", l = {122}, m = "invokeSuspend")
        /* renamed from: p0.a$a$a  reason: collision with other inner class name */
        static final class C0196a extends k implements p<j0, j8.d<? super s>, Object> {

            /* renamed from: m  reason: collision with root package name */
            int f11751m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ C0195a f11752n;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0196a(C0195a aVar, q0.a aVar2, j8.d<? super C0196a> dVar) {
                super(2, dVar);
                this.f11752n = aVar;
            }

            public final j8.d<s> create(Object obj, j8.d<?> dVar) {
                return new C0196a(this.f11752n, (q0.a) null, dVar);
            }

            public final Object invoke(j0 j0Var, j8.d<? super s> dVar) {
                return ((C0196a) create(j0Var, dVar)).invokeSuspend(s.f8976a);
            }

            public final Object invokeSuspend(Object obj) {
                Object d10 = d.d();
                int i10 = this.f11751m;
                if (i10 == 0) {
                    n.b(obj);
                    q0.b d11 = this.f11752n.f11750b;
                    this.f11751m = 1;
                    if (d11.a((q0.a) null, this) == d10) {
                        return d10;
                    }
                } else if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return s.f8976a;
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1", f = "MeasurementManagerFutures.kt", l = {169}, m = "invokeSuspend")
        /* renamed from: p0.a$a$b */
        static final class b extends k implements p<j0, j8.d<? super Integer>, Object> {

            /* renamed from: m  reason: collision with root package name */
            int f11753m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ C0195a f11754n;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C0195a aVar, j8.d<? super b> dVar) {
                super(2, dVar);
                this.f11754n = aVar;
            }

            public final j8.d<s> create(Object obj, j8.d<?> dVar) {
                return new b(this.f11754n, dVar);
            }

            public final Object invoke(j0 j0Var, j8.d<? super Integer> dVar) {
                return ((b) create(j0Var, dVar)).invokeSuspend(s.f8976a);
            }

            public final Object invokeSuspend(Object obj) {
                Object d10 = d.d();
                int i10 = this.f11753m;
                if (i10 == 0) {
                    n.b(obj);
                    q0.b d11 = this.f11754n.f11750b;
                    this.f11753m = 1;
                    obj = d11.b(this);
                    if (obj == d10) {
                        return d10;
                    }
                } else if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {133}, m = "invokeSuspend")
        /* renamed from: p0.a$a$c */
        static final class c extends k implements p<j0, j8.d<? super s>, Object> {

            /* renamed from: m  reason: collision with root package name */
            int f11755m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ C0195a f11756n;

            /* renamed from: o  reason: collision with root package name */
            final /* synthetic */ Uri f11757o;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ InputEvent f11758p;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(C0195a aVar, Uri uri, InputEvent inputEvent, j8.d<? super c> dVar) {
                super(2, dVar);
                this.f11756n = aVar;
                this.f11757o = uri;
                this.f11758p = inputEvent;
            }

            public final j8.d<s> create(Object obj, j8.d<?> dVar) {
                return new c(this.f11756n, this.f11757o, this.f11758p, dVar);
            }

            public final Object invoke(j0 j0Var, j8.d<? super s> dVar) {
                return ((c) create(j0Var, dVar)).invokeSuspend(s.f8976a);
            }

            public final Object invokeSuspend(Object obj) {
                Object d10 = d.d();
                int i10 = this.f11755m;
                if (i10 == 0) {
                    n.b(obj);
                    q0.b d11 = this.f11756n.f11750b;
                    Uri uri = this.f11757o;
                    InputEvent inputEvent = this.f11758p;
                    this.f11755m = 1;
                    if (d11.c(uri, inputEvent, this) == d10) {
                        return d10;
                    }
                } else if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return s.f8976a;
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {141}, m = "invokeSuspend")
        /* renamed from: p0.a$a$d */
        static final class d extends k implements p<j0, j8.d<? super s>, Object> {

            /* renamed from: m  reason: collision with root package name */
            int f11759m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ C0195a f11760n;

            /* renamed from: o  reason: collision with root package name */
            final /* synthetic */ Uri f11761o;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(C0195a aVar, Uri uri, j8.d<? super d> dVar) {
                super(2, dVar);
                this.f11760n = aVar;
                this.f11761o = uri;
            }

            public final j8.d<s> create(Object obj, j8.d<?> dVar) {
                return new d(this.f11760n, this.f11761o, dVar);
            }

            public final Object invoke(j0 j0Var, j8.d<? super s> dVar) {
                return ((d) create(j0Var, dVar)).invokeSuspend(s.f8976a);
            }

            public final Object invokeSuspend(Object obj) {
                Object d10 = d.d();
                int i10 = this.f11759m;
                if (i10 == 0) {
                    n.b(obj);
                    q0.b d11 = this.f11760n.f11750b;
                    Uri uri = this.f11761o;
                    this.f11759m = 1;
                    if (d11.d(uri, this) == d10) {
                        return d10;
                    }
                } else if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return s.f8976a;
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {151}, m = "invokeSuspend")
        /* renamed from: p0.a$a$e */
        static final class e extends k implements p<j0, j8.d<? super s>, Object> {

            /* renamed from: m  reason: collision with root package name */
            int f11762m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ C0195a f11763n;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            e(C0195a aVar, q0.c cVar, j8.d<? super e> dVar) {
                super(2, dVar);
                this.f11763n = aVar;
            }

            public final j8.d<s> create(Object obj, j8.d<?> dVar) {
                return new e(this.f11763n, (q0.c) null, dVar);
            }

            public final Object invoke(j0 j0Var, j8.d<? super s> dVar) {
                return ((e) create(j0Var, dVar)).invokeSuspend(s.f8976a);
            }

            public final Object invokeSuspend(Object obj) {
                Object d10 = d.d();
                int i10 = this.f11762m;
                if (i10 == 0) {
                    n.b(obj);
                    q0.b d11 = this.f11763n.f11750b;
                    this.f11762m = 1;
                    if (d11.e((q0.c) null, this) == d10) {
                        return d10;
                    }
                } else if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return s.f8976a;
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {161}, m = "invokeSuspend")
        /* renamed from: p0.a$a$f */
        static final class f extends k implements p<j0, j8.d<? super s>, Object> {

            /* renamed from: m  reason: collision with root package name */
            int f11764m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ C0195a f11765n;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            f(C0195a aVar, q0.d dVar, j8.d<? super f> dVar2) {
                super(2, dVar2);
                this.f11765n = aVar;
            }

            public final j8.d<s> create(Object obj, j8.d<?> dVar) {
                return new f(this.f11765n, (q0.d) null, dVar);
            }

            public final Object invoke(j0 j0Var, j8.d<? super s> dVar) {
                return ((f) create(j0Var, dVar)).invokeSuspend(s.f8976a);
            }

            public final Object invokeSuspend(Object obj) {
                Object d10 = d.d();
                int i10 = this.f11764m;
                if (i10 == 0) {
                    n.b(obj);
                    q0.b d11 = this.f11765n.f11750b;
                    this.f11764m = 1;
                    if (d11.f((q0.d) null, this) == d10) {
                        return d10;
                    }
                } else if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return s.f8976a;
            }
        }

        public C0195a(q0.b bVar) {
            l.e(bVar, "mMeasurementManager");
            this.f11750b = bVar;
        }

        public r3.d<Integer> b() {
            return o0.b.c(i.b(k0.a(x0.a()), (j8.g) null, (l0) null, new b(this, (j8.d<? super b>) null), 3, (Object) null), (Object) null, 1, (Object) null);
        }

        public r3.d<s> c(Uri uri) {
            l.e(uri, "trigger");
            return o0.b.c(i.b(k0.a(x0.a()), (j8.g) null, (l0) null, new d(this, uri, (j8.d<? super d>) null), 3, (Object) null), (Object) null, 1, (Object) null);
        }

        public r3.d<s> e(q0.a aVar) {
            l.e(aVar, "deletionRequest");
            return o0.b.c(i.b(k0.a(x0.a()), (j8.g) null, (l0) null, new C0196a(this, aVar, (j8.d<? super C0196a>) null), 3, (Object) null), (Object) null, 1, (Object) null);
        }

        public r3.d<s> f(Uri uri, InputEvent inputEvent) {
            l.e(uri, "attributionSource");
            return o0.b.c(i.b(k0.a(x0.a()), (j8.g) null, (l0) null, new c(this, uri, inputEvent, (j8.d<? super c>) null), 3, (Object) null), (Object) null, 1, (Object) null);
        }

        public r3.d<s> g(q0.c cVar) {
            l.e(cVar, "request");
            return o0.b.c(i.b(k0.a(x0.a()), (j8.g) null, (l0) null, new e(this, cVar, (j8.d<? super e>) null), 3, (Object) null), (Object) null, 1, (Object) null);
        }

        public r3.d<s> h(q0.d dVar) {
            l.e(dVar, "request");
            return o0.b.c(i.b(k0.a(x0.a()), (j8.g) null, (l0) null, new f(this, dVar, (j8.d<? super f>) null), 3, (Object) null), (Object) null, 1, (Object) null);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final a a(Context context) {
            l.e(context, "context");
            q0.b a10 = q0.b.f11956a.a(context);
            if (a10 != null) {
                return new C0195a(a10);
            }
            return null;
        }
    }

    public static final a a(Context context) {
        return f11749a.a(context);
    }

    public abstract d<Integer> b();

    public abstract d<s> c(Uri uri);
}
