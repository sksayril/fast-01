package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import h2.o;
import h2.p;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import l2.f;
import p2.c;
import p2.d;

public final class DynamiteModule {

    /* renamed from: b  reason: collision with root package name */
    public static final b f5054b = new d();

    /* renamed from: c  reason: collision with root package name */
    public static final b f5055c = new e();

    /* renamed from: d  reason: collision with root package name */
    public static final b f5056d = new f();

    /* renamed from: e  reason: collision with root package name */
    public static final b f5057e = new g();

    /* renamed from: f  reason: collision with root package name */
    public static final b f5058f = new h();

    /* renamed from: g  reason: collision with root package name */
    public static final b f5059g = new i();

    /* renamed from: h  reason: collision with root package name */
    private static Boolean f5060h = null;

    /* renamed from: i  reason: collision with root package name */
    private static String f5061i = null;

    /* renamed from: j  reason: collision with root package name */
    private static boolean f5062j = false;

    /* renamed from: k  reason: collision with root package name */
    private static int f5063k = -1;

    /* renamed from: l  reason: collision with root package name */
    private static Boolean f5064l;

    /* renamed from: m  reason: collision with root package name */
    private static final ThreadLocal f5065m = new ThreadLocal();

    /* renamed from: n  reason: collision with root package name */
    private static final ThreadLocal f5066n = new b();

    /* renamed from: o  reason: collision with root package name */
    private static final b.a f5067o = new c();

    /* renamed from: p  reason: collision with root package name */
    public static final b f5068p = new j();

    /* renamed from: q  reason: collision with root package name */
    private static m f5069q;

    /* renamed from: r  reason: collision with root package name */
    private static n f5070r;

    /* renamed from: a  reason: collision with root package name */
    private final Context f5071a;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        /* synthetic */ a(String str, Throwable th, d dVar) {
            super(str, th);
        }

        /* synthetic */ a(String str, d dVar) {
            super(str);
        }
    }

    public interface b {

        public interface a {
            int a(Context context, String str);

            int b(Context context, String str, boolean z9);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b  reason: collision with other inner class name */
        public static class C0088b {

            /* renamed from: a  reason: collision with root package name */
            public int f5072a = 0;

            /* renamed from: b  reason: collision with root package name */
            public int f5073b = 0;

            /* renamed from: c  reason: collision with root package name */
            public int f5074c = 0;
        }

        C0088b a(Context context, String str, a aVar);
    }

    private DynamiteModule(Context context) {
        p.j(context);
        this.f5071a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (o.a(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            Log.e("DynamiteModule", "Module descriptor id '" + valueOf + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    public static int c(Context context, String str) {
        return f(context, str, false);
    }

    public static DynamiteModule e(Context context, b bVar, String str) {
        int i10;
        ThreadLocal threadLocal;
        Boolean bool;
        DynamiteModule dynamiteModule;
        o2.b bVar2;
        n nVar;
        Boolean valueOf;
        o2.b bVar3;
        Context context2 = context;
        b bVar4 = bVar;
        String str2 = str;
        Class<DynamiteModule> cls = DynamiteModule.class;
        ThreadLocal threadLocal2 = f5065m;
        k kVar = (k) threadLocal2.get();
        k kVar2 = new k((c) null);
        threadLocal2.set(kVar2);
        ThreadLocal threadLocal3 = f5066n;
        long longValue = ((Long) threadLocal3.get()).longValue();
        try {
            threadLocal3.set(Long.valueOf(SystemClock.elapsedRealtime()));
            b.C0088b a10 = bVar4.a(context2, str2, f5067o);
            int i11 = a10.f5072a;
            int i12 = a10.f5073b;
            Log.i("DynamiteModule", "Considering local module " + str2 + ":" + i11 + " and remote module " + str2 + ":" + i12);
            int i13 = a10.f5074c;
            if (i13 != 0) {
                if (i13 == -1) {
                    if (a10.f5072a != 0) {
                        i13 = -1;
                    }
                }
                if (!(i13 == 1 && a10.f5073b == 0)) {
                    if (i13 == -1) {
                        DynamiteModule h10 = h(context2, str2);
                        if (longValue == 0) {
                            threadLocal3.remove();
                        } else {
                            threadLocal3.set(Long.valueOf(longValue));
                        }
                        Cursor cursor = kVar2.f5075a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal2.set(kVar);
                        return h10;
                    } else if (i13 == 1) {
                        try {
                            int i14 = a10.f5073b;
                            try {
                                synchronized (cls) {
                                    if (k(context)) {
                                        bool = f5060h;
                                    } else {
                                        throw new a("Remote loading disabled", (d) null);
                                    }
                                }
                                if (bool != null) {
                                    if (bool.booleanValue()) {
                                        Log.i("DynamiteModule", "Selected remote version of " + str2 + ", version >= " + i14);
                                        synchronized (cls) {
                                            nVar = f5070r;
                                        }
                                        if (nVar != null) {
                                            k kVar3 = (k) threadLocal2.get();
                                            if (kVar3 == null || kVar3.f5075a == null) {
                                                throw new a("No result cursor", (d) null);
                                            }
                                            Context applicationContext = context.getApplicationContext();
                                            Cursor cursor2 = kVar3.f5075a;
                                            o2.d.e3(null);
                                            synchronized (cls) {
                                                valueOf = Boolean.valueOf(f5063k >= 2);
                                            }
                                            if (valueOf.booleanValue()) {
                                                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                bVar3 = nVar.e3(o2.d.e3(applicationContext), str2, i14, o2.d.e3(cursor2));
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                bVar3 = nVar.Y(o2.d.e3(applicationContext), str2, i14, o2.d.e3(cursor2));
                                            }
                                            Context context3 = (Context) o2.d.Y(bVar3);
                                            if (context3 != null) {
                                                dynamiteModule = new DynamiteModule(context3);
                                            } else {
                                                throw new a("Failed to get module context", (d) null);
                                            }
                                        } else {
                                            throw new a("DynamiteLoaderV2 was not cached.", (d) null);
                                        }
                                    } else {
                                        Log.i("DynamiteModule", "Selected remote version of " + str2 + ", version >= " + i14);
                                        m l10 = l(context);
                                        if (l10 != null) {
                                            int Y = l10.Y();
                                            if (Y >= 3) {
                                                k kVar4 = (k) threadLocal2.get();
                                                if (kVar4 != null) {
                                                    bVar2 = l10.h3(o2.d.e3(context), str2, i14, o2.d.e3(kVar4.f5075a));
                                                } else {
                                                    throw new a("No cached result cursor holder", (d) null);
                                                }
                                            } else if (Y == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                bVar2 = l10.i3(o2.d.e3(context), str2, i14);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                bVar2 = l10.g3(o2.d.e3(context), str2, i14);
                                            }
                                            Object Y2 = o2.d.Y(bVar2);
                                            if (Y2 != null) {
                                                dynamiteModule = new DynamiteModule((Context) Y2);
                                            } else {
                                                throw new a("Failed to load remote module.", (d) null);
                                            }
                                        } else {
                                            throw new a("Failed to create IDynamiteLoader.", (d) null);
                                        }
                                    }
                                    if (longValue == 0) {
                                        threadLocal3.remove();
                                    } else {
                                        threadLocal3.set(Long.valueOf(longValue));
                                    }
                                    Cursor cursor3 = kVar2.f5075a;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    threadLocal2.set(kVar);
                                    return dynamiteModule;
                                }
                                throw new a("Failed to determine which loading route to use.", (d) null);
                            } catch (RemoteException e10) {
                                throw new a("Failed to load remote module.", e10, (d) null);
                            } catch (a e11) {
                                throw e11;
                            } catch (Throwable th) {
                                f.a(context2, th);
                                throw new a("Failed to load remote module.", th, (d) null);
                            }
                        } catch (a e12) {
                            String message = e12.getMessage();
                            Log.w("DynamiteModule", "Failed to load remote module: " + message);
                            int i15 = a10.f5072a;
                            if (i15 != 0) {
                                if (bVar.a(context2, str2, new l(i15, 0)).f5074c == -1) {
                                    DynamiteModule h11 = h(context2, str2);
                                    if (i10 != 0) {
                                        threadLocal.set(Long.valueOf(longValue));
                                    }
                                    return h11;
                                }
                            }
                            throw new a("Remote load failed. No local fallback found.", e12, (d) null);
                        }
                    } else {
                        throw new a("VersionPolicy returned invalid code:" + i13, (d) null);
                    }
                }
            }
            int i16 = a10.f5072a;
            int i17 = a10.f5073b;
            throw new a("No acceptable module " + str2 + " found. Local version is " + i16 + " and remote version is " + i17 + ".", (d) null);
        } finally {
            i10 = (longValue > 0 ? 1 : (longValue == 0 ? 0 : -1));
            threadLocal = f5066n;
            if (i10 == 0) {
                threadLocal.remove();
            } else {
                threadLocal.set(Long.valueOf(longValue));
            }
            Cursor cursor4 = kVar2.f5075a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f5065m.set(kVar);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x0056=Splitter:B:31:0x0056, B:50:0x009a=Splitter:B:50:0x009a, B:17:0x003b=Splitter:B:17:0x003b} */
    public static int f(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x01bf }
            java.lang.Boolean r1 = f5060h     // Catch:{ all -> 0x01bc }
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x00d5
            android.content.Context r1 = r10.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00b6, IllegalAccessException -> 0x00b4, NoSuchFieldException -> 0x00b2 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00b6, IllegalAccessException -> 0x00b4, NoSuchFieldException -> 0x00b2 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r4 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r4 = r4.getName()     // Catch:{ ClassNotFoundException -> 0x00b6, IllegalAccessException -> 0x00b4, NoSuchFieldException -> 0x00b2 }
            java.lang.Class r1 = r1.loadClass(r4)     // Catch:{ ClassNotFoundException -> 0x00b6, IllegalAccessException -> 0x00b4, NoSuchFieldException -> 0x00b2 }
            java.lang.String r4 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r4)     // Catch:{ ClassNotFoundException -> 0x00b6, IllegalAccessException -> 0x00b4, NoSuchFieldException -> 0x00b2 }
            java.lang.Class r4 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00b6, IllegalAccessException -> 0x00b4, NoSuchFieldException -> 0x00b2 }
            monitor-enter(r4)     // Catch:{ ClassNotFoundException -> 0x00b6, IllegalAccessException -> 0x00b4, NoSuchFieldException -> 0x00b2 }
            java.lang.Object r5 = r1.get(r2)     // Catch:{ all -> 0x00af }
            java.lang.ClassLoader r5 = (java.lang.ClassLoader) r5     // Catch:{ all -> 0x00af }
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00af }
            if (r5 != r6) goto L_0x0036
        L_0x0032:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00af }
            goto L_0x00ad
        L_0x0036:
            if (r5 == 0) goto L_0x003f
            i(r5)     // Catch:{ a -> 0x003b }
        L_0x003b:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00af }
            goto L_0x00ad
        L_0x003f:
            boolean r5 = k(r10)     // Catch:{ all -> 0x00af }
            if (r5 != 0) goto L_0x0048
            monitor-exit(r4)     // Catch:{ all -> 0x00af }
            monitor-exit(r0)     // Catch:{ all -> 0x01bc }
            return r3
        L_0x0048:
            boolean r5 = f5062j     // Catch:{ all -> 0x00af }
            if (r5 != 0) goto L_0x00a5
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00af }
            boolean r6 = r5.equals(r2)     // Catch:{ all -> 0x00af }
            if (r6 == 0) goto L_0x0055
            goto L_0x00a5
        L_0x0055:
            r6 = 1
            int r6 = g(r10, r11, r12, r6)     // Catch:{ a -> 0x009d }
            java.lang.String r7 = f5061i     // Catch:{ a -> 0x009d }
            if (r7 == 0) goto L_0x009a
            boolean r7 = r7.isEmpty()     // Catch:{ a -> 0x009d }
            if (r7 == 0) goto L_0x0065
            goto L_0x009a
        L_0x0065:
            java.lang.ClassLoader r7 = p2.b.a()     // Catch:{ a -> 0x009d }
            if (r7 == 0) goto L_0x006c
            goto L_0x008f
        L_0x006c:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ a -> 0x009d }
            r8 = 29
            if (r7 < r8) goto L_0x0081
            dalvik.system.DelegateLastClassLoader r7 = new dalvik.system.DelegateLastClassLoader     // Catch:{ a -> 0x009d }
            java.lang.String r8 = f5061i     // Catch:{ a -> 0x009d }
            h2.p.j(r8)     // Catch:{ a -> 0x009d }
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x009d }
            r7.<init>(r8, r9)     // Catch:{ a -> 0x009d }
            goto L_0x008f
        L_0x0081:
            com.google.android.gms.dynamite.a r7 = new com.google.android.gms.dynamite.a     // Catch:{ a -> 0x009d }
            java.lang.String r8 = f5061i     // Catch:{ a -> 0x009d }
            h2.p.j(r8)     // Catch:{ a -> 0x009d }
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x009d }
            r7.<init>(r8, r9)     // Catch:{ a -> 0x009d }
        L_0x008f:
            i(r7)     // Catch:{ a -> 0x009d }
            r1.set(r2, r7)     // Catch:{ a -> 0x009d }
            f5060h = r5     // Catch:{ a -> 0x009d }
            monitor-exit(r4)     // Catch:{ all -> 0x00af }
            monitor-exit(r0)     // Catch:{ all -> 0x01bc }
            return r6
        L_0x009a:
            monitor-exit(r4)     // Catch:{ all -> 0x00af }
            monitor-exit(r0)     // Catch:{ all -> 0x01bc }
            return r6
        L_0x009d:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00af }
            r1.set(r2, r5)     // Catch:{ all -> 0x00af }
            goto L_0x0032
        L_0x00a5:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00af }
            r1.set(r2, r5)     // Catch:{ all -> 0x00af }
            goto L_0x0032
        L_0x00ad:
            monitor-exit(r4)     // Catch:{ all -> 0x00af }
            goto L_0x00d3
        L_0x00af:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00af }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00b6, IllegalAccessException -> 0x00b4, NoSuchFieldException -> 0x00b2 }
        L_0x00b2:
            r1 = move-exception
            goto L_0x00b7
        L_0x00b4:
            r1 = move-exception
            goto L_0x00b7
        L_0x00b6:
            r1 = move-exception
        L_0x00b7:
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01bc }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bc }
            r4.<init>()     // Catch:{ all -> 0x01bc }
            java.lang.String r5 = "Failed to load module via V2: "
            r4.append(r5)     // Catch:{ all -> 0x01bc }
            r4.append(r1)     // Catch:{ all -> 0x01bc }
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01bc }
            android.util.Log.w(r1, r4)     // Catch:{ all -> 0x01bc }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01bc }
        L_0x00d3:
            f5060h = r1     // Catch:{ all -> 0x01bc }
        L_0x00d5:
            monitor-exit(r0)     // Catch:{ all -> 0x01bc }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x01bf }
            if (r0 == 0) goto L_0x00fd
            int r10 = g(r10, r11, r12, r3)     // Catch:{ a -> 0x00e1 }
            return r10
        L_0x00e1:
            r11 = move-exception
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x01bf }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bf }
            r12.<init>()     // Catch:{ all -> 0x01bf }
            java.lang.String r0 = "Failed to retrieve remote module version: "
            r12.append(r0)     // Catch:{ all -> 0x01bf }
            r12.append(r11)     // Catch:{ all -> 0x01bf }
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x01bf }
            android.util.Log.w(r11, r12)     // Catch:{ all -> 0x01bf }
            return r3
        L_0x00fd:
            com.google.android.gms.dynamite.m r4 = l(r10)     // Catch:{ all -> 0x01bf }
            if (r4 != 0) goto L_0x0105
            goto L_0x01b3
        L_0x0105:
            int r0 = r4.Y()     // Catch:{ RemoteException -> 0x0192 }
            r1 = 3
            if (r0 < r1) goto L_0x016d
            java.lang.ThreadLocal r0 = f5065m     // Catch:{ RemoteException -> 0x0192 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0192 }
            com.google.android.gms.dynamite.k r0 = (com.google.android.gms.dynamite.k) r0     // Catch:{ RemoteException -> 0x0192 }
            if (r0 == 0) goto L_0x0120
            android.database.Cursor r0 = r0.f5075a     // Catch:{ RemoteException -> 0x0192 }
            if (r0 == 0) goto L_0x0120
            int r3 = r0.getInt(r3)     // Catch:{ RemoteException -> 0x0192 }
            goto L_0x01b3
        L_0x0120:
            o2.b r5 = o2.d.e3(r10)     // Catch:{ RemoteException -> 0x0192 }
            java.lang.ThreadLocal r0 = f5066n     // Catch:{ RemoteException -> 0x0192 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0192 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ RemoteException -> 0x0192 }
            long r8 = r0.longValue()     // Catch:{ RemoteException -> 0x0192 }
            r6 = r11
            r7 = r12
            o2.b r11 = r4.j3(r5, r6, r7, r8)     // Catch:{ RemoteException -> 0x0192 }
            java.lang.Object r11 = o2.d.Y(r11)     // Catch:{ RemoteException -> 0x0192 }
            android.database.Cursor r11 = (android.database.Cursor) r11     // Catch:{ RemoteException -> 0x0192 }
            if (r11 == 0) goto L_0x015a
            boolean r12 = r11.moveToFirst()     // Catch:{ RemoteException -> 0x016a, all -> 0x0167 }
            if (r12 != 0) goto L_0x0145
            goto L_0x015a
        L_0x0145:
            int r12 = r11.getInt(r3)     // Catch:{ RemoteException -> 0x016a, all -> 0x0167 }
            if (r12 <= 0) goto L_0x0152
            boolean r0 = j(r11)     // Catch:{ RemoteException -> 0x016a, all -> 0x0167 }
            if (r0 == 0) goto L_0x0152
            goto L_0x0153
        L_0x0152:
            r2 = r11
        L_0x0153:
            if (r2 == 0) goto L_0x0158
            r2.close()     // Catch:{ all -> 0x01bf }
        L_0x0158:
            r3 = r12
            goto L_0x01b3
        L_0x015a:
            java.lang.String r12 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r12, r0)     // Catch:{ RemoteException -> 0x016a, all -> 0x0167 }
            if (r11 == 0) goto L_0x01b3
            r11.close()     // Catch:{ all -> 0x01bf }
            goto L_0x01b3
        L_0x0167:
            r12 = move-exception
            r2 = r11
            goto L_0x01b6
        L_0x016a:
            r12 = move-exception
            r2 = r11
            goto L_0x0194
        L_0x016d:
            r1 = 2
            if (r0 != r1) goto L_0x0180
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r1 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r0, r1)     // Catch:{ RemoteException -> 0x0192 }
            o2.b r0 = o2.d.e3(r10)     // Catch:{ RemoteException -> 0x0192 }
            int r3 = r4.f3(r0, r11, r12)     // Catch:{ RemoteException -> 0x0192 }
            goto L_0x01b3
        L_0x0180:
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r1 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r0, r1)     // Catch:{ RemoteException -> 0x0192 }
            o2.b r0 = o2.d.e3(r10)     // Catch:{ RemoteException -> 0x0192 }
            int r3 = r4.e3(r0, r11, r12)     // Catch:{ RemoteException -> 0x0192 }
            goto L_0x01b3
        L_0x0190:
            r12 = r11
            goto L_0x01b6
        L_0x0192:
            r11 = move-exception
            r12 = r11
        L_0x0194:
            java.lang.String r11 = r12.getMessage()     // Catch:{ all -> 0x01b4 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b4 }
            r12.<init>()     // Catch:{ all -> 0x01b4 }
            java.lang.String r0 = "Failed to retrieve remote module version: "
            r12.append(r0)     // Catch:{ all -> 0x01b4 }
            r12.append(r11)     // Catch:{ all -> 0x01b4 }
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x01b4 }
            android.util.Log.w(r11, r12)     // Catch:{ all -> 0x01b4 }
            if (r2 == 0) goto L_0x01b3
            r2.close()     // Catch:{ all -> 0x01bf }
        L_0x01b3:
            return r3
        L_0x01b4:
            r11 = move-exception
            goto L_0x0190
        L_0x01b6:
            if (r2 == 0) goto L_0x01bb
            r2.close()     // Catch:{ all -> 0x01bf }
        L_0x01bb:
            throw r12     // Catch:{ all -> 0x01bf }
        L_0x01bc:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01bc }
            throw r11     // Catch:{ all -> 0x01bf }
        L_0x01bf:
            r11 = move-exception
            l2.f.a(r10, r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.f(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00bc A[Catch:{ all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bd A[Catch:{ all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int g(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) {
        /*
            r0 = 0
            java.lang.ThreadLocal r1 = f5066n     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L_0x0019
            r10 = r4
        L_0x0019:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            r12.<init>()     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.net.Uri r4 = r10.build()     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            if (r10 == 0) goto L_0x00a3
            boolean r11 = r10.moveToFirst()     // Catch:{ Exception -> 0x009b }
            if (r11 == 0) goto L_0x00a3
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch:{ Exception -> 0x009b }
            if (r12 <= 0) goto L_0x008e
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch:{ Exception -> 0x009b }
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch:{ all -> 0x008b }
            f5061i = r2     // Catch:{ all -> 0x008b }
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x006f
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            f5063k = r2     // Catch:{ all -> 0x008b }
        L_0x006f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader2"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x0082
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r9 = 0
        L_0x007f:
            f5062j = r9     // Catch:{ all -> 0x008b }
            r11 = r9
        L_0x0082:
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            boolean r1 = j(r10)     // Catch:{ Exception -> 0x009b }
            if (r1 == 0) goto L_0x008e
            r10 = r0
            goto L_0x008e
        L_0x008b:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x008e:
            if (r13 == 0) goto L_0x009d
            if (r11 != 0) goto L_0x0093
            goto L_0x009d
        L_0x0093:
            com.google.android.gms.dynamite.DynamiteModule$a r11 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x009b }
            java.lang.String r12 = "forcing fallback to container DynamiteLoader impl"
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x009b:
            r11 = move-exception
            goto L_0x00b8
        L_0x009d:
            if (r10 == 0) goto L_0x00a2
            r10.close()
        L_0x00a2:
            return r12
        L_0x00a3:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r12)     // Catch:{ Exception -> 0x009b }
            com.google.android.gms.dynamite.DynamiteModule$a r11 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x009b }
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x00b2:
            r10 = move-exception
            r11 = r10
            goto L_0x00c7
        L_0x00b5:
            r10 = move-exception
            r11 = r10
            r10 = r0
        L_0x00b8:
            boolean r12 = r11 instanceof com.google.android.gms.dynamite.DynamiteModule.a     // Catch:{ all -> 0x00c5 }
            if (r12 == 0) goto L_0x00bd
            throw r11     // Catch:{ all -> 0x00c5 }
        L_0x00bd:
            com.google.android.gms.dynamite.DynamiteModule$a r12 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x00c5 }
            java.lang.String r13 = "V2 version check failed"
            r12.<init>(r13, r11, r0)     // Catch:{ all -> 0x00c5 }
            throw r12     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r11 = move-exception
            r0 = r10
        L_0x00c7:
            if (r0 == 0) goto L_0x00cc
            r0.close()
        L_0x00cc:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.g(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule h(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context.getApplicationContext());
    }

    private static void i(ClassLoader classLoader) {
        n nVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                nVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                nVar = queryLocalInterface instanceof n ? (n) queryLocalInterface : new n(iBinder);
            }
            f5070r = nVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new a("Failed to instantiate dynamite loader", e10, (d) null);
        }
    }

    private static boolean j(Cursor cursor) {
        k kVar = (k) f5065m.get();
        if (kVar == null || kVar.f5075a != null) {
            return false;
        }
        kVar.f5075a = cursor;
        return true;
    }

    private static boolean k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals((Object) null) || bool.equals(f5064l)) {
            return true;
        }
        boolean z9 = false;
        if (f5064l == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (e2.f.f().h(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z9 = true;
            }
            Boolean valueOf = Boolean.valueOf(z9);
            f5064l = valueOf;
            z9 = valueOf.booleanValue();
            if (z9 && resolveContentProvider != null && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f5062j = true;
            }
        }
        if (!z9) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z9;
    }

    private static m l(Context context) {
        m mVar;
        synchronized (DynamiteModule.class) {
            m mVar2 = f5069q;
            if (mVar2 != null) {
                return mVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    mVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    mVar = queryLocalInterface instanceof m ? (m) queryLocalInterface : new m(iBinder);
                }
                if (mVar != null) {
                    f5069q = mVar;
                    return mVar;
                }
            } catch (Exception e10) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e10.getMessage());
            }
        }
        return null;
    }

    public Context b() {
        return this.f5071a;
    }

    public IBinder d(String str) {
        try {
            return (IBinder) this.f5071a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e10, (d) null);
        }
    }
}
