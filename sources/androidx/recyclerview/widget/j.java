package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.d;

public class j extends androidx.core.view.a {

    /* renamed from: d  reason: collision with root package name */
    final i f3206d;

    /* renamed from: e  reason: collision with root package name */
    final androidx.core.view.a f3207e = new a(this);

    public static class a extends androidx.core.view.a {

        /* renamed from: d  reason: collision with root package name */
        final j f3208d;

        public a(j jVar) {
            this.f3208d = jVar;
        }

        public void g(View view, d dVar) {
            super.g(view, dVar);
            if (!this.f3208d.n() && this.f3208d.f3206d.getLayoutManager() != null) {
                this.f3208d.f3206d.getLayoutManager().d0(view, dVar);
            }
        }

        public boolean j(View view, int i10, Bundle bundle) {
            if (super.j(view, i10, bundle)) {
                return true;
            }
            if (this.f3208d.n() || this.f3208d.f3206d.getLayoutManager() == null) {
                return false;
            }
            return this.f3208d.f3206d.getLayoutManager().u0(view, i10, bundle);
        }
    }

    public j(i iVar) {
        this.f3206d = iVar;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        accessibilityEvent.setClassName(i.class.getName());
        if ((view instanceof i) && !n()) {
            i iVar = (i) view;
            if (iVar.getLayoutManager() != null) {
                iVar.getLayoutManager().Z(accessibilityEvent);
            }
        }
    }

    public void g(View view, d dVar) {
        super.g(view, dVar);
        dVar.L(i.class.getName());
        if (!n() && this.f3206d.getLayoutManager() != null) {
            this.f3206d.getLayoutManager().b0(dVar);
        }
    }

    public boolean j(View view, int i10, Bundle bundle) {
        if (super.j(view, i10, bundle)) {
            return true;
        }
        if (n() || this.f3206d.getLayoutManager() == null) {
            return false;
        }
        return this.f3206d.getLayoutManager().s0(i10, bundle);
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        return this.f3206d.N();
    }
}
