package c5;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import com.google.firebase.sessions.SessionLifecycleService;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import t3.f;

public final class i0 implements h0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f3745c = new a((g) null);

    /* renamed from: b  reason: collision with root package name */
    private final f f3746b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public i0(f fVar) {
        l.e(fVar, "firebaseApp");
        this.f3746b = fVar;
    }

    public void a(Messenger messenger, ServiceConnection serviceConnection) {
        l.e(messenger, "callback");
        l.e(serviceConnection, "serviceConnection");
        Context applicationContext = this.f3746b.m().getApplicationContext();
        Intent intent = new Intent(applicationContext, SessionLifecycleService.class);
        Log.d("LifecycleServiceBinder", "Binding service to application.");
        intent.setAction(String.valueOf(Process.myPid()));
        intent.putExtra("ClientCallbackMessenger", messenger);
        applicationContext.bindService(intent, serviceConnection, 65);
    }
}
