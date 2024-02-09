package com.google.firebase.crashlytics.internal.common;

import g4.f;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import z3.g;

class l {

    /* renamed from: d  reason: collision with root package name */
    private static final FilenameFilter f7312d = j.f7304a;

    /* renamed from: e  reason: collision with root package name */
    private static final Comparator<File> f7313e = k.f7311m;

    /* renamed from: a  reason: collision with root package name */
    private final f f7314a;

    /* renamed from: b  reason: collision with root package name */
    private String f7315b = null;

    /* renamed from: c  reason: collision with root package name */
    private String f7316c = null;

    l(f fVar) {
        this.f7314a = fVar;
    }

    private static void f(f fVar, String str, String str2) {
        if (str != null && str2 != null) {
            try {
                fVar.o(str, "aqs." + str2).createNewFile();
            } catch (IOException e10) {
                g.f().l("Failed to persist App Quality Sessions session id.", e10);
            }
        }
    }

    static String g(f fVar, String str) {
        List<File> p10 = fVar.p(str, f7312d);
        if (!p10.isEmpty()) {
            return ((File) Collections.min(p10, f7313e)).getName().substring(4);
        }
        g.f().k("Unable to read App Quality Sessions session id.");
        return null;
    }

    public synchronized String c(String str) {
        if (Objects.equals(this.f7315b, str)) {
            return this.f7316c;
        }
        return g(this.f7314a, str);
    }

    public synchronized void h(String str) {
        if (!Objects.equals(this.f7316c, str)) {
            f(this.f7314a, this.f7315b, str);
            this.f7316c = str;
        }
    }

    public synchronized void i(String str) {
        if (!Objects.equals(this.f7315b, str)) {
            f(this.f7314a, str, this.f7316c);
            this.f7315b = str;
        }
    }
}
