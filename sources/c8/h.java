package c8;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.b;
import c8.a;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.util.Map;

final class h implements a.b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3877a;

    /* renamed from: b  reason: collision with root package name */
    private final a f3878b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f3879c;

    interface a {
        String a(Intent intent);
    }

    h(Context context) {
        this(context, new g(context));
    }

    h(Context context, a aVar) {
        this.f3877a = context;
        this.f3878b = aVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:1:0x0008 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean f(java.util.Map<java.lang.String, java.lang.String> r5) {
        /*
            java.util.Set r5 = r5.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0008:
            boolean r0 = r5.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x0057
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r2)
            r0.hashCode()
            r2 = -1
            int r3 = r0.hashCode()
            r4 = 1
            switch(r3) {
                case -1423461112: goto L_0x004a;
                case -1229727188: goto L_0x003f;
                case 785670158: goto L_0x0034;
                case 802785917: goto L_0x0029;
                default: goto L_0x0027;
            }
        L_0x0027:
            r1 = -1
            goto L_0x0053
        L_0x0029:
            java.lang.String r1 = "accept-language"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0032
            goto L_0x0027
        L_0x0032:
            r1 = 3
            goto L_0x0053
        L_0x0034:
            java.lang.String r1 = "content-type"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x003d
            goto L_0x0027
        L_0x003d:
            r1 = 2
            goto L_0x0053
        L_0x003f:
            java.lang.String r1 = "content-language"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0048
            goto L_0x0027
        L_0x0048:
            r1 = 1
            goto L_0x0053
        L_0x004a:
            java.lang.String r3 = "accept"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0053
            goto L_0x0027
        L_0x0053:
            switch(r1) {
                case 0: goto L_0x0008;
                case 1: goto L_0x0008;
                case 2: goto L_0x0008;
                case 3: goto L_0x0008;
                default: goto L_0x0056;
            }
        L_0x0056:
            return r4
        L_0x0057:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c8.h.f(java.util.Map):boolean");
    }

    private void g() {
        if (this.f3879c == null) {
            throw new a.C0083a("NO_ACTIVITY", "Launching a URL requires a foreground activity.", (Object) null);
        }
    }

    private static Bundle h(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (String next : map.keySet()) {
            bundle.putString(next, map.get(next));
        }
        return bundle;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String i(Context context, Intent intent) {
        ComponentName resolveActivity = intent.resolveActivity(context.getPackageManager());
        if (resolveActivity == null) {
            return null;
        }
        return resolveActivity.toShortString();
    }

    private static boolean j(Context context, Uri uri, Bundle bundle) {
        b a10 = new b.C0011b().a();
        a10.f1120a.putExtra("com.android.browser.headers", bundle);
        try {
            a10.a(context, uri);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    public Boolean a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        String a10 = this.f3878b.a(intent);
        return a10 == null ? Boolean.FALSE : Boolean.valueOf(!"{com.android.fallback/com.android.fallback.Fallback}".equals(a10));
    }

    public void b() {
        this.f3877a.sendBroadcast(new Intent("close action"));
    }

    public Boolean c(String str, Map<String, String> map) {
        g();
        try {
            this.f3879c.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", h(map)));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    public Boolean d(String str, a.d dVar) {
        g();
        Bundle h10 = h(dVar.d());
        if (!f(dVar.d())) {
            if (j(this.f3879c, Uri.parse(str), h10)) {
                return Boolean.TRUE;
            }
        }
        try {
            this.f3879c.startActivity(WebViewActivity.a(this.f3879c, str, dVar.c().booleanValue(), dVar.b().booleanValue(), h10));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    /* access modifiers changed from: package-private */
    public void k(Activity activity) {
        this.f3879c = activity;
    }
}
