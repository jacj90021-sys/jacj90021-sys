package com.cmaster.cloner;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class y40 implements fa1, lg0 {
    public final Drawable OooO0Oo;
    public final /* synthetic */ int OooO0o0;

    public y40(Drawable drawable, int i) {
        this.OooO0o0 = i;
        zx2.OooO0OO(drawable, "Argument must not be null");
        this.OooO0Oo = drawable;
    }

    private final void OooO0OO() {
    }

    @Override // com.cmaster.cloner.lg0
    public void OooO00o() {
        int i = this.OooO0o0;
        Drawable drawable = this.OooO0Oo;
        switch (i) {
            case 0:
                ((d50) ((x40) drawable).OooO0Oo.OooO0O0).OooOO0o.prepareToDraw();
                break;
            default:
                if (!(drawable instanceof BitmapDrawable)) {
                    if (drawable instanceof x40) {
                        ((d50) ((x40) drawable).OooO0Oo.OooO0O0).OooOO0o.prepareToDraw();
                        break;
                    }
                } else {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                    break;
                }
                break;
        }
    }

    @Override // com.cmaster.cloner.fa1
    public final void OooO0O0() {
        jp0 jp0Var;
        jp0 jp0Var2;
        jp0 jp0Var3;
        switch (this.OooO0o0) {
            case 0:
                x40 x40Var = (x40) this.OooO0Oo;
                x40Var.stop();
                x40Var.OooO0oO = true;
                d50 d50Var = (d50) x40Var.OooO0Oo.OooO0O0;
                x91 x91Var = d50Var.OooO0Oo;
                d50Var.OooO0OO.clear();
                Bitmap bitmap = d50Var.OooOO0o;
                if (bitmap != null) {
                    d50Var.OooO0o0.OooO0O0(bitmap);
                    d50Var.OooOO0o = null;
                }
                d50Var.OooO0o = false;
                b50 b50Var = d50Var.OooO;
                if (b50Var != null) {
                    x91Var.OooOO0O(b50Var);
                    d50Var.OooO = null;
                }
                b50 b50Var2 = d50Var.OooOO0O;
                if (b50Var2 != null) {
                    x91Var.OooOO0O(b50Var2);
                    d50Var.OooOO0O = null;
                }
                b50 b50Var3 = d50Var.OooOOO0;
                if (b50Var3 != null) {
                    x91Var.OooOO0O(b50Var3);
                    d50Var.OooOOO0 = null;
                }
                ni1 ni1Var = d50Var.OooO00o;
                e81 e81Var = ni1Var.OooO0OO;
                ni1Var.OooOO0o = null;
                byte[] bArr = ni1Var.OooO;
                if (bArr != null && (jp0Var3 = (jp0) e81Var.OooO0o) != null) {
                    jp0Var3.OooO0oO(bArr);
                }
                int[] iArr = ni1Var.OooOO0;
                if (iArr != null && (jp0Var2 = (jp0) e81Var.OooO0o) != null) {
                    jp0Var2.OooO0oO(iArr);
                }
                Bitmap bitmap2 = ni1Var.OooOOO0;
                if (bitmap2 != null) {
                    ((k8) e81Var.OooO0o0).OooO0O0(bitmap2);
                }
                ni1Var.OooOOO0 = null;
                ni1Var.OooO0Oo = null;
                ni1Var.OooOOoo = null;
                byte[] bArr2 = ni1Var.OooO0o0;
                if (bArr2 != null && (jp0Var = (jp0) e81Var.OooO0o) != null) {
                    jp0Var.OooO0oO(bArr2);
                }
                d50Var.OooOO0 = true;
                break;
        }
    }

    @Override // com.cmaster.cloner.fa1
    public final int OooO0Oo() {
        int i = this.OooO0o0;
        Drawable drawable = this.OooO0Oo;
        switch (i) {
            case 0:
                d50 d50Var = (d50) ((x40) drawable).OooO0Oo.OooO0O0;
                ni1 ni1Var = d50Var.OooO00o;
                return (ni1Var.OooOO0.length * 4) + ni1Var.OooO0Oo.limit() + ni1Var.OooO.length + d50Var.OooOOO;
            default:
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
        }
    }

    @Override // com.cmaster.cloner.fa1
    public final Class OooO0o0() {
        switch (this.OooO0o0) {
            case 0:
                return x40.class;
            default:
                return this.OooO0Oo.getClass();
        }
    }

    @Override // com.cmaster.cloner.fa1
    public final Object get() {
        Drawable drawable = this.OooO0Oo;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }
}
