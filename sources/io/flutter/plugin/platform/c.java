package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.activity.l;
import androidx.core.view.i0;
import io.flutter.embedding.engine.systemchannels.j;
import java.io.FileNotFoundException;
import java.util.List;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f10074a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final j f10075b;

    /* renamed from: c  reason: collision with root package name */
    private final d f10076c;

    /* renamed from: d  reason: collision with root package name */
    private j.C0155j f10077d;

    /* renamed from: e  reason: collision with root package name */
    private int f10078e = 1280;

    /* renamed from: f  reason: collision with root package name */
    final j.h f10079f;

    class a implements j.h {
        a() {
        }

        public void b() {
            c.this.s();
        }

        public void g(boolean z9) {
            c.this.v(z9);
        }

        public void h(j.i iVar) {
            c.this.r(iVar);
        }

        public void i(List<j.l> list) {
            c.this.z(list);
        }

        public void j(j.k kVar) {
            c.this.y(kVar);
        }

        public void k() {
            c.this.x();
        }

        public void l() {
            c.this.t();
        }

        public void m(String str) {
            c.this.u(str);
        }

        public void n(j.C0155j jVar) {
            c.this.B(jVar);
        }

        public void o(int i10) {
            c.this.A(i10);
        }

        public void p(j.c cVar) {
            c.this.w(cVar);
        }

        public void q(j.g gVar) {
            c.this.D(gVar);
        }

        public boolean r() {
            return c.this.o();
        }

        public CharSequence s(j.e eVar) {
            return c.this.q(eVar);
        }
    }

    class b implements View.OnSystemUiVisibilityChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f10081a;

        b(View view) {
            this.f10081a = view;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(int i10) {
            j jVar;
            boolean z9;
            if ((i10 & 4) == 0) {
                jVar = c.this.f10075b;
                z9 = true;
            } else {
                jVar = c.this.f10075b;
                z9 = false;
            }
            jVar.m(z9);
        }

        public void onSystemUiVisibilityChange(int i10) {
            this.f10081a.post(new d(this, i10));
        }
    }

    /* renamed from: io.flutter.plugin.platform.c$c  reason: collision with other inner class name */
    static /* synthetic */ class C0156c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10083a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f10084b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f10085c;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|15|16|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0053 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0069 */
        static {
            /*
                io.flutter.embedding.engine.systemchannels.j$d[] r0 = io.flutter.embedding.engine.systemchannels.j.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10085c = r0
                r1 = 1
                io.flutter.embedding.engine.systemchannels.j$d r2 = io.flutter.embedding.engine.systemchannels.j.d.DARK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f10085c     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.embedding.engine.systemchannels.j$d r3 = io.flutter.embedding.engine.systemchannels.j.d.LIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                io.flutter.embedding.engine.systemchannels.j$l[] r2 = io.flutter.embedding.engine.systemchannels.j.l.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f10084b = r2
                io.flutter.embedding.engine.systemchannels.j$l r3 = io.flutter.embedding.engine.systemchannels.j.l.TOP_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f10084b     // Catch:{ NoSuchFieldError -> 0x0038 }
                io.flutter.embedding.engine.systemchannels.j$l r3 = io.flutter.embedding.engine.systemchannels.j.l.BOTTOM_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                io.flutter.embedding.engine.systemchannels.j$g[] r2 = io.flutter.embedding.engine.systemchannels.j.g.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f10083a = r2
                io.flutter.embedding.engine.systemchannels.j$g r3 = io.flutter.embedding.engine.systemchannels.j.g.STANDARD     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r1 = f10083a     // Catch:{ NoSuchFieldError -> 0x0053 }
                io.flutter.embedding.engine.systemchannels.j$g r2 = io.flutter.embedding.engine.systemchannels.j.g.LIGHT_IMPACT     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                int[] r0 = f10083a     // Catch:{ NoSuchFieldError -> 0x005e }
                io.flutter.embedding.engine.systemchannels.j$g r1 = io.flutter.embedding.engine.systemchannels.j.g.MEDIUM_IMPACT     // Catch:{ NoSuchFieldError -> 0x005e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                int[] r0 = f10083a     // Catch:{ NoSuchFieldError -> 0x0069 }
                io.flutter.embedding.engine.systemchannels.j$g r1 = io.flutter.embedding.engine.systemchannels.j.g.HEAVY_IMPACT     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r0 = f10083a     // Catch:{ NoSuchFieldError -> 0x0074 }
                io.flutter.embedding.engine.systemchannels.j$g r1 = io.flutter.embedding.engine.systemchannels.j.g.SELECTION_CLICK     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.platform.c.C0156c.<clinit>():void");
        }
    }

    public interface d {
        boolean b();

        void g(boolean z9);
    }

    public c(Activity activity, j jVar, d dVar) {
        a aVar = new a();
        this.f10079f = aVar;
        this.f10074a = activity;
        this.f10075b = jVar;
        jVar.l(aVar);
        this.f10076c = dVar;
    }

    /* access modifiers changed from: private */
    public void A(int i10) {
        this.f10074a.setRequestedOrientation(i10);
    }

    /* access modifiers changed from: private */
    @TargetApi(21)
    public void B(j.C0155j jVar) {
        Window window = this.f10074a.getWindow();
        i0 i0Var = new i0(window, window.getDecorView());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        if (i10 >= 23) {
            j.d dVar = jVar.f9907b;
            if (dVar != null) {
                int i11 = C0156c.f10085c[dVar.ordinal()];
                if (i11 == 1) {
                    i0Var.b(true);
                } else if (i11 == 2) {
                    i0Var.b(false);
                }
            }
            Integer num = jVar.f9906a;
            if (num != null) {
                window.setStatusBarColor(num.intValue());
            }
        }
        Boolean bool = jVar.f9908c;
        if (bool != null && i10 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i10 >= 26) {
            j.d dVar2 = jVar.f9910e;
            if (dVar2 != null) {
                int i12 = C0156c.f10085c[dVar2.ordinal()];
                if (i12 == 1) {
                    i0Var.a(true);
                } else if (i12 == 2) {
                    i0Var.a(false);
                }
            }
            Integer num2 = jVar.f9909d;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = jVar.f9911f;
        if (num3 != null && i10 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = jVar.f9912g;
        if (bool2 != null && i10 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f10077d = jVar;
    }

    /* access modifiers changed from: private */
    public boolean o() {
        ClipDescription primaryClipDescription;
        ClipboardManager clipboardManager = (ClipboardManager) this.f10074a.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    /* access modifiers changed from: private */
    public CharSequence q(j.e eVar) {
        ClipboardManager clipboardManager = (ClipboardManager) this.f10074a.getSystemService("clipboard");
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            ClipData primaryClip = clipboardManager.getPrimaryClip();
            if (primaryClip == null) {
                return null;
            }
            if (eVar != null) {
                if (eVar != j.e.PLAIN_TEXT) {
                    return null;
                }
            }
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            if (itemAt.getUri() != null) {
                this.f10074a.getContentResolver().openTypedAssetFileDescriptor(itemAt.getUri(), "text/*", (Bundle) null);
            }
            return itemAt.coerceToText(this.f10074a);
        } catch (SecurityException e10) {
            x6.b.h("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e10);
            return null;
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public void r(j.i iVar) {
        if (iVar == j.i.CLICK) {
            this.f10074a.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    /* access modifiers changed from: private */
    public void s() {
        d dVar = this.f10076c;
        if (dVar == null || !dVar.b()) {
            Activity activity = this.f10074a;
            if (activity instanceof l) {
                ((l) activity).j().e();
            } else {
                activity.finish();
            }
        }
    }

    /* access modifiers changed from: private */
    public void t() {
        C();
    }

    /* access modifiers changed from: private */
    public void u(String str) {
        ((ClipboardManager) this.f10074a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", str));
    }

    /* access modifiers changed from: private */
    public void v(boolean z9) {
        this.f10076c.g(z9);
    }

    /* access modifiers changed from: private */
    public void w(j.c cVar) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 28 && i10 > 21) {
            this.f10074a.setTaskDescription(new ActivityManager.TaskDescription(cVar.f9905b, (Bitmap) null, cVar.f9904a));
        }
        if (i10 >= 28) {
            this.f10074a.setTaskDescription(new ActivityManager.TaskDescription(cVar.f9905b, 0, cVar.f9904a));
        }
    }

    /* access modifiers changed from: private */
    public void x() {
        View decorView = this.f10074a.getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new b(decorView));
    }

    /* access modifiers changed from: private */
    public void y(j.k kVar) {
        int i10;
        if (kVar == j.k.LEAN_BACK) {
            i10 = 1798;
        } else if (kVar == j.k.IMMERSIVE) {
            i10 = 3846;
        } else if (kVar == j.k.IMMERSIVE_STICKY) {
            i10 = 5894;
        } else if (kVar == j.k.EDGE_TO_EDGE && Build.VERSION.SDK_INT >= 29) {
            i10 = 1792;
        } else {
            return;
        }
        this.f10078e = i10;
        C();
    }

    /* access modifiers changed from: private */
    public void z(List<j.l> list) {
        int i10 = list.size() == 0 ? 5894 : 1798;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int i12 = C0156c.f10084b[list.get(i11).ordinal()];
            if (i12 == 1) {
                i10 &= -5;
            } else if (i12 == 2) {
                i10 = i10 & -513 & -3;
            }
        }
        this.f10078e = i10;
        C();
    }

    public void C() {
        this.f10074a.getWindow().getDecorView().setSystemUiVisibility(this.f10078e);
        j.C0155j jVar = this.f10077d;
        if (jVar != null) {
            B(jVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void D(j.g gVar) {
        int i10;
        View decorView = this.f10074a.getWindow().getDecorView();
        int i11 = C0156c.f10083a[gVar.ordinal()];
        int i12 = 1;
        if (i11 != 1) {
            if (i11 != 2) {
                i12 = 3;
                if (i11 != 3) {
                    i12 = 4;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return;
                        }
                    } else if (Build.VERSION.SDK_INT >= 23) {
                        i10 = 6;
                    } else {
                        return;
                    }
                }
            }
            decorView.performHapticFeedback(i12);
            return;
        }
        i10 = 0;
        decorView.performHapticFeedback(i10);
    }

    public void p() {
        this.f10075b.l((j.h) null);
    }
}
