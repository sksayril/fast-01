package h2;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

final class k1 implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l1 f9212a;

    /* synthetic */ k1(l1 l1Var, j1 j1Var) {
        this.f9212a = l1Var;
    }

    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            synchronized (this.f9212a.f9213f) {
                h1 h1Var = (h1) message.obj;
                i1 i1Var = (i1) this.f9212a.f9213f.get(h1Var);
                if (i1Var != null && i1Var.i()) {
                    if (i1Var.j()) {
                        i1Var.g("GmsClientSupervisor");
                    }
                    this.f9212a.f9213f.remove(h1Var);
                }
            }
            return true;
        } else if (i10 != 1) {
            return false;
        } else {
            synchronized (this.f9212a.f9213f) {
                h1 h1Var2 = (h1) message.obj;
                i1 i1Var2 = (i1) this.f9212a.f9213f.get(h1Var2);
                if (i1Var2 != null && i1Var2.a() == 3) {
                    String valueOf = String.valueOf(h1Var2);
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + valueOf, new Exception());
                    ComponentName b10 = i1Var2.b();
                    if (b10 == null) {
                        b10 = h1Var2.b();
                    }
                    if (b10 == null) {
                        String d10 = h1Var2.d();
                        p.j(d10);
                        b10 = new ComponentName(d10, "unknown");
                    }
                    i1Var2.onServiceDisconnected(b10);
                }
            }
            return true;
        }
    }
}
