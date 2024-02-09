package androidx.window.embedding;

import android.view.WindowMetrics;
import java.util.function.Predicate;

public final /* synthetic */ class d implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SplitRule f3351a;

    public /* synthetic */ d(SplitRule splitRule) {
        this.f3351a = splitRule;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m4translateParentMetricsPredicate$lambda4(this.f3351a, (WindowMetrics) obj);
    }
}
