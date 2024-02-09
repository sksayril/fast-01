package o9;

import android.media.AudioAttributes;
import android.media.SoundPool;
import g8.s;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.y;
import n9.a;
import n9.m;
import p9.c;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final m f11665a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<AudioAttributes, n> f11666b = new HashMap<>();

    public l(m mVar) {
        kotlin.jvm.internal.l.e(mVar, "ref");
        this.f11665a = mVar;
    }

    /* access modifiers changed from: private */
    public static final void c(l lVar, n nVar, SoundPool soundPool, int i10, int i11) {
        kotlin.jvm.internal.l.e(lVar, "this$0");
        kotlin.jvm.internal.l.e(nVar, "$soundPoolWrapper");
        m mVar = lVar.f11665a;
        mVar.A("Loaded " + i10);
        m mVar2 = nVar.b().get(Integer.valueOf(i10));
        c s9 = mVar2 != null ? mVar2.s() : null;
        if (s9 != null) {
            y.a(nVar.b()).remove(mVar2.q());
            synchronized (nVar.d()) {
                List<m> list = nVar.d().get(s9);
                if (list == null) {
                    list = n.c();
                }
                for (m mVar3 : list) {
                    o t9 = mVar3.t();
                    t9.s("Marking " + mVar3 + " as loaded");
                    mVar3.t().I(true);
                    if (mVar3.t().m()) {
                        o t10 = mVar3.t();
                        t10.s("Delayed start of " + mVar3);
                        mVar3.start();
                    }
                }
                s sVar = s.f8976a;
            }
        }
    }

    public final void b(int i10, a aVar) {
        kotlin.jvm.internal.l.e(aVar, "audioContext");
        AudioAttributes a10 = aVar.a();
        if (!this.f11666b.containsKey(a10)) {
            SoundPool build = new SoundPool.Builder().setAudioAttributes(a10).setMaxStreams(i10).build();
            m mVar = this.f11665a;
            mVar.A("Create SoundPool with " + a10);
            kotlin.jvm.internal.l.b(build);
            n nVar = new n(build);
            nVar.c().setOnLoadCompleteListener(new k(this, nVar));
            this.f11666b.put(a10, nVar);
        }
    }

    public final void d() {
        for (Map.Entry<AudioAttributes, n> value : this.f11666b.entrySet()) {
            ((n) value.getValue()).a();
        }
        this.f11666b.clear();
    }

    public final n e(a aVar) {
        kotlin.jvm.internal.l.e(aVar, "audioContext");
        return this.f11666b.get(aVar.a());
    }
}
