package y2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import o2.b;
import u2.a;
import u2.d;
import u2.e;
import u2.g;
import u2.h;
import u2.j;
import u2.u;
import u2.v;
import u2.x;
import z2.a0;
import z2.f;
import z2.k;
import z2.m;
import z2.p;
import z2.r;

public final class h0 extends a implements b {
    h0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    public final e A2(p pVar) {
        Parcel J = J();
        u2.p.d(J, pVar);
        Parcel B = B(10, J);
        e J2 = d.J(B.readStrongBinder());
        B.recycle();
        return J2;
    }

    public final void B0(o0 o0Var) {
        Parcel J = J();
        u2.p.f(J, o0Var);
        Y(96, J);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final y2.e D0() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.J()
            r1 = 25
            android.os.Parcel r0 = r4.B(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.maps.internal.IUiSettingsDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof y2.e
            if (r3 == 0) goto L_0x0020
            r1 = r2
            y2.e r1 = (y2.e) r1
            goto L_0x0026
        L_0x0020:
            y2.c0 r2 = new y2.c0
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.h0.D0():y2.e");
    }

    public final void D2(float f10) {
        Parcel J = J();
        J.writeFloat(f10);
        Y(93, J);
    }

    public final void E2(q0 q0Var) {
        Parcel J = J();
        u2.p.f(J, q0Var);
        Y(89, J);
    }

    public final void L0(LatLngBounds latLngBounds) {
        Parcel J = J();
        u2.p.d(J, latLngBounds);
        Y(95, J);
    }

    public final CameraPosition L1() {
        Parcel B = B(1, J());
        CameraPosition cameraPosition = (CameraPosition) u2.p.a(B, CameraPosition.CREATOR);
        B.recycle();
        return cameraPosition;
    }

    public final void M(boolean z9) {
        Parcel J = J();
        u2.p.c(J, z9);
        Y(22, J);
    }

    public final void O2(b bVar) {
        Parcel J = J();
        u2.p.f(J, bVar);
        Y(5, J);
    }

    public final void P2(m0 m0Var) {
        Parcel J = J();
        u2.p.f(J, m0Var);
        Y(97, J);
    }

    public final void Q0(r rVar) {
        Parcel J = J();
        u2.p.f(J, rVar);
        Y(30, J);
    }

    public final boolean Q1(k kVar) {
        Parcel J = J();
        u2.p.d(J, kVar);
        Parcel B = B(91, J);
        boolean g10 = u2.p.g(B);
        B.recycle();
        return g10;
    }

    public final void Q2(float f10) {
        Parcel J = J();
        J.writeFloat(f10);
        Y(92, J);
    }

    public final void R(boolean z9) {
        Parcel J = J();
        u2.p.c(J, z9);
        Y(18, J);
    }

    public final boolean R0() {
        Parcel B = B(40, J());
        boolean g10 = u2.p.g(B);
        B.recycle();
        return g10;
    }

    public final void R1(w wVar) {
        Parcel J = J();
        u2.p.f(J, wVar);
        Y(85, J);
    }

    public final v S1(f fVar) {
        Parcel J = J();
        u2.p.d(J, fVar);
        Parcel B = B(35, J);
        v J2 = u.J(B.readStrongBinder());
        B.recycle();
        return J2;
    }

    public final void S2(y yVar) {
        Parcel J = J();
        u2.p.f(J, yVar);
        Y(87, J);
    }

    public final void U0(k0 k0Var) {
        Parcel J = J();
        u2.p.f(J, k0Var);
        Y(99, J);
    }

    public final void U1(l lVar) {
        Parcel J = J();
        u2.p.f(J, lVar);
        Y(42, J);
    }

    public final u2.k U2(a0 a0Var) {
        Parcel J = J();
        u2.p.d(J, a0Var);
        Parcel B = B(13, J);
        u2.k J2 = j.J(B.readStrongBinder());
        B.recycle();
        return J2;
    }

    public final void a1(t tVar) {
        Parcel J = J();
        u2.p.f(J, tVar);
        Y(31, J);
    }

    public final float g2() {
        Parcel B = B(2, J());
        float readFloat = B.readFloat();
        B.recycle();
        return readFloat;
    }

    public final void i0() {
        Y(94, J());
    }

    public final void k1(n nVar) {
        Parcel J = J();
        u2.p.f(J, nVar);
        Y(29, J);
    }

    public final void k2(b0 b0Var, b bVar) {
        Parcel J = J();
        u2.p.f(J, b0Var);
        u2.p.f(J, bVar);
        Y(38, J);
    }

    public final void m1(int i10, int i11, int i12, int i13) {
        Parcel J = J();
        J.writeInt(i10);
        J.writeInt(i11);
        J.writeInt(i12);
        J.writeInt(i13);
        Y(39, J);
    }

    public final float n0() {
        Parcel B = B(3, J());
        float readFloat = B.readFloat();
        B.recycle();
        return readFloat;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final y2.d n1() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.J()
            r1 = 26
            android.os.Parcel r0 = r4.B(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.maps.internal.IProjectionDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof y2.d
            if (r3 == 0) goto L_0x0020
            r1 = r2
            y2.d r1 = (y2.d) r1
            goto L_0x0026
        L_0x0020:
            y2.z r2 = new y2.z
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.h0.n1():y2.d");
    }

    public final u2.b p0(m mVar) {
        Parcel J = J();
        u2.p.d(J, mVar);
        Parcel B = B(11, J);
        u2.b J2 = x.J(B.readStrongBinder());
        B.recycle();
        return J2;
    }

    public final h p1(r rVar) {
        Parcel J = J();
        u2.p.d(J, rVar);
        Parcel B = B(9, J);
        h J2 = g.J(B.readStrongBinder());
        B.recycle();
        return J2;
    }

    public final void p2(j jVar) {
        Parcel J = J();
        u2.p.f(J, jVar);
        Y(28, J);
    }

    public final void q0(h hVar) {
        Parcel J = J();
        u2.p.f(J, hVar);
        Y(32, J);
    }

    public final void r2(b bVar) {
        Parcel J = J();
        u2.p.f(J, bVar);
        Y(4, J);
    }

    public final void t(int i10) {
        Parcel J = J();
        J.writeInt(i10);
        Y(16, J);
    }

    public final void u(boolean z9) {
        Parcel J = J();
        u2.p.c(J, z9);
        Y(41, J);
    }

    public final boolean x(boolean z9) {
        Parcel J = J();
        u2.p.c(J, z9);
        Parcel B = B(20, J);
        boolean g10 = u2.p.g(B);
        B.recycle();
        return g10;
    }

    public final boolean x2() {
        Parcel B = B(17, J());
        boolean g10 = u2.p.g(B);
        B.recycle();
        return g10;
    }
}
