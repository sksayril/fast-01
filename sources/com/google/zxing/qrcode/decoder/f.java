package com.google.zxing.qrcode.decoder;

public enum f {
    L(1),
    M(0),
    Q(3),
    H(2);
    
    private static final f[] FOR_BITS = null;
    private final int bits;

    static {
        f fVar;
        f fVar2;
        f fVar3;
        f fVar4;
        FOR_BITS = new f[]{fVar2, fVar, fVar4, fVar3};
    }

    private f(int i10) {
        this.bits = i10;
    }

    public static f forBits(int i10) {
        if (i10 >= 0) {
            f[] fVarArr = FOR_BITS;
            if (i10 < fVarArr.length) {
                return fVarArr[i10];
            }
        }
        throw new IllegalArgumentException();
    }

    public int getBits() {
        return this.bits;
    }
}
