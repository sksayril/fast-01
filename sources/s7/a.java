package s7;

import android.hardware.camera2.CaptureRequest;
import io.flutter.plugins.camera.y;

public class a extends n7.a<b> {

    /* renamed from: b  reason: collision with root package name */
    private b f12331b = b.auto;

    /* renamed from: s7.a$a  reason: collision with other inner class name */
    static /* synthetic */ class C0210a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12332a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                s7.b[] r0 = s7.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12332a = r0
                s7.b r1 = s7.b.off     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12332a     // Catch:{ NoSuchFieldError -> 0x001d }
                s7.b r1 = s7.b.always     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12332a     // Catch:{ NoSuchFieldError -> 0x0028 }
                s7.b r1 = s7.b.torch     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f12332a     // Catch:{ NoSuchFieldError -> 0x0033 }
                s7.b r1 = s7.b.auto     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: s7.a.C0210a.<clinit>():void");
        }
    }

    public a(y yVar) {
        super(yVar);
    }

    public void a(CaptureRequest.Builder builder) {
        int i10;
        CaptureRequest.Key key;
        int i11;
        CaptureRequest.Key key2;
        if (b()) {
            int i12 = C0210a.f12332a[this.f12331b.ordinal()];
            if (i12 == 1) {
                key2 = CaptureRequest.CONTROL_AE_MODE;
                i11 = 1;
            } else if (i12 == 2) {
                key2 = CaptureRequest.CONTROL_AE_MODE;
                i11 = 3;
            } else if (i12 == 3) {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                key = CaptureRequest.FLASH_MODE;
                i10 = 2;
                builder.set(key, i10);
            } else if (i12 == 4) {
                key2 = CaptureRequest.CONTROL_AE_MODE;
                i11 = 2;
            } else {
                return;
            }
            builder.set(key2, i11);
            key = CaptureRequest.FLASH_MODE;
            i10 = 0;
            builder.set(key, i10);
        }
    }

    public boolean b() {
        Boolean f10 = this.f11401a.f();
        return f10 != null && f10.booleanValue();
    }

    public void c(b bVar) {
        this.f12331b = bVar;
    }
}
