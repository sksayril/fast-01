package androidx.profileinstaller;

import android.content.Context;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ ProfileInstallerInitializer f2852m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Context f2853n;

    public /* synthetic */ l(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f2852m = profileInstallerInitializer;
        this.f2853n = context;
    }

    public final void run() {
        this.f2852m.i(this.f2853n);
    }
}
