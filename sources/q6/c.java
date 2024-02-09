package q6;

import android.content.Context;
import android.util.Log;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferListener;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkLossHandler;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferState;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferUtility;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferUtilityOptions;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3Client;
import java.io.File;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.u;

public final class c {

    /* renamed from: j  reason: collision with root package name */
    public static final a f12008j = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final String f12009k = c.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private final Context f12010a;

    /* renamed from: b  reason: collision with root package name */
    private final String f12011b;

    /* renamed from: c  reason: collision with root package name */
    private final String f12012c;

    /* renamed from: d  reason: collision with root package name */
    private final String f12013d;

    /* renamed from: e  reason: collision with root package name */
    private final String f12014e;

    /* renamed from: f  reason: collision with root package name */
    private final String f12015f;

    /* renamed from: g  reason: collision with root package name */
    private TransferUtility f12016g = g();

    /* renamed from: h  reason: collision with root package name */
    private Regions f12017h;

    /* renamed from: i  reason: collision with root package name */
    private Regions f12018i;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public interface b {
        void a(String str);

        void b();
    }

    /* renamed from: q6.c$c  reason: collision with other inner class name */
    public static final class C0206c implements TransferListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f12019a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f12020b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ u<String> f12021c;

        C0206c(b bVar, c cVar, u<String> uVar) {
            this.f12019a = bVar;
            this.f12020b = cVar;
            this.f12021c = uVar;
        }

        public void a(int i10, TransferState transferState) {
            l.e(transferState, "state");
            if (transferState == TransferState.COMPLETED) {
                this.f12019a.a(this.f12020b.h((String) this.f12021c.f11078m));
            }
            if (transferState == TransferState.FAILED || transferState == TransferState.WAITING_FOR_NETWORK) {
                this.f12019a.b();
            }
        }

        public void b(int i10, long j10, long j11) {
        }

        public void c(int i10, Exception exc) {
            l.e(exc, "ex");
            this.f12019a.b();
            String b10 = c.f12009k;
            Log.e(b10, "error in upload id [ " + i10 + " ] : " + exc.getMessage());
        }
    }

    public c(Context context, String str, String str2, String str3, String str4, String str5) {
        l.e(context, "context");
        l.e(str, "BUCKET_NAME");
        l.e(str2, "SECRET_KEY");
        l.e(str3, "SECRET_ID");
        l.e(str4, "REGION");
        l.e(str5, "SUB_REGION");
        this.f12010a = context;
        this.f12011b = str;
        this.f12012c = str2;
        this.f12013d = str3;
        this.f12014e = str4;
        this.f12015f = str5;
        Regions regions = Regions.DEFAULT_REGION;
        l.d(regions, "DEFAULT_REGION");
        this.f12017h = regions;
        l.d(regions, "DEFAULT_REGION");
        this.f12018i = regions;
        i();
    }

    /* access modifiers changed from: private */
    public static final void e(AmazonS3Client amazonS3Client, c cVar, u uVar) {
        l.e(amazonS3Client, "$amazonS3Client");
        l.e(cVar, "this$0");
        l.e(uVar, "$key");
        amazonS3Client.L(cVar.f12011b, (String) uVar.f11078m);
    }

    private final AmazonS3Client f() {
        BasicAWSCredentials basicAWSCredentials = new BasicAWSCredentials(this.f12012c, this.f12013d);
        System.out.print("--------------------------------------------------------\n");
        System.out.print("getAmazonS3Client\n");
        System.out.print(this.f12012c);
        System.out.print("getAmazonS3Client\n");
        System.out.print(this.f12013d);
        System.out.print(this.f12018i);
        return new AmazonS3Client((AWSCredentials) basicAWSCredentials, Region.e(Regions.US_EAST_1));
    }

    private final TransferUtility g() {
        AmazonS3Client f10 = f();
        TransferNetworkLossHandler.d(this.f12010a.getApplicationContext());
        TransferUtilityOptions transferUtilityOptions = new TransferUtilityOptions();
        transferUtilityOptions.f(18);
        TransferUtility a10 = TransferUtility.c().d(f10).e(transferUtilityOptions).c(this.f12011b).b(this.f12010a).a();
        l.d(a10, "build(...)");
        return a10;
    }

    /* access modifiers changed from: private */
    public final String h(String str) {
        return "https://" + this.f12011b + "s3.amazonaws.com/" + str;
    }

    private final void i() {
        this.f12017h = new e(this.f12014e).b();
        this.f12018i = new e(this.f12015f).b();
    }

    public final String d(String str, String str2, b bVar) {
        StringBuilder sb;
        l.e(str, "imageName");
        l.e(bVar, "onUploadCompleteListener");
        i();
        TransferNetworkLossHandler.d(this.f12010a.getApplicationContext());
        u uVar = new u();
        uVar.f11078m = str;
        if (str2 != null) {
            if (o.j(str2, "/", false, 2, (Object) null)) {
                sb = new StringBuilder();
                sb.append(str2);
            } else {
                sb = new StringBuilder();
                sb.append(str2);
                sb.append('/');
            }
            sb.append(str);
            uVar.f11078m = sb.toString();
        }
        new Thread(new b(f(), this, uVar)).start();
        bVar.a("Success");
        return str;
    }

    public final String j(File file, String str, String str2, b bVar) {
        StringBuilder sb;
        l.e(file, "image");
        l.e(str, "imageName");
        l.e(bVar, "onUploadCompleteListener");
        i();
        TransferNetworkLossHandler.d(this.f12010a.getApplicationContext());
        u uVar = new u();
        uVar.f11078m = str;
        if (str2 != null) {
            if (o.j(str2, "/", false, 2, (Object) null)) {
                sb = new StringBuilder();
                sb.append(str2);
            } else {
                sb = new StringBuilder();
                sb.append(str2);
                sb.append('/');
            }
            sb.append(str);
            uVar.f11078m = sb.toString();
        }
        this.f12016g.h(this.f12011b, (String) uVar.f11078m, file).e(new C0206c(bVar, this, uVar));
        return h((String) uVar.f11078m);
    }
}
