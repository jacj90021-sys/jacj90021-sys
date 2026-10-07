package com.cmaster.cloner;

import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class i60 extends n30 {
    public final /* synthetic */ j60 OooO00o;

    public i60(j60 j60Var) {
        this.OooO00o = j60Var;
    }

    @Override // com.cmaster.cloner.n30
    public final void OooO00o() {
        j60 j60Var = this.OooO00o;
        ArrayList arrayList = j60Var.OooO0Oo;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            o30 o30Var = (o30) obj;
            o30Var.getClass();
            if (!j60Var.OooO) {
                j60Var.OooO = true;
                o30Var.OooO0O0();
            }
        }
    }

    @Override // com.cmaster.cloner.n30
    public final void OooO0O0() {
        j60 j60Var = this.OooO00o;
        ArrayList arrayList = j60Var.OooO0Oo;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o30) obj).OooO00o();
        }
        j60Var.OooO0o = 0;
        j60Var.OooO0OO.OooOOOO();
        j60Var.OooO = false;
        j60Var.OooO00o.OooOOOO();
        j60Var.OooO0O0.OooOO0o(wa1.OooO0o0(null));
    }

    @Override // com.cmaster.cloner.n30
    public final void OooO0OO(o0OOO0OO o0ooo0oo) {
        this.OooO00o.OooO00o(new o0O0O0Oo(o0ooo0oo, 1));
    }

    @Override // com.cmaster.cloner.n30
    public final void OooO0Oo() {
        ArrayList arrayList = this.OooO00o.OooO0Oo;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o30) obj).getClass();
        }
    }

    @Override // com.cmaster.cloner.n30
    public final void OooO0o0() {
        ArrayList arrayList = this.OooO00o.OooO0Oo;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o30) obj).getClass();
        }
    }
}
