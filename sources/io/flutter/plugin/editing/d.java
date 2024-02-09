package io.flutter.plugin.editing;

import android.os.Bundle;
import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import io.flutter.embedding.engine.systemchannels.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import k7.k;
import l7.a;

public class d implements o.b, SpellCheckerSession.SpellCheckerSessionListener {

    /* renamed from: a  reason: collision with root package name */
    private final o f10024a;

    /* renamed from: b  reason: collision with root package name */
    private final TextServicesManager f10025b;

    /* renamed from: c  reason: collision with root package name */
    private SpellCheckerSession f10026c;

    /* renamed from: d  reason: collision with root package name */
    k.d f10027d;

    public d(TextServicesManager textServicesManager, o oVar) {
        this.f10025b = textServicesManager;
        this.f10024a = oVar;
        oVar.b(this);
    }

    public void a(String str, String str2, k.d dVar) {
        if (this.f10027d != null) {
            dVar.b("error", "Previous spell check request still pending.", (Object) null);
            return;
        }
        this.f10027d = dVar;
        c(str, str2);
    }

    public void b() {
        this.f10024a.b((o.b) null);
        SpellCheckerSession spellCheckerSession = this.f10026c;
        if (spellCheckerSession != null) {
            spellCheckerSession.close();
        }
    }

    public void c(String str, String str2) {
        Locale b10 = a.b(str);
        if (this.f10026c == null) {
            this.f10026c = this.f10025b.newSpellCheckerSession((Bundle) null, b10, this, true);
        }
        this.f10026c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    public void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        ArrayList arrayList;
        k.d dVar;
        if (sentenceSuggestionsInfoArr.length == 0) {
            dVar = this.f10027d;
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList();
            SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
            if (sentenceSuggestionsInfo == null) {
                dVar = this.f10027d;
                arrayList = new ArrayList();
            } else {
                for (int i10 = 0; i10 < sentenceSuggestionsInfo.getSuggestionsCount(); i10++) {
                    SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i10);
                    int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
                    if (suggestionsCount > 0) {
                        HashMap hashMap = new HashMap();
                        int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i10);
                        int lengthAt = sentenceSuggestionsInfo.getLengthAt(i10) + offsetAt;
                        hashMap.put("startIndex", Integer.valueOf(offsetAt));
                        hashMap.put("endIndex", Integer.valueOf(lengthAt));
                        ArrayList arrayList2 = new ArrayList();
                        boolean z9 = false;
                        for (int i11 = 0; i11 < suggestionsCount; i11++) {
                            String suggestionAt = suggestionsInfoAt.getSuggestionAt(i11);
                            if (!suggestionAt.equals("")) {
                                arrayList2.add(suggestionAt);
                                z9 = true;
                            }
                        }
                        if (z9) {
                            hashMap.put("suggestions", arrayList2);
                            arrayList.add(hashMap);
                        }
                    }
                }
                dVar = this.f10027d;
            }
        }
        dVar.a(arrayList);
        this.f10027d = null;
    }

    public void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
