package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.r0;

public abstract class b<MessageType extends r0> implements z0<MessageType> {

    /* renamed from: a  reason: collision with root package name */
    private static final p f1889a = p.b();

    private MessageType c(MessageType messagetype) {
        if (messagetype == null || messagetype.n()) {
            return messagetype;
        }
        throw d(messagetype).a().i(messagetype);
    }

    private m1 d(MessageType messagetype) {
        return messagetype instanceof a ? ((a) messagetype).p() : new m1(messagetype);
    }

    /* renamed from: e */
    public MessageType a(h hVar, p pVar) {
        return c(f(hVar, pVar));
    }

    public MessageType f(h hVar, p pVar) {
        MessageType messagetype;
        try {
            i C = hVar.C();
            messagetype = (r0) b(C, pVar);
            C.a(0);
            return messagetype;
        } catch (b0 e10) {
            throw e10.i(messagetype);
        } catch (b0 e11) {
            throw e11;
        }
    }
}
