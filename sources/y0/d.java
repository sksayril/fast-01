package y0;

import android.content.Context;
import kotlin.jvm.internal.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f13226a = new d();

    private d() {
    }

    public final boolean a(Context context) {
        l.e(context, "context");
        return context.getSharedPreferences("com.almoullim.background_location_preferences", 0).getBoolean("requesting_location_updates", false);
    }

    public final void b(Context context, boolean z9) {
        l.e(context, "context");
        context.getSharedPreferences("com.almoullim.background_location_preferences", 0).edit().putBoolean("requesting_location_updates", z9).apply();
    }
}
