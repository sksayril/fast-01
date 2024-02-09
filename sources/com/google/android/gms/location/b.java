package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import t2.b0;

public final class b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = i2.b.A(parcel);
        WorkSource workSource = new WorkSource();
        String str = null;
        b0 b0Var = null;
        long j10 = Long.MAX_VALUE;
        long j11 = Long.MAX_VALUE;
        long j12 = 3600000;
        long j13 = 600000;
        long j14 = 0;
        long j15 = -1;
        int i10 = 102;
        int i11 = Integer.MAX_VALUE;
        float f10 = 0.0f;
        boolean z9 = false;
        int i12 = 0;
        int i13 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < A) {
            int r9 = i2.b.r(parcel);
            switch (i2.b.j(r9)) {
                case 1:
                    i10 = i2.b.t(parcel2, r9);
                    break;
                case 2:
                    j12 = i2.b.w(parcel2, r9);
                    break;
                case 3:
                    j13 = i2.b.w(parcel2, r9);
                    break;
                case 5:
                    j10 = i2.b.w(parcel2, r9);
                    break;
                case 6:
                    i11 = i2.b.t(parcel2, r9);
                    break;
                case 7:
                    f10 = i2.b.p(parcel2, r9);
                    break;
                case 8:
                    j14 = i2.b.w(parcel2, r9);
                    break;
                case 9:
                    z9 = i2.b.k(parcel2, r9);
                    break;
                case 10:
                    j11 = i2.b.w(parcel2, r9);
                    break;
                case 11:
                    j15 = i2.b.w(parcel2, r9);
                    break;
                case 12:
                    i12 = i2.b.t(parcel2, r9);
                    break;
                case 13:
                    i13 = i2.b.t(parcel2, r9);
                    break;
                case 14:
                    str = i2.b.e(parcel2, r9);
                    break;
                case 15:
                    z10 = i2.b.k(parcel2, r9);
                    break;
                case 16:
                    workSource = (WorkSource) i2.b.d(parcel2, r9, WorkSource.CREATOR);
                    break;
                case 17:
                    b0Var = (b0) i2.b.d(parcel2, r9, b0.CREATOR);
                    break;
                default:
                    i2.b.z(parcel2, r9);
                    break;
            }
        }
        i2.b.i(parcel2, A);
        return new LocationRequest(i10, j12, j13, j14, j10, j11, i11, f10, z9, j15, i12, i13, str, z10, workSource, b0Var);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationRequest[i10];
    }
}
