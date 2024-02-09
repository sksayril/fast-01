package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

public final class yc {

    /* renamed from: a  reason: collision with root package name */
    private final m6 f6757a;

    public yc(m6 m6Var) {
        this.f6757a = m6Var;
    }

    private final boolean d() {
        return this.f6757a.E().f6253x.a() > 0;
    }

    private final boolean e() {
        return d() && this.f6757a.a().a() - this.f6757a.E().f6253x.a() > this.f6757a.y().w((String) null, k0.V);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f6757a.i().m();
        if (d()) {
            if (e()) {
                this.f6757a.E().f6252w.b((String) null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1);
                this.f6757a.G().y0("auto", "_cmpx", bundle);
            } else {
                String a10 = this.f6757a.E().f6252w.a();
                if (TextUtils.isEmpty(a10)) {
                    this.f6757a.k().H().a("Cache still valid but referrer not found");
                } else {
                    long a11 = ((this.f6757a.E().f6253x.a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a10);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String next : parse.getQueryParameterNames()) {
                        bundle2.putString(next, parse.getQueryParameter(next));
                    }
                    ((Bundle) pair.second).putLong("_cc", a11);
                    Object obj = pair.first;
                    this.f6757a.G().y0(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                this.f6757a.E().f6252w.b((String) null);
            }
            this.f6757a.E().f6253x.b(0);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(String str, Bundle bundle) {
        String str2;
        this.f6757a.i().m();
        if (!this.f6757a.o()) {
            if (bundle == null || bundle.isEmpty()) {
                str2 = null;
            } else {
                if (str == null || str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str3 : bundle.keySet()) {
                    builder.appendQueryParameter(str3, bundle.getString(str3));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f6757a.E().f6252w.b(str2);
                this.f6757a.E().f6253x.b(this.f6757a.a().a());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (d() && e()) {
            this.f6757a.E().f6252w.b((String) null);
        }
    }
}
