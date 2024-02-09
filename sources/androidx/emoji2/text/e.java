package androidx.emoji2.text;

import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.d;
import java.util.concurrent.ThreadPoolExecutor;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ EmojiCompatInitializer.b f2180m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ d.h f2181n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f2182o;

    public /* synthetic */ e(EmojiCompatInitializer.b bVar, d.h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f2180m = bVar;
        this.f2181n = hVar;
        this.f2182o = threadPoolExecutor;
    }

    public final void run() {
        this.f2180m.d(this.f2181n, this.f2182o);
    }
}
