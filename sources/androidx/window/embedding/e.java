package androidx.window.embedding;

import android.app.Activity;
import java.util.Set;
import java.util.function.Predicate;

public final /* synthetic */ class e implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Set f3352a;

    public /* synthetic */ e(Set set) {
        this.f3352a = set;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m2translateActivityPredicates$lambda6(this.f3352a, (Activity) obj);
    }
}
