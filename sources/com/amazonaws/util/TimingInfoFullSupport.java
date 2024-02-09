package com.amazonaws.util;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TimingInfoFullSupport extends TimingInfo {

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, List<TimingInfo>> f4760d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, Number> f4761e = new HashMap();

    TimingInfoFullSupport(Long l10, long j10, Long l11) {
        super(l10, j10, l11);
    }

    public void a(String str, TimingInfo timingInfo) {
        List list = this.f4760d.get(str);
        if (list == null) {
            list = new ArrayList();
            this.f4760d.put(str, list);
        }
        if (timingInfo.k()) {
            list.add(timingInfo);
            return;
        }
        Log b10 = LogFactory.b(getClass());
        b10.a("Skip submeasurement timing info with no end time for " + str);
    }

    public Map<String, Number> d() {
        return this.f4761e;
    }

    public Map<String, List<TimingInfo>> g() {
        return this.f4760d;
    }

    public void j(String str) {
        Number q9 = q(str);
        l(str, (long) ((q9 != null ? q9.intValue() : 0) + 1));
    }

    public void l(String str, long j10) {
        this.f4761e.put(str, Long.valueOf(j10));
    }

    public Number q(String str) {
        return this.f4761e.get(str);
    }
}
