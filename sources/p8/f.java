package p8;

import java.io.File;
import kotlin.jvm.internal.l;

class f extends e {
    public static String a(File file) {
        l.e(file, "<this>");
        String name = file.getName();
        l.d(name, "name");
        return p.h0(name, '.', "");
    }
}
