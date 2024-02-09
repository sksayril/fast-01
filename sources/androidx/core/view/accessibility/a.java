package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class a extends ClickableSpan {

    /* renamed from: m  reason: collision with root package name */
    private final int f1684m;

    /* renamed from: n  reason: collision with root package name */
    private final d f1685n;

    /* renamed from: o  reason: collision with root package name */
    private final int f1686o;

    public a(int i10, d dVar, int i11) {
        this.f1684m = i10;
        this.f1685n = dVar;
        this.f1686o = i11;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f1684m);
        this.f1685n.G(this.f1686o, bundle);
    }
}
