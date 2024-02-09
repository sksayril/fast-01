package c5;

import android.util.Base64;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final w f3770a = new w();

    /* renamed from: b  reason: collision with root package name */
    private static final String f3771b;

    /* renamed from: c  reason: collision with root package name */
    private static final String f3772c;

    /* renamed from: d  reason: collision with root package name */
    private static final String f3773d;

    static {
        String encodeToString = Base64.encodeToString(o.h(v.f3769a.e()), 10);
        f3771b = encodeToString;
        f3772c = "firebase_session_" + encodeToString + "_data";
        f3773d = "firebase_session_" + encodeToString + "_settings";
    }

    private w() {
    }

    public final String a() {
        return f3772c;
    }

    public final String b() {
        return f3773d;
    }
}
