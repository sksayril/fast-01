package m7;

import android.annotation.TargetApi;
import android.view.PointerIcon;
import io.flutter.embedding.engine.systemchannels.h;
import java.util.HashMap;

@TargetApi(24)
public class a {

    /* renamed from: c  reason: collision with root package name */
    private static HashMap<String, Integer> f11251c;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final c f11252a;

    /* renamed from: b  reason: collision with root package name */
    private final h f11253b;

    /* renamed from: m7.a$a  reason: collision with other inner class name */
    class C0181a implements h.b {
        C0181a() {
        }

        public void a(String str) {
            a.this.f11252a.setPointerIcon(a.this.d(str));
        }
    }

    class b extends HashMap<String, Integer> {
        b() {
            put("alias", 1010);
            put("allScroll", 1013);
            put("basic", 1000);
            put("cell", 1006);
            put("click", 1002);
            put("contextMenu", 1001);
            put("copy", 1011);
            put("forbidden", 1012);
            put("grab", 1020);
            put("grabbing", 1021);
            put("help", 1003);
            put("move", 1013);
            put("none", 0);
            put("noDrop", 1012);
            put("precise", 1007);
            put("text", 1008);
            put("resizeColumn", 1014);
            put("resizeDown", 1015);
            put("resizeUpLeft", 1016);
            put("resizeDownRight", 1017);
            put("resizeLeft", 1014);
            put("resizeLeftRight", 1014);
            put("resizeRight", 1014);
            put("resizeRow", 1015);
            put("resizeUp", 1015);
            put("resizeUpDown", 1015);
            put("resizeUpLeft", 1017);
            put("resizeUpRight", 1016);
            put("resizeUpLeftDownRight", 1017);
            put("resizeUpRightDownLeft", 1016);
            put("verticalText", 1009);
            put("wait", 1004);
            put("zoomIn", 1018);
            put("zoomOut", 1019);
        }
    }

    public interface c {
        PointerIcon b(int i10);

        void setPointerIcon(PointerIcon pointerIcon);
    }

    public a(c cVar, h hVar) {
        this.f11252a = cVar;
        this.f11253b = hVar;
        hVar.b(new C0181a());
    }

    /* access modifiers changed from: private */
    public PointerIcon d(String str) {
        if (f11251c == null) {
            f11251c = new b();
        }
        return this.f11252a.b(f11251c.getOrDefault(str, 1000).intValue());
    }

    public void c() {
        this.f11253b.b((h.b) null);
    }
}
