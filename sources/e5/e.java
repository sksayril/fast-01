package e5;

import kotlin.jvm.internal.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final Boolean f8477a;

    /* renamed from: b  reason: collision with root package name */
    private final Double f8478b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f8479c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f8480d;

    /* renamed from: e  reason: collision with root package name */
    private final Long f8481e;

    public e(Boolean bool, Double d10, Integer num, Integer num2, Long l10) {
        this.f8477a = bool;
        this.f8478b = d10;
        this.f8479c = num;
        this.f8480d = num2;
        this.f8481e = l10;
    }

    public final Integer a() {
        return this.f8480d;
    }

    public final Long b() {
        return this.f8481e;
    }

    public final Boolean c() {
        return this.f8477a;
    }

    public final Integer d() {
        return this.f8479c;
    }

    public final Double e() {
        return this.f8478b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f8477a, eVar.f8477a) && l.a(this.f8478b, eVar.f8478b) && l.a(this.f8479c, eVar.f8479c) && l.a(this.f8480d, eVar.f8480d) && l.a(this.f8481e, eVar.f8481e);
    }

    public int hashCode() {
        Boolean bool = this.f8477a;
        int i10 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d10 = this.f8478b;
        int hashCode2 = (hashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num = this.f8479c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f8480d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.f8481e;
        if (l10 != null) {
            i10 = l10.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f8477a + ", sessionSamplingRate=" + this.f8478b + ", sessionRestartTimeout=" + this.f8479c + ", cacheDuration=" + this.f8480d + ", cacheUpdatedTime=" + this.f8481e + ')';
    }
}
