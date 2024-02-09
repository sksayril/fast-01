package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.content.a;
import androidx.core.util.h;

public abstract class k<E> extends g {

    /* renamed from: m  reason: collision with root package name */
    private final Activity f2493m;

    /* renamed from: n  reason: collision with root package name */
    private final Context f2494n;

    /* renamed from: o  reason: collision with root package name */
    private final Handler f2495o;

    /* renamed from: p  reason: collision with root package name */
    private final int f2496p;

    /* renamed from: q  reason: collision with root package name */
    final n f2497q;

    k(Activity activity, Context context, Handler handler, int i10) {
        this.f2497q = new o();
        this.f2493m = activity;
        this.f2494n = (Context) h.k(context, "context == null");
        this.f2495o = (Handler) h.k(handler, "handler == null");
        this.f2496p = i10;
    }

    k(e eVar) {
        this(eVar, eVar, new Handler(), 0);
    }

    public View d(int i10) {
        return null;
    }

    public boolean e() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public Activity f() {
        return this.f2493m;
    }

    /* access modifiers changed from: package-private */
    public Context h() {
        return this.f2494n;
    }

    /* access modifiers changed from: package-private */
    public Handler i() {
        return this.f2495o;
    }

    public abstract E m();

    public LayoutInflater n() {
        return LayoutInflater.from(this.f2494n);
    }

    public boolean o(Fragment fragment) {
        return true;
    }

    public void p(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        if (i10 == -1) {
            a.m(this.f2494n, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    public void q() {
    }
}
