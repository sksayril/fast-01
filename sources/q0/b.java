package q0;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import b9.m;
import g8.s;
import j8.d;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final C0202b f11956a = new C0202b((g) null);

    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    private static final class a extends b {
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final MeasurementManager f11957b;

        public a(MeasurementManager measurementManager) {
            l.e(measurementManager, "mMeasurementManager");
            this.f11957b = measurementManager;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(android.content.Context r2) {
            /*
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.l.e(r2, r0)
                java.lang.Class<android.adservices.measurement.MeasurementManager> r0 = android.adservices.measurement.MeasurementManager.class
                java.lang.Object r2 = r2.getSystemService(r0)
                java.lang.String r0 = "context.getSystemService…:class.java\n            )"
                kotlin.jvm.internal.l.d(r2, r0)
                android.adservices.measurement.MeasurementManager r2 = (android.adservices.measurement.MeasurementManager) r2
                r1.<init>((android.adservices.measurement.MeasurementManager) r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q0.b.a.<init>(android.content.Context):void");
        }

        /* access modifiers changed from: private */
        public final DeletionRequest k(a aVar) {
            new DeletionRequest.Builder();
            throw null;
        }

        /* access modifiers changed from: private */
        public final WebSourceRegistrationRequest l(c cVar) {
            throw null;
        }

        /* access modifiers changed from: private */
        public final WebTriggerRegistrationRequest m(d dVar) {
            throw null;
        }

        public Object a(a aVar, d<? super s> dVar) {
            m mVar = new m(c.c(dVar), 1);
            mVar.z();
            this.f11957b.deleteRegistrations(k(aVar), androidx.profileinstaller.g.f2844m, androidx.core.os.m.a(mVar));
            Object w9 = mVar.w();
            if (w9 == d.d()) {
                h.c(dVar);
            }
            return w9 == d.d() ? w9 : s.f8976a;
        }

        public Object b(d<? super Integer> dVar) {
            m mVar = new m(c.c(dVar), 1);
            mVar.z();
            this.f11957b.getMeasurementApiStatus(androidx.profileinstaller.g.f2844m, androidx.core.os.m.a(mVar));
            Object w9 = mVar.w();
            if (w9 == d.d()) {
                h.c(dVar);
            }
            return w9;
        }

        public Object c(Uri uri, InputEvent inputEvent, d<? super s> dVar) {
            m mVar = new m(c.c(dVar), 1);
            mVar.z();
            this.f11957b.registerSource(uri, inputEvent, androidx.profileinstaller.g.f2844m, androidx.core.os.m.a(mVar));
            Object w9 = mVar.w();
            if (w9 == d.d()) {
                h.c(dVar);
            }
            return w9 == d.d() ? w9 : s.f8976a;
        }

        public Object d(Uri uri, d<? super s> dVar) {
            m mVar = new m(c.c(dVar), 1);
            mVar.z();
            this.f11957b.registerTrigger(uri, androidx.profileinstaller.g.f2844m, androidx.core.os.m.a(mVar));
            Object w9 = mVar.w();
            if (w9 == d.d()) {
                h.c(dVar);
            }
            return w9 == d.d() ? w9 : s.f8976a;
        }

        public Object e(c cVar, d<? super s> dVar) {
            m mVar = new m(c.c(dVar), 1);
            mVar.z();
            this.f11957b.registerWebSource(l(cVar), androidx.profileinstaller.g.f2844m, androidx.core.os.m.a(mVar));
            Object w9 = mVar.w();
            if (w9 == d.d()) {
                h.c(dVar);
            }
            return w9 == d.d() ? w9 : s.f8976a;
        }

        public Object f(d dVar, d<? super s> dVar2) {
            m mVar = new m(c.c(dVar2), 1);
            mVar.z();
            this.f11957b.registerWebTrigger(m(dVar), androidx.profileinstaller.g.f2844m, androidx.core.os.m.a(mVar));
            Object w9 = mVar.w();
            if (w9 == d.d()) {
                h.c(dVar2);
            }
            return w9 == d.d() ? w9 : s.f8976a;
        }
    }

    /* renamed from: q0.b$b  reason: collision with other inner class name */
    public static final class C0202b {
        private C0202b() {
        }

        public /* synthetic */ C0202b(g gVar) {
            this();
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final b a(Context context) {
            l.e(context, "context");
            StringBuilder sb = new StringBuilder();
            sb.append("AdServicesInfo.version=");
            n0.a aVar = n0.a.f11284a;
            sb.append(aVar.a());
            Log.d("MeasurementManager", sb.toString());
            if (aVar.a() >= 5) {
                return new a(context);
            }
            return null;
        }
    }

    public abstract Object a(a aVar, d<? super s> dVar);

    public abstract Object b(d<? super Integer> dVar);

    public abstract Object c(Uri uri, InputEvent inputEvent, d<? super s> dVar);

    public abstract Object d(Uri uri, d<? super s> dVar);

    public abstract Object e(c cVar, d<? super s> dVar);

    public abstract Object f(d dVar, d<? super s> dVar2);
}
