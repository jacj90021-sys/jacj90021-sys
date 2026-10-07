package com.cmaster.cloner;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ub extends at0 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public final Handler OooO;
    public final int OooO0o;
    public final Context OooO0o0;
    public final int OooO0oO;
    public final boolean OooO0oo;
    public View OooOOo;
    public View OooOOo0;
    public int OooOOoo;
    public boolean OooOo0;
    public boolean OooOo00;
    public int OooOo0O;
    public int OooOo0o;
    public ht0 OooOoO;
    public boolean OooOoO0;
    public ViewTreeObserver OooOoOO;
    public boolean OooOoo;
    public PopupWindow.OnDismissListener OooOoo0;
    public final ArrayList OooOO0 = new ArrayList();
    public final ArrayList OooOO0O = new ArrayList();
    public final b0 OooOO0o = new b0(this, 2);
    public final rb OooOOO0 = new rb(this, 0);
    public final xb1 OooOOO = new xb1(this, 9);
    public int OooOOOO = 0;
    public int OooOOOo = 0;
    public boolean OooOo = false;

    public ub(Context context, View view, int i, boolean z) {
        this.OooO0o0 = context;
        this.OooOOo0 = view;
        this.OooO0oO = i;
        this.OooO0oo = z;
        this.OooOOoo = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.OooO0o = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.OooO = new Handler();
    }

    @Override // com.cmaster.cloner.wg1
    public final void OooO() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (OooO00o()) {
            return;
        }
        ArrayList arrayList = this.OooOO0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            OooOo0((ss0) obj);
        }
        arrayList.clear();
        View view = this.OooOOo0;
        this.OooOOo = view;
        if (view != null) {
            boolean z = this.OooOoOO == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.OooOoOO = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.OooOO0o);
            }
            this.OooOOo.addOnAttachStateChangeListener(this.OooOOO0);
        }
    }

    @Override // com.cmaster.cloner.wg1
    public final boolean OooO00o() {
        ArrayList arrayList = this.OooOO0O;
        return arrayList.size() > 0 && ((tb) arrayList.get(0)).OooO00o.OooOoo.isShowing();
    }

    @Override // com.cmaster.cloner.it0
    public final void OooO0OO(ss0 ss0Var, boolean z) {
        ArrayList arrayList = this.OooOO0O;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (ss0Var == ((tb) arrayList.get(i)).OooO0O0) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((tb) arrayList.get(i2)).OooO0O0.OooO0OO(false);
        }
        tb tbVar = (tb) arrayList.remove(i);
        ss0 ss0Var2 = tbVar.OooO0O0;
        gt0 gt0Var = tbVar.OooO00o;
        u uVar = gt0Var.OooOoo;
        ss0Var2.OooOOo(this);
        if (this.OooOoo) {
            dt0.OooO0O0(uVar, null);
            uVar.setAnimationStyle(0);
        }
        gt0Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.OooOOoo = ((tb) arrayList.get(size2 - 1)).OooO0OO;
        } else {
            this.OooOOoo = this.OooOOo0.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((tb) arrayList.get(0)).OooO0O0.OooO0OO(false);
                return;
            }
            return;
        }
        dismiss();
        ht0 ht0Var = this.OooOoO;
        if (ht0Var != null) {
            ht0Var.OooO0OO(ss0Var, true);
        }
        ViewTreeObserver viewTreeObserver = this.OooOoOO;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.OooOoOO.removeGlobalOnLayoutListener(this.OooOO0o);
            }
            this.OooOoOO = null;
        }
        this.OooOOo.removeOnAttachStateChangeListener(this.OooOOO0);
        this.OooOoo0.onDismiss();
    }

    @Override // com.cmaster.cloner.it0
    public final void OooO0Oo(ht0 ht0Var) {
        this.OooOoO = ht0Var;
    }

    @Override // com.cmaster.cloner.it0
    public final boolean OooO0o0() {
        return false;
    }

    @Override // com.cmaster.cloner.it0
    public final boolean OooO0oo(vj1 vj1Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = this.OooOO0O;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            tb tbVar = (tb) obj;
            if (vj1Var == tbVar.OooO0O0) {
                tbVar.OooO00o.OooO0o.requestFocus();
                return true;
            }
        }
        if (!vj1Var.hasVisibleItems()) {
            return false;
        }
        OooOO0O(vj1Var);
        ht0 ht0Var = this.OooOoO;
        if (ht0Var != null) {
            ht0Var.OooOOOO(vj1Var);
        }
        return true;
    }

    @Override // com.cmaster.cloner.it0
    public final void OooOO0() {
        ArrayList arrayList = this.OooOO0O;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((tb) obj).OooO00o.OooO0o.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((ps0) adapter).notifyDataSetChanged();
        }
    }

    @Override // com.cmaster.cloner.at0
    public final void OooOO0O(ss0 ss0Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ss0Var.OooO0O0(this, this.OooO0o0);
        if (OooO00o()) {
            OooOo0(ss0Var);
        } else {
            this.OooOO0.add(ss0Var);
        }
    }

    @Override // com.cmaster.cloner.wg1
    public final ot OooOO0o() {
        ArrayList arrayList = this.OooOO0O;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((tb) arrayList.get(arrayList.size() - 1)).OooO00o.OooO0o;
    }

    @Override // com.cmaster.cloner.at0
    public final void OooOOO(View view) {
        if (this.OooOOo0 != view) {
            this.OooOOo0 = view;
            this.OooOOOo = Gravity.getAbsoluteGravity(this.OooOOOO, view.getLayoutDirection());
        }
    }

    @Override // com.cmaster.cloner.at0
    public final void OooOOOO(boolean z) {
        this.OooOo = z;
    }

    @Override // com.cmaster.cloner.at0
    public final void OooOOOo(int i) {
        if (this.OooOOOO != i) {
            this.OooOOOO = i;
            this.OooOOOo = Gravity.getAbsoluteGravity(i, this.OooOOo0.getLayoutDirection());
        }
    }

    @Override // com.cmaster.cloner.at0
    public final void OooOOo(PopupWindow.OnDismissListener onDismissListener) {
        this.OooOoo0 = onDismissListener;
    }

    @Override // com.cmaster.cloner.at0
    public final void OooOOo0(int i) {
        this.OooOo00 = true;
        this.OooOo0O = i;
    }

    @Override // com.cmaster.cloner.at0
    public final void OooOOoo(boolean z) {
        this.OooOoO0 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cd  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOo0(com.cmaster.cloner.ss0 r20) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.ub.OooOo0(com.cmaster.cloner.ss0):void");
    }

    @Override // com.cmaster.cloner.at0
    public final void OooOo00(int i) {
        this.OooOo0 = true;
        this.OooOo0o = i;
    }

    @Override // com.cmaster.cloner.wg1
    public final void dismiss() {
        ArrayList arrayList = this.OooOO0O;
        int size = arrayList.size();
        if (size > 0) {
            tb[] tbVarArr = (tb[]) arrayList.toArray(new tb[size]);
            for (int i = size - 1; i >= 0; i--) {
                tb tbVar = tbVarArr[i];
                if (tbVar.OooO00o.OooOoo.isShowing()) {
                    tbVar.OooO00o.dismiss();
                }
            }
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        tb tbVar;
        ArrayList arrayList = this.OooOO0O;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                tbVar = null;
                break;
            }
            tbVar = (tb) arrayList.get(i);
            if (!tbVar.OooO00o.OooOoo.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (tbVar != null) {
            tbVar.OooO0O0.OooO0OO(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }
}
