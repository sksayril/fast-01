package o5;

import java.util.EnumMap;
import java.util.Map;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final String f11632a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f11633b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11634c;

    /* renamed from: d  reason: collision with root package name */
    private p[] f11635d;

    /* renamed from: e  reason: collision with root package name */
    private final a f11636e;

    /* renamed from: f  reason: collision with root package name */
    private Map<o, Object> f11637f;

    /* renamed from: g  reason: collision with root package name */
    private final long f11638g;

    public n(String str, byte[] bArr, int i10, p[] pVarArr, a aVar, long j10) {
        this.f11632a = str;
        this.f11633b = bArr;
        this.f11634c = i10;
        this.f11635d = pVarArr;
        this.f11636e = aVar;
        this.f11637f = null;
        this.f11638g = j10;
    }

    public n(String str, byte[] bArr, p[] pVarArr, a aVar) {
        this(str, bArr, pVarArr, aVar, System.currentTimeMillis());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public n(String str, byte[] bArr, p[] pVarArr, a aVar, long j10) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, pVarArr, aVar, j10);
    }

    public void a(p[] pVarArr) {
        p[] pVarArr2 = this.f11635d;
        if (pVarArr2 == null) {
            this.f11635d = pVarArr;
        } else if (pVarArr != null && pVarArr.length > 0) {
            p[] pVarArr3 = new p[(pVarArr2.length + pVarArr.length)];
            System.arraycopy(pVarArr2, 0, pVarArr3, 0, pVarArr2.length);
            System.arraycopy(pVarArr, 0, pVarArr3, pVarArr2.length, pVarArr.length);
            this.f11635d = pVarArr3;
        }
    }

    public a b() {
        return this.f11636e;
    }

    public byte[] c() {
        return this.f11633b;
    }

    public Map<o, Object> d() {
        return this.f11637f;
    }

    public p[] e() {
        return this.f11635d;
    }

    public String f() {
        return this.f11632a;
    }

    public void g(Map<o, Object> map) {
        if (map != null) {
            Map<o, Object> map2 = this.f11637f;
            if (map2 == null) {
                this.f11637f = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public void h(o oVar, Object obj) {
        if (this.f11637f == null) {
            this.f11637f = new EnumMap(o.class);
        }
        this.f11637f.put(oVar, obj);
    }

    public String toString() {
        return this.f11632a;
    }
}
