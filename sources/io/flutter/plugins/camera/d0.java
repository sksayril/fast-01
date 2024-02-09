package io.flutter.plugins.camera;

import android.app.Activity;
import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import io.flutter.embedding.engine.systemchannels.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class d0 {

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10166a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                io.flutter.embedding.engine.systemchannels.j$f[] r0 = io.flutter.embedding.engine.systemchannels.j.f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10166a = r0
                io.flutter.embedding.engine.systemchannels.j$f r1 = io.flutter.embedding.engine.systemchannels.j.f.PORTRAIT_UP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10166a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.embedding.engine.systemchannels.j$f r1 = io.flutter.embedding.engine.systemchannels.j.f.PORTRAIT_DOWN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10166a     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.flutter.embedding.engine.systemchannels.j$f r1 = io.flutter.embedding.engine.systemchannels.j.f.LANDSCAPE_LEFT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f10166a     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.flutter.embedding.engine.systemchannels.j$f r1 = io.flutter.embedding.engine.systemchannels.j.f.LANDSCAPE_RIGHT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.camera.d0.a.<clinit>():void");
        }
    }

    static j.f a(String str) {
        if (str != null) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case -2022952606:
                    if (str.equals("landscapeLeft")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -339013923:
                    if (str.equals("portraitDown")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 746015638:
                    if (str.equals("portraitUp")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1718639649:
                    if (str.equals("landscapeRight")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    return j.f.LANDSCAPE_LEFT;
                case 1:
                    return j.f.PORTRAIT_DOWN;
                case 2:
                    return j.f.PORTRAIT_UP;
                case 3:
                    return j.f.LANDSCAPE_RIGHT;
                default:
                    throw new UnsupportedOperationException("Could not deserialize device orientation: " + str);
            }
        } else {
            throw new UnsupportedOperationException("Could not deserialize null device orientation.");
        }
    }

    public static List<Map<String, Object>> b(Activity activity) {
        int i10;
        String str;
        CameraManager cameraManager = (CameraManager) activity.getSystemService("camera");
        String[] cameraIdList = cameraManager.getCameraIdList();
        ArrayList arrayList = new ArrayList();
        for (String str2 : cameraIdList) {
            try {
                i10 = Integer.parseInt(str2, 10);
            } catch (NumberFormatException unused) {
                i10 = -1;
            }
            if (i10 >= 0) {
                HashMap hashMap = new HashMap();
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str2);
                hashMap.put("name", str2);
                hashMap.put("sensorOrientation", Integer.valueOf(((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue()));
                int intValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue();
                if (intValue == 0) {
                    str = "front";
                } else if (intValue != 1) {
                    if (intValue == 2) {
                        str = "external";
                    }
                    arrayList.add(hashMap);
                } else {
                    str = "back";
                }
                hashMap.put("lensFacing", str);
                arrayList.add(hashMap);
            }
        }
        return arrayList;
    }

    static CameraManager c(Context context) {
        return (CameraManager) context.getSystemService("camera");
    }

    static String d(j.f fVar) {
        if (fVar != null) {
            int i10 = a.f10166a[fVar.ordinal()];
            if (i10 == 1) {
                return "portraitUp";
            }
            if (i10 == 2) {
                return "portraitDown";
            }
            if (i10 == 3) {
                return "landscapeLeft";
            }
            if (i10 == 4) {
                return "landscapeRight";
            }
            throw new UnsupportedOperationException("Could not serialize device orientation: " + fVar.toString());
        }
        throw new UnsupportedOperationException("Could not serialize null device orientation.");
    }
}
