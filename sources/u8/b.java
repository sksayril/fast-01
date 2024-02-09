package u8;

import java.util.Random;
import kotlin.jvm.internal.l;

public final class b extends a {

    /* renamed from: o  reason: collision with root package name */
    private final a f12539o = new a();

    public static final class a extends ThreadLocal<Random> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    public Random c() {
        Object obj = this.f12539o.get();
        l.d(obj, "implStorage.get()");
        return (Random) obj;
    }
}
