package com.cmaster.cloner;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o4 extends vo1 {
    public ArrayList OooOooO;
    public boolean OooOooo;
    public int Oooo000;
    public boolean Oooo00O;
    public int Oooo00o;

    @Override // com.cmaster.cloner.vo1
    public final void OooO0OO() {
        super.OooO0OO();
        int size = this.OooOooO.size();
        for (int i = 0; i < size; i++) {
            ((vo1) this.OooOooO.get(i)).OooO0OO();
        }
    }

    @Override // com.cmaster.cloner.vo1
    public final void OooO0Oo(fp1 fp1Var) {
        View view = fp1Var.OooO0O0;
        if (OooOo00(view)) {
            ArrayList arrayList = this.OooOooO;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                vo1 vo1Var = (vo1) obj;
                if (vo1Var.OooOo00(view)) {
                    vo1Var.OooO0Oo(fp1Var);
                    fp1Var.OooO0OO.add(vo1Var);
                }
            }
        }
    }

    @Override // com.cmaster.cloner.vo1
    public final void OooO0o(fp1 fp1Var) {
        int size = this.OooOooO.size();
        for (int i = 0; i < size; i++) {
            ((vo1) this.OooOooO.get(i)).OooO0o(fp1Var);
        }
    }

    @Override // com.cmaster.cloner.vo1
    public final void OooO0oO(fp1 fp1Var) {
        View view = fp1Var.OooO0O0;
        if (OooOo00(view)) {
            ArrayList arrayList = this.OooOooO;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                vo1 vo1Var = (vo1) obj;
                if (vo1Var.OooOo00(view)) {
                    vo1Var.OooO0oO(fp1Var);
                    fp1Var.OooO0OO.add(vo1Var);
                }
            }
        }
    }

    @Override // com.cmaster.cloner.vo1
    /* renamed from: OooOO0 */
    public final vo1 clone() {
        o4 o4Var = (o4) super.clone();
        o4Var.OooOooO = new ArrayList();
        int size = this.OooOooO.size();
        for (int i = 0; i < size; i++) {
            vo1 vo1VarClone = ((vo1) this.OooOooO.get(i)).clone();
            o4Var.OooOooO.add(vo1VarClone);
            vo1VarClone.OooOO0o = o4Var;
        }
        return o4Var;
    }

    @Override // com.cmaster.cloner.vo1
    public final void OooOO0o(ViewGroup viewGroup, ho1 ho1Var, ho1 ho1Var2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.OooO0o0;
        int size = this.OooOooO.size();
        for (int i = 0; i < size; i++) {
            vo1 vo1Var = (vo1) this.OooOooO.get(i);
            if (j > 0 && (this.OooOooo || i == 0)) {
                long j2 = vo1Var.OooO0o0;
                if (j2 > 0) {
                    vo1Var.Oooo000(j2 + j);
                } else {
                    vo1Var.Oooo000(j);
                }
            }
            vo1Var.OooOO0o(viewGroup, ho1Var, ho1Var2, arrayList, arrayList2);
        }
    }

    @Override // com.cmaster.cloner.vo1
    public final vo1 OooOo(to1 to1Var) {
        super.OooOo(to1Var);
        return this;
    }

    @Override // com.cmaster.cloner.vo1
    public final void OooOo0o(View view) {
        super.OooOo0o(view);
        int size = this.OooOooO.size();
        for (int i = 0; i < size; i++) {
            ((vo1) this.OooOooO.get(i)).OooOo0o(view);
        }
    }

    @Override // com.cmaster.cloner.vo1
    public final void OooOoO() {
        ArrayList arrayList;
        if (this.OooOooO.isEmpty()) {
            Oooo00O();
            OooOOO0();
            return;
        }
        bp1 bp1Var = new bp1();
        bp1Var.OooO0O0 = this;
        ArrayList arrayList2 = this.OooOooO;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((vo1) obj).OooO00o(bp1Var);
        }
        this.Oooo000 = this.OooOooO.size();
        if (this.OooOooo) {
            ArrayList arrayList3 = this.OooOooO;
            int size2 = arrayList3.size();
            while (i < size2) {
                Object obj2 = arrayList3.get(i);
                i++;
                ((vo1) obj2).OooOoO();
            }
            return;
        }
        int i3 = 1;
        while (true) {
            int size3 = this.OooOooO.size();
            arrayList = this.OooOooO;
            if (i3 >= size3) {
                break;
            }
            ((vo1) arrayList.get(i3 - 1)).OooO00o(new bp1((vo1) this.OooOooO.get(i3)));
            i3++;
        }
        vo1 vo1Var = (vo1) arrayList.get(0);
        if (vo1Var != null) {
            vo1Var.OooOoO();
        }
    }

    @Override // com.cmaster.cloner.vo1
    public final void OooOoO0(View view) {
        super.OooOoO0(view);
        int size = this.OooOooO.size();
        for (int i = 0; i < size; i++) {
            ((vo1) this.OooOooO.get(i)).OooOoO0(view);
        }
    }

    @Override // com.cmaster.cloner.vo1
    public final void OooOoOO(long j) {
        ArrayList arrayList;
        this.OooO0o = j;
        if (j < 0 || (arrayList = this.OooOooO) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((vo1) this.OooOooO.get(i)).OooOoOO(j);
        }
    }

    @Override // com.cmaster.cloner.vo1
    public final void OooOoo(TimeInterpolator timeInterpolator) {
        this.Oooo00o |= 1;
        ArrayList arrayList = this.OooOooO;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((vo1) this.OooOooO.get(i)).OooOoo(timeInterpolator);
            }
        }
        this.OooO0oO = timeInterpolator;
    }

    @Override // com.cmaster.cloner.vo1
    public final void OooOoo0(c53 c53Var) {
        this.Oooo00o |= 8;
        int size = this.OooOooO.size();
        for (int i = 0; i < size; i++) {
            ((vo1) this.OooOooO.get(i)).OooOoo0(c53Var);
        }
    }

    @Override // com.cmaster.cloner.vo1
    public final void OooOooO(gu0 gu0Var) {
        super.OooOooO(gu0Var);
        this.Oooo00o |= 4;
        if (this.OooOooO != null) {
            for (int i = 0; i < this.OooOooO.size(); i++) {
                ((vo1) this.OooOooO.get(i)).OooOooO(gu0Var);
            }
        }
    }

    @Override // com.cmaster.cloner.vo1
    public final void OooOooo() {
        this.Oooo00o |= 2;
        int size = this.OooOooO.size();
        for (int i = 0; i < size; i++) {
            ((vo1) this.OooOooO.get(i)).OooOooo();
        }
    }

    public final void Oooo0(vo1 vo1Var) {
        this.OooOooO.add(vo1Var);
        vo1Var.OooOO0o = this;
        long j = this.OooO0o;
        if (j >= 0) {
            vo1Var.OooOoOO(j);
        }
        if ((this.Oooo00o & 1) != 0) {
            vo1Var.OooOoo(this.OooO0oO);
        }
        if ((this.Oooo00o & 2) != 0) {
            vo1Var.OooOooo();
        }
        if ((this.Oooo00o & 4) != 0) {
            vo1Var.OooOooO(this.OooOoO0);
        }
        if ((this.Oooo00o & 8) != 0) {
            vo1Var.OooOoo0(null);
        }
    }

    @Override // com.cmaster.cloner.vo1
    public final void Oooo000(long j) {
        this.OooO0o0 = j;
    }

    @Override // com.cmaster.cloner.vo1
    public final String Oooo00o(String str) {
        String strOooo00o = super.Oooo00o(str);
        for (int i = 0; i < this.OooOooO.size(); i++) {
            strOooo00o = strOooo00o + "\n" + ((vo1) this.OooOooO.get(i)).Oooo00o(str.concat("  "));
        }
        return strOooo00o;
    }
}
