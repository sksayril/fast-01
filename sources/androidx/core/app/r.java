package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final String f1369a;

    /* renamed from: b  reason: collision with root package name */
    private final CharSequence f1370b;

    /* renamed from: c  reason: collision with root package name */
    private final CharSequence[] f1371c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f1372d;

    /* renamed from: e  reason: collision with root package name */
    private final int f1373e;

    /* renamed from: f  reason: collision with root package name */
    private final Bundle f1374f;

    /* renamed from: g  reason: collision with root package name */
    private final Set<String> f1375g;

    static class a {
        static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(r rVar) {
            Set<String> d10;
            RemoteInput.Builder addExtras = new RemoteInput.Builder(rVar.i()).setLabel(rVar.h()).setChoices(rVar.e()).setAllowFreeFormInput(rVar.c()).addExtras(rVar.g());
            if (Build.VERSION.SDK_INT >= 26 && (d10 = rVar.d()) != null) {
                for (String d11 : d10) {
                    b.d(addExtras, d11, true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(addExtras, rVar.f());
            }
            return addExtras.build();
        }

        static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    static class b {
        static void a(r rVar, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(r.a(rVar), intent, map);
        }

        static Set<String> b(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        static Map<String, Uri> c(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z9) {
            return builder.setAllowDataType(str, z9);
        }
    }

    static class c {
        static int a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        static RemoteInput.Builder b(RemoteInput.Builder builder, int i10) {
            return builder.setEditChoicesBeforeSending(i10);
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f1376a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<String> f1377b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        private final Bundle f1378c = new Bundle();

        /* renamed from: d  reason: collision with root package name */
        private CharSequence f1379d;

        /* renamed from: e  reason: collision with root package name */
        private CharSequence[] f1380e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f1381f = true;

        /* renamed from: g  reason: collision with root package name */
        private int f1382g = 0;

        public d(String str) {
            if (str != null) {
                this.f1376a = str;
                return;
            }
            throw new IllegalArgumentException("Result key can't be null");
        }

        public r a() {
            return new r(this.f1376a, this.f1379d, this.f1380e, this.f1381f, this.f1382g, this.f1378c, this.f1377b);
        }

        public d b(String str, boolean z9) {
            if (z9) {
                this.f1377b.add(str);
            } else {
                this.f1377b.remove(str);
            }
            return this;
        }

        public d c(boolean z9) {
            this.f1381f = z9;
            return this;
        }

        public d d(CharSequence[] charSequenceArr) {
            this.f1380e = charSequenceArr;
            return this;
        }

        public d e(CharSequence charSequence) {
            this.f1379d = charSequence;
            return this;
        }
    }

    r(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z9, int i10, Bundle bundle, Set<String> set) {
        this.f1369a = str;
        this.f1370b = charSequence;
        this.f1371c = charSequenceArr;
        this.f1372d = z9;
        this.f1373e = i10;
        this.f1374f = bundle;
        this.f1375g = set;
        if (f() == 2 && !c()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    static RemoteInput a(r rVar) {
        return a.b(rVar);
    }

    static RemoteInput[] b(r[] rVarArr) {
        if (rVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[rVarArr.length];
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            remoteInputArr[i10] = a(rVarArr[i10]);
        }
        return remoteInputArr;
    }

    public static Bundle j(Intent intent) {
        return a.c(intent);
    }

    public boolean c() {
        return this.f1372d;
    }

    public Set<String> d() {
        return this.f1375g;
    }

    public CharSequence[] e() {
        return this.f1371c;
    }

    public int f() {
        return this.f1373e;
    }

    public Bundle g() {
        return this.f1374f;
    }

    public CharSequence h() {
        return this.f1370b;
    }

    public String i() {
        return this.f1369a;
    }

    public boolean k() {
        return !c() && (e() == null || e().length == 0) && d() != null && !d().isEmpty();
    }
}
