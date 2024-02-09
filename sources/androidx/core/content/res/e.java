package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import r.i;

public class e {

    static class a {
        static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    public interface b {
    }

    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        private final d[] f1411a;

        public c(d[] dVarArr) {
            this.f1411a = dVarArr;
        }

        public d[] a() {
            return this.f1411a;
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f1412a;

        /* renamed from: b  reason: collision with root package name */
        private final int f1413b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f1414c;

        /* renamed from: d  reason: collision with root package name */
        private final String f1415d;

        /* renamed from: e  reason: collision with root package name */
        private final int f1416e;

        /* renamed from: f  reason: collision with root package name */
        private final int f1417f;

        public d(String str, int i10, boolean z9, String str2, int i11, int i12) {
            this.f1412a = str;
            this.f1413b = i10;
            this.f1414c = z9;
            this.f1415d = str2;
            this.f1416e = i11;
            this.f1417f = i12;
        }

        public String a() {
            return this.f1412a;
        }

        public int b() {
            return this.f1417f;
        }

        public int c() {
            return this.f1416e;
        }

        public String d() {
            return this.f1415d;
        }

        public int e() {
            return this.f1413b;
        }

        public boolean f() {
            return this.f1414c;
        }
    }

    /* renamed from: androidx.core.content.res.e$e  reason: collision with other inner class name */
    public static final class C0022e implements b {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.core.provider.e f1418a;

        /* renamed from: b  reason: collision with root package name */
        private final int f1419b;

        /* renamed from: c  reason: collision with root package name */
        private final int f1420c;

        /* renamed from: d  reason: collision with root package name */
        private final String f1421d;

        public C0022e(androidx.core.provider.e eVar, int i10, int i11, String str) {
            this.f1418a = eVar;
            this.f1420c = i10;
            this.f1419b = i11;
            this.f1421d = str;
        }

        public int a() {
            return this.f1420c;
        }

        public androidx.core.provider.e b() {
            return this.f1418a;
        }

        public String c() {
            return this.f1421d;
        }

        public int d() {
            return this.f1419b;
        }
    }

    private static int a(TypedArray typedArray, int i10) {
        return a.a(typedArray, i10);
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public static androidx.core.content.res.e.b b(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) {
        /*
        L_0x0000:
            int r0 = r3.next()
            r1 = 2
            if (r0 == r1) goto L_0x000b
            r2 = 1
            if (r0 == r2) goto L_0x000b
            goto L_0x0000
        L_0x000b:
            if (r0 != r1) goto L_0x0012
            androidx.core.content.res.e$b r3 = d(r3, r4)
            return r3
        L_0x0012:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.e.b(org.xmlpull.v1.XmlPullParser, android.content.res.Resources):androidx.core.content.res.e$b");
    }

    public static List<List<byte[]>> c(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < obtainTypedArray.length(); i11++) {
                    int resourceId = obtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i10)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static b d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, (String) null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), i.f12034h);
        String string = obtainAttributes.getString(i.f12035i);
        String string2 = obtainAttributes.getString(i.f12039m);
        String string3 = obtainAttributes.getString(i.f12040n);
        int resourceId = obtainAttributes.getResourceId(i.f12036j, 0);
        int integer = obtainAttributes.getInteger(i.f12037k, 1);
        int integer2 = obtainAttributes.getInteger(i.f12038l, 500);
        String string4 = obtainAttributes.getString(i.f12041o);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(f(xmlPullParser, resources));
                    } else {
                        g(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new c((d[]) arrayList.toArray(new d[0]));
        }
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new C0022e(new androidx.core.provider.e(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
    }

    private static d f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), i.f12042p);
        int i10 = i.f12051y;
        if (!obtainAttributes.hasValue(i10)) {
            i10 = i.f12044r;
        }
        int i11 = obtainAttributes.getInt(i10, 400);
        int i12 = i.f12049w;
        if (!obtainAttributes.hasValue(i12)) {
            i12 = i.f12045s;
        }
        boolean z9 = 1 == obtainAttributes.getInt(i12, 0);
        int i13 = i.f12052z;
        if (!obtainAttributes.hasValue(i13)) {
            i13 = i.f12046t;
        }
        int i14 = i.f12050x;
        if (!obtainAttributes.hasValue(i14)) {
            i14 = i.f12047u;
        }
        String string = obtainAttributes.getString(i14);
        int i15 = obtainAttributes.getInt(i13, 0);
        int i16 = i.f12048v;
        if (!obtainAttributes.hasValue(i16)) {
            i16 = i.f12043q;
        }
        int resourceId = obtainAttributes.getResourceId(i16, 0);
        String string2 = obtainAttributes.getString(i16);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i11, z9, string, i15, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }
}
