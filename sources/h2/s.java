package h2;

import android.content.Context;
import android.content.res.Resources;
import e2.k;

public class s {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f9254a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9255b;

    public s(Context context) {
        p.j(context);
        Resources resources = context.getResources();
        this.f9254a = resources;
        this.f9255b = resources.getResourcePackageName(k.common_google_play_services_unknown_issue);
    }

    public String a(String str) {
        int identifier = this.f9254a.getIdentifier(str, "string", this.f9255b);
        if (identifier == 0) {
            return null;
        }
        return this.f9254a.getString(identifier);
    }
}
