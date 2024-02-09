package t5;

import android.hardware.Camera;
import android.util.Log;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f12447a = "t5.a";

    public static int a(int i10) {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            Log.w(f12447a, "No cameras!");
            return -1;
        }
        boolean z9 = i10 >= 0;
        if (!z9) {
            i10 = 0;
            while (i10 < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i10, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i10++;
            }
        }
        return i10 < numberOfCameras ? i10 : z9 ? -1 : 0;
    }

    public static Camera b(int i10) {
        int a10 = a(i10);
        if (a10 == -1) {
            return null;
        }
        return Camera.open(a10);
    }
}
