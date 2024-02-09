package y;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.l;

public final class a {
    public static final File a(Context context, String str) {
        l.e(context, "<this>");
        l.e(str, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), l.k("datastore/", str));
    }
}
