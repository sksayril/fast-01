package h2;

import android.content.Intent;
import g2.f;

final class e0 extends f0 {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ Intent f9164m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ f f9165n;

    e0(Intent intent, f fVar, int i10) {
        this.f9164m = intent;
        this.f9165n = fVar;
    }

    public final void a() {
        Intent intent = this.f9164m;
        if (intent != null) {
            this.f9165n.startActivityForResult(intent, 2);
        }
    }
}
