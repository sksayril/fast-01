package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

final class jb implements Iterator {

    /* renamed from: m  reason: collision with root package name */
    private int f5385m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f5386n;

    /* renamed from: o  reason: collision with root package name */
    private Iterator f5387o;

    /* renamed from: p  reason: collision with root package name */
    private final /* synthetic */ za f5388p;

    private jb(za zaVar) {
        this.f5388p = zaVar;
        this.f5385m = -1;
    }

    private final Iterator b() {
        if (this.f5387o == null) {
            this.f5387o = this.f5388p.f5742o.entrySet().iterator();
        }
        return this.f5387o;
    }

    public final boolean hasNext() {
        return this.f5385m + 1 < this.f5388p.f5741n.size() || (!this.f5388p.f5742o.isEmpty() && b().hasNext());
    }

    public final /* synthetic */ Object next() {
        this.f5386n = true;
        int i10 = this.f5385m + 1;
        this.f5385m = i10;
        return (Map.Entry) (i10 < this.f5388p.f5741n.size() ? this.f5388p.f5741n.get(this.f5385m) : b().next());
    }

    public final void remove() {
        if (this.f5386n) {
            this.f5386n = false;
            this.f5388p.q();
            if (this.f5385m < this.f5388p.f5741n.size()) {
                za zaVar = this.f5388p;
                int i10 = this.f5385m;
                this.f5385m = i10 - 1;
                Object unused = zaVar.k(i10);
                return;
            }
            b().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
