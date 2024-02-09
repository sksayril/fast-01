package w3;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import q4.a;
import q4.b;
import q4.c;
import q4.d;

class v implements d, c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, ConcurrentHashMap<b<Object>, Executor>> f12940a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Queue<a<?>> f12941b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    private final Executor f12942c;

    v(Executor executor) {
        this.f12942c = executor;
    }

    private synchronized Set<Map.Entry<b<Object>, Executor>> e(a<?> aVar) {
        Map map;
        map = this.f12940a.get(aVar.b());
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    public synchronized <T> void a(Class<T> cls, Executor executor, b<? super T> bVar) {
        e0.b(cls);
        e0.b(bVar);
        e0.b(executor);
        if (!this.f12940a.containsKey(cls)) {
            this.f12940a.put(cls, new ConcurrentHashMap());
        }
        this.f12940a.get(cls).put(bVar, executor);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r0.hasNext() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r1 = r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(new w3.u(r1, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000e, code lost:
        r0 = e(r5).iterator();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(q4.a<?> r5) {
        /*
            r4 = this;
            w3.e0.b(r5)
            monitor-enter(r4)
            java.util.Queue<q4.a<?>> r0 = r4.f12941b     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x000d
            r0.add(r5)     // Catch:{ all -> 0x0032 }
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            return
        L_0x000d:
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            java.util.Set r0 = r4.e(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0031
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            w3.u r3 = new w3.u
            r3.<init>(r1, r5)
            r2.execute(r3)
            goto L_0x0016
        L_0x0031:
            return
        L_0x0032:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.v.b(q4.a):void");
    }

    /* access modifiers changed from: package-private */
    public void d() {
        Queue<a<?>> queue;
        synchronized (this) {
            queue = this.f12941b;
            if (queue != null) {
                this.f12941b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (a b10 : queue) {
                b(b10);
            }
        }
    }
}
