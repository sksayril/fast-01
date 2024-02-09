package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;

public final class n extends h {

    /* renamed from: r  reason: collision with root package name */
    private static Paint f2232r;

    public n(f fVar) {
        super(fVar);
    }

    private static Paint c() {
        if (f2232r == null) {
            TextPaint textPaint = new TextPaint();
            f2232r = textPaint;
            textPaint.setColor(d.b().c());
            f2232r.setStyle(Paint.Style.FILL);
        }
        return f2232r;
    }

    public void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        if (d.b().i()) {
            canvas.drawRect(f10, (float) i12, f10 + ((float) b()), (float) i14, c());
        }
        a().a(canvas, f10, (float) i13, paint);
    }
}
