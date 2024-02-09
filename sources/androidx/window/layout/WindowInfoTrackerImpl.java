package androidx.window.layout;

import android.app.Activity;
import e9.b;
import e9.d;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

public final class WindowInfoTrackerImpl implements WindowInfoTracker {
    private static final int BUFFER_CAPACITY = 10;
    public static final Companion Companion = new Companion((g) null);
    /* access modifiers changed from: private */
    public final WindowBackend windowBackend;
    private final WindowMetricsCalculator windowMetricsCalculator;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public WindowInfoTrackerImpl(WindowMetricsCalculator windowMetricsCalculator2, WindowBackend windowBackend2) {
        l.e(windowMetricsCalculator2, "windowMetricsCalculator");
        l.e(windowBackend2, "windowBackend");
        this.windowMetricsCalculator = windowMetricsCalculator2;
        this.windowBackend = windowBackend2;
    }

    public b<WindowLayoutInfo> windowLayoutInfo(Activity activity) {
        l.e(activity, "activity");
        return d.g(new WindowInfoTrackerImpl$windowLayoutInfo$1(this, activity, (j8.d<? super WindowInfoTrackerImpl$windowLayoutInfo$1>) null));
    }
}
