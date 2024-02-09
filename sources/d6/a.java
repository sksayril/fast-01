package d6;

import c6.k;
import o5.j;

public abstract class a extends k {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f8198a = new int[4];

    /* renamed from: b  reason: collision with root package name */
    private final int[] f8199b;

    /* renamed from: c  reason: collision with root package name */
    private final float[] f8200c;

    /* renamed from: d  reason: collision with root package name */
    private final float[] f8201d;

    /* renamed from: e  reason: collision with root package name */
    private final int[] f8202e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f8203f;

    protected a() {
        int[] iArr = new int[8];
        this.f8199b = iArr;
        this.f8200c = new float[4];
        this.f8201d = new float[4];
        this.f8202e = new int[(iArr.length / 2)];
        this.f8203f = new int[(iArr.length / 2)];
    }

    protected static void i(int[] iArr, float[] fArr) {
        int i10 = 0;
        float f10 = fArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            if (fArr[i11] < f10) {
                f10 = fArr[i11];
                i10 = i11;
            }
        }
        iArr[i10] = iArr[i10] - 1;
    }

    protected static void p(int[] iArr, float[] fArr) {
        int i10 = 0;
        float f10 = fArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            if (fArr[i11] > f10) {
                f10 = fArr[i11];
                i10 = i11;
            }
        }
        iArr[i10] = iArr[i10] + 1;
    }

    protected static boolean q(int[] iArr) {
        int i10 = iArr[0] + iArr[1];
        float f10 = ((float) i10) / ((float) ((iArr[2] + i10) + iArr[3]));
        if (f10 < 0.7916667f || f10 > 0.89285713f) {
            return false;
        }
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MIN_VALUE;
        for (int i13 : iArr) {
            if (i13 > i12) {
                i12 = i13;
            }
            if (i13 < i11) {
                i11 = i13;
            }
        }
        return i12 < i11 * 10;
    }

    protected static int r(int[] iArr, int[][] iArr2) {
        for (int i10 = 0; i10 < iArr2.length; i10++) {
            if (k.f(iArr, iArr2[i10], 0.45f) < 0.2f) {
                return i10;
            }
        }
        throw j.a();
    }

    /* access modifiers changed from: protected */
    public final int[] j() {
        return this.f8199b;
    }

    /* access modifiers changed from: protected */
    public final int[] k() {
        return this.f8198a;
    }

    /* access modifiers changed from: protected */
    public final int[] l() {
        return this.f8203f;
    }

    /* access modifiers changed from: protected */
    public final float[] m() {
        return this.f8201d;
    }

    /* access modifiers changed from: protected */
    public final int[] n() {
        return this.f8202e;
    }

    /* access modifiers changed from: protected */
    public final float[] o() {
        return this.f8200c;
    }
}
