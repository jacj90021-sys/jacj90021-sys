package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ds1 extends cs1 {
    public o21[] OooO00o;
    public String OooO0O0;
    public int OooO0OO;

    public ds1(ds1 ds1Var) {
        this.OooO00o = null;
        this.OooO0OO = 0;
        this.OooO0O0 = ds1Var.OooO0O0;
        o21[] o21VarArr = ds1Var.OooO00o;
        o21[] o21VarArr2 = new o21[o21VarArr.length];
        for (int i = 0; i < o21VarArr.length; i++) {
            o21VarArr2[i] = new o21(o21VarArr[i]);
        }
        this.OooO00o = o21VarArr2;
    }

    public o21[] getPathData() {
        return this.OooO00o;
    }

    public String getPathName() {
        return this.OooO0O0;
    }

    public void setPathData(o21[] o21VarArr) {
        o21[] o21VarArr2 = this.OooO00o;
        if (o21VarArr2 != null && o21VarArr != null && o21VarArr2.length == o21VarArr.length) {
            for (int i = 0; i < o21VarArr2.length; i++) {
                o21 o21Var = o21VarArr2[i];
                char c = o21Var.OooO00o;
                o21 o21Var2 = o21VarArr[i];
                if (c == o21Var2.OooO00o && o21Var.OooO0O0.length == o21Var2.OooO0O0.length) {
                }
            }
            o21[] o21VarArr3 = this.OooO00o;
            for (int i2 = 0; i2 < o21VarArr.length; i2++) {
                o21VarArr3[i2].OooO00o = o21VarArr[i2].OooO00o;
                int i3 = 0;
                while (true) {
                    float[] fArr = o21VarArr[i2].OooO0O0;
                    if (i3 < fArr.length) {
                        o21VarArr3[i2].OooO0O0[i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            return;
        }
        o21[] o21VarArr4 = new o21[o21VarArr.length];
        for (int i4 = 0; i4 < o21VarArr.length; i4++) {
            o21VarArr4[i4] = new o21(o21VarArr[i4]);
        }
        this.OooO00o = o21VarArr4;
    }

    public ds1() {
        this.OooO00o = null;
        this.OooO0OO = 0;
    }
}
