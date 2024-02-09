package s6;

public final /* synthetic */ class n {

    class a implements j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f12295a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o f12296b;

        a(o oVar, i iVar) {
            this.f12296b = oVar;
            this.f12295a = iVar;
        }

        public int a() {
            return this.f12295a.f12273c;
        }

        public boolean b() {
            return this.f12295a.F();
        }
    }

    public static void a(o oVar, i iVar, Runnable runnable) {
        oVar.b(new k(iVar == null ? null : new a(oVar, iVar), runnable));
    }

    public static o b(String str, int i10, int i11) {
        return i10 == 1 ? new s(str, i11) : new q(str, i10, i11);
    }
}
