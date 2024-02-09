package c5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import b9.j0;
import b9.k0;
import b9.l0;
import b9.r1;
import d5.b;
import g8.n;
import g8.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import r8.p;

public final class g0 {

    /* renamed from: f  reason: collision with root package name */
    public static final b f3728f = new b((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final j8.g f3729a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Messenger f3730b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f3731c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final LinkedBlockingDeque<Message> f3732d = new LinkedBlockingDeque<>(20);

    /* renamed from: e  reason: collision with root package name */
    private final d f3733e = new d(this);

    public static final class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final j8.g f3734a;

        @f(c = "com.google.firebase.sessions.SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1", f = "SessionLifecycleClient.kt", l = {73}, m = "invokeSuspend")
        /* renamed from: c5.g0$a$a  reason: collision with other inner class name */
        static final class C0079a extends k implements p<j0, j8.d<? super s>, Object> {

            /* renamed from: m  reason: collision with root package name */
            int f3735m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ String f3736n;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0079a(String str, j8.d<? super C0079a> dVar) {
                super(2, dVar);
                this.f3736n = str;
            }

            public final j8.d<s> create(Object obj, j8.d<?> dVar) {
                return new C0079a(this.f3736n, dVar);
            }

            public final Object invoke(j0 j0Var, j8.d<? super s> dVar) {
                return ((C0079a) create(j0Var, dVar)).invokeSuspend(s.f8976a);
            }

            public final Object invokeSuspend(Object obj) {
                Object d10 = d.d();
                int i10 = this.f3735m;
                if (i10 == 0) {
                    n.b(obj);
                    d5.a aVar = d5.a.f8184a;
                    this.f3735m = 1;
                    obj = aVar.c(this);
                    if (obj == d10) {
                        return d10;
                    }
                } else if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Collection<d5.b> values = ((Map) obj).values();
                String str = this.f3736n;
                for (d5.b bVar : values) {
                    bVar.b(new b.C0125b(str));
                    Log.d("SessionLifecycleClient", "Notified " + bVar.a() + " of new session " + str);
                }
                return s.f8976a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(j8.g gVar) {
            super(Looper.getMainLooper());
            l.e(gVar, "backgroundDispatcher");
            this.f3734a = gVar;
        }

        private final void a(String str) {
            Log.d("SessionLifecycleClient", "Session update received: " + str);
            r1 unused = i.d(k0.a(this.f3734a), (j8.g) null, (l0) null, new C0079a(str, (j8.d<? super C0079a>) null), 3, (Object) null);
        }

        public void handleMessage(Message message) {
            String str;
            l.e(message, "msg");
            if (message.what == 3) {
                Bundle data = message.getData();
                if (data == null || (str = data.getString("SessionUpdateExtra")) == null) {
                    str = "";
                }
                a(str);
                return;
            }
            Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + message);
            super.handleMessage(message);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }
    }

    @f(c = "com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1", f = "SessionLifecycleClient.kt", l = {149}, m = "invokeSuspend")
    static final class c extends k implements p<j0, j8.d<? super s>, Object> {

        /* renamed from: m  reason: collision with root package name */
        int f3737m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ g0 f3738n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ List<Message> f3739o;

        public static final class a<T> implements Comparator {
            public final int compare(T t9, T t10) {
                return i8.a.a(Long.valueOf(((Message) t9).getWhen()), Long.valueOf(((Message) t10).getWhen()));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(g0 g0Var, List<Message> list, j8.d<? super c> dVar) {
            super(2, dVar);
            this.f3738n = g0Var;
            this.f3739o = list;
        }

        public final j8.d<s> create(Object obj, j8.d<?> dVar) {
            return new c(this.f3738n, this.f3739o, dVar);
        }

        public final Object invoke(j0 j0Var, j8.d<? super s> dVar) {
            return ((c) create(j0Var, dVar)).invokeSuspend(s.f8976a);
        }

        public final Object invokeSuspend(Object obj) {
            boolean z9;
            String str;
            Object d10 = d.d();
            int i10 = this.f3737m;
            if (i10 == 0) {
                n.b(obj);
                d5.a aVar = d5.a.f8184a;
                this.f3737m = 1;
                obj = aVar.c(this);
                if (obj == d10) {
                    return d10;
                }
            } else if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Map map = (Map) obj;
            if (map.isEmpty()) {
                str = "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.";
            } else {
                Collection values = map.values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator it = values.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((d5.b) it.next()).c()) {
                                z9 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z9 = true;
                if (z9) {
                    str = "Data Collection is disabled for all subscribers. Skipping this Event";
                } else {
                    List<Message> y9 = v.y(v.l(n.f(this.f3738n.l(this.f3739o, 2), this.f3738n.l(this.f3739o, 1))), new a());
                    g0 g0Var = this.f3738n;
                    for (Message e10 : y9) {
                        g0Var.p(e10);
                    }
                    return s.f8976a;
                }
            }
            Log.d("SessionLifecycleClient", str);
            return s.f8976a;
        }
    }

    public static final class d implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g0 f3740a;

        d(g0 g0Var) {
            this.f3740a = g0Var;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d("SessionLifecycleClient", "Connected to SessionLifecycleService. Queue size " + this.f3740a.f3732d.size());
            this.f3740a.f3730b = new Messenger(iBinder);
            this.f3740a.f3731c = true;
            g0 g0Var = this.f3740a;
            r1 unused = g0Var.o(g0Var.j());
        }

        public void onServiceDisconnected(ComponentName componentName) {
            Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
            this.f3740a.f3730b = null;
            this.f3740a.f3731c = false;
        }
    }

    public g0(j8.g gVar) {
        l.e(gVar, "backgroundDispatcher");
        this.f3729a = gVar;
    }

    /* access modifiers changed from: private */
    public final List<Message> j() {
        ArrayList arrayList = new ArrayList();
        this.f3732d.drainTo(arrayList);
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.os.Message} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Message l(java.util.List<android.os.Message> r7, int r8) {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0009:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0023
            java.lang.Object r1 = r7.next()
            r2 = r1
            android.os.Message r2 = (android.os.Message) r2
            int r2 = r2.what
            if (r2 != r8) goto L_0x001c
            r2 = 1
            goto L_0x001d
        L_0x001c:
            r2 = 0
        L_0x001d:
            if (r2 == 0) goto L_0x0009
            r0.add(r1)
            goto L_0x0009
        L_0x0023:
            java.util.Iterator r7 = r0.iterator()
            boolean r8 = r7.hasNext()
            if (r8 != 0) goto L_0x002f
            r7 = 0
            goto L_0x005a
        L_0x002f:
            java.lang.Object r8 = r7.next()
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto L_0x003b
        L_0x0039:
            r7 = r8
            goto L_0x005a
        L_0x003b:
            r0 = r8
            android.os.Message r0 = (android.os.Message) r0
            long r0 = r0.getWhen()
        L_0x0042:
            java.lang.Object r2 = r7.next()
            r3 = r2
            android.os.Message r3 = (android.os.Message) r3
            long r3 = r3.getWhen()
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0053
            r8 = r2
            r0 = r3
        L_0x0053:
            boolean r2 = r7.hasNext()
            if (r2 != 0) goto L_0x0042
            goto L_0x0039
        L_0x005a:
            android.os.Message r7 = (android.os.Message) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.g0.l(java.util.List, int):android.os.Message");
    }

    private final void m(Message message) {
        StringBuilder sb;
        if (this.f3732d.offer(message)) {
            sb = new StringBuilder();
            sb.append("Queued message ");
            sb.append(message.what);
            sb.append(". Queue size ");
            sb.append(this.f3732d.size());
        } else {
            sb = new StringBuilder();
            sb.append("Failed to enqueue message ");
            sb.append(message.what);
            sb.append(". Dropping.");
        }
        Log.d("SessionLifecycleClient", sb.toString());
    }

    private final void n(int i10) {
        List<Message> j10 = j();
        Message obtain = Message.obtain((Handler) null, i10, 0, 0);
        l.d(obtain, "obtain(null, messageCode, 0, 0)");
        j10.add(obtain);
        o(j10);
    }

    /* access modifiers changed from: private */
    public final r1 o(List<Message> list) {
        return i.d(k0.a(this.f3729a), (j8.g) null, (l0) null, new c(this, list, (j8.d<? super c>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void p(Message message) {
        if (this.f3730b != null) {
            try {
                Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
                Messenger messenger = this.f3730b;
                if (messenger != null) {
                    messenger.send(message);
                    return;
                }
                return;
            } catch (RemoteException e10) {
                Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e10);
            }
        }
        m(message);
    }

    public final void h() {
        n(2);
    }

    public final void i() {
        h0.f3743a.a().a(new Messenger(new a(this.f3729a)), this.f3733e);
    }

    public final void k() {
        n(1);
    }
}
