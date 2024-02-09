package n6;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;

public final class a {

    /* renamed from: i  reason: collision with root package name */
    private static final String f11321i = "a";

    /* renamed from: j  reason: collision with root package name */
    private static final Collection<String> f11322j;

    /* renamed from: a  reason: collision with root package name */
    private boolean f11323a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public boolean f11324b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f11325c;

    /* renamed from: d  reason: collision with root package name */
    private final Camera f11326d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Handler f11327e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f11328f = 1;

    /* renamed from: g  reason: collision with root package name */
    private final Handler.Callback f11329g;

    /* renamed from: h  reason: collision with root package name */
    private final Camera.AutoFocusCallback f11330h;

    /* renamed from: n6.a$a  reason: collision with other inner class name */
    class C0188a implements Handler.Callback {
        C0188a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != a.this.f11328f) {
                return false;
            }
            a.this.h();
            return true;
        }
    }

    class b implements Camera.AutoFocusCallback {
        b() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b() {
            boolean unused = a.this.f11324b = false;
            a.this.f();
        }

        public void onAutoFocus(boolean z9, Camera camera) {
            a.this.f11327e.post(new b(this));
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        f11322j = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public a(Camera camera, i iVar) {
        boolean z9 = true;
        C0188a aVar = new C0188a();
        this.f11329g = aVar;
        this.f11330h = new b();
        this.f11327e = new Handler(aVar);
        this.f11326d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        z9 = (!iVar.c() || !f11322j.contains(focusMode)) ? false : z9;
        this.f11325c = z9;
        String str = f11321i;
        Log.i(str, "Current focus mode '" + focusMode + "'; use auto focus? " + z9);
        i();
    }

    /* access modifiers changed from: private */
    public synchronized void f() {
        if (!this.f11323a && !this.f11327e.hasMessages(this.f11328f)) {
            Handler handler = this.f11327e;
            handler.sendMessageDelayed(handler.obtainMessage(this.f11328f), 2000);
        }
    }

    private void g() {
        this.f11327e.removeMessages(this.f11328f);
    }

    /* access modifiers changed from: private */
    public void h() {
        if (this.f11325c && !this.f11323a && !this.f11324b) {
            try {
                this.f11326d.autoFocus(this.f11330h);
                this.f11324b = true;
            } catch (RuntimeException e10) {
                Log.w(f11321i, "Unexpected exception while focusing", e10);
                f();
            }
        }
    }

    public void i() {
        this.f11323a = false;
        h();
    }

    public void j() {
        this.f11323a = true;
        this.f11324b = false;
        g();
        if (this.f11325c) {
            try {
                this.f11326d.cancelAutoFocus();
            } catch (RuntimeException e10) {
                Log.w(f11321i, "Unexpected exception while cancelling focusing", e10);
            }
        }
    }
}
