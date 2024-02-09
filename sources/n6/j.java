package n6;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.SurfaceHolder;

public class j {

    /* renamed from: a  reason: collision with root package name */
    private SurfaceHolder f11385a;

    /* renamed from: b  reason: collision with root package name */
    private SurfaceTexture f11386b;

    public j(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != null) {
            this.f11386b = surfaceTexture;
            return;
        }
        throw new IllegalArgumentException("surfaceTexture may not be null");
    }

    public j(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            this.f11385a = surfaceHolder;
            return;
        }
        throw new IllegalArgumentException("surfaceHolder may not be null");
    }

    public void a(Camera camera) {
        SurfaceHolder surfaceHolder = this.f11385a;
        if (surfaceHolder != null) {
            camera.setPreviewDisplay(surfaceHolder);
        } else {
            camera.setPreviewTexture(this.f11386b);
        }
    }
}
