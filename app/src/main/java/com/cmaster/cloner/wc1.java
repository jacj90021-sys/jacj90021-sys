package com.cmaster.cloner;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class wc1 implements Iterable {
    public tc1 OooO0Oo;
    public tc1 OooO0o0;
    public final WeakHashMap OooO0o = new WeakHashMap();
    public int OooO0oO = 0;

    public tc1 OooO00o(Object obj) {
        tc1 tc1Var = this.OooO0Oo;
        while (tc1Var != null && !tc1Var.OooO0Oo.equals(obj)) {
            tc1Var = tc1Var.OooO0o;
        }
        return tc1Var;
    }

    public Object OooO0O0(Object obj) {
        tc1 tc1VarOooO00o = OooO00o(obj);
        if (tc1VarOooO00o == null) {
            return null;
        }
        this.OooO0oO--;
        WeakHashMap weakHashMap = this.OooO0o;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((vc1) it.next()).OooO00o(tc1VarOooO00o);
            }
        }
        tc1 tc1Var = tc1VarOooO00o.OooO0oO;
        tc1 tc1Var2 = tc1VarOooO00o.OooO0o;
        if (tc1Var != null) {
            tc1Var.OooO0o = tc1Var2;
        } else {
            this.OooO0Oo = tc1Var2;
        }
        tc1 tc1Var3 = tc1VarOooO00o.OooO0o;
        if (tc1Var3 != null) {
            tc1Var3.OooO0oO = tc1Var;
        } else {
            this.OooO0o0 = tc1Var;
        }
        tc1VarOooO00o.OooO0o = null;
        tc1VarOooO00o.OooO0oO = null;
        return tc1VarOooO00o.OooO0o0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((com.cmaster.cloner.sc1) r6).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.cmaster.cloner.wc1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.cmaster.cloner.wc1 r6 = (com.cmaster.cloner.wc1) r6
            int r1 = r5.OooO0oO
            int r3 = r6.OooO0oO
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r5 = r5.iterator()
            java.util.Iterator r6 = r6.iterator()
        L1b:
            r1 = r5
            com.cmaster.cloner.sc1 r1 = (com.cmaster.cloner.sc1) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L44
            r3 = r6
            com.cmaster.cloner.sc1 r3 = (com.cmaster.cloner.sc1) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r3.next()
            if (r1 != 0) goto L3b
            if (r3 != 0) goto L43
        L3b:
            if (r1 == 0) goto L1b
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L53
            com.cmaster.cloner.sc1 r6 = (com.cmaster.cloner.sc1) r6
            boolean r5 = r6.hasNext()
            if (r5 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.wc1.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            sc1 sc1Var = (sc1) it;
            if (!sc1Var.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) sc1Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        sc1 sc1Var = new sc1(this.OooO0Oo, this.OooO0o0, 0);
        this.OooO0o.put(sc1Var, Boolean.FALSE);
        return sc1Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            sc1 sc1Var = (sc1) it;
            if (!sc1Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) sc1Var.next()).toString());
            if (sc1Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
