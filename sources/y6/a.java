package y6;

import android.content.res.AssetManager;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.FlutterCallbackInformation;
import java.nio.ByteBuffer;
import java.util.List;
import k7.c;
import k7.t;

public class a implements k7.c {

    /* renamed from: a  reason: collision with root package name */
    private final FlutterJNI f13268a;

    /* renamed from: b  reason: collision with root package name */
    private final AssetManager f13269b;

    /* renamed from: c  reason: collision with root package name */
    private final c f13270c;

    /* renamed from: d  reason: collision with root package name */
    private final k7.c f13271d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f13272e = false;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public String f13273f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public e f13274g;

    /* renamed from: h  reason: collision with root package name */
    private final c.a f13275h;

    /* renamed from: y6.a$a  reason: collision with other inner class name */
    class C0230a implements c.a {
        C0230a() {
        }

        public void a(ByteBuffer byteBuffer, c.b bVar) {
            String unused = a.this.f13273f = t.f11014b.b(byteBuffer);
            if (a.this.f13274g != null) {
                a.this.f13274g.a(a.this.f13273f);
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final AssetManager f13277a;

        /* renamed from: b  reason: collision with root package name */
        public final String f13278b;

        /* renamed from: c  reason: collision with root package name */
        public final FlutterCallbackInformation f13279c;

        public b(AssetManager assetManager, String str, FlutterCallbackInformation flutterCallbackInformation) {
            this.f13277a = assetManager;
            this.f13278b = str;
            this.f13279c = flutterCallbackInformation;
        }

        public String toString() {
            return "DartCallback( bundle path: " + this.f13278b + ", library path: " + this.f13279c.callbackLibraryPath + ", function: " + this.f13279c.callbackName + " )";
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f13280a;

        /* renamed from: b  reason: collision with root package name */
        public final String f13281b;

        /* renamed from: c  reason: collision with root package name */
        public final String f13282c;

        public c(String str, String str2) {
            this.f13280a = str;
            this.f13281b = null;
            this.f13282c = str2;
        }

        public c(String str, String str2, String str3) {
            this.f13280a = str;
            this.f13281b = str2;
            this.f13282c = str3;
        }

        public static c a() {
            a7.d c10 = x6.a.e().c();
            if (c10.k()) {
                return new c(c10.f(), "main");
            }
            throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.f13280a.equals(cVar.f13280a)) {
                return false;
            }
            return this.f13282c.equals(cVar.f13282c);
        }

        public int hashCode() {
            return (this.f13280a.hashCode() * 31) + this.f13282c.hashCode();
        }

        public String toString() {
            return "DartEntrypoint( bundle path: " + this.f13280a + ", function: " + this.f13282c + " )";
        }
    }

    private static class d implements k7.c {

        /* renamed from: a  reason: collision with root package name */
        private final c f13283a;

        private d(c cVar) {
            this.f13283a = cVar;
        }

        /* synthetic */ d(c cVar, C0230a aVar) {
            this(cVar);
        }

        public c.C0169c a(c.d dVar) {
            return this.f13283a.a(dVar);
        }

        public void b(String str, ByteBuffer byteBuffer, c.b bVar) {
            this.f13283a.b(str, byteBuffer, bVar);
        }

        public void c(String str, c.a aVar) {
            this.f13283a.c(str, aVar);
        }

        public /* synthetic */ c.C0169c d() {
            return k7.b.a(this);
        }

        public void e(String str, c.a aVar, c.C0169c cVar) {
            this.f13283a.e(str, aVar, cVar);
        }

        public void f(String str, ByteBuffer byteBuffer) {
            this.f13283a.b(str, byteBuffer, (c.b) null);
        }
    }

    public interface e {
        void a(String str);
    }

    public a(FlutterJNI flutterJNI, AssetManager assetManager) {
        C0230a aVar = new C0230a();
        this.f13275h = aVar;
        this.f13268a = flutterJNI;
        this.f13269b = assetManager;
        c cVar = new c(flutterJNI);
        this.f13270c = cVar;
        cVar.c("flutter/isolate", aVar);
        this.f13271d = new d(cVar, (C0230a) null);
        if (flutterJNI.isAttached()) {
            this.f13272e = true;
        }
    }

    @Deprecated
    public c.C0169c a(c.d dVar) {
        return this.f13271d.a(dVar);
    }

    @Deprecated
    public void b(String str, ByteBuffer byteBuffer, c.b bVar) {
        this.f13271d.b(str, byteBuffer, bVar);
    }

    @Deprecated
    public void c(String str, c.a aVar) {
        this.f13271d.c(str, aVar);
    }

    public /* synthetic */ c.C0169c d() {
        return k7.b.a(this);
    }

    @Deprecated
    public void e(String str, c.a aVar, c.C0169c cVar) {
        this.f13271d.e(str, aVar, cVar);
    }

    @Deprecated
    public void f(String str, ByteBuffer byteBuffer) {
        this.f13271d.f(str, byteBuffer);
    }

    public void j(b bVar) {
        if (this.f13272e) {
            x6.b.g("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        d8.e.a("DartExecutor#executeDartCallback");
        try {
            x6.b.f("DartExecutor", "Executing Dart callback: " + bVar);
            FlutterJNI flutterJNI = this.f13268a;
            String str = bVar.f13278b;
            FlutterCallbackInformation flutterCallbackInformation = bVar.f13279c;
            flutterJNI.runBundleAndSnapshotFromLibrary(str, flutterCallbackInformation.callbackName, flutterCallbackInformation.callbackLibraryPath, bVar.f13277a, (List<String>) null);
            this.f13272e = true;
        } finally {
            d8.e.d();
        }
    }

    public void k(c cVar, List<String> list) {
        if (this.f13272e) {
            x6.b.g("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        d8.e.a("DartExecutor#executeDartEntrypoint");
        try {
            x6.b.f("DartExecutor", "Executing Dart entrypoint: " + cVar);
            this.f13268a.runBundleAndSnapshotFromLibrary(cVar.f13280a, cVar.f13282c, cVar.f13281b, this.f13269b, list);
            this.f13272e = true;
        } finally {
            d8.e.d();
        }
    }

    public k7.c l() {
        return this.f13271d;
    }

    public String m() {
        return this.f13273f;
    }

    public boolean n() {
        return this.f13272e;
    }

    public void o() {
        if (this.f13268a.isAttached()) {
            this.f13268a.notifyLowMemoryWarning();
        }
    }

    public void p() {
        x6.b.f("DartExecutor", "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        this.f13268a.setPlatformMessageHandler(this.f13270c);
    }

    public void q() {
        x6.b.f("DartExecutor", "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.f13268a.setPlatformMessageHandler((f) null);
    }
}
