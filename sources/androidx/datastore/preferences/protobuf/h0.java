package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a0;
import java.util.Collections;
import java.util.List;

abstract class h0 {

    /* renamed from: a  reason: collision with root package name */
    private static final h0 f1938a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final h0 f1939b = new c();

    private static final class b extends h0 {

        /* renamed from: c  reason: collision with root package name */
        private static final Class<?> f1940c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static <E> List<E> f(Object obj, long j10) {
            return (List) r1.A(obj, j10);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.datastore.preferences.protobuf.f0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: androidx.datastore.preferences.protobuf.f0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: androidx.datastore.preferences.protobuf.f0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static <L> java.util.List<L> g(java.lang.Object r3, long r4, int r6) {
            /*
                java.util.List r0 = f(r3, r4)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002d
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.g0
                if (r1 == 0) goto L_0x0014
                androidx.datastore.preferences.protobuf.f0 r0 = new androidx.datastore.preferences.protobuf.f0
                r0.<init>((int) r6)
                goto L_0x0029
            L_0x0014:
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.a1
                if (r1 == 0) goto L_0x0024
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.a0.i
                if (r1 == 0) goto L_0x0024
                androidx.datastore.preferences.protobuf.a0$i r0 = (androidx.datastore.preferences.protobuf.a0.i) r0
                androidx.datastore.preferences.protobuf.a0$i r6 = r0.q(r6)
                r0 = r6
                goto L_0x0029
            L_0x0024:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r6)
            L_0x0029:
                androidx.datastore.preferences.protobuf.r1.O(r3, r4, r0)
                goto L_0x007a
            L_0x002d:
                java.lang.Class<?> r1 = f1940c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x004b
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                r1.addAll(r0)
            L_0x0046:
                androidx.datastore.preferences.protobuf.r1.O(r3, r4, r1)
                r0 = r1
                goto L_0x007a
            L_0x004b:
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.q1
                if (r1 == 0) goto L_0x005f
                androidx.datastore.preferences.protobuf.f0 r1 = new androidx.datastore.preferences.protobuf.f0
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>((int) r2)
                androidx.datastore.preferences.protobuf.q1 r0 = (androidx.datastore.preferences.protobuf.q1) r0
                r1.addAll(r0)
                goto L_0x0046
            L_0x005f:
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.a1
                if (r1 == 0) goto L_0x007a
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.a0.i
                if (r1 == 0) goto L_0x007a
                r1 = r0
                androidx.datastore.preferences.protobuf.a0$i r1 = (androidx.datastore.preferences.protobuf.a0.i) r1
                boolean r2 = r1.x()
                if (r2 != 0) goto L_0x007a
                int r0 = r0.size()
                int r0 = r0 + r6
                androidx.datastore.preferences.protobuf.a0$i r0 = r1.q(r0)
                goto L_0x0029
            L_0x007a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h0.b.g(java.lang.Object, long, int):java.util.List");
        }

        /* access modifiers changed from: package-private */
        public void c(Object obj, long j10) {
            Object obj2;
            List list = (List) r1.A(obj, j10);
            if (list instanceof g0) {
                obj2 = ((g0) list).r();
            } else if (!f1940c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof a1) || !(list instanceof a0.i)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    a0.i iVar = (a0.i) list;
                    if (iVar.x()) {
                        iVar.m();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            r1.O(obj, j10, obj2);
        }

        /* access modifiers changed from: package-private */
        public <E> void d(Object obj, Object obj2, long j10) {
            List f10 = f(obj2, j10);
            List g10 = g(obj, j10, f10.size());
            int size = g10.size();
            int size2 = f10.size();
            if (size > 0 && size2 > 0) {
                g10.addAll(f10);
            }
            if (size > 0) {
                f10 = g10;
            }
            r1.O(obj, j10, f10);
        }

        /* access modifiers changed from: package-private */
        public <L> List<L> e(Object obj, long j10) {
            return g(obj, j10, 10);
        }
    }

    private static final class c extends h0 {
        private c() {
            super();
        }

        static <E> a0.i<E> f(Object obj, long j10) {
            return (a0.i) r1.A(obj, j10);
        }

        /* access modifiers changed from: package-private */
        public void c(Object obj, long j10) {
            f(obj, j10).m();
        }

        /* access modifiers changed from: package-private */
        public <E> void d(Object obj, Object obj2, long j10) {
            a0.i f10 = f(obj, j10);
            a0.i f11 = f(obj2, j10);
            int size = f10.size();
            int size2 = f11.size();
            if (size > 0 && size2 > 0) {
                if (!f10.x()) {
                    f10 = f10.q(size2 + size);
                }
                f10.addAll(f11);
            }
            if (size > 0) {
                f11 = f10;
            }
            r1.O(obj, j10, f11);
        }

        /* access modifiers changed from: package-private */
        public <L> List<L> e(Object obj, long j10) {
            a0.i f10 = f(obj, j10);
            if (f10.x()) {
                return f10;
            }
            int size = f10.size();
            a0.i q9 = f10.q(size == 0 ? 10 : size * 2);
            r1.O(obj, j10, q9);
            return q9;
        }
    }

    private h0() {
    }

    static h0 a() {
        return f1938a;
    }

    static h0 b() {
        return f1939b;
    }

    /* access modifiers changed from: package-private */
    public abstract void c(Object obj, long j10);

    /* access modifiers changed from: package-private */
    public abstract <L> void d(Object obj, Object obj2, long j10);

    /* access modifiers changed from: package-private */
    public abstract <L> List<L> e(Object obj, long j10);
}
