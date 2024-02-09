package d3;

import android.app.Activity;
import java.util.concurrent.Executor;

public abstract class j<TResult> {
    public j<TResult> a(Executor executor, d dVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public j<TResult> b(e<TResult> eVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public j<TResult> c(Executor executor, e<TResult> eVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract j<TResult> d(Activity activity, f fVar);

    public abstract j<TResult> e(f fVar);

    public abstract j<TResult> f(Executor executor, f fVar);

    public abstract j<TResult> g(Activity activity, g<? super TResult> gVar);

    public abstract j<TResult> h(g<? super TResult> gVar);

    public abstract j<TResult> i(Executor executor, g<? super TResult> gVar);

    public <TContinuationResult> j<TContinuationResult> j(b<TResult, TContinuationResult> bVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> j<TContinuationResult> k(Executor executor, b<TResult, TContinuationResult> bVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> j<TContinuationResult> l(Executor executor, b<TResult, j<TContinuationResult>> bVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception m();

    public abstract TResult n();

    public abstract boolean o();

    public abstract boolean p();

    public abstract boolean q();

    public <TContinuationResult> j<TContinuationResult> r(i<TResult, TContinuationResult> iVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public <TContinuationResult> j<TContinuationResult> s(Executor executor, i<TResult, TContinuationResult> iVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
