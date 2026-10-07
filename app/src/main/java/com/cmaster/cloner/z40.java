package com.cmaster.cloner;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class z40 implements no1 {
    public final no1 OooO0O0;

    public z40(no1 no1Var) {
        zx2.OooO0OO(no1Var, "Argument must not be null");
        this.OooO0O0 = no1Var;
    }

    @Override // com.cmaster.cloner.zk0
    public final void OooO00o(MessageDigest messageDigest) {
        this.OooO0O0.OooO00o(messageDigest);
    }

    @Override // com.cmaster.cloner.no1
    public final fa1 OooO0O0(Context context, fa1 fa1Var, int i, int i2) {
        x40 x40Var = (x40) fa1Var.get();
        l8 l8Var = new l8(((d50) x40Var.OooO0Oo.OooO0O0).OooOO0o, com.bumptech.glide.OooO00o.OooO00o(context).OooO0Oo);
        no1 no1Var = this.OooO0O0;
        fa1 fa1VarOooO0O0 = no1Var.OooO0O0(context, l8Var, i, i2);
        if (l8Var != fa1VarOooO0O0) {
            l8Var.OooO0O0();
        }
        ((d50) x40Var.OooO0Oo.OooO0O0).OooO0OO(no1Var, (Bitmap) fa1VarOooO0O0.get());
        return fa1Var;
    }

    @Override // com.cmaster.cloner.zk0
    public final boolean equals(Object obj) {
        if (obj instanceof z40) {
            return this.OooO0O0.equals(((z40) obj).OooO0O0);
        }
        return false;
    }

    @Override // com.cmaster.cloner.zk0
    public final int hashCode() {
        return this.OooO0O0.hashCode();
    }
}
