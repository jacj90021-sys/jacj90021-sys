package com.cmaster.cloner;

import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class f71 {
    public z61 OooO00o;
    public ArrayList OooO0O0;
    public long OooO0OO;
    public long OooO0Oo;
    public long OooO0o;
    public long OooO0o0;

    public static void OooO0O0(y71 y71Var) {
        int i = y71Var.OooOO0;
        if (!y71Var.OooO0oo() && (i & 4) == 0) {
            y71Var.OooO0O0();
        }
    }

    public abstract boolean OooO00o(y71 y71Var, y71 y71Var2, qw0 qw0Var, qw0 qw0Var2);

    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0OO(com.cmaster.cloner.y71 r10) {
        /*
            r9 = this;
            com.cmaster.cloner.z61 r9 = r9.OooO00o
            if (r9 == 0) goto Lb2
            androidx.recyclerview.widget.RecyclerView r9 = r9.OooO0Oo
            r0 = 1
            r10.OooOOOo(r0)
            android.view.View r1 = r10.OooO00o
            com.cmaster.cloner.y71 r2 = r10.OooO0oo
            r3 = 0
            if (r2 == 0) goto L17
            com.cmaster.cloner.y71 r2 = r10.OooO
            if (r2 != 0) goto L17
            r10.OooO0oo = r3
        L17:
            r10.OooO = r3
            int r2 = r10.OooOO0
            r2 = r2 & 16
            if (r2 == 0) goto L21
            goto Lb2
        L21:
            com.cmaster.cloner.p71 r2 = r9.OooO0o
            r9.o00O0O()
            com.cmaster.cloner.xb r3 = r9.OooO
            java.lang.Object r4 = r3.OooO0oO
            com.cmaster.cloner.sc r4 = (com.cmaster.cloner.sc) r4
            java.lang.Object r5 = r3.OooO0o
            com.cmaster.cloner.xb1 r5 = (com.cmaster.cloner.xb1) r5
            int r6 = r3.OooO0o0
            r7 = 0
            if (r6 != r0) goto L43
            java.lang.Object r0 = r3.OooO
            android.view.View r0 = (android.view.View) r0
            if (r0 != r1) goto L3d
        L3b:
            r0 = r7
            goto L6e
        L3d:
            java.lang.String r9 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            com.cmaster.cloner.qa.OooO0o(r9)
            return
        L43:
            r8 = 2
            if (r6 == r8) goto Lad
            r3.OooO0o0 = r8     // Catch: java.lang.Throwable -> L59
            java.lang.Object r6 = r5.OooO0o0     // Catch: java.lang.Throwable -> L59
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6     // Catch: java.lang.Throwable -> L59
            int r6 = r6.indexOfChild(r1)     // Catch: java.lang.Throwable -> L59
            r8 = -1
            if (r6 != r8) goto L5b
            r3.OooOOo0(r1)     // Catch: java.lang.Throwable -> L59
        L56:
            r3.OooO0o0 = r7
            goto L6e
        L59:
            r9 = move-exception
            goto Laa
        L5b:
            boolean r8 = r4.OooO0Oo(r6)     // Catch: java.lang.Throwable -> L59
            if (r8 == 0) goto L6b
            r4.OooO0o(r6)     // Catch: java.lang.Throwable -> L59
            r3.OooOOo0(r1)     // Catch: java.lang.Throwable -> L59
            r5.Oooo0O0(r6)     // Catch: java.lang.Throwable -> L59
            goto L56
        L6b:
            r3.OooO0o0 = r7
            goto L3b
        L6e:
            if (r0 == 0) goto L99
            com.cmaster.cloner.y71 r3 = androidx.recyclerview.widget.RecyclerView.Oooo0oo(r1)
            r2.OooOOO0(r3)
            r2.OooOO0(r3)
            boolean r2 = androidx.recyclerview.widget.RecyclerView.o000OOo
            if (r2 == 0) goto L99
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "after removing animated view: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r3 = ", "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "RecyclerView"
            android.util.Log.d(r3, r2)
        L99:
            r2 = r0 ^ 1
            r9.o00Ooo(r2)
            if (r0 != 0) goto Lb2
            boolean r10 = r10.OooOO0o()
            if (r10 == 0) goto Lb2
            r9.removeDetachedView(r1, r7)
            return
        Laa:
            r3.OooO0o0 = r7
            throw r9
        Lad:
            java.lang.String r9 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            com.cmaster.cloner.qa.OooO0o(r9)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.f71.OooO0OO(com.cmaster.cloner.y71):void");
    }

    public abstract void OooO0Oo(y71 y71Var);

    public abstract boolean OooO0o();

    public abstract void OooO0o0();
}
