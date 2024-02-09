package io.flutter.plugins.camera;

import android.os.Handler;
import android.text.TextUtils;
import io.flutter.embedding.engine.systemchannels.j;
import java.util.HashMap;
import java.util.Map;
import k7.k;

public class h0 {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f10181a;

    /* renamed from: b  reason: collision with root package name */
    k f10182b;

    /* renamed from: c  reason: collision with root package name */
    k f10183c;

    class a extends HashMap<String, Object> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ j.f f10184m;

        a(j.f fVar) {
            this.f10184m = fVar;
            put("orientation", d0.d(fVar));
        }
    }

    class b extends HashMap<String, Object> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Integer f10186m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Integer f10187n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ p7.b f10188o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ o7.b f10189p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ Boolean f10190q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ Boolean f10191r;

        b(Integer num, Integer num2, p7.b bVar, o7.b bVar2, Boolean bool, Boolean bool2) {
            this.f10186m = num;
            this.f10187n = num2;
            this.f10188o = bVar;
            this.f10189p = bVar2;
            this.f10190q = bool;
            this.f10191r = bool2;
            put("previewWidth", Double.valueOf(num.doubleValue()));
            put("previewHeight", Double.valueOf(num2.doubleValue()));
            put("exposureMode", bVar.toString());
            put("focusMode", bVar2.toString());
            put("exposurePointSupported", bool);
            put("focusPointSupported", bool2);
        }
    }

    class c extends HashMap<String, Object> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f10193m;

        c(String str) {
            this.f10193m = str;
            if (!TextUtils.isEmpty(str)) {
                put("description", str);
            }
        }
    }

    class d implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ e f10195m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Map f10196n;

        d(e eVar, Map map) {
            this.f10195m = eVar;
            this.f10196n = map;
        }

        public void run() {
            h0.this.f10182b.c(this.f10195m.method, this.f10196n);
        }
    }

    enum e {
        ERROR("error"),
        CLOSING("camera_closing"),
        INITIALIZED("initialized");
        
        final String method;

        private e(String str) {
            this.method = str;
        }
    }

    enum f {
        ORIENTATION_CHANGED("orientation_changed");
        
        final String method;

        private f(String str) {
            this.method = str;
        }
    }

    h0(k7.c cVar, long j10, Handler handler) {
        this.f10182b = new k(cVar, "plugins.flutter.io/camera_android/camera" + j10);
        this.f10183c = new k(cVar, "plugins.flutter.io/camera_android/fromPlatform");
        this.f10181a = handler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h(f fVar, Map map) {
        this.f10183c.c(fVar.method, map);
    }

    private void i(e eVar) {
        j(eVar, new HashMap());
    }

    private void j(e eVar, Map<String, Object> map) {
        if (this.f10182b != null) {
            this.f10181a.post(new d(eVar, map));
        }
    }

    private void k(f fVar, Map<String, Object> map) {
        if (this.f10183c != null) {
            this.f10181a.post(new e0(this, fVar, map));
        }
    }

    public void d(k.d dVar, String str, String str2, Object obj) {
        this.f10181a.post(new g0(dVar, str, str2, obj));
    }

    public void e(k.d dVar, Object obj) {
        this.f10181a.post(new f0(dVar, obj));
    }

    /* access modifiers changed from: package-private */
    public void l() {
        i(e.CLOSING);
    }

    /* access modifiers changed from: package-private */
    public void m(String str) {
        j(e.ERROR, new c(str));
    }

    /* access modifiers changed from: package-private */
    public void n(Integer num, Integer num2, p7.b bVar, o7.b bVar2, Boolean bool, Boolean bool2) {
        j(e.INITIALIZED, new b(num, num2, bVar, bVar2, bool, bool2));
    }

    public void o(j.f fVar) {
        k(f.ORIENTATION_CHANGED, new a(fVar));
    }
}
