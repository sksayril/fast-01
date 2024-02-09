package j;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.d0;
import androidx.core.view.e0;
import androidx.core.view.f0;
import java.util.ArrayList;
import java.util.Iterator;

public class h {

    /* renamed from: a  reason: collision with root package name */
    final ArrayList<d0> f10777a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private long f10778b = -1;

    /* renamed from: c  reason: collision with root package name */
    private Interpolator f10779c;

    /* renamed from: d  reason: collision with root package name */
    e0 f10780d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f10781e;

    /* renamed from: f  reason: collision with root package name */
    private final f0 f10782f = new a();

    class a extends f0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f10783a = false;

        /* renamed from: b  reason: collision with root package name */
        private int f10784b = 0;

        a() {
        }

        public void b(View view) {
            int i10 = this.f10784b + 1;
            this.f10784b = i10;
            if (i10 == h.this.f10777a.size()) {
                e0 e0Var = h.this.f10780d;
                if (e0Var != null) {
                    e0Var.b((View) null);
                }
                d();
            }
        }

        public void c(View view) {
            if (!this.f10783a) {
                this.f10783a = true;
                e0 e0Var = h.this.f10780d;
                if (e0Var != null) {
                    e0Var.c((View) null);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f10784b = 0;
            this.f10783a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f10781e) {
            Iterator<d0> it = this.f10777a.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            this.f10781e = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f10781e = false;
    }

    public h c(d0 d0Var) {
        if (!this.f10781e) {
            this.f10777a.add(d0Var);
        }
        return this;
    }

    public h d(d0 d0Var, d0 d0Var2) {
        this.f10777a.add(d0Var);
        d0Var2.j(d0Var.d());
        this.f10777a.add(d0Var2);
        return this;
    }

    public h e(long j10) {
        if (!this.f10781e) {
            this.f10778b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f10781e) {
            this.f10779c = interpolator;
        }
        return this;
    }

    public h g(e0 e0Var) {
        if (!this.f10781e) {
            this.f10780d = e0Var;
        }
        return this;
    }

    public void h() {
        if (!this.f10781e) {
            Iterator<d0> it = this.f10777a.iterator();
            while (it.hasNext()) {
                d0 next = it.next();
                long j10 = this.f10778b;
                if (j10 >= 0) {
                    next.f(j10);
                }
                Interpolator interpolator = this.f10779c;
                if (interpolator != null) {
                    next.g(interpolator);
                }
                if (this.f10780d != null) {
                    next.h(this.f10782f);
                }
                next.l();
            }
            this.f10781e = true;
        }
    }
}
