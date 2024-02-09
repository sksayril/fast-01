package z0;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;

class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f13462a;

    a(Context context) {
        this.f13462a = context;
    }

    private static Geocoder a(Context context, Locale locale) {
        Geocoder geocoder;
        if (locale == null) {
            geocoder = new Geocoder(context);
        }
        return geocoder;
    }

    /* access modifiers changed from: package-private */
    public List<Address> b(String str, Locale locale) {
        return a(this.f13462a, locale).getFromLocationName(str, 5);
    }

    /* access modifiers changed from: package-private */
    public List<Address> c(double d10, double d11, Locale locale) {
        return a(this.f13462a, locale).getFromLocation(d10, d11, 5);
    }
}
