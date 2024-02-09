package r6;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final String f12117a;

    /* renamed from: b  reason: collision with root package name */
    private final String f12118b;

    /* renamed from: c  reason: collision with root package name */
    private final String f12119c;

    /* renamed from: d  reason: collision with root package name */
    private final String f12120d;

    /* renamed from: e  reason: collision with root package name */
    private final String f12121e;

    /* renamed from: f  reason: collision with root package name */
    private final Integer f12122f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f12123g;

    public f() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, false, 127, (g) null);
    }

    public f(String str, String str2, String str3, String str4, String str5, Integer num, boolean z9) {
        l.e(str, "channelName");
        l.e(str2, "title");
        l.e(str3, "iconName");
        this.f12117a = str;
        this.f12118b = str2;
        this.f12119c = str3;
        this.f12120d = str4;
        this.f12121e = str5;
        this.f12122f = num;
        this.f12123g = z9;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ f(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.Integer r11, boolean r12, int r13, kotlin.jvm.internal.g r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            if (r14 == 0) goto L_0x0006
            java.lang.String r6 = "Location background service"
        L_0x0006:
            r14 = r13 & 2
            if (r14 == 0) goto L_0x000c
            java.lang.String r7 = "Location background service running"
        L_0x000c:
            r14 = r7
            r7 = r13 & 4
            if (r7 == 0) goto L_0x0013
            java.lang.String r8 = "navigation_empty_icon"
        L_0x0013:
            r0 = r8
            r7 = r13 & 8
            r8 = 0
            if (r7 == 0) goto L_0x001b
            r1 = r8
            goto L_0x001c
        L_0x001b:
            r1 = r9
        L_0x001c:
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0022
            r2 = r8
            goto L_0x0023
        L_0x0022:
            r2 = r10
        L_0x0023:
            r7 = r13 & 32
            if (r7 == 0) goto L_0x0029
            r3 = r8
            goto L_0x002a
        L_0x0029:
            r3 = r11
        L_0x002a:
            r7 = r13 & 64
            if (r7 == 0) goto L_0x0031
            r12 = 0
            r4 = 0
            goto L_0x0032
        L_0x0031:
            r4 = r12
        L_0x0032:
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r0
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.f.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, boolean, int, kotlin.jvm.internal.g):void");
    }

    public final String a() {
        return this.f12117a;
    }

    public final Integer b() {
        return this.f12122f;
    }

    public final String c() {
        return this.f12121e;
    }

    public final String d() {
        return this.f12119c;
    }

    public final boolean e() {
        return this.f12123g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f12117a, fVar.f12117a) && l.a(this.f12118b, fVar.f12118b) && l.a(this.f12119c, fVar.f12119c) && l.a(this.f12120d, fVar.f12120d) && l.a(this.f12121e, fVar.f12121e) && l.a(this.f12122f, fVar.f12122f) && this.f12123g == fVar.f12123g;
    }

    public final String f() {
        return this.f12120d;
    }

    public final String g() {
        return this.f12118b;
    }

    public int hashCode() {
        int hashCode = ((((this.f12117a.hashCode() * 31) + this.f12118b.hashCode()) * 31) + this.f12119c.hashCode()) * 31;
        String str = this.f12120d;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f12121e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f12122f;
        if (num != null) {
            i10 = num.hashCode();
        }
        int i11 = (hashCode3 + i10) * 31;
        boolean z9 = this.f12123g;
        if (z9) {
            z9 = true;
        }
        return i11 + (z9 ? 1 : 0);
    }

    public String toString() {
        return "NotificationOptions(channelName=" + this.f12117a + ", title=" + this.f12118b + ", iconName=" + this.f12119c + ", subtitle=" + this.f12120d + ", description=" + this.f12121e + ", color=" + this.f12122f + ", onTapBringToFront=" + this.f12123g + ')';
    }
}
