package h2;

import android.content.Context;
import android.util.SparseIntArray;
import e2.f;
import f2.a;

public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    private final SparseIntArray f9199a = new SparseIntArray();

    /* renamed from: b  reason: collision with root package name */
    private f f9200b;

    public i0(f fVar) {
        p.j(fVar);
        this.f9200b = fVar;
    }

    public final int a(Context context, int i10) {
        return this.f9199a.get(i10, -1);
    }

    public final int b(Context context, a.f fVar) {
        p.j(context);
        p.j(fVar);
        int i10 = 0;
        if (!fVar.f()) {
            return 0;
        }
        int g10 = fVar.g();
        int a10 = a(context, g10);
        if (a10 == -1) {
            int i11 = 0;
            while (true) {
                if (i11 >= this.f9199a.size()) {
                    i10 = -1;
                    break;
                }
                int keyAt = this.f9199a.keyAt(i11);
                if (keyAt > g10 && this.f9199a.get(keyAt) == 0) {
                    break;
                }
                i11++;
            }
            a10 = i10 == -1 ? this.f9200b.h(context, g10) : i10;
            this.f9199a.put(g10, a10);
        }
        return a10;
    }

    public final void c() {
        this.f9199a.clear();
    }
}
