package com.amazonaws.logging;

import com.amazonaws.logging.LogFactory;

public final class ConsoleLog implements Log {

    /* renamed from: a  reason: collision with root package name */
    private final String f4089a;

    /* renamed from: b  reason: collision with root package name */
    private LogFactory.Level f4090b = null;

    public ConsoleLog(String str) {
        this.f4089a = str;
    }

    private LogFactory.Level l() {
        LogFactory.Level level = this.f4090b;
        return level != null ? level : LogFactory.a();
    }

    private void o(LogFactory.Level level, Object obj, Throwable th) {
        System.out.printf("%s/%s: %s\n", new Object[]{this.f4089a, level.name(), obj});
        if (th != null) {
            System.out.println(th.toString());
        }
    }

    public void a(Object obj) {
        if (c()) {
            o(LogFactory.Level.DEBUG, obj, (Throwable) null);
        }
    }

    public void b(Object obj, Throwable th) {
        if (c()) {
            o(LogFactory.Level.DEBUG, obj, th);
        }
    }

    public boolean c() {
        return l() == null || l().getValue() <= LogFactory.Level.DEBUG.getValue();
    }

    public boolean d() {
        return l() == null || l().getValue() <= LogFactory.Level.ERROR.getValue();
    }

    public void e(Object obj) {
        if (n()) {
            o(LogFactory.Level.WARN, obj, (Throwable) null);
        }
    }

    public boolean f() {
        return l() == null || l().getValue() <= LogFactory.Level.INFO.getValue();
    }

    public void g(Object obj) {
        if (d()) {
            o(LogFactory.Level.ERROR, obj, (Throwable) null);
        }
    }

    public void h(Object obj) {
        if (f()) {
            o(LogFactory.Level.INFO, obj, (Throwable) null);
        }
    }

    public void i(Object obj, Throwable th) {
        if (n()) {
            o(LogFactory.Level.WARN, obj, th);
        }
    }

    public void j(Object obj) {
        if (m()) {
            o(LogFactory.Level.TRACE, obj, (Throwable) null);
        }
    }

    public void k(Object obj, Throwable th) {
        if (d()) {
            o(LogFactory.Level.ERROR, obj, th);
        }
    }

    public boolean m() {
        return l() == null || l().getValue() <= LogFactory.Level.TRACE.getValue();
    }

    public boolean n() {
        return l() == null || l().getValue() <= LogFactory.Level.WARN.getValue();
    }
}
