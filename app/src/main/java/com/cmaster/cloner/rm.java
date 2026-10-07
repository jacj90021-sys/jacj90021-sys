package com.cmaster.cloner;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class rm extends uq0 {
    public final RectF OooOOoo;

    public rm(rm rmVar) {
        super(rmVar);
        this.OooOOoo = rmVar.OooOOoo;
    }

    @Override // com.cmaster.cloner.uq0, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        sm smVar = new sm(this);
        smVar.Oooo0OO = this;
        smVar.invalidateSelf();
        return smVar;
    }

    public rm(ag1 ag1Var, RectF rectF) {
        super(ag1Var);
        this.OooOOoo = rectF;
    }
}
