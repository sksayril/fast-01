package com.google.zxing.qrcode.decoder;

import o5.p;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f7545a;

    i(boolean z9) {
        this.f7545a = z9;
    }

    public void a(p[] pVarArr) {
        if (this.f7545a && pVarArr != null && pVarArr.length >= 3) {
            p pVar = pVarArr[0];
            pVarArr[0] = pVarArr[2];
            pVarArr[2] = pVar;
        }
    }
}
