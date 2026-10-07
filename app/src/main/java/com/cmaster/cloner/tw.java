package com.cmaster.cloner;

import java.io.Serializable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class tw extends o0OOO0o implements sw, Serializable {
    public final Enum[] OooO0Oo;

    public tw(Enum[] enumArr) {
        this.OooO0Oo = enumArr;
    }

    @Override // com.cmaster.cloner.o0OOO0o
    public final int OooO00o() {
        return this.OooO0Oo.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    @Override // com.cmaster.cloner.o0OOO0o, java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean contains(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof java.lang.Enum
            if (r0 != 0) goto L5
            goto L1a
        L5:
            java.lang.Enum r3 = (java.lang.Enum) r3
            int r0 = r3.ordinal()
            if (r0 < 0) goto L15
            java.lang.Enum[] r2 = r2.OooO0Oo
            int r1 = r2.length
            if (r0 >= r1) goto L15
            r2 = r2[r0]
            goto L16
        L15:
            r2 = 0
        L16:
            if (r2 != r3) goto L1a
            r2 = 1
            return r2
        L1a:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.tw.contains(java.lang.Object):boolean");
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.OooO0Oo;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        ra.OooO0oO(px0.OooOOO0(i, length, "index: ", ", size: "));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    @Override // com.cmaster.cloner.o0OOO0o, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int indexOf(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof java.lang.Enum
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Enum r4 = (java.lang.Enum) r4
            int r0 = r4.ordinal()
            if (r0 < 0) goto L16
            java.lang.Enum[] r3 = r3.OooO0Oo
            int r2 = r3.length
            if (r0 >= r2) goto L16
            r3 = r3[r0]
            goto L17
        L16:
            r3 = 0
        L17:
            if (r3 != r4) goto L1a
            return r0
        L1a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.tw.indexOf(java.lang.Object):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    @Override // com.cmaster.cloner.o0OOO0o, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int lastIndexOf(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof java.lang.Enum
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Enum r4 = (java.lang.Enum) r4
            int r0 = r4.ordinal()
            if (r0 < 0) goto L16
            java.lang.Enum[] r3 = r3.OooO0Oo
            int r2 = r3.length
            if (r0 >= r2) goto L16
            r3 = r3[r0]
            goto L17
        L16:
            r3 = 0
        L17:
            if (r3 != r4) goto L1a
            return r0
        L1a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.tw.lastIndexOf(java.lang.Object):int");
    }
}
