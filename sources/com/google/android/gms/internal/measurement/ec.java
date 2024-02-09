package com.google.android.gms.internal.measurement;

final class ec extends IllegalArgumentException {
    ec(int i10, int i11) {
        super("Unpaired surrogate at index " + i10 + " of " + i11);
    }
}
