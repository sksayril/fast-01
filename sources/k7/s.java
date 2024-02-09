package k7;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import k7.r;
import x6.b;

public final class s implements l {

    /* renamed from: b  reason: collision with root package name */
    public static final s f11011b = new s(r.f11008a);

    /* renamed from: a  reason: collision with root package name */
    private final r f11012a;

    public s(r rVar) {
        this.f11012a = rVar;
    }

    public ByteBuffer a(Object obj) {
        r.a aVar = new r.a();
        aVar.write(0);
        this.f11012a.p(aVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    public ByteBuffer b(String str, String str2, Object obj, String str3) {
        r.a aVar = new r.a();
        aVar.write(1);
        this.f11012a.p(aVar, str);
        this.f11012a.p(aVar, str2);
        if (obj instanceof Throwable) {
            this.f11012a.p(aVar, b.d((Throwable) obj));
        } else {
            this.f11012a.p(aVar, obj);
        }
        this.f11012a.p(aVar, str3);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    public ByteBuffer c(String str, String str2, Object obj) {
        r.a aVar = new r.a();
        aVar.write(1);
        this.f11012a.p(aVar, str);
        this.f11012a.p(aVar, str2);
        if (obj instanceof Throwable) {
            this.f11012a.p(aVar, b.d((Throwable) obj));
        } else {
            this.f11012a.p(aVar, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    public ByteBuffer d(j jVar) {
        r.a aVar = new r.a();
        this.f11012a.p(aVar, jVar.f10996a);
        this.f11012a.p(aVar, jVar.f10997b);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    public j e(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        Object f10 = this.f11012a.f(byteBuffer);
        Object f11 = this.f11012a.f(byteBuffer);
        if ((f10 instanceof String) && !byteBuffer.hasRemaining()) {
            return new j((String) f10, f11);
        }
        throw new IllegalArgumentException("Method call corrupted");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 == 1) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object f(java.nio.ByteBuffer r5) {
        /*
            r4 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            r5.order(r0)
            byte r0 = r5.get()
            if (r0 == 0) goto L_0x0011
            r1 = 1
            if (r0 != r1) goto L_0x004a
            goto L_0x001e
        L_0x0011:
            k7.r r0 = r4.f11012a
            java.lang.Object r0 = r0.f(r5)
            boolean r1 = r5.hasRemaining()
            if (r1 != 0) goto L_0x001e
            return r0
        L_0x001e:
            k7.r r0 = r4.f11012a
            java.lang.Object r0 = r0.f(r5)
            k7.r r1 = r4.f11012a
            java.lang.Object r1 = r1.f(r5)
            k7.r r2 = r4.f11012a
            java.lang.Object r2 = r2.f(r5)
            boolean r3 = r0 instanceof java.lang.String
            if (r3 == 0) goto L_0x004a
            if (r1 == 0) goto L_0x003a
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L_0x004a
        L_0x003a:
            boolean r5 = r5.hasRemaining()
            if (r5 != 0) goto L_0x004a
            k7.e r5 = new k7.e
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = (java.lang.String) r1
            r5.<init>(r0, r1, r2)
            throw r5
        L_0x004a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Envelope corrupted"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.s.f(java.nio.ByteBuffer):java.lang.Object");
    }
}
