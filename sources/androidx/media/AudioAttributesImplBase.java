package androidx.media;

import java.util.Arrays;

public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public int f2816a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f2817b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f2818c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f2819d = -1;

    AudioAttributesImplBase() {
    }

    public int a() {
        return this.f2817b;
    }

    public int b() {
        int i10 = this.f2818c;
        int c10 = c();
        if (c10 == 6) {
            i10 |= 4;
        } else if (c10 == 7) {
            i10 |= 1;
        }
        return i10 & 273;
    }

    public int c() {
        int i10 = this.f2819d;
        return i10 != -1 ? i10 : AudioAttributesCompat.a(false, this.f2818c, this.f2816a);
    }

    public int d() {
        return this.f2816a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f2817b == audioAttributesImplBase.a() && this.f2818c == audioAttributesImplBase.b() && this.f2816a == audioAttributesImplBase.d() && this.f2819d == audioAttributesImplBase.f2819d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2817b), Integer.valueOf(this.f2818c), Integer.valueOf(this.f2816a), Integer.valueOf(this.f2819d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f2819d != -1) {
            sb.append(" stream=");
            sb.append(this.f2819d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.b(this.f2816a));
        sb.append(" content=");
        sb.append(this.f2817b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f2818c).toUpperCase());
        return sb.toString();
    }
}
