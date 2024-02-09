package a9;

import java.util.concurrent.TimeUnit;
import l8.a;
import l8.b;

public enum e {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);
    
    private final TimeUnit timeUnit;

    static {
        e[] $values;
        $ENTRIES = b.a($values);
    }

    private e(TimeUnit timeUnit2) {
        this.timeUnit = timeUnit2;
    }

    public static a<e> getEntries() {
        return $ENTRIES;
    }

    public final TimeUnit getTimeUnit$kotlin_stdlib() {
        return this.timeUnit;
    }
}
