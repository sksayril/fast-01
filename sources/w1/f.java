package w1;

import android.app.job.JobInfo;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import n1.d;
import w1.c;

@AutoValue
public abstract class f {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private z1.a f12768a;

        /* renamed from: b  reason: collision with root package name */
        private Map<d, b> f12769b = new HashMap();

        public a a(d dVar, b bVar) {
            this.f12769b.put(dVar, bVar);
            return this;
        }

        public f b() {
            Objects.requireNonNull(this.f12768a, "missing required property: clock");
            if (this.f12769b.keySet().size() >= d.values().length) {
                Map<d, b> map = this.f12769b;
                this.f12769b = new HashMap();
                return f.d(this.f12768a, map);
            }
            throw new IllegalStateException("Not all priorities have been configured");
        }

        public a c(z1.a aVar) {
            this.f12768a = aVar;
            return this;
        }
    }

    @AutoValue
    public static abstract class b {

        @AutoValue.Builder
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j10);

            public abstract a c(Set<c> set);

            public abstract a d(long j10);
        }

        public static a a() {
            return new c.b().c(Collections.emptySet());
        }

        /* access modifiers changed from: package-private */
        public abstract long b();

        /* access modifiers changed from: package-private */
        public abstract Set<c> c();

        /* access modifiers changed from: package-private */
        public abstract long d();
    }

    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i10, long j10) {
        int i11 = i10 - 1;
        return (long) (Math.pow(3.0d, (double) i11) * ((double) j10) * Math.max(1.0d, Math.log(10000.0d) / Math.log((double) ((j10 > 1 ? j10 : 2) * ((long) i11)))));
    }

    public static a b() {
        return new a();
    }

    static f d(z1.a aVar, Map<d, b> map) {
        return new b(aVar, map);
    }

    public static f f(z1.a aVar) {
        return b().a(d.DEFAULT, b.a().b(30000).d(86400000).a()).a(d.HIGHEST, b.a().b(1000).d(86400000).a()).a(d.VERY_LOW, b.a().b(86400000).d(86400000).c(i(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    private static <T> Set<T> i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    private void j(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, d dVar, long j10, int i10) {
        builder.setMinimumLatency(g(dVar, j10, i10));
        j(builder, h().get(dVar).c());
        return builder;
    }

    /* access modifiers changed from: package-private */
    public abstract z1.a e();

    public long g(d dVar, long j10, int i10) {
        long a10 = j10 - e().a();
        b bVar = h().get(dVar);
        return Math.min(Math.max(a(i10, bVar.b()), a10), bVar.d());
    }

    /* access modifiers changed from: package-private */
    public abstract Map<d, b> h();
}
