package com.cmaster.cloner;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o00O0OOO implements it0 {
    public final Context OooO0Oo;
    public ss0 OooO0o;
    public Context OooO0o0;
    public final LayoutInflater OooO0oO;
    public ht0 OooO0oo;
    public kt0 OooOO0O;
    public o00O0OO OooOO0o;
    public boolean OooOOO;
    public Drawable OooOOO0;
    public boolean OooOOOO;
    public boolean OooOOOo;
    public int OooOOo;
    public int OooOOo0;
    public int OooOOoo;
    public pi2 OooOo;
    public boolean OooOo00;
    public o00O0OO0 OooOo0O;
    public o00O0OO0 OooOo0o;
    public oo0o0O0 OooOoO0;
    public final int OooO = R.layout.abc_action_menu_layout;
    public final int OooOO0 = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray OooOo0 = new SparseBooleanArray();
    public final xb1 OooOoO = new xb1(this, 2);

    public o00O0OOO(Context context) {
        this.OooO0Oo = context;
        this.OooO0oO = LayoutInflater.from(context);
    }

    public final boolean OooO() {
        Object obj;
        pi2 pi2Var = this.OooOo;
        if (pi2Var != null && (obj = this.OooOO0O) != null) {
            ((View) obj).removeCallbacks(pi2Var);
            this.OooOo = null;
            return true;
        }
        o00O0OO0 o00o0oo0 = this.OooOo0O;
        if (o00o0oo0 == null) {
            return false;
        }
        if (o00o0oo0.OooO0O0()) {
            o00o0oo0.OooO.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.cmaster.cloner.jt0] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final View OooO00o(vs0 vs0Var, View view, ViewGroup viewGroup) {
        View actionView = vs0Var.getActionView();
        if (actionView == null || vs0Var.OooO0o0()) {
            ActionMenuItemView actionMenuItemView = view instanceof jt0 ? (jt0) view : (jt0) this.OooO0oO.inflate(this.OooOO0, viewGroup, false);
            actionMenuItemView.OooO00o(vs0Var);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.OooOO0O);
            if (this.OooOoO0 == null) {
                this.OooOoO0 = new oo0o0O0(this);
            }
            actionMenuItemView2.setPopupCallback(this.OooOoO0);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(vs0Var.Oooo000 ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof o00O)) {
            actionView.setLayoutParams(ActionMenuView.OooOO0(layoutParams));
        }
        return actionView;
    }

    @Override // com.cmaster.cloner.it0
    public final void OooO0O0(Context context, ss0 ss0Var) {
        this.OooO0o0 = context;
        LayoutInflater.from(context);
        this.OooO0o = ss0Var;
        Resources resources = context.getResources();
        if (!this.OooOOOo) {
            this.OooOOOO = true;
        }
        int i = 2;
        this.OooOOo0 = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.OooOOoo = i;
        int measuredWidth = this.OooOOo0;
        if (this.OooOOOO) {
            if (this.OooOO0o == null) {
                o00O0OO o00o0oo = new o00O0OO(this, this.OooO0Oo);
                this.OooOO0o = o00o0oo;
                if (this.OooOOO) {
                    o00o0oo.setImageDrawable(this.OooOOO0);
                    this.OooOOO0 = null;
                    this.OooOOO = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.OooOO0o.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.OooOO0o.getMeasuredWidth();
        } else {
            this.OooOO0o = null;
        }
        this.OooOOo = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // com.cmaster.cloner.it0
    public final void OooO0OO(ss0 ss0Var, boolean z) {
        OooO();
        o00O0OO0 o00o0oo0 = this.OooOo0o;
        if (o00o0oo0 != null && o00o0oo0.OooO0O0()) {
            o00o0oo0.OooO.dismiss();
        }
        ht0 ht0Var = this.OooO0oo;
        if (ht0Var != null) {
            ht0Var.OooO0OO(ss0Var, z);
        }
    }

    @Override // com.cmaster.cloner.it0
    public final void OooO0Oo(ht0 ht0Var) {
        throw null;
    }

    @Override // com.cmaster.cloner.it0
    public final boolean OooO0o(vs0 vs0Var) {
        return false;
    }

    @Override // com.cmaster.cloner.it0
    public final boolean OooO0o0() {
        int size;
        ArrayList arrayListOooOO0o;
        int i;
        boolean z;
        o00O0OOO o00o0ooo = this;
        ss0 ss0Var = o00o0ooo.OooO0o;
        if (ss0Var != null) {
            arrayListOooOO0o = ss0Var.OooOO0o();
            size = arrayListOooOO0o.size();
        } else {
            size = 0;
            arrayListOooOO0o = null;
        }
        int i2 = o00o0ooo.OooOOoo;
        int i3 = o00o0ooo.OooOOo;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) o00o0ooo.OooOO0O;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            vs0 vs0Var = (vs0) arrayListOooOO0o.get(i4);
            int i7 = vs0Var.OooOoo0;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (o00o0ooo.OooOo00 && vs0Var.Oooo000) {
                i2 = 0;
            }
            i4++;
        }
        if (o00o0ooo.OooOOOO && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = o00o0ooo.OooOo0;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            vs0 vs0Var2 = (vs0) arrayListOooOO0o.get(i9);
            int i11 = vs0Var2.OooOoo0;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = vs0Var2.OooO0o0;
            if (z3) {
                View viewOooO00o = o00o0ooo.OooO00o(vs0Var2, null, viewGroup);
                viewOooO00o.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewOooO00o.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                vs0Var2.OooO0o(z);
            } else if ((i11 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i12);
                boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                if (z5) {
                    View viewOooO00o2 = o00o0ooo.OooO00o(vs0Var2, null, viewGroup);
                    viewOooO00o2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewOooO00o2.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i10 == 0) {
                        i10 = measuredWidth2;
                    }
                    z5 &= i3 + i10 > 0;
                }
                if (z5 && i12 != 0) {
                    sparseBooleanArray.put(i12, true);
                } else if (z4) {
                    sparseBooleanArray.put(i12, false);
                    for (int i13 = 0; i13 < i9; i13++) {
                        vs0 vs0Var3 = (vs0) arrayListOooOO0o.get(i13);
                        if (vs0Var3.OooO0o0 == i12) {
                            if ((vs0Var3.OooOoOO & 32) == 32) {
                                i8++;
                            }
                            vs0Var3.OooO0o(false);
                        }
                    }
                }
                if (z5) {
                    i8--;
                }
                vs0Var2.OooO0o(z5);
            } else {
                vs0Var2.OooO0o(false);
                i9++;
                i = 2;
                o00o0ooo = this;
                z = true;
            }
            i9++;
            i = 2;
            o00o0ooo = this;
            z = true;
        }
        return z;
    }

    @Override // com.cmaster.cloner.it0
    public final boolean OooO0oO(vs0 vs0Var) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.cmaster.cloner.it0
    public final boolean OooO0oo(vj1 vj1Var) {
        boolean z;
        if (vj1Var.hasVisibleItems()) {
            vj1 vj1Var2 = vj1Var;
            while (true) {
                ss0 ss0Var = vj1Var2.OooOoo;
                if (ss0Var == this.OooO0o) {
                    break;
                }
                vj1Var2 = (vj1) ss0Var;
            }
            vs0 vs0Var = vj1Var2.OooOooO;
            ViewGroup viewGroup = (ViewGroup) this.OooOO0O;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof jt0) && ((jt0) childAt).getItemData() == vs0Var) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                vj1Var.OooOooO.getClass();
                int size = vj1Var.OooO.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = vj1Var.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                o00O0OO0 o00o0oo0 = new o00O0OO0(this, this.OooO0o0, vj1Var, view);
                this.OooOo0o = o00o0oo0;
                o00o0oo0.OooO0oO = z;
                at0 at0Var = o00o0oo0.OooO;
                if (at0Var != null) {
                    at0Var.OooOOOO(z);
                }
                o00O0OO0 o00o0oo02 = this.OooOo0o;
                if (!o00o0oo02.OooO0O0()) {
                    if (o00o0oo02.OooO0o0 == null) {
                        qa.OooO0o("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    o00o0oo02.OooO0Oo(0, 0, false, false);
                }
                ht0 ht0Var = this.OooO0oo;
                if (ht0Var != null) {
                    ht0Var.OooOOOO(vj1Var);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.cmaster.cloner.it0
    public final void OooOO0() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.OooOO0O;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            ss0 ss0Var = this.OooO0o;
            if (ss0Var != null) {
                ss0Var.OooO();
                ArrayList arrayListOooOO0o = this.OooO0o.OooOO0o();
                int size = arrayListOooOO0o.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    vs0 vs0Var = (vs0) arrayListOooOO0o.get(i2);
                    if ((vs0Var.OooOoOO & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        vs0 itemData = childAt instanceof jt0 ? ((jt0) childAt).getItemData() : null;
                        View viewOooO00o = OooO00o(vs0Var, childAt, viewGroup);
                        if (vs0Var != itemData) {
                            viewOooO00o.setPressed(false);
                            viewOooO00o.jumpDrawablesToCurrentState();
                        }
                        if (viewOooO00o != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewOooO00o.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewOooO00o);
                            }
                            ((ViewGroup) this.OooOO0O).addView(viewOooO00o, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.OooOO0o) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.OooOO0O).requestLayout();
        ss0 ss0Var2 = this.OooO0o;
        if (ss0Var2 != null) {
            ss0Var2.OooO();
            ArrayList arrayList2 = ss0Var2.OooOO0o;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ws0 ws0Var = ((vs0) arrayList2.get(i3)).OooOooO;
            }
        }
        ss0 ss0Var3 = this.OooO0o;
        if (ss0Var3 != null) {
            ss0Var3.OooO();
            arrayList = ss0Var3.OooOOO0;
        }
        if (this.OooOOOO && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((vs0) arrayList.get(0)).Oooo000;
            } else if (size3 > 0) {
                z = true;
            }
        }
        o00O0OO o00o0oo = this.OooOO0o;
        if (z) {
            if (o00o0oo == null) {
                this.OooOO0o = new o00O0OO(this, this.OooO0Oo);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.OooOO0o.getParent();
            if (viewGroup3 != this.OooOO0O) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.OooOO0o);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.OooOO0O;
                o00O0OO o00o0oo2 = this.OooOO0o;
                actionMenuView.getClass();
                o00O o00oOooO = ActionMenuView.OooO();
                o00oOooO.OooO00o = true;
                actionMenuView.addView(o00o0oo2, o00oOooO);
            }
        } else if (o00o0oo != null) {
            Object parent = o00o0oo.getParent();
            Object obj = this.OooOO0O;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.OooOO0o);
            }
        }
        ((ActionMenuView) this.OooOO0O).setOverflowReserved(this.OooOOOO);
    }

    public final boolean OooOO0O() {
        o00O0OO0 o00o0oo0 = this.OooOo0O;
        return o00o0oo0 != null && o00o0oo0.OooO0O0();
    }

    public final boolean OooOO0o() {
        ss0 ss0Var;
        boolean z = false;
        if (this.OooOOOO && !OooOO0O() && (ss0Var = this.OooO0o) != null && this.OooOO0O != null && this.OooOo == null) {
            ss0Var.OooO();
            if (!ss0Var.OooOOO0.isEmpty()) {
                pi2 pi2Var = new pi2(this, new o00O0OO0(this, this.OooO0o0, this.OooO0o, this.OooOO0o), 1, z);
                this.OooOo = pi2Var;
                ((View) this.OooOO0O).post(pi2Var);
                return true;
            }
        }
        return false;
    }
}
