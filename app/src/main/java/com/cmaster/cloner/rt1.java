package com.cmaster.cloner;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.View;
import java.lang.ref.ReferenceQueue;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class rt1 extends q6 implements xs1 {
    public static final boolean OooOOO0 = true;
    public boolean OooO;
    public final yx1[] OooO0oO;
    public final View OooO0oo;
    public final Choreographer OooOO0;
    public final qt1 OooOO0O;
    public final Handler OooOO0o;
    public static final vu0 OooOOO = new vu0(14);
    public static final ReferenceQueue OooOOOO = new ReferenceQueue();
    public static final pt1 OooOOOo = new pt1(0);
    public final u91 OooO0o0 = new u91(this, 7);
    public boolean OooO0o = false;

    public rt1(View view, int i) {
        this.OooO0oO = new yx1[i];
        this.OooO0oo = view;
        if (Looper.myLooper() == null) {
            qa.OooO0o("DataBinding must be created in view's UI Thread");
            throw null;
        }
        this.OooOO0 = Choreographer.getInstance();
        this.OooOO0O = new qt1(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void OooO0oO(android.view.View r5, java.lang.Object[] r6, android.util.SparseIntArray r7, boolean r8) {
        /*
            r0 = 0
            if (r5 == 0) goto Ld
            r1 = 2131296456(0x7f0900c8, float:1.821083E38)
            java.lang.Object r1 = r5.getTag(r1)
            com.cmaster.cloner.rt1 r1 = (com.cmaster.cloner.rt1) r1
            goto Le
        Ld:
            r1 = r0
        Le:
            if (r1 == 0) goto L12
            goto Lb8
        L12:
            java.lang.Object r1 = r5.getTag()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L1d
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
        L1d:
            r1 = 0
            if (r8 == 0) goto L66
            if (r0 == 0) goto L66
            java.lang.String r8 = "layout"
            boolean r8 = r0.startsWith(r8)
            if (r8 == 0) goto L66
            r8 = 95
            int r8 = r0.lastIndexOf(r8)
            if (r8 <= 0) goto L8c
            int r8 = r8 + 1
            int r2 = r0.length()
            if (r2 != r8) goto L3b
            goto L8c
        L3b:
            r3 = r8
        L3c:
            if (r3 >= r2) goto L4c
            char r4 = r0.charAt(r3)
            boolean r4 = java.lang.Character.isDigit(r4)
            if (r4 != 0) goto L49
            goto L8c
        L49:
            int r3 = r3 + 1
            goto L3c
        L4c:
            int r2 = r0.length()
            r3 = r1
        L51:
            if (r8 >= r2) goto L5f
            int r3 = r3 * 10
            char r4 = r0.charAt(r8)
            int r4 = r4 + (-48)
            int r3 = r3 + r4
            int r8 = r8 + 1
            goto L51
        L5f:
            r8 = r6[r3]
            if (r8 != 0) goto La1
            r6[r3] = r5
            goto La1
        L66:
            if (r0 == 0) goto L8c
            java.lang.String r8 = "binding_"
            boolean r8 = r0.startsWith(r8)
            if (r8 == 0) goto L8c
            int r8 = r0.length()
            r2 = 8
            r3 = r1
        L77:
            if (r2 >= r8) goto L85
            int r3 = r3 * 10
            char r4 = r0.charAt(r2)
            int r4 = r4 + (-48)
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L77
        L85:
            r8 = r6[r3]
            if (r8 != 0) goto La1
            r6[r3] = r5
            goto La1
        L8c:
            int r8 = r5.getId()
            if (r8 <= 0) goto La1
            if (r7 == 0) goto La1
            r0 = -1
            int r8 = r7.get(r8, r0)
            if (r8 < 0) goto La1
            r0 = r6[r8]
            if (r0 != 0) goto La1
            r6[r8] = r5
        La1:
            boolean r8 = r5 instanceof android.view.ViewGroup
            if (r8 == 0) goto Lb8
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r8 = r5.getChildCount()
            r0 = r1
        Lac:
            if (r0 >= r8) goto Lb8
            android.view.View r2 = r5.getChildAt(r0)
            OooO0oO(r2, r6, r7, r1)
            int r0 = r0 + 1
            goto Lac
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.rt1.OooO0oO(android.view.View, java.lang.Object[], android.util.SparseIntArray, boolean):void");
    }

    public final void OooO() {
        synchronized (this) {
            try {
                if (this.OooO0o) {
                    return;
                }
                this.OooO0o = true;
                if (OooOOO0) {
                    this.OooOO0.postFrameCallback(this.OooOO0O);
                } else {
                    this.OooOO0o.post(this.OooO0o0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void OooO0Oo();

    public abstract boolean OooO0o0();

    public abstract boolean OooO0oo(int i, int i2, Object obj);

    public final void OooOO0O(int i, q6 q6Var) {
        yx1[] yx1VarArr = this.OooO0oO;
        if (q6Var == null) {
            yx1 yx1Var = yx1VarArr[i];
            if (yx1Var != null) {
                yx1Var.OooO00o();
                return;
            }
            return;
        }
        yx1 yx1VarOooO0oO = yx1VarArr[i];
        ReferenceQueue referenceQueue = OooOOOO;
        vu0 vu0Var = OooOOO;
        if (yx1VarOooO0oO == null) {
            if (yx1VarOooO0oO == null) {
                yx1VarOooO0oO = vu0Var.OooO0oO(this, i, referenceQueue);
                yx1VarArr[i] = yx1VarOooO0oO;
            }
            yx1VarOooO0oO.OooO00o();
            yx1VarOooO0oO.OooO0OO = q6Var;
            yx1VarOooO0oO.OooO00o.OooO00o(q6Var);
            return;
        }
        if (yx1VarOooO0oO.OooO0OO == q6Var) {
            return;
        }
        if (yx1VarOooO0oO != null) {
            yx1VarOooO0oO.OooO00o();
        }
        yx1 yx1VarOooO0oO2 = yx1VarArr[i];
        if (yx1VarOooO0oO2 == null) {
            yx1VarOooO0oO2 = vu0Var.OooO0oO(this, i, referenceQueue);
            yx1VarArr[i] = yx1VarOooO0oO2;
        }
        yx1VarOooO0oO2.OooO00o();
        yx1VarOooO0oO2.OooO0OO = q6Var;
        yx1VarOooO0oO2.OooO00o.OooO00o(q6Var);
    }

    @Override // com.cmaster.cloner.xs1
    public final View getRoot() {
        return this.OooO0oo;
    }
}
