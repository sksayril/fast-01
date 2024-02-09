package com.google.gson;

import h5.a;
import h5.d;
import i5.l;
import i5.n;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private d f7510a = d.f9330s;

    /* renamed from: b  reason: collision with root package name */
    private t f7511b = t.DEFAULT;

    /* renamed from: c  reason: collision with root package name */
    private d f7512c = c.IDENTITY;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Type, g<?>> f7513d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final List<x> f7514e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final List<x> f7515f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private boolean f7516g = false;

    /* renamed from: h  reason: collision with root package name */
    private String f7517h;

    /* renamed from: i  reason: collision with root package name */
    private int f7518i = 2;

    /* renamed from: j  reason: collision with root package name */
    private int f7519j = 2;

    /* renamed from: k  reason: collision with root package name */
    private boolean f7520k = false;

    /* renamed from: l  reason: collision with root package name */
    private boolean f7521l = false;

    /* renamed from: m  reason: collision with root package name */
    private boolean f7522m = true;

    /* renamed from: n  reason: collision with root package name */
    private boolean f7523n = false;

    /* renamed from: o  reason: collision with root package name */
    private boolean f7524o = false;

    /* renamed from: p  reason: collision with root package name */
    private boolean f7525p = false;

    /* renamed from: q  reason: collision with root package name */
    private v f7526q = u.DOUBLE;

    /* renamed from: r  reason: collision with root package name */
    private v f7527r = u.LAZILY_PARSED_NUMBER;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r5, int r6, int r7, java.util.List<com.google.gson.x> r8) {
        /*
            r4 = this;
            boolean r0 = l5.d.f11147a
            r1 = 0
            if (r5 == 0) goto L_0x0026
            java.lang.String r2 = r5.trim()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0026
            i5.d$b<java.util.Date> r6 = i5.d.b.f9502b
            com.google.gson.x r6 = r6.b(r5)
            if (r0 == 0) goto L_0x0024
            i5.d$b<? extends java.util.Date> r7 = l5.d.f11149c
            com.google.gson.x r1 = r7.b(r5)
            i5.d$b<? extends java.util.Date> r7 = l5.d.f11148b
            com.google.gson.x r5 = r7.b(r5)
            goto L_0x0045
        L_0x0024:
            r5 = r1
            goto L_0x0045
        L_0x0026:
            r5 = 2
            if (r6 == r5) goto L_0x0050
            if (r7 == r5) goto L_0x0050
            i5.d$b<java.util.Date> r5 = i5.d.b.f9502b
            com.google.gson.x r5 = r5.a(r6, r7)
            if (r0 == 0) goto L_0x0043
            i5.d$b<? extends java.util.Date> r1 = l5.d.f11149c
            com.google.gson.x r1 = r1.a(r6, r7)
            i5.d$b<? extends java.util.Date> r2 = l5.d.f11148b
            com.google.gson.x r6 = r2.a(r6, r7)
            r3 = r6
            r6 = r5
            r5 = r3
            goto L_0x0045
        L_0x0043:
            r6 = r5
            goto L_0x0024
        L_0x0045:
            r8.add(r6)
            if (r0 == 0) goto L_0x0050
            r8.add(r1)
            r8.add(r5)
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.f.a(java.lang.String, int, int, java.util.List):void");
    }

    public e b() {
        ArrayList arrayList = r1;
        ArrayList arrayList2 = new ArrayList(this.f7514e.size() + this.f7515f.size() + 3);
        arrayList2.addAll(this.f7514e);
        Collections.reverse(arrayList2);
        ArrayList arrayList3 = new ArrayList(this.f7515f);
        Collections.reverse(arrayList3);
        arrayList2.addAll(arrayList3);
        a(this.f7517h, this.f7518i, this.f7519j, arrayList2);
        return new e(this.f7510a, this.f7512c, this.f7513d, this.f7516g, this.f7520k, this.f7524o, this.f7522m, this.f7523n, this.f7525p, this.f7521l, this.f7511b, this.f7517h, this.f7518i, this.f7519j, this.f7514e, this.f7515f, arrayList, this.f7526q, this.f7527r);
    }

    public f c(Type type, Object obj) {
        boolean z9 = obj instanceof r;
        a.a(z9 || (obj instanceof j) || (obj instanceof g) || (obj instanceof w));
        if (obj instanceof g) {
            this.f7513d.put(type, (g) obj);
        }
        if (z9 || (obj instanceof j)) {
            this.f7514e.add(l.g(m5.a.b(type), obj));
        }
        if (obj instanceof w) {
            this.f7514e.add(n.c(m5.a.b(type), (w) obj));
        }
        return this;
    }

    public f d(x xVar) {
        this.f7514e.add(xVar);
        return this;
    }
}
