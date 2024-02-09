package io.flutter.plugins.camera;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.util.Range;
import android.util.Rational;
import android.util.Size;

public class z implements y {

    /* renamed from: a  reason: collision with root package name */
    private final CameraCharacteristics f10304a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10305b;

    public z(String str, CameraManager cameraManager) {
        this.f10305b = str;
        this.f10304a = cameraManager.getCameraCharacteristics(str);
    }

    public int a() {
        return ((Integer) this.f10304a.get(CameraCharacteristics.LENS_FACING)).intValue();
    }

    public Integer b() {
        return (Integer) this.f10304a.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
    }

    public int[] c() {
        return (int[]) this.f10304a.get(CameraCharacteristics.NOISE_REDUCTION_AVAILABLE_NOISE_REDUCTION_MODES);
    }

    public Range<Integer> d() {
        return (Range) this.f10304a.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
    }

    public double e() {
        Rational rational = (Rational) this.f10304a.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
        if (rational == null) {
            return 0.0d;
        }
        return rational.doubleValue();
    }

    public Boolean f() {
        return (Boolean) this.f10304a.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
    }

    public Rect g() {
        return (Rect) this.f10304a.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
    }

    public int h() {
        return ((Integer) this.f10304a.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
    }

    public Float i() {
        Range range = (Range) this.f10304a.get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        if (range != null) {
            return (Float) range.getLower();
        }
        return null;
    }

    public int[] j() {
        return (int[]) this.f10304a.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
    }

    public int[] k() {
        return (int[]) this.f10304a.get(CameraCharacteristics.DISTORTION_CORRECTION_AVAILABLE_MODES);
    }

    public Float l() {
        return (Float) this.f10304a.get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
    }

    public Rect m() {
        return (Rect) this.f10304a.get(CameraCharacteristics.SENSOR_INFO_PRE_CORRECTION_ACTIVE_ARRAY_SIZE);
    }

    public Size n() {
        return (Size) this.f10304a.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
    }

    public Range<Integer>[] o() {
        return (Range[]) this.f10304a.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
    }

    public Float p() {
        return (Float) this.f10304a.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
    }

    public Float q() {
        Range range = (Range) this.f10304a.get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        if (range != null) {
            return (Float) range.getUpper();
        }
        return null;
    }

    public Integer r() {
        return (Integer) this.f10304a.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
    }

    public String s() {
        return this.f10305b;
    }
}
