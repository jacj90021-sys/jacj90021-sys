package com.cmaster.cloner;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation.Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class vy1 extends WindowInsetsAnimation.Callback {
    public final ah0 OooO00o;
    public List OooO0O0;
    public ArrayList OooO0OO;
    public final HashMap OooO0Oo;

    public vy1(ah0 ah0Var) {
        super(0);
        this.OooO0Oo = new HashMap();
        this.OooO00o = ah0Var;
    }

    public final yy1 OooO00o(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.OooO0Oo;
        yy1 yy1Var = (yy1) map.get(windowInsetsAnimation);
        if (yy1Var == null) {
            yy1Var = new yy1(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                yy1Var.OooO00o = new wy1(windowInsetsAnimation);
            }
            map.put(windowInsetsAnimation, yy1Var);
        }
        return yy1Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        OooO00o(windowInsetsAnimation);
        ((View) this.OooO00o.OooO0Oo).setTranslationY(0.0f);
        this.OooO0Oo.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        OooO00o(windowInsetsAnimation);
        ah0 ah0Var = this.OooO00o;
        View view = (View) ah0Var.OooO0Oo;
        int[] iArr = (int[]) ah0Var.OooO0o0;
        view.getLocationOnScreen(iArr);
        ah0Var.OooO00o = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.OooO0OO;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.OooO0OO = arrayList2;
            this.OooO0O0 = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationOooOOO = o000OO.OooOOO(list.get(size));
            yy1 yy1VarOooO00o = OooO00o(windowInsetsAnimationOooOOO);
            yy1VarOooO00o.OooO00o.OooO0Oo(windowInsetsAnimationOooOOO.getFraction());
            this.OooO0OO.add(yy1VarOooO00o);
        }
        qz1 qz1VarOooO0oO = qz1.OooO0oO(windowInsets, null);
        this.OooO00o.OooO00o(qz1VarOooO0oO, this.OooO0O0);
        return qz1VarOooO0oO.OooO0o();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        OooO00o(windowInsetsAnimation);
        zg0 zg0VarOooO0OO = zg0.OooO0OO(bounds.getLowerBound());
        zg0 zg0VarOooO0OO2 = zg0.OooO0OO(bounds.getUpperBound());
        ah0 ah0Var = this.OooO00o;
        View view = (View) ah0Var.OooO0Oo;
        int[] iArr = (int[]) ah0Var.OooO0o0;
        view.getLocationOnScreen(iArr);
        int i = ah0Var.OooO00o - iArr[1];
        ah0Var.OooO0O0 = i;
        view.setTranslationY(i);
        o000OO.OooOo0();
        return o000OO.OooOO0o(zg0VarOooO0OO.OooO0Oo(), zg0VarOooO0OO2.OooO0Oo());
    }
}
