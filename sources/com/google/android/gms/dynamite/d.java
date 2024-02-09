package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class d implements DynamiteModule.b {
    d() {
    }

    public final DynamiteModule.b.C0088b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0088b bVar = new DynamiteModule.b.C0088b();
        int b10 = aVar.b(context, str, true);
        bVar.f5073b = b10;
        if (b10 != 0) {
            bVar.f5074c = 1;
        } else {
            int a10 = aVar.a(context, str);
            bVar.f5072a = a10;
            if (a10 != 0) {
                bVar.f5074c = -1;
            }
        }
        return bVar;
    }
}
