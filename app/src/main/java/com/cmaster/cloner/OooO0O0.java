package com.cmaster.cloner;

import androidx.appcompat.widget.ActionBarContextView;
import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class OooO0O0 implements iu1 {
    public boolean OooO00o;
    public Object OooO0OO = new Object[4];
    public int OooO0O0 = 0;

    @Override // com.cmaster.cloner.iu1
    public void OooO00o() {
        this.OooO00o = true;
    }

    @Override // com.cmaster.cloner.iu1
    public void OooO0O0() {
        super/*android.view.View*/.setVisibility(0);
        this.OooO00o = false;
    }

    @Override // com.cmaster.cloner.iu1
    public void OooO0OO() {
        if (this.OooO00o) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.OooO0OO;
        actionBarContextView.OooO = null;
        super/*android.view.View*/.setVisibility(this.OooO0O0);
    }

    public void OooO0Oo(Object obj) {
        obj.getClass();
        OooO0o0(this.OooO0O0 + 1);
        Object[] objArr = (Object[]) this.OooO0OO;
        int i = this.OooO0O0;
        this.OooO0O0 = i + 1;
        objArr[i] = obj;
    }

    public qf2 OooO0o() {
        this.OooO00o = true;
        Object[] objArr = (Object[]) this.OooO0OO;
        int i = this.OooO0O0;
        dd2 dd2Var = ld2.OooO0o0;
        return i == 0 ? qf2.OooO0oo : new qf2(objArr, i);
    }

    public void OooO0o0(int i) {
        Object[] objArr = (Object[]) this.OooO0OO;
        int length = objArr.length;
        if (length >= i) {
            if (this.OooO00o) {
                this.OooO0OO = (Object[]) objArr.clone();
                this.OooO00o = false;
                return;
            }
            return;
        }
        int i2 = length + (length >> 1) + 1;
        if (i2 < i) {
            int iHighestOneBit = Integer.highestOneBit(i - 1);
            i2 = iHighestOneBit + iHighestOneBit;
        }
        if (i2 < 0) {
            i2 = Integer.MAX_VALUE;
        }
        this.OooO0OO = Arrays.copyOf(objArr, i2);
        this.OooO00o = false;
    }
}
