package androidx.loader.app;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import androidx.lifecycle.l;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p.h;

class b extends a {

    /* renamed from: c  reason: collision with root package name */
    static boolean f2801c = false;

    /* renamed from: a  reason: collision with root package name */
    private final l f2802a;

    /* renamed from: b  reason: collision with root package name */
    private final C0055b f2803b;

    public static class a<D> extends q<D> {

        /* renamed from: l  reason: collision with root package name */
        private final int f2804l;

        /* renamed from: m  reason: collision with root package name */
        private final Bundle f2805m;

        /* renamed from: n  reason: collision with root package name */
        private l f2806n;

        /* access modifiers changed from: protected */
        public void f() {
            if (b.f2801c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            throw null;
        }

        /* access modifiers changed from: protected */
        public void g() {
            if (b.f2801c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            throw null;
        }

        public void h(r<? super D> rVar) {
            super.h(rVar);
            this.f2806n = null;
        }

        public void i(D d10) {
            super.i(d10);
        }

        /* access modifiers changed from: package-private */
        public k0.a<D> j(boolean z9) {
            if (b.f2801c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            throw null;
        }

        public void k(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f2804l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f2805m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void l() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f2804l);
            sb.append(" : ");
            androidx.core.util.b.a((Object) null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: androidx.loader.app.b$b  reason: collision with other inner class name */
    static class C0055b extends b0 {

        /* renamed from: f  reason: collision with root package name */
        private static final c0.b f2807f = new a();

        /* renamed from: d  reason: collision with root package name */
        private h<a> f2808d = new h<>();

        /* renamed from: e  reason: collision with root package name */
        private boolean f2809e = false;

        /* renamed from: androidx.loader.app.b$b$a */
        static class a implements c0.b {
            a() {
            }

            public <T extends b0> T a(Class<T> cls) {
                return new C0055b();
            }

            public /* synthetic */ b0 b(Class cls, j0.a aVar) {
                return d0.b(this, cls, aVar);
            }
        }

        C0055b() {
        }

        static C0055b f(f0 f0Var) {
            return (C0055b) new c0(f0Var, f2807f).a(C0055b.class);
        }

        /* access modifiers changed from: protected */
        public void d() {
            super.d();
            int p10 = this.f2808d.p();
            for (int i10 = 0; i10 < p10; i10++) {
                this.f2808d.q(i10).j(true);
            }
            this.f2808d.d();
        }

        public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f2808d.p() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.f2808d.p(); i10++) {
                    a q9 = this.f2808d.q(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f2808d.k(i10));
                    printWriter.print(": ");
                    printWriter.println(q9.toString());
                    q9.k(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void g() {
            int p10 = this.f2808d.p();
            for (int i10 = 0; i10 < p10; i10++) {
                this.f2808d.q(i10).l();
            }
        }
    }

    b(l lVar, f0 f0Var) {
        this.f2802a = lVar;
        this.f2803b = C0055b.f(f0Var);
    }

    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f2803b.e(str, fileDescriptor, printWriter, strArr);
    }

    public void c() {
        this.f2803b.g();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        androidx.core.util.b.a(this.f2802a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
