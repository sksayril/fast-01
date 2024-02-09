package n9;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import java.util.Objects;
import kotlin.jvm.internal.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f11407a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f11408b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11409c;

    /* renamed from: d  reason: collision with root package name */
    private final int f11410d;

    /* renamed from: e  reason: collision with root package name */
    private final Integer f11411e;

    /* renamed from: f  reason: collision with root package name */
    private final int f11412f;

    @SuppressLint({"InlinedApi"})
    public a() {
        this(true, false, 2, 1, (Integer) null, 0);
    }

    public a(boolean z9, boolean z10, int i10, int i11, Integer num, int i12) {
        this.f11407a = z9;
        this.f11408b = z10;
        this.f11409c = i10;
        this.f11410d = i11;
        this.f11411e = num;
        this.f11412f = i12;
    }

    public static /* synthetic */ a c(a aVar, boolean z9, boolean z10, int i10, int i11, Integer num, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z9 = aVar.f11407a;
        }
        if ((i13 & 2) != 0) {
            z10 = aVar.f11408b;
        }
        boolean z11 = z10;
        if ((i13 & 4) != 0) {
            i10 = aVar.f11409c;
        }
        int i14 = i10;
        if ((i13 & 8) != 0) {
            i11 = aVar.f11410d;
        }
        int i15 = i11;
        if ((i13 & 16) != 0) {
            num = aVar.f11411e;
        }
        Integer num2 = num;
        if ((i13 & 32) != 0) {
            i12 = aVar.f11412f;
        }
        return aVar.b(z9, z11, i14, i15, num2, i12);
    }

    public final AudioAttributes a() {
        AudioAttributes build = new AudioAttributes.Builder().setUsage(this.f11410d).setContentType(this.f11409c).build();
        l.d(build, "build(...)");
        return build;
    }

    public final a b(boolean z9, boolean z10, int i10, int i11, Integer num, int i12) {
        return new a(z9, z10, i10, i11, num, i12);
    }

    public final Integer d() {
        return this.f11411e;
    }

    public final int e() {
        return this.f11412f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f11407a == aVar.f11407a && this.f11408b == aVar.f11408b && this.f11409c == aVar.f11409c && this.f11410d == aVar.f11410d && l.a(this.f11411e, aVar.f11411e) && this.f11412f == aVar.f11412f;
        }
    }

    public final boolean f() {
        return this.f11408b;
    }

    public final boolean g() {
        return this.f11407a;
    }

    public final void h(MediaPlayer mediaPlayer) {
        l.e(mediaPlayer, "player");
        mediaPlayer.setAudioAttributes(a());
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.f11407a), Boolean.valueOf(this.f11408b), Integer.valueOf(this.f11409c), Integer.valueOf(this.f11410d), this.f11411e, Integer.valueOf(this.f11412f)});
    }

    public String toString() {
        return "AudioContextAndroid(isSpeakerphoneOn=" + this.f11407a + ", stayAwake=" + this.f11408b + ", contentType=" + this.f11409c + ", usageType=" + this.f11410d + ", audioFocus=" + this.f11411e + ", audioMode=" + this.f11412f + ')';
    }
}
