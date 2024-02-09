package v0;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

class f {
    static <T> ObjectAnimator a(T t9, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofObject(t9, property, (TypeConverter) null, path);
    }
}
