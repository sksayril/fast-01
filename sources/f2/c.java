package f2;

import android.text.TextUtils;
import g2.b;
import h2.p;
import java.util.ArrayList;
import p.a;

public class c extends Exception {

    /* renamed from: m  reason: collision with root package name */
    private final a f8735m;

    public c(a aVar) {
        this.f8735m = aVar;
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z9 = true;
        for (b bVar : this.f8735m.keySet()) {
            e2.b bVar2 = (e2.b) p.j((e2.b) this.f8735m.get(bVar));
            z9 &= !bVar2.k();
            String b10 = bVar.b();
            String valueOf = String.valueOf(bVar2);
            arrayList.add(b10 + ": " + valueOf);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(z9 ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb.append(TextUtils.join("; ", arrayList));
        return sb.toString();
    }
}
