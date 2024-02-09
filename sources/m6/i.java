package m6;

import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import n6.g;
import n6.p;
import o5.h;
import s5.k;

public class i {

    /* renamed from: k  reason: collision with root package name */
    private static final String f11217k = "i";

    /* renamed from: a  reason: collision with root package name */
    private g f11218a;

    /* renamed from: b  reason: collision with root package name */
    private HandlerThread f11219b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Handler f11220c;

    /* renamed from: d  reason: collision with root package name */
    private f f11221d;

    /* renamed from: e  reason: collision with root package name */
    private Handler f11222e;

    /* renamed from: f  reason: collision with root package name */
    private Rect f11223f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f11224g = false;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final Object f11225h = new Object();

    /* renamed from: i  reason: collision with root package name */
    private final Handler.Callback f11226i = new a();

    /* renamed from: j  reason: collision with root package name */
    private final p f11227j = new b();

    class a implements Handler.Callback {
        a() {
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == k.zxing_decode) {
                i.this.g((q) message.obj);
                return true;
            } else if (i10 != k.zxing_preview_failed) {
                return true;
            } else {
                i.this.h();
                return true;
            }
        }
    }

    class b implements p {
        b() {
        }

        public void a(q qVar) {
            synchronized (i.this.f11225h) {
                if (i.this.f11224g) {
                    i.this.f11220c.obtainMessage(k.zxing_decode, qVar).sendToTarget();
                }
            }
        }

        public void b(Exception exc) {
            synchronized (i.this.f11225h) {
                if (i.this.f11224g) {
                    i.this.f11220c.obtainMessage(k.zxing_preview_failed).sendToTarget();
                }
            }
        }
    }

    public i(g gVar, f fVar, Handler handler) {
        r.a();
        this.f11218a = gVar;
        this.f11221d = fVar;
        this.f11222e = handler;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(m6.q r9) {
        /*
            r8 = this;
            long r0 = java.lang.System.currentTimeMillis()
            android.graphics.Rect r2 = r8.f11223f
            r9.d(r2)
            o5.h r2 = r8.f(r9)
            if (r2 == 0) goto L_0x0016
            m6.f r3 = r8.f11221d
            o5.n r2 = r3.c(r2)
            goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            if (r2 == 0) goto L_0x0053
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = f11217k
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Found barcode in "
            r6.append(r7)
            long r3 = r3 - r0
            r6.append(r3)
            java.lang.String r0 = " ms"
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            android.util.Log.d(r5, r0)
            android.os.Handler r0 = r8.f11222e
            if (r0 == 0) goto L_0x0060
            m6.b r0 = new m6.b
            r0.<init>(r2, r9)
            android.os.Handler r1 = r8.f11222e
            int r2 = s5.k.zxing_decode_succeeded
            android.os.Message r0 = android.os.Message.obtain(r1, r2, r0)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r0.setData(r1)
            goto L_0x005d
        L_0x0053:
            android.os.Handler r0 = r8.f11222e
            if (r0 == 0) goto L_0x0060
            int r1 = s5.k.zxing_decode_failed
            android.os.Message r0 = android.os.Message.obtain(r0, r1)
        L_0x005d:
            r0.sendToTarget()
        L_0x0060:
            android.os.Handler r0 = r8.f11222e
            if (r0 == 0) goto L_0x0079
            m6.f r0 = r8.f11221d
            java.util.List r0 = r0.d()
            java.util.List r9 = m6.b.f(r0, r9)
            android.os.Handler r0 = r8.f11222e
            int r1 = s5.k.zxing_possible_result_points
            android.os.Message r9 = android.os.Message.obtain(r0, r1, r9)
            r9.sendToTarget()
        L_0x0079:
            r8.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.i.g(m6.q):void");
    }

    /* access modifiers changed from: private */
    public void h() {
        this.f11218a.v(this.f11227j);
    }

    /* access modifiers changed from: protected */
    public h f(q qVar) {
        if (this.f11223f == null) {
            return null;
        }
        return qVar.a();
    }

    public void i(Rect rect) {
        this.f11223f = rect;
    }

    public void j(f fVar) {
        this.f11221d = fVar;
    }

    public void k() {
        r.a();
        HandlerThread handlerThread = new HandlerThread(f11217k);
        this.f11219b = handlerThread;
        handlerThread.start();
        this.f11220c = new Handler(this.f11219b.getLooper(), this.f11226i);
        this.f11224g = true;
        h();
    }

    public void l() {
        r.a();
        synchronized (this.f11225h) {
            this.f11224g = false;
            this.f11220c.removeCallbacksAndMessages((Object) null);
            this.f11219b.quit();
        }
    }
}
