package c9;

import android.os.Looper;
import b9.c2;
import g9.v;
import java.util.List;
import kotlin.jvm.internal.g;

public final class a implements v {
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    public c2 b(List<? extends v> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new c(e.a(mainLooper, true), (String) null, 2, (g) null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    public int c() {
        return 1073741823;
    }
}
