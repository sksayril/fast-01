package o9;

import android.media.MediaPlayer;

public final /* synthetic */ class d implements MediaPlayer.OnBufferingUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f11656a;

    public /* synthetic */ d(o oVar) {
        this.f11656a = oVar;
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
        i.y(this.f11656a, mediaPlayer, i10);
    }
}
