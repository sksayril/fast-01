package io.flutter.plugin.platform;

import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import io.flutter.view.c;

class a {

    /* renamed from: a  reason: collision with root package name */
    private c f10072a;

    a() {
    }

    public boolean a(MotionEvent motionEvent, boolean z9) {
        c cVar = this.f10072a;
        if (cVar == null) {
            return false;
        }
        return cVar.K(motionEvent, z9);
    }

    public boolean b(View view, View view2, AccessibilityEvent accessibilityEvent) {
        c cVar = this.f10072a;
        if (cVar == null) {
            return false;
        }
        return cVar.w(view, view2, accessibilityEvent);
    }

    /* access modifiers changed from: package-private */
    public void c(c cVar) {
        this.f10072a = cVar;
    }
}
