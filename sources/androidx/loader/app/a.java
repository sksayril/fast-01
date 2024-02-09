package androidx.loader.app;

import androidx.lifecycle.g0;
import androidx.lifecycle.l;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class a {
    public static <T extends l & g0> a b(T t9) {
        return new b(t9, ((g0) t9).l());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void c();
}
