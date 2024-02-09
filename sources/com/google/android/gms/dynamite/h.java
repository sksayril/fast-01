package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class h implements DynamiteModule.b {
    h() {
    }

    public final DynamiteModule.b.C0088b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0088b bVar = new DynamiteModule.b.C0088b();
        int a10 = aVar.a(context, str);
        bVar.f5072a = a10;
        int i10 = 0;
        int b10 = a10 != 0 ? aVar.b(context, str, false) : aVar.b(context, str, true);
        bVar.f5073b = b10;
        int i11 = bVar.f5072a;
        if (i11 != 0) {
            i10 = i11;
        } else if (b10 == 0) {
            bVar.f5074c = 0;
            return bVar;
        }
        if (i10 >= b10) {
            bVar.f5074c = -1;
        } else {
            bVar.f5074c = 1;
        }
        return bVar;
    }
}
