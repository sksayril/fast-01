package k1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import k7.k;
import kotlin.jvm.internal.l;

public final class e extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final String f10928a = "SpeechToTextPlugin";

    /* renamed from: b  reason: collision with root package name */
    private final k.d f10929b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f10930c;

    /* renamed from: d  reason: collision with root package name */
    private List<String> f10931d;

    /* renamed from: e  reason: collision with root package name */
    private String f10932e;

    public e(k.d dVar, boolean z9) {
        l.e(dVar, "flutterResult");
        this.f10929b = dVar;
        this.f10930c = z9;
    }

    private final String a(Locale locale) {
        String displayName = locale.getDisplayName();
        l.d(displayName, "getDisplayName(...)");
        String o10 = o.o(displayName, ':', ' ', false, 4, (Object) null);
        return locale.getLanguage() + '_' + locale.getCountry() + ':' + o10;
    }

    private final void b(List<String> list) {
        Locale locale = Locale.getDefault();
        ArrayList arrayList = new ArrayList();
        l.b(locale);
        arrayList.add(a(locale));
        if (list != null) {
            for (String next : list) {
                if (!l.a(locale.toLanguageTag(), next)) {
                    Locale forLanguageTag = Locale.forLanguageTag(next);
                    l.b(forLanguageTag);
                    arrayList.add(a(forLanguageTag));
                }
            }
        }
        this.f10929b.a(arrayList);
    }

    private final void c(String str) {
        if (this.f10930c) {
            Log.d(this.f10928a, str);
        }
    }

    public void onReceive(Context context, Intent intent) {
        ArrayList<String> arrayList;
        l.e(context, "context");
        l.e(intent, "intent");
        c("Received extra language broadcast");
        Bundle resultExtras = getResultExtras(true);
        if (resultExtras.containsKey("android.speech.extra.LANGUAGE_PREFERENCE")) {
            this.f10932e = resultExtras.getString("android.speech.extra.LANGUAGE_PREFERENCE");
        }
        if (resultExtras.containsKey("android.speech.extra.SUPPORTED_LANGUAGES")) {
            c("Extra supported languages");
            arrayList = resultExtras.getStringArrayList("android.speech.extra.SUPPORTED_LANGUAGES");
            this.f10931d = arrayList;
        } else {
            c("No extra supported languages");
            arrayList = new ArrayList<>();
        }
        b(arrayList);
    }
}
