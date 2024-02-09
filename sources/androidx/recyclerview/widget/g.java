package androidx.recyclerview.widget;

import androidx.recyclerview.widget.a;
import java.util.List;

class g {

    /* renamed from: a  reason: collision with root package name */
    final a f3066a;

    interface a {
        void a(a.b bVar);

        a.b b(int i10, int i11, int i12, Object obj);
    }

    g(a aVar) {
        this.f3066a = aVar;
    }

    private int a(List<a.b> list) {
        boolean z9 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f2954a != 8) {
                z9 = true;
            } else if (z9) {
                return size;
            }
        }
        return -1;
    }

    private void c(List<a.b> list, int i10, a.b bVar, int i11, a.b bVar2) {
        int i12 = bVar.f2957d;
        int i13 = bVar2.f2955b;
        int i14 = i12 < i13 ? -1 : 0;
        int i15 = bVar.f2955b;
        if (i15 < i13) {
            i14++;
        }
        if (i13 <= i15) {
            bVar.f2955b = i15 + bVar2.f2957d;
        }
        int i16 = bVar2.f2955b;
        if (i16 <= i12) {
            bVar.f2957d = i12 + bVar2.f2957d;
        }
        bVar2.f2955b = i16 + i14;
        list.set(i10, bVar2);
        list.set(i11, bVar);
    }

    private void d(List<a.b> list, int i10, int i11) {
        a.b bVar = list.get(i10);
        a.b bVar2 = list.get(i11);
        int i12 = bVar2.f2954a;
        if (i12 == 1) {
            c(list, i10, bVar, i11, bVar2);
        } else if (i12 == 2) {
            e(list, i10, bVar, i11, bVar2);
        } else if (i12 == 4) {
            f(list, i10, bVar, i11, bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(List<a.b> list) {
        while (true) {
            int a10 = a(list);
            if (a10 != -1) {
                d(list, a10, a10 + 1);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009d, code lost:
        if (r0 > r14.f2955b) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c7, code lost:
        if (r0 >= r14.f2955b) goto L_0x00c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(java.util.List<androidx.recyclerview.widget.a.b> r10, int r11, androidx.recyclerview.widget.a.b r12, int r13, androidx.recyclerview.widget.a.b r14) {
        /*
            r9 = this;
            int r0 = r12.f2955b
            int r1 = r12.f2957d
            r2 = 0
            r3 = 1
            int r4 = r14.f2955b
            if (r0 >= r1) goto L_0x0016
            if (r4 != r0) goto L_0x0014
            int r4 = r14.f2957d
            int r0 = r1 - r0
            if (r4 != r0) goto L_0x0014
            r0 = 0
            goto L_0x0020
        L_0x0014:
            r0 = 0
            goto L_0x0023
        L_0x0016:
            int r5 = r1 + 1
            if (r4 != r5) goto L_0x0022
            int r4 = r14.f2957d
            int r0 = r0 - r1
            if (r4 != r0) goto L_0x0022
            r0 = 1
        L_0x0020:
            r2 = 1
            goto L_0x0023
        L_0x0022:
            r0 = 1
        L_0x0023:
            int r4 = r14.f2955b
            r5 = 2
            if (r1 >= r4) goto L_0x002c
            int r4 = r4 - r3
            r14.f2955b = r4
            goto L_0x0045
        L_0x002c:
            int r6 = r14.f2957d
            int r4 = r4 + r6
            if (r1 >= r4) goto L_0x0045
            int r6 = r6 - r3
            r14.f2957d = r6
            r12.f2954a = r5
            r12.f2957d = r3
            int r11 = r14.f2957d
            if (r11 != 0) goto L_0x0044
            r10.remove(r13)
            androidx.recyclerview.widget.g$a r10 = r9.f3066a
            r10.a(r14)
        L_0x0044:
            return
        L_0x0045:
            int r1 = r12.f2955b
            int r4 = r14.f2955b
            r6 = 0
            if (r1 > r4) goto L_0x0050
            int r4 = r4 + r3
            r14.f2955b = r4
            goto L_0x0066
        L_0x0050:
            int r7 = r14.f2957d
            int r8 = r4 + r7
            if (r1 >= r8) goto L_0x0066
            int r4 = r4 + r7
            int r4 = r4 - r1
            androidx.recyclerview.widget.g$a r7 = r9.f3066a
            int r1 = r1 + r3
            androidx.recyclerview.widget.a$b r6 = r7.b(r5, r1, r4, r6)
            int r1 = r12.f2955b
            int r3 = r14.f2955b
            int r1 = r1 - r3
            r14.f2957d = r1
        L_0x0066:
            if (r2 == 0) goto L_0x0074
            r10.set(r11, r14)
            r10.remove(r13)
            androidx.recyclerview.widget.g$a r10 = r9.f3066a
            r10.a(r12)
            return
        L_0x0074:
            if (r0 == 0) goto L_0x00a0
            if (r6 == 0) goto L_0x008e
            int r0 = r12.f2955b
            int r1 = r6.f2955b
            if (r0 <= r1) goto L_0x0083
            int r1 = r6.f2957d
            int r0 = r0 - r1
            r12.f2955b = r0
        L_0x0083:
            int r0 = r12.f2957d
            int r1 = r6.f2955b
            if (r0 <= r1) goto L_0x008e
            int r1 = r6.f2957d
            int r0 = r0 - r1
            r12.f2957d = r0
        L_0x008e:
            int r0 = r12.f2955b
            int r1 = r14.f2955b
            if (r0 <= r1) goto L_0x0099
            int r1 = r14.f2957d
            int r0 = r0 - r1
            r12.f2955b = r0
        L_0x0099:
            int r0 = r12.f2957d
            int r1 = r14.f2955b
            if (r0 <= r1) goto L_0x00ce
            goto L_0x00c9
        L_0x00a0:
            if (r6 == 0) goto L_0x00b8
            int r0 = r12.f2955b
            int r1 = r6.f2955b
            if (r0 < r1) goto L_0x00ad
            int r1 = r6.f2957d
            int r0 = r0 - r1
            r12.f2955b = r0
        L_0x00ad:
            int r0 = r12.f2957d
            int r1 = r6.f2955b
            if (r0 < r1) goto L_0x00b8
            int r1 = r6.f2957d
            int r0 = r0 - r1
            r12.f2957d = r0
        L_0x00b8:
            int r0 = r12.f2955b
            int r1 = r14.f2955b
            if (r0 < r1) goto L_0x00c3
            int r1 = r14.f2957d
            int r0 = r0 - r1
            r12.f2955b = r0
        L_0x00c3:
            int r0 = r12.f2957d
            int r1 = r14.f2955b
            if (r0 < r1) goto L_0x00ce
        L_0x00c9:
            int r1 = r14.f2957d
            int r0 = r0 - r1
            r12.f2957d = r0
        L_0x00ce:
            r10.set(r11, r14)
            int r14 = r12.f2955b
            int r0 = r12.f2957d
            if (r14 == r0) goto L_0x00db
            r10.set(r13, r12)
            goto L_0x00de
        L_0x00db:
            r10.remove(r13)
        L_0x00de:
            if (r6 == 0) goto L_0x00e3
            r10.add(r11, r6)
        L_0x00e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.g.e(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(java.util.List<androidx.recyclerview.widget.a.b> r9, int r10, androidx.recyclerview.widget.a.b r11, int r12, androidx.recyclerview.widget.a.b r13) {
        /*
            r8 = this;
            int r0 = r11.f2957d
            int r1 = r13.f2955b
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto L_0x000d
            int r1 = r1 - r4
            r13.f2955b = r1
            goto L_0x0020
        L_0x000d:
            int r5 = r13.f2957d
            int r1 = r1 + r5
            if (r0 >= r1) goto L_0x0020
            int r5 = r5 - r4
            r13.f2957d = r5
            androidx.recyclerview.widget.g$a r0 = r8.f3066a
            int r1 = r11.f2955b
            java.lang.Object r5 = r13.f2956c
            androidx.recyclerview.widget.a$b r0 = r0.b(r2, r1, r4, r5)
            goto L_0x0021
        L_0x0020:
            r0 = r3
        L_0x0021:
            int r1 = r11.f2955b
            int r5 = r13.f2955b
            if (r1 > r5) goto L_0x002b
            int r5 = r5 + r4
            r13.f2955b = r5
            goto L_0x0041
        L_0x002b:
            int r6 = r13.f2957d
            int r7 = r5 + r6
            if (r1 >= r7) goto L_0x0041
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.g$a r3 = r8.f3066a
            int r1 = r1 + r4
            java.lang.Object r4 = r13.f2956c
            androidx.recyclerview.widget.a$b r3 = r3.b(r2, r1, r5, r4)
            int r1 = r13.f2957d
            int r1 = r1 - r5
            r13.f2957d = r1
        L_0x0041:
            r9.set(r12, r11)
            int r11 = r13.f2957d
            if (r11 <= 0) goto L_0x004c
            r9.set(r10, r13)
            goto L_0x0054
        L_0x004c:
            r9.remove(r10)
            androidx.recyclerview.widget.g$a r11 = r8.f3066a
            r11.a(r13)
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            r9.add(r10, r0)
        L_0x0059:
            if (r3 == 0) goto L_0x005e
            r9.add(r10, r3)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.g.f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
