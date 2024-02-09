package h2;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import s2.a;
import s2.c;

public final class p1 extends a implements j {
    p1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    public final Account a() {
        Parcel B = B(2, J());
        Account account = (Account) c.a(B, Account.CREATOR);
        B.recycle();
        return account;
    }
}
