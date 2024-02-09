package androidx.core.location;

import android.location.GnssMeasurementsEvent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.core.os.h;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    static final WeakHashMap<C0024c, WeakReference<d>> f1509a = new WeakHashMap<>();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private static Class<?> f1510a;

        /* renamed from: b  reason: collision with root package name */
        private static Method f1511b;

        static boolean a(LocationManager locationManager, String str, j jVar, b bVar, Looper looper) {
            try {
                if (f1510a == null) {
                    f1510a = Class.forName("android.location.LocationRequest");
                }
                if (f1511b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", new Class[]{f1510a, LocationListener.class, Looper.class});
                    f1511b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest i10 = jVar.i(str);
                if (i10 != null) {
                    f1511b.invoke(locationManager, new Object[]{i10, bVar, looper});
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }

        static boolean b(LocationManager locationManager, String str, j jVar, d dVar) {
            try {
                if (f1510a == null) {
                    f1510a = Class.forName("android.location.LocationRequest");
                }
                if (f1511b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", new Class[]{f1510a, LocationListener.class, Looper.class});
                    f1511b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest i10 = jVar.i(str);
                if (i10 != null) {
                    synchronized (c.f1509a) {
                        f1511b.invoke(locationManager, new Object[]{i10, dVar, Looper.getMainLooper()});
                        c.a(locationManager, dVar);
                    }
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }
    }

    private static class b {
        static boolean a(LocationManager locationManager, String str) {
            return locationManager.hasProvider(str);
        }

        static boolean b(LocationManager locationManager, Executor executor, GnssMeasurementsEvent.Callback callback) {
            return locationManager.registerGnssMeasurementsCallback(executor, callback);
        }

        static void c(LocationManager locationManager, String str, LocationRequest locationRequest, Executor executor, LocationListener locationListener) {
            locationManager.requestLocationUpdates(str, locationRequest, executor, locationListener);
        }
    }

    /* renamed from: androidx.core.location.c$c  reason: collision with other inner class name */
    private static class C0024c {

        /* renamed from: a  reason: collision with root package name */
        final String f1512a;

        /* renamed from: b  reason: collision with root package name */
        final b f1513b;

        public boolean equals(Object obj) {
            if (!(obj instanceof C0024c)) {
                return false;
            }
            C0024c cVar = (C0024c) obj;
            return this.f1512a.equals(cVar.f1512a) && this.f1513b.equals(cVar.f1513b);
        }

        public int hashCode() {
            return androidx.core.util.c.b(this.f1512a, this.f1513b);
        }
    }

    private static class d implements LocationListener {

        /* renamed from: a  reason: collision with root package name */
        volatile C0024c f1514a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f1515b;

        /* access modifiers changed from: private */
        public /* synthetic */ void h(int i10) {
            C0024c cVar = this.f1514a;
            if (cVar != null) {
                cVar.f1513b.onFlushComplete(i10);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void i(Location location) {
            C0024c cVar = this.f1514a;
            if (cVar != null) {
                cVar.f1513b.onLocationChanged(location);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void j(List list) {
            C0024c cVar = this.f1514a;
            if (cVar != null) {
                cVar.f1513b.onLocationChanged(list);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void k(String str) {
            C0024c cVar = this.f1514a;
            if (cVar != null) {
                cVar.f1513b.onProviderDisabled(str);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void l(String str) {
            C0024c cVar = this.f1514a;
            if (cVar != null) {
                cVar.f1513b.onProviderEnabled(str);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void m(String str, int i10, Bundle bundle) {
            C0024c cVar = this.f1514a;
            if (cVar != null) {
                cVar.f1513b.onStatusChanged(str, i10, bundle);
            }
        }

        public C0024c g() {
            return (C0024c) androidx.core.util.c.c(this.f1514a);
        }

        public void n() {
            this.f1514a = null;
        }

        public void onFlushComplete(int i10) {
            if (this.f1514a != null) {
                this.f1515b.execute(new d(this, i10));
            }
        }

        public void onLocationChanged(Location location) {
            if (this.f1514a != null) {
                this.f1515b.execute(new e(this, location));
            }
        }

        public void onLocationChanged(List<Location> list) {
            if (this.f1514a != null) {
                this.f1515b.execute(new i(this, list));
            }
        }

        public void onProviderDisabled(String str) {
            if (this.f1514a != null) {
                this.f1515b.execute(new g(this, str));
            }
        }

        public void onProviderEnabled(String str) {
            if (this.f1514a != null) {
                this.f1515b.execute(new f(this, str));
            }
        }

        public void onStatusChanged(String str, int i10, Bundle bundle) {
            if (this.f1514a != null) {
                this.f1515b.execute(new h(this, str, i10, bundle));
            }
        }
    }

    static void a(LocationManager locationManager, d dVar) {
        WeakReference put = f1509a.put(dVar.g(), new WeakReference(dVar));
        d dVar2 = put != null ? (d) put.get() : null;
        if (dVar2 != null) {
            dVar2.n();
            locationManager.removeUpdates(dVar2);
        }
    }

    public static void b(LocationManager locationManager, String str, j jVar, b bVar, Looper looper) {
        if (Build.VERSION.SDK_INT >= 31) {
            b.c(locationManager, str, jVar.h(), h.a(new Handler(looper)), bVar);
        } else if (!a.a(locationManager, str, jVar, bVar, looper)) {
            locationManager.requestLocationUpdates(str, jVar.b(), jVar.e(), bVar, looper);
        }
    }
}
