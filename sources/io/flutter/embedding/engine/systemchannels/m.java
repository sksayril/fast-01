package io.flutter.embedding.engine.systemchannels;

import java.util.HashMap;
import java.util.Map;
import k7.j;
import k7.k;
import k7.s;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f9948a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public byte[] f9949b;

    /* renamed from: c  reason: collision with root package name */
    private k f9950c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public k.d f9951d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f9952e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f9953f;

    /* renamed from: g  reason: collision with root package name */
    private final k.c f9954g;

    class a implements k.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ byte[] f9955a;

        a(byte[] bArr) {
            this.f9955a = bArr;
        }

        public void a(Object obj) {
            byte[] unused = m.this.f9949b = this.f9955a;
        }

        public void b(String str, String str2, Object obj) {
            x6.b.b("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
        }

        public void c() {
        }
    }

    class b implements k.c {
        b() {
        }

        public void onMethodCall(j jVar, k.d dVar) {
            Map e10;
            String str = jVar.f10996a;
            Object obj = jVar.f10997b;
            str.hashCode();
            if (str.equals("get")) {
                boolean unused = m.this.f9953f = true;
                if (!m.this.f9952e) {
                    m mVar = m.this;
                    if (mVar.f9948a) {
                        k.d unused2 = mVar.f9951d = dVar;
                        return;
                    }
                }
                m mVar2 = m.this;
                e10 = mVar2.i(mVar2.f9949b);
            } else if (!str.equals("put")) {
                dVar.c();
                return;
            } else {
                byte[] unused3 = m.this.f9949b = (byte[]) obj;
                e10 = null;
            }
            dVar.a(e10);
        }
    }

    m(k kVar, boolean z9) {
        this.f9952e = false;
        this.f9953f = false;
        b bVar = new b();
        this.f9954g = bVar;
        this.f9950c = kVar;
        this.f9948a = z9;
        kVar.e(bVar);
    }

    public m(y6.a aVar, boolean z9) {
        this(new k(aVar, "flutter/restoration", s.f11011b), z9);
    }

    /* access modifiers changed from: private */
    public Map<String, Object> i(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }

    public void g() {
        this.f9949b = null;
    }

    public byte[] h() {
        return this.f9949b;
    }

    public void j(byte[] bArr) {
        this.f9952e = true;
        k.d dVar = this.f9951d;
        if (dVar != null) {
            dVar.a(i(bArr));
            this.f9951d = null;
        } else if (this.f9953f) {
            this.f9950c.d("push", i(bArr), new a(bArr));
            return;
        }
        this.f9949b = bArr;
    }
}
