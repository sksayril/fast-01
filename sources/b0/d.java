package b0;

import androidx.datastore.preferences.protobuf.b0;
import java.io.InputStream;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f3369a = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final f a(InputStream inputStream) {
            l.e(inputStream, "input");
            try {
                f S = f.S(inputStream);
                l.d(S, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
                return S;
            } catch (b0 e10) {
                throw new z.a("Unable to parse preferences proto.", e10);
            }
        }
    }
}
