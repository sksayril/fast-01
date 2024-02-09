package h2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public final class h1 {

    /* renamed from: f  reason: collision with root package name */
    private static final Uri f9188f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a  reason: collision with root package name */
    private final String f9189a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9190b;

    /* renamed from: c  reason: collision with root package name */
    private final ComponentName f9191c = null;

    /* renamed from: d  reason: collision with root package name */
    private final int f9192d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f9193e;

    public h1(String str, String str2, int i10, boolean z9) {
        p.f(str);
        this.f9189a = str;
        p.f(str2);
        this.f9190b = str2;
        this.f9192d = i10;
        this.f9193e = z9;
    }

    public final int a() {
        return this.f9192d;
    }

    public final ComponentName b() {
        return this.f9191c;
    }

    public final Intent c(Context context) {
        Bundle bundle;
        if (this.f9189a == null) {
            return new Intent().setComponent(this.f9191c);
        }
        Intent intent = null;
        if (this.f9193e) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.f9189a);
            try {
                bundle = context.getContentResolver().call(f9188f, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e10) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e10.toString()));
                bundle = null;
            }
            if (bundle != null) {
                intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
            }
            if (intent == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f9189a)));
            }
        }
        return intent != null ? intent : new Intent(this.f9189a).setPackage(this.f9190b);
    }

    public final String d() {
        return this.f9190b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return o.a(this.f9189a, h1Var.f9189a) && o.a(this.f9190b, h1Var.f9190b) && o.a(this.f9191c, h1Var.f9191c) && this.f9192d == h1Var.f9192d && this.f9193e == h1Var.f9193e;
    }

    public final int hashCode() {
        return o.b(this.f9189a, this.f9190b, this.f9191c, Integer.valueOf(this.f9192d), Boolean.valueOf(this.f9193e));
    }

    public final String toString() {
        String str = this.f9189a;
        if (str != null) {
            return str;
        }
        p.j(this.f9191c);
        return this.f9191c.flattenToString();
    }
}
