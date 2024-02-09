package z7;

import android.media.ImageReader;
import k7.d;

public final /* synthetic */ class a implements ImageReader.OnImageAvailableListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f13597a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a8.a f13598b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d.b f13599c;

    public /* synthetic */ a(d dVar, a8.a aVar, d.b bVar) {
        this.f13597a = dVar;
        this.f13598b = aVar;
        this.f13599c = bVar;
    }

    public final void onImageAvailable(ImageReader imageReader) {
        this.f13597a.i(this.f13598b, this.f13599c, imageReader);
    }
}
