package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import androidx.appcompat.app.h;
import androidx.appcompat.widget.f;
import com.google.android.material.button.a;

@Keep
public class MaterialComponentsViewInflater extends h {
    /* access modifiers changed from: protected */
    public f createButton(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }
}
