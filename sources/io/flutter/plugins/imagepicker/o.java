package io.flutter.plugins.imagepicker;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import androidx.core.util.i;
import androidx.exifinterface.media.a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class o {

    /* renamed from: a  reason: collision with root package name */
    private final Context f10579a;

    /* renamed from: b  reason: collision with root package name */
    private final a f10580b;

    o(Context context, a aVar) {
        this.f10579a = context;
        this.f10580b = aVar;
    }

    private int a(BitmapFactory.Options options, int i10, int i11) {
        int i12 = options.outHeight;
        int i13 = options.outWidth;
        int i14 = 1;
        if (i12 > i11 || i13 > i10) {
            int i15 = i12 / 2;
            int i16 = i13 / 2;
            while (i15 / i14 >= i11 && i16 / i14 >= i10) {
                i14 *= 2;
            }
        }
        return i14;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0084, code lost:
        if (r2 == false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008b, code lost:
        r5 = java.lang.Double.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009c, code lost:
        if (r3 == false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b6, code lost:
        if (r13.doubleValue() < r12.doubleValue()) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.core.util.i b(java.lang.Double r12, java.lang.Double r13, java.lang.Double r14, java.lang.Double r15) {
        /*
            r11 = this;
            r0 = 1
            r1 = 0
            if (r14 == 0) goto L_0x0006
            r2 = 1
            goto L_0x0007
        L_0x0006:
            r2 = 0
        L_0x0007:
            if (r15 == 0) goto L_0x000b
            r3 = 1
            goto L_0x000c
        L_0x000b:
            r3 = 0
        L_0x000c:
            double r4 = r12.doubleValue()
            if (r2 == 0) goto L_0x001a
            double r6 = r14.doubleValue()
            double r4 = java.lang.Math.min(r4, r6)
        L_0x001a:
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            double r5 = r13.doubleValue()
            if (r3 == 0) goto L_0x002c
            double r7 = r15.doubleValue()
            double r5 = java.lang.Math.min(r5, r7)
        L_0x002c:
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            if (r2 == 0) goto L_0x0040
            double r6 = r14.doubleValue()
            double r8 = r12.doubleValue()
            int r14 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r14 >= 0) goto L_0x0040
            r14 = 1
            goto L_0x0041
        L_0x0040:
            r14 = 0
        L_0x0041:
            if (r3 == 0) goto L_0x0051
            double r6 = r15.doubleValue()
            double r8 = r13.doubleValue()
            int r15 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r15 >= 0) goto L_0x0051
            r15 = 1
            goto L_0x0052
        L_0x0051:
            r15 = 0
        L_0x0052:
            if (r14 != 0) goto L_0x0058
            if (r15 == 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r0 = 0
        L_0x0058:
            if (r0 == 0) goto L_0x00b9
            double r14 = r5.doubleValue()
            double r0 = r13.doubleValue()
            double r14 = r14 / r0
            double r0 = r12.doubleValue()
            double r14 = r14 * r0
            double r0 = r4.doubleValue()
            double r6 = r12.doubleValue()
            double r0 = r0 / r6
            double r6 = r13.doubleValue()
            double r0 = r0 * r6
            double r6 = r4.doubleValue()
            double r8 = r5.doubleValue()
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x0090
            if (r2 != 0) goto L_0x008b
        L_0x0086:
            java.lang.Double r4 = java.lang.Double.valueOf(r14)
            goto L_0x00b9
        L_0x008b:
            java.lang.Double r5 = java.lang.Double.valueOf(r0)
            goto L_0x00b9
        L_0x0090:
            double r6 = r5.doubleValue()
            double r8 = r4.doubleValue()
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x009f
            if (r3 != 0) goto L_0x0086
            goto L_0x008b
        L_0x009f:
            double r2 = r12.doubleValue()
            double r6 = r13.doubleValue()
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x00ac
            goto L_0x0086
        L_0x00ac:
            double r13 = r13.doubleValue()
            double r2 = r12.doubleValue()
            int r12 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r12 >= 0) goto L_0x00b9
            goto L_0x008b
        L_0x00b9:
            androidx.core.util.i r12 = new androidx.core.util.i
            float r13 = r4.floatValue()
            float r14 = r5.floatValue()
            r12.<init>(r13, r14)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.imagepicker.o.b(java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double):androidx.core.util.i");
    }

    private void c(String str, String str2) {
        try {
            this.f10580b.a(new a(str), new a(str2));
        } catch (Exception e10) {
            Log.e("ImageResizer", "Error preserving Exif data on selected image: " + e10);
        }
    }

    private File d(File file, String str) {
        File file2 = new File(file, str);
        if (!file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        return file2;
    }

    private File e(String str, Bitmap bitmap, int i10) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean hasAlpha = bitmap.hasAlpha();
        if (hasAlpha) {
            Log.d("ImageResizer", "image_picker: compressing is not supported for type PNG. Returning the image with original quality");
        }
        bitmap.compress(hasAlpha ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, i10, byteArrayOutputStream);
        File d10 = d(this.f10579a.getCacheDir(), str);
        FileOutputStream f10 = f(d10);
        f10.write(byteArrayOutputStream.toByteArray());
        f10.close();
        return d10;
    }

    private FileOutputStream f(File file) {
        return new FileOutputStream(file);
    }

    private Bitmap g(Bitmap bitmap, int i10, int i11, boolean z9) {
        return Bitmap.createScaledBitmap(bitmap, i10, i11, z9);
    }

    private Bitmap h(String str, BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(str, options);
    }

    private i i(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        h(str, options);
        return new i((float) options.outWidth, (float) options.outHeight);
    }

    private File k(Bitmap bitmap, Double d10, Double d11, int i10, String str) {
        Bitmap g10 = g(bitmap, d10.intValue(), d11.intValue(), false);
        return e("/scaled_" + str, g10, i10);
    }

    /* access modifiers changed from: package-private */
    public String j(String str, Double d10, Double d11, int i10) {
        i i11 = i(str);
        if (i11.b() == -1.0f || i11.a() == -1.0f) {
            return str;
        }
        if (!((d10 == null && d11 == null && i10 >= 100) ? false : true)) {
            return str;
        }
        try {
            String[] split = str.split("/");
            String str2 = split[split.length - 1];
            i b10 = b(Double.valueOf((double) i11.b()), Double.valueOf((double) i11.a()), d10, d11);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = a(options, (int) b10.b(), (int) b10.a());
            Bitmap h10 = h(str, options);
            if (h10 == null) {
                return str;
            }
            File k10 = k(h10, Double.valueOf((double) b10.b()), Double.valueOf((double) b10.a()), i10, str2);
            c(str, k10.getPath());
            return k10.getPath();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
