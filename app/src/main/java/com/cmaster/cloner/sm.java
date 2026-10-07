package com.cmaster.cloner;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class sm extends wq0 {
    public static final /* synthetic */ int Oooo0o0 = 0;
    public rm Oooo0OO;

    @Override // com.cmaster.cloner.wq0
    public final void OooO0o0(Canvas canvas) {
        if (this.Oooo0OO.OooOOoo.isEmpty()) {
            super.OooO0o0(canvas);
            return;
        }
        canvas.save();
        int i = Build.VERSION.SDK_INT;
        rm rmVar = this.Oooo0OO;
        if (i >= 26) {
            canvas.clipOutRect(rmVar.OooOOoo);
        } else {
            canvas.clipRect(rmVar.OooOOoo, Region.Op.DIFFERENCE);
        }
        super.OooO0o0(canvas);
        canvas.restore();
    }

    public final void OooOo0(float f, float f2, float f3, float f4) {
        RectF rectF = this.Oooo0OO.OooOOoo;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    @Override // com.cmaster.cloner.wq0, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.Oooo0OO = new rm(this.Oooo0OO);
        return this;
    }
}
