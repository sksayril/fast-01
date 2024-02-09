package u3;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.h2;
import h2.p;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import q4.d;
import t3.f;
import u3.a;

public class b implements a {

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f12471c;

    /* renamed from: a  reason: collision with root package name */
    private final a3.a f12472a;

    /* renamed from: b  reason: collision with root package name */
    final Map<String, Object> f12473b = new ConcurrentHashMap();

    class a implements a.C0213a {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ String f12474a;

        a(String str) {
            this.f12474a = str;
        }
    }

    private b(a3.a aVar) {
        p.j(aVar);
        this.f12472a = aVar;
    }

    public static a c(f fVar, Context context, d dVar) {
        p.j(fVar);
        p.j(context);
        p.j(dVar);
        p.j(context.getApplicationContext());
        if (f12471c == null) {
            synchronized (b.class) {
                if (f12471c == null) {
                    Bundle bundle = new Bundle(1);
                    if (fVar.y()) {
                        dVar.a(t3.b.class, c.f12476m, d.f12477a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", fVar.x());
                    }
                    f12471c = new b(h2.f(context, (String) null, (String) null, (String) null, bundle).v());
                }
            }
        }
        return f12471c;
    }

    static /* synthetic */ void d(q4.a aVar) {
        boolean z9 = ((t3.b) aVar.a()).f12402a;
        synchronized (b.class) {
            ((b) p.j(f12471c)).f12472a.c(z9);
        }
    }

    private final boolean e(String str) {
        return !str.isEmpty() && this.f12473b.containsKey(str) && this.f12473b.get(str) != null;
    }

    public a.C0213a a(String str, a.b bVar) {
        p.j(bVar);
        if (!com.google.firebase.analytics.connector.internal.a.f(str) || e(str)) {
            return null;
        }
        a3.a aVar = this.f12472a;
        Object dVar = "fiam".equals(str) ? new com.google.firebase.analytics.connector.internal.d(aVar, bVar) : "clx".equals(str) ? new com.google.firebase.analytics.connector.internal.f(aVar, bVar) : null;
        if (dVar == null) {
            return null;
        }
        this.f12473b.put(str, dVar);
        return new a(str);
    }

    public void b(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.a.f(str) && com.google.firebase.analytics.connector.internal.a.c(str2, bundle) && com.google.firebase.analytics.connector.internal.a.d(str, str2, bundle)) {
            com.google.firebase.analytics.connector.internal.a.b(str, str2, bundle);
            this.f12472a.a(str, str2, bundle);
        }
    }
}
