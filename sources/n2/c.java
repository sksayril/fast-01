package n2;

import android.content.Context;

public class c {

    /* renamed from: b  reason: collision with root package name */
    private static c f11293b = new c();

    /* renamed from: a  reason: collision with root package name */
    private b f11294a = null;

    public static b a(Context context) {
        return f11293b.b(context);
    }

    public final synchronized b b(Context context) {
        if (this.f11294a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f11294a = new b(context);
        }
        return this.f11294a;
    }
}
