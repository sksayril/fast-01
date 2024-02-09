package d5;

import android.util.Log;
import d5.b;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import k9.a;
import k9.c;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8184a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<b.a, C0124a> f8185b = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: d5.a$a  reason: collision with other inner class name */
    private static final class C0124a {

        /* renamed from: a  reason: collision with root package name */
        private final k9.a f8186a;

        /* renamed from: b  reason: collision with root package name */
        private b f8187b;

        public C0124a(k9.a aVar, b bVar) {
            l.e(aVar, "mutex");
            this.f8186a = aVar;
            this.f8187b = bVar;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C0124a(k9.a aVar, b bVar, int i10, g gVar) {
            this(aVar, (i10 & 2) != 0 ? null : bVar);
        }

        public final k9.a a() {
            return this.f8186a;
        }

        public final b b() {
            return this.f8187b;
        }

        public final void c(b bVar) {
            this.f8187b = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0124a)) {
                return false;
            }
            C0124a aVar = (C0124a) obj;
            return l.a(this.f8186a, aVar.f8186a) && l.a(this.f8187b, aVar.f8187b);
        }

        public int hashCode() {
            int hashCode = this.f8186a.hashCode() * 31;
            b bVar = this.f8187b;
            return hashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            return "Dependency(mutex=" + this.f8186a + ", subscriber=" + this.f8187b + ')';
        }
    }

    @f(c = "com.google.firebase.sessions.api.FirebaseSessionsDependencies", f = "FirebaseSessionsDependencies.kt", l = {123}, m = "getRegisteredSubscribers$com_google_firebase_firebase_sessions")
    static final class b extends d {

        /* renamed from: m  reason: collision with root package name */
        Object f8188m;

        /* renamed from: n  reason: collision with root package name */
        Object f8189n;

        /* renamed from: o  reason: collision with root package name */
        Object f8190o;

        /* renamed from: p  reason: collision with root package name */
        Object f8191p;

        /* renamed from: q  reason: collision with root package name */
        Object f8192q;

        /* renamed from: r  reason: collision with root package name */
        Object f8193r;

        /* renamed from: s  reason: collision with root package name */
        /* synthetic */ Object f8194s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ a f8195t;

        /* renamed from: u  reason: collision with root package name */
        int f8196u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, j8.d<? super b> dVar) {
            super(dVar);
            this.f8195t = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f8194s = obj;
            this.f8196u |= Integer.MIN_VALUE;
            return this.f8195t.c(this);
        }
    }

    private a() {
    }

    private final C0124a b(b.a aVar) {
        Map<b.a, C0124a> map = f8185b;
        l.d(map, "dependencies");
        C0124a aVar2 = map.get(aVar);
        if (aVar2 != null) {
            l.d(aVar2, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
            return aVar2;
        }
        throw new IllegalStateException("Cannot get dependency " + aVar + ". Dependencies should be added at class load time.");
    }

    public static final void e(b bVar) {
        l.e(bVar, "subscriber");
        b.a a10 = bVar.a();
        C0124a b10 = f8184a.b(a10);
        if (b10.b() != null) {
            Log.d("SessionsDependencies", "Subscriber " + a10 + " already registered.");
            return;
        }
        b10.c(bVar);
        Log.d("SessionsDependencies", "Subscriber " + a10 + " registered.");
        a.C0173a.a(b10.a(), (Object) null, 1, (Object) null);
    }

    public final void a(b.a aVar) {
        StringBuilder sb;
        String str;
        l.e(aVar, "subscriberName");
        if (aVar != b.a.PERFORMANCE) {
            Map<b.a, C0124a> map = f8185b;
            if (map.containsKey(aVar)) {
                sb = new StringBuilder();
                sb.append("Dependency ");
                sb.append(aVar);
                str = " already added.";
            } else {
                l.d(map, "dependencies");
                map.put(aVar, new C0124a(c.a(true), (b) null, 2, (g) null));
                sb = new StringBuilder();
                sb.append("Dependency to ");
                sb.append(aVar);
                str = " added.";
            }
            sb.append(str);
            Log.d("SessionsDependencies", sb.toString());
            return;
        }
        throw new IllegalArgumentException("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: d5.b$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(j8.d<? super java.util.Map<d5.b.a, ? extends d5.b>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof d5.a.b
            if (r0 == 0) goto L_0x0013
            r0 = r11
            d5.a$b r0 = (d5.a.b) r0
            int r1 = r0.f8196u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8196u = r1
            goto L_0x0018
        L_0x0013:
            d5.a$b r0 = new d5.a$b
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f8194s
            java.lang.Object r1 = k8.d.d()
            int r2 = r0.f8196u
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0048
            if (r2 != r4) goto L_0x0040
            java.lang.Object r2 = r0.f8193r
            java.lang.Object r5 = r0.f8192q
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.f8191p
            k9.a r6 = (k9.a) r6
            java.lang.Object r7 = r0.f8190o
            d5.b$a r7 = (d5.b.a) r7
            java.lang.Object r8 = r0.f8189n
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.f8188m
            java.util.Map r9 = (java.util.Map) r9
            g8.n.b(r11)
            goto L_0x00a0
        L_0x0040:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0048:
            g8.n.b(r11)
            java.util.Map<d5.b$a, d5.a$a> r11 = f8185b
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.l.d(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = h8.e0.a(r5)
            r2.<init>(r5)
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
            r5 = r2
        L_0x0069:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x00b3
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r6 = r11.getKey()
            r7 = r6
            d5.b$a r7 = (d5.b.a) r7
            java.lang.Object r11 = r11.getValue()
            d5.a$a r11 = (d5.a.C0124a) r11
            k9.a r6 = r11.a()
            r0.f8188m = r5
            r0.f8189n = r8
            r0.f8190o = r7
            r0.f8191p = r6
            r0.f8192q = r5
            r0.f8193r = r2
            r0.f8196u = r4
            java.lang.Object r11 = r6.b(r3, r0)
            if (r11 != r1) goto L_0x009f
            return r1
        L_0x009f:
            r9 = r5
        L_0x00a0:
            d5.a r11 = f8184a     // Catch:{ all -> 0x00ae }
            d5.b r11 = r11.d(r7)     // Catch:{ all -> 0x00ae }
            r6.a(r3)
            r5.put(r2, r11)
            r5 = r9
            goto L_0x0069
        L_0x00ae:
            r11 = move-exception
            r6.a(r3)
            throw r11
        L_0x00b3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.a.c(j8.d):java.lang.Object");
    }

    public final b d(b.a aVar) {
        l.e(aVar, "subscriberName");
        b b10 = b(aVar).b();
        if (b10 != null) {
            return b10;
        }
        throw new IllegalStateException("Subscriber " + aVar + " has not been registered.");
    }
}
