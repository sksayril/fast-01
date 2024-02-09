package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.FilenameFilter;

public final /* synthetic */ class o implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ o f7332a = new o();

    private /* synthetic */ o() {
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(".ae");
    }
}
