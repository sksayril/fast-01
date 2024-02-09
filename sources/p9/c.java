package p9;

import android.media.MediaPlayer;
import kotlin.jvm.internal.l;
import o9.m;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final String f11938a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f11939b;

    public c(String str, boolean z9) {
        l.e(str, "url");
        this.f11938a = str;
        this.f11939b = z9;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        p8.a.a(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final byte[] c(java.net.URL r7) {
        /*
            r6 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.InputStream r7 = r7.openStream()
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r1]     // Catch:{ all -> 0x003d }
        L_0x000d:
            int r2 = r7.read(r1)     // Catch:{ all -> 0x003d }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x003d }
            int r3 = r2.intValue()     // Catch:{ all -> 0x003d }
            r4 = 0
            if (r3 <= 0) goto L_0x001e
            r3 = 1
            goto L_0x001f
        L_0x001e:
            r3 = 0
        L_0x001f:
            r5 = 0
            if (r3 == 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r2 = r5
        L_0x0024:
            if (r2 == 0) goto L_0x002e
            int r2 = r2.intValue()     // Catch:{ all -> 0x003d }
            r0.write(r1, r4, r2)     // Catch:{ all -> 0x003d }
            goto L_0x000d
        L_0x002e:
            g8.s r1 = g8.s.f8976a     // Catch:{ all -> 0x003d }
            p8.a.a(r7, r5)
            byte[] r7 = r0.toByteArray()
            java.lang.String r0 = "toByteArray(...)"
            kotlin.jvm.internal.l.d(r7, r0)
            return r7
        L_0x003d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003f }
        L_0x003f:
            r1 = move-exception
            p8.a.a(r7, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.c.c(java.net.URL):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        p8.a.a(r2, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.io.File e() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f11938a
            java.net.URI r0 = java.net.URI.create(r0)
            java.net.URL r0 = r0.toURL()
            java.lang.String r1 = "toURL(...)"
            kotlin.jvm.internal.l.d(r0, r1)
            byte[] r0 = r3.c(r0)
            java.lang.String r1 = "sound"
            java.lang.String r2 = ""
            java.io.File r1 = java.io.File.createTempFile(r1, r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r1)
            r2.write(r0)     // Catch:{ all -> 0x0030 }
            r1.deleteOnExit()     // Catch:{ all -> 0x0030 }
            g8.s r0 = g8.s.f8976a     // Catch:{ all -> 0x0030 }
            r0 = 0
            p8.a.a(r2, r0)
            kotlin.jvm.internal.l.b(r1)
            return r1
        L_0x0030:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r1 = move-exception
            p8.a.a(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.c.e():java.io.File");
    }

    public void a(m mVar) {
        l.e(mVar, "soundPoolPlayer");
        mVar.w(this);
    }

    public void b(MediaPlayer mediaPlayer) {
        l.e(mediaPlayer, "mediaPlayer");
        mediaPlayer.setDataSource(this.f11938a);
    }

    public final String d() {
        return this.f11939b ? p.T(this.f11938a, "file://") : e().getAbsolutePath();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f11938a, cVar.f11938a) && this.f11939b == cVar.f11939b;
    }

    public int hashCode() {
        int hashCode = this.f11938a.hashCode() * 31;
        boolean z9 = this.f11939b;
        if (z9) {
            z9 = true;
        }
        return hashCode + (z9 ? 1 : 0);
    }

    public String toString() {
        return "UrlSource(url=" + this.f11938a + ", isLocal=" + this.f11939b + ')';
    }
}
