package g4;

import java.io.File;
import java.io.FilenameFilter;

public final /* synthetic */ class b implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ b f8928a = new b();

    private /* synthetic */ b() {
    }

    public final boolean accept(File file, String str) {
        return str.startsWith("event");
    }
}
