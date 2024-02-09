package w8;

import h8.a0;
import java.util.NoSuchElementException;

public final class b extends a0 {

    /* renamed from: m  reason: collision with root package name */
    private final int f13006m;

    /* renamed from: n  reason: collision with root package name */
    private final int f13007n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13008o;

    /* renamed from: p  reason: collision with root package name */
    private int f13009p;

    public b(int i10, int i11, int i12) {
        this.f13006m = i12;
        this.f13007n = i11;
        boolean z9 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z9 = false;
        }
        this.f13008o = z9;
        this.f13009p = !z9 ? i11 : i10;
    }

    public int b() {
        int i10 = this.f13009p;
        if (i10 != this.f13007n) {
            this.f13009p = this.f13006m + i10;
        } else if (this.f13008o) {
            this.f13008o = false;
        } else {
            throw new NoSuchElementException();
        }
        return i10;
    }

    public boolean hasNext() {
        return this.f13008o;
    }
}
