package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class i implements DynamiteModule.b {
    i() {
    }

    public final DynamiteModule.b.C0088b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0088b bVar = new DynamiteModule.b.C0088b();
        bVar.f5072a = aVar.a(context, str);
        int b10 = aVar.b(context, str, true);
        bVar.f5073b = b10;
        int i10 = bVar.f5072a;
        if (i10 == 0) {
            if (b10 == 0) {
                bVar.f5074c = 0;
                return bVar;
            }
            i10 = 0;
        }
        if (b10 >= i10) {
            bVar.f5074c = 1;
        } else {
            bVar.f5074c = -1;
        }
        return bVar;
    }
}
