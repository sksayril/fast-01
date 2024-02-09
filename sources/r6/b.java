package r6;

import android.location.OnNmeaMessageListener;
import com.lyokone.location.a;

public final /* synthetic */ class b implements OnNmeaMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f12112a;

    public /* synthetic */ b(a aVar) {
        this.f12112a = aVar;
    }

    public final void onNmeaMessage(String str, long j10) {
        this.f12112a.l(str, j10);
    }
}
