package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import i2.b;
import java.util.ArrayList;

public final class a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = b.A(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList<Scope> arrayList = null;
        String str7 = null;
        String str8 = null;
        long j10 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            switch (b.j(r9)) {
                case 1:
                    i10 = b.t(parcel2, r9);
                    break;
                case 2:
                    str = b.e(parcel2, r9);
                    break;
                case 3:
                    str2 = b.e(parcel2, r9);
                    break;
                case 4:
                    str3 = b.e(parcel2, r9);
                    break;
                case 5:
                    str4 = b.e(parcel2, r9);
                    break;
                case 6:
                    uri = (Uri) b.d(parcel2, r9, Uri.CREATOR);
                    break;
                case 7:
                    str5 = b.e(parcel2, r9);
                    break;
                case 8:
                    j10 = b.w(parcel2, r9);
                    break;
                case 9:
                    str6 = b.e(parcel2, r9);
                    break;
                case 10:
                    arrayList = b.h(parcel2, r9, Scope.CREATOR);
                    break;
                case 11:
                    str7 = b.e(parcel2, r9);
                    break;
                case 12:
                    str8 = b.e(parcel2, r9);
                    break;
                default:
                    b.z(parcel2, r9);
                    break;
            }
        }
        b.i(parcel2, A);
        return new GoogleSignInAccount(i10, str, str2, str3, str4, uri, str5, j10, str6, arrayList, str7, str8);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
