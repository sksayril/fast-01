package j4;

public class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private final int f10798a;

    /* renamed from: b  reason: collision with root package name */
    private final d[] f10799b;

    /* renamed from: c  reason: collision with root package name */
    private final b f10800c;

    public a(int i10, d... dVarArr) {
        this.f10798a = i10;
        this.f10799b = dVarArr;
        this.f10800c = new b(i10);
    }

    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f10798a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (d dVar : this.f10799b) {
            if (stackTraceElementArr2.length <= this.f10798a) {
                break;
            }
            stackTraceElementArr2 = dVar.a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.f10798a ? this.f10800c.a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
