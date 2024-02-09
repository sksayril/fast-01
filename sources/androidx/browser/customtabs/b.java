package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.browser.customtabs.a;
import androidx.core.app.g;
import java.util.ArrayList;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f1120a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f1121b;

    private static class a {
        static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    /* renamed from: androidx.browser.customtabs.b$b  reason: collision with other inner class name */
    public static final class C0011b {

        /* renamed from: a  reason: collision with root package name */
        private final Intent f1122a = new Intent("android.intent.action.VIEW");

        /* renamed from: b  reason: collision with root package name */
        private final a.C0010a f1123b = new a.C0010a();

        /* renamed from: c  reason: collision with root package name */
        private ArrayList<Bundle> f1124c;

        /* renamed from: d  reason: collision with root package name */
        private Bundle f1125d;

        /* renamed from: e  reason: collision with root package name */
        private ArrayList<Bundle> f1126e;

        /* renamed from: f  reason: collision with root package name */
        private SparseArray<Bundle> f1127f;

        /* renamed from: g  reason: collision with root package name */
        private Bundle f1128g;

        /* renamed from: h  reason: collision with root package name */
        private int f1129h = 0;

        /* renamed from: i  reason: collision with root package name */
        private boolean f1130i = true;

        private void b() {
            String a10 = a.a();
            if (!TextUtils.isEmpty(a10)) {
                Bundle bundleExtra = this.f1122a.hasExtra("com.android.browser.headers") ? this.f1122a.getBundleExtra("com.android.browser.headers") : new Bundle();
                if (!bundleExtra.containsKey("Accept-Language")) {
                    bundleExtra.putString("Accept-Language", a10);
                    this.f1122a.putExtra("com.android.browser.headers", bundleExtra);
                }
            }
        }

        private void c(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            g.b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f1122a.putExtras(bundle);
        }

        public b a() {
            if (!this.f1122a.hasExtra("android.support.customtabs.extra.SESSION")) {
                c((IBinder) null, (PendingIntent) null);
            }
            ArrayList<Bundle> arrayList = this.f1124c;
            if (arrayList != null) {
                this.f1122a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f1126e;
            if (arrayList2 != null) {
                this.f1122a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f1122a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f1130i);
            this.f1122a.putExtras(this.f1123b.a().a());
            Bundle bundle = this.f1128g;
            if (bundle != null) {
                this.f1122a.putExtras(bundle);
            }
            if (this.f1127f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f1127f);
                this.f1122a.putExtras(bundle2);
            }
            this.f1122a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f1129h);
            if (Build.VERSION.SDK_INT >= 24) {
                b();
            }
            return new b(this.f1122a, this.f1125d);
        }
    }

    b(Intent intent, Bundle bundle) {
        this.f1120a = intent;
        this.f1121b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f1120a.setData(uri);
        androidx.core.content.a.m(context, this.f1120a, this.f1121b);
    }
}
