package e6;

import java.util.List;

final class a {
    static u5.a a(List<b> list) {
        int size = (list.size() * 2) - 1;
        if (list.get(list.size() - 1).c() == null) {
            size--;
        }
        u5.a aVar = new u5.a(size * 12);
        int i10 = 0;
        int b10 = list.get(0).c().b();
        for (int i11 = 11; i11 >= 0; i11--) {
            if (((1 << i11) & b10) != 0) {
                aVar.r(i10);
            }
            i10++;
        }
        for (int i12 = 1; i12 < list.size(); i12++) {
            b bVar = list.get(i12);
            int b11 = bVar.b().b();
            for (int i13 = 11; i13 >= 0; i13--) {
                if (((1 << i13) & b11) != 0) {
                    aVar.r(i10);
                }
                i10++;
            }
            if (bVar.c() != null) {
                int b12 = bVar.c().b();
                for (int i14 = 11; i14 >= 0; i14--) {
                    if (((1 << i14) & b12) != 0) {
                        aVar.r(i10);
                    }
                    i10++;
                }
            }
        }
        return aVar;
    }
}
