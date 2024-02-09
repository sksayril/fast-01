package io.flutter.plugin.editing;

import org.json.JSONException;
import org.json.JSONObject;
import x6.b;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private CharSequence f10028a;

    /* renamed from: b  reason: collision with root package name */
    private CharSequence f10029b;

    /* renamed from: c  reason: collision with root package name */
    private int f10030c;

    /* renamed from: d  reason: collision with root package name */
    private int f10031d;

    /* renamed from: e  reason: collision with root package name */
    private int f10032e;

    /* renamed from: f  reason: collision with root package name */
    private int f10033f;

    /* renamed from: g  reason: collision with root package name */
    private int f10034g;

    /* renamed from: h  reason: collision with root package name */
    private int f10035h;

    public e(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        this.f10032e = i10;
        this.f10033f = i11;
        this.f10034g = i12;
        this.f10035h = i13;
        a(charSequence, "", -1, -1);
    }

    public e(CharSequence charSequence, int i10, int i11, CharSequence charSequence2, int i12, int i13, int i14, int i15) {
        this.f10032e = i12;
        this.f10033f = i13;
        this.f10034g = i14;
        this.f10035h = i15;
        a(charSequence, charSequence2.toString(), i10, i11);
    }

    private void a(CharSequence charSequence, CharSequence charSequence2, int i10, int i11) {
        this.f10028a = charSequence;
        this.f10029b = charSequence2;
        this.f10030c = i10;
        this.f10031d = i11;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oldText", this.f10028a.toString());
            jSONObject.put("deltaText", this.f10029b.toString());
            jSONObject.put("deltaStart", this.f10030c);
            jSONObject.put("deltaEnd", this.f10031d);
            jSONObject.put("selectionBase", this.f10032e);
            jSONObject.put("selectionExtent", this.f10033f);
            jSONObject.put("composingBase", this.f10034g);
            jSONObject.put("composingExtent", this.f10035h);
        } catch (JSONException e10) {
            b.b("TextEditingDelta", "unable to create JSONObject: " + e10);
        }
        return jSONObject;
    }
}
