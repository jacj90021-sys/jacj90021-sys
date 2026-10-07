package com.cmaster.cloner;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class l8 implements fa1, lg0 {
    public final /* synthetic */ int OooO0Oo = 1;
    public final Object OooO0o;
    public final Object OooO0o0;

    public l8(Bitmap bitmap, k8 k8Var) {
        zx2.OooO0OO(bitmap, "Bitmap must not be null");
        this.OooO0o0 = bitmap;
        zx2.OooO0OO(k8Var, "BitmapPool must not be null");
        this.OooO0o = k8Var;
    }

    public static l8 OooO0OO(Bitmap bitmap, k8 k8Var) {
        if (bitmap == null) {
            return null;
        }
        return new l8(bitmap, k8Var);
    }

    @Override // com.cmaster.cloner.lg0
    public final void OooO00o() {
        switch (this.OooO0Oo) {
            case 0:
                ((Bitmap) this.OooO0o0).prepareToDraw();
                break;
            default:
                fa1 fa1Var = (fa1) this.OooO0o;
                if (fa1Var instanceof lg0) {
                    ((lg0) fa1Var).OooO00o();
                    break;
                }
                break;
        }
    }

    @Override // com.cmaster.cloner.fa1
    public final void OooO0O0() {
        switch (this.OooO0Oo) {
            case 0:
                ((k8) this.OooO0o).OooO0O0((Bitmap) this.OooO0o0);
                break;
            default:
                ((fa1) this.OooO0o).OooO0O0();
                break;
        }
    }

    @Override // com.cmaster.cloner.fa1
    public final int OooO0Oo() {
        switch (this.OooO0Oo) {
            case 0:
                return pr1.OooO0OO((Bitmap) this.OooO0o0);
            default:
                return ((fa1) this.OooO0o).OooO0Oo();
        }
    }

    @Override // com.cmaster.cloner.fa1
    public final Class OooO0o0() {
        switch (this.OooO0Oo) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // com.cmaster.cloner.fa1
    public final Object get() {
        switch (this.OooO0Oo) {
            case 0:
                return (Bitmap) this.OooO0o0;
            default:
                return new BitmapDrawable((Resources) this.OooO0o0, (Bitmap) ((fa1) this.OooO0o).get());
        }
    }

    public l8(Resources resources, fa1 fa1Var) {
        zx2.OooO0OO(resources, "Argument must not be null");
        this.OooO0o0 = resources;
        zx2.OooO0OO(fa1Var, "Argument must not be null");
        this.OooO0o = fa1Var;
    }
}
