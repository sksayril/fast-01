package io.flutter.plugins.camera;

import android.app.Activity;
import k7.p;

final class v {

    /* renamed from: a  reason: collision with root package name */
    boolean f10298a = false;

    static final class a implements p {

        /* renamed from: m  reason: collision with root package name */
        boolean f10299m = false;

        /* renamed from: n  reason: collision with root package name */
        final c f10300n;

        a(c cVar) {
            this.f10300n = cVar;
        }

        public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
            String str;
            c cVar;
            String str2;
            if (this.f10299m || i10 != 9796) {
                return false;
            }
            this.f10299m = true;
            if (iArr.length == 0 || iArr[0] != 0) {
                cVar = this.f10300n;
                str = "CameraAccessDenied";
                str2 = "Camera access permission was denied.";
            } else if (iArr.length <= 1 || iArr[1] == 0) {
                this.f10300n.a((String) null, (String) null);
                return true;
            } else {
                cVar = this.f10300n;
                str = "AudioAccessDenied";
                str2 = "Audio access permission was denied.";
            }
            cVar.a(str, str2);
            return true;
        }
    }

    interface b {
        void a(p pVar);
    }

    interface c {
        void a(String str, String str2);
    }

    v() {
    }

    private boolean b(Activity activity) {
        return androidx.core.content.a.a(activity, "android.permission.RECORD_AUDIO") == 0;
    }

    private boolean c(Activity activity) {
        return androidx.core.content.a.a(activity, "android.permission.CAMERA") == 0;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(c cVar, String str, String str2) {
        this.f10298a = false;
        cVar.a(str, str2);
    }

    /* access modifiers changed from: package-private */
    public void e(Activity activity, b bVar, boolean z9, c cVar) {
        if (this.f10298a) {
            cVar.a("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
        } else if (!c(activity) || (z9 && !b(activity))) {
            bVar.a(new a(new u(this, cVar)));
            this.f10298a = true;
            androidx.core.app.b.s(activity, z9 ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
        } else {
            cVar.a((String) null, (String) null);
        }
    }
}
