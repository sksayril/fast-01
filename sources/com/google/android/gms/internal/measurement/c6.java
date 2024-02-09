package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import p.a;

public final class c6 {

    /* renamed from: a  reason: collision with root package name */
    private static final a<String, Uri> f5164a = new a<>();

    public static synchronized Uri a(String str) {
        Uri uri;
        synchronized (c6.class) {
            a<String, Uri> aVar = f5164a;
            uri = aVar.get(str);
            if (uri == null) {
                String encode = Uri.encode(str);
                uri = Uri.parse("content://com.google.android.gms.phenotype/" + encode);
                aVar.put(str, uri);
            }
        }
        return uri;
    }

    public static String b(Context context, String str) {
        if (!str.contains("#")) {
            String packageName = context.getPackageName();
            return str + "#" + "" + packageName;
        }
        throw new IllegalArgumentException("The passed in package cannot already have a subpackage: " + str);
    }
}
