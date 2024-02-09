package androidx.profileinstaller;

import android.view.Choreographer;

public final /* synthetic */ class m implements Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f2854a;

    public /* synthetic */ m(Runnable runnable) {
        this.f2854a = runnable;
    }

    public final void doFrame(long j10) {
        this.f2854a.run();
    }
}
