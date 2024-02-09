package q6;

import android.app.Activity;
import android.content.Context;
import c7.a;
import java.io.File;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import k7.d;
import k7.j;
import k7.k;
import kotlin.jvm.internal.l;
import q6.c;

public final class a implements c7.a, k.c, d7.a, h7.a {

    /* renamed from: m  reason: collision with root package name */
    private k f11997m;

    /* renamed from: n  reason: collision with root package name */
    private d f11998n;

    /* renamed from: o  reason: collision with root package name */
    private c f11999o;

    /* renamed from: p  reason: collision with root package name */
    private Context f12000p;

    /* renamed from: q  reason: collision with root package name */
    private Activity f12001q;

    /* renamed from: r  reason: collision with root package name */
    private d f12002r;

    /* renamed from: q6.a$a  reason: collision with other inner class name */
    public static final class C0205a implements c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k.d f12003a;

        C0205a(k.d dVar) {
            this.f12003a = dVar;
        }

        public void a(String str) {
            l.e(str, "imageUrl");
            PrintStream printStream = System.out;
            printStream.println("\n✅ upload complete: " + str);
            this.f12003a.a(Boolean.TRUE);
        }

        public void b() {
            System.out.println("\n❌ upload failed");
            try {
                this.f12003a.a(Boolean.FALSE);
            } catch (Exception unused) {
            }
        }
    }

    public static final class b implements c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k.d f12004a;

        b(k.d dVar) {
            this.f12004a = dVar;
        }

        public void a(String str) {
            l.e(str, "imageUrl");
            PrintStream printStream = System.out;
            printStream.println("\n✅ delete complete: " + str);
            try {
                this.f12004a.a(Boolean.TRUE);
            } catch (Exception unused) {
            }
        }

        public void b() {
            System.out.println("\n❌ delete failed");
            try {
                this.f12004a.a(Boolean.FALSE);
            } catch (Exception unused) {
            }
        }
    }

    public void a() {
    }

    public void b(h7.b bVar) {
        l.e(bVar, "binding");
        Context applicationContext = bVar.a().getApplicationContext();
        l.d(applicationContext, "getApplicationContext(...)");
        this.f12000p = applicationContext;
    }

    public void onAttachedToActivity(d7.c cVar) {
        l.e(cVar, "binding");
        Activity d10 = cVar.d();
        l.d(d10, "getActivity(...)");
        this.f12001q = d10;
    }

    public void onAttachedToEngine(a.b bVar) {
        l.e(bVar, "flutterPluginBinding");
        k kVar = new k(bVar.b(), "aws3_bucket");
        this.f11997m = kVar;
        kVar.e(this);
        this.f11998n = new d(bVar.b(), "aws3_bucket_upload_steam");
        this.f12002r = new d();
        d dVar = this.f11998n;
        d dVar2 = null;
        if (dVar == null) {
            l.p("eventChannel");
            dVar = null;
        }
        d dVar3 = this.f12002r;
        if (dVar3 == null) {
            l.p("imageUploadListener");
        } else {
            dVar2 = dVar3;
        }
        dVar.d(dVar2);
        Context a10 = bVar.a();
        l.d(a10, "getApplicationContext(...)");
        this.f12000p = a10;
    }

    public void onDetachedFromActivity() {
    }

    public void onDetachedFromActivityForConfigChanges() {
    }

    public void onDetachedFromEngine(a.b bVar) {
        l.e(bVar, "binding");
        k kVar = this.f11997m;
        if (kVar == null) {
            l.p("channel");
            kVar = null;
        }
        kVar.e((k.c) null);
        d dVar = this.f12002r;
        if (dVar == null) {
            l.p("imageUploadListener");
            dVar = null;
        }
        dVar.b(1);
        d dVar2 = this.f11998n;
        if (dVar2 == null) {
            l.p("eventChannel");
            dVar2 = null;
        }
        dVar2.d((d.C0170d) null);
    }

    public void onMethodCall(j jVar, k.d dVar) {
        l.e(jVar, "call");
        l.e(dVar, "result");
        String str = (String) jVar.a("filePath");
        String str2 = (String) jVar.a("bucket");
        String str3 = (String) jVar.a("secretKey");
        String str4 = (String) jVar.a("secretId");
        String str5 = (String) jVar.a("imageName");
        String str6 = (String) jVar.a("region");
        String str7 = (String) jVar.a("subRegion");
        System.out.println("\n❌ bucket--1");
        Context context = null;
        if (jVar.f10996a.equals("uploadImage")) {
            System.out.println("\n❌ bucket--2");
            if (str == null) {
                dVar.b("file path cannot be empty", "error", 1);
                return;
            }
            System.out.println("\n❌ bucket--3");
            String str8 = (String) jVar.a("imageUploadFolder");
            File file = new File(str);
            try {
                System.out.println("\n❌ bucket--4");
                System.out.println(str2);
                System.out.println(str3);
                System.out.println(str4);
                System.out.println(str6);
                System.out.println(str7);
                Context context2 = this.f12000p;
                if (context2 == null) {
                    l.p("context");
                } else {
                    context = context2;
                }
                l.b(str2);
                l.b(str3);
                l.b(str4);
                l.b(str6);
                l.b(str7);
                c cVar = new c(context, str2, str3, str4, str6, str7);
                this.f11999o = cVar;
                l.b(cVar);
                l.b(str5);
                cVar.j(file, str5, str8, new C0205a(dVar));
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        } else if (jVar.f10996a.equals("deleteImage")) {
            String str9 = (String) jVar.a("imageUploadFolder");
            Context context3 = this.f12000p;
            if (context3 == null) {
                l.p("context");
            } else {
                context = context3;
            }
            l.b(str2);
            l.b(str3);
            l.b(str4);
            l.b(str6);
            l.b(str7);
            c cVar2 = new c(context, str2, str3, str4, str6, str7);
            this.f11999o = cVar2;
            l.b(cVar2);
            l.b(str5);
            cVar2.d(str5, str9, new b(dVar));
        } else {
            dVar.c();
        }
    }

    public void onReattachedToActivityForConfigChanges(d7.c cVar) {
        l.e(cVar, "binding");
    }
}
