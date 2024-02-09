package c5;

import o4.f;

public enum d implements f {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);
    
    private final int number;

    private d(int i10) {
        this.number = i10;
    }

    public int getNumber() {
        return this.number;
    }
}
