package p;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public class e<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashMap<K, V> f11714a;

    /* renamed from: b  reason: collision with root package name */
    private int f11715b;

    /* renamed from: c  reason: collision with root package name */
    private int f11716c;

    /* renamed from: d  reason: collision with root package name */
    private int f11717d;

    /* renamed from: e  reason: collision with root package name */
    private int f11718e;

    /* renamed from: f  reason: collision with root package name */
    private int f11719f;

    /* renamed from: g  reason: collision with root package name */
    private int f11720g;

    /* renamed from: h  reason: collision with root package name */
    private int f11721h;

    public e(int i10) {
        if (i10 > 0) {
            this.f11716c = i10;
            this.f11714a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private int f(K k10, V v9) {
        int g10 = g(k10, v9);
        if (g10 >= 0) {
            return g10;
        }
        throw new IllegalStateException("Negative size: " + k10 + "=" + v9);
    }

    /* access modifiers changed from: protected */
    public V a(K k10) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void b(boolean z9, K k10, V v9, V v10) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        r0 = a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r0 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r4.f11718e++;
        r1 = r4.f11714a.put(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r1 == null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        r4.f11714a.put(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        r4.f11715b += f(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        if (r1 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        b(false, r5, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        i(r4.f11716c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V c(K r5) {
        /*
            r4 = this;
            java.lang.String r0 = "key == null"
            java.util.Objects.requireNonNull(r5, r0)
            monitor-enter(r4)
            java.util.LinkedHashMap<K, V> r0 = r4.f11714a     // Catch:{ all -> 0x0054 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x0016
            int r5 = r4.f11720g     // Catch:{ all -> 0x0054 }
            int r5 = r5 + 1
            r4.f11720g = r5     // Catch:{ all -> 0x0054 }
            monitor-exit(r4)     // Catch:{ all -> 0x0054 }
            return r0
        L_0x0016:
            int r0 = r4.f11721h     // Catch:{ all -> 0x0054 }
            int r0 = r0 + 1
            r4.f11721h = r0     // Catch:{ all -> 0x0054 }
            monitor-exit(r4)     // Catch:{ all -> 0x0054 }
            java.lang.Object r0 = r4.a(r5)
            if (r0 != 0) goto L_0x0025
            r5 = 0
            return r5
        L_0x0025:
            monitor-enter(r4)
            int r1 = r4.f11718e     // Catch:{ all -> 0x0051 }
            int r1 = r1 + 1
            r4.f11718e = r1     // Catch:{ all -> 0x0051 }
            java.util.LinkedHashMap<K, V> r1 = r4.f11714a     // Catch:{ all -> 0x0051 }
            java.lang.Object r1 = r1.put(r5, r0)     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x003a
            java.util.LinkedHashMap<K, V> r2 = r4.f11714a     // Catch:{ all -> 0x0051 }
            r2.put(r5, r1)     // Catch:{ all -> 0x0051 }
            goto L_0x0043
        L_0x003a:
            int r2 = r4.f11715b     // Catch:{ all -> 0x0051 }
            int r3 = r4.f(r5, r0)     // Catch:{ all -> 0x0051 }
            int r2 = r2 + r3
            r4.f11715b = r2     // Catch:{ all -> 0x0051 }
        L_0x0043:
            monitor-exit(r4)     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x004b
            r2 = 0
            r4.b(r2, r5, r0, r1)
            return r1
        L_0x004b:
            int r5 = r4.f11716c
            r4.i(r5)
            return r0
        L_0x0051:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0051 }
            throw r5
        L_0x0054:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0054 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e.c(java.lang.Object):java.lang.Object");
    }

    public final V d(K k10, V v9) {
        V put;
        if (k10 == null || v9 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f11717d++;
            this.f11715b += f(k10, v9);
            put = this.f11714a.put(k10, v9);
            if (put != null) {
                this.f11715b -= f(k10, put);
            }
        }
        if (put != null) {
            b(false, k10, put, v9);
        }
        i(this.f11716c);
        return put;
    }

    public final V e(K k10) {
        V remove;
        Objects.requireNonNull(k10, "key == null");
        synchronized (this) {
            remove = this.f11714a.remove(k10);
            if (remove != null) {
                this.f11715b -= f(k10, remove);
            }
        }
        if (remove != null) {
            b(false, k10, remove, (V) null);
        }
        return remove;
    }

    /* access modifiers changed from: protected */
    public int g(K k10, V v9) {
        return 1;
    }

    public final synchronized Map<K, V> h() {
        return new LinkedHashMap(this.f11714a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i(int r5) {
        /*
            r4 = this;
        L_0x0000:
            monitor-enter(r4)
            int r0 = r4.f11715b     // Catch:{ all -> 0x0071 }
            if (r0 < 0) goto L_0x0052
            java.util.LinkedHashMap<K, V> r0 = r4.f11714a     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x0011
            int r0 = r4.f11715b     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x0052
        L_0x0011:
            int r0 = r4.f11715b     // Catch:{ all -> 0x0071 }
            if (r0 <= r5) goto L_0x0050
            java.util.LinkedHashMap<K, V> r0 = r4.f11714a     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x001e
            goto L_0x0050
        L_0x001e:
            java.util.LinkedHashMap<K, V> r0 = r4.f11714a     // Catch:{ all -> 0x0071 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0071 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0071 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0071 }
            java.util.LinkedHashMap<K, V> r2 = r4.f11714a     // Catch:{ all -> 0x0071 }
            r2.remove(r1)     // Catch:{ all -> 0x0071 }
            int r2 = r4.f11715b     // Catch:{ all -> 0x0071 }
            int r3 = r4.f(r1, r0)     // Catch:{ all -> 0x0071 }
            int r2 = r2 - r3
            r4.f11715b = r2     // Catch:{ all -> 0x0071 }
            int r2 = r4.f11719f     // Catch:{ all -> 0x0071 }
            r3 = 1
            int r2 = r2 + r3
            r4.f11719f = r2     // Catch:{ all -> 0x0071 }
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            r2 = 0
            r4.b(r3, r1, r0, r2)
            goto L_0x0000
        L_0x0050:
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            return
        L_0x0052:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0071 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            r0.<init>()     // Catch:{ all -> 0x0071 }
            java.lang.Class r1 = r4.getClass()     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0071 }
            r0.append(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0071 }
            r5.<init>(r0)     // Catch:{ all -> 0x0071 }
            throw r5     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e.i(int):void");
    }

    public final synchronized String toString() {
        int i10;
        int i11;
        i10 = this.f11720g;
        i11 = this.f11721h + i10;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f11716c), Integer.valueOf(this.f11720g), Integer.valueOf(this.f11721h), Integer.valueOf(i11 != 0 ? (i10 * 100) / i11 : 0)});
    }
}
