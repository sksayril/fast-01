package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import p.g;

public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    private final e f1789a;

    private static class a extends e {

        /* renamed from: a  reason: collision with root package name */
        protected final Window f1790a;

        /* renamed from: b  reason: collision with root package name */
        private final View f1791b;

        a(Window window, View view) {
            this.f1790a = window;
            this.f1791b = view;
        }

        /* access modifiers changed from: protected */
        public void c(int i10) {
            View decorView = this.f1790a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        public void d(int i10) {
            this.f1790a.addFlags(i10);
        }

        /* access modifiers changed from: protected */
        public void e(int i10) {
            View decorView = this.f1790a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        public void f(int i10) {
            this.f1790a.clearFlags(i10);
        }
    }

    private static class b extends a {
        b(Window window, View view) {
            super(window, view);
        }

        public void b(boolean z9) {
            if (z9) {
                f(67108864);
                d(Integer.MIN_VALUE);
                c(8192);
                return;
            }
            e(8192);
        }
    }

    private static class c extends b {
        c(Window window, View view) {
            super(window, view);
        }

        public void a(boolean z9) {
            if (z9) {
                f(134217728);
                d(Integer.MIN_VALUE);
                c(16);
                return;
            }
            e(16);
        }
    }

    private static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        final i0 f1792a;

        /* renamed from: b  reason: collision with root package name */
        final WindowInsetsController f1793b;

        /* renamed from: c  reason: collision with root package name */
        private final g<Object, WindowInsetsController.OnControllableInsetsChangedListener> f1794c;

        /* renamed from: d  reason: collision with root package name */
        protected Window f1795d;

        d(Window window, i0 i0Var) {
            this(window.getInsetsController(), i0Var);
            this.f1795d = window;
        }

        d(WindowInsetsController windowInsetsController, i0 i0Var) {
            this.f1794c = new g<>();
            this.f1793b = windowInsetsController;
            this.f1792a = i0Var;
        }

        public void a(boolean z9) {
            if (z9) {
                if (this.f1795d != null) {
                    c(16);
                }
                this.f1793b.setSystemBarsAppearance(16, 16);
                return;
            }
            if (this.f1795d != null) {
                d(16);
            }
            this.f1793b.setSystemBarsAppearance(0, 16);
        }

        public void b(boolean z9) {
            if (z9) {
                if (this.f1795d != null) {
                    c(8192);
                }
                this.f1793b.setSystemBarsAppearance(8, 8);
                return;
            }
            if (this.f1795d != null) {
                d(8192);
            }
            this.f1793b.setSystemBarsAppearance(0, 8);
        }

        /* access modifiers changed from: protected */
        public void c(int i10) {
            View decorView = this.f1795d.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        public void d(int i10) {
            View decorView = this.f1795d.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }
    }

    private static class e {
        e() {
        }

        public void a(boolean z9) {
        }

        public void b(boolean z9) {
        }
    }

    public i0(Window window, View view) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f1789a = new d(window, this);
        } else {
            this.f1789a = i10 >= 26 ? new c(window, view) : i10 >= 23 ? new b(window, view) : new a(window, view);
        }
    }

    public void a(boolean z9) {
        this.f1789a.a(z9);
    }

    public void b(boolean z9) {
        this.f1789a.b(z9);
    }
}
