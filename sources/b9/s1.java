package b9;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.l;

public final class s1 extends CancellationException {

    /* renamed from: m  reason: collision with root package name */
    public final transient r1 f3490m;

    public s1(String str, Throwable th, r1 r1Var) {
        super(str);
        this.f3490m = r1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof s1) {
                s1 s1Var = (s1) obj;
                if (!l.a(s1Var.getMessage(), getMessage()) || !l.a(s1Var.f3490m, this.f3490m) || !l.a(s1Var.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        l.b(message);
        int hashCode = ((message.hashCode() * 31) + this.f3490m.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    public String toString() {
        return super.toString() + "; job=" + this.f3490m;
    }
}
