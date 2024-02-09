package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class w0 implements IInterface {

    /* renamed from: c  reason: collision with root package name */
    private final IBinder f5676c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5677d;

    protected w0(IBinder iBinder, String str) {
        this.f5676c = iBinder;
        this.f5677d = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel B() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f5677d);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final Parcel J(int i10, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f5676c.transact(i10, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final void Y(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f5676c.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f5676c;
    }
}
