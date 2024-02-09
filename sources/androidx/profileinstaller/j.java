package androidx.profileinstaller;

import android.content.Context;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Context f2850m;

    public /* synthetic */ j(Context context) {
        this.f2850m = context;
    }

    public final void run() {
        ProfileInstallerInitializer.l(this.f2850m);
    }
}
