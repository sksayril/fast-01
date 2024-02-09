package d1;

import android.location.OnNmeaMessageListener;

public final /* synthetic */ class v implements OnNmeaMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w f7712a;

    public /* synthetic */ v(w wVar) {
        this.f7712a = wVar;
    }

    public final void onNmeaMessage(String str, long j10) {
        this.f7712a.c(str, j10);
    }
}
