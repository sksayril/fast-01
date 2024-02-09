package w8;

import h8.b0;
import java.util.NoSuchElementException;

public final class e extends b0 {

    /* renamed from: m  reason: collision with root package name */
    private final long f13016m;

    /* renamed from: n  reason: collision with root package name */
    private final long f13017n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13018o;

    /* renamed from: p  reason: collision with root package name */
    private long f13019p;

    public e(long j10, long j11, long j12) {
        this.f13016m = j12;
        this.f13017n = j11;
        boolean z9 = true;
        int i10 = (j12 > 0 ? 1 : (j12 == 0 ? 0 : -1));
        int i11 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        if (i10 <= 0 ? i11 < 0 : i11 > 0) {
            z9 = false;
        }
        this.f13018o = z9;
        this.f13019p = !z9 ? j11 : j10;
    }

    public long b() {
        long j10 = this.f13019p;
        if (j10 != this.f13017n) {
            this.f13019p = this.f13016m + j10;
        } else if (this.f13018o) {
            this.f13018o = false;
        } else {
            throw new NoSuchElementException();
        }
        return j10;
    }

    public boolean hasNext() {
        return this.f13018o;
    }
}
