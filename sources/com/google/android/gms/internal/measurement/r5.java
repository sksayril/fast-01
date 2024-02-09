package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class r5 {
    public static double a(double d10) {
        int i10;
        if (Double.isNaN(d10)) {
            return 0.0d;
        }
        if (Double.isInfinite(d10) || d10 == 0.0d || d10 == -0.0d) {
            return d10;
        }
        return ((double) (i10 > 0 ? 1 : -1)) * Math.floor(Math.abs(d10));
    }

    public static int b(s6 s6Var) {
        int i10 = i(s6Var.c("runtime.counter").d().doubleValue() + 1.0d);
        if (i10 <= 1000000) {
            s6Var.h("runtime.counter", new j(Double.valueOf((double) i10)));
            return i10;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    public static x0 c(String str) {
        x0 zza = (str == null || str.isEmpty()) ? null : x0.zza(Integer.parseInt(str));
        if (zza != null) {
            return zza;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", new Object[]{str}));
    }

    public static Object d(r rVar) {
        if (r.f5548e.equals(rVar)) {
            return null;
        }
        if (r.f5547d.equals(rVar)) {
            return "";
        }
        if (rVar instanceof q) {
            return e((q) rVar);
        }
        if (!(rVar instanceof g)) {
            return !rVar.d().isNaN() ? rVar.d() : rVar.f();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<r> it = ((g) rVar).iterator();
        while (it.hasNext()) {
            Object d10 = d(it.next());
            if (d10 != null) {
                arrayList.add(d10);
            }
        }
        return arrayList;
    }

    public static Map<String, Object> e(q qVar) {
        HashMap hashMap = new HashMap();
        for (String next : qVar.a()) {
            Object d10 = d(qVar.i(next));
            if (d10 != null) {
                hashMap.put(next, d10);
            }
        }
        return hashMap;
    }

    public static void f(x0 x0Var, int i10, List<r> list) {
        g(x0Var.name(), i10, list);
    }

    public static void g(String str, int i10, List<r> list) {
        if (list.size() != i10) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", new Object[]{str, Integer.valueOf(i10), Integer.valueOf(list.size())}));
        }
    }

    public static boolean h(r rVar, r rVar2) {
        if (!rVar.getClass().equals(rVar2.getClass())) {
            return false;
        }
        if ((rVar instanceof y) || (rVar instanceof p)) {
            return true;
        }
        if (!(rVar instanceof j)) {
            return rVar instanceof t ? rVar.f().equals(rVar2.f()) : rVar instanceof h ? rVar.c().equals(rVar2.c()) : rVar == rVar2;
        }
        if (Double.isNaN(rVar.d().doubleValue()) || Double.isNaN(rVar2.d().doubleValue())) {
            return false;
        }
        return rVar.d().equals(rVar2.d());
    }

    public static int i(double d10) {
        int i10;
        if (Double.isNaN(d10) || Double.isInfinite(d10) || d10 == 0.0d) {
            return 0;
        }
        return (int) ((long) ((((double) (i10 > 0 ? 1 : -1)) * Math.floor(Math.abs(d10))) % 4.294967296E9d));
    }

    public static void j(x0 x0Var, int i10, List<r> list) {
        k(x0Var.name(), i10, list);
    }

    public static void k(String str, int i10, List<r> list) {
        if (list.size() < i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", new Object[]{str, Integer.valueOf(i10), Integer.valueOf(list.size())}));
        }
    }

    public static boolean l(r rVar) {
        if (rVar == null) {
            return false;
        }
        Double d10 = rVar.d();
        return !d10.isNaN() && d10.doubleValue() >= 0.0d && d10.equals(Double.valueOf(Math.floor(d10.doubleValue())));
    }

    public static long m(double d10) {
        return ((long) i(d10)) & 4294967295L;
    }

    public static void n(String str, int i10, List<r> list) {
        if (list.size() > i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", new Object[]{str, Integer.valueOf(i10), Integer.valueOf(list.size())}));
        }
    }
}
