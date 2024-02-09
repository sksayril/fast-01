package o9;

import android.media.AudioManager;
import r8.a;

public final /* synthetic */ class b implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f11651a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f11652b;

    public /* synthetic */ b(c cVar, a aVar) {
        this.f11651a = cVar;
        this.f11652b = aVar;
    }

    public final void onAudioFocusChange(int i10) {
        c.k(this.f11651a, this.f11652b, i10);
    }
}
