package com.cmaster.cloner;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class vo1 implements Cloneable {
    public ArrayList OooOOO;
    public ArrayList OooOOOO;
    public to1[] OooOOOo;
    public static final Animator[] OooOoO = new Animator[0];
    public static final int[] OooOoOO = {2, 1, 3, 4};
    public static final gu0 OooOoo0 = new gu0(13);
    public static final ThreadLocal OooOoo = new ThreadLocal();
    public final String OooO0Oo = getClass().getName();
    public long OooO0o0 = -1;
    public long OooO0o = -1;
    public TimeInterpolator OooO0oO = null;
    public final ArrayList OooO0oo = new ArrayList();
    public final ArrayList OooO = new ArrayList();
    public ho1 OooOO0 = new ho1(20);
    public ho1 OooOO0O = new ho1(20);
    public o4 OooOO0o = null;
    public final int[] OooOOO0 = OooOoOO;
    public final ArrayList OooOOo0 = new ArrayList();
    public Animator[] OooOOo = OooOoO;
    public int OooOOoo = 0;
    public boolean OooOo00 = false;
    public boolean OooOo0 = false;
    public vo1 OooOo0O = null;
    public ArrayList OooOo0o = null;
    public ArrayList OooOo = new ArrayList();
    public gu0 OooOoO0 = OooOoo0;

    public static void OooO0O0(ho1 ho1Var, View view, fp1 fp1Var) {
        k3 k3Var = (k3) ho1Var.OooO0o0;
        k3 k3Var2 = (k3) ho1Var.OooO0oo;
        SparseArray sparseArray = (SparseArray) ho1Var.OooO0o;
        gp0 gp0Var = (gp0) ho1Var.OooO0oO;
        k3Var.put(view, fp1Var);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = nt1.OooO00o;
        String strOooO0o = ft1.OooO0o(view);
        if (strOooO0o != null) {
            if (k3Var2.containsKey(strOooO0o)) {
                k3Var2.put(strOooO0o, null);
            } else {
                k3Var2.put(strOooO0o, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (gp0Var.OooO0Oo) {
                    int i = gp0Var.OooO0oO;
                    long[] jArr = gp0Var.OooO0o0;
                    Object[] objArr = gp0Var.OooO0o;
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        Object obj = objArr[i3];
                        if (obj != o62.OooO00o) {
                            if (i3 != i2) {
                                jArr[i2] = jArr[i3];
                                objArr[i2] = obj;
                                objArr[i3] = null;
                            }
                            i2++;
                        }
                    }
                    gp0Var.OooO0Oo = false;
                    gp0Var.OooO0oO = i2;
                }
                if (tf0.OooO0O0(gp0Var.OooO0o0, gp0Var.OooO0oO, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    gp0Var.OooO0Oo(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) gp0Var.OooO0O0(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    gp0Var.OooO0Oo(itemIdAtPosition, null);
                }
            }
        }
    }

    public static k3 OooOOOo() {
        ThreadLocal threadLocal = OooOoo;
        k3 k3Var = (k3) threadLocal.get();
        if (k3Var != null) {
            return k3Var;
        }
        k3 k3Var2 = new k3(0);
        threadLocal.set(k3Var2);
        return k3Var2;
    }

    public static boolean OooOo0(fp1 fp1Var, fp1 fp1Var2, String str) {
        Object obj = fp1Var.OooO00o.get(str);
        Object obj2 = fp1Var2.OooO00o.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public final void OooO(boolean z) {
        if (z) {
            ((k3) this.OooOO0.OooO0o0).clear();
            ((SparseArray) this.OooOO0.OooO0o).clear();
            ((gp0) this.OooOO0.OooO0oO).OooO00o();
        } else {
            ((k3) this.OooOO0O.OooO0o0).clear();
            ((SparseArray) this.OooOO0O.OooO0o).clear();
            ((gp0) this.OooOO0O.OooO0oO).OooO00o();
        }
    }

    public void OooO00o(to1 to1Var) {
        if (this.OooOo0o == null) {
            this.OooOo0o = new ArrayList();
        }
        this.OooOo0o.add(to1Var);
    }

    public void OooO0OO() {
        ArrayList arrayList = this.OooOOo0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.OooOOo);
        this.OooOOo = OooOoO;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.OooOOo = animatorArr;
        OooOo0O(this, uo1.OooO0OO);
    }

    public abstract void OooO0Oo(fp1 fp1Var);

    public void OooO0o(fp1 fp1Var) {
    }

    public final void OooO0o0(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            fp1 fp1Var = new fp1(view);
            if (z) {
                OooO0oO(fp1Var);
            } else {
                OooO0Oo(fp1Var);
            }
            fp1Var.OooO0OO.add(this);
            OooO0o(fp1Var);
            if (z) {
                OooO0O0(this.OooOO0, view, fp1Var);
            } else {
                OooO0O0(this.OooOO0O, view, fp1Var);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                OooO0o0(viewGroup.getChildAt(i), z);
            }
        }
    }

    public abstract void OooO0oO(fp1 fp1Var);

    public final void OooO0oo(ViewGroup viewGroup, boolean z) {
        OooO(z);
        ArrayList arrayList = this.OooO0oo;
        int size = arrayList.size();
        ArrayList arrayList2 = this.OooO;
        if (size <= 0 && arrayList2.size() <= 0) {
            OooO0o0(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                fp1 fp1Var = new fp1(viewFindViewById);
                if (z) {
                    OooO0oO(fp1Var);
                } else {
                    OooO0Oo(fp1Var);
                }
                fp1Var.OooO0OO.add(this);
                OooO0o(fp1Var);
                if (z) {
                    OooO0O0(this.OooOO0, viewFindViewById, fp1Var);
                } else {
                    OooO0O0(this.OooOO0O, viewFindViewById, fp1Var);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            fp1 fp1Var2 = new fp1(view);
            if (z) {
                OooO0oO(fp1Var2);
            } else {
                OooO0Oo(fp1Var2);
            }
            fp1Var2.OooO0OO.add(this);
            OooO0o(fp1Var2);
            if (z) {
                OooO0O0(this.OooOO0, view, fp1Var2);
            } else {
                OooO0O0(this.OooOO0O, view, fp1Var2);
            }
        }
    }

    @Override // 
    /* renamed from: OooOO0, reason: merged with bridge method [inline-methods] */
    public vo1 clone() {
        try {
            vo1 vo1Var = (vo1) super.clone();
            vo1Var.OooOo = new ArrayList();
            vo1Var.OooOO0 = new ho1(20);
            vo1Var.OooOO0O = new ho1(20);
            vo1Var.OooOOO = null;
            vo1Var.OooOOOO = null;
            vo1Var.OooOo0O = this;
            vo1Var.OooOo0o = null;
            return vo1Var;
        } catch (CloneNotSupportedException e) {
            sa.OooOO0(e);
            return null;
        }
    }

    public Animator OooOO0O(ViewGroup viewGroup, fp1 fp1Var, fp1 fp1Var2) {
        return null;
    }

    public void OooOO0o(ViewGroup viewGroup, ho1 ho1Var, ho1 ho1Var2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i2;
        View view;
        fp1 fp1Var;
        Animator animator;
        fp1 fp1Var2;
        k3 k3VarOooOOOo = OooOOOo();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        OooOOOO().getClass();
        int i3 = 0;
        while (i3 < size) {
            fp1 fp1Var3 = (fp1) arrayList.get(i3);
            fp1 fp1Var4 = (fp1) arrayList2.get(i3);
            if (fp1Var3 != null && !fp1Var3.OooO0OO.contains(this)) {
                fp1Var3 = null;
            }
            if (fp1Var4 != null && !fp1Var4.OooO0OO.contains(this)) {
                fp1Var4 = null;
            }
            if ((fp1Var3 != null || fp1Var4 != null) && (fp1Var3 == null || fp1Var4 == null || OooOOoo(fp1Var3, fp1Var4))) {
                Animator animatorOooOO0O = OooOO0O(viewGroup, fp1Var3, fp1Var4);
                if (animatorOooOO0O != null) {
                    String str = this.OooO0Oo;
                    if (fp1Var4 != null) {
                        view = fp1Var4.OooO0O0;
                        String[] strArrOooOOo0 = OooOOo0();
                        if (strArrOooOOo0 != null && strArrOooOOo0.length > 0) {
                            fp1Var2 = new fp1(view);
                            fp1 fp1Var5 = (fp1) ((k3) ho1Var2.OooO0o0).get(view);
                            i = size;
                            if (fp1Var5 != null) {
                                int i4 = 0;
                                while (i4 < strArrOooOOo0.length) {
                                    String str2 = strArrOooOOo0[i4];
                                    fp1Var2.OooO00o.put(str2, fp1Var5.OooO00o.get(str2));
                                    i4++;
                                    i3 = i3;
                                    fp1Var5 = fp1Var5;
                                }
                            }
                            i2 = i3;
                            int i5 = k3VarOooOOOo.OooO0o;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= i5) {
                                    animator = animatorOooOO0O;
                                    break;
                                }
                                so1 so1Var = (so1) k3VarOooOOOo.get((Animator) k3VarOooOOOo.OooO0o(i6));
                                if (so1Var.OooO0OO != null && so1Var.OooO00o == view && so1Var.OooO0O0.equals(str) && so1Var.OooO0OO.equals(fp1Var2)) {
                                    animator = null;
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            i = size;
                            i2 = i3;
                            animator = animatorOooOO0O;
                            fp1Var2 = null;
                        }
                        animatorOooOO0O = animator;
                        fp1Var = fp1Var2;
                    } else {
                        i = size;
                        i2 = i3;
                        view = fp1Var3.OooO0O0;
                        fp1Var = null;
                    }
                    if (animatorOooOO0O != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        so1 so1Var2 = new so1();
                        so1Var2.OooO00o = view;
                        so1Var2.OooO0O0 = str;
                        so1Var2.OooO0OO = fp1Var;
                        so1Var2.OooO0Oo = windowId;
                        so1Var2.OooO0o0 = this;
                        so1Var2.OooO0o = animatorOooOO0O;
                        k3VarOooOOOo.put(animatorOooOO0O, so1Var2);
                        this.OooOo.add(animatorOooOO0O);
                    }
                }
                i3 = i2 + 1;
                size = i;
            }
            i = size;
            i2 = i3;
            i3 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                so1 so1Var3 = (so1) k3VarOooOOOo.get((Animator) this.OooOo.get(sparseIntArray.keyAt(i7)));
                so1Var3.OooO0o.setStartDelay(so1Var3.OooO0o.getStartDelay() + (sparseIntArray.valueAt(i7) - Long.MAX_VALUE));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2 < 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r6 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r4 = r4.OooOOOO;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        r4 = r4.OooOOO;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        return (com.cmaster.cloner.fp1) r4.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.cmaster.cloner.fp1 OooOOO(android.view.View r5, boolean r6) {
        /*
            r4 = this;
            com.cmaster.cloner.o4 r0 = r4.OooOO0o
            if (r0 == 0) goto L9
            com.cmaster.cloner.fp1 r4 = r0.OooOOO(r5, r6)
            return r4
        L9:
            if (r6 == 0) goto Le
            java.util.ArrayList r0 = r4.OooOOO
            goto L10
        Le:
            java.util.ArrayList r0 = r4.OooOOOO
        L10:
            if (r0 != 0) goto L13
            goto L3c
        L13:
            int r1 = r0.size()
            r2 = 0
        L18:
            if (r2 >= r1) goto L2b
            java.lang.Object r3 = r0.get(r2)
            com.cmaster.cloner.fp1 r3 = (com.cmaster.cloner.fp1) r3
            if (r3 != 0) goto L23
            goto L3c
        L23:
            android.view.View r3 = r3.OooO0O0
            if (r3 != r5) goto L28
            goto L2c
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            r2 = -1
        L2c:
            if (r2 < 0) goto L3c
            if (r6 == 0) goto L33
            java.util.ArrayList r4 = r4.OooOOOO
            goto L35
        L33:
            java.util.ArrayList r4 = r4.OooOOO
        L35:
            java.lang.Object r4 = r4.get(r2)
            com.cmaster.cloner.fp1 r4 = (com.cmaster.cloner.fp1) r4
            return r4
        L3c:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.vo1.OooOOO(android.view.View, boolean):com.cmaster.cloner.fp1");
    }

    public final void OooOOO0() {
        int i = this.OooOOoo - 1;
        this.OooOOoo = i;
        if (i == 0) {
            OooOo0O(this, uo1.OooO0O0);
            for (int i2 = 0; i2 < ((gp0) this.OooOO0.OooO0oO).OooO0o0(); i2++) {
                View view = (View) ((gp0) this.OooOO0.OooO0oO).OooO0o(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((gp0) this.OooOO0O.OooO0oO).OooO0o0(); i3++) {
                View view2 = (View) ((gp0) this.OooOO0O.OooO0oO).OooO0o(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.OooOo0 = true;
        }
    }

    public final vo1 OooOOOO() {
        o4 o4Var = this.OooOO0o;
        return o4Var != null ? o4Var.OooOOOO() : this;
    }

    public final fp1 OooOOo(View view, boolean z) {
        o4 o4Var = this.OooOO0o;
        if (o4Var != null) {
            return o4Var.OooOOo(view, z);
        }
        return (fp1) ((k3) (z ? this.OooOO0 : this.OooOO0O).OooO0o0).get(view);
    }

    public String[] OooOOo0() {
        return null;
    }

    public boolean OooOOoo(fp1 fp1Var, fp1 fp1Var2) {
        if (fp1Var != null && fp1Var2 != null) {
            String[] strArrOooOOo0 = OooOOo0();
            if (strArrOooOOo0 != null) {
                for (String str : strArrOooOOo0) {
                    if (OooOo0(fp1Var, fp1Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = fp1Var.OooO00o.keySet().iterator();
                while (it.hasNext()) {
                    if (OooOo0(fp1Var, fp1Var2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public vo1 OooOo(to1 to1Var) {
        vo1 vo1Var;
        ArrayList arrayList = this.OooOo0o;
        if (arrayList != null) {
            if (!arrayList.remove(to1Var) && (vo1Var = this.OooOo0O) != null) {
                vo1Var.OooOo(to1Var);
            }
            if (this.OooOo0o.size() == 0) {
                this.OooOo0o = null;
            }
        }
        return this;
    }

    public final boolean OooOo00(View view) {
        int id = view.getId();
        ArrayList arrayList = this.OooO0oo;
        int size = arrayList.size();
        ArrayList arrayList2 = this.OooO;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final void OooOo0O(vo1 vo1Var, uo1 uo1Var) {
        vo1 vo1Var2 = this.OooOo0O;
        if (vo1Var2 != null) {
            vo1Var2.OooOo0O(vo1Var, uo1Var);
        }
        ArrayList arrayList = this.OooOo0o;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.OooOo0o.size();
        to1[] to1VarArr = this.OooOOOo;
        if (to1VarArr == null) {
            to1VarArr = new to1[size];
        }
        this.OooOOOo = null;
        to1[] to1VarArr2 = (to1[]) this.OooOo0o.toArray(to1VarArr);
        for (int i = 0; i < size; i++) {
            uo1Var.OooO00o(to1VarArr2[i], vo1Var);
            to1VarArr2[i] = null;
        }
        this.OooOOOo = to1VarArr2;
    }

    public void OooOo0o(View view) {
        if (this.OooOo0) {
            return;
        }
        ArrayList arrayList = this.OooOOo0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.OooOOo);
        this.OooOOo = OooOoO;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.OooOOo = animatorArr;
        OooOo0O(this, uo1.OooO0Oo);
        this.OooOo00 = true;
    }

    public void OooOoO() {
        Oooo00O();
        k3 k3VarOooOOOo = OooOOOo();
        ArrayList arrayList = this.OooOo;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Animator animator = (Animator) obj;
            if (k3VarOooOOOo.containsKey(animator)) {
                Oooo00O();
                if (animator != null) {
                    animator.addListener(new ro1(this, k3VarOooOOOo));
                    long j = this.OooO0o;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.OooO0o0;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.OooO0oO;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new oOO00O(this, 11));
                    animator.start();
                }
            }
        }
        this.OooOo.clear();
        OooOOO0();
    }

    public void OooOoO0(View view) {
        if (this.OooOo00) {
            if (!this.OooOo0) {
                ArrayList arrayList = this.OooOOo0;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.OooOOo);
                this.OooOOo = OooOoO;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.OooOOo = animatorArr;
                OooOo0O(this, uo1.OooO0o0);
            }
            this.OooOo00 = false;
        }
    }

    public void OooOoOO(long j) {
        this.OooO0o = j;
    }

    public void OooOoo(TimeInterpolator timeInterpolator) {
        this.OooO0oO = timeInterpolator;
    }

    public void OooOoo0(c53 c53Var) {
    }

    public void OooOooO(gu0 gu0Var) {
        if (gu0Var == null) {
            this.OooOoO0 = OooOoo0;
        } else {
            this.OooOoO0 = gu0Var;
        }
    }

    public void OooOooo() {
    }

    public void Oooo000(long j) {
        this.OooO0o0 = j;
    }

    public final void Oooo00O() {
        if (this.OooOOoo == 0) {
            OooOo0O(this, uo1.OooO00o);
            this.OooOo0 = false;
        }
        this.OooOOoo++;
    }

    public String Oooo00o(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.OooO0o != -1) {
            sb.append("dur(");
            sb.append(this.OooO0o);
            sb.append(") ");
        }
        if (this.OooO0o0 != -1) {
            sb.append("dly(");
            sb.append(this.OooO0o0);
            sb.append(") ");
        }
        if (this.OooO0oO != null) {
            sb.append("interp(");
            sb.append(this.OooO0oO);
            sb.append(") ");
        }
        ArrayList arrayList = this.OooO0oo;
        int size = arrayList.size();
        ArrayList arrayList2 = this.OooO;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public final String toString() {
        return Oooo00o("");
    }
}
