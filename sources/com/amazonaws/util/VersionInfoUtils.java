package com.amazonaws.util;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

public class VersionInfoUtils {

    /* renamed from: a  reason: collision with root package name */
    private static volatile String f4770a = "2.22.6";

    /* renamed from: b  reason: collision with root package name */
    private static volatile String f4771b = "android";

    /* renamed from: c  reason: collision with root package name */
    private static volatile String f4772c;

    /* renamed from: d  reason: collision with root package name */
    private static final Log f4773d = LogFactory.b(VersionInfoUtils.class);

    public static String a() {
        return f4771b;
    }

    public static String b() {
        if (f4772c == null) {
            synchronized (VersionInfoUtils.class) {
                if (f4772c == null) {
                    d();
                }
            }
        }
        return f4772c;
    }

    public static String c() {
        return f4770a;
    }

    private static void d() {
        f4772c = f();
    }

    private static String e(String str) {
        return str != null ? str.replace(' ', '_') : str;
    }

    static String f() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("aws-sdk-");
        sb.append(StringUtils.b(a()));
        sb.append("/");
        sb.append(c());
        sb.append(" ");
        sb.append(e(System.getProperty("os.name")));
        sb.append("/");
        sb.append(e(System.getProperty("os.version")));
        sb.append(" ");
        sb.append(e(System.getProperty("java.vm.name")));
        sb.append("/");
        sb.append(e(System.getProperty("java.vm.version")));
        sb.append("/");
        sb.append(e(System.getProperty("java.version")));
        String property = System.getProperty("user.language");
        String property2 = System.getProperty("user.region");
        if (!(property == null || property2 == null)) {
            sb.append(" ");
            sb.append(e(property));
            sb.append("_");
            sb.append(e(property2));
        }
        return sb.toString();
    }
}
