package com.cmaster.cloner;

import java.util.ListIterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class py0 extends el0 implements a40 {
    public final /* synthetic */ xy0 OooO0o;
    public final /* synthetic */ int OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ py0(xy0 xy0Var, int i) {
        super(1);
        this.OooO0o0 = i;
        this.OooO0o = xy0Var;
    }

    @Override // com.cmaster.cloner.a40
    public final Object OooO0o(Object obj) {
        int i = this.OooO0o0;
        vq1 vq1Var = vq1.OooO00o;
        Object obj2 = null;
        xy0 xy0Var = this.OooO0o;
        switch (i) {
            case 0:
                ((j5) obj).getClass();
                e3 e3Var = xy0Var.OooO0O0;
                ListIterator listIterator = e3Var.listIterator(e3Var.OooO00o());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        Object objPrevious = listIterator.previous();
                        if (((d20) objPrevious).OooO00o) {
                            obj2 = objPrevious;
                        }
                    }
                }
                xy0Var.OooO0OO = (d20) obj2;
                break;
            default:
                ((j5) obj).getClass();
                e3 e3Var2 = xy0Var.OooO0O0;
                ListIterator listIterator2 = e3Var2.listIterator(e3Var2.OooO00o());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        Object objPrevious2 = listIterator2.previous();
                        if (((d20) objPrevious2).OooO00o) {
                            obj2 = objPrevious2;
                        }
                    }
                }
                break;
        }
        return vq1Var;
    }
}
