package androidx.profileinstaller;

enum f {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);
    
    private final long mValue;

    private f(long j10) {
        this.mValue = j10;
    }

    static f fromValue(long j10) {
        f[] values = values();
        for (int i10 = 0; i10 < values.length; i10++) {
            if (values[i10].getValue() == j10) {
                return values[i10];
            }
        }
        throw new IllegalArgumentException("Unsupported FileSection Type " + j10);
    }

    public long getValue() {
        return this.mValue;
    }
}
