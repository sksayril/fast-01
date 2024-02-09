package m9;

import android.content.Context;
import android.graphics.Rect;
import com.journeyapps.barcodescanner.BarcodeView;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import m6.p;

public final class a extends BarcodeView {
    public static final C0183a U = new C0183a((g) null);
    private int T = -1;

    /* renamed from: m9.a$a  reason: collision with other inner class name */
    public static final class C0183a {
        private C0183a() {
        }

        public /* synthetic */ C0183a(g gVar) {
            this();
        }
    }

    public a(Context context) {
        super(context);
    }

    public final void O(int i10, int i11, int i12) {
        this.T = i12;
        setFramingRectSize(new p(i10, i11));
    }

    /* access modifiers changed from: protected */
    public Rect k(Rect rect, Rect rect2) {
        l.e(rect, "container");
        l.e(rect2, "surface");
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        Rect k10 = super.k(rect, rect2);
        if (this.T != -1) {
            Rect rect4 = new Rect(k10);
            int i10 = rect4.bottom;
            int i11 = this.T;
            rect4.bottom = i10 - i11;
            rect4.top -= i11;
            if (rect4.intersect(rect3)) {
                return rect4;
            }
        }
        l.b(k10);
        return k10;
    }
}
