package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.support.v4.media.session.c;
import android.util.Log;
import androidx.core.app.g;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: a  reason: collision with root package name */
    final Object f84a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f85b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<c, a> f86c;

    /* renamed from: d  reason: collision with root package name */
    final MediaSessionCompat.Token f87d;

    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: m  reason: collision with root package name */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f88m;

        /* access modifiers changed from: protected */
        public void onReceiveResult(int i10, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = (MediaControllerCompat$MediaControllerImplApi21) this.f88m.get();
            if (mediaControllerCompat$MediaControllerImplApi21 != null && bundle != null) {
                synchronized (mediaControllerCompat$MediaControllerImplApi21.f84a) {
                    mediaControllerCompat$MediaControllerImplApi21.f87d.c(b.a.B(g.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerCompat$MediaControllerImplApi21.f87d.d(w0.a.b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                    mediaControllerCompat$MediaControllerImplApi21.a();
                }
            }
        }
    }

    private static class a extends c.b {
        a(c cVar) {
            super(cVar);
        }

        public void A1(List<MediaSessionCompat.QueueItem> list) {
            throw new AssertionError();
        }

        public void c3(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }

        public void e0(CharSequence charSequence) {
            throw new AssertionError();
        }

        public void j1(Bundle bundle) {
            throw new AssertionError();
        }

        public void o0() {
            throw new AssertionError();
        }

        public void s0(MediaMetadataCompat mediaMetadataCompat) {
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (this.f87d.a() != null) {
            for (c next : this.f85b) {
                a aVar = new a(next);
                this.f86c.put(next, aVar);
                next.f120b = aVar;
                try {
                    this.f87d.a().j0(aVar);
                    next.i(13, (Object) null, (Bundle) null);
                } catch (RemoteException e10) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
                }
            }
            this.f85b.clear();
        }
    }
}
