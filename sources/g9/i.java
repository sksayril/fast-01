package g9;

import j8.g;

public final class i extends RuntimeException {

    /* renamed from: m  reason: collision with root package name */
    private final transient g f8993m;

    public i(g gVar) {
        this.f8993m = gVar;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public String getLocalizedMessage() {
        return this.f8993m.toString();
    }
}
