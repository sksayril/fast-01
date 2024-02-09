package io.flutter.plugins.camera;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Size;
import io.flutter.embedding.engine.systemchannels.j;
import java.util.Arrays;

public final class b0 {

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10163a;

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
                f10163a = r0
                io.flutter.embedding.engine.systemchannels.j$f r1 = io.flutter.embedding.engine.systemchannels.j.f.PORTRAIT_UP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10163a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.embedding.engine.systemchannels.j$f r1 = io.flutter.embedding.engine.systemchannels.j.f.PORTRAIT_DOWN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10163a     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.flutter.embedding.engine.systemchannels.j$f r1 = io.flutter.embedding.engine.systemchannels.j.f.LANDSCAPE_LEFT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f10163a     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.flutter.embedding.engine.systemchannels.j$f r1 = io.flutter.embedding.engine.systemchannels.j.f.LANDSCAPE_RIGHT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.camera.b0.a.<clinit>():void");
        }
    }

    static class b {
        public static MeteringRectangle a(int i10, int i11, int i12, int i13, int i14) {
            return new MeteringRectangle(i10, i11, i12, i13, i14);
        }
    }

    static class c {
        public static Size a(int i10, int i11) {
            return new Size(i10, i11);
        }
    }

    public static MeteringRectangle b(Size size, double d10, double d11, j.f fVar) {
        int i10 = a.f10163a[fVar.ordinal()];
        if (i10 == 1) {
            double d12 = 1.0d - d10;
            d10 = d11;
            d11 = d12;
        } else if (i10 == 2) {
            double d13 = 1.0d - d11;
            d11 = d10;
            d10 = d13;
        } else if (i10 == 4) {
            d10 = 1.0d - d10;
            d11 = 1.0d - d11;
        }
        int round = (int) Math.round(d10 * ((double) (size.getWidth() - 1)));
        int round2 = (int) Math.round(d11 * ((double) (size.getHeight() - 1)));
        int round3 = (int) Math.round(((double) size.getWidth()) / 10.0d);
        int round4 = (int) Math.round(((double) size.getHeight()) / 10.0d);
        int i11 = round - (round3 / 2);
        int i12 = round2 - (round4 / 2);
        if (i11 < 0) {
            i11 = 0;
        }
        if (i12 < 0) {
            i12 = 0;
        }
        int width = (size.getWidth() - 1) - round3;
        int height = (size.getHeight() - 1) - round4;
        if (i11 > width) {
            i11 = width;
        }
        if (i12 > height) {
            i12 = height;
        }
        return b.a(i11, i12, round3, round4, 1);
    }

    public static Size c(y yVar, CaptureRequest.Builder builder) {
        if (!n0.a() || !e(yVar)) {
            return yVar.n();
        }
        Integer num = (Integer) builder.get(CaptureRequest.DISTORTION_CORRECTION_MODE);
        Rect m10 = (num == null || num.intValue() == 0) ? yVar.m() : yVar.g();
        return c.a(m10.width(), m10.height());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean d(int i10) {
        return i10 != 0;
    }

    @TargetApi(28)
    private static boolean e(y yVar) {
        int[] k10 = yVar.k();
        if (k10 == null) {
            k10 = new int[0];
        }
        return Arrays.stream(k10).filter(a0.f10161a).count() > 0;
    }
}
