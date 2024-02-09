package d3;

public final class c extends IllegalStateException {
    private c(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(j<?> jVar) {
        if (!jVar.p()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception m10 = jVar.m();
        return new c("Complete with: ".concat(m10 != null ? "failure" : jVar.q() ? "result ".concat(String.valueOf(jVar.n())) : jVar.o() ? "cancellation" : "unknown issue"), m10);
    }
}
