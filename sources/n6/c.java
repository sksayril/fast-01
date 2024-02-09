package n6;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import n6.i;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f11334a = Pattern.compile(";");

    @TargetApi(15)
    private static List<Camera.Area> a(int i10) {
        int i11 = -i10;
        return Collections.singletonList(new Camera.Area(new Rect(i11, i11, i10, i10), 1));
    }

    private static String b(String str, Collection<String> collection, String... strArr) {
        Log.i("CameraConfiguration", "Requesting " + str + " value from among: " + Arrays.toString(strArr));
        Log.i("CameraConfiguration", "Supported " + str + " values: " + collection);
        if (collection != null) {
            for (String str2 : strArr) {
                if (collection.contains(str2)) {
                    Log.i("CameraConfiguration", "Can set " + str + " to: " + str2);
                    return str2;
                }
            }
        }
        Log.i("CameraConfiguration", "No supported values match");
        return null;
    }

    public static void c(Camera.Parameters parameters) {
        if ("barcode".equals(parameters.getSceneMode())) {
            Log.i("CameraConfiguration", "Barcode scene mode already set");
            return;
        }
        String b10 = b("scene mode", parameters.getSupportedSceneModes(), "barcode");
        if (b10 != null) {
            parameters.setSceneMode(b10);
        }
    }

    public static void d(Camera.Parameters parameters, boolean z9) {
        String str;
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        if (!(minExposureCompensation == 0 && maxExposureCompensation == 0)) {
            float f10 = 0.0f;
            if (exposureCompensationStep > 0.0f) {
                if (!z9) {
                    f10 = 1.5f;
                }
                int round = Math.round(f10 / exposureCompensationStep);
                float f11 = exposureCompensationStep * ((float) round);
                int max = Math.max(Math.min(round, maxExposureCompensation), minExposureCompensation);
                if (parameters.getExposureCompensation() == max) {
                    str = "Exposure compensation already set to " + max + " / " + f11;
                    Log.i("CameraConfiguration", str);
                }
                Log.i("CameraConfiguration", "Setting exposure compensation to " + max + " / " + f11);
                parameters.setExposureCompensation(max);
                return;
            }
        }
        str = "Camera does not support exposure compensation";
        Log.i("CameraConfiguration", str);
    }

    public static void e(Camera.Parameters parameters) {
        f(parameters, 10, 20);
    }

    public static void f(Camera.Parameters parameters, int i10, int i11) {
        String str;
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        Log.i("CameraConfiguration", "Supported FPS ranges: " + n(supportedPreviewFpsRange));
        if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
            int[] iArr = null;
            Iterator<int[]> it = supportedPreviewFpsRange.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int[] next = it.next();
                int i12 = next[0];
                int i13 = next[1];
                if (i12 >= i10 * 1000 && i13 <= i11 * 1000) {
                    iArr = next;
                    break;
                }
            }
            if (iArr == null) {
                str = "No suitable FPS range?";
            } else {
                int[] iArr2 = new int[2];
                parameters.getPreviewFpsRange(iArr2);
                if (Arrays.equals(iArr2, iArr)) {
                    str = "FPS range already set to " + Arrays.toString(iArr);
                } else {
                    Log.i("CameraConfiguration", "Setting FPS range to " + Arrays.toString(iArr));
                    parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                    return;
                }
            }
            Log.i("CameraConfiguration", str);
        }
    }

    public static void g(Camera.Parameters parameters, i.a aVar, boolean z9) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        String b10 = (z9 || aVar == i.a.AUTO) ? b("focus mode", supportedFocusModes, "auto") : aVar == i.a.CONTINUOUS ? b("focus mode", supportedFocusModes, "continuous-picture", "continuous-video", "auto") : aVar == i.a.INFINITY ? b("focus mode", supportedFocusModes, "infinity") : aVar == i.a.MACRO ? b("focus mode", supportedFocusModes, "macro") : null;
        if (!z9 && b10 == null) {
            b10 = b("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (b10 == null) {
            return;
        }
        if (b10.equals(parameters.getFocusMode())) {
            Log.i("CameraConfiguration", "Focus mode already set to " + b10);
            return;
        }
        parameters.setFocusMode(b10);
    }

    @TargetApi(15)
    public static void h(Camera.Parameters parameters) {
        if (parameters.getMaxNumFocusAreas() > 0) {
            Log.i("CameraConfiguration", "Old focus areas: " + m(parameters.getFocusAreas()));
            List<Camera.Area> a10 = a(400);
            Log.i("CameraConfiguration", "Setting focus area to : " + m(a10));
            parameters.setFocusAreas(a10);
            return;
        }
        Log.i("CameraConfiguration", "Device does not support focus areas");
    }

    public static void i(Camera.Parameters parameters) {
        if ("negative".equals(parameters.getColorEffect())) {
            Log.i("CameraConfiguration", "Negative effect already set");
            return;
        }
        String b10 = b("color effect", parameters.getSupportedColorEffects(), "negative");
        if (b10 != null) {
            parameters.setColorEffect(b10);
        }
    }

    @TargetApi(15)
    public static void j(Camera.Parameters parameters) {
        if (parameters.getMaxNumMeteringAreas() > 0) {
            Log.i("CameraConfiguration", "Old metering areas: " + parameters.getMeteringAreas());
            List<Camera.Area> a10 = a(400);
            Log.i("CameraConfiguration", "Setting metering area to : " + m(a10));
            parameters.setMeteringAreas(a10);
            return;
        }
        Log.i("CameraConfiguration", "Device does not support metering areas");
    }

    public static void k(Camera.Parameters parameters, boolean z9) {
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        String b10 = z9 ? b("flash mode", supportedFlashModes, "torch", "on") : b("flash mode", supportedFlashModes, "off");
        if (b10 == null) {
            return;
        }
        if (b10.equals(parameters.getFlashMode())) {
            Log.i("CameraConfiguration", "Flash mode already set to " + b10);
            return;
        }
        Log.i("CameraConfiguration", "Setting flash mode to " + b10);
        parameters.setFlashMode(b10);
    }

    @TargetApi(15)
    public static void l(Camera.Parameters parameters) {
        String str;
        if (!parameters.isVideoStabilizationSupported()) {
            str = "This device does not support video stabilization";
        } else if (parameters.getVideoStabilization()) {
            str = "Video stabilization already enabled";
        } else {
            Log.i("CameraConfiguration", "Enabling video stabilization...");
            parameters.setVideoStabilization(true);
            return;
        }
        Log.i("CameraConfiguration", str);
    }

    @TargetApi(15)
    private static String m(Iterable<Camera.Area> iterable) {
        if (iterable == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Camera.Area next : iterable) {
            sb.append(next.rect);
            sb.append(':');
            sb.append(next.weight);
            sb.append(' ');
        }
        return sb.toString();
    }

    private static String n(Collection<int[]> collection) {
        if (collection == null || collection.isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator<int[]> it = collection.iterator();
        while (it.hasNext()) {
            sb.append(Arrays.toString(it.next()));
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }
}
