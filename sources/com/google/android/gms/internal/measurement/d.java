package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private e f5178a;

    /* renamed from: b  reason: collision with root package name */
    private e f5179b;

    /* renamed from: c  reason: collision with root package name */
    private List<e> f5180c;

    public d() {
        this.f5178a = new e("", 0, (Map<String, Object>) null);
        this.f5179b = new e("", 0, (Map<String, Object>) null);
        this.f5180c = new ArrayList();
    }

    private d(e eVar) {
        this.f5178a = eVar;
        this.f5179b = (e) eVar.clone();
        this.f5180c = new ArrayList();
    }

    public final e a() {
        return this.f5178a;
    }

    public final void b(e eVar) {
        this.f5178a = eVar;
        this.f5179b = (e) eVar.clone();
        this.f5180c.clear();
    }

    public final void c(String str, long j10, Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (String next : map.keySet()) {
            hashMap.put(next, e.c(next, this.f5178a.b(next), map.get(next)));
        }
        this.f5180c.add(new e(str, j10, hashMap));
    }

    public final /* synthetic */ Object clone() {
        d dVar = new d((e) this.f5178a.clone());
        for (e clone : this.f5180c) {
            dVar.f5180c.add((e) clone.clone());
        }
        return dVar;
    }

    public final e d() {
        return this.f5179b;
    }

    public final void e(e eVar) {
        this.f5179b = eVar;
    }

    public final List<e> f() {
        return this.f5180c;
    }
}
