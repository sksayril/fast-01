package m9;

import android.content.Context;
import io.flutter.plugin.platform.f;
import io.flutter.plugin.platform.g;
import java.util.HashMap;
import k7.c;
import k7.r;
import kotlin.jvm.internal.l;

public final class d extends g {

    /* renamed from: b  reason: collision with root package name */
    private final c f11275b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(c cVar) {
        super(r.f11008a);
        l.e(cVar, "messenger");
        this.f11275b = cVar;
    }

    public f a(Context context, int i10, Object obj) {
        l.c(obj, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Any> }");
        HashMap hashMap = (HashMap) obj;
        if (context != null) {
            return new c(context, this.f11275b, i10, hashMap);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
