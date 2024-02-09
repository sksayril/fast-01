package e2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import r2.j;

@SuppressLint({"HandlerLeak"})
final class m extends j {

    /* renamed from: a  reason: collision with root package name */
    private final Context f8368a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e f8369b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f8369b = eVar;
        this.f8368a = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        int g10 = this.f8369b.g(this.f8368a);
        if (this.f8369b.j(g10)) {
            this.f8369b.o(this.f8368a, g10);
        }
    }
}
