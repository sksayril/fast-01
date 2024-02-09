package androidx.core.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.core.util.c;

public class b implements Spannable {

    /* renamed from: p  reason: collision with root package name */
    private static final Object f1645p = new Object();

    /* renamed from: m  reason: collision with root package name */
    private final Spannable f1646m;

    /* renamed from: n  reason: collision with root package name */
    private final a f1647n;

    /* renamed from: o  reason: collision with root package name */
    private final PrecomputedText f1648o;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final TextPaint f1649a;

        /* renamed from: b  reason: collision with root package name */
        private final TextDirectionHeuristic f1650b;

        /* renamed from: c  reason: collision with root package name */
        private final int f1651c;

        /* renamed from: d  reason: collision with root package name */
        private final int f1652d;

        /* renamed from: e  reason: collision with root package name */
        final PrecomputedText.Params f1653e;

        /* renamed from: androidx.core.text.b$a$a  reason: collision with other inner class name */
        public static class C0029a {

            /* renamed from: a  reason: collision with root package name */
            private final TextPaint f1654a;

            /* renamed from: b  reason: collision with root package name */
            private TextDirectionHeuristic f1655b;

            /* renamed from: c  reason: collision with root package name */
            private int f1656c;

            /* renamed from: d  reason: collision with root package name */
            private int f1657d;

            public C0029a(TextPaint textPaint) {
                this.f1654a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f1656c = 1;
                    this.f1657d = 1;
                } else {
                    this.f1657d = 0;
                    this.f1656c = 0;
                }
                this.f1655b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }

            public a a() {
                return new a(this.f1654a, this.f1655b, this.f1656c, this.f1657d);
            }

            public C0029a b(int i10) {
                this.f1656c = i10;
                return this;
            }

            public C0029a c(int i10) {
                this.f1657d = i10;
                return this;
            }

            public C0029a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f1655b = textDirectionHeuristic;
                return this;
            }
        }

        public a(PrecomputedText.Params params) {
            this.f1649a = params.getTextPaint();
            this.f1650b = params.getTextDirection();
            this.f1651c = params.getBreakStrategy();
            this.f1652d = params.getHyphenationFrequency();
            this.f1653e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            this.f1653e = Build.VERSION.SDK_INT >= 29 ? new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build() : null;
            this.f1649a = textPaint;
            this.f1650b = textDirectionHeuristic;
            this.f1651c = i10;
            this.f1652d = i11;
        }

        public boolean a(a aVar) {
            int i10 = Build.VERSION.SDK_INT;
            if ((i10 >= 23 && (this.f1651c != aVar.b() || this.f1652d != aVar.c())) || this.f1649a.getTextSize() != aVar.e().getTextSize() || this.f1649a.getTextScaleX() != aVar.e().getTextScaleX() || this.f1649a.getTextSkewX() != aVar.e().getTextSkewX() || this.f1649a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f1649a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) || this.f1649a.getFlags() != aVar.e().getFlags()) {
                return false;
            }
            if (i10 >= 24) {
                if (!this.f1649a.getTextLocales().equals(aVar.e().getTextLocales())) {
                    return false;
                }
            } else if (!this.f1649a.getTextLocale().equals(aVar.e().getTextLocale())) {
                return false;
            }
            return this.f1649a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f1649a.getTypeface().equals(aVar.e().getTypeface());
        }

        public int b() {
            return this.f1651c;
        }

        public int c() {
            return this.f1652d;
        }

        public TextDirectionHeuristic d() {
            return this.f1650b;
        }

        public TextPaint e() {
            return this.f1649a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f1650b == aVar.d();
        }

        public int hashCode() {
            if (Build.VERSION.SDK_INT >= 24) {
                return c.b(Float.valueOf(this.f1649a.getTextSize()), Float.valueOf(this.f1649a.getTextScaleX()), Float.valueOf(this.f1649a.getTextSkewX()), Float.valueOf(this.f1649a.getLetterSpacing()), Integer.valueOf(this.f1649a.getFlags()), this.f1649a.getTextLocales(), this.f1649a.getTypeface(), Boolean.valueOf(this.f1649a.isElegantTextHeight()), this.f1650b, Integer.valueOf(this.f1651c), Integer.valueOf(this.f1652d));
            }
            return c.b(Float.valueOf(this.f1649a.getTextSize()), Float.valueOf(this.f1649a.getTextScaleX()), Float.valueOf(this.f1649a.getTextSkewX()), Float.valueOf(this.f1649a.getLetterSpacing()), Integer.valueOf(this.f1649a.getFlags()), this.f1649a.getTextLocale(), this.f1649a.getTypeface(), Boolean.valueOf(this.f1649a.isElegantTextHeight()), this.f1650b, Integer.valueOf(this.f1651c), Integer.valueOf(this.f1652d));
        }

        public String toString() {
            StringBuilder sb;
            Object textLocale;
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f1649a.getTextSize());
            sb2.append(", textScaleX=" + this.f1649a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f1649a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + this.f1649a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f1649a.isElegantTextHeight());
            if (i10 >= 24) {
                sb = new StringBuilder();
                sb.append(", textLocale=");
                textLocale = this.f1649a.getTextLocales();
            } else {
                sb = new StringBuilder();
                sb.append(", textLocale=");
                textLocale = this.f1649a.getTextLocale();
            }
            sb.append(textLocale);
            sb2.append(sb.toString());
            sb2.append(", typeface=" + this.f1649a.getTypeface());
            if (i10 >= 26) {
                sb2.append(", variationSettings=" + this.f1649a.getFontVariationSettings());
            }
            sb2.append(", textDir=" + this.f1650b);
            sb2.append(", breakStrategy=" + this.f1651c);
            sb2.append(", hyphenationFrequency=" + this.f1652d);
            sb2.append("}");
            return sb2.toString();
        }
    }

    public a a() {
        return this.f1647n;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f1646m;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    public char charAt(int i10) {
        return this.f1646m.charAt(i10);
    }

    public int getSpanEnd(Object obj) {
        return this.f1646m.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f1646m.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f1646m.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? this.f1648o.getSpans(i10, i11, cls) : this.f1646m.getSpans(i10, i11, cls);
    }

    public int length() {
        return this.f1646m.length();
    }

    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f1646m.nextSpanTransition(i10, i11, cls);
    }

    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f1648o.removeSpan(obj);
        } else {
            this.f1646m.removeSpan(obj);
        }
    }

    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f1648o.setSpan(obj, i10, i11, i12);
        } else {
            this.f1646m.setSpan(obj, i10, i11, i12);
        }
    }

    public CharSequence subSequence(int i10, int i11) {
        return this.f1646m.subSequence(i10, i11);
    }

    public String toString() {
        return this.f1646m.toString();
    }
}
