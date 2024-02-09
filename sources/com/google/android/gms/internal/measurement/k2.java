package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.h2;
import com.google.android.gms.measurement.internal.g6;
import h2.p;
import o2.d;

final class k2 extends h2.a {

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ String f5396q;

    /* renamed from: r  reason: collision with root package name */
    private final /* synthetic */ String f5397r;

    /* renamed from: s  reason: collision with root package name */
    private final /* synthetic */ Context f5398s;

    /* renamed from: t  reason: collision with root package name */
    private final /* synthetic */ Bundle f5399t;

    /* renamed from: u  reason: collision with root package name */
    private final /* synthetic */ h2 f5400u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    k2(h2 h2Var, String str, String str2, Context context, Bundle bundle) {
        super(h2Var);
        this.f5400u = h2Var;
        this.f5396q = str;
        this.f5397r = str2;
        this.f5398s = context;
        this.f5399t = bundle;
    }

    public final void a() {
        String str;
        String str2;
        String str3;
        try {
            if (this.f5400u.C(this.f5396q, this.f5397r)) {
                String str4 = this.f5397r;
                str2 = this.f5396q;
                str = str4;
                str3 = this.f5400u.f5289a;
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            p.j(this.f5398s);
            h2 h2Var = this.f5400u;
            h2Var.f5297i = h2Var.c(this.f5398s, true);
            if (this.f5400u.f5297i == null) {
                Log.w(this.f5400u.f5289a, "Failed to connect to measurement client.");
                return;
            }
            int a10 = DynamiteModule.a(this.f5398s, ModuleDescriptor.MODULE_ID);
            int c10 = DynamiteModule.c(this.f5398s, ModuleDescriptor.MODULE_ID);
            ((v1) p.j(this.f5400u.f5297i)).initialize(d.e3(this.f5398s), new f2(82001, (long) Math.max(a10, c10), c10 < a10, str3, str2, str, this.f5399t, g6.a(this.f5398s)), this.f5298m);
        } catch (Exception e10) {
            this.f5400u.q(e10, true, false);
        }
    }
}
