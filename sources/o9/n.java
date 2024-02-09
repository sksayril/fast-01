package o9;

import android.media.SoundPool;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.l;
import p9.c;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final SoundPool f11673a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, m> f11674b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<c, List<m>> f11675c;

    public n(SoundPool soundPool) {
        l.e(soundPool, "soundPool");
        this.f11673a = soundPool;
        Map<Integer, m> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        l.d(synchronizedMap, "synchronizedMap(...)");
        this.f11674b = synchronizedMap;
        Map<c, List<m>> synchronizedMap2 = Collections.synchronizedMap(new LinkedHashMap());
        l.d(synchronizedMap2, "synchronizedMap(...)");
        this.f11675c = synchronizedMap2;
    }

    public final void a() {
        this.f11673a.release();
        this.f11674b.clear();
        this.f11675c.clear();
    }

    public final Map<Integer, m> b() {
        return this.f11674b;
    }

    public final SoundPool c() {
        return this.f11673a;
    }

    public final Map<c, List<m>> d() {
        return this.f11675c;
    }
}
