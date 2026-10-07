package com.cmaster.cloner;

import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class v8 implements ht0 {
    public boolean OooO0Oo;
    public final Object OooO0o0;

    public v8() {
        this.OooO0o0 = new Handler(Looper.getMainLooper(), new z6(1));
    }

    public boolean OooO00o() {
        return this.OooO0Oo;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean OooO0O0(java.lang.CharSequence r7, int r8) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L45
            if (r8 < 0) goto L45
            int r1 = r7.length()
            int r1 = r1 - r8
            if (r1 < 0) goto L45
            java.lang.Object r1 = r6.OooO0o0
            com.cmaster.cloner.qc3 r1 = (com.cmaster.cloner.qc3) r1
            if (r1 != 0) goto L17
            boolean r6 = r6.OooO00o()
            return r6
        L17:
            r1 = 2
            r2 = r0
            r3 = r1
        L1a:
            r4 = 1
            if (r2 >= r8) goto L3a
            if (r3 != r1) goto L3a
            char r3 = r7.charAt(r2)
            byte r3 = java.lang.Character.getDirectionality(r3)
            com.cmaster.cloner.v8 r5 = com.cmaster.cloner.lm1.OooO00o
            if (r3 == 0) goto L36
            if (r3 == r4) goto L34
            if (r3 == r1) goto L34
            switch(r3) {
                case 14: goto L36;
                case 15: goto L36;
                case 16: goto L34;
                case 17: goto L34;
                default: goto L32;
            }
        L32:
            r3 = r1
            goto L37
        L34:
            r3 = r0
            goto L37
        L36:
            r3 = r4
        L37:
            int r2 = r2 + 1
            goto L1a
        L3a:
            if (r3 == 0) goto L44
            if (r3 == r4) goto L43
            boolean r6 = r6.OooO00o()
            return r6
        L43:
            return r0
        L44:
            return r4
        L45:
            com.cmaster.cloner.qa.OooOO0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.v8.OooO0O0(java.lang.CharSequence, int):boolean");
    }

    @Override // com.cmaster.cloner.ht0
    public void OooO0OO(ss0 ss0Var, boolean z) {
        o00O0OOO o00o0ooo;
        sn1 sn1Var = (sn1) this.OooO0o0;
        if (this.OooO0Oo) {
            return;
        }
        this.OooO0Oo = true;
        ActionMenuView actionMenuView = sn1Var.OooO00o.OooO00o.OooO0Oo;
        if (actionMenuView != null && (o00o0ooo = actionMenuView.OooOo0o) != null) {
            o00o0ooo.OooO();
            o00O0OO0 o00o0oo0 = o00o0ooo.OooOo0o;
            if (o00o0oo0 != null && o00o0oo0.OooO0O0()) {
                o00o0oo0.OooO.dismiss();
            }
        }
        sn1Var.OooO0O0.onPanelClosed(108, ss0Var);
        this.OooO0Oo = false;
    }

    public synchronized void OooO0Oo(fa1 fa1Var, boolean z) {
        try {
            if (this.OooO0Oo || z) {
                ((Handler) this.OooO0o0).obtainMessage(1, fa1Var).sendToTarget();
            } else {
                this.OooO0Oo = true;
                fa1Var.OooO0O0();
                this.OooO0Oo = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.cmaster.cloner.ht0
    public boolean OooOOOO(ss0 ss0Var) {
        ((sn1) this.OooO0o0).OooO0O0.onMenuOpened(108, ss0Var);
        return true;
    }

    public /* synthetic */ v8(Object obj) {
        this.OooO0o0 = obj;
    }

    public v8(qc3 qc3Var, boolean z) {
        this(qc3Var);
        this.OooO0Oo = z;
    }

    public v8(BottomSheetBehavior bottomSheetBehavior, boolean z) {
        this.OooO0o0 = bottomSheetBehavior;
        this.OooO0Oo = z;
    }
}
