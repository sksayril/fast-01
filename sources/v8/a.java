package v8;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.l;

public final class a extends u8.a {
    public Random c() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        l.d(current, "current()");
        return current;
    }
}
