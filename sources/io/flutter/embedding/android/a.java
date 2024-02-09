package io.flutter.embedding.android;

import android.graphics.Matrix;
import android.view.InputDevice;
import android.view.MotionEvent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

public class a {

    /* renamed from: e  reason: collision with root package name */
    private static final Matrix f9672e = new Matrix();

    /* renamed from: a  reason: collision with root package name */
    private final j7.a f9673a;

    /* renamed from: b  reason: collision with root package name */
    private final u f9674b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f9675c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Integer, float[]> f9676d = new HashMap();

    public a(j7.a aVar, boolean z9) {
        this.f9673a = aVar;
        this.f9674b = u.a();
        this.f9675c = z9;
    }

    private void a(MotionEvent motionEvent, int i10, int i11, int i12, Matrix matrix, ByteBuffer byteBuffer) {
        long j10;
        long j11;
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        InputDevice.MotionRange motionRange;
        MotionEvent motionEvent2 = motionEvent;
        int i13 = i10;
        int i14 = i11;
        ByteBuffer byteBuffer2 = byteBuffer;
        if (i14 != -1) {
            long d15 = this.f9675c ? this.f9674b.c(motionEvent2).d() : 0;
            int d16 = d(motionEvent.getToolType(i10));
            float[] fArr = {motionEvent.getX(i10), motionEvent.getY(i10)};
            matrix.mapPoints(fArr);
            if (d16 == 1) {
                j10 = (long) (motionEvent.getButtonState() & 31);
                if (j10 == 0 && motionEvent.getSource() == 8194 && i14 == 4) {
                    this.f9676d.put(Integer.valueOf(motionEvent.getPointerId(i10)), fArr);
                }
            } else {
                j10 = d16 == 2 ? (long) ((motionEvent.getButtonState() >> 4) & 15) : 0;
            }
            boolean containsKey = this.f9676d.containsKey(Integer.valueOf(motionEvent.getPointerId(i10)));
            int i15 = motionEvent.getActionMasked() == 8 ? 1 : 0;
            byteBuffer2.putLong(d15);
            byteBuffer2.putLong(motionEvent.getEventTime() * 1000);
            if (containsKey) {
                byteBuffer2.putLong((long) c(i14));
                j11 = 4;
            } else {
                byteBuffer2.putLong((long) i14);
                j11 = (long) d16;
            }
            byteBuffer2.putLong(j11);
            byteBuffer2.putLong((long) i15);
            byteBuffer2.putLong((long) motionEvent.getPointerId(i10));
            byteBuffer2.putLong(0);
            if (containsKey) {
                float[] fArr2 = this.f9676d.get(Integer.valueOf(motionEvent.getPointerId(i10)));
                byteBuffer2.putDouble((double) fArr2[0]);
                byteBuffer2.putDouble((double) fArr2[1]);
            } else {
                byteBuffer2.putDouble((double) fArr[0]);
                byteBuffer2.putDouble((double) fArr[1]);
            }
            byteBuffer2.putDouble(0.0d);
            byteBuffer2.putDouble(0.0d);
            byteBuffer2.putLong(j10);
            byteBuffer2.putLong(0);
            byteBuffer2.putLong(0);
            byteBuffer2.putDouble((double) motionEvent.getPressure(i10));
            if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
                d11 = 1.0d;
                d10 = 0.0d;
            } else {
                d10 = (double) motionRange.getMin();
                d11 = (double) motionRange.getMax();
            }
            byteBuffer2.putDouble(d10);
            byteBuffer2.putDouble(d11);
            if (d16 == 2) {
                byteBuffer2.putDouble((double) motionEvent2.getAxisValue(24, i13));
                d12 = 0.0d;
            } else {
                d12 = 0.0d;
                byteBuffer2.putDouble(0.0d);
            }
            byteBuffer2.putDouble(d12);
            byteBuffer2.putDouble((double) motionEvent.getSize(i10));
            byteBuffer2.putDouble((double) motionEvent.getToolMajor(i10));
            byteBuffer2.putDouble((double) motionEvent.getToolMinor(i10));
            byteBuffer2.putDouble(d12);
            byteBuffer2.putDouble(d12);
            byteBuffer2.putDouble((double) motionEvent2.getAxisValue(8, i13));
            if (d16 == 2) {
                byteBuffer2.putDouble((double) motionEvent2.getAxisValue(25, i13));
            } else {
                byteBuffer2.putDouble(d12);
            }
            byteBuffer2.putLong((long) i12);
            if (i15 == 1) {
                byteBuffer2.putDouble((double) (-motionEvent2.getAxisValue(10)));
                d13 = (double) (-motionEvent2.getAxisValue(9));
            } else {
                d13 = 0.0d;
                byteBuffer2.putDouble(0.0d);
            }
            byteBuffer2.putDouble(d13);
            if (containsKey) {
                float[] fArr3 = this.f9676d.get(Integer.valueOf(motionEvent.getPointerId(i10)));
                byteBuffer2.putDouble((double) (fArr[0] - fArr3[0]));
                byteBuffer2.putDouble((double) (fArr[1] - fArr3[1]));
                d14 = 0.0d;
            } else {
                d14 = 0.0d;
                byteBuffer2.putDouble(0.0d);
                byteBuffer2.putDouble(0.0d);
            }
            byteBuffer2.putDouble(d14);
            byteBuffer2.putDouble(d14);
            byteBuffer2.putDouble(1.0d);
            byteBuffer2.putDouble(d14);
            if (containsKey && c(i14) == 9) {
                this.f9676d.remove(Integer.valueOf(motionEvent.getPointerId(i10)));
            }
        }
    }

    private int b(int i10) {
        if (i10 == 0) {
            return 4;
        }
        if (i10 == 1) {
            return 6;
        }
        if (i10 == 5) {
            return 4;
        }
        if (i10 == 6) {
            return 6;
        }
        if (i10 == 2) {
            return 5;
        }
        if (i10 == 7) {
            return 3;
        }
        if (i10 == 3) {
            return 0;
        }
        return i10 == 8 ? 3 : -1;
    }

    private int c(int i10) {
        if (i10 == 4) {
            return 7;
        }
        if (i10 == 5) {
            return 8;
        }
        if (i10 == 6 || i10 == 0) {
            return 9;
        }
        throw new AssertionError("Unexpected pointer change");
    }

    private int d(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 2;
        }
        if (i10 != 3) {
            return i10 != 4 ? 5 : 3;
        }
        return 1;
    }

    public boolean e(MotionEvent motionEvent) {
        boolean z9 = motionEvent.isFromSource(2);
        boolean z10 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
        if (!z9 || !z10) {
            return false;
        }
        int b10 = b(motionEvent.getActionMasked());
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 35 * 8);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        a(motionEvent, motionEvent.getActionIndex(), b10, 0, f9672e, allocateDirect);
        if (allocateDirect.position() % 280 == 0) {
            this.f9673a.j(allocateDirect, allocateDirect.position());
            return true;
        }
        throw new AssertionError("Packet position is not on field boundary.");
    }

    public boolean f(MotionEvent motionEvent) {
        return g(motionEvent, f9672e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g(android.view.MotionEvent r13, android.graphics.Matrix r14) {
        /*
            r12 = this;
            int r0 = r13.getPointerCount()
            int r1 = r0 * 35
            int r1 = r1 * 8
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            r1.order(r2)
            int r2 = r13.getActionMasked()
            int r3 = r13.getActionMasked()
            int r9 = r12.b(r3)
            r3 = 0
            r10 = 1
            if (r2 == 0) goto L_0x0027
            r4 = 5
            if (r2 != r4) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r4 = 0
            goto L_0x0028
        L_0x0027:
            r4 = 1
        L_0x0028:
            if (r4 != 0) goto L_0x0031
            if (r2 == r10) goto L_0x002f
            r5 = 6
            if (r2 != r5) goto L_0x0031
        L_0x002f:
            r2 = 1
            goto L_0x0032
        L_0x0031:
            r2 = 0
        L_0x0032:
            if (r4 == 0) goto L_0x0042
        L_0x0034:
            int r4 = r13.getActionIndex()
            r6 = 0
            r2 = r12
            r3 = r13
            r5 = r9
            r7 = r14
            r8 = r1
            r2.a(r3, r4, r5, r6, r7, r8)
            goto L_0x006f
        L_0x0042:
            r11 = 0
            if (r2 == 0) goto L_0x0060
        L_0x0045:
            if (r11 >= r0) goto L_0x0034
            int r2 = r13.getActionIndex()
            if (r11 == r2) goto L_0x005d
            int r2 = r13.getToolType(r11)
            if (r2 != r10) goto L_0x005d
            r5 = 5
            r6 = 1
            r2 = r12
            r3 = r13
            r4 = r11
            r7 = r14
            r8 = r1
            r2.a(r3, r4, r5, r6, r7, r8)
        L_0x005d:
            int r11 = r11 + 1
            goto L_0x0045
        L_0x0060:
            if (r11 >= r0) goto L_0x006f
            r6 = 0
            r2 = r12
            r3 = r13
            r4 = r11
            r5 = r9
            r7 = r14
            r8 = r1
            r2.a(r3, r4, r5, r6, r7, r8)
            int r11 = r11 + 1
            goto L_0x0060
        L_0x006f:
            int r13 = r1.position()
            int r13 = r13 % 280
            if (r13 != 0) goto L_0x0081
            j7.a r13 = r12.f9673a
            int r14 = r1.position()
            r13.j(r1, r14)
            return r10
        L_0x0081:
            java.lang.AssertionError r13 = new java.lang.AssertionError
            java.lang.String r14 = "Packet position is not on field boundary"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.a.g(android.view.MotionEvent, android.graphics.Matrix):boolean");
    }
}
