package x2;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.maps.GoogleMapOptions;
import e2.g;
import java.util.ArrayList;
import java.util.List;
import o2.a;
import o2.d;
import o2.e;
import x2.e;
import y2.c;
import y2.e0;
import z2.t;

final class m extends a {

    /* renamed from: e  reason: collision with root package name */
    private final ViewGroup f13162e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f13163f;

    /* renamed from: g  reason: collision with root package name */
    protected e f13164g;

    /* renamed from: h  reason: collision with root package name */
    private final GoogleMapOptions f13165h;

    /* renamed from: i  reason: collision with root package name */
    private final List f13166i = new ArrayList();

    m(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.f13162e = viewGroup;
        this.f13163f = context;
        this.f13165h = googleMapOptions;
    }

    /* access modifiers changed from: protected */
    public final void a(e eVar) {
        this.f13164g = eVar;
        q();
    }

    public final void p(f fVar) {
        if (b() != null) {
            ((l) b()).a(fVar);
        } else {
            this.f13166i.add(fVar);
        }
    }

    public final void q() {
        if (this.f13164g != null && b() == null) {
            try {
                e.a(this.f13163f);
                c V2 = e0.a(this.f13163f, (e.a) null).V2(d.e3(this.f13163f), this.f13165h);
                if (V2 != null) {
                    this.f13164g.a(new l(this.f13162e, V2));
                    for (f a10 : this.f13166i) {
                        ((l) b()).a(a10);
                    }
                    this.f13166i.clear();
                }
            } catch (RemoteException e10) {
                throw new t(e10);
            } catch (g unused) {
            }
        }
    }
}
