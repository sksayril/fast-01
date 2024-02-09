package com.amazonaws.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public enum ClassLoaderHelper {
    ;

    public static URL getResource(String str, boolean z9, Class<?>... clsArr) {
        URL url;
        if (z9) {
            url = getResourceViaClasses(str, clsArr);
            if (url == null) {
                url = getResourceViaContext(str);
            }
        } else {
            url = getResourceViaContext(str);
            if (url == null) {
                url = getResourceViaClasses(str, clsArr);
            }
        }
        return url == null ? ClassLoaderHelper.class.getResource(str) : url;
    }

    public static URL getResource(String str, Class<?>... clsArr) {
        return getResource(str, false, clsArr);
    }

    public static InputStream getResourceAsStream(String str, boolean z9, Class<?>... clsArr) {
        URL resource = getResource(str, z9, clsArr);
        if (resource == null) {
            return null;
        }
        try {
            return resource.openStream();
        } catch (IOException unused) {
            return null;
        }
    }

    public static InputStream getResourceAsStream(String str, Class<?>... clsArr) {
        return getResourceAsStream(str, false, clsArr);
    }

    private static URL getResourceViaClasses(String str, Class<?>[] clsArr) {
        if (clsArr == null) {
            return null;
        }
        for (Class<?> resource : clsArr) {
            URL resource2 = resource.getResource(str);
            if (resource2 != null) {
                return resource2;
            }
        }
        return null;
    }

    private static URL getResourceViaContext(String str) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            return null;
        }
        return contextClassLoader.getResource(str);
    }

    public static Class<?> loadClass(String str, boolean z9, Class<?>... clsArr) {
        Class<?> cls;
        if (z9) {
            cls = loadClassViaClasses(str, clsArr);
            if (cls == null) {
                cls = loadClassViaContext(str);
            }
        } else {
            cls = loadClassViaContext(str);
            if (cls == null) {
                cls = loadClassViaClasses(str, clsArr);
            }
        }
        return cls == null ? Class.forName(str) : cls;
    }

    public static Class<?> loadClass(String str, Class<?>... clsArr) {
        return loadClass(str, true, clsArr);
    }

    private static Class<?> loadClassViaClasses(String str, Class<?>[] clsArr) {
        if (clsArr == null) {
            return null;
        }
        int length = clsArr.length;
        int i10 = 0;
        while (i10 < length) {
            ClassLoader classLoader = clsArr[i10].getClassLoader();
            if (classLoader != null) {
                try {
                    return classLoader.loadClass(str);
                } catch (ClassNotFoundException unused) {
                }
            } else {
                i10++;
            }
        }
        return null;
    }

    private static Class<?> loadClassViaContext(String str) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            return null;
        }
        try {
            return contextClassLoader.loadClass(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
