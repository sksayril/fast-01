package d4;

import d4.f0;
import java.util.List;
import java.util.Objects;

final class h extends f0.e {

    /* renamed from: a  reason: collision with root package name */
    private final String f8007a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8008b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8009c;

    /* renamed from: d  reason: collision with root package name */
    private final long f8010d;

    /* renamed from: e  reason: collision with root package name */
    private final Long f8011e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f8012f;

    /* renamed from: g  reason: collision with root package name */
    private final f0.e.a f8013g;

    /* renamed from: h  reason: collision with root package name */
    private final f0.e.f f8014h;

    /* renamed from: i  reason: collision with root package name */
    private final f0.e.C0123e f8015i;

    /* renamed from: j  reason: collision with root package name */
    private final f0.e.c f8016j;

    /* renamed from: k  reason: collision with root package name */
    private final List<f0.e.d> f8017k;

    /* renamed from: l  reason: collision with root package name */
    private final int f8018l;

    static final class b extends f0.e.b {

        /* renamed from: a  reason: collision with root package name */
        private String f8019a;

        /* renamed from: b  reason: collision with root package name */
        private String f8020b;

        /* renamed from: c  reason: collision with root package name */
        private String f8021c;

        /* renamed from: d  reason: collision with root package name */
        private Long f8022d;

        /* renamed from: e  reason: collision with root package name */
        private Long f8023e;

        /* renamed from: f  reason: collision with root package name */
        private Boolean f8024f;

        /* renamed from: g  reason: collision with root package name */
        private f0.e.a f8025g;

        /* renamed from: h  reason: collision with root package name */
        private f0.e.f f8026h;

        /* renamed from: i  reason: collision with root package name */
        private f0.e.C0123e f8027i;

        /* renamed from: j  reason: collision with root package name */
        private f0.e.c f8028j;

        /* renamed from: k  reason: collision with root package name */
        private List<f0.e.d> f8029k;

        /* renamed from: l  reason: collision with root package name */
        private Integer f8030l;

        b() {
        }

        private b(f0.e eVar) {
            this.f8019a = eVar.g();
            this.f8020b = eVar.i();
            this.f8021c = eVar.c();
            this.f8022d = Long.valueOf(eVar.l());
            this.f8023e = eVar.e();
            this.f8024f = Boolean.valueOf(eVar.n());
            this.f8025g = eVar.b();
            this.f8026h = eVar.m();
            this.f8027i = eVar.k();
            this.f8028j = eVar.d();
            this.f8029k = eVar.f();
            this.f8030l = Integer.valueOf(eVar.h());
        }

        public f0.e a() {
            String str = "";
            if (this.f8019a == null) {
                str = str + " generator";
            }
            if (this.f8020b == null) {
                str = str + " identifier";
            }
            if (this.f8022d == null) {
                str = str + " startedAt";
            }
            if (this.f8024f == null) {
                str = str + " crashed";
            }
            if (this.f8025g == null) {
                str = str + " app";
            }
            if (this.f8030l == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new h(this.f8019a, this.f8020b, this.f8021c, this.f8022d.longValue(), this.f8023e, this.f8024f.booleanValue(), this.f8025g, this.f8026h, this.f8027i, this.f8028j, this.f8029k, this.f8030l.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f0.e.b b(f0.e.a aVar) {
            Objects.requireNonNull(aVar, "Null app");
            this.f8025g = aVar;
            return this;
        }

        public f0.e.b c(String str) {
            this.f8021c = str;
            return this;
        }

        public f0.e.b d(boolean z9) {
            this.f8024f = Boolean.valueOf(z9);
            return this;
        }

        public f0.e.b e(f0.e.c cVar) {
            this.f8028j = cVar;
            return this;
        }

        public f0.e.b f(Long l10) {
            this.f8023e = l10;
            return this;
        }

        public f0.e.b g(List<f0.e.d> list) {
            this.f8029k = list;
            return this;
        }

        public f0.e.b h(String str) {
            Objects.requireNonNull(str, "Null generator");
            this.f8019a = str;
            return this;
        }

        public f0.e.b i(int i10) {
            this.f8030l = Integer.valueOf(i10);
            return this;
        }

        public f0.e.b j(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f8020b = str;
            return this;
        }

        public f0.e.b l(f0.e.C0123e eVar) {
            this.f8027i = eVar;
            return this;
        }

        public f0.e.b m(long j10) {
            this.f8022d = Long.valueOf(j10);
            return this;
        }

        public f0.e.b n(f0.e.f fVar) {
            this.f8026h = fVar;
            return this;
        }
    }

    private h(String str, String str2, String str3, long j10, Long l10, boolean z9, f0.e.a aVar, f0.e.f fVar, f0.e.C0123e eVar, f0.e.c cVar, List<f0.e.d> list, int i10) {
        this.f8007a = str;
        this.f8008b = str2;
        this.f8009c = str3;
        this.f8010d = j10;
        this.f8011e = l10;
        this.f8012f = z9;
        this.f8013g = aVar;
        this.f8014h = fVar;
        this.f8015i = eVar;
        this.f8016j = cVar;
        this.f8017k = list;
        this.f8018l = i10;
    }

    public f0.e.a b() {
        return this.f8013g;
    }

    public String c() {
        return this.f8009c;
    }

    public f0.e.c d() {
        return this.f8016j;
    }

    public Long e() {
        return this.f8011e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        r1 = r7.f8011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        r1 = r7.f8014h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        r1 = r7.f8015i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0095, code lost:
        r1 = r7.f8016j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00aa, code lost:
        r1 = r7.f8017k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = r7.f8009c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof d4.f0.e
            r2 = 0
            if (r1 == 0) goto L_0x00ca
            d4.f0$e r8 = (d4.f0.e) r8
            java.lang.String r1 = r7.f8007a
            java.lang.String r3 = r8.g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c8
            java.lang.String r1 = r7.f8008b
            java.lang.String r3 = r8.i()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c8
            java.lang.String r1 = r7.f8009c
            if (r1 != 0) goto L_0x002e
            java.lang.String r1 = r8.c()
            if (r1 != 0) goto L_0x00c8
            goto L_0x0038
        L_0x002e:
            java.lang.String r3 = r8.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c8
        L_0x0038:
            long r3 = r7.f8010d
            long r5 = r8.l()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x00c8
            java.lang.Long r1 = r7.f8011e
            if (r1 != 0) goto L_0x004d
            java.lang.Long r1 = r8.e()
            if (r1 != 0) goto L_0x00c8
            goto L_0x0057
        L_0x004d:
            java.lang.Long r3 = r8.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c8
        L_0x0057:
            boolean r1 = r7.f8012f
            boolean r3 = r8.n()
            if (r1 != r3) goto L_0x00c8
            d4.f0$e$a r1 = r7.f8013g
            d4.f0$e$a r3 = r8.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c8
            d4.f0$e$f r1 = r7.f8014h
            if (r1 != 0) goto L_0x0076
            d4.f0$e$f r1 = r8.m()
            if (r1 != 0) goto L_0x00c8
            goto L_0x0080
        L_0x0076:
            d4.f0$e$f r3 = r8.m()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c8
        L_0x0080:
            d4.f0$e$e r1 = r7.f8015i
            if (r1 != 0) goto L_0x008b
            d4.f0$e$e r1 = r8.k()
            if (r1 != 0) goto L_0x00c8
            goto L_0x0095
        L_0x008b:
            d4.f0$e$e r3 = r8.k()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c8
        L_0x0095:
            d4.f0$e$c r1 = r7.f8016j
            if (r1 != 0) goto L_0x00a0
            d4.f0$e$c r1 = r8.d()
            if (r1 != 0) goto L_0x00c8
            goto L_0x00aa
        L_0x00a0:
            d4.f0$e$c r3 = r8.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c8
        L_0x00aa:
            java.util.List<d4.f0$e$d> r1 = r7.f8017k
            if (r1 != 0) goto L_0x00b5
            java.util.List r1 = r8.f()
            if (r1 != 0) goto L_0x00c8
            goto L_0x00bf
        L_0x00b5:
            java.util.List r3 = r8.f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c8
        L_0x00bf:
            int r1 = r7.f8018l
            int r8 = r8.h()
            if (r1 != r8) goto L_0x00c8
            goto L_0x00c9
        L_0x00c8:
            r0 = 0
        L_0x00c9:
            return r0
        L_0x00ca:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.h.equals(java.lang.Object):boolean");
    }

    public List<f0.e.d> f() {
        return this.f8017k;
    }

    public String g() {
        return this.f8007a;
    }

    public int h() {
        return this.f8018l;
    }

    public int hashCode() {
        int hashCode = (((this.f8007a.hashCode() ^ 1000003) * 1000003) ^ this.f8008b.hashCode()) * 1000003;
        String str = this.f8009c;
        int i10 = 0;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j10 = this.f8010d;
        int i11 = (((hashCode ^ hashCode2) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Long l10 = this.f8011e;
        int hashCode3 = (((((i11 ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f8012f ? 1231 : 1237)) * 1000003) ^ this.f8013g.hashCode()) * 1000003;
        f0.e.f fVar = this.f8014h;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        f0.e.C0123e eVar = this.f8015i;
        int hashCode5 = (hashCode4 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        f0.e.c cVar = this.f8016j;
        int hashCode6 = (hashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<f0.e.d> list = this.f8017k;
        if (list != null) {
            i10 = list.hashCode();
        }
        return ((hashCode6 ^ i10) * 1000003) ^ this.f8018l;
    }

    public String i() {
        return this.f8008b;
    }

    public f0.e.C0123e k() {
        return this.f8015i;
    }

    public long l() {
        return this.f8010d;
    }

    public f0.e.f m() {
        return this.f8014h;
    }

    public boolean n() {
        return this.f8012f;
    }

    public f0.e.b o() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f8007a + ", identifier=" + this.f8008b + ", appQualitySessionId=" + this.f8009c + ", startedAt=" + this.f8010d + ", endedAt=" + this.f8011e + ", crashed=" + this.f8012f + ", app=" + this.f8013g + ", user=" + this.f8014h + ", os=" + this.f8015i + ", device=" + this.f8016j + ", events=" + this.f8017k + ", generatorType=" + this.f8018l + "}";
    }
}
