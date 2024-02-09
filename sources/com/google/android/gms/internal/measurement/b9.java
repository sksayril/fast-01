package com.google.android.gms.internal.measurement;

import java.io.IOException;

public class b9 extends IOException {

    /* renamed from: m  reason: collision with root package name */
    private da f5123m = null;

    public b9(String str) {
        super(str);
    }

    static a9 a() {
        return new a9("Protocol message tag had invalid wire type.");
    }

    static b9 b() {
        return new b9("Protocol message contained an invalid tag (zero).");
    }

    static b9 c() {
        return new b9("Protocol message had invalid UTF-8.");
    }

    static b9 d() {
        return new b9("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static b9 e() {
        return new b9("Failed to parse the message.");
    }

    static b9 f() {
        return new b9("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
