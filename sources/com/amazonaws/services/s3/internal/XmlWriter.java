package com.amazonaws.services.s3.internal;

import com.amazonaws.util.StringUtils;
import java.util.ArrayList;
import java.util.List;

public class XmlWriter {

    /* renamed from: a  reason: collision with root package name */
    List<String> f4315a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    StringBuilder f4316b = new StringBuilder();

    private void a(String str, StringBuilder sb) {
        if (str == null) {
            str = "";
        }
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            String str2 = charAt != 9 ? charAt != 10 ? charAt != 13 ? charAt != '\"' ? charAt != '&' ? charAt != '<' ? charAt != '>' ? null : "&gt;" : "&lt;" : "&amp;" : "&quot;" : "&#13;" : "&#10;" : "&#9;";
            if (str2 != null) {
                if (i11 < i10) {
                    sb.append(str, i11, i10);
                }
                this.f4316b.append(str2);
                i11 = i10 + 1;
            }
            i10++;
        }
        if (i11 < i10) {
            this.f4316b.append(str, i11, i10);
        }
    }

    public XmlWriter b() {
        List<String> list = this.f4315a;
        StringBuilder sb = this.f4316b;
        sb.append("</");
        sb.append(list.remove(list.size() - 1));
        sb.append(">");
        return this;
    }

    public byte[] c() {
        return toString().getBytes(StringUtils.f4756a);
    }

    public XmlWriter d(String str) {
        StringBuilder sb = this.f4316b;
        sb.append("<");
        sb.append(str);
        sb.append(">");
        this.f4315a.add(str);
        return this;
    }

    public XmlWriter e(String str) {
        a(str, this.f4316b);
        return this;
    }

    public String toString() {
        return this.f4316b.toString();
    }
}
