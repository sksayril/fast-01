package com.google.firebase.crashlytics.internal.common;

import com.google.auto.value.AutoValue;

public interface c0 {

    @AutoValue
    public static abstract class a {
        static a a(String str, String str2) {
            return new c(str, str2);
        }

        public static a b(String str) {
            return a(str, (String) null);
        }

        public abstract String c();

        public abstract String d();
    }

    a a();
}
