package io.flutter.plugins.googlemaps;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import z2.a;
import z2.b;
import z2.y;

class e {
    private static Float A(Object obj) {
        if (obj == null) {
            return null;
        }
        return Float.valueOf(z(obj));
    }

    private static float B(Object obj, float f10) {
        return z(obj) * f10;
    }

    private static List<List<LatLng>> C(Object obj) {
        List<?> G = G(obj);
        ArrayList arrayList = new ArrayList(G.size());
        for (Object N : G) {
            arrayList.add(N(N));
        }
        return arrayList;
    }

    private static int D(Object obj) {
        return ((Number) obj).intValue();
    }

    static LatLng E(Object obj) {
        List<?> G = G(obj);
        return new LatLng(y(G.get(0)), y(G.get(1)));
    }

    private static LatLngBounds F(Object obj) {
        if (obj == null) {
            return null;
        }
        List<?> G = G(obj);
        return new LatLngBounds(E(G.get(0)), E(G.get(1)));
    }

    private static List<?> G(Object obj) {
        return (List) obj;
    }

    private static Map<?, ?> H(Object obj) {
        return (Map) obj;
    }

    private static Map<String, Object> I(Object obj) {
        HashMap hashMap = new HashMap();
        Map map = (Map) obj;
        for (Object next : map.keySet()) {
            Object obj2 = map.get(next);
            if (obj2 != null) {
                hashMap.put((String) next, obj2);
            }
        }
        return hashMap;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        if (r3.equals("dot") == false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<z2.n> J(java.lang.Object r7) {
        /*
            java.util.List r7 = G(r7)
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x000c
            r7 = 0
            return r7
        L_0x000c:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.size()
            r0.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
        L_0x0019:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x00a5
            java.lang.Object r1 = r7.next()
            java.util.List r1 = G(r1)
            r2 = 0
            java.lang.Object r3 = r1.get(r2)
            java.lang.String r3 = O(r3)
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            r6 = 1
            switch(r5) {
                case 99657: goto L_0x0054;
                case 102102: goto L_0x0049;
                case 3075986: goto L_0x003e;
                default: goto L_0x003c;
            }
        L_0x003c:
            r2 = -1
            goto L_0x005d
        L_0x003e:
            java.lang.String r2 = "dash"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0047
            goto L_0x003c
        L_0x0047:
            r2 = 2
            goto L_0x005d
        L_0x0049:
            java.lang.String r2 = "gap"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0052
            goto L_0x003c
        L_0x0052:
            r2 = 1
            goto L_0x005d
        L_0x0054:
            java.lang.String r5 = "dot"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x005d
            goto L_0x003c
        L_0x005d:
            switch(r2) {
                case 0: goto L_0x009b;
                case 1: goto L_0x008d;
                case 2: goto L_0x007c;
                default: goto L_0x0060;
            }
        L_0x0060:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot interpret "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " as PatternItem"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r7.<init>(r0)
            throw r7
        L_0x007c:
            z2.h r2 = new z2.h
            java.lang.Object r1 = r1.get(r6)
            float r1 = z(r1)
            r2.<init>(r1)
        L_0x0089:
            r0.add(r2)
            goto L_0x0019
        L_0x008d:
            z2.j r2 = new z2.j
            java.lang.Object r1 = r1.get(r6)
            float r1 = z(r1)
            r2.<init>(r1)
            goto L_0x0089
        L_0x009b:
            z2.i r1 = new z2.i
            r1.<init>()
            r0.add(r1)
            goto L_0x0019
        L_0x00a5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.googlemaps.e.J(java.lang.Object):java.util.List");
    }

    private static int K(Object obj, float f10) {
        return (int) B(obj, f10);
    }

    static Point L(Object obj) {
        return new Point(((Integer) H(obj).get("x")).intValue(), ((Integer) H(obj).get("y")).intValue());
    }

    private static Point M(Object obj, float f10) {
        List<?> G = G(obj);
        return new Point(K(G.get(0), f10), K(G.get(1), f10));
    }

    static List<LatLng> N(Object obj) {
        List<?> G = G(obj);
        ArrayList arrayList = new ArrayList(G.size());
        for (Object G2 : G) {
            List<?> G3 = G(G2);
            arrayList.add(new LatLng(y(G3.get(0)), y(G3.get(1))));
        }
        return arrayList;
    }

    private static String O(Object obj) {
        return (String) obj;
    }

    static Object a(CameraPosition cameraPosition) {
        if (cameraPosition == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bearing", Float.valueOf(cameraPosition.f5813p));
        hashMap.put("target", l(cameraPosition.f5810m));
        hashMap.put("tilt", Float.valueOf(cameraPosition.f5812o));
        hashMap.put("zoom", Float.valueOf(cameraPosition.f5811n));
        return hashMap;
    }

    static Object b(String str) {
        if (str == null) {
            return null;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("circleId", str);
        return hashMap;
    }

    private static a c(List<?> list) {
        if (list.size() == 2) {
            try {
                return b.d(s(list.get(1)));
            } catch (Exception e10) {
                throw new IllegalArgumentException("Unable to interpret bytes as a valid image.", e10);
            }
        } else {
            throw new IllegalArgumentException("fromBytes should have exactly one argument, interpretTileOverlayOptions the bytes. Got: " + list.size());
        }
    }

    static String d(Object obj, c cVar) {
        Map<?, ?> H = H(obj);
        Object obj2 = H.get("consumeTapEvents");
        if (obj2 != null) {
            cVar.b(u(obj2));
        }
        Object obj3 = H.get("fillColor");
        if (obj3 != null) {
            cVar.e(D(obj3));
        }
        Object obj4 = H.get("strokeColor");
        if (obj4 != null) {
            cVar.c(D(obj4));
        }
        Object obj5 = H.get("visible");
        if (obj5 != null) {
            cVar.setVisible(u(obj5));
        }
        Object obj6 = H.get("strokeWidth");
        if (obj6 != null) {
            cVar.f((float) D(obj6));
        }
        Object obj7 = H.get("zIndex");
        if (obj7 != null) {
            cVar.a(z(obj7));
        }
        Object obj8 = H.get("center");
        if (obj8 != null) {
            cVar.h(E(obj8));
        }
        Object obj9 = H.get("radius");
        if (obj9 != null) {
            cVar.g(y(obj9));
        }
        String str = (String) H.get("circleId");
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("circleId was null");
    }

    static void e(Object obj, m mVar) {
        Map<?, ?> H = H(obj);
        Object obj2 = H.get("cameraTargetBounds");
        if (obj2 != null) {
            mVar.Z(F(G(obj2).get(0)));
        }
        Object obj3 = H.get("compassEnabled");
        if (obj3 != null) {
            mVar.z(u(obj3));
        }
        Object obj4 = H.get("mapToolbarEnabled");
        if (obj4 != null) {
            mVar.A(u(obj4));
        }
        Object obj5 = H.get("mapType");
        if (obj5 != null) {
            mVar.t(D(obj5));
        }
        Object obj6 = H.get("minMaxZoomPreference");
        if (obj6 != null) {
            List<?> G = G(obj6);
            mVar.a0(A(G.get(0)), A(G.get(1)));
        }
        Object obj7 = H.get("padding");
        if (obj7 != null) {
            List<?> G2 = G(obj7);
            mVar.W(z(G2.get(0)), z(G2.get(1)), z(G2.get(2)), z(G2.get(3)));
        }
        Object obj8 = H.get("rotateGesturesEnabled");
        if (obj8 != null) {
            mVar.V(u(obj8));
        }
        Object obj9 = H.get("scrollGesturesEnabled");
        if (obj9 != null) {
            mVar.H(u(obj9));
        }
        Object obj10 = H.get("tiltGesturesEnabled");
        if (obj10 != null) {
            mVar.L(u(obj10));
        }
        Object obj11 = H.get("trackCameraPosition");
        if (obj11 != null) {
            mVar.X(u(obj11));
        }
        Object obj12 = H.get("zoomGesturesEnabled");
        if (obj12 != null) {
            mVar.N(u(obj12));
        }
        Object obj13 = H.get("liteModeEnabled");
        if (obj13 != null) {
            mVar.Y(u(obj13));
        }
        Object obj14 = H.get("myLocationEnabled");
        if (obj14 != null) {
            mVar.M(u(obj14));
        }
        Object obj15 = H.get("zoomControlsEnabled");
        if (obj15 != null) {
            mVar.Q(u(obj15));
        }
        Object obj16 = H.get("myLocationButtonEnabled");
        if (obj16 != null) {
            mVar.y(u(obj16));
        }
        Object obj17 = H.get("indoorEnabled");
        if (obj17 != null) {
            mVar.x(u(obj17));
        }
        Object obj18 = H.get("trafficEnabled");
        if (obj18 != null) {
            mVar.R(u(obj18));
        }
        Object obj19 = H.get("buildingsEnabled");
        if (obj19 != null) {
            mVar.u(u(obj19));
        }
    }

    private static void f(r rVar, Map<String, Object> map) {
        String str = (String) map.get("title");
        String str2 = (String) map.get("snippet");
        if (str != null) {
            rVar.k(str, str2);
        }
        Object obj = map.get("anchor");
        if (obj != null) {
            List<?> G = G(obj);
            rVar.f(z(G.get(0)), z(G.get(1)));
        }
    }

    static String g(Object obj, r rVar) {
        Map<?, ?> H = H(obj);
        Object obj2 = H.get("alpha");
        if (obj2 != null) {
            rVar.c(z(obj2));
        }
        Object obj3 = H.get("anchor");
        if (obj3 != null) {
            List<?> G = G(obj3);
            rVar.h(z(G.get(0)), z(G.get(1)));
        }
        Object obj4 = H.get("consumeTapEvents");
        if (obj4 != null) {
            rVar.b(u(obj4));
        }
        Object obj5 = H.get("draggable");
        if (obj5 != null) {
            rVar.d(u(obj5));
        }
        Object obj6 = H.get("flat");
        if (obj6 != null) {
            rVar.e(u(obj6));
        }
        Object obj7 = H.get("icon");
        if (obj7 != null) {
            rVar.j(t(obj7));
        }
        Object obj8 = H.get("infoWindow");
        if (obj8 != null) {
            f(rVar, I(obj8));
        }
        Object obj9 = H.get("position");
        if (obj9 != null) {
            rVar.i(E(obj9));
        }
        Object obj10 = H.get("rotation");
        if (obj10 != null) {
            rVar.g(z(obj10));
        }
        Object obj11 = H.get("visible");
        if (obj11 != null) {
            rVar.setVisible(u(obj11));
        }
        Object obj12 = H.get("zIndex");
        if (obj12 != null) {
            rVar.a(z(obj12));
        }
        String str = (String) H.get("markerId");
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("markerId was null");
    }

    static String h(Object obj, v vVar) {
        Map<?, ?> H = H(obj);
        Object obj2 = H.get("consumeTapEvents");
        if (obj2 != null) {
            vVar.b(u(obj2));
        }
        Object obj3 = H.get("geodesic");
        if (obj3 != null) {
            vVar.d(u(obj3));
        }
        Object obj4 = H.get("visible");
        if (obj4 != null) {
            vVar.setVisible(u(obj4));
        }
        Object obj5 = H.get("fillColor");
        if (obj5 != null) {
            vVar.e(D(obj5));
        }
        Object obj6 = H.get("strokeColor");
        if (obj6 != null) {
            vVar.c(D(obj6));
        }
        Object obj7 = H.get("strokeWidth");
        if (obj7 != null) {
            vVar.f((float) D(obj7));
        }
        Object obj8 = H.get("zIndex");
        if (obj8 != null) {
            vVar.a(z(obj8));
        }
        Object obj9 = H.get("points");
        if (obj9 != null) {
            vVar.g(N(obj9));
        }
        Object obj10 = H.get("holes");
        if (obj10 != null) {
            vVar.h(C(obj10));
        }
        String str = (String) H.get("polygonId");
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("polygonId was null");
    }

    static String i(Object obj, z zVar) {
        Map<?, ?> H = H(obj);
        Object obj2 = H.get("consumeTapEvents");
        if (obj2 != null) {
            zVar.b(u(obj2));
        }
        Object obj3 = H.get("color");
        if (obj3 != null) {
            zVar.i(D(obj3));
        }
        Object obj4 = H.get("endCap");
        if (obj4 != null) {
            zVar.h(x(obj4));
        }
        Object obj5 = H.get("geodesic");
        if (obj5 != null) {
            zVar.d(u(obj5));
        }
        Object obj6 = H.get("jointType");
        if (obj6 != null) {
            zVar.e(D(obj6));
        }
        Object obj7 = H.get("startCap");
        if (obj7 != null) {
            zVar.j(x(obj7));
        }
        Object obj8 = H.get("visible");
        if (obj8 != null) {
            zVar.setVisible(u(obj8));
        }
        Object obj9 = H.get("width");
        if (obj9 != null) {
            zVar.f((float) D(obj9));
        }
        Object obj10 = H.get("zIndex");
        if (obj10 != null) {
            zVar.a(z(obj10));
        }
        Object obj11 = H.get("points");
        if (obj11 != null) {
            zVar.g(N(obj11));
        }
        Object obj12 = H.get("pattern");
        if (obj12 != null) {
            zVar.c(J(obj12));
        }
        String str = (String) H.get("polylineId");
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("polylineId was null");
    }

    static y j(Map<String, ?> map) {
        return new y(D(map.get("width")), D(map.get("height")), map.get("data") != null ? (byte[]) map.get("data") : null);
    }

    static String k(Map<String, ?> map, d0 d0Var) {
        Object obj = map.get("fadeIn");
        if (obj != null) {
            d0Var.b(u(obj));
        }
        Object obj2 = map.get("transparency");
        if (obj2 != null) {
            d0Var.c(z(obj2));
        }
        Object obj3 = map.get("zIndex");
        if (obj3 != null) {
            d0Var.a(z(obj3));
        }
        Object obj4 = map.get("visible");
        if (obj4 != null) {
            d0Var.setVisible(u(obj4));
        }
        String str = (String) map.get("tileOverlayId");
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("tileOverlayId was null");
    }

    static Object l(LatLng latLng) {
        return Arrays.asList(new Double[]{Double.valueOf(latLng.f5818m), Double.valueOf(latLng.f5819n)});
    }

    static Object m(LatLngBounds latLngBounds) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("southwest", l(latLngBounds.f5820m));
        hashMap.put("northeast", l(latLngBounds.f5821n));
        return hashMap;
    }

    static Object n(String str) {
        if (str == null) {
            return null;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("markerId", str);
        return hashMap;
    }

    static Map<String, Integer> o(Point point) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("x", Integer.valueOf(point.x));
        hashMap.put("y", Integer.valueOf(point.y));
        return hashMap;
    }

    static Object p(String str) {
        if (str == null) {
            return null;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("polygonId", str);
        return hashMap;
    }

    static Object q(String str) {
        if (str == null) {
            return null;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("polylineId", str);
        return hashMap;
    }

    static Map<String, Object> r(String str, int i10, int i11, int i12) {
        if (str == null) {
            return null;
        }
        HashMap hashMap = new HashMap(4);
        hashMap.put("tileOverlayId", str);
        hashMap.put("x", Integer.valueOf(i10));
        hashMap.put("y", Integer.valueOf(i11));
        hashMap.put("zoom", Integer.valueOf(i12));
        return hashMap;
    }

    private static Bitmap s(Object obj) {
        byte[] bArr = (byte[]) obj;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        if (decodeByteArray != null) {
            return decodeByteArray;
        }
        throw new IllegalArgumentException("Unable to decode bytes as a valid bitmap.");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        if (r2.equals("fromAssetImage") == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static z2.a t(java.lang.Object r8) {
        /*
            java.util.List r0 = G(r8)
            r1 = 0
            java.lang.Object r2 = r0.get(r1)
            java.lang.String r2 = O(r2)
            r2.hashCode()
            int r3 = r2.hashCode()
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = -1
            switch(r3) {
                case -458749035: goto L_0x003e;
                case 52960614: goto L_0x0033;
                case 54063841: goto L_0x0028;
                case 784458203: goto L_0x001d;
                default: goto L_0x001b;
            }
        L_0x001b:
            r1 = -1
            goto L_0x0047
        L_0x001d:
            java.lang.String r1 = "defaultMarker"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0026
            goto L_0x001b
        L_0x0026:
            r1 = 3
            goto L_0x0047
        L_0x0028:
            java.lang.String r1 = "fromBytes"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0031
            goto L_0x001b
        L_0x0031:
            r1 = 2
            goto L_0x0047
        L_0x0033:
            java.lang.String r1 = "fromAsset"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x003c
            goto L_0x001b
        L_0x003c:
            r1 = 1
            goto L_0x0047
        L_0x003e:
            java.lang.String r3 = "fromAssetImage"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0047
            goto L_0x001b
        L_0x0047:
            switch(r1) {
                case 0: goto L_0x00b3;
                case 1: goto L_0x0083;
                case 2: goto L_0x007e;
                case 3: goto L_0x0066;
                default: goto L_0x004a;
            }
        L_0x004a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot interpret "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = " as BitmapDescriptor"
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L_0x0066:
            int r8 = r0.size()
            if (r8 != r6) goto L_0x0071
            z2.a r8 = z2.b.a()
            return r8
        L_0x0071:
            java.lang.Object r8 = r0.get(r6)
            float r8 = z(r8)
            z2.a r8 = z2.b.b(r8)
            return r8
        L_0x007e:
            z2.a r8 = c(r0)
            return r8
        L_0x0083:
            int r8 = r0.size()
            if (r8 != r5) goto L_0x009a
            java.lang.Object r8 = r0.get(r6)
            java.lang.String r8 = O(r8)
            java.lang.String r8 = io.flutter.view.d.a(r8)
            z2.a r8 = z2.b.c(r8)
            return r8
        L_0x009a:
            java.lang.Object r8 = r0.get(r6)
            java.lang.String r8 = O(r8)
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r0 = O(r0)
            java.lang.String r8 = io.flutter.view.d.b(r8, r0)
            z2.a r8 = z2.b.c(r8)
            return r8
        L_0x00b3:
            int r8 = r0.size()
            if (r8 != r4) goto L_0x00ca
            java.lang.Object r8 = r0.get(r6)
            java.lang.String r8 = O(r8)
            java.lang.String r8 = io.flutter.view.d.a(r8)
            z2.a r8 = z2.b.c(r8)
            return r8
        L_0x00ca:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "'fromAssetImage' Expected exactly 3 arguments, got: "
            r1.append(r2)
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.googlemaps.e.t(java.lang.Object):z2.a");
    }

    private static boolean u(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    static CameraPosition v(Object obj) {
        Map<?, ?> H = H(obj);
        CameraPosition.a d10 = CameraPosition.d();
        d10.a(z(H.get("bearing")));
        d10.c(E(H.get("target")));
        d10.d(z(H.get("tilt")));
        d10.e(z(H.get("zoom")));
        return d10.b();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007c, code lost:
        if (r2.equals("newLatLng") == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static x2.a w(java.lang.Object r7, float r8) {
        /*
            java.util.List r0 = G(r7)
            r1 = 0
            java.lang.Object r2 = r0.get(r1)
            java.lang.String r2 = O(r2)
            r2.hashCode()
            int r3 = r2.hashCode()
            r4 = 2
            r5 = 1
            r6 = -1
            switch(r3) {
                case -813625658: goto L_0x0076;
                case -696286326: goto L_0x006b;
                case -696286120: goto L_0x0060;
                case -696285778: goto L_0x0055;
                case -402165756: goto L_0x004a;
                case -145042503: goto L_0x003f;
                case -110027141: goto L_0x0034;
                case 354871598: goto L_0x0029;
                case 1661158683: goto L_0x001d;
                default: goto L_0x001a;
            }
        L_0x001a:
            r1 = -1
            goto L_0x007f
        L_0x001d:
            java.lang.String r1 = "newLatLngBounds"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0026
            goto L_0x001a
        L_0x0026:
            r1 = 8
            goto L_0x007f
        L_0x0029:
            java.lang.String r1 = "newCameraPosition"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0032
            goto L_0x001a
        L_0x0032:
            r1 = 7
            goto L_0x007f
        L_0x0034:
            java.lang.String r1 = "zoomOut"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x003d
            goto L_0x001a
        L_0x003d:
            r1 = 6
            goto L_0x007f
        L_0x003f:
            java.lang.String r1 = "newLatLngZoom"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0048
            goto L_0x001a
        L_0x0048:
            r1 = 5
            goto L_0x007f
        L_0x004a:
            java.lang.String r1 = "scrollBy"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0053
            goto L_0x001a
        L_0x0053:
            r1 = 4
            goto L_0x007f
        L_0x0055:
            java.lang.String r1 = "zoomTo"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x005e
            goto L_0x001a
        L_0x005e:
            r1 = 3
            goto L_0x007f
        L_0x0060:
            java.lang.String r1 = "zoomIn"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0069
            goto L_0x001a
        L_0x0069:
            r1 = 2
            goto L_0x007f
        L_0x006b:
            java.lang.String r1 = "zoomBy"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0074
            goto L_0x001a
        L_0x0074:
            r1 = 1
            goto L_0x007f
        L_0x0076:
            java.lang.String r3 = "newLatLng"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x007f
            goto L_0x001a
        L_0x007f:
            switch(r1) {
                case 0: goto L_0x0129;
                case 1: goto L_0x0101;
                case 2: goto L_0x00fc;
                case 3: goto L_0x00ef;
                case 4: goto L_0x00da;
                case 5: goto L_0x00c5;
                case 6: goto L_0x00c0;
                case 7: goto L_0x00b3;
                case 8: goto L_0x009e;
                default: goto L_0x0082;
            }
        L_0x0082:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot interpret "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = " as CameraUpdate"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L_0x009e:
            java.lang.Object r7 = r0.get(r5)
            com.google.android.gms.maps.model.LatLngBounds r7 = F(r7)
            java.lang.Object r0 = r0.get(r4)
            int r8 = K(r0, r8)
            x2.a r7 = x2.b.c(r7, r8)
            return r7
        L_0x00b3:
            java.lang.Object r7 = r0.get(r5)
            com.google.android.gms.maps.model.CameraPosition r7 = v(r7)
            x2.a r7 = x2.b.a(r7)
            return r7
        L_0x00c0:
            x2.a r7 = x2.b.i()
            return r7
        L_0x00c5:
            java.lang.Object r7 = r0.get(r5)
            com.google.android.gms.maps.model.LatLng r7 = E(r7)
            java.lang.Object r8 = r0.get(r4)
            float r8 = z(r8)
            x2.a r7 = x2.b.d(r7, r8)
            return r7
        L_0x00da:
            java.lang.Object r7 = r0.get(r5)
            float r7 = B(r7, r8)
            java.lang.Object r0 = r0.get(r4)
            float r8 = B(r0, r8)
            x2.a r7 = x2.b.e(r7, r8)
            return r7
        L_0x00ef:
            java.lang.Object r7 = r0.get(r5)
            float r7 = z(r7)
            x2.a r7 = x2.b.j(r7)
            return r7
        L_0x00fc:
            x2.a r7 = x2.b.h()
            return r7
        L_0x0101:
            int r7 = r0.size()
            if (r7 != r4) goto L_0x0114
            java.lang.Object r7 = r0.get(r5)
            float r7 = z(r7)
            x2.a r7 = x2.b.f(r7)
            return r7
        L_0x0114:
            java.lang.Object r7 = r0.get(r5)
            float r7 = z(r7)
            java.lang.Object r0 = r0.get(r4)
            android.graphics.Point r8 = M(r0, r8)
            x2.a r7 = x2.b.g(r7, r8)
            return r7
        L_0x0129:
            java.lang.Object r7 = r0.get(r5)
            com.google.android.gms.maps.model.LatLng r7 = E(r7)
            x2.a r7 = x2.b.b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.googlemaps.e.w(java.lang.Object, float):x2.a");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        if (r2.equals("roundCap") == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static z2.d x(java.lang.Object r7) {
        /*
            java.util.List r0 = G(r7)
            r1 = 0
            java.lang.Object r2 = r0.get(r1)
            java.lang.String r2 = O(r2)
            r2.hashCode()
            int r3 = r2.hashCode()
            r4 = 2
            r5 = 1
            r6 = -1
            switch(r3) {
                case -179356: goto L_0x003d;
                case 241309887: goto L_0x0032;
                case 1314340213: goto L_0x0027;
                case 1611528865: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            r1 = -1
            goto L_0x0046
        L_0x001c:
            java.lang.String r1 = "customCap"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0025
            goto L_0x001a
        L_0x0025:
            r1 = 3
            goto L_0x0046
        L_0x0027:
            java.lang.String r1 = "squareCap"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0030
            goto L_0x001a
        L_0x0030:
            r1 = 2
            goto L_0x0046
        L_0x0032:
            java.lang.String r1 = "buttCap"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x003b
            goto L_0x001a
        L_0x003b:
            r1 = 1
            goto L_0x0046
        L_0x003d:
            java.lang.String r3 = "roundCap"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0046
            goto L_0x001a
        L_0x0046:
            switch(r1) {
                case 0: goto L_0x009b;
                case 1: goto L_0x0095;
                case 2: goto L_0x008f;
                case 3: goto L_0x0065;
                default: goto L_0x0049;
            }
        L_0x0049:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot interpret "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = " as Cap"
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L_0x0065:
            int r7 = r0.size()
            if (r7 != r4) goto L_0x0079
            z2.g r7 = new z2.g
            java.lang.Object r0 = r0.get(r5)
            z2.a r0 = t(r0)
            r7.<init>(r0)
            return r7
        L_0x0079:
            z2.g r7 = new z2.g
            java.lang.Object r1 = r0.get(r5)
            z2.a r1 = t(r1)
            java.lang.Object r0 = r0.get(r4)
            float r0 = z(r0)
            r7.<init>(r1, r0)
            return r7
        L_0x008f:
            z2.u r7 = new z2.u
            r7.<init>()
            return r7
        L_0x0095:
            z2.c r7 = new z2.c
            r7.<init>()
            return r7
        L_0x009b:
            z2.s r7 = new z2.s
            r7.<init>()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.googlemaps.e.x(java.lang.Object):z2.d");
    }

    private static double y(Object obj) {
        return ((Number) obj).doubleValue();
    }

    private static float z(Object obj) {
        return ((Number) obj).floatValue();
    }
}
