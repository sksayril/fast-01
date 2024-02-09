package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.embedding.android.s;
import io.flutter.embedding.engine.systemchannels.d;

public class m implements s.d {

    /* renamed from: a  reason: collision with root package name */
    private final d f9750a;

    /* renamed from: b  reason: collision with root package name */
    private final s.b f9751b = new s.b();

    public m(d dVar) {
        this.f9750a = dVar;
    }

    public void a(KeyEvent keyEvent, s.d.a aVar) {
        int action = keyEvent.getAction();
        boolean z9 = false;
        if (action == 0 || action == 1) {
            d.b bVar = new d.b(keyEvent, this.f9751b.a(keyEvent.getUnicodeChar()));
            if (action != 0) {
                z9 = true;
            }
            this.f9750a.e(bVar, z9, new l(aVar));
            return;
        }
        aVar.a(false);
    }
}
