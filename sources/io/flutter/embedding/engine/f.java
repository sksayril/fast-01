package io.flutter.embedding.engine;

import android.graphics.ImageDecoder;

public final /* synthetic */ class f implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f9855a;

    public /* synthetic */ f(long j10) {
        this.f9855a = j10;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        FlutterJNI.lambda$decodeImage$0(this.f9855a, imageDecoder, imageInfo, source);
    }
}
