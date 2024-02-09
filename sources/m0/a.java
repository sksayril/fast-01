package m0;

import android.app.Notification;
import android.media.session.MediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.core.app.k;
import androidx.core.app.l;

public class a extends l.j {

    /* renamed from: e  reason: collision with root package name */
    int[] f11197e = null;

    /* renamed from: f  reason: collision with root package name */
    MediaSessionCompat.Token f11198f;

    public void b(k kVar) {
        kVar.a().setStyle(w(new Notification.MediaStyle()));
    }

    public RemoteViews r(k kVar) {
        return null;
    }

    public RemoteViews s(k kVar) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public Notification.MediaStyle w(Notification.MediaStyle mediaStyle) {
        int[] iArr = this.f11197e;
        if (iArr != null) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
        MediaSessionCompat.Token token = this.f11198f;
        if (token != null) {
            mediaStyle.setMediaSession((MediaSession.Token) token.b());
        }
        return mediaStyle;
    }
}
