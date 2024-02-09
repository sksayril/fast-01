package androidx.window.layout;

import kotlin.jvm.internal.l;

final class EmptyDecorator implements WindowInfoTrackerDecorator {
    public static final EmptyDecorator INSTANCE = new EmptyDecorator();

    private EmptyDecorator() {
    }

    public WindowInfoTracker decorate(WindowInfoTracker windowInfoTracker) {
        l.e(windowInfoTracker, "tracker");
        return windowInfoTracker;
    }
}
