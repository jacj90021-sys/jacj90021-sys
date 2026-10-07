package com.cmaster.cloner;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xf1 {
    public static final int[] OooO = new int[3];
    public static final float[] OooOO0 = {0.0f, 0.5f, 1.0f};
    public static final int[] OooOO0O = new int[4];
    public static final float[] OooOO0o = {0.0f, 0.0f, 0.5f, 1.0f};
    public int OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public final Object OooO0Oo;
    public final Object OooO0o;
    public final Object OooO0o0;
    public final Object OooO0oO;
    public final Object OooO0oo;

    public xf1(v03 v03Var) {
        this.OooO0Oo = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new xg(false));
        this.OooO0o0 = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new xg(true));
        String str = c12.OooO00o;
        this.OooO0o = new b12();
        this.OooO0oO = new vu0(9);
        this.OooO0oo = new ay1(16);
        this.OooO00o = 4;
        this.OooO0O0 = Integer.MAX_VALUE;
        this.OooO0OO = 20;
    }

    public void OooO00o(int i) {
        this.OooO00o = ye.OooO0Oo(i, 68);
        this.OooO0O0 = ye.OooO0Oo(i, 20);
        this.OooO0OO = ye.OooO0Oo(i, 0);
        ((Paint) this.OooO0Oo).setColor(this.OooO00o);
    }

    public xf1() {
        this.OooO0oo = new Path();
        Paint paint = new Paint();
        this.OooO0oO = paint;
        this.OooO0Oo = new Paint();
        OooO00o(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.OooO0o0 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.OooO0o = new Paint(paint2);
    }
}
