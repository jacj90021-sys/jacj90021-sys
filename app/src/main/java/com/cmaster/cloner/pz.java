package com.cmaster.cloner;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class pz implements ia1 {
    public final /* synthetic */ int OooO00o;

    public /* synthetic */ pz(int i) {
        this.OooO00o = i;
    }

    @Override // com.cmaster.cloner.ia1
    public final fa1 OooO00o(Object obj, int i, int i2, xz0 xz0Var) {
        switch (this.OooO00o) {
            case 0:
                return new oO0O0Oo0((File) obj);
            case 1:
                return new oO0O0Oo0((Bitmap) obj, 3);
            default:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new y40(drawable, 1);
                }
                return null;
        }
    }

    @Override // com.cmaster.cloner.ia1
    public final /* bridge */ /* synthetic */ boolean OooO0O0(Object obj, xz0 xz0Var) {
        switch (this.OooO00o) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }
}
