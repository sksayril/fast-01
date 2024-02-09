package io.flutter.plugins.googlemaps;

import android.content.Context;
import io.flutter.plugin.platform.f;
import io.flutter.plugin.platform.g;
import java.util.List;
import java.util.Map;
import k7.c;
import k7.r;

public class j extends g {

    /* renamed from: b  reason: collision with root package name */
    private final c f10486b;

    /* renamed from: c  reason: collision with root package name */
    private final o f10487c;

    /* renamed from: d  reason: collision with root package name */
    private final k f10488d;

    j(c cVar, Context context, o oVar) {
        super(r.f11008a);
        this.f10486b = cVar;
        this.f10487c = oVar;
        this.f10488d = new k(context, cVar);
    }

    public f a(Context context, int i10, Object obj) {
        Map map = (Map) obj;
        f fVar = new f();
        Object obj2 = map.get("options");
        e.e(obj2, fVar);
        if (map.containsKey("initialCameraPosition")) {
            fVar.b(e.v(map.get("initialCameraPosition")));
        }
        if (map.containsKey("markersToAdd")) {
            fVar.d(map.get("markersToAdd"));
        }
        if (map.containsKey("polygonsToAdd")) {
            fVar.e(map.get("polygonsToAdd"));
        }
        if (map.containsKey("polylinesToAdd")) {
            fVar.f(map.get("polylinesToAdd"));
        }
        if (map.containsKey("circlesToAdd")) {
            fVar.c(map.get("circlesToAdd"));
        }
        if (map.containsKey("tileOverlaysToAdd")) {
            fVar.g((List) map.get("tileOverlaysToAdd"));
        }
        Object obj3 = ((Map) obj2).get("cloudMapId");
        if (obj3 != null) {
            fVar.h((String) obj3);
        }
        return fVar.a(i10, context, this.f10486b, this.f10487c);
    }
}
