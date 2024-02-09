package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

class e {

    /* renamed from: e  reason: collision with root package name */
    private static e f7055e;

    /* renamed from: a  reason: collision with root package name */
    private final Object f7056a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Handler f7057b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c  reason: collision with root package name */
    private c f7058c;

    /* renamed from: d  reason: collision with root package name */
    private c f7059d;

    class a implements Handler.Callback {
        a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            e.this.c((c) message.obj);
            return true;
        }
    }

    interface b {
        void a(int i10);
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        final WeakReference<b> f7061a;

        /* renamed from: b  reason: collision with root package name */
        int f7062b;

        /* renamed from: c  reason: collision with root package name */
        boolean f7063c;

        /* access modifiers changed from: package-private */
        public boolean a(b bVar) {
            return bVar != null && this.f7061a.get() == bVar;
        }
    }

    private e() {
    }

    private boolean a(c cVar, int i10) {
        b bVar = (b) cVar.f7061a.get();
        if (bVar == null) {
            return false;
        }
        this.f7057b.removeCallbacksAndMessages(cVar);
        bVar.a(i10);
        return true;
    }

    static e b() {
        if (f7055e == null) {
            f7055e = new e();
        }
        return f7055e;
    }

    private boolean d(b bVar) {
        c cVar = this.f7058c;
        return cVar != null && cVar.a(bVar);
    }

    private void g(c cVar) {
        int i10 = cVar.f7062b;
        if (i10 != -2) {
            if (i10 <= 0) {
                i10 = i10 == -1 ? 1500 : 2750;
            }
            this.f7057b.removeCallbacksAndMessages(cVar);
            Handler handler = this.f7057b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void c(c cVar) {
        synchronized (this.f7056a) {
            if (this.f7058c == cVar || this.f7059d == cVar) {
                a(cVar, 2);
            }
        }
    }

    public void e(b bVar) {
        synchronized (this.f7056a) {
            if (d(bVar)) {
                c cVar = this.f7058c;
                if (!cVar.f7063c) {
                    cVar.f7063c = true;
                    this.f7057b.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    public void f(b bVar) {
        synchronized (this.f7056a) {
            if (d(bVar)) {
                c cVar = this.f7058c;
                if (cVar.f7063c) {
                    cVar.f7063c = false;
                    g(cVar);
                }
            }
        }
    }
}
