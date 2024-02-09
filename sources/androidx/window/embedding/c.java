package androidx.window.embedding;

import android.util.Pair;
import java.util.Set;
import java.util.function.Predicate;

public final /* synthetic */ class c implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EmbeddingAdapter f3349a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Set f3350b;

    public /* synthetic */ c(EmbeddingAdapter embeddingAdapter, Set set) {
        this.f3349a = embeddingAdapter;
        this.f3350b = set;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m1translateActivityPairPredicates$lambda1(this.f3349a, this.f3350b, (Pair) obj);
    }
}
