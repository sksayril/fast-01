package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.core.os.d;
import androidx.savedstate.a;
import e9.k;
import g8.p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

public final class x {

    /* renamed from: f  reason: collision with root package name */
    public static final a f2785f = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final Class<? extends Object>[] f2786g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f2787a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, a.c> f2788b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Object> f2789c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, k<Object>> f2790d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    private final a.c f2791e = new w(this);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final boolean a(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : x.f2786g) {
                l.b(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: private */
    public static final Bundle d(x xVar) {
        l.e(xVar, "this$0");
        for (Map.Entry entry : f0.m(xVar.f2788b).entrySet()) {
            xVar.e((String) entry.getKey(), ((a.c) entry.getValue()).a());
        }
        Set<String> keySet = xVar.f2787a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String next : keySet) {
            arrayList.add(next);
            arrayList2.add(xVar.f2787a.get(next));
        }
        return d.a(p.a("keys", arrayList), p.a("values", arrayList2));
    }

    public final a.c c() {
        return this.f2791e;
    }

    public final <T> void e(String str, T t9) {
        l.e(str, "key");
        if (f2785f.a(t9)) {
            Object obj = this.f2789c.get(str);
            q qVar = obj instanceof q ? (q) obj : null;
            if (qVar != null) {
                qVar.i(t9);
            } else {
                this.f2787a.put(str, t9);
            }
            k kVar = this.f2790d.get(str);
            if (kVar != null) {
                kVar.setValue(t9);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't put value with type ");
        l.b(t9);
        sb.append(t9.getClass());
        sb.append(" into saved state");
        throw new IllegalArgumentException(sb.toString());
    }
}
