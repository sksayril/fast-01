package io.flutter.plugin.platform;

import android.content.Context;
import android.view.MotionEvent;
import io.flutter.embedding.android.g;

public class b extends g {

    /* renamed from: s  reason: collision with root package name */
    private a f10073s;

    public b(Context context, int i10, int i11, a aVar) {
        super(context, i10, i11, g.b.overlay);
        this.f10073s = aVar;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        a aVar = this.f10073s;
        if (aVar == null || !aVar.a(motionEvent, true)) {
            return super.onHoverEvent(motionEvent);
        }
        return true;
    }
}
