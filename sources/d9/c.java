package d9;

import b9.l;
import g8.s;
import g9.h0;
import kotlin.jvm.internal.j;
import r8.p;
import x8.e;

public final class c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final h<Object> f8243a = new h(-1, (h) null, (b) null, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final int f8244b = k0.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f8245c = k0.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    public static final h0 f8246d = new h0("BUFFERED");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final h0 f8247e = new h0("SHOULD_BUFFER");
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final h0 f8248f = new h0("S_RESUMING_BY_RCV");
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final h0 f8249g = new h0("RESUMING_BY_EB");
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final h0 f8250h = new h0("POISONED");
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final h0 f8251i = new h0("DONE_RCV");
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final h0 f8252j = new h0("INTERRUPTED_SEND");
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final h0 f8253k = new h0("INTERRUPTED_RCV");

    /* renamed from: l  reason: collision with root package name */
    private static final h0 f8254l = new h0("CHANNEL_CLOSED");
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final h0 f8255m = new h0("SUSPEND");
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final h0 f8256n = new h0("SUSPEND_NO_WAITER");
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static final h0 f8257o = new h0("FAILED");
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public static final h0 f8258p = new h0("NO_RECEIVE_RESULT");
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public static final h0 f8259q = new h0("CLOSE_HANDLER_CLOSED");
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static final h0 f8260r = new h0("CLOSE_HANDLER_INVOKED");
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public static final h0 f8261s = new h0("NO_CLOSE_CAUSE");

    /* synthetic */ class a extends j implements p<Long, h<E>, h<E>> {

        /* renamed from: m  reason: collision with root package name */
        public static final a f8262m = new a();

        a() {
            super(2, c.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public final h<E> d(long j10, h<E> hVar) {
            return c.x(j10, hVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return d(((Number) obj).longValue(), (h) obj2);
        }
    }

    /* access modifiers changed from: private */
    public static final long A(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 != Integer.MAX_VALUE) {
            return (long) i10;
        }
        return Long.MAX_VALUE;
    }

    /* access modifiers changed from: private */
    public static final <T> boolean B(l<? super T> lVar, T t9, r8.l<? super Throwable, s> lVar2) {
        Object j10 = lVar.j(t9, (Object) null, lVar2);
        if (j10 == null) {
            return false;
        }
        lVar.n(j10);
        return true;
    }

    static /* synthetic */ boolean C(l lVar, Object obj, r8.l lVar2, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar2 = null;
        }
        return B(lVar, obj, lVar2);
    }

    /* access modifiers changed from: private */
    public static final long v(long j10, boolean z9) {
        return (z9 ? 4611686018427387904L : 0) + j10;
    }

    /* access modifiers changed from: private */
    public static final long w(long j10, int i10) {
        return (((long) i10) << 60) + j10;
    }

    /* access modifiers changed from: private */
    public static final <E> h<E> x(long j10, h<E> hVar) {
        return new h(j10, hVar, hVar.u(), 0);
    }

    public static final <E> e<h<E>> y() {
        return a.f8262m;
    }

    public static final h0 z() {
        return f8254l;
    }
}
