package com.cmaster.cloner;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class rx {
    public final int OooO00o;
    public final int OooO0O0;
    public final long OooO0OO;
    public final byte[] OooO0Oo;

    public rx(long j, byte[] bArr, int i, int i2) {
        this.OooO00o = i;
        this.OooO0O0 = i2;
        this.OooO0OO = j;
        this.OooO0Oo = bArr;
    }

    public static rx OooO00o(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[vx.OooOooo[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new rx(4, byteBufferWrap.array(), 1);
    }

    public static rx OooO0O0(tx txVar, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[vx.OooOooo[5]]);
        byteBufferWrap.order(byteOrder);
        tx txVar2 = new tx[]{txVar}[0];
        byteBufferWrap.putInt((int) txVar2.OooO00o);
        byteBufferWrap.putInt((int) txVar2.OooO0O0);
        return new rx(5, byteBufferWrap.array(), 1);
    }

    public static rx OooO0OO(int i, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[vx.OooOooo[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i}[0]);
        return new rx(3, byteBufferWrap.array(), 1);
    }

    public final double OooO0Oo(ByteOrder byteOrder) throws Throwable {
        Object objOooO0oO = OooO0oO(byteOrder);
        if (objOooO0oO == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objOooO0oO instanceof String) {
            return Double.parseDouble((String) objOooO0oO);
        }
        if (objOooO0oO instanceof long[]) {
            if (((long[]) objOooO0oO).length == 1) {
                return r3[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objOooO0oO instanceof int[]) {
            if (((int[]) objOooO0oO).length == 1) {
                return r3[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objOooO0oO instanceof double[]) {
            double[] dArr = (double[]) objOooO0oO;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objOooO0oO instanceof tx[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        tx[] txVarArr = (tx[]) objOooO0oO;
        if (txVarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        tx txVar = txVarArr[0];
        return txVar.OooO00o / txVar.OooO0O0;
    }

    public final String OooO0o(ByteOrder byteOrder) throws Throwable {
        Object objOooO0oO = OooO0oO(byteOrder);
        if (objOooO0oO == null) {
            return null;
        }
        if (objOooO0oO instanceof String) {
            return (String) objOooO0oO;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objOooO0oO instanceof long[]) {
            long[] jArr = (long[]) objOooO0oO;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objOooO0oO instanceof int[]) {
            int[] iArr = (int[]) objOooO0oO;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objOooO0oO instanceof double[]) {
            double[] dArr = (double[]) objOooO0oO;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objOooO0oO instanceof tx[])) {
            return null;
        }
        tx[] txVarArr = (tx[]) objOooO0oO;
        while (i < txVarArr.length) {
            sb.append(txVarArr[i].OooO00o);
            sb.append('/');
            sb.append(txVarArr[i].OooO0O0);
            i++;
            if (i != txVarArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public final int OooO0o0(ByteOrder byteOrder) {
        Object objOooO0oO = OooO0oO(byteOrder);
        if (objOooO0oO == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objOooO0oO instanceof String) {
            return Integer.parseInt((String) objOooO0oO);
        }
        if (objOooO0oO instanceof long[]) {
            long[] jArr = (long[]) objOooO0oO;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objOooO0oO instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objOooO0oO;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:17:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v14, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v15, types: [long[]] */
    /* JADX WARN: Type inference failed for: r13v16, types: [com.cmaster.cloner.tx[]] */
    /* JADX WARN: Type inference failed for: r13v17, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v18, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v19, types: [com.cmaster.cloner.tx[]] */
    /* JADX WARN: Type inference failed for: r13v20, types: [double[]] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v22, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable OooO0oO(java.nio.ByteOrder r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.rx.OooO0oO(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(vx.OooOooO[this.OooO00o]);
        sb.append(", data length:");
        return rj.OooO0o(sb, this.OooO0Oo.length, ")");
    }

    public rx(int i, byte[] bArr, int i2) {
        this(-1L, bArr, i, i2);
    }
}
