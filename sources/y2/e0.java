package y2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import e2.h;
import x2.e;

public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    private static final String f13227a = "e0";
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b  reason: collision with root package name */
    private static Context f13228b;

    /* renamed from: c  reason: collision with root package name */
    private static g0 f13229c;

    /* JADX WARNING: type inference failed for: r1v8, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static y2.g0 a(android.content.Context r3, x2.e.a r4) {
        /*
            h2.p.j(r3)
            java.lang.String r0 = f13227a
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r2 = "preferredRenderer: "
            java.lang.String r1 = r2.concat(r1)
            android.util.Log.d(r0, r1)
            y2.g0 r1 = f13229c
            if (r1 != 0) goto L_0x0084
            r1 = 13400000(0xcc77c0, float:1.87774E-38)
            int r1 = e2.h.f(r3, r1)
            if (r1 != 0) goto L_0x007e
            java.lang.String r1 = "Making Creator dynamically"
            android.util.Log.i(r0, r1)
            android.content.Context r0 = c(r3, r4)
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.String r1 = "com.google.android.gms.maps.internal.CreatorImpl"
            java.lang.Object r0 = h2.p.j(r0)     // Catch:{ ClassNotFoundException -> 0x0076 }
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0     // Catch:{ ClassNotFoundException -> 0x0076 }
            java.lang.Class r0 = r0.loadClass(r1)     // Catch:{ ClassNotFoundException -> 0x0076 }
            java.lang.Object r0 = d(r0)     // Catch:{ ClassNotFoundException -> 0x0076 }
            android.os.IBinder r0 = (android.os.IBinder) r0
            if (r0 != 0) goto L_0x0042
            r0 = 0
            goto L_0x0056
        L_0x0042:
            java.lang.String r1 = "com.google.android.gms.maps.internal.ICreator"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof y2.g0
            if (r2 == 0) goto L_0x0050
            r0 = r1
            y2.g0 r0 = (y2.g0) r0
            goto L_0x0056
        L_0x0050:
            y2.f0 r1 = new y2.f0
            r1.<init>(r0)
            r0 = r1
        L_0x0056:
            f13229c = r0
            android.content.Context r3 = c(r3, r4)     // Catch:{ RemoteException -> 0x006f }
            r3.getClass()     // Catch:{ RemoteException -> 0x006f }
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ RemoteException -> 0x006f }
            o2.b r3 = o2.d.e3(r3)     // Catch:{ RemoteException -> 0x006f }
            int r4 = e2.h.f8353f     // Catch:{ RemoteException -> 0x006f }
            r0.N2(r3, r4)     // Catch:{ RemoteException -> 0x006f }
            y2.g0 r3 = f13229c
            return r3
        L_0x006f:
            r3 = move-exception
            z2.t r4 = new z2.t
            r4.<init>(r3)
            throw r4
        L_0x0076:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl"
            r3.<init>(r4)
            throw r3
        L_0x007e:
            e2.g r3 = new e2.g
            r3.<init>(r1)
            throw r3
        L_0x0084:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.e0.a(android.content.Context, x2.e$a):y2.g0");
    }

    private static Context b(Exception exc, Context context) {
        Log.e(f13227a, "Failed to load maps module, use pre-Chimera", exc);
        return h.c(context);
    }

    private static Context c(Context context, e.a aVar) {
        String str;
        Context context2;
        Context context3 = f13228b;
        if (context3 != null) {
            return context3;
        }
        context.getApplicationContext();
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                str = "com.google.android.gms.maps_legacy_dynamite";
            } else if (ordinal == 1) {
                str = "com.google.android.gms.maps_core_dynamite";
            }
            context2 = DynamiteModule.e(context, DynamiteModule.f5054b, str).b();
            f13228b = context2;
            return context2;
        }
        str = "com.google.android.gms.maps_dynamite";
        try {
            context2 = DynamiteModule.e(context, DynamiteModule.f5054b, str).b();
        } catch (Exception e10) {
            if (!str.equals("com.google.android.gms.maps_dynamite")) {
                try {
                    Log.d(f13227a, "Attempting to load maps_dynamite again.");
                    context2 = DynamiteModule.e(context, DynamiteModule.f5054b, "com.google.android.gms.maps_dynamite").b();
                } catch (Exception e11) {
                    context2 = b(e11, context);
                }
            } else {
                context2 = b(e10, context);
            }
        }
        f13228b = context2;
        return context2;
    }

    private static Object d(Class cls) {
        try {
            return cls.newInstance();
        } catch (InstantiationException unused) {
            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(cls.getName()));
        } catch (IllegalAccessException unused2) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat(cls.getName()));
        }
    }
}
