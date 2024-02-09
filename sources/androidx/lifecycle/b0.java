package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public abstract class b0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f2734a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Set<Closeable> f2735b = new LinkedHashSet();

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f2736c = false;

    private static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f2736c = true;
        Map<String, Object> map = this.f2734a;
        if (map != null) {
            synchronized (map) {
                for (Object b10 : this.f2734a.values()) {
                    b(b10);
                }
            }
        }
        Set<Closeable> set = this.f2735b;
        if (set != null) {
            synchronized (set) {
                for (Closeable b11 : this.f2735b) {
                    b(b11);
                }
            }
        }
        d();
    }

    /* access modifiers changed from: package-private */
    public <T> T c(String str) {
        T t9;
        Map<String, Object> map = this.f2734a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t9 = this.f2734a.get(str);
        }
        return t9;
    }

    /* access modifiers changed from: protected */
    public void d() {
    }
}
