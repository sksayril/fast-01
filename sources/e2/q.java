package e2;

import java.util.concurrent.Callable;

public final /* synthetic */ class q implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f8370a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f8371b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ v f8372c;

    public /* synthetic */ q(boolean z9, String str, v vVar) {
        this.f8370a = z9;
        this.f8371b = str;
        this.f8372c = vVar;
    }

    public final Object call() {
        return z.c(this.f8370a, this.f8371b, this.f8372c);
    }
}
