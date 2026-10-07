package org.apache.commons.compress.archivers.zip;

import com.cmaster.cloner.cl0;
import com.cmaster.cloner.px0;
import com.cmaster.cloner.qa;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
class UnshrinkingInputStream extends cl0 {
    private static final int MAX_CODE_SIZE = 13;
    private static final int MAX_TABLE_SIZE = 8192;
    private final boolean[] isUsed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnshrinkingInputStream(InputStream inputStream) {
        super(inputStream);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        setClearCode(9);
        initializeTables(13);
        this.isUsed = new boolean[getPrefixesLength()];
        for (int i = 0; i < 256; i++) {
            this.isUsed[i] = true;
        }
        setTableSize(getClearCode() + 1);
    }

    private void partialClear() {
        boolean[] zArr = new boolean[MAX_TABLE_SIZE];
        int i = 0;
        while (true) {
            boolean[] zArr2 = this.isUsed;
            if (i >= zArr2.length) {
                break;
            }
            if (zArr2[i] && getPrefix(i) != -1) {
                zArr[getPrefix(i)] = true;
            }
            i++;
        }
        for (int clearCode = getClearCode() + 1; clearCode < MAX_TABLE_SIZE; clearCode++) {
            if (!zArr[clearCode]) {
                this.isUsed[clearCode] = false;
                setPrefix(clearCode, -1);
            }
        }
    }

    @Override // com.cmaster.cloner.cl0
    public int addEntry(int i, byte b) {
        int tableSize = getTableSize();
        while (tableSize < MAX_TABLE_SIZE && this.isUsed[tableSize]) {
            tableSize++;
        }
        setTableSize(tableSize);
        int iAddEntry = addEntry(i, b, MAX_TABLE_SIZE);
        if (iAddEntry >= 0) {
            this.isUsed[iAddEntry] = true;
        }
        return iAddEntry;
    }

    @Override // com.cmaster.cloner.cl0
    public int decompressNextSymbol() throws IOException {
        int nextCode = readNextCode();
        if (nextCode < 0) {
            return -1;
        }
        boolean z = false;
        if (nextCode != getClearCode()) {
            if (!this.isUsed[nextCode]) {
                nextCode = addRepeatOfPreviousCode();
                z = true;
            }
            return expandCodeToOutputStack(nextCode, z);
        }
        int nextCode2 = readNextCode();
        if (nextCode2 < 0) {
            qa.OooOOOO("Unexpected EOF;");
            return 0;
        }
        if (nextCode2 == 1) {
            if (getCodeSize() >= 13) {
                qa.OooOOOO("Attempt to increase code size beyond maximum");
                return 0;
            }
            incrementCodeSize();
        } else {
            if (nextCode2 != 2) {
                qa.OooOOOO(px0.OooOOO(nextCode2, "Invalid clear code subcode "));
                return 0;
            }
            partialClear();
            setTableSize(getClearCode() + 1);
        }
        return 0;
    }
}
