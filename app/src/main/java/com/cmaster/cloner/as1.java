package com.cmaster.cloner;

import android.graphics.Paint;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class as1 extends ds1 {
    public float OooO;
    public o00Oo00 OooO0Oo;
    public o00Oo00 OooO0o;
    public float OooO0o0;
    public float OooO0oO;
    public float OooO0oo;
    public float OooOO0;
    public float OooOO0O;
    public Paint.Cap OooOO0o;
    public float OooOOO;
    public Paint.Join OooOOO0;

    @Override // com.cmaster.cloner.cs1
    public final boolean OooO00o() {
        return this.OooO0o.OooO0oO() || this.OooO0Oo.OooO0oO();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    @Override // com.cmaster.cloner.cs1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OooO0O0(int[] r6) {
        /*
            r5 = this;
            com.cmaster.cloner.o00Oo00 r0 = r5.OooO0o
            boolean r1 = r0.OooO0oO()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.OooO0oO
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r6, r4)
            int r4 = r0.OooO0o0
            if (r1 == r4) goto L1e
            r0.OooO0o0 = r1
            r0 = r2
            goto L1f
        L1e:
            r0 = r3
        L1f:
            com.cmaster.cloner.o00Oo00 r5 = r5.OooO0Oo
            boolean r1 = r5.OooO0oO()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r5.OooO0oO
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r6 = r1.getColorForState(r6, r4)
            int r1 = r5.OooO0o0
            if (r6 == r1) goto L3a
            r5.OooO0o0 = r6
            goto L3b
        L3a:
            r2 = r3
        L3b:
            r5 = r0 | r2
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.as1.OooO0O0(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.OooO0oo;
    }

    public int getFillColor() {
        return this.OooO0o.OooO0o0;
    }

    public float getStrokeAlpha() {
        return this.OooO0oO;
    }

    public int getStrokeColor() {
        return this.OooO0Oo.OooO0o0;
    }

    public float getStrokeWidth() {
        return this.OooO0o0;
    }

    public float getTrimPathEnd() {
        return this.OooOO0;
    }

    public float getTrimPathOffset() {
        return this.OooOO0O;
    }

    public float getTrimPathStart() {
        return this.OooO;
    }

    public void setFillAlpha(float f) {
        this.OooO0oo = f;
    }

    public void setFillColor(int i) {
        this.OooO0o.OooO0o0 = i;
    }

    public void setStrokeAlpha(float f) {
        this.OooO0oO = f;
    }

    public void setStrokeColor(int i) {
        this.OooO0Oo.OooO0o0 = i;
    }

    public void setStrokeWidth(float f) {
        this.OooO0o0 = f;
    }

    public void setTrimPathEnd(float f) {
        this.OooOO0 = f;
    }

    public void setTrimPathOffset(float f) {
        this.OooOO0O = f;
    }

    public void setTrimPathStart(float f) {
        this.OooO = f;
    }
}
