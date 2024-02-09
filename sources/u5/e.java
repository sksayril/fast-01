package u5;

import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f12488a;

    /* renamed from: b  reason: collision with root package name */
    private int f12489b;

    /* renamed from: c  reason: collision with root package name */
    private final String f12490c;

    /* renamed from: d  reason: collision with root package name */
    private final List<byte[]> f12491d;

    /* renamed from: e  reason: collision with root package name */
    private final String f12492e;

    /* renamed from: f  reason: collision with root package name */
    private Integer f12493f;

    /* renamed from: g  reason: collision with root package name */
    private Integer f12494g;

    /* renamed from: h  reason: collision with root package name */
    private Object f12495h;

    /* renamed from: i  reason: collision with root package name */
    private final int f12496i;

    /* renamed from: j  reason: collision with root package name */
    private final int f12497j;

    /* renamed from: k  reason: collision with root package name */
    private final int f12498k;

    public e(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1, 0);
    }

    public e(byte[] bArr, String str, List<byte[]> list, String str2, int i10) {
        this(bArr, str, list, str2, -1, -1, i10);
    }

    public e(byte[] bArr, String str, List<byte[]> list, String str2, int i10, int i11, int i12) {
        this.f12488a = bArr;
        this.f12489b = bArr == null ? 0 : bArr.length * 8;
        this.f12490c = str;
        this.f12491d = list;
        this.f12492e = str2;
        this.f12496i = i11;
        this.f12497j = i10;
        this.f12498k = i12;
    }

    public List<byte[]> a() {
        return this.f12491d;
    }

    public String b() {
        return this.f12492e;
    }

    public int c() {
        return this.f12489b;
    }

    public Object d() {
        return this.f12495h;
    }

    public byte[] e() {
        return this.f12488a;
    }

    public int f() {
        return this.f12496i;
    }

    public int g() {
        return this.f12497j;
    }

    public int h() {
        return this.f12498k;
    }

    public String i() {
        return this.f12490c;
    }

    public boolean j() {
        return this.f12496i >= 0 && this.f12497j >= 0;
    }

    public void k(Integer num) {
        this.f12494g = num;
    }

    public void l(Integer num) {
        this.f12493f = num;
    }

    public void m(int i10) {
        this.f12489b = i10;
    }

    public void n(Object obj) {
        this.f12495h = obj;
    }
}
