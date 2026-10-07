package com.cmaster.cloner;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class y61 {
    public final /* synthetic */ RecyclerView OooO00o;

    public /* synthetic */ y61(RecyclerView recyclerView) {
        this.OooO00o = recyclerView;
    }

    public void OooO00o(ooOOOOoo oooooooo) {
        int i = oooooooo.OooO00o;
        RecyclerView recyclerView = this.OooO00o;
        if (i == 1) {
            recyclerView.OooOOo0.OoooOoo(oooooooo.OooO0O0, oooooooo.OooO0Oo);
            return;
        }
        if (i == 2) {
            recyclerView.OooOOo0.OooooO0(oooooooo.OooO0O0, oooooooo.OooO0Oo);
        } else if (i == 4) {
            recyclerView.OooOOo0.OooooOO(oooooooo.OooO0O0, oooooooo.OooO0Oo);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.OooOOo0.Ooooo0o(oooooooo.OooO0O0, oooooooo.OooO0Oo);
        }
    }

    public y71 OooO0O0(int i) {
        RecyclerView recyclerView = this.OooO00o;
        int iOooOOO = recyclerView.OooO.OooOOO();
        int i2 = 0;
        y71 y71Var = null;
        while (true) {
            if (i2 >= iOooOOO) {
                break;
            }
            y71 y71VarOooo0oo = RecyclerView.Oooo0oo(recyclerView.OooO.OooOOO0(i2));
            if (y71VarOooo0oo != null && !y71VarOooo0oo.OooOO0() && y71VarOooo0oo.OooO0OO == i) {
                if (!((ArrayList) recyclerView.OooO.OooO0oo).contains(y71VarOooo0oo.OooO00o)) {
                    y71Var = y71VarOooo0oo;
                    break;
                }
                y71Var = y71VarOooo0oo;
            }
            i2++;
        }
        if (y71Var != null) {
            if (!((ArrayList) recyclerView.OooO.OooO0oo).contains(y71Var.OooO00o)) {
                return y71Var;
            }
            if (RecyclerView.o000OOo) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    public void OooO0OO(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.OooO00o;
        int iOooOOO = recyclerView.OooO.OooOOO();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iOooOOO; i6++) {
            View viewOooOOO0 = recyclerView.OooO.OooOOO0(i6);
            y71 y71VarOooo0oo = RecyclerView.Oooo0oo(viewOooOOO0);
            if (y71VarOooo0oo != null && !y71VarOooo0oo.OooOOo0() && (i4 = y71VarOooo0oo.OooO0OO) >= i && i4 < i5) {
                y71VarOooo0oo.OooO00o(2);
                if (obj == null) {
                    y71VarOooo0oo.OooO00o(1024);
                } else if ((1024 & y71VarOooo0oo.OooOO0) == 0) {
                    if (y71VarOooo0oo.OooOO0O == null) {
                        ArrayList arrayList = new ArrayList();
                        y71VarOooo0oo.OooOO0O = arrayList;
                        y71VarOooo0oo.OooOO0o = Collections.unmodifiableList(arrayList);
                    }
                    y71VarOooo0oo.OooOO0O.add(obj);
                }
                ((j71) viewOooOOO0.getLayoutParams()).OooO0OO = true;
            }
        }
        p71 p71Var = recyclerView.OooO0o;
        ArrayList arrayList2 = p71Var.OooO0OO;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            y71 y71Var = (y71) arrayList2.get(size);
            if (y71Var != null && (i3 = y71Var.OooO0OO) >= i && i3 < i5) {
                y71Var.OooO00o(2);
                p71Var.OooO0oo(size);
            }
        }
        recyclerView.o0OoOo0 = true;
    }

    public void OooO0Oo(int i, int i2) {
        RecyclerView recyclerView = this.OooO00o;
        int iOooOOO = recyclerView.OooO.OooOOO();
        for (int i3 = 0; i3 < iOooOOO; i3++) {
            y71 y71VarOooo0oo = RecyclerView.Oooo0oo(recyclerView.OooO.OooOOO0(i3));
            if (y71VarOooo0oo != null && !y71VarOooo0oo.OooOOo0() && y71VarOooo0oo.OooO0OO >= i) {
                if (RecyclerView.o000OOo) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i3 + " holder " + y71VarOooo0oo + " now at position " + (y71VarOooo0oo.OooO0OO + i2));
                }
                y71VarOooo0oo.OooOOO(i2, false);
                recyclerView.Oooooo0.OooO0o = true;
            }
        }
        ArrayList arrayList = recyclerView.OooO0o.OooO0OO;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            y71 y71Var = (y71) arrayList.get(i4);
            if (y71Var != null && y71Var.OooO0OO >= i) {
                if (RecyclerView.o000OOo) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i4 + " holder " + y71Var + " now at position " + (y71Var.OooO0OO + i2));
                }
                y71Var.OooOOO(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.Ooooooo = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void OooO0o(com.cmaster.cloner.y71 r8, com.cmaster.cloner.qw0 r9, com.cmaster.cloner.qw0 r10) {
        /*
            r7 = this;
            r0 = 0
            r8.OooOOOo(r0)
            androidx.recyclerview.widget.RecyclerView r7 = r7.OooO00o
            com.cmaster.cloner.f71 r0 = r7.Oooo
            r1 = r0
            com.cmaster.cloner.qo r1 = (com.cmaster.cloner.qo) r1
            if (r9 == 0) goto L1d
            r1.getClass()
            int r3 = r9.OooO00o
            int r5 = r10.OooO00o
            if (r3 != r5) goto L1f
            int r0 = r9.OooO0O0
            int r2 = r10.OooO0O0
            if (r0 == r2) goto L1d
            goto L1f
        L1d:
            r2 = r8
            goto L29
        L1f:
            int r4 = r9.OooO0O0
            int r6 = r10.OooO0O0
            r2 = r8
            boolean r8 = r1.OooO0oO(r2, r3, r4, r5, r6)
            goto L38
        L29:
            r1.OooOO0o(r2)
            android.view.View r8 = r2.OooO00o
            r9 = 0
            r8.setAlpha(r9)
            java.util.ArrayList r8 = r1.OooO
            r8.add(r2)
            r8 = 1
        L38:
            if (r8 == 0) goto L3d
            r7.OoooOo0()
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.y61.OooO0o(com.cmaster.cloner.y71, com.cmaster.cloner.qw0, com.cmaster.cloner.qw0):void");
    }

    public void OooO0o0(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.OooO00o;
        int iOooOOO = recyclerView.OooO.OooOOO();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iOooOOO; i11++) {
            y71 y71VarOooo0oo = RecyclerView.Oooo0oo(recyclerView.OooO.OooOOO0(i11));
            if (y71VarOooo0oo != null && (i9 = y71VarOooo0oo.OooO0OO) >= i4 && i9 <= i3) {
                if (RecyclerView.o000OOo) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i11 + " holder " + y71VarOooo0oo);
                }
                if (y71VarOooo0oo.OooO0OO == i) {
                    y71VarOooo0oo.OooOOO(i2 - i, false);
                } else {
                    y71VarOooo0oo.OooOOO(i5, false);
                }
                recyclerView.Oooooo0.OooO0o = true;
            }
        }
        ArrayList arrayList = recyclerView.OooO0o.OooO0OO;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            y71 y71Var = (y71) arrayList.get(i12);
            if (y71Var != null && (i8 = y71Var.OooO0OO) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    y71Var.OooOOO(i2 - i, false);
                } else {
                    y71Var.OooOOO(i10, false);
                }
                if (RecyclerView.o000OOo) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i12 + " holder " + y71Var);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.Ooooooo = true;
    }

    public void OooO0oO(y71 y71Var, qw0 qw0Var, qw0 qw0Var2) {
        boolean zOooO0oO;
        RecyclerView recyclerView = this.OooO00o;
        recyclerView.OooO0o.OooOOO0(y71Var);
        recyclerView.OooOO0(y71Var);
        y71Var.OooOOOo(false);
        qo qoVar = (qo) recyclerView.Oooo;
        qoVar.getClass();
        int i = qw0Var.OooO00o;
        int i2 = qw0Var.OooO0O0;
        View view = y71Var.OooO00o;
        int left = qw0Var2 == null ? view.getLeft() : qw0Var2.OooO00o;
        int top = qw0Var2 == null ? view.getTop() : qw0Var2.OooO0O0;
        if (y71Var.OooOO0() || (i == left && i2 == top)) {
            qoVar.OooOO0o(y71Var);
            qoVar.OooO0oo.add(y71Var);
            zOooO0oO = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zOooO0oO = qoVar.OooO0oO(y71Var, i, i2, left, top);
        }
        if (zOooO0oO) {
            recyclerView.OoooOo0();
        }
    }
}
