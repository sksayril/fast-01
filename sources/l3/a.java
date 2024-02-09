package l3;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.StateSet;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f11131a = true;

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f11132b = {16842919};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f11133c = {16843623, 16842908};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f11134d = {16842908};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f11135e = {16843623};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f11136f = {16842913, 16842919};

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f11137g = {16842913, 16843623, 16842908};

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f11138h = {16842913, 16842908};

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f11139i = {16842913, 16843623};

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f11140j = {16842913};

    public static ColorStateList a(ColorStateList colorStateList) {
        if (f11131a) {
            return new ColorStateList(new int[][]{f11140j, StateSet.NOTHING}, new int[]{c(colorStateList, f11136f), c(colorStateList, f11132b)});
        }
        int[] iArr = f11136f;
        int[] iArr2 = f11137g;
        int[] iArr3 = f11138h;
        int[] iArr4 = f11139i;
        int[] iArr5 = f11132b;
        int[] iArr6 = f11133c;
        int[] iArr7 = f11134d;
        int[] iArr8 = f11135e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f11140j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{c(colorStateList, iArr), c(colorStateList, iArr2), c(colorStateList, iArr3), c(colorStateList, iArr4), 0, c(colorStateList, iArr5), c(colorStateList, iArr6), c(colorStateList, iArr7), c(colorStateList, iArr8), 0});
    }

    @TargetApi(21)
    private static int b(int i10) {
        return androidx.core.graphics.a.f(i10, Math.min(Color.alpha(i10) * 2, 255));
    }

    private static int c(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f11131a ? b(colorForState) : colorForState;
    }
}
