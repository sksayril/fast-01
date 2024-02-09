package com.amazonaws.logging;

import java.util.HashMap;
import java.util.Map;

public class LogFactory {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4091a = "LogFactory";

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, Log> f4092b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private static Level f4093c = null;

    public enum Level {
        ALL(Integer.MIN_VALUE),
        TRACE(0),
        DEBUG(1),
        INFO(2),
        WARN(3),
        ERROR(4),
        OFF(Integer.MAX_VALUE);
        
        private final int value;

        private Level(int i10) {
            this.value = i10;
        }

        public int getValue() {
            return this.value;
        }
    }

    public static Level a() {
        return f4093c;
    }

    public static synchronized Log b(Class<?> cls) {
        Log c10;
        synchronized (LogFactory.class) {
            c10 = c(d(cls.getSimpleName()));
        }
        return c10;
    }

    public static synchronized Log c(String str) {
        synchronized (LogFactory.class) {
            String d10 = d(str);
            Map<String, Log> map = f4092b;
            Log log = map.get(d10);
            if (log != null) {
                return log;
            }
            Log consoleLog = Environment.a() ? new ConsoleLog(d10) : new AndroidLog(d10);
            map.put(d10, consoleLog);
            return consoleLog;
        }
    }

    private static String d(String str) {
        if (str.length() <= 23) {
            return str;
        }
        c(f4091a).e("Truncating log tag length as it exceed 23, the limit imposed by Android on certain API Levels");
        return str.substring(0, 23);
    }
}
