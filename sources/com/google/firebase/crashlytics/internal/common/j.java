package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.FilenameFilter;

public final /* synthetic */ class j implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ j f7304a = new j();

    private /* synthetic */ j() {
    }

    public final boolean accept(File file, String str) {
        return str.startsWith("aqs.");
    }
}
