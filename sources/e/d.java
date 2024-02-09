package e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.activity.result.g;
import e.a;
import g8.k;
import kotlin.jvm.internal.l;

public class d extends a<g, Uri> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8280a = new a((kotlin.jvm.internal.g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final ResolveInfo a(Context context) {
            l.e(context, "context");
            return context.getPackageManager().resolveActivity(new Intent("com.google.android.gms.provider.action.PICK_IMAGES"), 1114112);
        }

        public final ResolveInfo b(Context context) {
            l.e(context, "context");
            return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
        }

        public final String c(f fVar) {
            l.e(fVar, "input");
            if (fVar instanceof c) {
                return "image/*";
            }
            if (fVar instanceof e) {
                return "video/*";
            }
            if (fVar instanceof C0128d) {
                return ((C0128d) fVar).a();
            }
            if (fVar instanceof b) {
                return null;
            }
            throw new k();
        }

        public final boolean d(Context context) {
            l.e(context, "context");
            return a(context) != null;
        }

        public final boolean e(Context context) {
            l.e(context, "context");
            return b(context) != null;
        }

        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        public final boolean f() {
            int i10 = Build.VERSION.SDK_INT;
            return i10 >= 33 || (i10 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2);
        }
    }

    public static final class b implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f8281a = new b();

        private b() {
        }
    }

    public static final class c implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f8282a = new c();

        private c() {
        }
    }

    /* renamed from: e.d$d  reason: collision with other inner class name */
    public static final class C0128d implements f {

        /* renamed from: a  reason: collision with root package name */
        private final String f8283a;

        public final String a() {
            return this.f8283a;
        }
    }

    public static final class e implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final e f8284a = new e();

        private e() {
        }
    }

    public interface f {
    }

    /* renamed from: d */
    public Intent a(Context context, g gVar) {
        ActivityInfo activityInfo;
        Intent intent;
        l.e(context, "context");
        l.e(gVar, "input");
        a aVar = f8280a;
        if (aVar.f()) {
            Intent intent2 = new Intent("android.provider.action.PICK_IMAGES");
            intent2.setType(aVar.c(gVar.a()));
            return intent2;
        }
        if (aVar.e(context)) {
            ResolveInfo b10 = aVar.b(context);
            if (b10 != null) {
                activityInfo = b10.activityInfo;
                intent = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        } else if (aVar.d(context)) {
            ResolveInfo a10 = aVar.a(context);
            if (a10 != null) {
                activityInfo = a10.activityInfo;
                intent = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        } else {
            Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent3.setType(aVar.c(gVar.a()));
            if (intent3.getType() != null) {
                return intent3;
            }
            intent3.setType("*/*");
            intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            return intent3;
        }
        intent.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent.setType(aVar.c(gVar.a()));
        return intent;
    }

    /* renamed from: e */
    public final a.C0127a<Uri> b(Context context, g gVar) {
        l.e(context, "context");
        l.e(gVar, "input");
        return null;
    }

    /* renamed from: f */
    public final Uri c(int i10, Intent intent) {
        if (!(i10 == -1)) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        if (data == null) {
            data = (Uri) v.n(b.f8277a.a(intent));
        }
        return data;
    }
}
