package com.journeyapps.barcodescanner;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.List;
import m6.f;
import m6.g;
import m6.h;
import m6.i;
import m6.j;
import m6.r;
import o5.e;
import s5.k;

public class BarcodeView extends a {
    /* access modifiers changed from: private */
    public b N = b.NONE;
    /* access modifiers changed from: private */
    public m6.a O = null;
    private i P;
    private g Q;
    private Handler R;
    private final Handler.Callback S = new a();

    class a implements Handler.Callback {
        a() {
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == k.zxing_decode_succeeded) {
                m6.b bVar = (m6.b) message.obj;
                if (!(bVar == null || BarcodeView.this.O == null || BarcodeView.this.N == b.NONE)) {
                    BarcodeView.this.O.a(bVar);
                    if (BarcodeView.this.N == b.SINGLE) {
                        BarcodeView.this.N();
                    }
                }
                return true;
            } else if (i10 == k.zxing_decode_failed) {
                return true;
            } else {
                if (i10 != k.zxing_possible_result_points) {
                    return false;
                }
                List list = (List) message.obj;
                if (!(BarcodeView.this.O == null || BarcodeView.this.N == b.NONE)) {
                    BarcodeView.this.O.b(list);
                }
                return true;
            }
        }
    }

    private enum b {
        NONE,
        SINGLE,
        CONTINUOUS
    }

    public BarcodeView(Context context) {
        super(context);
        K();
    }

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        K();
    }

    private f G() {
        if (this.Q == null) {
            this.Q = H();
        }
        h hVar = new h();
        HashMap hashMap = new HashMap();
        hashMap.put(e.NEED_RESULT_POINT_CALLBACK, hVar);
        f a10 = this.Q.a(hashMap);
        hVar.b(a10);
        return a10;
    }

    private void K() {
        this.Q = new j();
        this.R = new Handler(this.S);
    }

    private void L() {
        M();
        if (this.N != b.NONE && t()) {
            i iVar = new i(getCameraInstance(), G(), this.R);
            this.P = iVar;
            iVar.i(getPreviewFramingRect());
            this.P.k();
        }
    }

    private void M() {
        i iVar = this.P;
        if (iVar != null) {
            iVar.l();
            this.P = null;
        }
    }

    /* access modifiers changed from: protected */
    public g H() {
        return new j();
    }

    public void I(m6.a aVar) {
        this.N = b.CONTINUOUS;
        this.O = aVar;
        L();
    }

    public void J(m6.a aVar) {
        this.N = b.SINGLE;
        this.O = aVar;
        L();
    }

    public void N() {
        this.N = b.NONE;
        this.O = null;
        M();
    }

    public g getDecoderFactory() {
        return this.Q;
    }

    public void setDecoderFactory(g gVar) {
        r.a();
        this.Q = gVar;
        i iVar = this.P;
        if (iVar != null) {
            iVar.j(G());
        }
    }

    public void u() {
        M();
        super.u();
    }

    /* access modifiers changed from: protected */
    public void x() {
        super.x();
        L();
    }
}
