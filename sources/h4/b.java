package h4;

import android.content.Context;
import com.google.android.datatransport.cct.a;
import com.google.firebase.crashlytics.internal.common.g0;
import d4.f0;
import e4.j;
import i4.i;
import n1.e;
import p1.u;

public class b {

    /* renamed from: c  reason: collision with root package name */
    private static final j f9272c = new j();

    /* renamed from: d  reason: collision with root package name */
    private static final String f9273d = e("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: e  reason: collision with root package name */
    private static final String f9274e = e("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: f  reason: collision with root package name */
    private static final e<f0, byte[]> f9275f = a.f9271a;

    /* renamed from: a  reason: collision with root package name */
    private final e f9276a;

    /* renamed from: b  reason: collision with root package name */
    private final e<f0, byte[]> f9277b;

    b(e eVar, e<f0, byte[]> eVar2) {
        this.f9276a = eVar;
        this.f9277b = eVar2;
    }

    public static b b(Context context, i iVar, g0 g0Var) {
        u.f(context);
        n1.b b10 = n1.b.b("json");
        e<f0, byte[]> eVar = f9275f;
        return new b(new e(u.c().g(new a(f9273d, f9274e)).a("FIREBASE_CRASHLYTICS_REPORT", f0.class, b10, eVar), iVar.b(), g0Var), eVar);
    }

    private static String e(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb.append(str2.charAt(i10));
            }
        }
        return sb.toString();
    }

    public d3.j<com.google.firebase.crashlytics.internal.common.u> c(com.google.firebase.crashlytics.internal.common.u uVar, boolean z9) {
        return this.f9276a.i(uVar, z9).a();
    }
}
