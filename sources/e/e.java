package e;

import android.content.Context;
import android.content.Intent;
import e.a;
import g8.p;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

public final class e extends a<String[], Map<String, Boolean>> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8285a = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final Intent a(String[] strArr) {
            l.e(strArr, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
            l.d(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }
    }

    /* renamed from: d */
    public Intent a(Context context, String[] strArr) {
        l.e(context, "context");
        l.e(strArr, "input");
        return f8285a.a(strArr);
    }

    /* renamed from: e */
    public a.C0127a<Map<String, Boolean>> b(Context context, String[] strArr) {
        l.e(context, "context");
        l.e(strArr, "input");
        boolean z9 = true;
        if (strArr.length == 0) {
            return new a.C0127a<>(f0.d());
        }
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (!(androidx.core.content.a.a(context, strArr[i10]) == 0)) {
                z9 = false;
                break;
            }
            i10++;
        }
        if (!z9) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i.a(e0.a(strArr.length), 16));
        for (String a10 : strArr) {
            g8.l a11 = p.a(a10, Boolean.TRUE);
            linkedHashMap.put(a11.c(), a11.d());
        }
        return new a.C0127a<>(linkedHashMap);
    }

    /* renamed from: f */
    public Map<String, Boolean> c(int i10, Intent intent) {
        if (i10 != -1) {
            return f0.d();
        }
        if (intent == null) {
            return f0.d();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return f0.d();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        int length = intArrayExtra.length;
        for (int i11 = 0; i11 < length; i11++) {
            arrayList.add(Boolean.valueOf(intArrayExtra[i11] == 0));
        }
        return f0.k(v.E(j.i(stringArrayExtra), arrayList));
    }
}
