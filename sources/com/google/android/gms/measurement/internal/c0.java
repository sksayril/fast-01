package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.os.Handler;
import androidx.core.content.a;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import l2.d;

public final class c0 extends k7 {

    /* renamed from: c  reason: collision with root package name */
    private long f5910c;

    /* renamed from: d  reason: collision with root package name */
    private String f5911d;

    /* renamed from: e  reason: collision with root package name */
    private AccountManager f5912e;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f5913f;

    /* renamed from: g  reason: collision with root package name */
    private long f5914g;

    c0(m6 m6Var) {
        super(m6Var);
    }

    public final /* bridge */ /* synthetic */ d a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ f c() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ g d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ c0 e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ w4 f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ k5 g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ oc h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ f6 i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    public final /* bridge */ /* synthetic */ x4 k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    /* access modifiers changed from: protected */
    public final boolean r() {
        Calendar instance = Calendar.getInstance();
        this.f5910c = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f5911d = lowerCase + "-" + lowerCase2;
        return false;
    }

    /* access modifiers changed from: package-private */
    public final long t() {
        m();
        return this.f5914g;
    }

    public final long u() {
        n();
        return this.f5910c;
    }

    public final String v() {
        n();
        return this.f5911d;
    }

    /* access modifiers changed from: package-private */
    public final void w() {
        m();
        this.f5913f = null;
        this.f5914g = 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean x() {
        m();
        long a10 = a().a();
        if (a10 - this.f5914g > 86400000) {
            this.f5913f = null;
        }
        Boolean bool = this.f5913f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (a.a(zza(), "android.permission.GET_ACCOUNTS") != 0) {
            k().M().a("Permission error checking for dasher/unicorn accounts");
        } else {
            if (this.f5912e == null) {
                this.f5912e = AccountManager.get(zza());
            }
            try {
                Account[] result = this.f5912e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, (AccountManagerCallback) null, (Handler) null).getResult();
                if (result == null || result.length <= 0) {
                    Account[] result2 = this.f5912e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, (AccountManagerCallback) null, (Handler) null).getResult();
                    if (result2 != null && result2.length > 0) {
                        this.f5913f = Boolean.TRUE;
                        this.f5914g = a10;
                        return true;
                    }
                } else {
                    this.f5913f = Boolean.TRUE;
                    this.f5914g = a10;
                    return true;
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e10) {
                k().H().b("Exception checking account types", e10);
            }
        }
        this.f5914g = a10;
        this.f5913f = Boolean.FALSE;
        return false;
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }
}
