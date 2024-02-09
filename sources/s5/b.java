package s5;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import n6.h;
import n6.i;

public final class b implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    private h f12173a;

    /* renamed from: b  reason: collision with root package name */
    private i f12174b;

    /* renamed from: c  reason: collision with root package name */
    private Sensor f12175c;

    /* renamed from: d  reason: collision with root package name */
    private Context f12176d;

    /* renamed from: e  reason: collision with root package name */
    private Handler f12177e = new Handler();

    public b(Context context, h hVar, i iVar) {
        this.f12176d = context;
        this.f12173a = hVar;
        this.f12174b = iVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(boolean z9) {
        this.f12173a.t(z9);
    }

    private void c(boolean z9) {
        this.f12177e.post(new a(this, z9));
    }

    public void d() {
        if (this.f12174b.d()) {
            SensorManager sensorManager = (SensorManager) this.f12176d.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(5);
            this.f12175c = defaultSensor;
            if (defaultSensor != null) {
                sensorManager.registerListener(this, defaultSensor, 3);
            }
        }
    }

    public void e() {
        if (this.f12175c != null) {
            ((SensorManager) this.f12176d.getSystemService("sensor")).unregisterListener(this);
            this.f12175c = null;
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        float f10 = sensorEvent.values[0];
        if (this.f12173a == null) {
            return;
        }
        if (f10 <= 45.0f) {
            c(true);
        } else if (f10 >= 450.0f) {
            c(false);
        }
    }
}
