package a7;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import d8.e;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.f;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private boolean f28a;

    /* renamed from: b  reason: collision with root package name */
    private c f29b;

    /* renamed from: c  reason: collision with root package name */
    private long f30c;

    /* renamed from: d  reason: collision with root package name */
    private b f31d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public FlutterJNI f32e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public ExecutorService f33f;

    /* renamed from: g  reason: collision with root package name */
    Future<b> f34g;

    class a implements Callable<b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f35a;

        a(Context context) {
            this.f35a = context;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c() {
            d.this.f32e.prefetchDefaultFontManager();
        }

        /* renamed from: b */
        public b call() {
            e.a("FlutterLoader initTask");
            try {
                e unused = d.this.j(this.f35a);
                d.this.f32e.loadLibrary();
                d.this.f32e.updateRefreshRate();
                d.this.f33f.execute(new c(this));
                return new b(d8.b.d(this.f35a), d8.b.a(this.f35a), d8.b.c(this.f35a), (a) null);
            } finally {
                e.d();
            }
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        final String f37a;

        /* renamed from: b  reason: collision with root package name */
        final String f38b;

        /* renamed from: c  reason: collision with root package name */
        final String f39c;

        private b(String str, String str2, String str3) {
            this.f37a = str;
            this.f38b = str2;
            this.f39c = str3;
        }

        /* synthetic */ b(String str, String str2, String str3, a aVar) {
            this(str, str2, str3);
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private String f40a;

        public String a() {
            return this.f40a;
        }
    }

    public d() {
        this(x6.a.e().d().a());
    }

    public d(FlutterJNI flutterJNI) {
        this(flutterJNI, x6.a.e().b());
    }

    public d(FlutterJNI flutterJNI, ExecutorService executorService) {
        this.f28a = false;
        this.f32e = flutterJNI;
        this.f33f = executorService;
    }

    private String g(String str) {
        return this.f31d.f23d + File.separator + str;
    }

    /* access modifiers changed from: private */
    public e j(Context context) {
        return null;
    }

    private static boolean l(Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        return bundle.getBoolean("io.flutter.embedding.android.LeakVM", true);
    }

    public boolean d() {
        return this.f31d.f26g;
    }

    public void e(Context context, String[] strArr) {
        if (!this.f28a) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
            } else if (this.f29b != null) {
                e.a("FlutterLoader#ensureInitializationComplete");
                try {
                    b bVar = this.f34g.get();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                    StringBuilder sb = new StringBuilder();
                    sb.append("--icu-native-lib-path=");
                    sb.append(this.f31d.f25f);
                    String str = File.separator;
                    sb.append(str);
                    sb.append("libflutter.so");
                    arrayList.add(sb.toString());
                    if (strArr != null) {
                        Collections.addAll(arrayList, strArr);
                    }
                    arrayList.add("--aot-shared-library-name=" + this.f31d.f20a);
                    arrayList.add("--aot-shared-library-name=" + this.f31d.f25f + str + this.f31d.f20a);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("--cache-dir-path=");
                    sb2.append(bVar.f38b);
                    arrayList.add(sb2.toString());
                    if (this.f31d.f24e != null) {
                        arrayList.add("--domain-network-policy=" + this.f31d.f24e);
                    }
                    if (this.f29b.a() != null) {
                        arrayList.add("--log-tag=" + this.f29b.a());
                    }
                    Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    int i10 = bundle != null ? bundle.getInt("io.flutter.embedding.android.OldGenHeapSize") : 0;
                    if (i10 == 0) {
                        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                        i10 = (int) ((((double) memoryInfo.totalMem) / 1000000.0d) / 2.0d);
                    }
                    arrayList.add("--old-gen-heap-size=" + i10);
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 12 * 4));
                    arrayList.add("--prefetched-default-font-manager");
                    if (bundle != null) {
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableImpeller", false)) {
                            arrayList.add("--enable-impeller");
                        }
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanValidation", false)) {
                            arrayList.add("--enable-vulkan-validation");
                        }
                        String string = bundle.getString("io.flutter.embedding.android.ImpellerBackend");
                        if (string != null) {
                            arrayList.add("--impeller-backend=" + string);
                        }
                    }
                    String str2 = l(bundle) ? "true" : "false";
                    arrayList.add("--leak-vm=" + str2);
                    this.f32e.init(context, (String[]) arrayList.toArray(new String[0]), (String) null, bVar.f37a, bVar.f38b, SystemClock.uptimeMillis() - this.f30c);
                    this.f28a = true;
                    e.d();
                } catch (Exception e10) {
                    x6.b.c("FlutterLoader", "Flutter initialization failed.", e10);
                    throw new RuntimeException(e10);
                } catch (Throwable th) {
                    e.d();
                    throw th;
                }
            } else {
                throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
            }
        }
    }

    public String f() {
        return this.f31d.f23d;
    }

    public String h(String str) {
        return g(str);
    }

    public String i(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("packages");
        String str3 = File.separator;
        sb.append(str3);
        sb.append(str2);
        sb.append(str3);
        sb.append(str);
        return h(sb.toString());
    }

    public boolean k() {
        return this.f28a;
    }

    public void m(Context context) {
        n(context, new c());
    }

    public void n(Context context, c cVar) {
        if (this.f29b == null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                e.a("FlutterLoader#startInitialization");
                try {
                    Context applicationContext = context.getApplicationContext();
                    this.f29b = cVar;
                    this.f30c = SystemClock.uptimeMillis();
                    this.f31d = a.e(applicationContext);
                    f.f((DisplayManager) applicationContext.getSystemService("display"), this.f32e).g();
                    this.f34g = this.f33f.submit(new a(applicationContext));
                } finally {
                    e.d();
                }
            } else {
                throw new IllegalStateException("startInitialization must be called on the main thread");
            }
        }
    }
}
