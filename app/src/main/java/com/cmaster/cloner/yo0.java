package com.cmaster.cloner;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class yo0 {
    public final int OooO00o;
    public final boolean OooO0O0;
    public final int OooO0OO;
    public final /* synthetic */ AtomicReferenceArray OooO0Oo;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater OooO0o0 = AtomicReferenceFieldUpdater.newUpdater(yo0.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater OooO0o = AtomicLongFieldUpdater.newUpdater(yo0.class, "_state$volatile");
    public static final uk1 OooO0oO = new uk1("REMOVE_FROZEN", 0);

    public yo0(int i, boolean z) {
        this.OooO00o = i;
        this.OooO0O0 = z;
        int i2 = i - 1;
        this.OooO0OO = i2;
        this.OooO0Oo = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            qa.OooO0o("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        qa.OooO0o("Check failed.");
        throw null;
    }

    public final int OooO00o(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = OooO0o;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.OooO0OO;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.OooO0O0;
            AtomicReferenceArray atomicReferenceArray = this.OooO0Oo;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                yo0 yo0Var = this;
                if (OooO0o.compareAndSet(yo0Var, j, ((-1152921503533105153L) & j) | (((i2 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    yo0 yo0VarOooO0OO = yo0Var;
                    while ((atomicLongFieldUpdater.get(yo0VarOooO0OO) & 1152921504606846976L) != 0) {
                        yo0VarOooO0OO = yo0VarOooO0OO.OooO0OO();
                        AtomicReferenceArray atomicReferenceArray2 = yo0VarOooO0OO.OooO0Oo;
                        int i4 = yo0VarOooO0OO.OooO0OO & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof xo0) && ((xo0) obj2).OooO00o == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            yo0VarOooO0OO = null;
                        }
                        if (yo0VarOooO0OO == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                this = yo0Var;
            } else {
                int i5 = this.OooO00o;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean OooO0O0() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = OooO0o;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            yo0 yo0Var = this;
            if (atomicLongFieldUpdater.compareAndSet(yo0Var, j, 2305843009213693952L | j)) {
                return true;
            }
            this = yo0Var;
        }
    }

    public final yo0 OooO0OO() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        yo0 yo0Var;
        while (true) {
            atomicLongFieldUpdater = OooO0o;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                yo0Var = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            yo0Var = this;
            if (atomicLongFieldUpdater.compareAndSet(yo0Var, j, j2)) {
                j = j2;
                break;
            }
            this = yo0Var;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooO0o0;
            yo0 yo0Var2 = (yo0) atomicReferenceFieldUpdater.get(yo0Var);
            if (yo0Var2 != null) {
                return yo0Var2;
            }
            yo0 yo0Var3 = new yo0(yo0Var.OooO00o * 2, yo0Var.OooO0O0);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = yo0Var.OooO0OO;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object xo0Var = yo0Var.OooO0Oo.get(i4);
                if (xo0Var == null) {
                    xo0Var = new xo0(i);
                }
                yo0Var3.OooO0Oo.set(yo0Var3.OooO0OO & i, xo0Var);
                i++;
            }
            atomicLongFieldUpdater.set(yo0Var3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(yo0Var, null, yo0Var3) && atomicReferenceFieldUpdater.get(yo0Var) == null) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object OooO0Oo() {
        /*
            r30 = this;
            r1 = r30
        L2:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = com.cmaster.cloner.yo0.OooO0o
            long r2 = r6.get(r1)
            r7 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r7
            r9 = 0
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 == 0) goto L15
            com.cmaster.cloner.uk1 r0 = com.cmaster.cloner.yo0.OooO0oO
            return r0
        L15:
            r11 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r2 & r11
            int r0 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r13 = 30
            long r4 = r4 >> r13
            int r4 = (int) r4
            int r5 = r1.OooO0OO
            r4 = r4 & r5
            r13 = r0 & r5
            r14 = 0
            if (r4 != r13) goto L2e
            goto L41
        L2e:
            java.util.concurrent.atomic.AtomicReferenceArray r15 = r1.OooO0Oo
            java.lang.Object r4 = r15.get(r13)
            boolean r5 = r1.OooO0O0
            if (r4 != 0) goto L3b
            if (r5 == 0) goto L2
            goto L41
        L3b:
            r16 = r7
            boolean r7 = r4 instanceof com.cmaster.cloner.xo0
            if (r7 == 0) goto L42
        L41:
            return r14
        L42:
            int r0 = r0 + 1
            r7 = 1073741823(0x3fffffff, float:1.9999999)
            r0 = r0 & r7
            r7 = -1073741824(0xffffffffc0000000, double:NaN)
            long r18 = r2 & r7
            r20 = r7
            long r7 = (long) r0
            long r18 = r18 | r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = com.cmaster.cloner.yo0.OooO0o
            r28 = r18
            r18 = r4
            r19 = r5
            r4 = r28
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L66
            r15.set(r13, r14)
            return r18
        L66:
            r1 = r30
            if (r19 == 0) goto L2
        L6a:
            long r24 = r6.get(r1)
            long r2 = r24 & r11
            int r0 = (int) r2
            long r2 = r24 & r16
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 == 0) goto L7d
            com.cmaster.cloner.yo0 r0 = r1.OooO0OO()
            r1 = r0
            goto L96
        L7d:
            long r2 = r24 & r20
            long r26 = r2 | r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r22 = com.cmaster.cloner.yo0.OooO0o
            r23 = r1
            boolean r1 = r22.compareAndSet(r23, r24, r26)
            r2 = r23
            if (r1 == 0) goto L99
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r2.OooO0Oo
            int r2 = r2.OooO0OO
            r0 = r0 & r2
            r1.set(r0, r14)
            r1 = r14
        L96:
            if (r1 != 0) goto L6a
            return r18
        L99:
            r1 = r2
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.yo0.OooO0Oo():java.lang.Object");
    }
}
