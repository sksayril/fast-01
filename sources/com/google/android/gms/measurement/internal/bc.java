package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

final class bc implements d5 {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f5902a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zb f5903b;

    bc(zb zbVar, String str) {
        this.f5903b = zbVar;
        this.f5902a = str;
    }

    public final void a(String str, int i10, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.f5903b.H(true, i10, th, bArr, this.f5902a);
    }
}
