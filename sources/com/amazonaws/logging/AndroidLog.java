package com.amazonaws.logging;

import android.util.Log;
import com.amazonaws.logging.LogFactory;

public class AndroidLog implements Log {

    /* renamed from: a  reason: collision with root package name */
    private final String f4087a;

    /* renamed from: b  reason: collision with root package name */
    private LogFactory.Level f4088b = null;

    public AndroidLog(String str) {
        this.f4087a = str;
    }

    private LogFactory.Level l() {
        LogFactory.Level level = this.f4088b;
        return level != null ? level : LogFactory.a();
    }

    public void a(Object obj) {
        if (l() == null || l().getValue() <= LogFactory.Level.DEBUG.getValue()) {
            Log.d(this.f4087a, obj.toString());
        }
    }

    public void b(Object obj, Throwable th) {
        if (l() == null || l().getValue() <= LogFactory.Level.DEBUG.getValue()) {
            Log.d(this.f4087a, obj.toString(), th);
        }
    }

    public boolean c() {
        return Log.isLoggable(this.f4087a, 3) && (l() == null || l().getValue() <= LogFactory.Level.DEBUG.getValue());
    }

    public boolean d() {
        return Log.isLoggable(this.f4087a, 6) && (l() == null || l().getValue() <= LogFactory.Level.ERROR.getValue());
    }

    public void e(Object obj) {
        if (l() == null || l().getValue() <= LogFactory.Level.WARN.getValue()) {
            Log.w(this.f4087a, obj.toString());
        }
    }

    public boolean f() {
        return Log.isLoggable(this.f4087a, 4) && (l() == null || l().getValue() <= LogFactory.Level.INFO.getValue());
    }

    public void g(Object obj) {
        if (l() == null || l().getValue() <= LogFactory.Level.ERROR.getValue()) {
            Log.e(this.f4087a, obj.toString());
        }
    }

    public void h(Object obj) {
        if (l() == null || l().getValue() <= LogFactory.Level.INFO.getValue()) {
            Log.i(this.f4087a, obj.toString());
        }
    }

    public void i(Object obj, Throwable th) {
        if (l() == null || l().getValue() <= LogFactory.Level.WARN.getValue()) {
            Log.w(this.f4087a, obj.toString(), th);
        }
    }

    public void j(Object obj) {
        if (l() == null || l().getValue() <= LogFactory.Level.TRACE.getValue()) {
            Log.v(this.f4087a, obj.toString());
        }
    }

    public void k(Object obj, Throwable th) {
        if (l() == null || l().getValue() <= LogFactory.Level.ERROR.getValue()) {
            Log.e(this.f4087a, obj.toString(), th);
        }
    }
}
