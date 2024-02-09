package o9;

import android.media.SoundPool;

public final /* synthetic */ class k implements SoundPool.OnLoadCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f11663a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n f11664b;

    public /* synthetic */ k(l lVar, n nVar) {
        this.f11663a = lVar;
        this.f11664b = nVar;
    }

    public final void onLoadComplete(SoundPool soundPool, int i10, int i11) {
        l.c(this.f11663a, this.f11664b, soundPool, i10, i11);
    }
}
