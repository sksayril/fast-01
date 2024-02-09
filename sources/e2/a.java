package e2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import h2.p;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class a implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    boolean f8320a = false;

    /* renamed from: b  reason: collision with root package name */
    private final BlockingQueue f8321b = new LinkedBlockingQueue();

    public IBinder a(long j10, TimeUnit timeUnit) {
        p.i("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f8320a) {
            this.f8320a = true;
            IBinder iBinder = (IBinder) this.f8321b.poll(j10, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f8321b.add(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
