package r4;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.core.os.o;
import d3.j;
import d3.m;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import s4.b;
import v3.a;
import w3.c;
import w3.e;
import w3.f0;
import w3.r;
import z4.i;

public class f implements i, j {

    /* renamed from: a  reason: collision with root package name */
    private final b<k> f12092a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f12093b;

    /* renamed from: c  reason: collision with root package name */
    private final b<i> f12094c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<g> f12095d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f12096e;

    private f(Context context, String str, Set<g> set, b<i> bVar, Executor executor) {
        this((b<k>) new d(context, str), set, executor, bVar, context);
    }

    f(b<k> bVar, Set<g> set, Executor executor, b<i> bVar2, Context context) {
        this.f12092a = bVar;
        this.f12095d = set;
        this.f12096e = executor;
        this.f12094c = bVar2;
        this.f12093b = context;
    }

    public static c<f> f() {
        f0<Executor> a10 = f0.a(a.class, Executor.class);
        return c.d(f.class, i.class, j.class).b(r.i(Context.class)).b(r.i(t3.f.class)).b(r.m(g.class)).b(r.k(i.class)).b(r.j(a10)).e(new e(a10)).c();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ f g(f0 f0Var, e eVar) {
        return new f((Context) eVar.a(Context.class), ((t3.f) eVar.a(t3.f.class)).s(), eVar.c(g.class), eVar.e(i.class), (Executor) eVar.g(f0Var));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String h() {
        GZIPOutputStream gZIPOutputStream;
        String byteArrayOutputStream;
        synchronized (this) {
            k kVar = this.f12092a.get();
            List<l> c10 = kVar.c();
            kVar.b();
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < c10.size(); i10++) {
                l lVar = c10.get(i10);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", lVar.c());
                jSONObject.put("dates", new JSONArray(lVar.b()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", "2");
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
            try {
                gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
            } catch (Throwable th) {
                try {
                    base64OutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return byteArrayOutputStream;
        throw th;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ k i(Context context, String str) {
        return new k(context, str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Void j() {
        synchronized (this) {
            this.f12092a.get().g(System.currentTimeMillis(), this.f12094c.get().a());
        }
        return null;
    }

    public j<String> a() {
        return o.a(this.f12093b) ^ true ? m.e("") : m.c(this.f12096e, new c(this));
    }

    public j<Void> k() {
        return this.f12095d.size() <= 0 ? m.e(null) : o.a(this.f12093b) ^ true ? m.e(null) : m.c(this.f12096e, new b(this));
    }
}
