package com.amazonaws.services.s3.model.transform;

import java.util.Iterator;
import java.util.LinkedList;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

abstract class AbstractHandler extends DefaultHandler {

    /* renamed from: m  reason: collision with root package name */
    private final StringBuilder f4608m = new StringBuilder();

    /* renamed from: n  reason: collision with root package name */
    private final LinkedList<String> f4609n = new LinkedList<>();

    AbstractHandler() {
    }

    /* access modifiers changed from: protected */
    public final boolean c() {
        return this.f4609n.isEmpty();
    }

    public final void characters(char[] cArr, int i10, int i11) {
        this.f4608m.append(cArr, i10, i11);
    }

    public final void endElement(String str, String str2, String str3) {
        this.f4609n.removeLast();
        g(str, str2, str3);
    }

    /* access modifiers changed from: protected */
    public abstract void g(String str, String str2, String str3);

    /* access modifiers changed from: protected */
    public abstract void h(String str, String str2, String str3, Attributes attributes);

    /* access modifiers changed from: protected */
    public final String i() {
        return this.f4608m.toString();
    }

    /* access modifiers changed from: protected */
    public final boolean j(String... strArr) {
        if (strArr.length != this.f4609n.size()) {
            return false;
        }
        Iterator it = this.f4609n.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            String str2 = strArr[i10];
            if (!str2.equals("*") && !str2.equals(str)) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        this.f4608m.setLength(0);
        h(str, str2, str3, attributes);
        this.f4609n.add(str2);
    }
}
