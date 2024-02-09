package z4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class d {

    /* renamed from: b  reason: collision with root package name */
    private static volatile d f13591b;

    /* renamed from: a  reason: collision with root package name */
    private final Set<f> f13592a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar = f13591b;
        if (dVar == null) {
            synchronized (d.class) {
                dVar = f13591b;
                if (dVar == null) {
                    dVar = new d();
                    f13591b = dVar;
                }
            }
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    public Set<f> b() {
        Set<f> unmodifiableSet;
        synchronized (this.f13592a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f13592a);
        }
        return unmodifiableSet;
    }
}
