package o7;

import android.annotation.SuppressLint;
import android.hardware.camera2.CaptureRequest;
import io.flutter.plugins.camera.y;

public class a extends n7.a<b> {

    /* renamed from: b  reason: collision with root package name */
    private b f11644b = b.auto;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f11645c;

    /* renamed from: o7.a$a  reason: collision with other inner class name */
    static /* synthetic */ class C0192a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11646a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                o7.b[] r0 = o7.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11646a = r0
                o7.b r1 = o7.b.locked     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11646a     // Catch:{ NoSuchFieldError -> 0x001d }
                o7.b r1 = o7.b.auto     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o7.a.C0192a.<clinit>():void");
        }
    }

    public a(y yVar, boolean z9) {
        super(yVar);
        this.f11645c = z9;
    }

    public void a(CaptureRequest.Builder builder) {
        CaptureRequest.Key key;
        if (b()) {
            int i10 = C0192a.f11646a[this.f11644b.ordinal()];
            int i11 = 1;
            if (i10 == 1) {
                key = CaptureRequest.CONTROL_AF_MODE;
            } else if (i10 == 2) {
                key = CaptureRequest.CONTROL_AF_MODE;
                i11 = this.f11645c ? 3 : 4;
            } else {
                return;
            }
            builder.set(key, Integer.valueOf(i11));
        }
    }

    public boolean b() {
        int[] j10 = this.f11401a.j();
        Float l10 = this.f11401a.l();
        if ((l10 == null || l10.floatValue() == 0.0f) || j10.length == 0) {
            return false;
        }
        return (j10.length == 1 && j10[0] == 0) ? false : true;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public b c() {
        return this.f11644b;
    }

    public void d(b bVar) {
        this.f11644b = bVar;
    }
}
