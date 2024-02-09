package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.df;
import h2.p;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

final class j7 implements Callable<List<rb>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ sc f6159a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f6160b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ q6 f6161c;

    j7(q6 q6Var, sc scVar, Bundle bundle) {
        this.f6161c = q6Var;
        this.f6159a = scVar;
        this.f6160b = bundle;
    }

    public final /* synthetic */ Object call() {
        this.f6161c.f6463c.n0();
        zb J = this.f6161c.f6463c;
        sc scVar = this.f6159a;
        Bundle bundle = this.f6160b;
        J.i().m();
        if (!df.a() || !J.b0().A(scVar.f6559m, k0.L0) || scVar.f6559m == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    J.k().F().a("Uri sources and timestamps do not match");
                } else {
                    for (int i10 = 0; i10 < intArray.length; i10++) {
                        p d02 = J.d0();
                        String str = scVar.f6559m;
                        int i11 = intArray[i10];
                        long j10 = longArray[i10];
                        p.f(str);
                        d02.m();
                        d02.t();
                        try {
                            int delete = d02.A().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i11), String.valueOf(j10)});
                            z4 J2 = d02.k().J();
                            J2.d("Pruned " + delete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i11), Long.valueOf(j10));
                        } catch (SQLiteException e10) {
                            d02.k().F().c("Error pruning trigger URIs. appId", x4.u(str), e10);
                        }
                    }
                }
            }
        }
        return J.d0().J0(scVar.f6559m);
    }
}
