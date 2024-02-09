package z7;

import android.media.Image;
import java.nio.ByteBuffer;

public class e {
    private static boolean a(Image.Plane[] planeArr, int i10, int i11) {
        int i12 = i10 * i11;
        boolean z9 = true;
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int position = buffer2.position();
        int limit = buffer.limit();
        buffer2.position(position + 1);
        buffer.limit(limit - 1);
        if (!(buffer2.remaining() == ((i12 * 2) / 4) - 2 && buffer2.compareTo(buffer) == 0)) {
            z9 = false;
        }
        buffer2.position(position);
        buffer.limit(limit);
        return z9;
    }

    private static void b(Image.Plane plane, int i10, int i11, byte[] bArr, int i12, int i13) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int limit = ((buffer.limit() + plane.getRowStride()) - 1) / plane.getRowStride();
        if (limit != 0) {
            int i14 = i10 / (i11 / limit);
            int i15 = 0;
            for (int i16 = 0; i16 < limit; i16++) {
                int i17 = i15;
                for (int i18 = 0; i18 < i14; i18++) {
                    bArr[i12] = buffer.get(i17);
                    i12 += i13;
                    i17 += plane.getPixelStride();
                }
                i15 += plane.getRowStride();
            }
        }
    }

    public ByteBuffer c(Image.Plane[] planeArr, int i10, int i11) {
        int i12 = i10 * i11;
        byte[] bArr = new byte[(((i12 / 4) * 2) + i12)];
        if (a(planeArr, i10, i11)) {
            planeArr[0].getBuffer().get(bArr, 0, i12);
            ByteBuffer buffer = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i12, 1);
            buffer.get(bArr, i12 + 1, ((i12 * 2) / 4) - 1);
        } else {
            int i13 = i10;
            int i14 = i11;
            byte[] bArr2 = bArr;
            b(planeArr[0], i13, i14, bArr2, 0, 1);
            b(planeArr[1], i13, i14, bArr2, i12 + 1, 2);
            b(planeArr[2], i10, i11, bArr, i12, 2);
        }
        return ByteBuffer.wrap(bArr);
    }
}
