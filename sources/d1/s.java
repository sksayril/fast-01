package d1;

import java.util.Map;

public class s {

    /* renamed from: a  reason: collision with root package name */
    private final l f7706a;

    /* renamed from: b  reason: collision with root package name */
    private final long f7707b;

    /* renamed from: c  reason: collision with root package name */
    private final long f7708c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f7709d;

    private s(l lVar, long j10, long j11, boolean z9) {
        this.f7706a = lVar;
        this.f7707b = j10;
        this.f7708c = j11;
        this.f7709d = z9;
    }

    public static s e(Map<String, Object> map) {
        if (map == null) {
            return new s(l.best, 0, 5000, false);
        }
        Integer num = (Integer) map.get("accuracy");
        Integer num2 = (Integer) map.get("distanceFilter");
        Integer num3 = (Integer) map.get("timeInterval");
        Boolean bool = (Boolean) map.get("useMSLAltitude");
        l lVar = l.best;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                lVar = l.lowest;
            } else if (intValue == 1) {
                lVar = l.low;
            } else if (intValue == 2) {
                lVar = l.medium;
            } else if (intValue == 3) {
                lVar = l.high;
            } else if (intValue == 5) {
                lVar = l.bestForNavigation;
            }
        }
        return new s(lVar, num2 != null ? (long) num2.intValue() : 0, num3 != null ? (long) num3.intValue() : 5000, bool != null && bool.booleanValue());
    }

    public l a() {
        return this.f7706a;
    }

    public long b() {
        return this.f7707b;
    }

    public long c() {
        return this.f7708c;
    }

    public boolean d() {
        return this.f7709d;
    }
}
