package androidx.window.java.layout;

import androidx.core.util.a;
import e9.c;
import g8.s;
import j8.d;

public final class WindowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1 implements c<T> {
    final /* synthetic */ a $consumer$inlined;

    public WindowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1(a aVar) {
        this.$consumer$inlined = aVar;
    }

    public Object emit(T t9, d<? super s> dVar) {
        this.$consumer$inlined.accept(t9);
        return s.f8976a;
    }
}
