package m6;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;

public class o {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public int f11238a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public WindowManager f11239b;

    /* renamed from: c  reason: collision with root package name */
    private OrientationEventListener f11240c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public n f11241d;

    class a extends OrientationEventListener {
        a(Context context, int i10) {
            super(context, i10);
        }

        public void onOrientationChanged(int i10) {
            int rotation;
            WindowManager a10 = o.this.f11239b;
            n b10 = o.this.f11241d;
            if (o.this.f11239b != null && b10 != null && (rotation = a10.getDefaultDisplay().getRotation()) != o.this.f11238a) {
                int unused = o.this.f11238a = rotation;
                b10.a(rotation);
            }
        }
    }

    public void e(Context context, n nVar) {
        f();
        Context applicationContext = context.getApplicationContext();
        this.f11241d = nVar;
        this.f11239b = (WindowManager) applicationContext.getSystemService("window");
        a aVar = new a(applicationContext, 3);
        this.f11240c = aVar;
        aVar.enable();
        this.f11238a = this.f11239b.getDefaultDisplay().getRotation();
    }

    public void f() {
        OrientationEventListener orientationEventListener = this.f11240c;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.f11240c = null;
        this.f11239b = null;
        this.f11241d = null;
    }
}
