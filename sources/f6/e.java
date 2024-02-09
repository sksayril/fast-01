package f6;

import o5.j;
import u5.a;

final class e extends i {

    /* renamed from: c  reason: collision with root package name */
    private final String f8783c;

    /* renamed from: d  reason: collision with root package name */
    private final String f8784d;

    e(a aVar, String str, String str2) {
        super(aVar);
        this.f8783c = str2;
        this.f8784d = str;
    }

    private void k(StringBuilder sb, int i10) {
        int f10 = b().f(i10, 16);
        if (f10 != 38400) {
            sb.append('(');
            sb.append(this.f8783c);
            sb.append(')');
            int i11 = f10 % 32;
            int i12 = f10 / 32;
            int i13 = (i12 % 12) + 1;
            int i14 = i12 / 12;
            if (i14 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i14);
            if (i13 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i13);
            if (i11 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i11);
        }
    }

    public String d() {
        if (c().k() == 84) {
            StringBuilder sb = new StringBuilder();
            f(sb, 8);
            j(sb, 48, 20);
            k(sb, 68);
            return sb.toString();
        }
        throw j.a();
    }

    /* access modifiers changed from: protected */
    public void h(StringBuilder sb, int i10) {
        sb.append('(');
        sb.append(this.f8784d);
        sb.append(i10 / 100000);
        sb.append(')');
    }

    /* access modifiers changed from: protected */
    public int i(int i10) {
        return i10 % 100000;
    }
}
