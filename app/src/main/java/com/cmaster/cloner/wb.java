package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class wb extends h00 implements Comparable {
    public static final wb OooO0o = new wb(0);

    @Override // java.lang.Comparable
    /* renamed from: OooO, reason: merged with bridge method [inline-methods] */
    public final int compareTo(wb wbVar) {
        if (this != wbVar) {
            int length = this.OooO0o0.length;
            int length2 = wbVar.OooO0o0.length;
            int iMin = Math.min(length, length2);
            for (int i = 0; i < iMin; i++) {
                int iOooO00o = ((vb) OooO0o0(i)).compareTo((vb) wbVar.OooO0o0(i));
                if (iOooO00o != 0) {
                    return iOooO00o;
                }
            }
            if (length < length2) {
                return -1;
            }
            if (length > length2) {
                return 1;
            }
        }
        return 0;
    }

    @Override // com.cmaster.cloner.h00, com.cmaster.cloner.ln1
    public final String OooO00o() {
        return OooOO0("", "");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String OooOO0(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 100
            r0.<init>(r1)
            java.lang.Object[] r1 = r8.OooO0o0
            int r2 = r1.length
            r0.append(r9)
            r0.append(r10)
            r10 = 6
            byte[] r10 = new byte[r10]
            r10 = {x00b0: FILL_ARRAY_DATA , data: [-74, -29, 34, -42, 63, -126} // fill-array
            r3 = 8
            byte[] r4 = new byte[r3]
            r4 = {x00b8: FILL_ARRAY_DATA , data: [-43, -126, 86, -75, 87, -94, 66, 69} // fill-array
            java.lang.String r10 = com.cmaster.cloner.u7.OooO00o(r10, r4)
            r0.append(r10)
            r10 = 0
            r4 = r10
        L26:
            if (r4 >= r2) goto Laa
            java.lang.Object r5 = r8.OooO0o0(r4)
            com.cmaster.cloner.vb r5 = (com.cmaster.cloner.vb) r5
            if (r4 == 0) goto L4a
            r6 = 2
            byte[] r6 = new byte[r6]
            r6 = {x00c0: FILL_ARRAY_DATA , data: [47, 38} // fill-array
            byte[] r7 = new byte[r3]
            r7 = {x00c6: FILL_ARRAY_DATA , data: [3, 44, -102, 3, 10, 30, 67, -92} // fill-array
            java.lang.String r6 = com.cmaster.cloner.u7.OooO00o(r6, r7)
            r0.append(r6)
            r0.append(r9)
            java.lang.String r6 = "  "
            r0.append(r6)
        L4a:
            int r6 = r2 + (-1)
            if (r4 != r6) goto L78
            int r6 = r1.length
            if (r6 != 0) goto L53
            r6 = r10
            goto L63
        L53:
            int r6 = r6 + (-1)
            java.lang.Object r6 = r8.OooO0o0(r6)
            com.cmaster.cloner.vb r6 = (com.cmaster.cloner.vb) r6
            com.cmaster.cloner.nl r6 = r6.OooO0Oo
            com.cmaster.cloner.nl r7 = com.cmaster.cloner.nl.OooO0oO
            boolean r6 = r6.equals(r7)
        L63:
            if (r6 == 0) goto L78
            r6 = 5
            byte[] r6 = new byte[r6]
            r6 = {x00ce: FILL_ARRAY_DATA , data: [69, 120, -67, -121, 40} // fill-array
            byte[] r7 = new byte[r3]
            r7 = {x00d6: FILL_ARRAY_DATA , data: [121, 25, -45, -2, 22, -79, 10, 74} // fill-array
            java.lang.String r6 = com.cmaster.cloner.u7.OooO00o(r6, r7)
            r0.append(r6)
            goto L83
        L78:
            com.cmaster.cloner.nl r6 = r5.OooO0Oo
            com.cmaster.cloner.vp1 r6 = r6.OooO0Oo
            java.lang.String r6 = r6.OooO00o()
            r0.append(r6)
        L83:
            r6 = 4
            byte[] r6 = new byte[r6]
            r6 = {x00de: FILL_ARRAY_DATA , data: [-66, -49, 23, 47} // fill-array
            byte[] r7 = new byte[r3]
            r7 = {x00e4: FILL_ARRAY_DATA , data: [-98, -30, 41, 15, -6, 66, 120, -125} // fill-array
            java.lang.String r6 = com.cmaster.cloner.u7.OooO00o(r6, r7)
            r0.append(r6)
            int r5 = r5.OooO0o0
            char r6 = (char) r5
            if (r5 != r6) goto L9f
            java.lang.String r5 = com.cmaster.cloner.js2.OooO0O0(r5)
            goto La3
        L9f:
            java.lang.String r5 = com.cmaster.cloner.js2.OooO0OO(r5)
        La3:
            r0.append(r5)
            int r4 = r4 + 1
            goto L26
        Laa:
            java.lang.String r8 = r0.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.wb.OooOO0(java.lang.String, java.lang.String):java.lang.String");
    }
}
