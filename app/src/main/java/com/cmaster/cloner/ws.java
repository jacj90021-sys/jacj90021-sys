package com.cmaster.cloner;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ws implements no1 {
    public final no1 OooO0O0;
    public final boolean OooO0OO;

    public ws(no1 no1Var, boolean z) {
        this.OooO0O0 = no1Var;
        this.OooO0OO = z;
    }

    @Override // com.cmaster.cloner.zk0
    public final void OooO00o(MessageDigest messageDigest) {
        this.OooO0O0.OooO00o(messageDigest);
    }

    @Override // com.cmaster.cloner.no1
    public final fa1 OooO0O0(Context context, fa1 fa1Var, int i, int i2) {
        k8 k8Var = com.bumptech.glide.OooO00o.OooO00o(context).OooO0Oo;
        Drawable drawable = (Drawable) fa1Var.get();
        l8 l8VarOooO00o = ly0.OooO00o(k8Var, drawable, i, i2);
        if (l8VarOooO00o == null) {
            if (!this.OooO0OO) {
                return fa1Var;
            }
            sa.OooO0o(drawable, "Unable to convert ", " to a Bitmap");
            return null;
        }
        fa1 fa1VarOooO0O0 = this.OooO0O0.OooO0O0(context, l8VarOooO00o, i, i2);
        if (!fa1VarOooO0O0.equals(l8VarOooO00o)) {
            return new l8(context.getResources(), fa1VarOooO0O0);
        }
        fa1VarOooO0O0.OooO0O0();
        return fa1Var;
    }

    @Override // com.cmaster.cloner.zk0
    public final boolean equals(Object obj) {
        if (obj instanceof ws) {
            return this.OooO0O0.equals(((ws) obj).OooO0O0);
        }
        return false;
    }

    @Override // com.cmaster.cloner.zk0
    public final int hashCode() {
        return this.OooO0O0.hashCode();
    }
}
