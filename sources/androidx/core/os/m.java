package androidx.core.os;

import android.os.OutcomeReceiver;
import j8.d;
import kotlin.jvm.internal.l;

public final class m {
    public static final <R, E extends Throwable> OutcomeReceiver<R, E> a(d<? super R> dVar) {
        l.e(dVar, "<this>");
        return new g(dVar);
    }
}
