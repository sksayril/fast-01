package com.google.android.gms.internal.measurement;

import java.util.Iterator;

final class db extends lb {

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ za f5191n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private db(za zaVar) {
        super(zaVar);
        this.f5191n = zaVar;
    }

    public final Iterator iterator() {
        return new bb(this.f5191n);
    }
}
