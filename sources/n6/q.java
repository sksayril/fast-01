package n6;

import android.graphics.Rect;
import android.util.Log;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import m6.p;

public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    private static final String f11398a = "q";

    class a implements Comparator<p> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ p f11399m;

        a(p pVar) {
            this.f11399m = pVar;
        }

        /* renamed from: a */
        public int compare(p pVar, p pVar2) {
            return Float.compare(q.this.c(pVar2, this.f11399m), q.this.c(pVar, this.f11399m));
        }
    }

    public List<p> a(List<p> list, p pVar) {
        if (pVar == null) {
            return list;
        }
        Collections.sort(list, new a(pVar));
        return list;
    }

    public p b(List<p> list, p pVar) {
        List<p> a10 = a(list, pVar);
        String str = f11398a;
        Log.i(str, "Viewfinder size: " + pVar);
        Log.i(str, "Preview in order of preference: " + a10);
        return a10.get(0);
    }

    /* access modifiers changed from: protected */
    public abstract float c(p pVar, p pVar2);

    public abstract Rect d(p pVar, p pVar2);
}
