package z8;

import g8.l;
import java.util.Iterator;
import java.util.NoSuchElementException;
import r8.p;
import w8.c;
import y8.b;

final class d implements b<c> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f13620a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final int f13621b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final int f13622c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final p<CharSequence, Integer, l<Integer, Integer>> f13623d;

    public static final class a implements Iterator<c>, s8.a {

        /* renamed from: m  reason: collision with root package name */
        private int f13624m = -1;

        /* renamed from: n  reason: collision with root package name */
        private int f13625n;

        /* renamed from: o  reason: collision with root package name */
        private int f13626o;

        /* renamed from: p  reason: collision with root package name */
        private c f13627p;

        /* renamed from: q  reason: collision with root package name */
        private int f13628q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ d f13629r;

        a(d dVar) {
            this.f13629r = dVar;
            int e10 = i.e(dVar.f13621b, 0, dVar.f13620a.length());
            this.f13625n = e10;
            this.f13626o = e10;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
            if (r0 < z8.d.c(r6.f13629r)) goto L_0x0023;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void b() {
            /*
                r6 = this;
                int r0 = r6.f13626o
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r6.f13624m = r1
                r0 = 0
                r6.f13627p = r0
                goto L_0x0099
            L_0x000c:
                z8.d r0 = r6.f13629r
                int r0 = r0.f13622c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0023
                int r0 = r6.f13628q
                int r0 = r0 + r3
                r6.f13628q = r0
                z8.d r4 = r6.f13629r
                int r4 = r4.f13622c
                if (r0 >= r4) goto L_0x0031
            L_0x0023:
                int r0 = r6.f13626o
                z8.d r4 = r6.f13629r
                java.lang.CharSequence r4 = r4.f13620a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0047
            L_0x0031:
                w8.c r0 = new w8.c
                int r1 = r6.f13625n
                z8.d r4 = r6.f13629r
                java.lang.CharSequence r4 = r4.f13620a
                int r4 = z8.p.x(r4)
                r0.<init>(r1, r4)
            L_0x0042:
                r6.f13627p = r0
            L_0x0044:
                r6.f13626o = r2
                goto L_0x0097
            L_0x0047:
                z8.d r0 = r6.f13629r
                r8.p r0 = r0.f13623d
                z8.d r4 = r6.f13629r
                java.lang.CharSequence r4 = r4.f13620a
                int r5 = r6.f13626o
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                g8.l r0 = (g8.l) r0
                if (r0 != 0) goto L_0x0073
                w8.c r0 = new w8.c
                int r1 = r6.f13625n
                z8.d r4 = r6.f13629r
                java.lang.CharSequence r4 = r4.f13620a
                int r4 = z8.p.x(r4)
                r0.<init>(r1, r4)
                goto L_0x0042
            L_0x0073:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f13625n
                w8.c r4 = w8.i.h(r4, r2)
                r6.f13627p = r4
                int r2 = r2 + r0
                r6.f13625n = r2
                if (r0 != 0) goto L_0x0095
                r1 = 1
            L_0x0095:
                int r2 = r2 + r1
                goto L_0x0044
            L_0x0097:
                r6.f13624m = r3
            L_0x0099:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: z8.d.a.b():void");
        }

        /* renamed from: c */
        public c next() {
            if (this.f13624m == -1) {
                b();
            }
            if (this.f13624m != 0) {
                c cVar = this.f13627p;
                kotlin.jvm.internal.l.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f13627p = null;
                this.f13624m = -1;
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f13624m == -1) {
                b();
            }
            return this.f13624m == 1;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public d(CharSequence charSequence, int i10, int i11, p<? super CharSequence, ? super Integer, l<Integer, Integer>> pVar) {
        kotlin.jvm.internal.l.e(charSequence, "input");
        kotlin.jvm.internal.l.e(pVar, "getNextMatch");
        this.f13620a = charSequence;
        this.f13621b = i10;
        this.f13622c = i11;
        this.f13623d = pVar;
    }

    public Iterator<c> iterator() {
        return new a(this);
    }
}
