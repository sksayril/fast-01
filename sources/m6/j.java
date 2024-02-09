package m6;

import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import o5.a;
import o5.e;
import o5.i;

public class j implements g {

    /* renamed from: a  reason: collision with root package name */
    private Collection<a> f11230a;

    /* renamed from: b  reason: collision with root package name */
    private Map<e, ?> f11231b;

    /* renamed from: c  reason: collision with root package name */
    private String f11232c;

    /* renamed from: d  reason: collision with root package name */
    private int f11233d;

    public j() {
    }

    public j(Collection<a> collection, Map<e, ?> map, String str, int i10) {
        this.f11230a = collection;
        this.f11231b = map;
        this.f11232c = str;
        this.f11233d = i10;
    }

    public f a(Map<e, ?> map) {
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.putAll(map);
        Map<e, ?> map2 = this.f11231b;
        if (map2 != null) {
            enumMap.putAll(map2);
        }
        Collection<a> collection = this.f11230a;
        if (collection != null) {
            enumMap.put(e.POSSIBLE_FORMATS, collection);
        }
        String str = this.f11232c;
        if (str != null) {
            enumMap.put(e.CHARACTER_SET, str);
        }
        i iVar = new i();
        iVar.f(enumMap);
        int i10 = this.f11233d;
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? new f(iVar) : new l(iVar) : new k(iVar) : new f(iVar);
    }
}
