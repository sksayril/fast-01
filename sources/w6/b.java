package w6;

import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import k7.j;
import k7.k;
import kotlin.jvm.internal.l;

public final class b implements k.c {

    /* renamed from: m  reason: collision with root package name */
    private final PackageManager f12993m;

    /* renamed from: n  reason: collision with root package name */
    private final WindowManager f12994n;

    public b(PackageManager packageManager, WindowManager windowManager) {
        l.e(packageManager, "packageManager");
        l.e(windowManager, "windowManager");
        this.f12993m = packageManager;
        this.f12994n = windowManager;
    }

    private final List<String> a() {
        FeatureInfo[] systemAvailableFeatures = this.f12993m.getSystemAvailableFeatures();
        l.d(systemAvailableFeatures, "getSystemAvailableFeatures(...)");
        ArrayList<FeatureInfo> arrayList = new ArrayList<>();
        for (FeatureInfo featureInfo : systemAvailableFeatures) {
            if (!(featureInfo.name == null)) {
                arrayList.add(featureInfo);
            }
        }
        ArrayList arrayList2 = new ArrayList(o.i(arrayList, 10));
        for (FeatureInfo featureInfo2 : arrayList) {
            arrayList2.add(featureInfo2.name);
        }
        return arrayList2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (z8.o.r(r0, "generic", false, 2, (java.lang.Object) null) == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean b() {
        /*
            r6 = this;
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "BRAND"
            kotlin.jvm.internal.l.d(r0, r1)
            java.lang.String r1 = "generic"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r0 = z8.o.r(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r5 = "DEVICE"
            kotlin.jvm.internal.l.d(r0, r5)
            boolean r0 = z8.o.r(r0, r1, r2, r3, r4)
            if (r0 != 0) goto L_0x00b5
        L_0x001f:
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r5 = "FINGERPRINT"
            kotlin.jvm.internal.l.d(r0, r5)
            boolean r1 = z8.o.r(r0, r1, r2, r3, r4)
            if (r1 != 0) goto L_0x00b5
            kotlin.jvm.internal.l.d(r0, r5)
            java.lang.String r1 = "unknown"
            boolean r0 = z8.o.r(r0, r1, r2, r3, r4)
            if (r0 != 0) goto L_0x00b5
            java.lang.String r0 = android.os.Build.HARDWARE
            java.lang.String r1 = "HARDWARE"
            kotlin.jvm.internal.l.d(r0, r1)
            java.lang.String r5 = "goldfish"
            boolean r5 = z8.p.u(r0, r5, r2, r3, r4)
            if (r5 != 0) goto L_0x00b5
            kotlin.jvm.internal.l.d(r0, r1)
            java.lang.String r1 = "ranchu"
            boolean r0 = z8.p.u(r0, r1, r2, r3, r4)
            if (r0 != 0) goto L_0x00b5
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "MODEL"
            kotlin.jvm.internal.l.d(r0, r1)
            java.lang.String r5 = "google_sdk"
            boolean r5 = z8.p.u(r0, r5, r2, r3, r4)
            if (r5 != 0) goto L_0x00b5
            kotlin.jvm.internal.l.d(r0, r1)
            java.lang.String r5 = "Emulator"
            boolean r5 = z8.p.u(r0, r5, r2, r3, r4)
            if (r5 != 0) goto L_0x00b5
            kotlin.jvm.internal.l.d(r0, r1)
            java.lang.String r1 = "Android SDK built for x86"
            boolean r0 = z8.p.u(r0, r1, r2, r3, r4)
            if (r0 != 0) goto L_0x00b5
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "MANUFACTURER"
            kotlin.jvm.internal.l.d(r0, r1)
            java.lang.String r1 = "Genymotion"
            boolean r0 = z8.p.u(r0, r1, r2, r3, r4)
            if (r0 != 0) goto L_0x00b5
            java.lang.String r0 = android.os.Build.PRODUCT
            java.lang.String r1 = "PRODUCT"
            kotlin.jvm.internal.l.d(r0, r1)
            java.lang.String r5 = "sdk"
            boolean r5 = z8.p.u(r0, r5, r2, r3, r4)
            if (r5 != 0) goto L_0x00b5
            kotlin.jvm.internal.l.d(r0, r1)
            java.lang.String r5 = "vbox86p"
            boolean r5 = z8.p.u(r0, r5, r2, r3, r4)
            if (r5 != 0) goto L_0x00b5
            kotlin.jvm.internal.l.d(r0, r1)
            java.lang.String r5 = "emulator"
            boolean r5 = z8.p.u(r0, r5, r2, r3, r4)
            if (r5 != 0) goto L_0x00b5
            kotlin.jvm.internal.l.d(r0, r1)
            java.lang.String r1 = "simulator"
            boolean r0 = z8.p.u(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L_0x00b6
        L_0x00b5:
            r2 = 1
        L_0x00b6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.b.b():boolean");
    }

    public void onMethodCall(j jVar, k.d dVar) {
        String str;
        l.e(jVar, "call");
        l.e(dVar, "result");
        if (jVar.f10996a.equals("getDeviceInfo")) {
            HashMap hashMap = new HashMap();
            String str2 = Build.BOARD;
            l.d(str2, "BOARD");
            hashMap.put("board", str2);
            String str3 = Build.BOOTLOADER;
            l.d(str3, "BOOTLOADER");
            hashMap.put("bootloader", str3);
            String str4 = Build.BRAND;
            l.d(str4, "BRAND");
            hashMap.put("brand", str4);
            String str5 = Build.DEVICE;
            l.d(str5, "DEVICE");
            hashMap.put("device", str5);
            String str6 = Build.DISPLAY;
            l.d(str6, "DISPLAY");
            hashMap.put("display", str6);
            String str7 = Build.FINGERPRINT;
            l.d(str7, "FINGERPRINT");
            hashMap.put("fingerprint", str7);
            String str8 = Build.HARDWARE;
            l.d(str8, "HARDWARE");
            hashMap.put("hardware", str8);
            String str9 = Build.HOST;
            l.d(str9, "HOST");
            hashMap.put("host", str9);
            String str10 = Build.ID;
            l.d(str10, "ID");
            hashMap.put("id", str10);
            String str11 = Build.MANUFACTURER;
            l.d(str11, "MANUFACTURER");
            hashMap.put("manufacturer", str11);
            String str12 = Build.MODEL;
            l.d(str12, "MODEL");
            hashMap.put("model", str12);
            String str13 = Build.PRODUCT;
            l.d(str13, "PRODUCT");
            hashMap.put("product", str13);
            int i10 = Build.VERSION.SDK_INT;
            String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
            l.d(strArr, "SUPPORTED_32_BIT_ABIS");
            hashMap.put("supported32BitAbis", n.e(Arrays.copyOf(strArr, strArr.length)));
            String[] strArr2 = Build.SUPPORTED_64_BIT_ABIS;
            l.d(strArr2, "SUPPORTED_64_BIT_ABIS");
            hashMap.put("supported64BitAbis", n.e(Arrays.copyOf(strArr2, strArr2.length)));
            String[] strArr3 = Build.SUPPORTED_ABIS;
            l.d(strArr3, "SUPPORTED_ABIS");
            hashMap.put("supportedAbis", n.e(Arrays.copyOf(strArr3, strArr3.length)));
            String str14 = Build.TAGS;
            l.d(str14, "TAGS");
            hashMap.put("tags", str14);
            String str15 = Build.TYPE;
            l.d(str15, "TYPE");
            hashMap.put("type", str15);
            hashMap.put("isPhysicalDevice", Boolean.valueOf(!b()));
            hashMap.put("systemFeatures", a());
            HashMap hashMap2 = new HashMap();
            if (i10 >= 23) {
                String str16 = Build.VERSION.BASE_OS;
                l.d(str16, "BASE_OS");
                hashMap2.put("baseOS", str16);
                hashMap2.put("previewSdkInt", Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
                String str17 = Build.VERSION.SECURITY_PATCH;
                l.d(str17, "SECURITY_PATCH");
                hashMap2.put("securityPatch", str17);
            }
            String str18 = Build.VERSION.CODENAME;
            l.d(str18, "CODENAME");
            hashMap2.put("codename", str18);
            String str19 = Build.VERSION.INCREMENTAL;
            l.d(str19, "INCREMENTAL");
            hashMap2.put("incremental", str19);
            String str20 = Build.VERSION.RELEASE;
            l.d(str20, "RELEASE");
            hashMap2.put("release", str20);
            hashMap2.put("sdkInt", Integer.valueOf(i10));
            hashMap.put("version", hashMap2);
            Display defaultDisplay = this.f12994n.getDefaultDisplay();
            l.d(defaultDisplay, "getDefaultDisplay(...)");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            HashMap hashMap3 = new HashMap();
            hashMap3.put("widthPx", Double.valueOf((double) displayMetrics.widthPixels));
            hashMap3.put("heightPx", Double.valueOf((double) displayMetrics.heightPixels));
            hashMap3.put("xDpi", Float.valueOf(displayMetrics.xdpi));
            hashMap3.put("yDpi", Float.valueOf(displayMetrics.ydpi));
            hashMap.put("displayMetrics", hashMap3);
            if (i10 >= 26) {
                try {
                    str = Build.getSerial();
                } catch (SecurityException unused) {
                    str = "unknown";
                }
                l.b(str);
            } else {
                str = Build.SERIAL;
                l.d(str, "SERIAL");
            }
            hashMap.put("serialNumber", str);
            dVar.a(hashMap);
            return;
        }
        dVar.c();
    }
}
