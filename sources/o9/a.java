package o9;

import android.media.AudioManager;

public final /* synthetic */ class a implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f11649a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r8.a f11650b;

    public /* synthetic */ a(c cVar, r8.a aVar) {
        this.f11649a = cVar;
        this.f11650b = aVar;
    }

    public final void onAudioFocusChange(int i10) {
        c.i(this.f11649a, this.f11650b, i10);
    }
}
