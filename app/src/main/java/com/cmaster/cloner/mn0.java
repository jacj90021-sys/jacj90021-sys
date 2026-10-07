package com.cmaster.cloner;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class mn0 implements View.OnTouchListener {
    public static final int OooOo0 = ViewConfiguration.getTapTimeout();
    public final float[] OooO;
    public final n4 OooO0Oo;
    public final ot OooO0o;
    public final AccelerateInterpolator OooO0o0;
    public o00OOO00 OooO0oO;
    public final float[] OooO0oo;
    public final int OooOO0;
    public final int OooOO0O;
    public final float[] OooOO0o;
    public final float[] OooOOO;
    public final float[] OooOOO0;
    public boolean OooOOOO;
    public boolean OooOOOo;
    public boolean OooOOo;
    public boolean OooOOo0;
    public boolean OooOOoo;
    public final ot OooOo00;

    public mn0(ot otVar) {
        n4 n4Var = new n4();
        n4Var.OooO0o0 = Long.MIN_VALUE;
        n4Var.OooO0oO = -1L;
        n4Var.OooO0o = 0L;
        this.OooO0Oo = n4Var;
        this.OooO0o0 = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.OooO0oo = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.OooO = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.OooOO0o = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.OooOOO0 = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.OooOOO = fArr5;
        this.OooO0o = otVar;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.OooOO0 = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.OooOO0O = OooOo0;
        n4Var.OooO00o = 500;
        n4Var.OooO0O0 = 500;
        this.OooOo00 = otVar;
    }

    public static float OooO0O0(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float OooO00o(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.OooO0oo
            r0 = r0[r7]
            float[] r1 = r3.OooO
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = OooO0O0(r0, r2, r1)
            float r1 = r3.OooO0OO(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.OooO0OO(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.OooO0o0
            if (r5 >= 0) goto L25
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L2d
        L25:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L36
            float r4 = r0.getInterpolation(r4)
        L2d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = OooO0O0(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.OooOO0o
            r0 = r0[r7]
            float[] r1 = r3.OooOOO0
            r1 = r1[r7]
            float[] r3 = r3.OooOOO
            r3 = r3[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r3 = OooO0O0(r4, r1, r3)
            return r3
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r3 = OooO0O0(r4, r1, r3)
            float r3 = -r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.mn0.OooO00o(float, float, float, int):float");
    }

    public final float OooO0OO(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.OooOO0;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.OooOOo && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }

    public final void OooO0Oo() {
        int i = 0;
        if (this.OooOOOo) {
            this.OooOOo = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        n4 n4Var = this.OooO0Oo;
        int i2 = (int) (jCurrentAnimationTimeMillis - n4Var.OooO0o0);
        int i3 = n4Var.OooO0O0;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        n4Var.OooO = i;
        n4Var.OooO0oo = n4Var.OooO00o(jCurrentAnimationTimeMillis);
        n4Var.OooO0oO = jCurrentAnimationTimeMillis;
    }

    public final boolean OooO0o0() {
        ot otVar;
        int count;
        n4 n4Var = this.OooO0Oo;
        float f = n4Var.OooO0Oo;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(n4Var.OooO0OO);
        if (iAbs != 0 && (count = (otVar = this.OooOo00).getCount()) != 0) {
            int childCount = otVar.getChildCount();
            int firstVisiblePosition = otVar.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && otVar.getChildAt(0).getTop() >= 0)) : !(i >= count && otVar.getChildAt(childCount - 1).getBottom() <= otVar.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.OooOOoo
            r1 = 0
            if (r0 != 0) goto L7
            goto L7d
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7d
        L17:
            r7.OooO0Oo()
            return r1
        L1b:
            r7.OooOOo0 = r2
            r7.OooOOOO = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            com.cmaster.cloner.ot r4 = r7.OooO0o
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.OooO00o(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.OooO00o(r9, r8, r3, r2)
            com.cmaster.cloner.n4 r9 = r7.OooO0Oo
            r9.OooO0OO = r0
            r9.OooO0Oo = r8
            boolean r8 = r7.OooOOo
            if (r8 != 0) goto L7d
            boolean r8 = r7.OooO0o0()
            if (r8 == 0) goto L7d
            com.cmaster.cloner.o00OOO00 r8 = r7.OooO0oO
            if (r8 != 0) goto L61
            com.cmaster.cloner.o00OOO00 r8 = new com.cmaster.cloner.o00OOO00
            r9 = 7
            r8.<init>(r7, r9)
            r7.OooO0oO = r8
        L61:
            r7.OooOOo = r2
            r7.OooOOOo = r2
            boolean r8 = r7.OooOOOO
            if (r8 != 0) goto L76
            int r8 = r7.OooOO0O
            if (r8 <= 0) goto L76
            com.cmaster.cloner.o00OOO00 r9 = r7.OooO0oO
            long r5 = (long) r8
            java.util.WeakHashMap r8 = com.cmaster.cloner.nt1.OooO00o
            r4.postOnAnimationDelayed(r9, r5)
            goto L7b
        L76:
            com.cmaster.cloner.o00OOO00 r8 = r7.OooO0oO
            r8.run()
        L7b:
            r7.OooOOOO = r2
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.mn0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
