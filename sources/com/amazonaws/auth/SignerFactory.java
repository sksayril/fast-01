package com.amazonaws.auth;

import com.amazonaws.internal.config.InternalConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class SignerFactory {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Class<? extends Signer>> f4027a;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f4027a = concurrentHashMap;
        concurrentHashMap.put("QueryStringSignerType", QueryStringSigner.class);
        concurrentHashMap.put("AWS4SignerType", AWS4Signer.class);
        concurrentHashMap.put("NoOpSignerType", NoOpSigner.class);
    }

    private static Signer a(String str, String str2) {
        Class cls = f4027a.get(str);
        if (cls != null) {
            try {
                Signer signer = (Signer) cls.newInstance();
                if (signer instanceof ServiceAwareSigner) {
                    ((ServiceAwareSigner) signer).c(str2);
                }
                return signer;
            } catch (InstantiationException e10) {
                throw new IllegalStateException("Cannot create an instance of " + cls.getName(), e10);
            } catch (IllegalAccessException e11) {
                throw new IllegalStateException("Cannot create an instance of " + cls.getName(), e11);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static Signer b(String str, String str2) {
        return d(str, str2);
    }

    public static Signer c(String str, String str2) {
        return a(str, str2);
    }

    private static Signer d(String str, String str2) {
        return a(InternalConfig.Factory.a().i(str, str2).a(), str);
    }

    public static void e(String str, Class<? extends Signer> cls) {
        if (str == null) {
            throw new IllegalArgumentException("signerType cannot be null");
        } else if (cls != null) {
            f4027a.put(str, cls);
        } else {
            throw new IllegalArgumentException("signerClass cannot be null");
        }
    }
}
