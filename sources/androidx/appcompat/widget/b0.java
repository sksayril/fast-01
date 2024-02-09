package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.util.h;

final class b0 {

    /* renamed from: a  reason: collision with root package name */
    private TextView f791a;

    /* renamed from: b  reason: collision with root package name */
    private TextClassifier f792b;

    b0(TextView textView) {
        this.f791a = (TextView) h.j(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f792b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f791a.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    public void b(TextClassifier textClassifier) {
        this.f792b = textClassifier;
    }
}
