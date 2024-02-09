package com.amazonaws.mobileconnectors.s3.transferutility;

import java.io.Serializable;

public class TransferUtilityOptions implements Serializable {
    @Deprecated

    /* renamed from: m  reason: collision with root package name */
    private long f4211m = a();

    /* renamed from: n  reason: collision with root package name */
    private int f4212n = b();

    /* renamed from: o  reason: collision with root package name */
    private TransferNetworkConnectionType f4213o = c();

    @Deprecated
    static long a() {
        return 60000;
    }

    static int b() {
        return (Runtime.getRuntime().availableProcessors() + 1) * 2;
    }

    static TransferNetworkConnectionType c() {
        return TransferNetworkConnectionType.ANY;
    }

    public TransferNetworkConnectionType d() {
        return this.f4213o;
    }

    public int e() {
        return this.f4212n;
    }

    public void f(int i10) {
        if (i10 < 0) {
            i10 = b();
        }
        this.f4212n = i10;
    }
}
