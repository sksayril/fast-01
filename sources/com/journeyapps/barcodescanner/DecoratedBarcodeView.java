package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m6.j;
import n6.i;
import o5.e;
import o5.p;
import s5.f;
import s5.g;
import s5.k;
import s5.l;
import s5.o;

public class DecoratedBarcodeView extends FrameLayout {

    /* renamed from: m  reason: collision with root package name */
    private BarcodeView f7559m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public ViewfinderView f7560n;

    /* renamed from: o  reason: collision with root package name */
    private TextView f7561o;

    /* renamed from: p  reason: collision with root package name */
    private a f7562p;

    public interface a {
        void a();

        void b();
    }

    private class b implements m6.a {

        /* renamed from: a  reason: collision with root package name */
        private m6.a f7563a;

        public b(m6.a aVar) {
            this.f7563a = aVar;
        }

        public void a(m6.b bVar) {
            this.f7563a.a(bVar);
        }

        public void b(List<p> list) {
            for (p a10 : list) {
                DecoratedBarcodeView.this.f7560n.a(a10);
            }
            this.f7563a.b(list);
        }
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(attributeSet);
    }

    private void c(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o.f12223t);
        int resourceId = obtainStyledAttributes.getResourceId(o.f12224u, l.zxing_barcode_scanner);
        obtainStyledAttributes.recycle();
        FrameLayout.inflate(getContext(), resourceId, this);
        BarcodeView barcodeView = (BarcodeView) findViewById(k.zxing_barcode_surface);
        this.f7559m = barcodeView;
        if (barcodeView != null) {
            barcodeView.q(attributeSet);
            ViewfinderView viewfinderView = (ViewfinderView) findViewById(k.zxing_viewfinder_view);
            this.f7560n = viewfinderView;
            if (viewfinderView != null) {
                viewfinderView.setCameraPreview(this.f7559m);
                this.f7561o = (TextView) findViewById(k.zxing_status_view);
                return;
            }
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\".");
        }
        throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\".");
    }

    public void b(m6.a aVar) {
        this.f7559m.J(new b(aVar));
    }

    public void d(Intent intent) {
        int intExtra;
        Set<o5.a> a10 = f.a(intent);
        Map<e, Object> a11 = g.a(intent);
        i iVar = new i();
        if (intent.hasExtra("SCAN_CAMERA_ID") && (intExtra = intent.getIntExtra("SCAN_CAMERA_ID", -1)) >= 0) {
            iVar.i(intExtra);
        }
        if (intent.hasExtra("TORCH_ENABLED") && intent.getBooleanExtra("TORCH_ENABLED", false)) {
            i();
        }
        String stringExtra = intent.getStringExtra("PROMPT_MESSAGE");
        if (stringExtra != null) {
            setStatusText(stringExtra);
        }
        int intExtra2 = intent.getIntExtra("SCAN_TYPE", 0);
        String stringExtra2 = intent.getStringExtra("CHARACTER_SET");
        new o5.i().f(a11);
        this.f7559m.setCameraSettings(iVar);
        this.f7559m.setDecoderFactory(new j(a10, a11, stringExtra2, intExtra2));
    }

    public void e() {
        this.f7559m.u();
    }

    public void f() {
        this.f7559m.v();
    }

    public void g() {
        this.f7559m.y();
    }

    public BarcodeView getBarcodeView() {
        return (BarcodeView) findViewById(k.zxing_barcode_surface);
    }

    public i getCameraSettings() {
        return this.f7559m.getCameraSettings();
    }

    public m6.g getDecoderFactory() {
        return this.f7559m.getDecoderFactory();
    }

    public TextView getStatusView() {
        return this.f7561o;
    }

    public ViewfinderView getViewFinder() {
        return this.f7560n;
    }

    public void h() {
        this.f7559m.setTorch(false);
        a aVar = this.f7562p;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void i() {
        this.f7559m.setTorch(true);
        a aVar = this.f7562p;
        if (aVar != null) {
            aVar.b();
        }
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 24) {
            i();
            return true;
        } else if (i10 == 25) {
            h();
            return true;
        } else if (i10 == 27 || i10 == 80) {
            return true;
        } else {
            return super.onKeyDown(i10, keyEvent);
        }
    }

    public void setCameraSettings(i iVar) {
        this.f7559m.setCameraSettings(iVar);
    }

    public void setDecoderFactory(m6.g gVar) {
        this.f7559m.setDecoderFactory(gVar);
    }

    public void setStatusText(String str) {
        TextView textView = this.f7561o;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTorchListener(a aVar) {
        this.f7562p = aVar;
    }
}
