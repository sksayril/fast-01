package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityManager;

public final class c {

    static class a {
        static boolean a(AccessibilityManager accessibilityManager, b bVar) {
            return accessibilityManager.addTouchExplorationStateChangeListener(new C0032c(bVar));
        }

        static boolean b(AccessibilityManager accessibilityManager, b bVar) {
            return accessibilityManager.removeTouchExplorationStateChangeListener(new C0032c(bVar));
        }
    }

    public interface b {
        void onTouchExplorationStateChanged(boolean z9);
    }

    /* renamed from: androidx.core.view.accessibility.c$c  reason: collision with other inner class name */
    private static final class C0032c implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final b f1687a;

        C0032c(b bVar) {
            this.f1687a = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0032c)) {
                return false;
            }
            return this.f1687a.equals(((C0032c) obj).f1687a);
        }

        public int hashCode() {
            return this.f1687a.hashCode();
        }

        public void onTouchExplorationStateChanged(boolean z9) {
            this.f1687a.onTouchExplorationStateChanged(z9);
        }
    }

    public static boolean a(AccessibilityManager accessibilityManager, b bVar) {
        return a.a(accessibilityManager, bVar);
    }

    public static boolean b(AccessibilityManager accessibilityManager, b bVar) {
        return a.b(accessibilityManager, bVar);
    }
}
