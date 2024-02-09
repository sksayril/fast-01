package s5;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.EnumMap;
import java.util.Map;
import java.util.regex.Pattern;
import o5.e;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final String f12193a = "g";

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f12194b = Pattern.compile(",");

    public static Map<e, Object> a(Intent intent) {
        Object obj;
        Bundle extras = intent.getExtras();
        if (extras == null || extras.isEmpty()) {
            return null;
        }
        EnumMap enumMap = new EnumMap(e.class);
        for (e eVar : e.values()) {
            if (!(eVar == e.CHARACTER_SET || eVar == e.NEED_RESULT_POINT_CALLBACK || eVar == e.POSSIBLE_FORMATS)) {
                String name = eVar.name();
                if (extras.containsKey(name)) {
                    if (eVar.getValueType().equals(Void.class)) {
                        obj = Boolean.TRUE;
                    } else {
                        obj = extras.get(name);
                        if (!eVar.getValueType().isInstance(obj)) {
                            Log.w(f12193a, "Ignoring hint " + eVar + " because it is not assignable from " + obj);
                        }
                    }
                    enumMap.put(eVar, obj);
                }
            }
        }
        Log.i(f12193a, "Hints from the Intent: " + enumMap);
        return enumMap;
    }
}
