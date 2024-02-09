package androidx.window.embedding;

import android.content.Intent;
import java.util.Set;
import java.util.function.Predicate;

public final /* synthetic */ class f implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Set f3353a;

    public /* synthetic */ f(Set set) {
        this.f3353a = set;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m3translateIntentPredicates$lambda8(this.f3353a, (Intent) obj);
    }
}
