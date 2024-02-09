package f5;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import w3.c;
import w3.e;
import w3.j;

public class b implements j {
    /* access modifiers changed from: private */
    public static /* synthetic */ Object c(String str, c cVar, e eVar) {
        try {
            c.b(str);
            return cVar.h().a(eVar);
        } finally {
            c.a();
        }
    }

    public List<c<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (c next : componentRegistrar.getComponents()) {
            String i10 = next.i();
            if (i10 != null) {
                next = next.t(new a(i10, next));
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
