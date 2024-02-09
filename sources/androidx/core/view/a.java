package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.d;
import androidx.core.view.accessibility.e;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

public class a {

    /* renamed from: c  reason: collision with root package name */
    private static final View.AccessibilityDelegate f1680c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    private final View.AccessibilityDelegate f1681a;

    /* renamed from: b  reason: collision with root package name */
    private final View.AccessibilityDelegate f1682b;

    /* renamed from: androidx.core.view.a$a  reason: collision with other inner class name */
    static final class C0031a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        final a f1683a;

        C0031a(a aVar) {
            this.f1683a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f1683a.a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            e b10 = this.f1683a.b(view);
            if (b10 != null) {
                return (AccessibilityNodeProvider) b10.a();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f1683a.f(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            d U = d.U(accessibilityNodeInfo);
            U.Q(x.S(view));
            U.O(x.N(view));
            U.P(x.o(view));
            U.S(x.G(view));
            this.f1683a.g(view, U);
            U.d(accessibilityNodeInfo.getText(), view);
            List<d.a> c10 = a.c(view);
            for (int i10 = 0; i10 < c10.size(); i10++) {
                U.b(c10.get(i10));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f1683a.h(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f1683a.i(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f1683a.j(view, i10, bundle);
        }

        public void sendAccessibilityEvent(View view, int i10) {
            this.f1683a.l(view, i10);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f1683a.m(view, accessibilityEvent);
        }
    }

    static class b {
        static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i10, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i10, bundle);
        }
    }

    public a() {
        this(f1680c);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f1681a = accessibilityDelegate;
        this.f1682b = new C0031a(this);
    }

    static List<d.a> c(View view) {
        List<d.a> list = (List) view.getTag(r.e.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] l10 = d.l(view.createAccessibilityNodeInfo().getText());
            int i10 = 0;
            while (l10 != null && i10 < l10.length) {
                if (clickableSpan.equals(l10[i10])) {
                    return true;
                }
                i10++;
            }
        }
        return false;
    }

    private boolean k(int i10, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(r.e.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i10)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1681a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public e b(View view) {
        AccessibilityNodeProvider a10 = b.a(this.f1681a, view);
        if (a10 != null) {
            return new e(a10);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View.AccessibilityDelegate d() {
        return this.f1682b;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f1681a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, d dVar) {
        this.f1681a.onInitializeAccessibilityNodeInfo(view, dVar.T());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f1681a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1681a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i10, Bundle bundle) {
        List<d.a> c10 = c(view);
        boolean z9 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= c10.size()) {
                break;
            }
            d.a aVar = c10.get(i11);
            if (aVar.a() == i10) {
                z9 = aVar.c(view, bundle);
                break;
            }
            i11++;
        }
        if (!z9) {
            z9 = b.b(this.f1681a, view, i10, bundle);
        }
        return (z9 || i10 != r.e.accessibility_action_clickable_span || bundle == null) ? z9 : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void l(View view, int i10) {
        this.f1681a.sendAccessibilityEvent(view, i10);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f1681a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
