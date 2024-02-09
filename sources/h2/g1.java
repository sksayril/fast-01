package h2;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import e2.d;
import i2.b;
import i2.c;

public final class g1 implements Parcelable.Creator {
    static void a(g gVar, Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.m(parcel, 1, gVar.f9172m);
        c.m(parcel, 2, gVar.f9173n);
        c.m(parcel, 3, gVar.f9174o);
        c.t(parcel, 4, gVar.f9175p, false);
        c.l(parcel, 5, gVar.f9176q, false);
        c.v(parcel, 6, gVar.f9177r, i10, false);
        c.e(parcel, 7, gVar.f9178s, false);
        c.s(parcel, 8, gVar.f9179t, i10, false);
        c.v(parcel, 10, gVar.f9180u, i10, false);
        c.v(parcel, 11, gVar.f9181v, i10, false);
        c.c(parcel, 12, gVar.f9182w);
        c.m(parcel, 13, gVar.f9183x);
        c.c(parcel, 14, gVar.f9184y);
        c.t(parcel, 15, gVar.d(), false);
        c.b(parcel, a10);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = b.A(parcel);
        Scope[] scopeArr = g.A;
        Bundle bundle = new Bundle();
        d[] dVarArr = g.B;
        d[] dVarArr2 = dVarArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z9 = false;
        int i13 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            switch (b.j(r9)) {
                case 1:
                    i10 = b.t(parcel2, r9);
                    break;
                case 2:
                    i11 = b.t(parcel2, r9);
                    break;
                case 3:
                    i12 = b.t(parcel2, r9);
                    break;
                case 4:
                    str = b.e(parcel2, r9);
                    break;
                case 5:
                    iBinder = b.s(parcel2, r9);
                    break;
                case 6:
                    scopeArr = (Scope[]) b.g(parcel2, r9, Scope.CREATOR);
                    break;
                case 7:
                    bundle = b.a(parcel2, r9);
                    break;
                case 8:
                    account = (Account) b.d(parcel2, r9, Account.CREATOR);
                    break;
                case 10:
                    dVarArr = (d[]) b.g(parcel2, r9, d.CREATOR);
                    break;
                case 11:
                    dVarArr2 = (d[]) b.g(parcel2, r9, d.CREATOR);
                    break;
                case 12:
                    z9 = b.k(parcel2, r9);
                    break;
                case 13:
                    i13 = b.t(parcel2, r9);
                    break;
                case 14:
                    z10 = b.k(parcel2, r9);
                    break;
                case 15:
                    str2 = b.e(parcel2, r9);
                    break;
                default:
                    b.z(parcel2, r9);
                    break;
            }
        }
        b.i(parcel2, A);
        return new g(i10, i11, i12, str, iBinder, scopeArr, bundle, account, dVarArr, dVarArr2, z9, i13, z10, str2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
