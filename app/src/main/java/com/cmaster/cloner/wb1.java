package com.cmaster.cloner;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class wb1 implements ok1, nk1 {
    public static final TreeMap OooOO0o = new TreeMap();
    public final byte[][] OooO;
    public final int OooO0Oo;
    public final long[] OooO0o;
    public volatile String OooO0o0;
    public final double[] OooO0oO;
    public final String[] OooO0oo;
    public final int[] OooOO0;
    public int OooOO0O;

    public wb1(int i) {
        this.OooO0Oo = i;
        int i2 = i + 1;
        this.OooOO0 = new int[i2];
        this.OooO0o = new long[i2];
        this.OooO0oO = new double[i2];
        this.OooO0oo = new String[i2];
        this.OooO = new byte[i2][];
    }

    public static final wb1 OooO0OO(int i, String str) {
        TreeMap treeMap = OooOO0o;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (entryCeilingEntry == null) {
                wb1 wb1Var = new wb1(i);
                wb1Var.OooO0o0 = str;
                wb1Var.OooOO0O = i;
                return wb1Var;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            wb1 wb1Var2 = (wb1) entryCeilingEntry.getValue();
            wb1Var2.getClass();
            wb1Var2.OooO0o0 = str;
            wb1Var2.OooOO0O = i;
            return wb1Var2;
        }
    }

    @Override // com.cmaster.cloner.ok1
    public final void OooO(nk1 nk1Var) {
        int i = this.OooOO0O;
        if (1 > i) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.OooOO0[i2];
            if (i3 == 1) {
                nk1Var.OooO0O0(i2);
            } else if (i3 == 2) {
                nk1Var.OooO00o(i2, this.OooO0o[i2]);
            } else if (i3 == 3) {
                nk1Var.OooO0o0(i2, this.OooO0oO[i2]);
            } else if (i3 == 4) {
                String str = this.OooO0oo[i2];
                if (str == null) {
                    ra.OooOOO("Required value was null.");
                    return;
                }
                nk1Var.OooO0Oo(i2, str);
            } else if (i3 == 5) {
                byte[] bArr = this.OooO[i2];
                if (bArr == null) {
                    ra.OooOOO("Required value was null.");
                    return;
                }
                nk1Var.OooOO0(i2, bArr);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // com.cmaster.cloner.nk1
    public final void OooO00o(int i, long j) {
        this.OooOO0[i] = 2;
        this.OooO0o[i] = j;
    }

    @Override // com.cmaster.cloner.nk1
    public final void OooO0O0(int i) {
        this.OooOO0[i] = 1;
    }

    @Override // com.cmaster.cloner.nk1
    public final void OooO0Oo(int i, String str) {
        str.getClass();
        this.OooOO0[i] = 4;
        this.OooO0oo[i] = str;
    }

    public final void OooO0o() {
        TreeMap treeMap = OooOO0o;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.OooO0Oo), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                it.getClass();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // com.cmaster.cloner.nk1
    public final void OooO0o0(int i, double d) {
        this.OooOO0[i] = 3;
        this.OooO0oO[i] = d;
    }

    @Override // com.cmaster.cloner.nk1
    public final void OooOO0(int i, byte[] bArr) {
        this.OooOO0[i] = 5;
        this.OooO[i] = bArr;
    }

    @Override // com.cmaster.cloner.ok1
    public final String OooOOOO() {
        String str = this.OooO0o0;
        if (str != null) {
            return str;
        }
        qa.OooO0o("Required value was null.");
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
