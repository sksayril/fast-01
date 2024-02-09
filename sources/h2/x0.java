package h2;

import android.os.Looper;
import android.os.Message;
import s2.e;

final class x0 extends e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f9265a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x0(c cVar, Looper looper) {
        super(looper);
        this.f9265a = cVar;
    }

    private static final void a(Message message) {
        y0 y0Var = (y0) message.obj;
        y0Var.b();
        y0Var.e();
    }

    private static final boolean b(Message message) {
        int i10 = message.what;
        return i10 == 2 || i10 == 1 || i10 == 7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            h2.c r0 = r7.f9265a
            java.util.concurrent.atomic.AtomicInteger r0 = r0.C
            int r0 = r0.get()
            int r1 = r8.arg1
            if (r0 == r1) goto L_0x0016
            boolean r0 = b(r8)
            if (r0 == 0) goto L_0x0015
            a(r8)
        L_0x0015:
            return
        L_0x0016:
            int r0 = r8.what
            r1 = 4
            r2 = 1
            r3 = 5
            if (r0 == r2) goto L_0x002e
            r4 = 7
            if (r0 == r4) goto L_0x002e
            if (r0 != r1) goto L_0x002a
            h2.c r0 = r7.f9265a
            boolean r0 = r0.t()
            if (r0 == 0) goto L_0x002e
        L_0x002a:
            int r0 = r8.what
            if (r0 != r3) goto L_0x0036
        L_0x002e:
            h2.c r0 = r7.f9265a
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x0120
        L_0x0036:
            int r0 = r8.what
            r4 = 8
            r5 = 3
            r6 = 0
            if (r0 != r1) goto L_0x007e
            h2.c r0 = r7.f9265a
            e2.b r1 = new e2.b
            int r8 = r8.arg2
            r1.<init>(r8)
            r0.f9135z = r1
            h2.c r8 = r7.f9265a
            boolean r8 = h2.c.h0(r8)
            if (r8 == 0) goto L_0x005f
            h2.c r8 = r7.f9265a
            boolean r0 = r8.A
            if (r0 == 0) goto L_0x005b
            goto L_0x005f
        L_0x005b:
            r8.i0(r5, (android.os.IInterface) null)
            return
        L_0x005f:
            h2.c r8 = r7.f9265a
            e2.b r0 = r8.f9135z
            if (r0 == 0) goto L_0x006c
            e2.b r8 = r8.f9135z
            goto L_0x0071
        L_0x006c:
            e2.b r8 = new e2.b
            r8.<init>(r4)
        L_0x0071:
            h2.c r0 = r7.f9265a
            h2.c$c r0 = r0.f9125p
            r0.a(r8)
            h2.c r0 = r7.f9265a
            r0.L(r8)
            return
        L_0x007e:
            if (r0 != r3) goto L_0x009f
            h2.c r8 = r7.f9265a
            e2.b r0 = r8.f9135z
            if (r0 == 0) goto L_0x008d
            e2.b r8 = r8.f9135z
            goto L_0x0092
        L_0x008d:
            e2.b r8 = new e2.b
            r8.<init>(r4)
        L_0x0092:
            h2.c r0 = r7.f9265a
            h2.c$c r0 = r0.f9125p
            r0.a(r8)
            h2.c r0 = r7.f9265a
            r0.L(r8)
            return
        L_0x009f:
            if (r0 != r5) goto L_0x00be
            java.lang.Object r0 = r8.obj
            boolean r1 = r0 instanceof android.app.PendingIntent
            if (r1 == 0) goto L_0x00aa
            r6 = r0
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
        L_0x00aa:
            e2.b r0 = new e2.b
            int r8 = r8.arg2
            r0.<init>(r8, r6)
            h2.c r8 = r7.f9265a
            h2.c$c r8 = r8.f9125p
            r8.a(r0)
            h2.c r8 = r7.f9265a
            r8.L(r0)
            return
        L_0x00be:
            r1 = 6
            if (r0 != r1) goto L_0x00e4
            h2.c r0 = r7.f9265a
            r0.i0(r3, (android.os.IInterface) null)
            h2.c r0 = r7.f9265a
            h2.c$a r1 = r0.f9130u
            if (r1 == 0) goto L_0x00d7
            h2.c$a r0 = r0.f9130u
            int r1 = r8.arg2
            r0.B(r1)
        L_0x00d7:
            h2.c r0 = r7.f9265a
            int r8 = r8.arg2
            r0.M(r8)
            h2.c r8 = r7.f9265a
            h2.c.g0(r8, r3, r2, r6)
            return
        L_0x00e4:
            r1 = 2
            if (r0 != r1) goto L_0x00f4
            h2.c r0 = r7.f9265a
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x00f0
            goto L_0x00f4
        L_0x00f0:
            a(r8)
            return
        L_0x00f4:
            boolean r0 = b(r8)
            if (r0 == 0) goto L_0x0102
            java.lang.Object r8 = r8.obj
            h2.y0 r8 = (h2.y0) r8
            r8.c()
            return
        L_0x0102:
            int r8 = r8.what
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Don't know how to handle message: "
            r0.append(r1)
            r0.append(r8)
            java.lang.Exception r8 = new java.lang.Exception
            r8.<init>()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "GmsClient"
            android.util.Log.wtf(r1, r0, r8)
            return
        L_0x0120:
            a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.x0.handleMessage(android.os.Message):void");
    }
}
