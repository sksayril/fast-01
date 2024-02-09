package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

public abstract class g {
    @Deprecated
    public Fragment c(Context context, String str, Bundle bundle) {
        return Fragment.X(context, str, bundle);
    }

    public abstract View d(int i10);

    public abstract boolean e();
}
