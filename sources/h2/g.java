package h2;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import e2.d;
import h2.j;
import i2.a;

public class g extends a {
    static final Scope[] A = new Scope[0];
    static final d[] B = new d[0];
    public static final Parcelable.Creator<g> CREATOR = new g1();

    /* renamed from: m  reason: collision with root package name */
    final int f9172m;

    /* renamed from: n  reason: collision with root package name */
    final int f9173n;

    /* renamed from: o  reason: collision with root package name */
    int f9174o;

    /* renamed from: p  reason: collision with root package name */
    String f9175p;

    /* renamed from: q  reason: collision with root package name */
    IBinder f9176q;

    /* renamed from: r  reason: collision with root package name */
    Scope[] f9177r;

    /* renamed from: s  reason: collision with root package name */
    Bundle f9178s;

    /* renamed from: t  reason: collision with root package name */
    Account f9179t;

    /* renamed from: u  reason: collision with root package name */
    d[] f9180u;

    /* renamed from: v  reason: collision with root package name */
    d[] f9181v;

    /* renamed from: w  reason: collision with root package name */
    boolean f9182w;

    /* renamed from: x  reason: collision with root package name */
    int f9183x;

    /* renamed from: y  reason: collision with root package name */
    boolean f9184y;

    /* renamed from: z  reason: collision with root package name */
    private String f9185z;

    g(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, d[] dVarArr, d[] dVarArr2, boolean z9, int i13, boolean z10, String str2) {
        scopeArr = scopeArr == null ? A : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        dVarArr = dVarArr == null ? B : dVarArr;
        dVarArr2 = dVarArr2 == null ? B : dVarArr2;
        this.f9172m = i10;
        this.f9173n = i11;
        this.f9174o = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f9175p = "com.google.android.gms";
        } else {
            this.f9175p = str;
        }
        if (i10 < 2) {
            this.f9179t = iBinder != null ? a.Y(j.a.J(iBinder)) : null;
        } else {
            this.f9176q = iBinder;
            this.f9179t = account;
        }
        this.f9177r = scopeArr;
        this.f9178s = bundle;
        this.f9180u = dVarArr;
        this.f9181v = dVarArr2;
        this.f9182w = z9;
        this.f9183x = i13;
        this.f9184y = z10;
        this.f9185z = str2;
    }

    public final String d() {
        return this.f9185z;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        g1.a(this, parcel, i10);
    }
}
