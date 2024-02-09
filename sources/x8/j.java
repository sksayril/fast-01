package x8;

import l8.a;
import l8.b;

public enum j {
    PUBLIC,
    PROTECTED,
    INTERNAL,
    PRIVATE;

    static {
        j[] $values;
        $ENTRIES = b.a($values);
    }

    public static a<j> getEntries() {
        return $ENTRIES;
    }
}
