package c0;

import c0.d;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

public final class e {
    public static final d a() {
        return new a((Map) null, true, 1, (g) null);
    }

    public static final a b(d.b<?>... bVarArr) {
        l.e(bVarArr, "pairs");
        a aVar = new a((Map) null, false, 1, (g) null);
        aVar.g((d.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        return aVar;
    }
}
