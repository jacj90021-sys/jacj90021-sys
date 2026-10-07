package com.cmaster.cloner;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class iw2 {
    public static qt0 OooO00o(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            qa.OooOOOO("Cannot read metadata.");
            return null;
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = byteBufferDuplicate.getInt() & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - byteBufferDuplicate.position())));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j2 = byteBufferDuplicate.getInt() & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = byteBufferDuplicate.getInt();
                long j3 = byteBufferDuplicate.getInt() & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    qt0 qt0Var = new qt0();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    qt0Var.OooO0oO = byteBufferDuplicate;
                    qt0Var.OooO0Oo = iPosition;
                    int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    qt0Var.OooO0o0 = i6;
                    qt0Var.OooO0o = ((ByteBuffer) qt0Var.OooO0oO).getShort(i6);
                    return qt0Var;
                }
            }
        }
        qa.OooOOOO("Cannot read metadata.");
        return null;
    }
}
