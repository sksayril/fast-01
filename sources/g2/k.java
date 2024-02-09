package g2;

import com.google.android.gms.common.api.Status;
import h2.b;

public class k {
    public static void a(Status status, d3.k<Void> kVar) {
        b(status, (Object) null, kVar);
    }

    public static <ResultT> void b(Status status, ResultT resultt, d3.k<ResultT> kVar) {
        if (status.k()) {
            kVar.c(resultt);
        } else {
            kVar.b(b.a(status));
        }
    }
}
