package com.google.firebase.installations;

import d3.k;

class d implements e {

    /* renamed from: a  reason: collision with root package name */
    final k<String> f7462a;

    public d(k<String> kVar) {
        this.f7462a = kVar;
    }

    public boolean a(v4.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f7462a.e(dVar.d());
        return true;
    }

    public boolean b(Exception exc) {
        return false;
    }
}
