package q1;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class k implements e {

    /* renamed from: a  reason: collision with root package name */
    private final a f11974a;

    /* renamed from: b  reason: collision with root package name */
    private final i f11975b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, m> f11976c;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f11977a;

        /* renamed from: b  reason: collision with root package name */
        private Map<String, String> f11978b = null;

        a(Context context) {
            this.f11977a = context;
        }

        private Map<String, String> a(Context context) {
            Bundle d10 = d(context);
            if (d10 == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : d10.keySet()) {
                Object obj = d10.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String trim : ((String) obj).split(",", -1)) {
                        String trim2 = trim.trim();
                        if (!trim2.isEmpty()) {
                            hashMap.put(trim2, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        private Map<String, String> c() {
            if (this.f11978b == null) {
                this.f11978b = a(this.f11977a);
            }
            return this.f11978b;
        }

        private static Bundle d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public d b(String str) {
            String str2;
            String str3;
            String str4 = c().get(str);
            if (str4 == null) {
                return null;
            }
            try {
                return (d) Class.forName(str4).asSubclass(d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e10) {
                e = e10;
                str2 = String.format("Class %s is not found.", new Object[]{str4});
                Log.w("BackendRegistry", str2, e);
                return null;
            } catch (IllegalAccessException e11) {
                e = e11;
                str2 = String.format("Could not instantiate %s.", new Object[]{str4});
                Log.w("BackendRegistry", str2, e);
                return null;
            } catch (InstantiationException e12) {
                e = e12;
                str2 = String.format("Could not instantiate %s.", new Object[]{str4});
                Log.w("BackendRegistry", str2, e);
                return null;
            } catch (NoSuchMethodException e13) {
                e = e13;
                str3 = String.format("Could not instantiate %s", new Object[]{str4});
                Log.w("BackendRegistry", str3, e);
                return null;
            } catch (InvocationTargetException e14) {
                e = e14;
                str3 = String.format("Could not instantiate %s", new Object[]{str4});
                Log.w("BackendRegistry", str3, e);
                return null;
            }
        }
    }

    k(Context context, i iVar) {
        this(new a(context), iVar);
    }

    k(a aVar, i iVar) {
        this.f11976c = new HashMap();
        this.f11974a = aVar;
        this.f11975b = iVar;
    }

    public synchronized m a(String str) {
        if (this.f11976c.containsKey(str)) {
            return this.f11976c.get(str);
        }
        d b10 = this.f11974a.b(str);
        if (b10 == null) {
            return null;
        }
        m create = b10.create(this.f11975b.a(str));
        this.f11976c.put(str, create);
        return create;
    }
}
