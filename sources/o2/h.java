package o2;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

final class h implements View.OnClickListener {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ Context f11589m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ Intent f11590n;

    h(Context context, Intent intent) {
        this.f11589m = context;
        this.f11590n = intent;
    }

    public final void onClick(View view) {
        try {
            this.f11589m.startActivity(this.f11590n);
        } catch (ActivityNotFoundException e10) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e10);
        }
    }
}
