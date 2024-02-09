package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.w6;
import com.google.android.gms.internal.measurement.y6;

public abstract class y6<MessageType extends w6<MessageType, BuilderType>, BuilderType extends y6<MessageType, BuilderType>> implements ga {
    public abstract /* synthetic */ Object clone();

    public final /* synthetic */ ga m(byte[] bArr) {
        return n(bArr, 0, bArr.length);
    }

    public abstract BuilderType n(byte[] bArr, int i10, int i11);

    public final /* synthetic */ ga o(byte[] bArr, c8 c8Var) {
        return p(bArr, 0, bArr.length, c8Var);
    }

    public abstract BuilderType p(byte[] bArr, int i10, int i11, c8 c8Var);
}
