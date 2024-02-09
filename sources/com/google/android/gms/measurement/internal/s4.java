package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.w0;
import com.google.android.gms.internal.measurement.y0;
import java.util.ArrayList;
import java.util.List;

public final class s4 extends w0 implements q4 {
    s4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final void G2(e eVar, sc scVar) {
        Parcel B = B();
        y0.d(B, eVar);
        y0.d(B, scVar);
        Y(12, B);
    }

    public final void I2(nc ncVar, sc scVar) {
        Parcel B = B();
        y0.d(B, ncVar);
        y0.d(B, scVar);
        Y(2, B);
    }

    public final String K1(sc scVar) {
        Parcel B = B();
        y0.d(B, scVar);
        Parcel J = J(11, B);
        String readString = J.readString();
        J.recycle();
        return readString;
    }

    public final void P1(i0 i0Var, String str, String str2) {
        Parcel B = B();
        y0.d(B, i0Var);
        B.writeString(str);
        B.writeString(str2);
        Y(5, B);
    }

    public final n T0(sc scVar) {
        Parcel B = B();
        y0.d(B, scVar);
        Parcel J = J(21, B);
        n nVar = (n) y0.a(J, n.CREATOR);
        J.recycle();
        return nVar;
    }

    public final List<nc> V0(String str, String str2, String str3, boolean z9) {
        Parcel B = B();
        B.writeString(str);
        B.writeString(str2);
        B.writeString(str3);
        y0.e(B, z9);
        Parcel J = J(15, B);
        ArrayList<nc> createTypedArrayList = J.createTypedArrayList(nc.CREATOR);
        J.recycle();
        return createTypedArrayList;
    }

    public final void a2(i0 i0Var, sc scVar) {
        Parcel B = B();
        y0.d(B, i0Var);
        y0.d(B, scVar);
        Y(1, B);
    }

    public final void b1(sc scVar) {
        Parcel B = B();
        y0.d(B, scVar);
        Y(20, B);
    }

    public final List<e> c0(String str, String str2, sc scVar) {
        Parcel B = B();
        B.writeString(str);
        B.writeString(str2);
        y0.d(B, scVar);
        Parcel J = J(16, B);
        ArrayList<e> createTypedArrayList = J.createTypedArrayList(e.CREATOR);
        J.recycle();
        return createTypedArrayList;
    }

    public final void c1(Bundle bundle, sc scVar) {
        Parcel B = B();
        y0.d(B, bundle);
        y0.d(B, scVar);
        Y(19, B);
    }

    public final void d1(sc scVar) {
        Parcel B = B();
        y0.d(B, scVar);
        Y(6, B);
    }

    public final List<rb> d2(sc scVar, Bundle bundle) {
        Parcel B = B();
        y0.d(B, scVar);
        y0.d(B, bundle);
        Parcel J = J(24, B);
        ArrayList<rb> createTypedArrayList = J.createTypedArrayList(rb.CREATOR);
        J.recycle();
        return createTypedArrayList;
    }

    public final void l0(sc scVar) {
        Parcel B = B();
        y0.d(B, scVar);
        Y(18, B);
    }

    public final void s2(long j10, String str, String str2, String str3) {
        Parcel B = B();
        B.writeLong(j10);
        B.writeString(str);
        B.writeString(str2);
        B.writeString(str3);
        Y(10, B);
    }

    public final List<nc> u1(String str, String str2, boolean z9, sc scVar) {
        Parcel B = B();
        B.writeString(str);
        B.writeString(str2);
        y0.e(B, z9);
        y0.d(B, scVar);
        Parcel J = J(14, B);
        ArrayList<nc> createTypedArrayList = J.createTypedArrayList(nc.CREATOR);
        J.recycle();
        return createTypedArrayList;
    }

    public final byte[] v2(i0 i0Var, String str) {
        Parcel B = B();
        y0.d(B, i0Var);
        B.writeString(str);
        Parcel J = J(9, B);
        byte[] createByteArray = J.createByteArray();
        J.recycle();
        return createByteArray;
    }

    public final void x0(e eVar) {
        Parcel B = B();
        y0.d(B, eVar);
        Y(13, B);
    }

    public final void y2(sc scVar) {
        Parcel B = B();
        y0.d(B, scVar);
        Y(4, B);
    }

    public final List<e> z2(String str, String str2, String str3) {
        Parcel B = B();
        B.writeString(str);
        B.writeString(str2);
        B.writeString(str3);
        Parcel J = J(17, B);
        ArrayList<e> createTypedArrayList = J.createTypedArrayList(e.CREATOR);
        J.recycle();
        return createTypedArrayList;
    }
}
