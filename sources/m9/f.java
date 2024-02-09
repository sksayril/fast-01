package m9;

import android.annotation.SuppressLint;
import android.app.Activity;
import d7.c;

@SuppressLint({"StaticFieldLeak"})
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f11279a = new f();

    /* renamed from: b  reason: collision with root package name */
    private static Activity f11280b;

    /* renamed from: c  reason: collision with root package name */
    private static c f11281c;

    private f() {
    }

    public final Activity a() {
        return f11280b;
    }

    public final c b() {
        return f11281c;
    }

    public final void c(Activity activity) {
        f11280b = activity;
    }

    public final void d(c cVar) {
        f11281c = cVar;
    }
}
