package p4;

import java.io.OutputStream;

final class b extends OutputStream {

    /* renamed from: m  reason: collision with root package name */
    private long f11878m = 0;

    b() {
    }

    /* access modifiers changed from: package-private */
    public long a() {
        return this.f11878m;
    }

    public void write(int i10) {
        this.f11878m++;
    }

    public void write(byte[] bArr) {
        this.f11878m += (long) bArr.length;
    }

    public void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) > bArr.length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f11878m += (long) i11;
    }
}
