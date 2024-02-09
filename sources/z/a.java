package z;

import java.io.IOException;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

public final class a extends IOException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(String str, Throwable th) {
        super(str, th);
        l.e(str, "message");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, Throwable th, int i10, g gVar) {
        this(str, (i10 & 2) != 0 ? null : th);
    }
}
