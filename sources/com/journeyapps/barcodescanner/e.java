package com.journeyapps.barcodescanner;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.journeyapps.barcodescanner.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import m6.c;
import m6.d;
import o5.o;
import o5.p;
import s5.h;
import s5.n;

public class e {
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static final String f7603o = "e";

    /* renamed from: p  reason: collision with root package name */
    private static int f7604p = 250;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Activity f7605a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public DecoratedBarcodeView f7606b;

    /* renamed from: c  reason: collision with root package name */
    private int f7607c = -1;

    /* renamed from: d  reason: collision with root package name */
    private boolean f7608d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7609e = true;

    /* renamed from: f  reason: collision with root package name */
    private String f7610f = "";

    /* renamed from: g  reason: collision with root package name */
    private boolean f7611g = false;

    /* renamed from: h  reason: collision with root package name */
    private h f7612h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public s5.e f7613i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public Handler f7614j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public boolean f7615k = false;

    /* renamed from: l  reason: collision with root package name */
    private m6.a f7616l = new a();

    /* renamed from: m  reason: collision with root package name */
    private final a.f f7617m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f7618n;

    class a implements m6.a {
        a() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void d(m6.b bVar) {
            e.this.B(bVar);
        }

        public void a(m6.b bVar) {
            e.this.f7606b.e();
            e.this.f7613i.f();
            e.this.f7614j.post(new d(this, bVar));
        }

        public void b(List<p> list) {
        }
    }

    class b implements a.f {
        b() {
        }

        public void a() {
        }

        public void b(Exception exc) {
            e eVar = e.this;
            eVar.m(eVar.f7605a.getString(n.zxing_msg_camera_framework_bug));
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
            if (e.this.f7615k) {
                Log.d(e.f7603o, "Camera closed; finishing activity");
                e.this.n();
            }
        }
    }

    public e(Activity activity, DecoratedBarcodeView decoratedBarcodeView) {
        b bVar = new b();
        this.f7617m = bVar;
        this.f7618n = false;
        this.f7605a = activity;
        this.f7606b = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().i(bVar);
        this.f7614j = new Handler();
        this.f7612h = new h(activity, new m6.e(this));
        this.f7613i = new s5.e(activity);
    }

    public static Intent A(m6.b bVar, String str) {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.addFlags(524288);
        intent.putExtra("SCAN_RESULT", bVar.toString());
        intent.putExtra("SCAN_RESULT_FORMAT", bVar.a().toString());
        byte[] c10 = bVar.c();
        if (c10 != null && c10.length > 0) {
            intent.putExtra("SCAN_RESULT_BYTES", c10);
        }
        Map<o, Object> d10 = bVar.d();
        if (d10 != null) {
            o oVar = o.UPC_EAN_EXTENSION;
            if (d10.containsKey(oVar)) {
                intent.putExtra("SCAN_RESULT_UPC_EAN_EXTENSION", d10.get(oVar).toString());
            }
            Number number = (Number) d10.get(o.ORIENTATION);
            if (number != null) {
                intent.putExtra("SCAN_RESULT_ORIENTATION", number.intValue());
            }
            String str2 = (String) d10.get(o.ERROR_CORRECTION_LEVEL);
            if (str2 != null) {
                intent.putExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL", str2);
            }
            Iterable<byte[]> iterable = (Iterable) d10.get(o.BYTE_SEGMENTS);
            if (iterable != null) {
                int i10 = 0;
                for (byte[] putExtra : iterable) {
                    intent.putExtra("SCAN_RESULT_BYTE_SEGMENTS_" + i10, putExtra);
                    i10++;
                }
            }
        }
        if (str != null) {
            intent.putExtra("SCAN_RESULT_IMAGE_PATH", str);
        }
        return intent;
    }

    private void D() {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.putExtra("MISSING_CAMERA_PERMISSION", true);
        this.f7605a.setResult(0, intent);
    }

    /* access modifiers changed from: private */
    public void n() {
        this.f7605a.finish();
    }

    private String o(m6.b bVar) {
        if (this.f7608d) {
            Bitmap b10 = bVar.b();
            try {
                File createTempFile = File.createTempFile("barcodeimage", ".jpg", this.f7605a.getCacheDir());
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                b10.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.close();
                return createTempFile.getAbsolutePath();
            } catch (IOException e10) {
                String str = f7603o;
                Log.w(str, "Unable to create temporary file and store bitmap! " + e10);
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void q(DialogInterface dialogInterface, int i10) {
        n();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void r(DialogInterface dialogInterface) {
        n();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void s() {
        Log.d(f7603o, "Finishing due to inactivity");
        n();
    }

    @TargetApi(23)
    private void z() {
        if (androidx.core.content.a.a(this.f7605a, "android.permission.CAMERA") == 0) {
            this.f7606b.g();
        } else if (!this.f7618n) {
            androidx.core.app.b.s(this.f7605a, new String[]{"android.permission.CAMERA"}, f7604p);
            this.f7618n = true;
        }
    }

    /* access modifiers changed from: protected */
    public void B(m6.b bVar) {
        this.f7605a.setResult(-1, A(bVar, o(bVar)));
        k();
    }

    /* access modifiers changed from: protected */
    public void C() {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.putExtra("TIMEOUT", true);
        this.f7605a.setResult(0, intent);
        k();
    }

    public void E(boolean z9, String str) {
        this.f7609e = z9;
        if (str == null) {
            str = "";
        }
        this.f7610f = str;
    }

    /* access modifiers changed from: protected */
    public void k() {
        if (this.f7606b.getBarcodeView().s()) {
            n();
        } else {
            this.f7615k = true;
        }
        this.f7606b.e();
        this.f7612h.d();
    }

    public void l() {
        this.f7606b.b(this.f7616l);
    }

    /* access modifiers changed from: protected */
    public void m(String str) {
        if (!this.f7605a.isFinishing() && !this.f7611g && !this.f7615k) {
            if (str.isEmpty()) {
                str = this.f7605a.getString(n.zxing_msg_camera_framework_bug);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f7605a);
            builder.setTitle(this.f7605a.getString(n.zxing_app_name));
            builder.setMessage(str);
            builder.setPositiveButton(n.zxing_button_ok, new d(this));
            builder.setOnCancelListener(new c(this));
            builder.show();
        }
    }

    public void p(Intent intent, Bundle bundle) {
        this.f7605a.getWindow().addFlags(128);
        if (bundle != null) {
            this.f7607c = bundle.getInt("SAVED_ORIENTATION_LOCK", -1);
        }
        if (intent != null) {
            if (intent.getBooleanExtra("SCAN_ORIENTATION_LOCKED", true)) {
                t();
            }
            if ("com.google.zxing.client.android.SCAN".equals(intent.getAction())) {
                this.f7606b.d(intent);
            }
            if (!intent.getBooleanExtra("BEEP_ENABLED", true)) {
                this.f7613i.g(false);
            }
            if (intent.hasExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG")) {
                E(intent.getBooleanExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG", true), intent.getStringExtra("MISSING_CAMERA_PERMISSION_DIALOG_MESSAGE"));
            }
            if (intent.hasExtra("TIMEOUT")) {
                this.f7614j.postDelayed(new c(this), intent.getLongExtra("TIMEOUT", 0));
            }
            if (intent.getBooleanExtra("BARCODE_IMAGE_ENABLED", false)) {
                this.f7608d = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void t() {
        if (this.f7607c == -1) {
            int rotation = this.f7605a.getWindowManager().getDefaultDisplay().getRotation();
            int i10 = this.f7605a.getResources().getConfiguration().orientation;
            int i11 = 0;
            if (i10 == 2) {
                if (!(rotation == 0 || rotation == 1)) {
                    i11 = 8;
                }
            } else if (i10 == 1) {
                i11 = (rotation == 0 || rotation == 3) ? 1 : 9;
            }
            this.f7607c = i11;
        }
        this.f7605a.setRequestedOrientation(this.f7607c);
    }

    public void u() {
        this.f7611g = true;
        this.f7612h.d();
        this.f7614j.removeCallbacksAndMessages((Object) null);
    }

    public void v() {
        this.f7612h.d();
        this.f7606b.f();
    }

    public void w(int i10, String[] strArr, int[] iArr) {
        if (i10 != f7604p) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            D();
            if (this.f7609e) {
                m(this.f7610f);
            } else {
                k();
            }
        } else {
            this.f7606b.g();
        }
    }

    public void x() {
        if (Build.VERSION.SDK_INT >= 23) {
            z();
        } else {
            this.f7606b.g();
        }
        this.f7612h.h();
    }

    public void y(Bundle bundle) {
        bundle.putInt("SAVED_ORIENTATION_LOCK", this.f7607c);
    }
}
