package o9;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import g8.s;
import kotlin.jvm.internal.l;
import n9.a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final o f11653a;

    /* renamed from: b  reason: collision with root package name */
    private AudioManager.OnAudioFocusChangeListener f11654b;

    /* renamed from: c  reason: collision with root package name */
    private AudioFocusRequest f11655c;

    public c(o oVar) {
        l.e(oVar, "player");
        this.f11653a = oVar;
    }

    private final AudioManager c() {
        return this.f11653a.g();
    }

    private final a d() {
        return this.f11653a.h();
    }

    private final void e(int i10, r8.a<s> aVar) {
        if (i10 == 1) {
            aVar.invoke();
        }
    }

    private final void h(r8.a<s> aVar) {
        Integer d10 = d().d();
        if (d10 != null) {
            AudioFocusRequest build = new AudioFocusRequest.Builder(d10.intValue()).setAudioAttributes(d().a()).setOnAudioFocusChangeListener(new a(this, aVar)).build();
            this.f11655c = build;
            e(c().requestAudioFocus(build), aVar);
            return;
        }
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    public static final void i(c cVar, r8.a aVar, int i10) {
        l.e(cVar, "this$0");
        l.e(aVar, "$andThen");
        cVar.e(i10, aVar);
    }

    private final void j(r8.a<s> aVar) {
        Integer d10 = d().d();
        if (d10 != null) {
            int intValue = d10.intValue();
            this.f11654b = new b(this, aVar);
            e(c().requestAudioFocus(this.f11654b, 3, intValue), aVar);
            return;
        }
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    public static final void k(c cVar, r8.a aVar, int i10) {
        l.e(cVar, "this$0");
        l.e(aVar, "$andThen");
        cVar.e(i10, aVar);
    }

    public final void f() {
        if (d().d() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            AudioFocusRequest audioFocusRequest = this.f11655c;
            if (audioFocusRequest != null) {
                c().abandonAudioFocusRequest(audioFocusRequest);
                return;
            }
            return;
        }
        c().abandonAudioFocus(this.f11654b);
    }

    public final void g(r8.a<s> aVar) {
        l.e(aVar, "andThen");
        if (d().d() == null) {
            aVar.invoke();
        } else if (Build.VERSION.SDK_INT >= 26) {
            h(aVar);
        } else {
            j(aVar);
        }
    }
}
