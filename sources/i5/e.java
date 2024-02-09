package i5;

import com.google.gson.w;
import com.google.gson.x;
import g5.b;
import h5.c;
import m5.a;

public final class e implements x {

    /* renamed from: m  reason: collision with root package name */
    private final c f9504m;

    public e(c cVar) {
        this.f9504m = cVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: i5.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: com.google.gson.w<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: com.google.gson.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: i5.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: i5.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: i5.l} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.gson.w<?> a(h5.c r9, com.google.gson.e r10, m5.a<?> r11, g5.b r12) {
        /*
            r8 = this;
            java.lang.Class r0 = r12.value()
            m5.a r0 = m5.a.a(r0)
            h5.i r9 = r9.a(r0)
            java.lang.Object r9 = r9.a()
            boolean r0 = r9 instanceof com.google.gson.w
            if (r0 == 0) goto L_0x0017
            com.google.gson.w r9 = (com.google.gson.w) r9
            goto L_0x0075
        L_0x0017:
            boolean r0 = r9 instanceof com.google.gson.x
            if (r0 == 0) goto L_0x0022
            com.google.gson.x r9 = (com.google.gson.x) r9
            com.google.gson.w r9 = r9.create(r10, r11)
            goto L_0x0075
        L_0x0022:
            boolean r0 = r9 instanceof com.google.gson.r
            if (r0 != 0) goto L_0x005b
            boolean r1 = r9 instanceof com.google.gson.j
            if (r1 == 0) goto L_0x002b
            goto L_0x005b
        L_0x002b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Invalid attempt to bind an instance of "
            r12.append(r0)
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            r12.append(r9)
            java.lang.String r9 = " as a @JsonAdapter for "
            r12.append(r9)
            java.lang.String r9 = r11.toString()
            r12.append(r9)
            java.lang.String r9 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r10.<init>(r9)
            throw r10
        L_0x005b:
            r1 = 0
            if (r0 == 0) goto L_0x0063
            r0 = r9
            com.google.gson.r r0 = (com.google.gson.r) r0
            r3 = r0
            goto L_0x0064
        L_0x0063:
            r3 = r1
        L_0x0064:
            boolean r0 = r9 instanceof com.google.gson.j
            if (r0 == 0) goto L_0x006b
            r1 = r9
            com.google.gson.j r1 = (com.google.gson.j) r1
        L_0x006b:
            r4 = r1
            i5.l r9 = new i5.l
            r7 = 0
            r2 = r9
            r5 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0075:
            if (r9 == 0) goto L_0x0081
            boolean r10 = r12.nullSafe()
            if (r10 == 0) goto L_0x0081
            com.google.gson.w r9 = r9.b()
        L_0x0081:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.e.a(h5.c, com.google.gson.e, m5.a, g5.b):com.google.gson.w");
    }

    public <T> w<T> create(com.google.gson.e eVar, a<T> aVar) {
        b bVar = (b) aVar.c().getAnnotation(b.class);
        if (bVar == null) {
            return null;
        }
        return a(this.f9504m, eVar, aVar, bVar);
    }
}
