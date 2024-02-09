package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.f2;
import h2.p;

public final class w7 {

    /* renamed from: a  reason: collision with root package name */
    final Context f6662a;

    /* renamed from: b  reason: collision with root package name */
    String f6663b;

    /* renamed from: c  reason: collision with root package name */
    String f6664c;

    /* renamed from: d  reason: collision with root package name */
    String f6665d;

    /* renamed from: e  reason: collision with root package name */
    Boolean f6666e;

    /* renamed from: f  reason: collision with root package name */
    long f6667f;

    /* renamed from: g  reason: collision with root package name */
    f2 f6668g;

    /* renamed from: h  reason: collision with root package name */
    boolean f6669h = true;

    /* renamed from: i  reason: collision with root package name */
    Long f6670i;

    /* renamed from: j  reason: collision with root package name */
    String f6671j;

    public w7(Context context, f2 f2Var, Long l10) {
        p.j(context);
        Context applicationContext = context.getApplicationContext();
        p.j(applicationContext);
        this.f6662a = applicationContext;
        this.f6670i = l10;
        if (f2Var != null) {
            this.f6668g = f2Var;
            this.f6663b = f2Var.f5226r;
            this.f6664c = f2Var.f5225q;
            this.f6665d = f2Var.f5224p;
            this.f6669h = f2Var.f5223o;
            this.f6667f = f2Var.f5222n;
            this.f6671j = f2Var.f5228t;
            Bundle bundle = f2Var.f5227s;
            if (bundle != null) {
                this.f6666e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
