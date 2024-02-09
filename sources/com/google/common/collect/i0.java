package com.google.common.collect;

import com.google.common.collect.o;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import p3.h;

final class i0<K, V> extends o<K, V> {

    /* renamed from: t  reason: collision with root package name */
    static final o<Object, Object> f7125t = new i0((Object) null, new Object[0], 0);

    /* renamed from: q  reason: collision with root package name */
    private final transient Object f7126q;

    /* renamed from: r  reason: collision with root package name */
    final transient Object[] f7127r;

    /* renamed from: s  reason: collision with root package name */
    private final transient int f7128s;

    static class a<K, V> extends q<Map.Entry<K, V>> {

        /* renamed from: o  reason: collision with root package name */
        private final transient o<K, V> f7129o;
        /* access modifiers changed from: private */

        /* renamed from: p  reason: collision with root package name */
        public final transient Object[] f7130p;
        /* access modifiers changed from: private */

        /* renamed from: q  reason: collision with root package name */
        public final transient int f7131q;
        /* access modifiers changed from: private */

        /* renamed from: r  reason: collision with root package name */
        public final transient int f7132r;

        /* renamed from: com.google.common.collect.i0$a$a  reason: collision with other inner class name */
        class C0092a extends n<Map.Entry<K, V>> {
            C0092a() {
            }

            /* renamed from: J */
            public Map.Entry<K, V> get(int i10) {
                h.g(i10, a.this.f7132r);
                int i11 = i10 * 2;
                Object obj = a.this.f7130p[a.this.f7131q + i11];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f7130p[i11 + (a.this.f7131q ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            public boolean i() {
                return true;
            }

            public int size() {
                return a.this.f7132r;
            }
        }

        a(o<K, V> oVar, Object[] objArr, int i10, int i11) {
            this.f7129o = oVar;
            this.f7130p = objArr;
            this.f7131q = i10;
            this.f7132r = i11;
        }

        /* access modifiers changed from: package-private */
        public n<Map.Entry<K, V>> A() {
            return new C0092a();
        }

        /* access modifiers changed from: package-private */
        public int c(Object[] objArr, int i10) {
            return l().c(objArr, i10);
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f7129o.get(key));
        }

        /* access modifiers changed from: package-private */
        public boolean i() {
            return true;
        }

        /* renamed from: k */
        public q0<Map.Entry<K, V>> iterator() {
            return l().iterator();
        }

        public int size() {
            return this.f7132r;
        }
    }

    static final class b<K> extends q<K> {

        /* renamed from: o  reason: collision with root package name */
        private final transient o<K, ?> f7134o;

        /* renamed from: p  reason: collision with root package name */
        private final transient n<K> f7135p;

        b(o<K, ?> oVar, n<K> nVar) {
            this.f7134o = oVar;
            this.f7135p = nVar;
        }

        /* access modifiers changed from: package-private */
        public int c(Object[] objArr, int i10) {
            return l().c(objArr, i10);
        }

        public boolean contains(Object obj) {
            return this.f7134o.get(obj) != null;
        }

        /* access modifiers changed from: package-private */
        public boolean i() {
            return true;
        }

        /* renamed from: k */
        public q0<K> iterator() {
            return l().iterator();
        }

        public n<K> l() {
            return this.f7135p;
        }

        public int size() {
            return this.f7134o.size();
        }
    }

    static final class c extends n<Object> {

        /* renamed from: o  reason: collision with root package name */
        private final transient Object[] f7136o;

        /* renamed from: p  reason: collision with root package name */
        private final transient int f7137p;

        /* renamed from: q  reason: collision with root package name */
        private final transient int f7138q;

        c(Object[] objArr, int i10, int i11) {
            this.f7136o = objArr;
            this.f7137p = i10;
            this.f7138q = i11;
        }

        public Object get(int i10) {
            h.g(i10, this.f7138q);
            Object obj = this.f7136o[(i10 * 2) + this.f7137p];
            Objects.requireNonNull(obj);
            return obj;
        }

        /* access modifiers changed from: package-private */
        public boolean i() {
            return true;
        }

        public int size() {
            return this.f7138q;
        }
    }

    private i0(Object obj, Object[] objArr, int i10) {
        this.f7126q = obj;
        this.f7127r = objArr;
        this.f7128s = i10;
    }

    static <K, V> i0<K, V> h(int i10, Object[] objArr, o.a<K, V> aVar) {
        if (i10 == 0) {
            return (i0) f7125t;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            f.a(obj, obj2);
            return new i0<>((Object) null, objArr, 1);
        }
        h.k(i10, objArr.length >> 1);
        Object i11 = i(objArr, i10, q.o(i10), 0);
        if (i11 instanceof Object[]) {
            Object[] objArr2 = (Object[]) i11;
            o.a.C0093a aVar2 = (o.a.C0093a) objArr2[2];
            if (aVar != null) {
                aVar.f7169e = aVar2;
                Object obj3 = objArr2[0];
                int intValue = ((Integer) objArr2[1]).intValue();
                objArr = Arrays.copyOf(objArr, intValue * 2);
                i11 = obj3;
                i10 = intValue;
            } else {
                throw aVar2.a();
            }
        }
        return new i0<>(i11, objArr, i10);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object i(java.lang.Object[] r16, int r17, int r18, int r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = 0
            r3 = 1
            if (r0 != r3) goto L_0x0018
            r0 = r16[r19]
            java.util.Objects.requireNonNull(r0)
            r1 = r19 ^ 1
            r1 = r16[r1]
            java.util.Objects.requireNonNull(r1)
            com.google.common.collect.f.a(r0, r1)
            return r2
        L_0x0018:
            int r4 = r1 + -1
            r5 = 128(0x80, float:1.794E-43)
            r6 = 3
            r7 = -1
            r8 = 2
            r9 = 0
            if (r1 > r5) goto L_0x008c
            byte[] r1 = new byte[r1]
            java.util.Arrays.fill(r1, r7)
            r5 = 0
            r7 = 0
        L_0x0029:
            if (r5 >= r0) goto L_0x007b
            int r10 = r5 * 2
            int r10 = r10 + r19
            int r11 = r7 * 2
            int r11 = r11 + r19
            r12 = r16[r10]
            java.util.Objects.requireNonNull(r12)
            r10 = r10 ^ r3
            r10 = r16[r10]
            java.util.Objects.requireNonNull(r10)
            com.google.common.collect.f.a(r12, r10)
            int r13 = r12.hashCode()
            int r13 = com.google.common.collect.l.b(r13)
        L_0x0049:
            r13 = r13 & r4
            byte r14 = r1[r13]
            r15 = 255(0xff, float:3.57E-43)
            r14 = r14 & r15
            if (r14 != r15) goto L_0x005f
            byte r14 = (byte) r11
            r1[r13] = r14
            if (r7 >= r5) goto L_0x005c
            r16[r11] = r12
            r11 = r11 ^ 1
            r16[r11] = r10
        L_0x005c:
            int r7 = r7 + 1
            goto L_0x0075
        L_0x005f:
            r15 = r16[r14]
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto L_0x0078
            com.google.common.collect.o$a$a r2 = new com.google.common.collect.o$a$a
            r11 = r14 ^ 1
            r13 = r16[r11]
            java.util.Objects.requireNonNull(r13)
            r2.<init>(r12, r10, r13)
            r16[r11] = r10
        L_0x0075:
            int r5 = r5 + 1
            goto L_0x0029
        L_0x0078:
            int r13 = r13 + 1
            goto L_0x0049
        L_0x007b:
            if (r7 != r0) goto L_0x007e
            goto L_0x008b
        L_0x007e:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0[r3] = r1
            r0[r8] = r2
            r1 = r0
        L_0x008b:
            return r1
        L_0x008c:
            r5 = 32768(0x8000, float:4.5918E-41)
            if (r1 > r5) goto L_0x00fc
            short[] r1 = new short[r1]
            java.util.Arrays.fill(r1, r7)
            r5 = 0
            r7 = 0
        L_0x0098:
            if (r5 >= r0) goto L_0x00eb
            int r10 = r5 * 2
            int r10 = r10 + r19
            int r11 = r7 * 2
            int r11 = r11 + r19
            r12 = r16[r10]
            java.util.Objects.requireNonNull(r12)
            r10 = r10 ^ r3
            r10 = r16[r10]
            java.util.Objects.requireNonNull(r10)
            com.google.common.collect.f.a(r12, r10)
            int r13 = r12.hashCode()
            int r13 = com.google.common.collect.l.b(r13)
        L_0x00b8:
            r13 = r13 & r4
            short r14 = r1[r13]
            r15 = 65535(0xffff, float:9.1834E-41)
            r14 = r14 & r15
            if (r14 != r15) goto L_0x00cf
            short r14 = (short) r11
            r1[r13] = r14
            if (r7 >= r5) goto L_0x00cc
            r16[r11] = r12
            r11 = r11 ^ 1
            r16[r11] = r10
        L_0x00cc:
            int r7 = r7 + 1
            goto L_0x00e5
        L_0x00cf:
            r15 = r16[r14]
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto L_0x00e8
            com.google.common.collect.o$a$a r2 = new com.google.common.collect.o$a$a
            r11 = r14 ^ 1
            r13 = r16[r11]
            java.util.Objects.requireNonNull(r13)
            r2.<init>(r12, r10, r13)
            r16[r11] = r10
        L_0x00e5:
            int r5 = r5 + 1
            goto L_0x0098
        L_0x00e8:
            int r13 = r13 + 1
            goto L_0x00b8
        L_0x00eb:
            if (r7 != r0) goto L_0x00ee
            goto L_0x00fb
        L_0x00ee:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0[r3] = r1
            r0[r8] = r2
            r1 = r0
        L_0x00fb:
            return r1
        L_0x00fc:
            int[] r1 = new int[r1]
            java.util.Arrays.fill(r1, r7)
            r5 = 0
            r10 = 0
        L_0x0103:
            if (r5 >= r0) goto L_0x0153
            int r11 = r5 * 2
            int r11 = r11 + r19
            int r12 = r10 * 2
            int r12 = r12 + r19
            r13 = r16[r11]
            java.util.Objects.requireNonNull(r13)
            r11 = r11 ^ r3
            r11 = r16[r11]
            java.util.Objects.requireNonNull(r11)
            com.google.common.collect.f.a(r13, r11)
            int r14 = r13.hashCode()
            int r14 = com.google.common.collect.l.b(r14)
        L_0x0123:
            r14 = r14 & r4
            r15 = r1[r14]
            if (r15 != r7) goto L_0x0135
            r1[r14] = r12
            if (r10 >= r5) goto L_0x0132
            r16[r12] = r13
            r12 = r12 ^ 1
            r16[r12] = r11
        L_0x0132:
            int r10 = r10 + 1
            goto L_0x014b
        L_0x0135:
            r7 = r16[r15]
            boolean r7 = r13.equals(r7)
            if (r7 == 0) goto L_0x014f
            com.google.common.collect.o$a$a r2 = new com.google.common.collect.o$a$a
            r7 = r15 ^ 1
            r12 = r16[r7]
            java.util.Objects.requireNonNull(r12)
            r2.<init>(r13, r11, r12)
            r16[r7] = r11
        L_0x014b:
            int r5 = r5 + 1
            r7 = -1
            goto L_0x0103
        L_0x014f:
            int r14 = r14 + 1
            r7 = -1
            goto L_0x0123
        L_0x0153:
            if (r10 != r0) goto L_0x0156
            goto L_0x0163
        L_0x0156:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0[r3] = r1
            r0[r8] = r2
            r1 = r0
        L_0x0163:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.i0.i(java.lang.Object[], int, int, int):java.lang.Object");
    }

    static Object j(Object obj, Object[] objArr, int i10, int i11, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i10 == 1) {
            Object obj3 = objArr[i11];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i11 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        } else if (obj == null) {
            return null;
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length - 1;
                int b10 = l.b(obj2.hashCode());
                while (true) {
                    int i12 = b10 & length;
                    byte b11 = bArr[i12] & 255;
                    if (b11 == 255) {
                        return null;
                    }
                    if (obj2.equals(objArr[b11])) {
                        return objArr[b11 ^ 1];
                    }
                    b10 = i12 + 1;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length2 = sArr.length - 1;
                int b12 = l.b(obj2.hashCode());
                while (true) {
                    int i13 = b12 & length2;
                    short s9 = sArr[i13] & 65535;
                    if (s9 == 65535) {
                        return null;
                    }
                    if (obj2.equals(objArr[s9])) {
                        return objArr[s9 ^ 1];
                    }
                    b12 = i13 + 1;
                }
            } else {
                int[] iArr = (int[]) obj;
                int length3 = iArr.length - 1;
                int b13 = l.b(obj2.hashCode());
                while (true) {
                    int i14 = b13 & length3;
                    int i15 = iArr[i14];
                    if (i15 == -1) {
                        return null;
                    }
                    if (obj2.equals(objArr[i15])) {
                        return objArr[i15 ^ 1];
                    }
                    b13 = i14 + 1;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public q<Map.Entry<K, V>> a() {
        return new a(this, this.f7127r, 0, this.f7128s);
    }

    /* access modifiers changed from: package-private */
    public q<K> b() {
        return new b(this, new c(this.f7127r, 0, this.f7128s));
    }

    /* access modifiers changed from: package-private */
    public m<V> c() {
        return new c(this.f7127r, 1, this.f7128s);
    }

    public V get(Object obj) {
        V j10 = j(this.f7126q, this.f7127r, this.f7128s, 0, obj);
        if (j10 == null) {
            return null;
        }
        return j10;
    }

    public int size() {
        return this.f7128s;
    }
}
