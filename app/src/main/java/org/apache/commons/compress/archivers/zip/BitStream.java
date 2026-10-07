package org.apache.commons.compress.archivers.zip;

import com.cmaster.cloner.c8;
import java.io.InputStream;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
class BitStream extends c8 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitStream(InputStream inputStream) {
        super(inputStream);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
    }

    public int nextBit() {
        return (int) readBits(1);
    }

    public long nextBits(int i) {
        return readBits(i);
    }

    public int nextByte() {
        return (int) readBits(8);
    }
}
