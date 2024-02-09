package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.y;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

final class t0 {
    private static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    private static boolean b(Object obj) {
        Object obj2;
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        }
        if (obj instanceof Float) {
            return ((Float) obj).floatValue() == 0.0f;
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue() == 0.0d;
        }
        if (obj instanceof String) {
            obj2 = "";
        } else if (!(obj instanceof h)) {
            return obj instanceof r0 ? obj == ((r0) obj).d() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
        } else {
            obj2 = h.f1926n;
        }
        return obj.equals(obj2);
    }

    static final void c(StringBuilder sb, int i10, String str, Object obj) {
        String a10;
        if (obj instanceof List) {
            for (Object c10 : (List) obj) {
                c(sb, i10, str, c10);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry c11 : ((Map) obj).entrySet()) {
                c(sb, i10, str, c11);
            }
        } else {
            sb.append(10);
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                a10 = l1.c((String) obj);
            } else if (obj instanceof h) {
                sb.append(": \"");
                a10 = l1.a((h) obj);
            } else {
                if (obj instanceof y) {
                    sb.append(" {");
                    d((y) obj, sb, i10 + 2);
                    sb.append("\n");
                    while (i11 < i10) {
                        sb.append(' ');
                        i11++;
                    }
                } else if (obj instanceof Map.Entry) {
                    sb.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i13 = i10 + 2;
                    c(sb, i13, "key", entry.getKey());
                    c(sb, i13, "value", entry.getValue());
                    sb.append("\n");
                    while (i11 < i10) {
                        sb.append(' ');
                        i11++;
                    }
                } else {
                    sb.append(": ");
                    sb.append(obj.toString());
                    return;
                }
                sb.append("}");
                return;
            }
            sb.append(a10);
            sb.append('\"');
        }
    }

    private static void d(r0 r0Var, StringBuilder sb, int i10) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : r0Var.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String replaceFirst = str.replaceFirst("get", "");
            boolean z9 = true;
            if (replaceFirst.endsWith("List") && !replaceFirst.endsWith("OrBuilderList") && !replaceFirst.equals("List")) {
                String str2 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 4);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    c(sb, i10, a(str2), y.B(method2, r0Var, new Object[0]));
                }
            }
            if (replaceFirst.endsWith("Map") && !replaceFirst.equals("Map")) {
                String str3 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    c(sb, i10, a(str3), y.B(method3, r0Var, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set" + replaceFirst)) != null) {
                if (replaceFirst.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + replaceFirst.substring(0, replaceFirst.length() - 5))) {
                    }
                }
                String str4 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1);
                Method method4 = (Method) hashMap.get("get" + replaceFirst);
                Method method5 = (Method) hashMap.get("has" + replaceFirst);
                if (method4 != null) {
                    Object B = y.B(method4, r0Var, new Object[0]);
                    if (method5 != null) {
                        z9 = ((Boolean) y.B(method5, r0Var, new Object[0])).booleanValue();
                    } else if (b(B)) {
                        z9 = false;
                    }
                    if (z9) {
                        c(sb, i10, a(str4), B);
                    }
                }
            }
        }
        if (r0Var instanceof y.c) {
            Iterator<Map.Entry<y.d, Object>> s9 = ((y.c) r0Var).extensions.s();
            while (s9.hasNext()) {
                Map.Entry next = s9.next();
                c(sb, i10, "[" + ((y.d) next.getKey()).getNumber() + "]", next.getValue());
            }
        }
        o1 o1Var = ((y) r0Var).unknownFields;
        if (o1Var != null) {
            o1Var.m(sb, i10);
        }
    }

    static String e(r0 r0Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(r0Var, sb, 0);
        return sb.toString();
    }
}
