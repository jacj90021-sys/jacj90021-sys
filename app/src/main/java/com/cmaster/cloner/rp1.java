package com.cmaster.cloner;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class rp1 {
    public static final String[] OooOO0O = {"INSERT", "UPDATE", "DELETE"};
    public final Serializable OooO;
    public boolean OooO00o;
    public final Object OooO0O0;
    public final Object OooO0OO;
    public Object OooO0Oo;
    public final Object OooO0o;
    public final Object OooO0o0;
    public final Object OooO0oO;
    public final Object OooO0oo;
    public Object OooOO0;

    public rp1(tb1 tb1Var, HashMap map, HashMap map2, String[] strArr, boolean z, kj0 kj0Var) {
        String lowerCase;
        this.OooO0O0 = tb1Var;
        this.OooO0OO = map;
        this.OooO00o = z;
        this.OooO0Oo = kj0Var;
        this.OooO = new AtomicBoolean(false);
        this.OooOO0 = new b30(4);
        this.OooO0o0 = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            lowerCase2.getClass();
            ((LinkedHashMap) this.OooO0o0).put(lowerCase2, Integer.valueOf(i));
            String str2 = (String) ((HashMap) this.OooO0OO).get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.OooO0o = strArr2;
        for (Map.Entry entry : ((HashMap) this.OooO0OO).entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            lowerCase3.getClass();
            if (((LinkedHashMap) this.OooO0o0).containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase4.getClass();
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.OooO0o0;
                linkedHashMap.getClass();
                Object obj = linkedHashMap.get(lowerCase3);
                if (obj == null && !linkedHashMap.containsKey(lowerCase3)) {
                    throw new NoSuchElementException("Key " + ((Object) lowerCase3) + " is missing in the map.");
                }
                linkedHashMap.put(lowerCase4, obj);
            }
        }
        this.OooO0oO = new km(((String[]) this.OooO0o).length);
        this.OooO0oo = new o00OO000(((String[]) this.OooO0o).length);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object OooO00o(com.cmaster.cloner.rp1 r4, com.cmaster.cloner.h31 r5, com.cmaster.cloner.ij r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof com.cmaster.cloner.kp1
            if (r0 == 0) goto L13
            r0 = r6
            com.cmaster.cloner.kp1 r0 = (com.cmaster.cloner.kp1) r0
            int r1 = r0.OooOO0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.OooOO0 = r1
            goto L18
        L13:
            com.cmaster.cloner.kp1 r0 = new com.cmaster.cloner.kp1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.OooO0oo
            int r6 = r0.OooOO0
            r1 = 2
            r2 = 1
            com.cmaster.cloner.gk r3 = com.cmaster.cloner.gk.OooO0Oo
            if (r6 == 0) goto L3d
            if (r6 == r2) goto L35
            if (r6 != r1) goto L2e
            java.lang.Object r5 = r0.OooO0oO
            java.util.Set r5 = (java.util.Set) r5
            com.cmaster.cloner.ty2.OooO0O0(r4)
            return r5
        L2e:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            com.cmaster.cloner.qa.OooO0o(r4)
            r4 = 0
            return r4
        L35:
            java.lang.Object r5 = r0.OooO0oO
            com.cmaster.cloner.h31 r5 = (com.cmaster.cloner.h31) r5
            com.cmaster.cloner.ty2.OooO0O0(r4)
            goto L53
        L3d:
            com.cmaster.cloner.ty2.OooO0O0(r4)
            com.cmaster.cloner.d81 r4 = new com.cmaster.cloner.d81
            r6 = 4
            r4.<init>(r6)
            r0.OooO0oO = r5
            r0.OooOO0 = r2
            java.lang.String r6 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r4 = r5.OooO00o(r6, r4, r0)
            if (r4 != r3) goto L53
            goto L67
        L53:
            java.util.Set r4 = (java.util.Set) r4
            boolean r6 = r4.isEmpty()
            if (r6 != 0) goto L68
            r0.OooO0oO = r4
            r0.OooOO0 = r1
            java.lang.String r6 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r5 = com.cmaster.cloner.u43.OooO00o(r5, r6, r0)
            if (r5 != r3) goto L68
        L67:
            return r3
        L68:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.rp1.OooO00o(com.cmaster.cloner.rp1, com.cmaster.cloner.h31, com.cmaster.cloner.ij):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008f A[Catch: all -> 0x009e, TRY_LEAVE, TryCatch #1 {all -> 0x009e, blocks: (B:34:0x0087, B:36:0x008f, B:20:0x0048, B:24:0x0057, B:28:0x006b, B:30:0x007a, B:42:0x00a7, B:43:0x00ac), top: B:49:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object OooO0O0(com.cmaster.cloner.rp1 r8, com.cmaster.cloner.ij r9) throws java.lang.Throwable {
        /*
            java.lang.Object r0 = r8.OooO0O0
            com.cmaster.cloner.tb1 r0 = (com.cmaster.cloner.tb1) r0
            boolean r1 = r9 instanceof com.cmaster.cloner.lp1
            if (r1 == 0) goto L17
            r1 = r9
            com.cmaster.cloner.lp1 r1 = (com.cmaster.cloner.lp1) r1
            int r2 = r1.OooOO0O
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.OooOO0O = r2
            goto L1c
        L17:
            com.cmaster.cloner.lp1 r1 = new com.cmaster.cloner.lp1
            r1.<init>(r8, r9)
        L1c:
            java.lang.Object r9 = r1.OooO
            int r2 = r1.OooOO0O
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 != r4) goto L35
            com.cmaster.cloner.o0O000O r8 = r1.OooO0oo
            com.cmaster.cloner.rp1 r0 = r1.OooO0oO
            com.cmaster.cloner.ty2.OooO0O0(r9)     // Catch: java.lang.Throwable -> L32
            r7 = r9
            r9 = r8
            r8 = r0
            r0 = r7
            goto L87
        L32:
            r9 = move-exception
            goto Lad
        L35:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.cmaster.cloner.qa.OooO0o(r8)
            return r3
        L3b:
            com.cmaster.cloner.ty2.OooO0O0(r9)
            com.cmaster.cloner.o0O000O r9 = r0.OooO0o
            boolean r2 = r9.OooO0OO()
            com.cmaster.cloner.qv r5 = com.cmaster.cloner.qv.OooO0Oo
            if (r2 == 0) goto Lb1
            java.io.Serializable r2 = r8.OooO     // Catch: java.lang.Throwable -> L9e
            java.util.concurrent.atomic.AtomicBoolean r2 = (java.util.concurrent.atomic.AtomicBoolean) r2     // Catch: java.lang.Throwable -> L9e
            r6 = 0
            boolean r2 = r2.compareAndSet(r4, r6)     // Catch: java.lang.Throwable -> L9e
            if (r2 != 0) goto L57
            r9.OoooOoO()
            return r5
        L57:
            java.lang.Object r2 = r8.OooOO0     // Catch: java.lang.Throwable -> L9e
            com.cmaster.cloner.p30 r2 = (com.cmaster.cloner.p30) r2     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r2 = r2.OooO00o()     // Catch: java.lang.Throwable -> L9e
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L9e
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L9e
            if (r2 != 0) goto L6b
            r9.OoooOoO()
            return r5
        L6b:
            com.cmaster.cloner.mp1 r2 = new com.cmaster.cloner.mp1     // Catch: java.lang.Throwable -> L9e
            r2.<init>(r8, r3, r4)     // Catch: java.lang.Throwable -> L9e
            r1.OooO0oO = r8     // Catch: java.lang.Throwable -> L9e
            r1.OooO0oo = r9     // Catch: java.lang.Throwable -> L9e
            r1.OooOO0O = r4     // Catch: java.lang.Throwable -> L9e
            com.cmaster.cloner.pb1 r0 = r0.OooO0Oo     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto La7
            java.lang.Object r0 = r0.OooO0o     // Catch: java.lang.Throwable -> L9e
            com.cmaster.cloner.zg r0 = (com.cmaster.cloner.zg) r0     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r0 = r0.OooOOO0(r6, r2, r1)     // Catch: java.lang.Throwable -> L9e
            com.cmaster.cloner.gk r1 = com.cmaster.cloner.gk.OooO0Oo
            if (r0 != r1) goto L87
            return r1
        L87:
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Throwable -> L9e
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L9e
            if (r1 != 0) goto La3
            java.lang.Object r1 = r8.OooO0oo     // Catch: java.lang.Throwable -> L9e
            com.cmaster.cloner.o00OO000 r1 = (com.cmaster.cloner.o00OO000) r1     // Catch: java.lang.Throwable -> L9e
            r1.Oooo00O(r0)     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r8 = r8.OooO0Oo     // Catch: java.lang.Throwable -> L9e
            com.cmaster.cloner.kj0 r8 = (com.cmaster.cloner.kj0) r8     // Catch: java.lang.Throwable -> L9e
            r8.OooO0o(r0)     // Catch: java.lang.Throwable -> L9e
            goto La3
        L9e:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto Lad
        La3:
            r9.OoooOoO()
            return r0
        La7:
            java.lang.String r8 = "connectionManager"
            com.cmaster.cloner.ij0.OooO(r8)     // Catch: java.lang.Throwable -> L9e
            throw r3     // Catch: java.lang.Throwable -> L9e
        Lad:
            r8.OoooOoO()
            throw r9
        Lb1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.rp1.OooO0O0(com.cmaster.cloner.rp1, com.cmaster.cloner.ij):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        if (r15 == r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e6, code lost:
    
        if (com.cmaster.cloner.u43.OooO00o(r6, r15, r0) == r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e8, code lost:
    
        return r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r13v6, types: [com.cmaster.cloner.h31] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00e6 -> B:28:0x00e9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object OooO0OO(com.cmaster.cloner.rp1 r12, com.cmaster.cloner.lo1 r13, int r14, com.cmaster.cloner.ij r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.rp1.OooO0OO(com.cmaster.cloner.rp1, com.cmaster.cloner.lo1, int, com.cmaster.cloner.ij):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.cmaster.cloner.h31] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x008e -> B:19:0x0091). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object OooO0Oo(com.cmaster.cloner.rp1 r7, com.cmaster.cloner.lo1 r8, int r9, com.cmaster.cloner.ij r10) throws java.lang.Throwable {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof com.cmaster.cloner.op1
            if (r0 == 0) goto L16
            r0 = r10
            com.cmaster.cloner.op1 r0 = (com.cmaster.cloner.op1) r0
            int r1 = r0.OooOOO
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.OooOOO = r1
            goto L1b
        L16:
            com.cmaster.cloner.op1 r0 = new com.cmaster.cloner.op1
            r0.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r0.OooOO0o
            int r1 = r0.OooOOO
            r2 = 1
            if (r1 == 0) goto L3b
            if (r1 != r2) goto L34
            int r7 = r0.OooOO0O
            int r8 = r0.OooOO0
            java.lang.String[] r9 = r0.OooO
            java.lang.String r1 = r0.OooO0oo
            com.cmaster.cloner.h31 r3 = r0.OooO0oO
            com.cmaster.cloner.ty2.OooO0O0(r10)
            r10 = r9
            r9 = r3
            goto L91
        L34:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.cmaster.cloner.qa.OooO0o(r7)
            r7 = 0
            return r7
        L3b:
            com.cmaster.cloner.ty2.OooO0O0(r10)
            java.lang.Object r7 = r7.OooO0o
            java.lang.String[] r7 = (java.lang.String[]) r7
            r7 = r7[r9]
            java.lang.String[] r9 = com.cmaster.cloner.rp1.OooOO0O
            r10 = 0
            r1 = 3
            r6 = r1
            r1 = r7
            r7 = r6
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L4f:
            if (r8 >= r7) goto L93
            r3 = r10[r8]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "room_table_modification_trigger_"
            r4.<init>(r5)
            r4.append(r1)
            r5 = 95
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "DROP TRIGGER IF EXISTS `"
            r4.<init>(r5)
            r4.append(r3)
            r3 = 96
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.OooO0oO = r9
            r0.OooO0oo = r1
            r0.OooO = r10
            r0.OooOO0 = r8
            r0.OooOO0O = r7
            r0.OooOOO = r2
            java.lang.Object r3 = com.cmaster.cloner.u43.OooO00o(r9, r3, r0)
            com.cmaster.cloner.gk r4 = com.cmaster.cloner.gk.OooO0Oo
            if (r3 != r4) goto L91
            return r4
        L91:
            int r8 = r8 + r2
            goto L4f
        L93:
            com.cmaster.cloner.vq1 r7 = com.cmaster.cloner.vq1.OooO00o
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.rp1.OooO0Oo(com.cmaster.cloner.rp1, com.cmaster.cloner.lo1, int, com.cmaster.cloner.ij):java.lang.Object");
    }

    public static void OooO0oo(co0 co0Var, xp1 xp1Var) {
        if (co0Var.OooO0O0.equals(xp1Var)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(u7.OooO00o(new byte[]{90, -98, 103, 62, 50, -51, 57, 52, 76, -37}, new byte[]{40, -5, 22, 75, 87, -66, 77, 81}));
        sb.append(xp1Var);
        qa.OooO0oo(sb, u7.OooO00o(new byte[]{-56, -63, 17, 127, 80, -51, -91, -81, -56}, new byte[]{-24, -93, 100, 11, 112, -70, -60, -36}), co0Var.OooO0O0);
    }

    public co0 OooO(int i, xp1 xp1Var) {
        if (((co0) this.OooO0o0) != null) {
            i++;
        }
        co0 co0Var = (co0) ((ArrayList) this.OooO0o).get(i);
        OooO0oo(co0Var, xp1Var);
        return co0Var;
    }

    public void OooO0o(dl0 dl0Var) {
        rp1 rp1Var = dl0Var.OooO0O0;
        if (rp1Var == this) {
            return;
        }
        if (rp1Var != null) {
            ra.OooOOO(u7.OooO00o(new byte[]{-65, -99, 20, 78, -60, -124, 41, 105, -104, -109, 10, 84, -117, -100, 104, 106, -103, -112, 65, 0, -62, -124, 41, 106, -103, -112, 21, 78, -52, -125, 41, 124, -109, -36, 27, 78, -60, -124, 97, 109, -114, -36, 57, 79, -49, -107}, new byte[]{-4, -4, 122, 32, -85, -16, 9, 8}));
        } else {
            dl0Var.OooO0O0 = this;
            ((ArrayList) this.OooO0OO).add(dl0Var);
        }
    }

    public void OooO0o0(ch0 ch0Var, dl0 dl0Var) {
        dl0 dl0Var2 = (dl0) this.OooO0Oo;
        if (dl0Var2 == null || !dl0Var2.OooO0OO) {
            qa.OooO0o(u7.OooO00o(new byte[]{-83, -110, 116, 19, -24, 64, 5, -71, -83, -119, 116, 28, -4, 80, 18, -80}, new byte[]{-61, -3, 84, 112, -99, 50, 119, -36}));
            return;
        }
        dl0Var2.OooO00o.add(ch0Var);
        int i = ch0Var.OooO0Oo.OooO0o0;
        if (i == 1) {
            if (dl0Var == null) {
                return;
            }
            ra.OooO0OO(u7.OooO00o(new byte[]{20, -73, -24, 64, 41, -8, -1, -16, 4, -67, -83, 90, 43, -4, -14, -25, 9, -29, -83}, new byte[]{97, -39, -115, 56, 89, -99, -100, -124}), dl0Var);
            return;
        }
        if (i == 2) {
            if (dl0Var == null) {
                this.OooO0Oo = null;
                return;
            } else {
                ra.OooO0OO(u7.OooO00o(new byte[]{-119, -120, 62, 30, -108, -56, -115, -126, -103, -126, 123, 4, -106, -52, -128, -107, -108, -36, 123}, new byte[]{-4, -26, 91, 102, -28, -83, -18, -10}), dl0Var);
                return;
            }
        }
        if (i == 3) {
            if (dl0Var == null) {
                ra.OooOOO(u7.OooO00o(new byte[]{-123, 119, -86, 8, -104, -78, 96, 46, -38, 37, -91, 19, -105, -74}, new byte[]{-25, 5, -53, 102, -5, -38, 64, 19}));
                return;
            } else {
                ((dl0) this.OooO0Oo).OooO0o0 = dl0Var;
                this.OooO0Oo = null;
                return;
            }
        }
        if (i == 4) {
            if (dl0Var == null) {
                ra.OooOOO(u7.OooO00o(new byte[]{58, -31, -39, 3, -77, -12, -35, 105, 101, -77, -42, 24, -68, -16}, new byte[]{88, -109, -72, 109, -48, -100, -3, 84}));
                return;
            }
            List list = Collections.EMPTY_LIST;
            dl0 dl0Var3 = new dl0();
            OooO0o(dl0Var3);
            dl0 dl0Var4 = (dl0) this.OooO0Oo;
            dl0Var4.OooO0o0 = dl0Var3;
            dl0Var4.OooO0o = dl0Var;
            dl0Var4.OooO0Oo = list;
            this.OooO0Oo = dl0Var3;
            dl0Var3.OooO0OO = true;
            return;
        }
        if (i != 6) {
            qa.OooOO0();
            return;
        }
        if (dl0Var != null) {
            ra.OooO0OO(u7.OooO00o(new byte[]{54, -62, 95, 125, 37, 106, 8, -47, 38, -56, 26, 103, 39, 110, 5, -58, 43, -106, 26}, new byte[]{67, -84, 58, 5, 85, 15, 107, -91}), dl0Var);
            return;
        }
        ArrayList arrayList = new ArrayList((ArrayList) this.OooO);
        dl0 dl0Var5 = new dl0();
        OooO0o(dl0Var5);
        dl0 dl0Var6 = (dl0) this.OooO0Oo;
        dl0Var6.OooO0o0 = dl0Var5;
        dl0Var6.OooO0o = null;
        dl0Var6.OooO0Oo = arrayList;
        this.OooO0Oo = dl0Var5;
        dl0Var5.OooO0OO = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (r7 == 7) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void OooO0oO(com.cmaster.cloner.co0 r12, com.cmaster.cloner.co0 r13) {
        /*
            r11 = this;
            com.cmaster.cloner.xp1 r0 = r13.OooO0O0
            com.cmaster.cloner.vp1 r0 = r0.OooO0O0
            int r1 = r0.OooO0o0
            r2 = 9
            java.lang.Object r3 = r11.OooO0oo
            r4 = 0
            if (r1 != r2) goto L30
            com.cmaster.cloner.zm1 r5 = new com.cmaster.cloner.zm1
            com.cmaster.cloner.bc1 r6 = com.cmaster.cloner.ec1.o000Oo0O
            r7 = r3
            com.cmaster.cloner.zh1 r7 = (com.cmaster.cloner.zh1) r7
            com.cmaster.cloner.u81 r13 = r13.OooO00o()
            com.cmaster.cloner.v81 r8 = com.cmaster.cloner.v81.OooO(r13)
            java.lang.Object r13 = r11.OooOO0
            r9 = r13
            com.cmaster.cloner.bj1 r9 = (com.cmaster.cloner.bj1) r9
            com.cmaster.cloner.xp1 r13 = r12.OooO0O0
            com.cmaster.cloner.nl r10 = r13.OooO0OO
            r5.<init>(r6, r7, r8, r9, r10)
            r11.OooO0o0(r5, r4)
            r13 = 1
            r11.OooOOOO(r12, r13)
            return
        L30:
            com.cmaster.cloner.y21 r2 = new com.cmaster.cloner.y21
            com.cmaster.cloner.xp1 r5 = r12.OooO0O0
            com.cmaster.cloner.vp1 r5 = r5.OooO0O0
            r6 = 6
            if (r1 != r6) goto L52
            int r1 = r5.OooO0o0
            r7 = 2
            if (r1 == r7) goto L4e
            r7 = 3
            if (r1 == r7) goto L4a
            r7 = 8
            if (r1 == r7) goto L46
            goto L52
        L46:
            com.cmaster.cloner.bc1 r0 = com.cmaster.cloner.ec1.o0000OOO
            goto Lad
        L4a:
            com.cmaster.cloner.bc1 r0 = com.cmaster.cloner.ec1.o0000OO
            goto Lad
        L4e:
            com.cmaster.cloner.bc1 r0 = com.cmaster.cloner.ec1.o0000OO0
            goto Lad
        L52:
            com.cmaster.cloner.bc1 r1 = com.cmaster.cloner.ec1.OooO00o
            int r1 = r5.OooO0OO()
            int r7 = r0.OooO0OO()
            r8 = 7
            r9 = 5
            r10 = 4
            if (r7 == r10) goto L97
            if (r7 == r9) goto L87
            if (r7 == r6) goto L68
            if (r7 != r8) goto La0
            goto L6e
        L68:
            if (r1 == r10) goto L84
            if (r1 == r9) goto L81
            if (r1 == r8) goto L7e
        L6e:
            if (r1 == r10) goto L7b
            if (r1 == r9) goto L78
            if (r1 == r6) goto L75
            goto L87
        L75:
            com.cmaster.cloner.bc1 r0 = com.cmaster.cloner.ec1.o00000o0
            goto Lad
        L78:
            com.cmaster.cloner.bc1 r0 = com.cmaster.cloner.ec1.o0000oO
            goto Lad
        L7b:
            com.cmaster.cloner.bc1 r0 = com.cmaster.cloner.ec1.o000OO
            goto Lad
        L7e:
            com.cmaster.cloner.bc1 r0 = com.cmaster.cloner.ec1.o00000oo
            goto Lad
        L81:
            com.cmaster.cloner.bc1 r0 = com.cmaster.cloner.ec1.o0000oo
            goto Lad
        L84:
            com.cmaster.cloner.bc1 r0 = com.cmaster.cloner.ec1.o0000O0O
            goto Lad
        L87:
            if (r1 == r10) goto L94
            if (r1 == r6) goto L91
            if (r1 == r8) goto L8e
            goto L97
        L8e:
            com.cmaster.cloner.bc1 r0 = com.cmaster.cloner.ec1.o0000
            goto Lad
        L91:
            com.cmaster.cloner.bc1 r0 = com.cmaster.cloner.ec1.o0000Ooo
            goto Lad
        L94:
            com.cmaster.cloner.bc1 r0 = com.cmaster.cloner.ec1.o0000O
            goto Lad
        L97:
            if (r1 == r9) goto Lab
            if (r1 == r6) goto La8
            if (r1 != r8) goto La0
            com.cmaster.cloner.bc1 r0 = com.cmaster.cloner.ec1.o0000O00
            goto Lad
        La0:
            com.cmaster.cloner.bj1 r11 = com.cmaster.cloner.bj1.OooOO0(r5, r0)
            com.cmaster.cloner.ec1.OooO0O0(r11)
            throw r4
        La8:
            com.cmaster.cloner.bc1 r0 = com.cmaster.cloner.ec1.o00000oO
            goto Lad
        Lab:
            com.cmaster.cloner.bc1 r0 = com.cmaster.cloner.ec1.o0000O0
        Lad:
            com.cmaster.cloner.zh1 r3 = (com.cmaster.cloner.zh1) r3
            com.cmaster.cloner.u81 r12 = r12.OooO00o()
            com.cmaster.cloner.u81 r13 = r13.OooO00o()
            com.cmaster.cloner.v81 r13 = com.cmaster.cloner.v81.OooO(r13)
            r2.<init>(r0, r3, r12, r13)
            r11.OooO0o0(r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.rp1.OooO0oO(com.cmaster.cloner.co0, com.cmaster.cloner.co0):void");
    }

    public co0 OooOO0(xp1 xp1Var) {
        co0 co0Var = (co0) this.OooO0o0;
        if (co0Var != null) {
            OooO0oo(co0Var, xp1Var);
            return co0Var;
        }
        qa.OooO0o(u7.OooO00o(new byte[]{109, 13, -14, 17, 0, 103, -88, 68, 123, 13, -5, 10, 13, 119, -88, 74, 127, 23, -3, 10, 29, 36, -23, 74, 125, 28, -32, 22, 73, 35, -4, 65, 119, 10, -76}, new byte[]{30, 121, -109, 101, 105, 4, -120, 41}));
        return null;
    }

    public void OooOO0O() {
        bc1 bc1Var;
        if (this.OooO00o) {
            throw new AssertionError();
        }
        this.OooO00o = true;
        ArrayList arrayList = (ArrayList) this.OooO0oO;
        int size = arrayList.size();
        int iOooO0Oo = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            co0 co0Var = (co0) obj;
            co0Var.OooO0OO = iOooO0Oo;
            xp1 xp1Var = co0Var.OooO0O0;
            co0Var.OooO0Oo = u81.OooO0Oo(iOooO0Oo, xp1Var.OooO0O0);
            iOooO0Oo += xp1Var.OooO0O0.OooO0Oo();
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = (ArrayList) this.OooO0o;
        int size2 = arrayList3.size();
        int i2 = 0;
        int iOooO0Oo2 = iOooO0Oo;
        while (i2 < size2) {
            Object obj2 = arrayList3.get(i2);
            i2++;
            co0 co0Var2 = (co0) obj2;
            cl clVarOooO = cl.OooO(iOooO0Oo2 - iOooO0Oo);
            co0Var2.OooO0OO = iOooO0Oo2;
            xp1 xp1Var2 = co0Var2.OooO0O0;
            co0Var2.OooO0Oo = u81.OooO0Oo(iOooO0Oo2, xp1Var2.OooO0O0);
            iOooO0Oo2 += xp1Var2.OooO0O0.OooO0Oo();
            vp1 vp1Var = xp1Var2.OooO0O0;
            bc1 bc1Var2 = ec1.OooO00o;
            int iOooO0OO = vp1Var.OooO0OO();
            if (iOooO0OO == 4) {
                bc1Var = ec1.OooOO0;
            } else if (iOooO0OO == 5) {
                bc1Var = ec1.OooO;
            } else if (iOooO0OO == 6) {
                bc1Var = ec1.OooO0oO;
            } else if (iOooO0OO == 7) {
                bc1Var = ec1.OooO0oo;
            } else {
                if (iOooO0OO != 9) {
                    ec1.OooO00o(vp1Var);
                    throw null;
                }
                bc1Var = ec1.OooOO0O;
            }
            arrayList2.add(new x21(bc1Var, (zh1) this.OooO0oo, co0Var2.OooO00o(), v81.OooO0o, clVarOooO));
        }
        ((dl0) ((ArrayList) this.OooO0OO).get(0)).OooO00o.addAll(0, arrayList2);
    }

    public void OooOO0o(bc1 bc1Var, tt0 tt0Var, co0 co0Var, co0 co0Var2, co0... co0VarArr) {
        zh1 zh1Var = (zh1) this.OooO0oo;
        int i = co0Var2 != null ? 1 : 0;
        v81 v81Var = new v81(co0VarArr.length + i);
        if (co0Var2 != null) {
            v81Var.OooO0o(0, co0Var2.OooO00o());
        }
        for (int i2 = 0; i2 < co0VarArr.length; i2++) {
            v81Var.OooO0o(i2 + i, co0VarArr[i2].OooO00o());
        }
        OooO0o0(new zm1(bc1Var, zh1Var, v81Var, (bj1) this.OooOO0, tt0Var.OooO0o0), null);
        if (co0Var != null) {
            OooOOOO(co0Var, false);
        }
    }

    public void OooOOO(co0 co0Var, Object obj) {
        bc1 bc1Var;
        if (obj == null) {
            bc1Var = ec1.OooOOo0;
        } else {
            vp1 vp1Var = co0Var.OooO0O0.OooO0O0;
            bc1 bc1Var2 = ec1.OooO00o;
            vp1Var.getClass();
            if (vp1Var == vp1.OooOOoo) {
                bc1Var = ec1.OooOOo0;
            } else {
                int iOooO0OO = vp1Var.OooO0OO();
                if (iOooO0OO == 4) {
                    bc1Var = ec1.OooOOOO;
                } else if (iOooO0OO == 5) {
                    bc1Var = ec1.OooOOO;
                } else if (iOooO0OO == 6) {
                    bc1Var = ec1.OooOO0o;
                } else if (iOooO0OO == 7) {
                    bc1Var = ec1.OooOOO0;
                } else {
                    if (iOooO0OO != 9) {
                        ec1.OooO00o(vp1Var);
                        throw null;
                    }
                    bc1Var = ec1.OooOOOo;
                }
            }
        }
        bc1 bc1Var3 = bc1Var;
        int i = bc1Var3.OooO0o0;
        zh1 zh1Var = (zh1) this.OooO0oo;
        if (i == 1) {
            OooO0o0(new x21(bc1Var3, zh1Var, co0Var.OooO00o(), v81.OooO0o, dp2.OooO00o(obj)), null);
        } else {
            OooO0o0(new zm1(bc1Var3, zh1Var, v81.OooO0o, (bj1) this.OooOO0, dp2.OooO00o(obj)), null);
            OooOOOO(co0Var, true);
        }
    }

    public void OooOOO0(tt0 tt0Var, co0 co0Var, co0 co0Var2, co0... co0VarArr) {
        p51 p51VarOooO0Oo = p51.OooO0Oo(tt0Var.OooO00o(true));
        bc1 bc1Var = ec1.OooO00o;
        OooOO0o(new bc1(51, p51VarOooO0Oo.OooO0OO(), bj1.OooOOO0), tt0Var, co0Var, co0Var2, co0VarArr);
    }

    public void OooOOOO(co0 co0Var, boolean z) {
        bc1 bc1Var;
        if (z) {
            vp1 vp1Var = co0Var.OooO0O0.OooO0O0;
            bc1 bc1Var2 = ec1.OooO00o;
            vp1Var.getClass();
            bc1Var = new bc1(56, vp1Var, bj1.OooO0o, null);
        } else {
            vp1 vp1Var2 = co0Var.OooO0O0.OooO0O0;
            bc1 bc1Var3 = ec1.OooO00o;
            vp1Var2.getClass();
            bc1Var = new bc1(55, vp1Var2, bj1.OooO0o, null);
        }
        OooO0o0(new y21(bc1Var, (zh1) this.OooO0oo, co0Var.OooO00o(), v81.OooO0o), null);
    }

    public co0 OooOOOo(xp1 xp1Var) {
        if (this.OooO00o) {
            qa.OooO0o(u7.OooO00o(new byte[]{125, -101, 110, -2, 102, -89, -25, 101, 82, -106, 111, -13, 104, -89, -94, 36, 82, -107, 99, -15, 101, -96, -25, 101, 88, -114, 101, -30, 41, -78, -93, 96, 87, -108, 103, -80, 96, -67, -76, 112, 76, -113, 99, -28, 96, -68, -87, 119}, new byte[]{62, -6, 0, -112, 9, -45, -57, 4}));
            return null;
        }
        co0 co0Var = new co0(this, xp1Var);
        ((ArrayList) this.OooO0oO).add(co0Var);
        return co0Var;
    }

    public void OooOOo(co0 co0Var) {
        bc1 bc1Var;
        xp1 xp1Var = co0Var.OooO0O0;
        tt0 tt0Var = (tt0) this.OooO0O0;
        if (!xp1Var.equals(tt0Var.OooO0O0)) {
            StringBuilder sb = new StringBuilder();
            sb.append(u7.OooO00o(new byte[]{101, -53, -111, -115, 37, -94, 75, -66, 33}, new byte[]{1, -82, -14, -31, 68, -48, 46, -38}));
            sb.append(tt0Var.OooO0O0);
            qa.OooO0oo(sb, u7.OooO00o(new byte[]{-26, -65, 6, -88, 13, -114, 71, 124, -77, -81, 29, -71, 73, -36}, new byte[]{-58, -35, 115, -36, 45, -4, 34, 8}), xp1Var);
            return;
        }
        vp1 vp1Var = xp1Var.OooO0O0;
        bc1 bc1Var2 = ec1.OooO00o;
        int iOooO0OO = vp1Var.OooO0OO();
        if (iOooO0OO == 0) {
            bc1Var = ec1.o0000OOo;
        } else if (iOooO0OO == 9) {
            bc1Var = ec1.o0000o0O;
        } else if (iOooO0OO == 4) {
            bc1Var = ec1.o0000o0;
        } else if (iOooO0OO == 5) {
            bc1Var = ec1.o0000OoO;
        } else if (iOooO0OO == 6) {
            bc1Var = ec1.o0000Oo0;
        } else {
            if (iOooO0OO != 7) {
                ec1.OooO00o(vp1Var);
                throw null;
            }
            bc1Var = ec1.o0000Oo;
        }
        OooO0o0(new y21(bc1Var, (zh1) this.OooO0oo, null, v81.OooO(co0Var.OooO00o())), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void OooOOo0(p30 p30Var, p30 p30Var2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        p30Var.getClass();
        p30Var2.getClass();
        boolean z = true;
        char c = 1;
        if (((AtomicBoolean) this.OooO).compareAndSet(false, true)) {
            p30Var.OooO00o();
            dj djVar = ((tb1) this.OooO0O0).OooO00o;
            gj gjVar = null;
            if (djVar == null) {
                ij0.OooO("coroutineScope");
                throw null;
            }
            vj bkVar = new bk();
            dh dhVar = new dh(this, p30Var2, gjVar, 4);
            if ((2 & 1) != 0) {
                bkVar = lv.OooO0Oo;
            }
            vj vjVarOooO00o = mp2.OooO00o(djVar.OooO00o(), bkVar, true);
            wo woVar = gs.OooO00o;
            if (vjVarOooO00o != woVar && vjVarOooO00o.OooO0oo(oOO0OO.OooO0o0) == null) {
                vjVarOooO00o = vjVarOooO00o.OooO(woVar);
            }
            OooOOO hpVar = new hp(vjVarOooO00o, z, c == true ? 1 : 0);
            hpVar.OoooO0O(ik.OooO0Oo, hpVar, dhVar);
        }
    }

    public void OooOOoo() {
        tt0 tt0Var = (tt0) this.OooO0O0;
        if (tt0Var.OooO0O0.equals(xp1.OooOO0o)) {
            OooO0o0(new y21(ec1.o0000OOo, (zh1) this.OooO0oo, null, v81.OooO0o), null);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(u7.OooO00o(new byte[]{-24, 70, -114, -14, -45, 121, -66, 6, -84}, new byte[]{-116, 35, -19, -98, -78, 11, -37, 98}));
        sb.append(tt0Var.OooO0O0);
        ra.OooOOO(rj.OooO0oo(new byte[]{40, -105, -32, -127, -121, 127, -37, 45, 125, -121, -5, -112, -61, 45, -56, 54, 97, -111}, new byte[]{8, -11, -107, -11, -89, 13, -66, 89}, sb));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object OooOo00(com.cmaster.cloner.ij r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.Object r0 = r7.OooO0O0
            com.cmaster.cloner.tb1 r0 = (com.cmaster.cloner.tb1) r0
            boolean r1 = r8 instanceof com.cmaster.cloner.pp1
            if (r1 == 0) goto L17
            r1 = r8
            com.cmaster.cloner.pp1 r1 = (com.cmaster.cloner.pp1) r1
            int r2 = r1.OooOO0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.OooOO0 = r2
            goto L1c
        L17:
            com.cmaster.cloner.pp1 r1 = new com.cmaster.cloner.pp1
            r1.<init>(r7, r8)
        L1c:
            java.lang.Object r8 = r1.OooO0oo
            int r2 = r1.OooOO0
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2e
            com.cmaster.cloner.o0O000O r7 = r1.OooO0oO
            com.cmaster.cloner.ty2.OooO0O0(r8)     // Catch: java.lang.Throwable -> L2c
            goto L5c
        L2c:
            r8 = move-exception
            goto L6c
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.cmaster.cloner.qa.OooO0o(r7)
            return r3
        L34:
            com.cmaster.cloner.ty2.OooO0O0(r8)
            com.cmaster.cloner.o0O000O r8 = r0.OooO0o
            boolean r2 = r8.OooO0OO()
            if (r2 == 0) goto L70
            com.cmaster.cloner.mp1 r2 = new com.cmaster.cloner.mp1     // Catch: java.lang.Throwable -> L6a
            r5 = 2
            r2.<init>(r7, r3, r5)     // Catch: java.lang.Throwable -> L6a
            r1.OooO0oO = r8     // Catch: java.lang.Throwable -> L6a
            r1.OooOO0 = r4     // Catch: java.lang.Throwable -> L6a
            com.cmaster.cloner.pb1 r7 = r0.OooO0Oo     // Catch: java.lang.Throwable -> L6a
            if (r7 == 0) goto L60
            java.lang.Object r7 = r7.OooO0o     // Catch: java.lang.Throwable -> L6a
            com.cmaster.cloner.zg r7 = (com.cmaster.cloner.zg) r7     // Catch: java.lang.Throwable -> L6a
            r0 = 0
            java.lang.Object r7 = r7.OooOOO0(r0, r2, r1)     // Catch: java.lang.Throwable -> L6a
            com.cmaster.cloner.gk r0 = com.cmaster.cloner.gk.OooO0Oo
            if (r7 != r0) goto L5b
            return r0
        L5b:
            r7 = r8
        L5c:
            r7.OoooOoO()
            goto L70
        L60:
            java.lang.String r7 = "connectionManager"
            com.cmaster.cloner.ij0.OooO(r7)     // Catch: java.lang.Throwable -> L6a
            throw r3     // Catch: java.lang.Throwable -> L6a
        L66:
            r6 = r8
            r8 = r7
            r7 = r6
            goto L6c
        L6a:
            r7 = move-exception
            goto L66
        L6c:
            r7.OoooOoO()
            throw r8
        L70:
            com.cmaster.cloner.vq1 r7 = com.cmaster.cloner.vq1.OooO00o
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.rp1.OooOo00(com.cmaster.cloner.ij):java.lang.Object");
    }

    public rp1(tq tqVar) {
        this.OooO0OO = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.OooO0o = arrayList;
        this.OooO0oO = new ArrayList();
        this.OooO0oo = zh1.OooO00o;
        new ArrayList();
        this.OooO = new ArrayList();
        this.OooOO0 = bj1.OooO0o;
        tt0 tt0Var = tqVar.OooO00o;
        this.OooO0O0 = tt0Var;
        if ((tqVar.OooO0O0 & 8) != 0) {
            this.OooO0o0 = null;
        } else {
            co0 co0Var = new co0(this, tt0Var.OooO00o);
            this.OooO0o0 = co0Var;
            arrayList.add(co0Var);
        }
        xp1[] xp1VarArr = tt0Var.OooO0Oo.OooO00o;
        for (xp1 xp1Var : xp1VarArr) {
            ((ArrayList) this.OooO0o).add(new co0(this, xp1Var));
        }
        dl0 dl0Var = new dl0();
        this.OooO0Oo = dl0Var;
        OooO0o(dl0Var);
        ((dl0) this.OooO0Oo).OooO0OO = true;
    }
}
