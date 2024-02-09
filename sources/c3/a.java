package c3;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import b3.f;
import e2.b;
import e2.i;
import f2.f;
import h2.c;
import h2.e;
import h2.h;
import h2.k0;
import h2.m0;
import h2.p;

public class a extends h<g> implements f {
    public static final /* synthetic */ int M = 0;
    private final boolean I = true;
    private final e J;
    private final Bundle K;
    private final Integer L;

    public a(Context context, Looper looper, boolean z9, e eVar, Bundle bundle, f.a aVar, f.b bVar) {
        super(context, looper, 44, eVar, aVar, bVar);
        this.J = eVar;
        this.K = bundle;
        this.L = eVar.g();
    }

    public static Bundle l0(e eVar) {
        eVar.f();
        Integer g10 = eVar.g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", eVar.a());
        if (g10 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", g10.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public final Bundle A() {
        if (!y().getPackageName().equals(this.J.d())) {
            this.K.putString("com.google.android.gms.signin.internal.realClientPackageName", this.J.d());
        }
        return this.K;
    }

    /* access modifiers changed from: protected */
    public final String E() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    public final String F() {
        return "com.google.android.gms.signin.service.START";
    }

    public final void b(f fVar) {
        p.k(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account b10 = this.J.b();
            ((g) D()).e3(new j(1, new k0(b10, ((Integer) p.j(this.L)).intValue(), "<<default account>>".equals(b10.name) ? c2.a.a(y()).b() : null)), fVar);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.H0(new l(1, new b(8, (PendingIntent) null), (m0) null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    public final int g() {
        return i.f8355a;
    }

    public final boolean n() {
        return this.I;
    }

    public final void o() {
        p(new c.d());
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
    }
}
