package w3;

import java.util.Arrays;
import java.util.List;

public class s extends t {

    /* renamed from: m  reason: collision with root package name */
    private final List<c<?>> f12937m;

    public s(List<c<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f12937m = list;
    }
}
