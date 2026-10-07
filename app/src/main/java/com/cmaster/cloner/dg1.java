package com.cmaster.cloner;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class dg1 extends jg1 {
    public final /* synthetic */ ArrayList OooO0OO;
    public final /* synthetic */ Matrix OooO0Oo;

    public dg1(ArrayList arrayList, Matrix matrix) {
        this.OooO0OO = arrayList;
        this.OooO0Oo = matrix;
    }

    @Override // com.cmaster.cloner.jg1
    public final void OooO00o(Matrix matrix, xf1 xf1Var, int i, Canvas canvas) {
        ArrayList arrayList = this.OooO0OO;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((jg1) obj).OooO00o(this.OooO0Oo, xf1Var, i, canvas);
        }
    }
}
