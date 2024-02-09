package z7;

import a8.a;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k7.d;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final int f13604a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageReader f13605b;

    /* renamed from: c  reason: collision with root package name */
    private final e f13606c = new e();

    public d(int i10, int i11, int i12, int i13) {
        this.f13604a = i12;
        this.f13605b = ImageReader.newInstance(i10, i11, e(i12), i13);
    }

    public static int e(int i10) {
        if (i10 == 17) {
            return 35;
        }
        return i10;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i(a aVar, d.b bVar, ImageReader imageReader) {
        Image acquireNextImage = imageReader.acquireNextImage();
        if (acquireNextImage != null) {
            j(acquireNextImage, aVar, bVar);
        }
    }

    public void d() {
        this.f13605b.close();
    }

    public Surface f() {
        return this.f13605b.getSurface();
    }

    public void j(Image image, a aVar, d.b bVar) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("planes", this.f13604a == 17 ? k(image) : l(image));
            hashMap.put("width", Integer.valueOf(image.getWidth()));
            hashMap.put("height", Integer.valueOf(image.getHeight()));
            hashMap.put("format", Integer.valueOf(this.f13604a));
            hashMap.put("lensAperture", aVar.a());
            hashMap.put("sensorExposureTime", aVar.b());
            Integer c10 = aVar.c();
            hashMap.put("sensorSensitivity", c10 == null ? null : Double.valueOf((double) c10.intValue()));
            new Handler(Looper.getMainLooper()).post(new c(bVar, hashMap));
            image.close();
        } catch (IllegalStateException e10) {
            new Handler(Looper.getMainLooper()).post(new b(bVar, e10));
            image.close();
        }
    }

    public List<Map<String, Object>> k(Image image) {
        ArrayList arrayList = new ArrayList();
        ByteBuffer c10 = this.f13606c.c(image.getPlanes(), image.getWidth(), image.getHeight());
        HashMap hashMap = new HashMap();
        hashMap.put("bytesPerRow", Integer.valueOf(image.getWidth()));
        hashMap.put("bytesPerPixel", 1);
        hashMap.put("bytes", c10.array());
        arrayList.add(hashMap);
        return arrayList;
    }

    public List<Map<String, Object>> l(Image image) {
        ArrayList arrayList = new ArrayList();
        for (Image.Plane plane : image.getPlanes()) {
            ByteBuffer buffer = plane.getBuffer();
            int remaining = buffer.remaining();
            byte[] bArr = new byte[remaining];
            buffer.get(bArr, 0, remaining);
            HashMap hashMap = new HashMap();
            hashMap.put("bytesPerRow", Integer.valueOf(plane.getRowStride()));
            hashMap.put("bytesPerPixel", Integer.valueOf(plane.getPixelStride()));
            hashMap.put("bytes", bArr);
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public void m(Handler handler) {
        this.f13605b.setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, handler);
    }

    public void n(a aVar, d.b bVar, Handler handler) {
        this.f13605b.setOnImageAvailableListener(new a(this, aVar, bVar), handler);
    }
}
