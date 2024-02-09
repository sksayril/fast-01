package io.flutter.embedding.engine;

import android.content.Context;
import io.flutter.embedding.engine.a;
import io.flutter.plugin.platform.q;
import java.util.ArrayList;
import java.util.List;
import y6.a;

public class d {

    /* renamed from: a  reason: collision with root package name */
    final List<a> f9843a = new ArrayList();

    class a implements a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f9844a;

        a(a aVar) {
            this.f9844a = aVar;
        }

        public void a() {
            d.this.f9843a.remove(this.f9844a);
        }

        public void b() {
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private Context f9846a;

        /* renamed from: b  reason: collision with root package name */
        private a.c f9847b;

        /* renamed from: c  reason: collision with root package name */
        private String f9848c;

        /* renamed from: d  reason: collision with root package name */
        private List<String> f9849d;

        /* renamed from: e  reason: collision with root package name */
        private q f9850e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f9851f = true;

        /* renamed from: g  reason: collision with root package name */
        private boolean f9852g = false;

        public b(Context context) {
            this.f9846a = context;
        }

        public boolean a() {
            return this.f9851f;
        }

        public Context b() {
            return this.f9846a;
        }

        public a.c c() {
            return this.f9847b;
        }

        public List<String> d() {
            return this.f9849d;
        }

        public String e() {
            return this.f9848c;
        }

        public q f() {
            return this.f9850e;
        }

        public boolean g() {
            return this.f9852g;
        }

        public b h(boolean z9) {
            this.f9851f = z9;
            return this;
        }

        public b i(a.c cVar) {
            this.f9847b = cVar;
            return this;
        }

        public b j(List<String> list) {
            this.f9849d = list;
            return this;
        }

        public b k(String str) {
            this.f9848c = str;
            return this;
        }

        public b l(boolean z9) {
            this.f9852g = z9;
            return this;
        }
    }

    public d(Context context, String[] strArr) {
        a7.d c10 = x6.a.e().c();
        if (!c10.k()) {
            c10.m(context.getApplicationContext());
            c10.e(context.getApplicationContext(), strArr);
        }
    }

    public a a(b bVar) {
        a aVar;
        Context b10 = bVar.b();
        a.c c10 = bVar.c();
        String e10 = bVar.e();
        List<String> d10 = bVar.d();
        q f10 = bVar.f();
        if (f10 == null) {
            f10 = new q();
        }
        q qVar = f10;
        boolean a10 = bVar.a();
        boolean g10 = bVar.g();
        a.c a11 = c10 == null ? a.c.a() : c10;
        if (this.f9843a.size() == 0) {
            aVar = b(b10, qVar, a10, g10);
            if (e10 != null) {
                aVar.n().c(e10);
            }
            aVar.j().k(a11, d10);
        } else {
            aVar = this.f9843a.get(0).y(b10, a11, e10, d10, qVar, a10, g10);
        }
        this.f9843a.add(aVar);
        aVar.e(new a(aVar));
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public a b(Context context, q qVar, boolean z9, boolean z10) {
        return new a(context, (a7.d) null, (FlutterJNI) null, qVar, (String[]) null, z9, z10, this);
    }
}
