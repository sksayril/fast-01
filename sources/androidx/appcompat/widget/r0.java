package androidx.appcompat.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.core.content.res.h;
import i.a;
import java.io.InputStream;

class r0 extends Resources {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f1033a;

    public r0(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1033a = resources;
    }

    /* access modifiers changed from: package-private */
    public final Drawable a(int i10) {
        return super.getDrawable(i10);
    }

    public XmlResourceParser getAnimation(int i10) {
        return this.f1033a.getAnimation(i10);
    }

    public boolean getBoolean(int i10) {
        return this.f1033a.getBoolean(i10);
    }

    public int getColor(int i10) {
        return this.f1033a.getColor(i10);
    }

    public ColorStateList getColorStateList(int i10) {
        return this.f1033a.getColorStateList(i10);
    }

    public Configuration getConfiguration() {
        return this.f1033a.getConfiguration();
    }

    public float getDimension(int i10) {
        return this.f1033a.getDimension(i10);
    }

    public int getDimensionPixelOffset(int i10) {
        return this.f1033a.getDimensionPixelOffset(i10);
    }

    public int getDimensionPixelSize(int i10) {
        return this.f1033a.getDimensionPixelSize(i10);
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.f1033a.getDisplayMetrics();
    }

    public Drawable getDrawable(int i10, Resources.Theme theme) {
        return h.d(this.f1033a, i10, theme);
    }

    public Drawable getDrawableForDensity(int i10, int i11) {
        return h.e(this.f1033a, i10, i11, (Resources.Theme) null);
    }

    public Drawable getDrawableForDensity(int i10, int i11, Resources.Theme theme) {
        return h.e(this.f1033a, i10, i11, theme);
    }

    public float getFraction(int i10, int i11, int i12) {
        return this.f1033a.getFraction(i10, i11, i12);
    }

    public int getIdentifier(String str, String str2, String str3) {
        return this.f1033a.getIdentifier(str, str2, str3);
    }

    public int[] getIntArray(int i10) {
        return this.f1033a.getIntArray(i10);
    }

    public int getInteger(int i10) {
        return this.f1033a.getInteger(i10);
    }

    public XmlResourceParser getLayout(int i10) {
        return this.f1033a.getLayout(i10);
    }

    public Movie getMovie(int i10) {
        return this.f1033a.getMovie(i10);
    }

    public String getQuantityString(int i10, int i11) {
        return this.f1033a.getQuantityString(i10, i11);
    }

    public String getQuantityString(int i10, int i11, Object... objArr) {
        return this.f1033a.getQuantityString(i10, i11, objArr);
    }

    public CharSequence getQuantityText(int i10, int i11) {
        return this.f1033a.getQuantityText(i10, i11);
    }

    public String getResourceEntryName(int i10) {
        return this.f1033a.getResourceEntryName(i10);
    }

    public String getResourceName(int i10) {
        return this.f1033a.getResourceName(i10);
    }

    public String getResourcePackageName(int i10) {
        return this.f1033a.getResourcePackageName(i10);
    }

    public String getResourceTypeName(int i10) {
        return this.f1033a.getResourceTypeName(i10);
    }

    public String getString(int i10) {
        return this.f1033a.getString(i10);
    }

    public String getString(int i10, Object... objArr) {
        return this.f1033a.getString(i10, objArr);
    }

    public String[] getStringArray(int i10) {
        return this.f1033a.getStringArray(i10);
    }

    public CharSequence getText(int i10) {
        return this.f1033a.getText(i10);
    }

    public CharSequence getText(int i10, CharSequence charSequence) {
        return this.f1033a.getText(i10, charSequence);
    }

    public CharSequence[] getTextArray(int i10) {
        return this.f1033a.getTextArray(i10);
    }

    public void getValue(int i10, TypedValue typedValue, boolean z9) {
        this.f1033a.getValue(i10, typedValue, z9);
    }

    public void getValue(String str, TypedValue typedValue, boolean z9) {
        this.f1033a.getValue(str, typedValue, z9);
    }

    public void getValueForDensity(int i10, int i11, TypedValue typedValue, boolean z9) {
        a.a(this.f1033a, i10, i11, typedValue, z9);
    }

    public XmlResourceParser getXml(int i10) {
        return this.f1033a.getXml(i10);
    }

    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f1033a.obtainAttributes(attributeSet, iArr);
    }

    public TypedArray obtainTypedArray(int i10) {
        return this.f1033a.obtainTypedArray(i10);
    }

    public InputStream openRawResource(int i10) {
        return this.f1033a.openRawResource(i10);
    }

    public InputStream openRawResource(int i10, TypedValue typedValue) {
        return this.f1033a.openRawResource(i10, typedValue);
    }

    public AssetFileDescriptor openRawResourceFd(int i10) {
        return this.f1033a.openRawResourceFd(i10);
    }

    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.f1033a.parseBundleExtra(str, attributeSet, bundle);
    }

    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.f1033a.parseBundleExtras(xmlResourceParser, bundle);
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f1033a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }
}
