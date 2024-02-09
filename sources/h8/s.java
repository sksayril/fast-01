package h8;

import java.util.Collection;
import kotlin.jvm.internal.l;

class s extends r {
    public static <T> boolean k(Collection<? super T> collection, Iterable<? extends T> iterable) {
        l.e(collection, "<this>");
        l.e(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z9 = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z9 = true;
            }
        }
        return z9;
    }
}
