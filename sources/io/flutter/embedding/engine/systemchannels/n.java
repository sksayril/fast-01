package io.flutter.embedding.engine.systemchannels;

import java.util.HashMap;
import java.util.Map;
import k7.f;

public class n {

    /* renamed from: a  reason: collision with root package name */
    public final k7.a<Object> f9958a;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final k7.a<Object> f9959a;

        /* renamed from: b  reason: collision with root package name */
        private Map<String, Object> f9960b = new HashMap();

        a(k7.a<Object> aVar) {
            this.f9959a = aVar;
        }

        public void a() {
            x6.b.f("SettingsChannel", "Sending message: \ntextScaleFactor: " + this.f9960b.get("textScaleFactor") + "\nalwaysUse24HourFormat: " + this.f9960b.get("alwaysUse24HourFormat") + "\nplatformBrightness: " + this.f9960b.get("platformBrightness"));
            this.f9959a.c(this.f9960b);
        }

        public a b(boolean z9) {
            this.f9960b.put("brieflyShowPassword", Boolean.valueOf(z9));
            return this;
        }

        public a c(boolean z9) {
            this.f9960b.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z9));
            return this;
        }

        public a d(b bVar) {
            this.f9960b.put("platformBrightness", bVar.name);
            return this;
        }

        public a e(float f10) {
            this.f9960b.put("textScaleFactor", Float.valueOf(f10));
            return this;
        }

        public a f(boolean z9) {
            this.f9960b.put("alwaysUse24HourFormat", Boolean.valueOf(z9));
            return this;
        }
    }

    public enum b {
        light("light"),
        dark("dark");
        
        public String name;

        private b(String str) {
            this.name = str;
        }
    }

    public n(y6.a aVar) {
        this.f9958a = new k7.a<>(aVar, "flutter/settings", f.f10994a);
    }

    public a a() {
        return new a(this.f9958a);
    }
}
