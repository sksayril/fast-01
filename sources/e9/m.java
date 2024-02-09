package e9;

import f9.b;
import f9.h;
import g8.s;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

final class m<T> extends b<o> implements k<T>, b {

    /* renamed from: q  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f8567q = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: p  reason: collision with root package name */
    private int f8568p;

    @f(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {384, 396, 401}, m = "collect")
    static final class a extends d {

        /* renamed from: m  reason: collision with root package name */
        Object f8569m;

        /* renamed from: n  reason: collision with root package name */
        Object f8570n;

        /* renamed from: o  reason: collision with root package name */
        Object f8571o;

        /* renamed from: p  reason: collision with root package name */
        Object f8572p;

        /* renamed from: q  reason: collision with root package name */
        Object f8573q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f8574r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ m<T> f8575s;

        /* renamed from: t  reason: collision with root package name */
        int f8576t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(m<T> mVar, j8.d<? super a> dVar) {
            super(dVar);
            this.f8575s = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f8574r = obj;
            this.f8576t |= Integer.MIN_VALUE;
            return this.f8575s.a((c) null, this);
        }
    }

    public m(Object obj) {
        this._state = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        r8 = (e9.o[]) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        if (r8 == null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0032, code lost:
        r0 = r8.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0034, code lost:
        if (r3 >= r0) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0036, code lost:
        r4 = r8[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
        if (r4 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003a, code lost:
        r4.g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003d, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0040, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r8 = r6.f8568p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0043, code lost:
        if (r8 != r7) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0045, code lost:
        r6.f8568p = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0048, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0049, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r7 = f();
        r0 = g8.s.f8976a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0050, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0051, code lost:
        r5 = r8;
        r8 = r7;
        r7 = r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean i(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f8567q     // Catch:{ all -> 0x005e }
            java.lang.Object r1 = r0.get(r6)     // Catch:{ all -> 0x005e }
            r2 = 0
            if (r7 == 0) goto L_0x0012
            boolean r7 = kotlin.jvm.internal.l.a(r1, r7)     // Catch:{ all -> 0x005e }
            if (r7 != 0) goto L_0x0012
            monitor-exit(r6)
            return r2
        L_0x0012:
            boolean r7 = kotlin.jvm.internal.l.a(r1, r8)     // Catch:{ all -> 0x005e }
            r1 = 1
            if (r7 == 0) goto L_0x001b
            monitor-exit(r6)
            return r1
        L_0x001b:
            r0.set(r6, r8)     // Catch:{ all -> 0x005e }
            int r7 = r6.f8568p     // Catch:{ all -> 0x005e }
            r8 = r7 & 1
            if (r8 != 0) goto L_0x0058
            int r7 = r7 + r1
            r6.f8568p = r7     // Catch:{ all -> 0x005e }
            f9.d[] r8 = r6.f()     // Catch:{ all -> 0x005e }
            g8.s r0 = g8.s.f8976a     // Catch:{ all -> 0x005e }
            monitor-exit(r6)
        L_0x002e:
            e9.o[] r8 = (e9.o[]) r8
            if (r8 == 0) goto L_0x0040
            int r0 = r8.length
            r3 = 0
        L_0x0034:
            if (r3 >= r0) goto L_0x0040
            r4 = r8[r3]
            if (r4 == 0) goto L_0x003d
            r4.g()
        L_0x003d:
            int r3 = r3 + 1
            goto L_0x0034
        L_0x0040:
            monitor-enter(r6)
            int r8 = r6.f8568p     // Catch:{ all -> 0x0055 }
            if (r8 != r7) goto L_0x004a
            int r7 = r7 + r1
            r6.f8568p = r7     // Catch:{ all -> 0x0055 }
            monitor-exit(r6)
            return r1
        L_0x004a:
            f9.d[] r7 = r6.f()     // Catch:{ all -> 0x0055 }
            g8.s r0 = g8.s.f8976a     // Catch:{ all -> 0x0055 }
            monitor-exit(r6)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x002e
        L_0x0055:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x0058:
            int r7 = r7 + 2
            r6.f8568p = r7     // Catch:{ all -> 0x005e }
            monitor-exit(r6)
            return r1
        L_0x005e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.m.i(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: e9.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: e9.m} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ae A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bd A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bf A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d2 A[Catch:{ all -> 0x0073 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d3 A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00da A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(e9.c<? super T> r11, j8.d<?> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof e9.m.a
            if (r0 == 0) goto L_0x0013
            r0 = r12
            e9.m$a r0 = (e9.m.a) r0
            int r1 = r0.f8576t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8576t = r1
            goto L_0x0018
        L_0x0013:
            e9.m$a r0 = new e9.m$a
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f8574r
            java.lang.Object r1 = k8.d.d()
            int r2 = r0.f8576t
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0076
            if (r2 == r6) goto L_0x0061
            if (r2 == r5) goto L_0x004a
            if (r2 != r4) goto L_0x0042
            java.lang.Object r11 = r0.f8573q
            java.lang.Object r2 = r0.f8572p
            b9.r1 r2 = (b9.r1) r2
            java.lang.Object r6 = r0.f8571o
            e9.o r6 = (e9.o) r6
            java.lang.Object r7 = r0.f8570n
            e9.c r7 = (e9.c) r7
            java.lang.Object r8 = r0.f8569m
            e9.m r8 = (e9.m) r8
            g8.n.b(r12)     // Catch:{ all -> 0x0073 }
            goto L_0x00a6
        L_0x0042:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x004a:
            java.lang.Object r11 = r0.f8573q
            java.lang.Object r2 = r0.f8572p
            b9.r1 r2 = (b9.r1) r2
            java.lang.Object r6 = r0.f8571o
            e9.o r6 = (e9.o) r6
            java.lang.Object r7 = r0.f8570n
            e9.c r7 = (e9.c) r7
            java.lang.Object r8 = r0.f8569m
            e9.m r8 = (e9.m) r8
            g8.n.b(r12)     // Catch:{ all -> 0x0073 }
            goto L_0x00d4
        L_0x0061:
            java.lang.Object r11 = r0.f8571o
            r6 = r11
            e9.o r6 = (e9.o) r6
            java.lang.Object r11 = r0.f8570n
            e9.c r11 = (e9.c) r11
            java.lang.Object r2 = r0.f8569m
            r8 = r2
            e9.m r8 = (e9.m) r8
            g8.n.b(r12)     // Catch:{ all -> 0x0073 }
            goto L_0x0097
        L_0x0073:
            r11 = move-exception
            goto L_0x00f0
        L_0x0076:
            g8.n.b(r12)
            f9.d r12 = r10.b()
            e9.o r12 = (e9.o) r12
            boolean r2 = r11 instanceof e9.p     // Catch:{ all -> 0x00ed }
            if (r2 == 0) goto L_0x0095
            r2 = r11
            e9.p r2 = (e9.p) r2     // Catch:{ all -> 0x00ed }
            r0.f8569m = r10     // Catch:{ all -> 0x00ed }
            r0.f8570n = r11     // Catch:{ all -> 0x00ed }
            r0.f8571o = r12     // Catch:{ all -> 0x00ed }
            r0.f8576t = r6     // Catch:{ all -> 0x00ed }
            java.lang.Object r2 = r2.a(r0)     // Catch:{ all -> 0x00ed }
            if (r2 != r1) goto L_0x0095
            return r1
        L_0x0095:
            r8 = r10
            r6 = r12
        L_0x0097:
            j8.g r12 = r0.getContext()     // Catch:{ all -> 0x0073 }
            b9.r1$b r2 = b9.r1.f3485c     // Catch:{ all -> 0x0073 }
            j8.g$b r12 = r12.a(r2)     // Catch:{ all -> 0x0073 }
            b9.r1 r12 = (b9.r1) r12     // Catch:{ all -> 0x0073 }
            r7 = r11
            r2 = r12
            r11 = r3
        L_0x00a6:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = f8567q     // Catch:{ all -> 0x0073 }
            java.lang.Object r12 = r12.get(r8)     // Catch:{ all -> 0x0073 }
            if (r2 == 0) goto L_0x00b1
            b9.v1.e(r2)     // Catch:{ all -> 0x0073 }
        L_0x00b1:
            if (r11 == 0) goto L_0x00b9
            boolean r9 = kotlin.jvm.internal.l.a(r11, r12)     // Catch:{ all -> 0x0073 }
            if (r9 != 0) goto L_0x00d4
        L_0x00b9:
            g9.h0 r11 = f9.h.f8816a     // Catch:{ all -> 0x0073 }
            if (r12 != r11) goto L_0x00bf
            r11 = r3
            goto L_0x00c0
        L_0x00bf:
            r11 = r12
        L_0x00c0:
            r0.f8569m = r8     // Catch:{ all -> 0x0073 }
            r0.f8570n = r7     // Catch:{ all -> 0x0073 }
            r0.f8571o = r6     // Catch:{ all -> 0x0073 }
            r0.f8572p = r2     // Catch:{ all -> 0x0073 }
            r0.f8573q = r12     // Catch:{ all -> 0x0073 }
            r0.f8576t = r5     // Catch:{ all -> 0x0073 }
            java.lang.Object r11 = r7.emit(r11, r0)     // Catch:{ all -> 0x0073 }
            if (r11 != r1) goto L_0x00d3
            return r1
        L_0x00d3:
            r11 = r12
        L_0x00d4:
            boolean r12 = r6.h()     // Catch:{ all -> 0x0073 }
            if (r12 != 0) goto L_0x00a6
            r0.f8569m = r8     // Catch:{ all -> 0x0073 }
            r0.f8570n = r7     // Catch:{ all -> 0x0073 }
            r0.f8571o = r6     // Catch:{ all -> 0x0073 }
            r0.f8572p = r2     // Catch:{ all -> 0x0073 }
            r0.f8573q = r11     // Catch:{ all -> 0x0073 }
            r0.f8576t = r4     // Catch:{ all -> 0x0073 }
            java.lang.Object r12 = r6.e(r0)     // Catch:{ all -> 0x0073 }
            if (r12 != r1) goto L_0x00a6
            return r1
        L_0x00ed:
            r11 = move-exception
            r8 = r10
            r6 = r12
        L_0x00f0:
            r8.e(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.m.a(e9.c, j8.d):java.lang.Object");
    }

    public Object emit(T t9, j8.d<? super s> dVar) {
        setValue(t9);
        return s.f8976a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public o c() {
        return new o();
    }

    public T getValue() {
        T t9 = h.f8816a;
        T t10 = f8567q.get(this);
        if (t10 == t9) {
            return null;
        }
        return t10;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public o[] d(int i10) {
        return new o[i10];
    }

    public void setValue(T t9) {
        if (t9 == null) {
            t9 = h.f8816a;
        }
        i((Object) null, t9);
    }
}
