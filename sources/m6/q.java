package m6;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import java.io.ByteArrayOutputStream;
import o5.k;
import o5.p;

public class q {

    /* renamed from: a  reason: collision with root package name */
    private m f11245a;

    /* renamed from: b  reason: collision with root package name */
    private int f11246b;

    /* renamed from: c  reason: collision with root package name */
    private int f11247c;

    /* renamed from: d  reason: collision with root package name */
    private Rect f11248d;

    /* renamed from: e  reason: collision with root package name */
    private int f11249e = 1;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11250f;

    public q(byte[] bArr, int i10, int i11, int i12, int i13) {
        this.f11245a = new m(bArr, i10, i11);
        this.f11247c = i13;
        this.f11246b = i12;
        if (i10 * i11 > bArr.length) {
            throw new IllegalArgumentException("Image data does not match the resolution. " + i10 + "x" + i11 + " > " + bArr.length);
        }
    }

    public k a() {
        m a10 = this.f11245a.h(this.f11247c).a(this.f11248d, this.f11249e);
        return new k(a10.b(), a10.d(), a10.c(), 0, 0, a10.d(), a10.c(), false);
    }

    public Bitmap b(Rect rect, int i10) {
        if (rect == null) {
            rect = new Rect(0, 0, this.f11245a.d(), this.f11245a.c());
        } else if (c()) {
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        }
        YuvImage yuvImage = new YuvImage(this.f11245a.b(), this.f11246b, this.f11245a.d(), this.f11245a.c(), (int[]) null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i10;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        if (this.f11247c == 0) {
            return decodeByteArray;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate((float) this.f11247c);
        return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
    }

    public boolean c() {
        return this.f11247c % 180 != 0;
    }

    public void d(Rect rect) {
        this.f11248d = rect;
    }

    public void e(boolean z9) {
        this.f11250f = z9;
    }

    public p f(p pVar) {
        float c10 = (pVar.c() * ((float) this.f11249e)) + ((float) this.f11248d.left);
        float d10 = (pVar.d() * ((float) this.f11249e)) + ((float) this.f11248d.top);
        if (this.f11250f) {
            c10 = ((float) this.f11245a.d()) - c10;
        }
        return new p(c10, d10);
    }
}
