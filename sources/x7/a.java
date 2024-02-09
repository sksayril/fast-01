package x7;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.Display;
import android.view.WindowManager;
import io.flutter.embedding.engine.systemchannels.j;
import io.flutter.plugins.camera.h0;

public class a {

    /* renamed from: g  reason: collision with root package name */
    private static final IntentFilter f13212g = new IntentFilter("android.intent.action.CONFIGURATION_CHANGED");

    /* renamed from: a  reason: collision with root package name */
    private final Activity f13213a;

    /* renamed from: b  reason: collision with root package name */
    private final h0 f13214b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f13215c;

    /* renamed from: d  reason: collision with root package name */
    private final int f13216d;

    /* renamed from: e  reason: collision with root package name */
    private j.f f13217e;

    /* renamed from: f  reason: collision with root package name */
    private BroadcastReceiver f13218f;

    /* renamed from: x7.a$a  reason: collision with other inner class name */
    class C0229a extends BroadcastReceiver {
        C0229a() {
        }

        public void onReceive(Context context, Intent intent) {
            a.this.j();
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f13220a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                io.flutter.embedding.engine.systemchannels.j$f[] r0 = io.flutter.embedding.engine.systemchannels.j.f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13220a = r0
                io.flutter.embedding.engine.systemchannels.j$f r1 = io.flutter.embedding.engine.systemchannels.j.f.PORTRAIT_UP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13220a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.embedding.engine.systemchannels.j$f r1 = io.flutter.embedding.engine.systemchannels.j.f.PORTRAIT_DOWN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13220a     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.flutter.embedding.engine.systemchannels.j$f r1 = io.flutter.embedding.engine.systemchannels.j.f.LANDSCAPE_LEFT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f13220a     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.flutter.embedding.engine.systemchannels.j$f r1 = io.flutter.embedding.engine.systemchannels.j.f.LANDSCAPE_RIGHT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: x7.a.b.<clinit>():void");
        }
    }

    private a(Activity activity, h0 h0Var, boolean z9, int i10) {
        this.f13213a = activity;
        this.f13214b = h0Var;
        this.f13215c = z9;
        this.f13216d = i10;
    }

    public static a a(Activity activity, h0 h0Var, boolean z9, int i10) {
        return new a(activity, h0Var, z9, i10);
    }

    static void i(j.f fVar, j.f fVar2, h0 h0Var) {
        if (!fVar.equals(fVar2)) {
            h0Var.o(fVar);
        }
    }

    /* access modifiers changed from: package-private */
    public Display b() {
        return ((WindowManager) this.f13213a.getSystemService("window")).getDefaultDisplay();
    }

    public j.f c() {
        return this.f13217e;
    }

    public int d() {
        return e(this.f13217e);
    }

    public int e(j.f fVar) {
        if (fVar == null) {
            fVar = f();
        }
        int i10 = b.f13220a[fVar.ordinal()];
        int i11 = 0;
        if (i10 == 1) {
            i11 = 90;
        } else if (i10 == 2) {
            i11 = 270;
        } else if (i10 == 3 ? this.f13215c : !(i10 != 4 || this.f13215c)) {
            i11 = 180;
        }
        return ((i11 + this.f13216d) + 270) % 360;
    }

    /* access modifiers changed from: package-private */
    public j.f f() {
        int rotation = b().getRotation();
        int i10 = this.f13213a.getResources().getConfiguration().orientation;
        return i10 != 1 ? i10 != 2 ? j.f.PORTRAIT_UP : (rotation == 0 || rotation == 1) ? j.f.LANDSCAPE_LEFT : j.f.LANDSCAPE_RIGHT : (rotation == 0 || rotation == 1) ? j.f.PORTRAIT_UP : j.f.PORTRAIT_DOWN;
    }

    public int g() {
        return h(this.f13217e);
    }

    public int h(j.f fVar) {
        if (fVar == null) {
            fVar = f();
        }
        int i10 = b.f13220a[fVar.ordinal()];
        int i11 = 0;
        if (i10 != 1) {
            if (i10 == 2) {
                i11 = 180;
            } else if (i10 == 3) {
                i11 = 270;
            } else if (i10 == 4) {
                i11 = 90;
            }
        }
        if (this.f13215c) {
            i11 *= -1;
        }
        return ((i11 + this.f13216d) + 360) % 360;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        j.f f10 = f();
        i(f10, this.f13217e, this.f13214b);
        this.f13217e = f10;
    }

    public void k() {
        if (this.f13218f == null) {
            C0229a aVar = new C0229a();
            this.f13218f = aVar;
            this.f13213a.registerReceiver(aVar, f13212g);
            this.f13218f.onReceive(this.f13213a, (Intent) null);
        }
    }

    public void l() {
        BroadcastReceiver broadcastReceiver = this.f13218f;
        if (broadcastReceiver != null) {
            this.f13213a.unregisterReceiver(broadcastReceiver);
            this.f13218f = null;
        }
    }
}
