package com.journeyapps.barcodescanner;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import s5.k;
import s5.l;

public class CaptureActivity extends Activity {

    /* renamed from: m  reason: collision with root package name */
    private e f7557m;

    /* renamed from: n  reason: collision with root package name */
    private DecoratedBarcodeView f7558n;

    /* access modifiers changed from: protected */
    public DecoratedBarcodeView a() {
        setContentView(l.zxing_capture);
        return (DecoratedBarcodeView) findViewById(k.zxing_barcode_scanner);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f7558n = a();
        e eVar = new e(this, this.f7558n);
        this.f7557m = eVar;
        eVar.p(getIntent(), bundle);
        this.f7557m.l();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f7557m.u();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return this.f7558n.onKeyDown(i10, keyEvent) || super.onKeyDown(i10, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f7557m.v();
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.f7557m.w(i10, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f7557m.x();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f7557m.y(bundle);
    }
}
