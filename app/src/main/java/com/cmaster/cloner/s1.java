package com.cmaster.cloner;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class s1 extends qe {
    public final /* synthetic */ int OooOO0O;
    public final SparseIntArray OooOO0o;

    public s1(int i) {
        this.OooOO0O = i;
        switch (i) {
            case 1:
                this.OooOO0o = new SparseIntArray();
                break;
            default:
                this.OooOO0o = new SparseIntArray();
                break;
        }
    }

    @Override // com.cmaster.cloner.qe
    public final String OooOOO(int i) {
        switch (this.OooOO0O) {
            case 0:
                cc ccVarOooOOO0 = OooOOO0(i);
                return ccVarOooOOO0 instanceof o2 ? ((o2) ccVarOooOOO0).OooO0o : ccVarOooOOO0 instanceof rl0 ? ((rl0) ccVarOooOOO0).OooO0o0 : "";
            default:
                cc ccVarOooOOO02 = OooOOO0(i);
                return ccVarOooOOO02 instanceof o2 ? ((o2) ccVarOooOOO02).OooO0o : ccVarOooOOO02 instanceof rl0 ? ((rl0) ccVarOooOOO02).OooO0o0 : "";
        }
    }

    public final int OooOOOo(RecyclerView recyclerView, y71 y71Var, int i, int i2) {
        int height;
        int height2;
        int i3 = this.OooOO0O;
        o0O000O o0o000o = this.OooO0Oo;
        SparseIntArray sparseIntArray = this.OooOO0o;
        switch (i3) {
            case 0:
                if (sparseIntArray.indexOfKey(i2) >= 0) {
                    return sparseIntArray.get(i2);
                }
                if (y71Var == null) {
                    c2 c2VarOooo0O0 = o0o000o.Oooo0O0(i2);
                    xj0 xj0VarOooO0OO = c2VarOooo0O0.OooO0OO(this, recyclerView);
                    View view = xj0VarOooO0OO.OooO00o;
                    c2VarOooo0O0.OooO0O0(xj0VarOooO0OO);
                    view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    height = view.getMeasuredHeight();
                } else {
                    height = y71Var.OooO00o.getHeight();
                }
                sparseIntArray.put(i2, height);
                return height;
            default:
                if (sparseIntArray.indexOfKey(i2) >= 0) {
                    return sparseIntArray.get(i2);
                }
                if (y71Var == null) {
                    c2 c2VarOooo0O02 = o0o000o.Oooo0O0(i2);
                    xj0 xj0VarOooO0OO2 = c2VarOooo0O02.OooO0OO(this, recyclerView);
                    View view2 = xj0VarOooO0OO2.OooO00o;
                    c2VarOooo0O02.OooO0O0(xj0VarOooO0OO2);
                    view2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    height2 = view2.getMeasuredHeight();
                } else {
                    height2 = y71Var.OooO00o.getHeight();
                }
                sparseIntArray.put(i2, height2);
                return height2;
        }
    }
}
