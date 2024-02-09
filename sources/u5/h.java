package u5;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import o5.f;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private StringBuilder f12501a;

    /* renamed from: b  reason: collision with root package name */
    private StringBuilder f12502b;

    /* renamed from: c  reason: collision with root package name */
    private Charset f12503c;

    public h() {
        this.f12503c = StandardCharsets.ISO_8859_1;
        this.f12501a = new StringBuilder();
    }

    public h(int i10) {
        this.f12503c = StandardCharsets.ISO_8859_1;
        this.f12501a = new StringBuilder(i10);
    }

    private void g() {
        StringBuilder sb;
        if (this.f12503c.equals(StandardCharsets.ISO_8859_1)) {
            if (this.f12501a.length() > 0) {
                StringBuilder sb2 = this.f12502b;
                if (sb2 == null) {
                    this.f12502b = this.f12501a;
                    sb = new StringBuilder();
                } else {
                    sb2.append(this.f12501a);
                    sb = new StringBuilder();
                }
                this.f12501a = sb;
            }
        } else if (this.f12501a.length() > 0) {
            byte[] bytes = this.f12501a.toString().getBytes(StandardCharsets.ISO_8859_1);
            this.f12501a = new StringBuilder();
            StringBuilder sb3 = this.f12502b;
            if (sb3 == null) {
                this.f12502b = new StringBuilder(new String(bytes, this.f12503c));
            } else {
                sb3.append(new String(bytes, this.f12503c));
            }
        }
    }

    public void a(byte b10) {
        this.f12501a.append((char) (b10 & 255));
    }

    public void b(char c10) {
        this.f12501a.append((char) (c10 & 255));
    }

    public void c(int i10) {
        d(String.valueOf(i10));
    }

    public void d(String str) {
        this.f12501a.append(str);
    }

    public void e(StringBuilder sb) {
        g();
        this.f12502b.append(sb);
    }

    public void f(int i10) {
        g();
        d characterSetECIByValue = d.getCharacterSetECIByValue(i10);
        if (characterSetECIByValue != null) {
            this.f12503c = characterSetECIByValue.getCharset();
            return;
        }
        throw f.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r1.f12502b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean h() {
        /*
            r1 = this;
            java.lang.StringBuilder r0 = r1.f12501a
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0014
            java.lang.StringBuilder r0 = r1.f12502b
            if (r0 == 0) goto L_0x0012
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0014
        L_0x0012:
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.h.h():boolean");
    }

    public int i() {
        return toString().length();
    }

    public String toString() {
        g();
        StringBuilder sb = this.f12502b;
        return sb == null ? "" : sb.toString();
    }
}
