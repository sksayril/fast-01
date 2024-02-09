package androidx.core.app;

import android.os.Bundle;
import androidx.core.app.l;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Set;

class n {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f1330a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f1331b = new Object();

    static Bundle a(l.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat d10 = aVar.d();
        bundle.putInt("icon", d10 != null ? d10.n() : 0);
        bundle.putCharSequence("title", aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    private static Bundle b(r rVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", rVar.i());
        bundle.putCharSequence("label", rVar.h());
        bundle.putCharSequenceArray("choices", rVar.e());
        bundle.putBoolean("allowFreeFormInput", rVar.c());
        bundle.putBundle("extras", rVar.g());
        Set<String> d10 = rVar.d();
        if (d10 != null && !d10.isEmpty()) {
            ArrayList arrayList = new ArrayList(d10.size());
            for (String add : d10) {
                arrayList.add(add);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    private static Bundle[] c(r[] rVarArr) {
        if (rVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[rVarArr.length];
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            bundleArr[i10] = b(rVarArr[i10]);
        }
        return bundleArr;
    }
}
