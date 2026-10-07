package com.cmaster.cloner;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class yt extends rr2 {
    public final /* synthetic */ int OooO00o;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.cmaster.cloner.rr2
    public final float OooO00o(Drawable drawable) {
        switch (this.OooO00o) {
            case 0:
                return ((View) drawable).getAlpha();
            case 1:
                return ((View) drawable).getScaleX();
            case 2:
                return ((View) drawable).getScaleY();
            case 3:
                return ((View) drawable).getRotation();
            case 4:
                return ((View) drawable).getRotationX();
            default:
                return ((View) drawable).getRotationY();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.cmaster.cloner.rr2
    public final void OooO0O0(Drawable drawable, float f) {
        switch (this.OooO00o) {
            case 0:
                ((View) drawable).setAlpha(f);
                break;
            case 1:
                ((View) drawable).setScaleX(f);
                break;
            case 2:
                ((View) drawable).setScaleY(f);
                break;
            case 3:
                ((View) drawable).setRotation(f);
                break;
            case 4:
                ((View) drawable).setRotationX(f);
                break;
            default:
                ((View) drawable).setRotationY(f);
                break;
        }
    }
}
