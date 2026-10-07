package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class s7 {
    public static final String OooO0O0;
    public static final String OooO0OO;
    public static final s7 OooO0Oo;
    public static final s7 OooO0o0;
    public final boolean OooO00o;

    static {
        v8 v8Var = lm1.OooO0OO;
        OooO0O0 = Character.toString((char) 8206);
        OooO0OO = Character.toString((char) 8207);
        OooO0Oo = new s7(false);
        OooO0o0 = new s7(true);
    }

    public s7(boolean z) {
        v8 v8Var = lm1.OooO00o;
        this.OooO00o = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
    
        if (r0.OooO0OO <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007b, code lost:
    
        switch(r0.OooO00o()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007f, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0085, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0088, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008b, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int OooO00o(java.lang.String r9) {
        /*
            com.cmaster.cloner.r7 r0 = new com.cmaster.cloner.r7
            r0.<init>(r9)
            r9 = 0
            r0.OooO0OO = r9
            r1 = r9
            r2 = r1
            r3 = r2
        Lb:
            int r4 = r0.OooO0OO
            int r5 = r0.OooO0O0
            r6 = -1
            r7 = 1
            if (r4 >= r5) goto L6d
            if (r1 != 0) goto L6d
            java.lang.String r5 = r0.OooO00o
            char r4 = r5.charAt(r4)
            r0.OooO0Oo = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            int r8 = r0.OooO0OO
            if (r4 == 0) goto L37
            int r4 = java.lang.Character.codePointAt(r5, r8)
            int r5 = r0.OooO0OO
            int r8 = java.lang.Character.charCount(r4)
            int r8 = r8 + r5
            r0.OooO0OO = r8
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L4a
        L37:
            int r8 = r8 + 1
            r0.OooO0OO = r8
            char r4 = r0.OooO0Oo
            r5 = 1792(0x700, float:2.511E-42)
            if (r4 >= r5) goto L46
            byte[] r5 = com.cmaster.cloner.r7.OooO0o0
            r4 = r5[r4]
            goto L4a
        L46:
            byte r4 = java.lang.Character.getDirectionality(r4)
        L4a:
            if (r4 == 0) goto L68
            if (r4 == r7) goto L65
            r5 = 2
            if (r4 == r5) goto L65
            r5 = 9
            if (r4 == r5) goto Lb
            switch(r4) {
                case 14: goto L61;
                case 15: goto L61;
                case 16: goto L5d;
                case 17: goto L5d;
                case 18: goto L59;
                default: goto L58;
            }
        L58:
            goto L6b
        L59:
            int r3 = r3 + (-1)
            r2 = r9
            goto Lb
        L5d:
            int r3 = r3 + 1
            r2 = r7
            goto Lb
        L61:
            int r3 = r3 + 1
            r2 = r6
            goto Lb
        L65:
            if (r3 != 0) goto L6b
            goto L84
        L68:
            if (r3 != 0) goto L6b
            goto L8a
        L6b:
            r1 = r3
            goto Lb
        L6d:
            if (r1 != 0) goto L70
            goto L8b
        L70:
            if (r2 == 0) goto L73
            return r2
        L73:
            int r2 = r0.OooO0OO
            if (r2 <= 0) goto L8b
            byte r2 = r0.OooO00o()
            switch(r2) {
                case 14: goto L88;
                case 15: goto L88;
                case 16: goto L82;
                case 17: goto L82;
                case 18: goto L7f;
                default: goto L7e;
            }
        L7e:
            goto L73
        L7f:
            int r3 = r3 + 1
            goto L73
        L82:
            if (r1 != r3) goto L85
        L84:
            return r7
        L85:
            int r3 = r3 + (-1)
            goto L73
        L88:
            if (r1 != r3) goto L85
        L8a:
            return r6
        L8b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.s7.OooO00o(java.lang.String):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int OooO0O0(java.lang.String r6) {
        /*
            com.cmaster.cloner.r7 r0 = new com.cmaster.cloner.r7
            r0.<init>(r6)
            int r6 = r0.OooO0O0
            r0.OooO0OO = r6
            r6 = 0
            r1 = r6
        Lb:
            r2 = r1
        Lc:
            int r3 = r0.OooO0OO
            if (r3 <= 0) goto L3f
            byte r3 = r0.OooO00o()
            if (r3 == 0) goto L38
            r4 = 1
            if (r3 == r4) goto L32
            r5 = 2
            if (r3 == r5) goto L32
            r5 = 9
            if (r3 == r5) goto Lc
            switch(r3) {
                case 14: goto L2f;
                case 15: goto L2f;
                case 16: goto L29;
                case 17: goto L29;
                case 18: goto L26;
                default: goto L23;
            }
        L23:
            if (r2 != 0) goto Lc
            goto L3e
        L26:
            int r1 = r1 + 1
            goto Lc
        L29:
            if (r2 != r1) goto L2c
            goto L34
        L2c:
            int r1 = r1 + (-1)
            goto Lc
        L2f:
            if (r2 != r1) goto L2c
            goto L3a
        L32:
            if (r1 != 0) goto L35
        L34:
            return r4
        L35:
            if (r2 != 0) goto Lc
            goto L3e
        L38:
            if (r1 != 0) goto L3c
        L3a:
            r6 = -1
            return r6
        L3c:
            if (r2 != 0) goto Lc
        L3e:
            goto Lb
        L3f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.s7.OooO0O0(java.lang.String):int");
    }
}
