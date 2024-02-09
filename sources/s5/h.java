package s5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final Context f12195a;

    /* renamed from: b  reason: collision with root package name */
    private final BroadcastReceiver f12196b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12197c = false;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Handler f12198d;

    /* renamed from: e  reason: collision with root package name */
    private Runnable f12199e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f12200f;

    private final class b extends BroadcastReceiver {
        private b() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(boolean z9) {
            h.this.f(z9);
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                h.this.f12198d.post(new i(this, intent.getIntExtra("plugged", -1) <= 0));
            }
        }
    }

    public h(Context context, Runnable runnable) {
        this.f12195a = context;
        this.f12199e = runnable;
        this.f12196b = new b();
        this.f12198d = new Handler();
    }

    private void e() {
        this.f12198d.removeCallbacksAndMessages((Object) null);
    }

    /* access modifiers changed from: private */
    public void f(boolean z9) {
        this.f12200f = z9;
        if (this.f12197c) {
            c();
        }
    }

    private void g() {
        if (!this.f12197c) {
            this.f12195a.registerReceiver(this.f12196b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            this.f12197c = true;
        }
    }

    private void i() {
        if (this.f12197c) {
            this.f12195a.unregisterReceiver(this.f12196b);
            this.f12197c = false;
        }
    }

    public void c() {
        e();
        if (this.f12200f) {
            this.f12198d.postDelayed(this.f12199e, 300000);
        }
    }

    public void d() {
        e();
        i();
    }

    public void h() {
        g();
        c();
    }
}
