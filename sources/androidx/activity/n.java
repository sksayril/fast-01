package androidx.activity;

import android.view.View;
import kotlin.jvm.internal.l;

public final class n {
    public static final void a(View view, i iVar) {
        l.e(view, "<this>");
        l.e(iVar, "fullyDrawnReporterOwner");
        view.setTag(m.report_drawn, iVar);
    }
}
