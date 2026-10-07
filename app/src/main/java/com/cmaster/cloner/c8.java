package com.cmaster.cloner;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class c8 implements Closeable {
    private static final long[] MASKS = new long[64];
    private static final int MAXIMUM_CACHE_SIZE = 63;
    private long bitsCached;
    private int bitsCachedSize;
    private final ByteOrder byteOrder;
    private final InputStream in;

    static {
        for (int i = 1; i <= MAXIMUM_CACHE_SIZE; i++) {
            long[] jArr = MASKS;
            jArr[i] = (jArr[i - 1] << 1) + 1;
        }
    }

    public c8(InputStream inputStream) {
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.bitsCached = 0L;
        this.bitsCachedSize = 0;
        this.in = inputStream;
        this.byteOrder = byteOrder;
    }

    public void clearBitCache() {
        this.bitsCached = 0L;
        this.bitsCachedSize = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.in.close();
    }

    public long readBits(int i) {
        long j;
        if (i < 0 || i > MAXIMUM_CACHE_SIZE) {
            ra.OooOOO("count must not be negative or greater than 63");
            return 0L;
        }
        while (true) {
            int i2 = this.bitsCachedSize;
            if (i2 >= i) {
                ByteOrder byteOrder = this.byteOrder;
                ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
                long j2 = this.bitsCached;
                if (byteOrder == byteOrder2) {
                    j = j2 & MASKS[i];
                    this.bitsCached = j2 >>> i;
                } else {
                    j = (j2 >> (i2 - i)) & MASKS[i];
                }
                this.bitsCachedSize = i2 - i;
                return j;
            }
            long j3 = this.in.read();
            if (j3 < 0) {
                return j3;
            }
            ByteOrder byteOrder3 = this.byteOrder;
            ByteOrder byteOrder4 = ByteOrder.LITTLE_ENDIAN;
            long j4 = this.bitsCached;
            if (byteOrder3 == byteOrder4) {
                this.bitsCached = (j3 << this.bitsCachedSize) | j4;
            } else {
                this.bitsCached = j3 | (j4 << 8);
            }
            this.bitsCachedSize += 8;
        }
    }
}
