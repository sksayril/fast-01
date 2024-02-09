package f3;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

public class e extends Property<Drawable, Integer> {

    /* renamed from: b  reason: collision with root package name */
    public static final Property<Drawable, Integer> f8761b = new e();

    /* renamed from: a  reason: collision with root package name */
    private final WeakHashMap<Drawable, Integer> f8762a = new WeakHashMap<>();

    private e() {
        super(Integer.class, "drawableAlphaCompat");
    }

    /* renamed from: a */
    public Integer get(Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    /* renamed from: b */
    public void set(Drawable drawable, Integer num) {
        drawable.setAlpha(num.intValue());
    }
}