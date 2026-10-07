package com.cmaster.cloner;

import java.util.ListIterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class qy0 extends el0 implements p30 {
    public final /* synthetic */ xy0 OooO0o;
    public final /* synthetic */ int OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qy0(xy0 xy0Var, int i) {
        super(0);
        this.OooO0o0 = i;
        this.OooO0o = xy0Var;
    }

    @Override // com.cmaster.cloner.p30
    public final Object OooO00o() {
        Object objPrevious;
        int i = this.OooO0o0;
        vq1 vq1Var = vq1.OooO00o;
        xy0 xy0Var = this.OooO0o;
        switch (i) {
            case 0:
                xy0Var.OooO00o();
                break;
            case 1:
                e3 e3Var = xy0Var.OooO0O0;
                ListIterator listIterator = e3Var.listIterator(e3Var.OooO00o());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        if (((d20) objPrevious).OooO00o) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                xy0Var.OooO0OO = null;
                break;
            default:
                xy0Var.OooO00o();
                break;
        }
        return vq1Var;
    }
}
