package q6;

import com.amazonaws.services.s3.AmazonS3Client;
import kotlin.jvm.internal.u;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ AmazonS3Client f12005m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ c f12006n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ u f12007o;

    public /* synthetic */ b(AmazonS3Client amazonS3Client, c cVar, u uVar) {
        this.f12005m = amazonS3Client;
        this.f12006n = cVar;
        this.f12007o = uVar;
    }

    public final void run() {
        c.e(this.f12005m, this.f12006n, this.f12007o);
    }
}
