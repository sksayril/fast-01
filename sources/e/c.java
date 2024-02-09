package e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.activity.result.g;
import e.a;
import e.d;
import java.util.List;
import kotlin.jvm.internal.l;

public class c extends a<g, List<Uri>> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f8278b = new a((kotlin.jvm.internal.g) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f8279a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final int a() {
            if (d.f8280a.f()) {
                return MediaStore.getPickImagesMaxLimit();
            }
            return Integer.MAX_VALUE;
        }
    }

    public c() {
        this(0, 1, (kotlin.jvm.internal.g) null);
    }

    public c(int i10) {
        this.f8279a = i10;
        if (!(i10 <= 1 ? false : true)) {
            throw new IllegalArgumentException("Max items must be higher than 1".toString());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, int i11, kotlin.jvm.internal.g gVar) {
        this((i11 & 1) != 0 ? f8278b.a() : i10);
    }

    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    /* renamed from: d */
    public Intent a(Context context, g gVar) {
        l.e(context, "context");
        l.e(gVar, "input");
        d.a aVar = d.f8280a;
        boolean z9 = true;
        if (aVar.f()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(aVar.c(gVar.a()));
            if (this.f8279a > MediaStore.getPickImagesMaxLimit()) {
                z9 = false;
            }
            if (z9) {
                intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", this.f8279a);
                return intent;
            }
            throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()".toString());
        } else if (aVar.e(context)) {
            ResolveInfo b10 = aVar.b(context);
            if (b10 != null) {
                ActivityInfo activityInfo = b10.activityInfo;
                Intent intent2 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
                intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent2.setType(aVar.c(gVar.a()));
                intent2.putExtra("com.google.android.gms.provider.extra.PICK_IMAGES_MAX", this.f8279a);
                return intent2;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } else if (aVar.d(context)) {
            ResolveInfo a10 = aVar.a(context);
            if (a10 != null) {
                ActivityInfo activityInfo2 = a10.activityInfo;
                Intent intent3 = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
                intent3.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
                intent3.putExtra("com.google.android.gms.provider.extra.PICK_IMAGES_MAX", this.f8279a);
                return intent3;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } else {
            Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent4.setType(aVar.c(gVar.a()));
            intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            if (intent4.getType() != null) {
                return intent4;
            }
            intent4.setType("*/*");
            intent4.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            return intent4;
        }
    }

    /* renamed from: e */
    public final a.C0127a<List<Uri>> b(Context context, g gVar) {
        l.e(context, "context");
        l.e(gVar, "input");
        return null;
    }

    /* renamed from: f */
    public final List<Uri> c(int i10, Intent intent) {
        List<Uri> a10;
        if (!(i10 == -1)) {
            intent = null;
        }
        return (intent == null || (a10 = b.f8277a.a(intent)) == null) ? n.c() : a10;
    }
}
