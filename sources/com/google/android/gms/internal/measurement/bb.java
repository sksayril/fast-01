package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class bb implements Iterator {

    /* renamed from: m  reason: collision with root package name */
    private int f5124m;

    /* renamed from: n  reason: collision with root package name */
    private Iterator f5125n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ za f5126o;

    private bb(za zaVar) {
        this.f5126o = zaVar;
        this.f5124m = zaVar.f5741n.size();
    }

    private final Iterator b() {
        if (this.f5125n == null) {
            this.f5125n = this.f5126o.f5745r.entrySet().iterator();
        }
        return this.f5125n;
    }

    public final boolean hasNext() {
        int i10 = this.f5124m;
        return (i10 > 0 && i10 <= this.f5126o.f5741n.size()) || b().hasNext();
    }

    public final /* synthetic */ Object next() {
        Object obj;
        if (b().hasNext()) {
            obj = b().next();
        } else {
            List e10 = this.f5126o.f5741n;
            int i10 = this.f5124m - 1;
            this.f5124m = i10;
            obj = e10.get(i10);
        }
        return (Map.Entry) obj;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
