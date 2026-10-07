package com.cmaster.cloner;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class qo extends f71 {
    public static TimeInterpolator OooOOoo;
    public ArrayList OooO;
    public boolean OooO0oO;
    public ArrayList OooO0oo;
    public ArrayList OooOO0;
    public ArrayList OooOO0O;
    public ArrayList OooOO0o;
    public ArrayList OooOOO;
    public ArrayList OooOOO0;
    public ArrayList OooOOOO;
    public ArrayList OooOOOo;
    public ArrayList OooOOo;
    public ArrayList OooOOo0;

    public static void OooO0oo(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((y71) arrayList.get(size)).OooO00o.animate().cancel();
        }
    }

    public final void OooO() {
        if (OooO0o()) {
            return;
        }
        ArrayList arrayList = this.OooO0O0;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            ra.OooOO0o();
        }
    }

    @Override // com.cmaster.cloner.f71
    public final boolean OooO00o(y71 y71Var, y71 y71Var2, qw0 qw0Var, qw0 qw0Var2) {
        int i;
        int i2;
        int i3 = qw0Var.OooO00o;
        int i4 = qw0Var.OooO0O0;
        if (y71Var2.OooOOo0()) {
            int i5 = qw0Var.OooO00o;
            i2 = qw0Var.OooO0O0;
            i = i5;
        } else {
            i = qw0Var2.OooO00o;
            i2 = qw0Var2.OooO0O0;
        }
        if (y71Var == y71Var2) {
            return OooO0oO(y71Var, i3, i4, i, i2);
        }
        View view = y71Var.OooO00o;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        OooOO0o(y71Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = y71Var2.OooO00o;
        OooOO0o(y71Var2);
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.OooOO0O;
        no noVar = new no();
        noVar.OooO00o = y71Var;
        noVar.OooO0O0 = y71Var2;
        noVar.OooO0OO = i3;
        noVar.OooO0Oo = i4;
        noVar.OooO0o0 = i;
        noVar.OooO0o = i2;
        arrayList.add(noVar);
        return true;
    }

    @Override // com.cmaster.cloner.f71
    public final void OooO0Oo(y71 y71Var) {
        ArrayList arrayList = this.OooOO0o;
        ArrayList arrayList2 = this.OooOOO0;
        ArrayList arrayList3 = this.OooOOO;
        View view = y71Var.OooO00o;
        view.animate().cancel();
        ArrayList arrayList4 = this.OooOO0;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((po) arrayList4.get(size)).OooO00o == y71Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                OooO0OO(y71Var);
                arrayList4.remove(size);
            }
        }
        OooOO0(this.OooOO0O, y71Var);
        if (this.OooO0oo.remove(y71Var)) {
            view.setAlpha(1.0f);
            OooO0OO(y71Var);
        }
        if (this.OooO.remove(y71Var)) {
            view.setAlpha(1.0f);
            OooO0OO(y71Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            OooOO0(arrayList5, y71Var);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            int size4 = arrayList6.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((po) arrayList6.get(size4)).OooO00o == y71Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    OooO0OO(y71Var);
                    arrayList6.remove(size4);
                    if (arrayList6.isEmpty()) {
                        arrayList2.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(y71Var)) {
                view.setAlpha(1.0f);
                OooO0OO(y71Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.OooOOo0.remove(y71Var);
        this.OooOOOO.remove(y71Var);
        this.OooOOo.remove(y71Var);
        this.OooOOOo.remove(y71Var);
        OooO();
    }

    @Override // com.cmaster.cloner.f71
    public final boolean OooO0o() {
        return (this.OooO.isEmpty() && this.OooOO0O.isEmpty() && this.OooOO0.isEmpty() && this.OooO0oo.isEmpty() && this.OooOOOo.isEmpty() && this.OooOOo0.isEmpty() && this.OooOOOO.isEmpty() && this.OooOOo.isEmpty() && this.OooOOO0.isEmpty() && this.OooOO0o.isEmpty() && this.OooOOO.isEmpty()) ? false : true;
    }

    @Override // com.cmaster.cloner.f71
    public final void OooO0o0() {
        ArrayList arrayList = this.OooOO0O;
        ArrayList arrayList2 = this.OooOOO;
        ArrayList arrayList3 = this.OooOO0o;
        ArrayList arrayList4 = this.OooOOO0;
        ArrayList arrayList5 = this.OooO;
        ArrayList arrayList6 = this.OooO0oo;
        ArrayList arrayList7 = this.OooOO0;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            po poVar = (po) arrayList7.get(size);
            View view = poVar.OooO00o.OooO00o;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            OooO0OO(poVar.OooO00o);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            OooO0OO((y71) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            y71 y71Var = (y71) arrayList5.get(size3);
            y71Var.OooO00o.setAlpha(1.0f);
            OooO0OO(y71Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
            no noVar = (no) arrayList.get(size4);
            y71 y71Var2 = noVar.OooO00o;
            if (y71Var2 != null) {
                OooOO0O(noVar, y71Var2);
            }
            y71 y71Var3 = noVar.OooO0O0;
            if (y71Var3 != null) {
                OooOO0O(noVar, y71Var3);
            }
        }
        arrayList.clear();
        if (OooO0o()) {
            for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList4.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    po poVar2 = (po) arrayList8.get(size6);
                    View view2 = poVar2.OooO00o.OooO00o;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    OooO0OO(poVar2.OooO00o);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList4.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList3.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList3.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    y71 y71Var4 = (y71) arrayList9.get(size8);
                    y71Var4.OooO00o.setAlpha(1.0f);
                    OooO0OO(y71Var4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList3.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList2.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList2.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    no noVar2 = (no) arrayList10.get(size10);
                    y71 y71Var5 = noVar2.OooO00o;
                    if (y71Var5 != null) {
                        OooOO0O(noVar2, y71Var5);
                    }
                    y71 y71Var6 = noVar2.OooO0O0;
                    if (y71Var6 != null) {
                        OooOO0O(noVar2, y71Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList2.remove(arrayList10);
                    }
                }
            }
            OooO0oo(this.OooOOo0);
            OooO0oo(this.OooOOOo);
            OooO0oo(this.OooOOOO);
            OooO0oo(this.OooOOo);
            ArrayList arrayList11 = this.OooO0O0;
            if (arrayList11.size() <= 0) {
                arrayList11.clear();
            } else {
                arrayList11.get(0).getClass();
                ra.OooOO0o();
            }
        }
    }

    public final boolean OooO0oO(y71 y71Var, int i, int i2, int i3, int i4) {
        View view = y71Var.OooO00o;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) y71Var.OooO00o.getTranslationY());
        OooOO0o(y71Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            OooO0OO(y71Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.OooOO0;
        po poVar = new po();
        poVar.OooO00o = y71Var;
        poVar.OooO0O0 = translationX;
        poVar.OooO0OO = translationY;
        poVar.OooO0Oo = i3;
        poVar.OooO0o0 = i4;
        arrayList.add(poVar);
        return true;
    }

    public final void OooOO0(ArrayList arrayList, y71 y71Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            no noVar = (no) arrayList.get(size);
            if (OooOO0O(noVar, y71Var) && noVar.OooO00o == null && noVar.OooO0O0 == null) {
                arrayList.remove(noVar);
            }
        }
    }

    public final boolean OooOO0O(no noVar, y71 y71Var) {
        if (noVar.OooO0O0 == y71Var) {
            noVar.OooO0O0 = null;
        } else {
            if (noVar.OooO00o != y71Var) {
                return false;
            }
            noVar.OooO00o = null;
        }
        View view = y71Var.OooO00o;
        View view2 = y71Var.OooO00o;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        OooO0OO(y71Var);
        return true;
    }

    public final void OooOO0o(y71 y71Var) {
        if (OooOOoo == null) {
            OooOOoo = new ValueAnimator().getInterpolator();
        }
        y71Var.OooO00o.animate().setInterpolator(OooOOoo);
        OooO0Oo(y71Var);
    }
}
