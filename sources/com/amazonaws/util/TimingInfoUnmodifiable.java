package com.amazonaws.util;

final class TimingInfoUnmodifiable extends TimingInfo {
    TimingInfoUnmodifiable(Long l10, long j10, Long l11) {
        super(l10, j10, l11);
    }

    public TimingInfo c() {
        throw new UnsupportedOperationException();
    }
}
