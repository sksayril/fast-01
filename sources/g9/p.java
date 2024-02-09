package g9;

public final class p {
    public static final void a(int i10) {
        boolean z9 = true;
        if (i10 < 1) {
            z9 = false;
        }
        if (!z9) {
            throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i10).toString());
        }
    }
}
