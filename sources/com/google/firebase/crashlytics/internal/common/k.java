package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.util.Comparator;

public final /* synthetic */ class k implements Comparator {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ k f7311m = new k();

    private /* synthetic */ k() {
    }

    public final int compare(Object obj, Object obj2) {
        return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
    }
}
