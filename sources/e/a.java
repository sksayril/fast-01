package e;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.l;

public abstract class a<I, O> {

    /* renamed from: e.a$a  reason: collision with other inner class name */
    public static final class C0127a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final T f8276a;

        public C0127a(T t9) {
            this.f8276a = t9;
        }

        public final T a() {
            return this.f8276a;
        }
    }

    public abstract Intent a(Context context, I i10);

    public C0127a<O> b(Context context, I i10) {
        l.e(context, "context");
        return null;
    }

    public abstract O c(int i10, Intent intent);
}
