package b0;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.l;
import y.a;

public final class b {
    public static final File a(Context context, String str) {
        l.e(context, "<this>");
        l.e(str, "name");
        return a.a(context, l.k(str, ".preferences_pb"));
    }
}
