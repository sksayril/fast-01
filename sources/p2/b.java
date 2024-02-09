package p2;

import android.os.Looper;
import android.util.Log;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile ClassLoader f11855a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile Thread f11856b;

    public static synchronized ClassLoader a() {
        ClassLoader classLoader;
        synchronized (b.class) {
            if (f11855a == null) {
                f11855a = b();
            }
            classLoader = f11855a;
        }
        return classLoader;
    }

    private static synchronized ClassLoader b() {
        synchronized (b.class) {
            ClassLoader classLoader = null;
            if (f11856b == null) {
                f11856b = c();
                if (f11856b == null) {
                    return null;
                }
            }
            synchronized (f11856b) {
                try {
                    classLoader = f11856b.getContextClassLoader();
                } catch (SecurityException e10) {
                    String message = e10.getMessage();
                    Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + message);
                }
            }
            return classLoader;
        }
    }

    private static synchronized Thread c() {
        a aVar;
        a aVar2;
        SecurityException e10;
        ThreadGroup threadGroup;
        synchronized (b.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    int activeGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= activeGroupCount) {
                            threadGroup = null;
                            break;
                        }
                        threadGroup = threadGroupArr[i11];
                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                            break;
                        }
                        i11++;
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i10 >= activeCount) {
                            aVar = null;
                            break;
                        }
                        aVar = threadArr[i10];
                        if ("GmsDynamite".equals(aVar.getName())) {
                            break;
                        }
                        i10++;
                    }
                    if (aVar == null) {
                        try {
                            aVar2 = new a(threadGroup, "GmsDynamite");
                            try {
                                aVar2.setContextClassLoader((ClassLoader) null);
                                aVar2.start();
                            } catch (SecurityException e11) {
                                e10 = e11;
                            }
                        } catch (SecurityException e12) {
                            e10 = e12;
                            aVar2 = aVar;
                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e10.getMessage());
                            aVar = aVar2;
                            return aVar;
                        }
                        aVar = aVar2;
                    }
                } catch (SecurityException e13) {
                    e10 = e13;
                    aVar2 = null;
                    Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e10.getMessage());
                    aVar = aVar2;
                    return aVar;
                }
            }
            return aVar;
        }
    }
}
