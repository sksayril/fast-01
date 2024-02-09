package io.flutter.embedding.android;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import j7.c;
import java.nio.ByteBuffer;
import java.util.Locale;

@TargetApi(19)
public class g extends View implements c {

    /* renamed from: m  reason: collision with root package name */
    private ImageReader f9704m;

    /* renamed from: n  reason: collision with root package name */
    private Image f9705n;

    /* renamed from: o  reason: collision with root package name */
    private Bitmap f9706o;

    /* renamed from: p  reason: collision with root package name */
    private j7.a f9707p;

    /* renamed from: q  reason: collision with root package name */
    private b f9708q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f9709r;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9710a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.flutter.embedding.android.g$b[] r0 = io.flutter.embedding.android.g.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9710a = r0
                io.flutter.embedding.android.g$b r1 = io.flutter.embedding.android.g.b.background     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9710a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.embedding.android.g$b r1 = io.flutter.embedding.android.g.b.overlay     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.g.a.<clinit>():void");
        }
    }

    public enum b {
        background,
        overlay
    }

    public g(Context context, int i10, int i11, b bVar) {
        this(context, g(i10, i11), bVar);
    }

    g(Context context, ImageReader imageReader, b bVar) {
        super(context, (AttributeSet) null);
        this.f9709r = false;
        this.f9704m = imageReader;
        this.f9708q = bVar;
        h();
    }

    private void e() {
        Image image = this.f9705n;
        if (image != null) {
            image.close();
            this.f9705n = null;
        }
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(19)
    private static ImageReader g(int i10, int i11) {
        int i12;
        int i13;
        if (i10 <= 0) {
            i("ImageReader width must be greater than 0, but given width=%d, set width=1", Integer.valueOf(i10));
            i12 = 1;
        } else {
            i12 = i10;
        }
        if (i11 <= 0) {
            i("ImageReader height must be greater than 0, but given height=%d, set height=1", Integer.valueOf(i11));
            i13 = 1;
        } else {
            i13 = i11;
        }
        return Build.VERSION.SDK_INT >= 29 ? ImageReader.newInstance(i12, i13, 1, 3, 768) : ImageReader.newInstance(i12, i13, 1, 3);
    }

    private void h() {
        setAlpha(0.0f);
    }

    private static void i(String str, Object... objArr) {
        x6.b.g("FlutterImageView", String.format(Locale.US, str, objArr));
    }

    @TargetApi(29)
    private void k() {
        if (Build.VERSION.SDK_INT >= 29) {
            HardwareBuffer hardwareBuffer = this.f9705n.getHardwareBuffer();
            this.f9706o = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
            hardwareBuffer.close();
            return;
        }
        Image.Plane[] planes = this.f9705n.getPlanes();
        if (planes.length == 1) {
            Image.Plane plane = planes[0];
            int rowStride = plane.getRowStride() / plane.getPixelStride();
            int height = this.f9705n.getHeight();
            Bitmap bitmap = this.f9706o;
            if (!(bitmap != null && bitmap.getWidth() == rowStride && this.f9706o.getHeight() == height)) {
                this.f9706o = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
            }
            ByteBuffer buffer = plane.getBuffer();
            buffer.rewind();
            this.f9706o.copyPixelsFromBuffer(buffer);
        }
    }

    @TargetApi(19)
    public boolean a() {
        if (!this.f9709r) {
            return false;
        }
        Image acquireLatestImage = this.f9704m.acquireLatestImage();
        if (acquireLatestImage != null) {
            e();
            this.f9705n = acquireLatestImage;
            invalidate();
        }
        return acquireLatestImage != null;
    }

    public void b() {
    }

    public void c(j7.a aVar) {
        if (a.f9710a[this.f9708q.ordinal()] == 1) {
            aVar.x(this.f9704m.getSurface());
        }
        setAlpha(1.0f);
        this.f9707p = aVar;
        this.f9709r = true;
    }

    public void d() {
        if (this.f9709r) {
            setAlpha(0.0f);
            a();
            this.f9706o = null;
            e();
            invalidate();
            this.f9709r = false;
        }
    }

    public void f() {
        this.f9704m.close();
    }

    public j7.a getAttachedRenderer() {
        return this.f9707p;
    }

    public ImageReader getImageReader() {
        return this.f9704m;
    }

    public Surface getSurface() {
        return this.f9704m.getSurface();
    }

    public void j(int i10, int i11) {
        if (this.f9707p != null) {
            if (i10 != this.f9704m.getWidth() || i11 != this.f9704m.getHeight()) {
                e();
                f();
                this.f9704m = g(i10, i11);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f9705n != null) {
            k();
        }
        Bitmap bitmap = this.f9706o;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (!(i10 == this.f9704m.getWidth() && i11 == this.f9704m.getHeight()) && this.f9708q == b.background && this.f9709r) {
            j(i10, i11);
            this.f9707p.x(this.f9704m.getSurface());
        }
    }
}
