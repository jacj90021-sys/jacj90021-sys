package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class s31 implements r31 {
    public final Object[] OooO0Oo;
    public int OooO0o0;

    public s31(int i) {
        if (i > 0) {
            this.OooO0Oo = new Object[i];
        } else {
            ra.OooOOO("The max pool size must be > 0");
            throw null;
        }
    }

    public void OooO00o(l3 l3Var) {
        int i = this.OooO0o0;
        Object[] objArr = this.OooO0Oo;
        if (i < objArr.length) {
            objArr[i] = l3Var;
            this.OooO0o0 = i + 1;
        }
    }

    @Override // com.cmaster.cloner.r31
    public boolean OooO0O0(Object obj) {
        obj.getClass();
        int i = this.OooO0o0;
        int i2 = 0;
        while (true) {
            Object[] objArr = this.OooO0Oo;
            if (i2 >= i) {
                int i3 = this.OooO0o0;
                if (i3 >= objArr.length) {
                    return false;
                }
                objArr[i3] = obj;
                this.OooO0o0 = i3 + 1;
                return true;
            }
            if (objArr[i2] == obj) {
                qa.OooO0o("Already in the pool!");
                return false;
            }
            i2++;
        }
    }

    @Override // com.cmaster.cloner.r31
    public Object OooO0oo() {
        int i = this.OooO0o0;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.OooO0Oo;
        Object obj = objArr[i2];
        obj.getClass();
        objArr[i2] = null;
        this.OooO0o0--;
        return obj;
    }

    public s31() {
        this.OooO0Oo = new Object[256];
    }
}
