package y7;

import android.graphics.Rect;
import t.a;

final class b {
    static Float a(float f10, float f11, float f12) {
        return Float.valueOf(a.a(f10, f11, f12));
    }

    static Rect b(float f10, Rect rect, float f11, float f12) {
        float floatValue = a(f10, f11, f12).floatValue();
        int width = rect.width() / 2;
        int height = rect.height() / 2;
        int width2 = (int) ((((float) rect.width()) * 0.5f) / floatValue);
        int height2 = (int) ((((float) rect.height()) * 0.5f) / floatValue);
        return new Rect(width - width2, height - height2, width + width2, height + height2);
    }
}
