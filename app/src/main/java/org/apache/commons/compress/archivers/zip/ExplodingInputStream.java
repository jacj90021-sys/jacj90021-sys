package org.apache.commons.compress.archivers.zip;

import com.cmaster.cloner.ra;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
class ExplodingInputStream extends InputStream {
    private BitStream bits;
    private final CircularBuffer buffer = new CircularBuffer(UnixStat.FILE_FLAG);
    private final int dictionarySize;
    private BinaryTree distanceTree;
    private final InputStream in;
    private BinaryTree lengthTree;
    private BinaryTree literalTree;
    private final int minimumMatchLength;
    private final int numberOfTrees;

    public ExplodingInputStream(int i, int i2, InputStream inputStream) {
        if (i != 4096 && i != 8192) {
            ra.OooOOO("The dictionary size must be 4096 or 8192");
            throw null;
        }
        if (i2 != 2 && i2 != 3) {
            ra.OooOOO("The number of trees must be 2 or 3");
            throw null;
        }
        this.dictionarySize = i;
        this.numberOfTrees = i2;
        this.minimumMatchLength = i2;
        this.in = inputStream;
    }

    private void fillBuffer() throws IOException {
        init();
        int iNextBit = this.bits.nextBit();
        if (iNextBit == 1) {
            BinaryTree binaryTree = this.literalTree;
            BitStream bitStream = this.bits;
            int iNextByte = binaryTree != null ? binaryTree.read(bitStream) : bitStream.nextByte();
            if (iNextByte == -1) {
                return;
            }
            this.buffer.put(iNextByte);
            return;
        }
        if (iNextBit == 0) {
            int i = this.dictionarySize == 4096 ? 6 : 7;
            int iNextBits = (int) this.bits.nextBits(i);
            int i2 = this.distanceTree.read(this.bits);
            if (i2 != -1 || iNextBits > 0) {
                int i3 = (i2 << i) | iNextBits;
                int iNextBits2 = this.lengthTree.read(this.bits);
                if (iNextBits2 == 63) {
                    iNextBits2 = (int) (iNextBits2 + this.bits.nextBits(8));
                }
                this.buffer.copy(i3 + 1, iNextBits2 + this.minimumMatchLength);
            }
        }
    }

    private void init() {
        if (this.bits == null) {
            if (this.numberOfTrees == 3) {
                this.literalTree = BinaryTree.decode(this.in, 256);
            }
            this.lengthTree = BinaryTree.decode(this.in, 64);
            this.distanceTree = BinaryTree.decode(this.in, 64);
            this.bits = new BitStream(this.in);
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (!this.buffer.available()) {
            fillBuffer();
        }
        return this.buffer.get();
    }
}
