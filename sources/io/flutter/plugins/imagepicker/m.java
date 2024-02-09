package io.flutter.plugins.imagepicker;

import android.media.MediaScannerConnection;
import android.net.Uri;
import io.flutter.plugins.imagepicker.l;

public final /* synthetic */ class m implements MediaScannerConnection.OnScanCompletedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l.f f10578a;

    public /* synthetic */ m(l.f fVar) {
        this.f10578a = fVar;
    }

    public final void onScanCompleted(String str, Uri uri) {
        this.f10578a.a(str);
    }
}
