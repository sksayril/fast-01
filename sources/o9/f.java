package o9;

import android.media.MediaPlayer;

public final /* synthetic */ class f implements MediaPlayer.OnErrorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f11658a;

    public /* synthetic */ f(o oVar) {
        this.f11658a = oVar;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        return i.x(this.f11658a, mediaPlayer, i10, i11);
    }
}
