package c5;

import o4.f;

public enum j implements f {
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);
    
    private final int number;

    private j(int i10) {
        this.number = i10;
    }

    public int getNumber() {
        return this.number;
    }
}
