package androidx.window.embedding;

import android.util.Pair;
import java.util.Set;
import java.util.function.Predicate;

public final /* synthetic */ class b implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EmbeddingAdapter f3347a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Set f3348b;

    public /* synthetic */ b(EmbeddingAdapter embeddingAdapter, Set set) {
        this.f3347a = embeddingAdapter;
        this.f3348b = set;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m0translateActivityIntentPredicates$lambda3(this.f3347a, this.f3348b, (Pair) obj);
    }
}
