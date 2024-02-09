package o9;

import android.media.MediaPlayer;
import android.os.Build;
import kotlin.jvm.internal.l;
import n9.a;
import p9.b;

public final class i implements j {

    /* renamed from: a  reason: collision with root package name */
    private final o f11661a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaPlayer f11662b;

    public i(o oVar) {
        l.e(oVar, "wrappedPlayer");
        this.f11661a = oVar;
        this.f11662b = t(oVar);
    }

    private final MediaPlayer t(o oVar) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnPreparedListener(new g(oVar));
        mediaPlayer.setOnCompletionListener(new e(oVar));
        mediaPlayer.setOnSeekCompleteListener(new h(oVar));
        mediaPlayer.setOnErrorListener(new f(oVar));
        mediaPlayer.setOnBufferingUpdateListener(new d(oVar));
        oVar.h().h(mediaPlayer);
        return mediaPlayer;
    }

    /* access modifiers changed from: private */
    public static final void u(o oVar, MediaPlayer mediaPlayer) {
        l.e(oVar, "$wrappedPlayer");
        oVar.A();
    }

    /* access modifiers changed from: private */
    public static final void v(o oVar, MediaPlayer mediaPlayer) {
        l.e(oVar, "$wrappedPlayer");
        oVar.y();
    }

    /* access modifiers changed from: private */
    public static final void w(o oVar, MediaPlayer mediaPlayer) {
        l.e(oVar, "$wrappedPlayer");
        oVar.B();
    }

    /* access modifiers changed from: private */
    public static final boolean x(o oVar, MediaPlayer mediaPlayer, int i10, int i11) {
        l.e(oVar, "$wrappedPlayer");
        return oVar.z(i10, i11);
    }

    /* access modifiers changed from: private */
    public static final void y(o oVar, MediaPlayer mediaPlayer, int i10) {
        l.e(oVar, "$wrappedPlayer");
        oVar.x(i10);
    }

    public void a() {
        this.f11662b.reset();
        this.f11662b.release();
    }

    public void b() {
        this.f11662b.pause();
    }

    public void c() {
        this.f11662b.reset();
    }

    public void d(boolean z9) {
        this.f11662b.setLooping(z9);
    }

    public boolean e() {
        return this.f11662b.isPlaying();
    }

    public void f() {
        this.f11662b.prepareAsync();
    }

    public Integer g() {
        Integer valueOf = Integer.valueOf(this.f11662b.getDuration());
        if (!(valueOf.intValue() == -1)) {
            return valueOf;
        }
        return null;
    }

    public boolean h() {
        Integer g10 = g();
        return g10 == null || g10.intValue() == 0;
    }

    public void i(float f10) {
        if (Build.VERSION.SDK_INT >= 23) {
            MediaPlayer mediaPlayer = this.f11662b;
            mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(f10));
            return;
        }
        if (!(f10 == 1.0f)) {
            throw new IllegalStateException("Changing the playback rate is only available for Android M/23+ or using LOW_LATENCY mode.".toString());
        }
    }

    public void j(int i10) {
        this.f11662b.seekTo(i10);
    }

    public void k(b bVar) {
        l.e(bVar, "source");
        c();
        bVar.b(this.f11662b);
    }

    public void l(a aVar) {
        l.e(aVar, "context");
        aVar.h(this.f11662b);
        if (aVar.f()) {
            this.f11662b.setWakeMode(this.f11661a.f(), 1);
        }
    }

    public void m(float f10, float f11) {
        this.f11662b.setVolume(f10, f11);
    }

    public Integer n() {
        return Integer.valueOf(this.f11662b.getCurrentPosition());
    }

    public void start() {
        this.f11662b.start();
    }

    public void stop() {
        this.f11662b.stop();
    }
}
