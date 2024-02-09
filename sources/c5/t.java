package c5;

import o4.f;

public enum t implements f {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);
    
    private final int number;

    private t(int i10) {
        this.number = i10;
    }

    public int getNumber() {
        return this.number;
    }
}
