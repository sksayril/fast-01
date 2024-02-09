package k1;

import android.os.Handler;
import android.os.Looper;
import k7.k;
import kotlin.jvm.internal.l;

final class d implements k.d {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f10926a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    private final k.d f10927b;

    public d(k.d dVar) {
        l.e(dVar, "result");
        this.f10927b = dVar;
    }

    /* access modifiers changed from: private */
    public static final void g(d dVar, String str, String str2, Object obj) {
        l.e(dVar, "this$0");
        l.e(str, "$errorCode");
        dVar.f10927b.b(str, str2, obj);
    }

    /* access modifiers changed from: private */
    public static final void h(d dVar) {
        l.e(dVar, "this$0");
        dVar.f10927b.c();
    }

    /* access modifiers changed from: private */
    public static final void i(d dVar, Object obj) {
        l.e(dVar, "this$0");
        dVar.f10927b.a(obj);
    }

    public void a(Object obj) {
        this.f10926a.post(new b(this, obj));
    }

    public void b(String str, String str2, Object obj) {
        l.e(str, "errorCode");
        this.f10926a.post(new c(this, str, str2, obj));
    }

    public void c() {
        this.f10926a.post(new a(this));
    }
}
