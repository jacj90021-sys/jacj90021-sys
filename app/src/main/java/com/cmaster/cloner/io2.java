package com.cmaster.cloner;

import androidx.cardview.widget.CardView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class io2 {
    public static void OooO00o(e81 e81Var, float f) {
        float f2;
        float f3;
        fc1 fc1Var = (fc1) e81Var.OooO0o0;
        CardView cardView = (CardView) e81Var.OooO0o;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f != fc1Var.OooO0o0 || fc1Var.OooO0o != useCompatPadding || fc1Var.OooO0oO != preventCornerOverlap) {
            fc1Var.OooO0o0 = f;
            fc1Var.OooO0o = useCompatPadding;
            fc1Var.OooO0oO = preventCornerOverlap;
            fc1Var.OooO0O0(null);
            fc1Var.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            e81Var.OooOoo0(0, 0, 0, 0);
            return;
        }
        fc1 fc1Var2 = (fc1) e81Var.OooO0o0;
        float f4 = fc1Var2.OooO0o0;
        float f5 = fc1Var2.OooO00o;
        if (cardView.getPreventCornerOverlap()) {
            f2 = (float) (((1.0d - gc1.OooO00o) * f5) + f4);
        } else {
            int i = gc1.OooO0O0;
            f2 = f4;
        }
        int iCeil = (int) Math.ceil(f2);
        if (cardView.getPreventCornerOverlap()) {
            f3 = (float) (((1.0d - gc1.OooO00o) * f5) + (f4 * 1.5f));
        } else {
            f3 = f4 * 1.5f;
        }
        int iCeil2 = (int) Math.ceil(f3);
        e81Var.OooOoo0(iCeil, iCeil2, iCeil, iCeil2);
    }
}
