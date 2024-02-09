package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

class b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    final ActionBarContainer f790a;

    public b(ActionBarContainer actionBarContainer) {
        this.f790a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f790a;
        if (actionBarContainer.f618t) {
            Drawable drawable = actionBarContainer.f617s;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f615q;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f790a;
        Drawable drawable3 = actionBarContainer2.f616r;
        if (drawable3 != null && actionBarContainer2.f619u) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f790a;
        if (actionBarContainer.f618t) {
            drawable = actionBarContainer.f617s;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.f615q;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    public void setAlpha(int i10) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
