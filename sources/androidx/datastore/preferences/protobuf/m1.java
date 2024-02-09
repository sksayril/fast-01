package androidx.datastore.preferences.protobuf;

import java.util.List;

public class m1 extends RuntimeException {

    /* renamed from: m  reason: collision with root package name */
    private final List<String> f2033m = null;

    public m1(r0 r0Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public b0 a() {
        return new b0(getMessage());
    }
}
