package com.google.android.gms.internal.measurement;

import java.util.Map;

final class gb implements Comparable, Map.Entry {

    /* renamed from: m  reason: collision with root package name */
    private final Comparable f5276m;

    /* renamed from: n  reason: collision with root package name */
    private Object f5277n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ za f5278o;

    gb(za zaVar, Comparable comparable, Object obj) {
        this.f5278o = zaVar;
        this.f5276m = comparable;
        this.f5277n = obj;
    }

    gb(za zaVar, Map.Entry entry) {
        this(zaVar, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean e(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((gb) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return e(this.f5276m, entry.getKey()) && e(this.f5277n, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f5276m;
    }

    public final Object getValue() {
        return this.f5277n;
    }

    public final int hashCode() {
        Comparable comparable = this.f5276m;
        int i10 = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f5277n;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return hashCode ^ i10;
    }

    public final Object setValue(Object obj) {
        this.f5278o.q();
        Object obj2 = this.f5277n;
        this.f5277n = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f5276m);
        String valueOf2 = String.valueOf(this.f5277n);
        return valueOf + "=" + valueOf2;
    }
}
