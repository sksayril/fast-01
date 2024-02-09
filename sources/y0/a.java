package y0;

import android.location.Location;
import android.location.LocationListener;
import com.almoullim.background_location.LocationUpdatesService;

public final /* synthetic */ class a implements LocationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LocationUpdatesService f13224a;

    public /* synthetic */ a(LocationUpdatesService locationUpdatesService) {
        this.f13224a = locationUpdatesService;
    }

    public final void onLocationChanged(Location location) {
        LocationUpdatesService.n(this.f13224a, location);
    }
}
