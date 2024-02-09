package com.dexterous.flutterlocalnotifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.core.app.o;
import io.flutter.view.FlutterCallbackInformation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k7.d;
import y6.a;

public class ActionBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: b  reason: collision with root package name */
    private static b f4839b;

    /* renamed from: c  reason: collision with root package name */
    private static io.flutter.embedding.engine.a f4840c;

    /* renamed from: a  reason: collision with root package name */
    l1.a f4841a;

    private static class b implements d.C0170d {

        /* renamed from: m  reason: collision with root package name */
        final List<Map<String, Object>> f4842m;

        /* renamed from: n  reason: collision with root package name */
        private d.b f4843n;

        private b() {
            this.f4842m = new ArrayList();
        }

        public void a(Object obj, d.b bVar) {
            for (Map<String, Object> a10 : this.f4842m) {
                bVar.a(a10);
            }
            this.f4842m.clear();
            this.f4843n = bVar;
        }

        public void b(Object obj) {
            this.f4843n = null;
        }

        public void c(Map<String, Object> map) {
            d.b bVar = this.f4843n;
            if (bVar != null) {
                bVar.a(map);
            } else {
                this.f4842m.add(map);
            }
        }
    }

    private void a(y6.a aVar) {
        new d(aVar.l(), "dexterous.com/flutter/local_notifications/actions").d(f4839b);
    }

    private void b(Context context) {
        if (f4840c != null) {
            Log.e("ActionBroadcastReceiver", "Engine is already initialised");
            return;
        }
        a7.d c10 = x6.a.e().c();
        c10.m(context);
        c10.e(context, (String[]) null);
        f4840c = new io.flutter.embedding.engine.a(context);
        FlutterCallbackInformation d10 = this.f4841a.d();
        if (d10 == null) {
            Log.w("ActionBroadcastReceiver", "Callback information could not be retrieved");
            return;
        }
        y6.a j10 = f4840c.j();
        a(j10);
        j10.j(new a.b(context.getAssets(), c10.f(), d10));
    }

    public void onReceive(Context context, Intent intent) {
        if ("com.dexterous.flutterlocalnotifications.ActionBroadcastReceiver.ACTION_TAPPED".equalsIgnoreCase(intent.getAction())) {
            l1.a aVar = this.f4841a;
            if (aVar == null) {
                aVar = new l1.a(context);
            }
            this.f4841a = aVar;
            Map<String, Object> extractNotificationResponseMap = FlutterLocalNotificationsPlugin.extractNotificationResponseMap(intent);
            if (intent.getBooleanExtra("cancelNotification", false)) {
                o.f(context).b(((Integer) extractNotificationResponseMap.get("notificationId")).intValue());
            }
            if (f4839b == null) {
                f4839b = new b();
            }
            f4839b.c(extractNotificationResponseMap);
            b(context);
        }
    }
}
