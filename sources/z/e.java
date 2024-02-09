package z;

import g8.n;
import g8.s;
import j8.d;
import java.util.List;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.g;
import r8.l;
import r8.p;

public final class e<T> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f13331a = new a((g) null);

    public static final class a {

        @f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", l = {33}, m = "invokeSuspend")
        /* renamed from: z.e$a$a  reason: collision with other inner class name */
        static final class C0232a extends k implements p<i<T>, d<? super s>, Object> {

            /* renamed from: m  reason: collision with root package name */
            int f13332m;

            /* renamed from: n  reason: collision with root package name */
            /* synthetic */ Object f13333n;

            /* renamed from: o  reason: collision with root package name */
            final /* synthetic */ List<d<T>> f13334o;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0232a(List<? extends d<T>> list, d<? super C0232a> dVar) {
                super(2, dVar);
                this.f13334o = list;
            }

            /* renamed from: b */
            public final Object invoke(i<T> iVar, d<? super s> dVar) {
                return ((C0232a) create(iVar, dVar)).invokeSuspend(s.f8976a);
            }

            public final d<s> create(Object obj, d<?> dVar) {
                C0232a aVar = new C0232a(this.f13334o, dVar);
                aVar.f13333n = obj;
                return aVar;
            }

            public final Object invokeSuspend(Object obj) {
                Object d10 = d.d();
                int i10 = this.f13332m;
                if (i10 == 0) {
                    n.b(obj);
                    a aVar = e.f13331a;
                    List<d<T>> list = this.f13334o;
                    this.f13332m = 1;
                    if (aVar.c(list, (i) this.f13333n, this) == d10) {
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

        @f(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", l = {42, 57}, m = "runMigrations")
        static final class b<T> extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: m  reason: collision with root package name */
            Object f13335m;

            /* renamed from: n  reason: collision with root package name */
            Object f13336n;

            /* renamed from: o  reason: collision with root package name */
            /* synthetic */ Object f13337o;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ a f13338p;

            /* renamed from: q  reason: collision with root package name */
            int f13339q;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(a aVar, d<? super b> dVar) {
                super(dVar);
                this.f13338p = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f13337o = obj;
                this.f13339q |= Integer.MIN_VALUE;
                return this.f13338p.c((List) null, (i) null, this);
            }
        }

        @f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {44, 46}, m = "invokeSuspend")
        static final class c extends k implements p<T, d<? super T>, Object> {

            /* renamed from: m  reason: collision with root package name */
            Object f13340m;

            /* renamed from: n  reason: collision with root package name */
            Object f13341n;

            /* renamed from: o  reason: collision with root package name */
            Object f13342o;

            /* renamed from: p  reason: collision with root package name */
            int f13343p;

            /* renamed from: q  reason: collision with root package name */
            /* synthetic */ Object f13344q;

            /* renamed from: r  reason: collision with root package name */
            final /* synthetic */ List<d<T>> f13345r;

            /* renamed from: s  reason: collision with root package name */
            final /* synthetic */ List<l<d<? super s>, Object>> f13346s;

            @f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {45}, m = "invokeSuspend")
            /* renamed from: z.e$a$c$a  reason: collision with other inner class name */
            static final class C0233a extends k implements l<d<? super s>, Object> {

                /* renamed from: m  reason: collision with root package name */
                int f13347m;

                /* renamed from: n  reason: collision with root package name */
                final /* synthetic */ d<T> f13348n;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0233a(d<T> dVar, d<? super C0233a> dVar2) {
                    super(1, dVar2);
                    this.f13348n = dVar;
                }

                /* renamed from: b */
                public final Object invoke(d<? super s> dVar) {
                    return ((C0233a) create(dVar)).invokeSuspend(s.f8976a);
                }

                public final d<s> create(d<?> dVar) {
                    return new C0233a(this.f13348n, dVar);
                }

                public final Object invokeSuspend(Object obj) {
                    Object d10 = d.d();
                    int i10 = this.f13347m;
                    if (i10 == 0) {
                        n.b(obj);
                        d<T> dVar = this.f13348n;
                        this.f13347m = 1;
                        if (dVar.b(this) == d10) {
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

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(List<? extends d<T>> list, List<l<d<? super s>, Object>> list2, d<? super c> dVar) {
                super(2, dVar);
                this.f13345r = list;
                this.f13346s = list2;
            }

            /* renamed from: b */
            public final Object invoke(T t9, d<? super T> dVar) {
                return ((c) create(t9, dVar)).invokeSuspend(s.f8976a);
            }

            public final d<s> create(Object obj, d<?> dVar) {
                c cVar = new c(this.f13345r, this.f13346s, dVar);
                cVar.f13344q = obj;
                return cVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:11:0x004e  */
            /* JADX WARNING: Removed duplicated region for block: B:17:0x0072  */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x008e  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = k8.d.d()
                    int r1 = r10.f13343p
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L_0x003a
                    if (r1 == r3) goto L_0x0024
                    if (r1 != r2) goto L_0x001c
                    java.lang.Object r1 = r10.f13340m
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r10.f13344q
                    java.util.List r4 = (java.util.List) r4
                    g8.n.b(r11)
                    r7 = r10
                    goto L_0x008c
                L_0x001c:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L_0x0024:
                    java.lang.Object r1 = r10.f13342o
                    java.lang.Object r4 = r10.f13341n
                    z.d r4 = (z.d) r4
                    java.lang.Object r5 = r10.f13340m
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r10.f13344q
                    java.util.List r6 = (java.util.List) r6
                    g8.n.b(r11)
                    r7 = r10
                    r9 = r6
                    r6 = r4
                    r4 = r9
                    goto L_0x006a
                L_0x003a:
                    g8.n.b(r11)
                    java.lang.Object r11 = r10.f13344q
                    java.util.List<z.d<T>> r1 = r10.f13345r
                    java.util.List<r8.l<j8.d<? super g8.s>, java.lang.Object>> r4 = r10.f13346s
                    java.util.Iterator r1 = r1.iterator()
                    r5 = r10
                L_0x0048:
                    boolean r6 = r1.hasNext()
                    if (r6 == 0) goto L_0x0091
                    java.lang.Object r6 = r1.next()
                    z.d r6 = (z.d) r6
                    r5.f13344q = r4
                    r5.f13340m = r1
                    r5.f13341n = r6
                    r5.f13342o = r11
                    r5.f13343p = r3
                    java.lang.Object r7 = r6.a(r11, r5)
                    if (r7 != r0) goto L_0x0065
                    return r0
                L_0x0065:
                    r9 = r1
                    r1 = r11
                    r11 = r7
                    r7 = r5
                    r5 = r9
                L_0x006a:
                    java.lang.Boolean r11 = (java.lang.Boolean) r11
                    boolean r11 = r11.booleanValue()
                    if (r11 == 0) goto L_0x008e
                    z.e$a$c$a r11 = new z.e$a$c$a
                    r8 = 0
                    r11.<init>(r6, r8)
                    r4.add(r11)
                    r7.f13344q = r4
                    r7.f13340m = r5
                    r7.f13341n = r8
                    r7.f13342o = r8
                    r7.f13343p = r2
                    java.lang.Object r11 = r6.c(r1, r7)
                    if (r11 != r0) goto L_0x008f
                    return r0
                L_0x008c:
                    r5 = r7
                    goto L_0x0048
                L_0x008e:
                    r11 = r1
                L_0x008f:
                    r1 = r5
                    goto L_0x008c
                L_0x0091:
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: z.e.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final <T> java.lang.Object c(java.util.List<? extends z.d<T>> r7, z.i<T> r8, j8.d<? super g8.s> r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof z.e.a.b
                if (r0 == 0) goto L_0x0013
                r0 = r9
                z.e$a$b r0 = (z.e.a.b) r0
                int r1 = r0.f13339q
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f13339q = r1
                goto L_0x0018
            L_0x0013:
                z.e$a$b r0 = new z.e$a$b
                r0.<init>(r6, r9)
            L_0x0018:
                java.lang.Object r9 = r0.f13337o
                java.lang.Object r1 = k8.d.d()
                int r2 = r0.f13339q
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0046
                if (r2 == r4) goto L_0x003e
                if (r2 != r3) goto L_0x0036
                java.lang.Object r7 = r0.f13336n
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.f13335m
                kotlin.jvm.internal.u r8 = (kotlin.jvm.internal.u) r8
                g8.n.b(r9)     // Catch:{ all -> 0x0034 }
                goto L_0x0069
            L_0x0034:
                r9 = move-exception
                goto L_0x0082
            L_0x0036:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x003e:
                java.lang.Object r7 = r0.f13335m
                java.util.List r7 = (java.util.List) r7
                g8.n.b(r9)
                goto L_0x0060
            L_0x0046:
                g8.n.b(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                z.e$a$c r2 = new z.e$a$c
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.f13335m = r9
                r0.f13339q = r4
                java.lang.Object r7 = r8.a(r2, r0)
                if (r7 != r1) goto L_0x005f
                return r1
            L_0x005f:
                r7 = r9
            L_0x0060:
                kotlin.jvm.internal.u r8 = new kotlin.jvm.internal.u
                r8.<init>()
                java.util.Iterator r7 = r7.iterator()
            L_0x0069:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L_0x0094
                java.lang.Object r9 = r7.next()
                r8.l r9 = (r8.l) r9
                r0.f13335m = r8     // Catch:{ all -> 0x0034 }
                r0.f13336n = r7     // Catch:{ all -> 0x0034 }
                r0.f13339q = r3     // Catch:{ all -> 0x0034 }
                java.lang.Object r9 = r9.invoke(r0)     // Catch:{ all -> 0x0034 }
                if (r9 != r1) goto L_0x0069
                return r1
            L_0x0082:
                T r2 = r8.f11078m
                if (r2 != 0) goto L_0x0089
                r8.f11078m = r9
                goto L_0x0069
            L_0x0089:
                kotlin.jvm.internal.l.b(r2)
                T r2 = r8.f11078m
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                g8.b.a(r2, r9)
                goto L_0x0069
            L_0x0094:
                T r7 = r8.f11078m
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L_0x009d
                g8.s r7 = g8.s.f8976a
                return r7
            L_0x009d:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: z.e.a.c(java.util.List, z.i, j8.d):java.lang.Object");
        }

        public final <T> p<i<T>, d<? super s>, Object> b(List<? extends d<T>> list) {
            kotlin.jvm.internal.l.e(list, "migrations");
            return new C0232a(list, (d<? super C0232a>) null);
        }
    }
}
