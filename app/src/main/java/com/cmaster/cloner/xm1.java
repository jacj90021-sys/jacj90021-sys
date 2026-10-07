package com.cmaster.cloner;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class xm1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater OooO0O0 = AtomicIntegerFieldUpdater.newUpdater(xm1.class, "_size$volatile");
    public zw[] OooO00o;
    private volatile /* synthetic */ int _size$volatile;

    public final void OooO00o(zw zwVar) {
        zwVar.OooO0Oo((ax) this);
        zw[] zwVarArr = this.OooO00o;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = OooO0O0;
        if (zwVarArr == null) {
            zwVarArr = new zw[4];
            this.OooO00o = zwVarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= zwVarArr.length) {
            zwVarArr = (zw[]) Arrays.copyOf(zwVarArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.OooO00o = zwVarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        zwVarArr[i] = zwVar;
        zwVar.OooO0o0 = i;
        OooO0OO(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.cmaster.cloner.zw OooO0O0(int r9) {
        /*
            r8 = this;
            com.cmaster.cloner.zw[] r0 = r8.OooO00o
            r0.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = com.cmaster.cloner.xm1.OooO0O0
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.OooO0Oo(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            r4.getClass()
            r5 = r0[r2]
            r5.getClass()
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.OooO0Oo(r9, r2)
            r8.OooO0OO(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            com.cmaster.cloner.zw[] r5 = r8.OooO00o
            r5.getClass()
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            r6.getClass()
            r7 = r5[r4]
            r7.getClass()
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            r4.getClass()
            r5 = r5[r2]
            r5.getClass()
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.OooO0Oo(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            r9.getClass()
            r2 = 0
            r9.OooO0Oo(r2)
            r9.OooO0o0 = r3
            int r8 = r1.get(r8)
            r0[r8] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.xm1.OooO0O0(int):com.cmaster.cloner.zw");
    }

    public final void OooO0OO(int i) {
        while (i > 0) {
            zw[] zwVarArr = this.OooO00o;
            zwVarArr.getClass();
            int i2 = (i - 1) / 2;
            zw zwVar = zwVarArr[i2];
            zwVar.getClass();
            zw zwVar2 = zwVarArr[i];
            zwVar2.getClass();
            if (zwVar.compareTo(zwVar2) <= 0) {
                return;
            }
            OooO0Oo(i, i2);
            i = i2;
        }
    }

    public final void OooO0Oo(int i, int i2) {
        zw[] zwVarArr = this.OooO00o;
        zwVarArr.getClass();
        zw zwVar = zwVarArr[i2];
        zwVar.getClass();
        zw zwVar2 = zwVarArr[i];
        zwVar2.getClass();
        zwVarArr[i] = zwVar;
        zwVarArr[i2] = zwVar2;
        zwVar.OooO0o0 = i;
        zwVar2.OooO0o0 = i2;
    }
}
