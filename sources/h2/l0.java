package h2;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import i2.b;

public final class l0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            int j10 = b.j(r9);
            if (j10 == 1) {
                i10 = b.t(parcel, r9);
            } else if (j10 == 2) {
                account = (Account) b.d(parcel, r9, Account.CREATOR);
            } else if (j10 == 3) {
                i11 = b.t(parcel, r9);
            } else if (j10 != 4) {
                b.z(parcel, r9);
            } else {
                googleSignInAccount = (GoogleSignInAccount) b.d(parcel, r9, GoogleSignInAccount.CREATOR);
            }
        }
        b.i(parcel, A);
        return new k0(i10, account, i11, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new k0[i10];
    }
}
