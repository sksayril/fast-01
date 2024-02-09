package io.flutter.plugins.camera;

import android.annotation.TargetApi;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Handler;
import android.view.Surface;
import java.util.List;

interface t {
    void a(List<Surface> list, CameraCaptureSession.StateCallback stateCallback, Handler handler);

    @TargetApi(28)
    void b(SessionConfiguration sessionConfiguration);

    CaptureRequest.Builder c(int i10);

    void close();
}
