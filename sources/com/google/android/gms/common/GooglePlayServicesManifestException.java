package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class GooglePlayServicesManifestException extends IllegalStateException {

    /* renamed from: m  reason: collision with root package name */
    private final int f4898m;

    public GooglePlayServicesManifestException(int i10, String str) {
        super(str);
        this.f4898m = i10;
    }
}
