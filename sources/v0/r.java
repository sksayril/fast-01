package v0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class r {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f12670a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public View f12671b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<l> f12672c = new ArrayList<>();

    public boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f12671b == rVar.f12671b && this.f12670a.equals(rVar.f12670a);
    }

    public int hashCode() {
        return (this.f12671b.hashCode() * 31) + this.f12670a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f12671b + "\n") + "    values:";
        for (String next : this.f12670a.keySet()) {
            str = str + "    " + next + ": " + this.f12670a.get(next) + "\n";
        }
        return str;
    }
}
