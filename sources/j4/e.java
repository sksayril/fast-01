package j4;

import java.util.Stack;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f10803a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10804b;

    /* renamed from: c  reason: collision with root package name */
    public final StackTraceElement[] f10805c;

    /* renamed from: d  reason: collision with root package name */
    public final e f10806d;

    private e(String str, String str2, StackTraceElement[] stackTraceElementArr, e eVar) {
        this.f10803a = str;
        this.f10804b = str2;
        this.f10805c = stackTraceElementArr;
        this.f10806d = eVar;
    }

    public static e a(Throwable th, d dVar) {
        Stack stack = new Stack();
        while (th != null) {
            stack.push(th);
            th = th.getCause();
        }
        e eVar = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            eVar = new e(th2.getLocalizedMessage(), th2.getClass().getName(), dVar.a(th2.getStackTrace()), eVar);
        }
        return eVar;
    }
}
