package h2;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import i2.a;
import i2.c;

public final class k0 extends a {
    public static final Parcelable.Creator<k0> CREATOR = new l0();

    /* renamed from: m  reason: collision with root package name */
    final int f9208m;

    /* renamed from: n  reason: collision with root package name */
    private final Account f9209n;

    /* renamed from: o  reason: collision with root package name */
    private final int f9210o;

    /* renamed from: p  reason: collision with root package name */
    private final GoogleSignInAccount f9211p;

    k0(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f9208m = i10;
        this.f9209n = account;
        this.f9210o = i11;
        this.f9211p = googleSignInAccount;
    }

    public k0(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.m(parcel, 1, this.f9208m);
        c.s(parcel, 2, this.f9209n, i10, false);
        c.m(parcel, 3, this.f9210o);
        c.s(parcel, 4, this.f9211p, i10, false);
        c.b(parcel, a10);
    }
}
