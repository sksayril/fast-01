package androidx.core.app;

import android.app.Person;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

public class p {

    /* renamed from: a  reason: collision with root package name */
    CharSequence f1355a;

    /* renamed from: b  reason: collision with root package name */
    IconCompat f1356b;

    /* renamed from: c  reason: collision with root package name */
    String f1357c;

    /* renamed from: d  reason: collision with root package name */
    String f1358d;

    /* renamed from: e  reason: collision with root package name */
    boolean f1359e;

    /* renamed from: f  reason: collision with root package name */
    boolean f1360f;

    static class a {
        static p a(Person person) {
            return new b().f(person.getName()).c(person.getIcon() != null ? IconCompat.c(person.getIcon()) : null).g(person.getUri()).e(person.getKey()).b(person.isBot()).d(person.isImportant()).a();
        }

        static Person b(p pVar) {
            return new Person.Builder().setName(pVar.e()).setIcon(pVar.c() != null ? pVar.c().y() : null).setUri(pVar.f()).setKey(pVar.d()).setBot(pVar.g()).setImportant(pVar.h()).build();
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        CharSequence f1361a;

        /* renamed from: b  reason: collision with root package name */
        IconCompat f1362b;

        /* renamed from: c  reason: collision with root package name */
        String f1363c;

        /* renamed from: d  reason: collision with root package name */
        String f1364d;

        /* renamed from: e  reason: collision with root package name */
        boolean f1365e;

        /* renamed from: f  reason: collision with root package name */
        boolean f1366f;

        public p a() {
            return new p(this);
        }

        public b b(boolean z9) {
            this.f1365e = z9;
            return this;
        }

        public b c(IconCompat iconCompat) {
            this.f1362b = iconCompat;
            return this;
        }

        public b d(boolean z9) {
            this.f1366f = z9;
            return this;
        }

        public b e(String str) {
            this.f1364d = str;
            return this;
        }

        public b f(CharSequence charSequence) {
            this.f1361a = charSequence;
            return this;
        }

        public b g(String str) {
            this.f1363c = str;
            return this;
        }
    }

    p(b bVar) {
        this.f1355a = bVar.f1361a;
        this.f1356b = bVar.f1362b;
        this.f1357c = bVar.f1363c;
        this.f1358d = bVar.f1364d;
        this.f1359e = bVar.f1365e;
        this.f1360f = bVar.f1366f;
    }

    public static p a(Person person) {
        return a.a(person);
    }

    public static p b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        return new b().f(bundle.getCharSequence("name")).c(bundle2 != null ? IconCompat.b(bundle2) : null).g(bundle.getString("uri")).e(bundle.getString("key")).b(bundle.getBoolean("isBot")).d(bundle.getBoolean("isImportant")).a();
    }

    public IconCompat c() {
        return this.f1356b;
    }

    public String d() {
        return this.f1358d;
    }

    public CharSequence e() {
        return this.f1355a;
    }

    public String f() {
        return this.f1357c;
    }

    public boolean g() {
        return this.f1359e;
    }

    public boolean h() {
        return this.f1360f;
    }

    public String i() {
        String str = this.f1357c;
        if (str != null) {
            return str;
        }
        if (this.f1355a == null) {
            return "";
        }
        return "name:" + this.f1355a;
    }

    public Person j() {
        return a.b(this);
    }

    public Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f1355a);
        IconCompat iconCompat = this.f1356b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.x() : null);
        bundle.putString("uri", this.f1357c);
        bundle.putString("key", this.f1358d);
        bundle.putBoolean("isBot", this.f1359e);
        bundle.putBoolean("isImportant", this.f1360f);
        return bundle;
    }
}
