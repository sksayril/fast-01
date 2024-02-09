package androidx.window.layout;

import androidx.window.layout.SidecarWindowBackend;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ SidecarWindowBackend.WindowLayoutChangeCallbackWrapper f3356m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ WindowLayoutInfo f3357n;

    public /* synthetic */ a(SidecarWindowBackend.WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper, WindowLayoutInfo windowLayoutInfo) {
        this.f3356m = windowLayoutChangeCallbackWrapper;
        this.f3357n = windowLayoutInfo;
    }

    public final void run() {
        SidecarWindowBackend.WindowLayoutChangeCallbackWrapper.m6accept$lambda0(this.f3356m, this.f3357n);
    }
}
