package n9;

import android.media.MediaDataSource;
import kotlin.jvm.internal.l;

public final class o extends MediaDataSource {

    /* renamed from: m  reason: collision with root package name */
    private final byte[] f11454m;

    public o(byte[] bArr) {
        l.e(bArr, "data");
        this.f11454m = bArr;
    }

    private final int a(int i10, long j10) {
        long j11 = (long) i10;
        long j12 = j10 + j11;
        byte[] bArr = this.f11454m;
        if (j12 > ((long) bArr.length)) {
            j11 -= j12 - ((long) bArr.length);
        }
        return (int) j11;
    }

    public synchronized void close() {
    }

    public synchronized long getSize() {
        return (long) this.f11454m.length;
    }

    public synchronized int readAt(long j10, byte[] bArr, int i10, int i11) {
        l.e(bArr, "buffer");
        if (j10 >= ((long) this.f11454m.length)) {
            return -1;
        }
        int a10 = a(i11, j10);
        System.arraycopy(this.f11454m, (int) j10, bArr, i10, a10);
        return a10;
    }
}
