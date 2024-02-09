package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import f.j;
import i2.b;
import java.util.ArrayList;
import java.util.List;

public final class uc implements Parcelable.Creator<sc> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = b.A(parcel);
        String str = "";
        String str2 = str;
        String str3 = str2;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str11 = null;
        String str12 = null;
        long j17 = -2147483648L;
        boolean z9 = true;
        boolean z10 = false;
        int i10 = 0;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = false;
        int i11 = 100;
        int i12 = 0;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            switch (b.j(r9)) {
                case 2:
                    str4 = b.e(parcel2, r9);
                    break;
                case 3:
                    str5 = b.e(parcel2, r9);
                    break;
                case 4:
                    str6 = b.e(parcel2, r9);
                    break;
                case 5:
                    str7 = b.e(parcel2, r9);
                    break;
                case 6:
                    j10 = b.w(parcel2, r9);
                    break;
                case 7:
                    j11 = b.w(parcel2, r9);
                    break;
                case 8:
                    str8 = b.e(parcel2, r9);
                    break;
                case 9:
                    z9 = b.k(parcel2, r9);
                    break;
                case 10:
                    z10 = b.k(parcel2, r9);
                    break;
                case 11:
                    j17 = b.w(parcel2, r9);
                    break;
                case 12:
                    str9 = b.e(parcel2, r9);
                    break;
                case 13:
                    j12 = b.w(parcel2, r9);
                    break;
                case 14:
                    j13 = b.w(parcel2, r9);
                    break;
                case 15:
                    i10 = b.t(parcel2, r9);
                    break;
                case 16:
                    z11 = b.k(parcel2, r9);
                    break;
                case 18:
                    z12 = b.k(parcel2, r9);
                    break;
                case 19:
                    str10 = b.e(parcel2, r9);
                    break;
                case 21:
                    bool = b.l(parcel2, r9);
                    break;
                case 22:
                    j14 = b.w(parcel2, r9);
                    break;
                case j.f8662o3 /*23*/:
                    arrayList = b.f(parcel2, r9);
                    break;
                case j.f8667p3 /*24*/:
                    str11 = b.e(parcel2, r9);
                    break;
                case 25:
                    str = b.e(parcel2, r9);
                    break;
                case 26:
                    str2 = b.e(parcel2, r9);
                    break;
                case 27:
                    str12 = b.e(parcel2, r9);
                    break;
                case 28:
                    z13 = b.k(parcel2, r9);
                    break;
                case j.f8692u3 /*29*/:
                    j15 = b.w(parcel2, r9);
                    break;
                case 30:
                    i11 = b.t(parcel2, r9);
                    break;
                case 31:
                    str3 = b.e(parcel2, r9);
                    break;
                case 32:
                    i12 = b.t(parcel2, r9);
                    break;
                case 34:
                    j16 = b.w(parcel2, r9);
                    break;
                default:
                    b.z(parcel2, r9);
                    break;
            }
        }
        b.i(parcel2, A);
        return new sc(str4, str5, str6, str7, j10, j11, str8, z9, z10, j17, str9, j12, j13, i10, z11, z12, str10, bool, j14, (List<String>) arrayList, str11, str, str2, str12, z13, j15, i11, str3, i12, j16);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new sc[i10];
    }
}
