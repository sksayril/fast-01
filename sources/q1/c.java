package q1;

import android.content.Context;
import java.util.Objects;
import z1.a;

final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11964a;

    /* renamed from: b  reason: collision with root package name */
    private final a f11965b;

    /* renamed from: c  reason: collision with root package name */
    private final a f11966c;

    /* renamed from: d  reason: collision with root package name */
    private final String f11967d;

    c(Context context, a aVar, a aVar2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.f11964a = context;
        Objects.requireNonNull(aVar, "Null wallClock");
        this.f11965b = aVar;
        Objects.requireNonNull(aVar2, "Null monotonicClock");
        this.f11966c = aVar2;
        Objects.requireNonNull(str, "Null backendName");
        this.f11967d = str;
    }

    public Context b() {
        return this.f11964a;
    }

    public String c() {
        return this.f11967d;
    }

    public a d() {
        return this.f11966c;
    }

    public a e() {
        return this.f11965b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f11964a.equals(hVar.b()) && this.f11965b.equals(hVar.e()) && this.f11966c.equals(hVar.d()) && this.f11967d.equals(hVar.c());
    }

    public int hashCode() {
        return ((((((this.f11964a.hashCode() ^ 1000003) * 1000003) ^ this.f11965b.hashCode()) * 1000003) ^ this.f11966c.hashCode()) * 1000003) ^ this.f11967d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f11964a + ", wallClock=" + this.f11965b + ", monotonicClock=" + this.f11966c + ", backendName=" + this.f11967d + "}";
    }
}
