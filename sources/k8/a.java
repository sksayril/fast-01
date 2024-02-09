package k8;

import l8.b;

public enum a {
    COROUTINE_SUSPENDED,
    UNDECIDED,
    RESUMED;

    static {
        a[] $values;
        $ENTRIES = b.a($values);
    }

    public static l8.a<a> getEntries() {
        return $ENTRIES;
    }
}
