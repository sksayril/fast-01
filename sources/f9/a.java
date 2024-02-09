package f9;

import e9.c;
import java.util.concurrent.CancellationException;

public final class a extends CancellationException {

    /* renamed from: m  reason: collision with root package name */
    public final transient c<?> f8807m;

    public a(c<?> cVar) {
        super("Flow was aborted, no more elements needed");
        this.f8807m = cVar;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
