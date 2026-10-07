package com.cmaster.cloner;

import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class up implements qp {
    public final ly1 OooO0Oo;
    public int OooO0o;
    public int OooO0oO;
    public ly1 OooO00o = null;
    public boolean OooO0O0 = false;
    public boolean OooO0OO = false;
    public int OooO0o0 = 1;
    public int OooO0oo = 1;
    public mr OooO = null;
    public boolean OooOO0 = false;
    public final ArrayList OooOO0O = new ArrayList();
    public final ArrayList OooOO0o = new ArrayList();

    public up(ly1 ly1Var) {
        this.OooO0Oo = ly1Var;
    }

    @Override // com.cmaster.cloner.qp
    public final void OooO00o(qp qpVar) {
        ArrayList arrayList = this.OooOO0o;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (!((up) obj).OooOO0) {
                return;
            }
        }
        this.OooO0OO = true;
        ly1 ly1Var = this.OooO00o;
        if (ly1Var != null) {
            ly1Var.OooO00o(this);
        }
        if (this.OooO0O0) {
            this.OooO0Oo.OooO00o(this);
            return;
        }
        int size2 = arrayList.size();
        up upVar = null;
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            up upVar2 = (up) obj2;
            if (!(upVar2 instanceof mr)) {
                i++;
                upVar = upVar2;
            }
        }
        if (upVar != null && i == 1 && upVar.OooOO0) {
            mr mrVar = this.OooO;
            if (mrVar != null) {
                if (!mrVar.OooOO0) {
                    return;
                } else {
                    this.OooO0o = this.OooO0oo * mrVar.OooO0oO;
                }
            }
            OooO0Oo(upVar.OooO0oO + this.OooO0o);
        }
        ly1 ly1Var2 = this.OooO00o;
        if (ly1Var2 != null) {
            ly1Var2.OooO00o(this);
        }
    }

    public final void OooO0O0(ly1 ly1Var) {
        this.OooOO0O.add(ly1Var);
        if (this.OooOO0) {
            ly1Var.OooO00o(ly1Var);
        }
    }

    public final void OooO0OO() {
        this.OooOO0o.clear();
        this.OooOO0O.clear();
        this.OooOO0 = false;
        this.OooO0oO = 0;
        this.OooO0OO = false;
        this.OooO0O0 = false;
    }

    public void OooO0Oo(int i) {
        if (this.OooOO0) {
            return;
        }
        this.OooOO0 = true;
        this.OooO0oO = i;
        ArrayList arrayList = this.OooOO0O;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            qp qpVar = (qp) obj;
            qpVar.OooO00o(qpVar);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.OooO0Oo.OooO0O0.OooooOo);
        sb.append(":");
        switch (this.OooO0o0) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.OooOO0 ? Integer.valueOf(this.OooO0oO) : "unresolved");
        sb.append(") <t=");
        sb.append(this.OooOO0o.size());
        sb.append(":d=");
        sb.append(this.OooOO0O.size());
        sb.append(">");
        return sb.toString();
    }
}
