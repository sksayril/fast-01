package p9;

import android.media.MediaPlayer;
import kotlin.jvm.internal.l;
import n9.o;
import o9.m;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final o f11937a;

    public a(o oVar) {
        l.e(oVar, "dataSource");
        this.f11937a = oVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(byte[] bArr) {
        this(new o(bArr));
        l.e(bArr, "bytes");
    }

    public void a(m mVar) {
        l.e(mVar, "soundPoolPlayer");
        throw new IllegalStateException("Bytes sources are not supported on LOW_LATENCY mode yet.".toString());
    }

    public void b(MediaPlayer mediaPlayer) {
        l.e(mediaPlayer, "mediaPlayer");
        mediaPlayer.setDataSource(this.f11937a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && l.a(this.f11937a, ((a) obj).f11937a);
    }

    public int hashCode() {
        return this.f11937a.hashCode();
    }

    public String toString() {
        return "BytesSource(dataSource=" + this.f11937a + ')';
    }
}
