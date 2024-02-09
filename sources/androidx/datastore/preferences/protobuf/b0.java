package androidx.datastore.preferences.protobuf;

import java.io.IOException;

public class b0 extends IOException {

    /* renamed from: m  reason: collision with root package name */
    private r0 f1890m = null;

    public static class a extends b0 {
        public a(String str) {
            super(str);
        }
    }

    public b0(String str) {
        super(str);
    }

    static b0 a() {
        return new b0("Protocol message end-group tag did not match expected tag.");
    }

    static b0 b() {
        return new b0("Protocol message contained an invalid tag (zero).");
    }

    static b0 c() {
        return new b0("Protocol message had invalid UTF-8.");
    }

    static a d() {
        return new a("Protocol message tag had invalid wire type.");
    }

    static b0 e() {
        return new b0("CodedInputStream encountered a malformed varint.");
    }

    static b0 f() {
        return new b0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static b0 g() {
        return new b0("Failed to parse the message.");
    }

    static b0 h() {
        return new b0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static b0 j() {
        return new b0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static b0 k() {
        return new b0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public b0 i(r0 r0Var) {
        this.f1890m = r0Var;
        return this;
    }
}
