package h2;

import android.os.Bundle;
import e2.b;

abstract class o0 extends y0 {

    /* renamed from: d  reason: collision with root package name */
    public final int f9238d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f9239e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ c f9240f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected o0(c cVar, int i10, Bundle bundle) {
        super(cVar, Boolean.TRUE);
        this.f9240f = cVar;
        this.f9238d = i10;
        this.f9239e = bundle;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [android.os.Parcelable] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void a(java.lang.Object r3) {
        /*
            r2 = this;
            int r3 = r2.f9238d
            r0 = 1
            r1 = 0
            if (r3 != 0) goto L_0x001c
            boolean r3 = r2.g()
            if (r3 != 0) goto L_0x001b
            h2.c r3 = r2.f9240f
            r3.i0(r0, (android.os.IInterface) null)
            e2.b r3 = new e2.b
            r0 = 8
            r3.<init>(r0, r1)
        L_0x0018:
            r2.f(r3)
        L_0x001b:
            return
        L_0x001c:
            h2.c r3 = r2.f9240f
            r3.i0(r0, (android.os.IInterface) null)
            android.os.Bundle r3 = r2.f9239e
            if (r3 == 0) goto L_0x002e
            java.lang.String r0 = "pendingIntent"
            android.os.Parcelable r3 = r3.getParcelable(r0)
            r1 = r3
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
        L_0x002e:
            e2.b r3 = new e2.b
            int r0 = r2.f9238d
            r3.<init>(r0, r1)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.o0.a(java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    public final void b() {
    }

    /* access modifiers changed from: protected */
    public abstract void f(b bVar);

    /* access modifiers changed from: protected */
    public abstract boolean g();
}
