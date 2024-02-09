package androidx.window.embedding;

import androidx.window.embedding.ExtensionEmbeddingBackend;
import java.util.List;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ ExtensionEmbeddingBackend.SplitListenerWrapper f3354m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ List f3355n;

    public /* synthetic */ g(ExtensionEmbeddingBackend.SplitListenerWrapper splitListenerWrapper, List list) {
        this.f3354m = splitListenerWrapper;
        this.f3355n = list;
    }

    public final void run() {
        ExtensionEmbeddingBackend.SplitListenerWrapper.m5accept$lambda1(this.f3354m, this.f3355n);
    }
}
