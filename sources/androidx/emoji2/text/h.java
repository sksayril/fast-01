package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

public abstract class h extends ReplacementSpan {

    /* renamed from: m  reason: collision with root package name */
    private final Paint.FontMetricsInt f2202m = new Paint.FontMetricsInt();

    /* renamed from: n  reason: collision with root package name */
    private final f f2203n;

    /* renamed from: o  reason: collision with root package name */
    private short f2204o = -1;

    /* renamed from: p  reason: collision with root package name */
    private short f2205p = -1;

    /* renamed from: q  reason: collision with root package name */
    private float f2206q = 1.0f;

    h(f fVar) {
        androidx.core.util.h.k(fVar, "metadata cannot be null");
        this.f2203n = fVar;
    }

    public final f a() {
        return this.f2203n;
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        return this.f2204o;
    }

    public int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f2202m);
        Paint.FontMetricsInt fontMetricsInt2 = this.f2202m;
        this.f2206q = (((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f) / ((float) this.f2203n.e());
        this.f2205p = (short) ((int) (((float) this.f2203n.e()) * this.f2206q));
        short i12 = (short) ((int) (((float) this.f2203n.i()) * this.f2206q));
        this.f2204o = i12;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f2202m;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return i12;
    }
}
