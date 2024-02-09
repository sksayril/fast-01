package d0;

import java.nio.ByteBuffer;

public class c {

    /* renamed from: a  reason: collision with root package name */
    protected int f7658a;

    /* renamed from: b  reason: collision with root package name */
    protected ByteBuffer f7659b;

    /* renamed from: c  reason: collision with root package name */
    private int f7660c;

    /* renamed from: d  reason: collision with root package name */
    private int f7661d;

    /* renamed from: e  reason: collision with root package name */
    d f7662e = d.a();

    /* access modifiers changed from: protected */
    public int a(int i10) {
        return i10 + this.f7659b.getInt(i10);
    }

    /* access modifiers changed from: protected */
    public int b(int i10) {
        if (i10 < this.f7661d) {
            return this.f7659b.getShort(this.f7660c + i10);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void c(int i10, ByteBuffer byteBuffer) {
        short s9;
        this.f7659b = byteBuffer;
        if (byteBuffer != null) {
            this.f7658a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f7660c = i11;
            s9 = this.f7659b.getShort(i11);
        } else {
            s9 = 0;
            this.f7658a = 0;
            this.f7660c = 0;
        }
        this.f7661d = s9;
    }

    /* access modifiers changed from: protected */
    public int d(int i10) {
        int i11 = i10 + this.f7658a;
        return i11 + this.f7659b.getInt(i11) + 4;
    }

    /* access modifiers changed from: protected */
    public int e(int i10) {
        int i11 = i10 + this.f7658a;
        return this.f7659b.getInt(i11 + this.f7659b.getInt(i11));
    }
}
