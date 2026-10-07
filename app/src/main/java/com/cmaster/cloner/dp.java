package com.cmaster.cloner;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class dp {
    public final ViewGroup OooO00o;
    public final ArrayList OooO0O0 = new ArrayList();
    public final ArrayList OooO0OO = new ArrayList();
    public boolean OooO0Oo = false;
    public boolean OooO0o0 = false;

    public dp(ViewGroup viewGroup) {
        this.OooO00o = viewGroup;
    }

    public static dp OooO0o(ViewGroup viewGroup, s60 s60Var) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof dp) {
            return (dp) tag;
        }
        s60Var.getClass();
        dp dpVar = new dp(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, dpVar);
        return dpVar;
    }

    public final void OooO00o(int i, int i2, r20 r20Var) {
        synchronized (this.OooO0O0) {
            try {
                ib ibVar = new ib();
                ei1 ei1VarOooO0Oo = OooO0Oo(r20Var.OooO0OO);
                if (ei1VarOooO0Oo != null) {
                    ei1VarOooO0Oo.OooO0OO(i, i2);
                    return;
                }
                ei1 ei1Var = new ei1(i, i2, r20Var, ibVar);
                this.OooO0O0.add(ei1Var);
                ei1Var.OooO0Oo.add(new di1(this, ei1Var, 0));
                ei1Var.OooO0Oo.add(new di1(this, ei1Var, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0O0(ArrayList arrayList, boolean z) {
        boolean z2;
        int i;
        ViewGroup viewGroup;
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        ei1 ei1Var = null;
        ei1 ei1Var2 = null;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ei1 ei1Var3 = (ei1) obj;
            int iOooO0OO = px0.OooO0OO(ei1Var3.OooO0OO.Oooo0);
            int iOooOOoo = rj.OooOOoo(ei1Var3.OooO00o);
            if (iOooOOoo != 0) {
                if (iOooOOoo != 1) {
                    if (iOooOOoo == 2 || iOooOOoo == 3) {
                    }
                } else if (iOooO0OO != 2) {
                    ei1Var2 = ei1Var3;
                }
            }
            if (iOooO0OO == 2 && ei1Var == null) {
                ei1Var = ei1Var3;
            }
        }
        if (k20.Oooo000(2)) {
            Log.v("FragmentManager", "Executing operations from " + ei1Var + " to " + ei1Var2);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList(arrayList2);
        o10 o10Var = ((ei1) arrayList2.get(arrayList2.size() - 1)).OooO0OO;
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            n10 n10Var = ((ei1) obj2).OooO0OO.Oooo0o0;
            n10 n10Var2 = o10Var.Oooo0o0;
            n10Var.OooO0O0 = n10Var2.OooO0O0;
            n10Var.OooO0OO = n10Var2.OooO0OO;
            n10Var.OooO0Oo = n10Var2.OooO0Oo;
            n10Var.OooO0o0 = n10Var2.OooO0o0;
        }
        int size3 = arrayList2.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayList2.get(i4);
            i4++;
            ei1 ei1Var4 = (ei1) obj3;
            ib ibVar = new ib();
            ei1Var4.OooO0Oo();
            HashSet hashSet = ei1Var4.OooO0o0;
            hashSet.add(ibVar);
            bp bpVar = new bp(ei1Var4, ibVar);
            bpVar.OooO0oO = false;
            bpVar.OooO0o = z;
            arrayList3.add(bpVar);
            ib ibVar2 = new ib();
            ei1Var4.OooO0Oo();
            hashSet.add(ibVar2);
            boolean z3 = !z ? ei1Var4 != ei1Var2 : ei1Var4 != ei1Var;
            cp cpVar = new cp(ei1Var4, ibVar2);
            int i5 = ei1Var4.OooO00o;
            o10 o10Var2 = ei1Var4.OooO0OO;
            if (i5 == 2) {
                if (z) {
                    n10 n10Var3 = o10Var2.Oooo0o0;
                } else {
                    o10Var2.getClass();
                }
                if (z) {
                    n10 n10Var4 = o10Var2.Oooo0o0;
                } else {
                    n10 n10Var5 = o10Var2.Oooo0o0;
                }
            } else if (z) {
                n10 n10Var6 = o10Var2.Oooo0o0;
            } else {
                o10Var2.getClass();
            }
            if (z3) {
                if (z) {
                    n10 n10Var7 = o10Var2.Oooo0o0;
                } else {
                    o10Var2.getClass();
                }
            }
            arrayList4.add(cpVar);
            ei1Var4.OooO0Oo.add(new pi2(this, arrayList5, ei1Var4));
            arrayList2 = arrayList;
        }
        HashMap map = new HashMap();
        int size4 = arrayList4.size();
        int i6 = 0;
        while (i6 < size4) {
            Object obj4 = arrayList4.get(i6);
            i6++;
            ei1 ei1Var5 = (ei1) ((cp) obj4).OooO0Oo;
            if (px0.OooO0OO(ei1Var5.OooO0OO.Oooo0) != ei1Var5.OooO00o) {
            }
        }
        int size5 = arrayList4.size();
        int i7 = 0;
        while (i7 < size5) {
            Object obj5 = arrayList4.get(i7);
            i7++;
            cp cpVar2 = (cp) obj5;
            map.put((ei1) cpVar2.OooO0Oo, Boolean.FALSE);
            cpVar2.OooO0o0();
        }
        boolean zContainsValue = map.containsValue(Boolean.TRUE);
        ViewGroup viewGroup2 = this.OooO00o;
        Context context = viewGroup2.getContext();
        ArrayList arrayList6 = new ArrayList();
        int size6 = arrayList3.size();
        boolean z4 = false;
        int i8 = 0;
        while (i8 < size6) {
            Object obj6 = arrayList3.get(i8);
            int i9 = i8 + 1;
            bp bpVar2 = (bp) obj6;
            boolean z5 = zContainsValue;
            ei1 ei1Var6 = (ei1) bpVar2.OooO0Oo;
            ArrayList arrayList7 = arrayList3;
            int iOooO0OO2 = px0.OooO0OO(ei1Var6.OooO0OO.Oooo0);
            int i10 = ei1Var6.OooO00o;
            int i11 = size6;
            if (iOooO0OO2 == i10 || !(iOooO0OO2 == 2 || i10 == 2)) {
                z2 = z4;
                i = i9;
                viewGroup = viewGroup2;
                bpVar2.OooO0o0();
                size6 = i11;
                zContainsValue = z5;
                viewGroup2 = viewGroup;
                arrayList3 = arrayList7;
                i8 = i;
                z4 = z2;
            } else {
                e81 e81VarOooOOo0 = bpVar2.OooOOo0(context);
                if (e81VarOooOOo0 == null) {
                    bpVar2.OooO0o0();
                } else {
                    Animator animator = (Animator) e81VarOooOOo0.OooO0o;
                    if (animator == null) {
                        arrayList6.add(bpVar2);
                    } else {
                        ei1 ei1Var7 = (ei1) bpVar2.OooO0Oo;
                        o10 o10Var3 = ei1Var7.OooO0OO;
                        z2 = z4;
                        i = i9;
                        if (Boolean.TRUE.equals(map.get(ei1Var7))) {
                            if (k20.Oooo000(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + o10Var3 + " as this Fragment was involved in a Transition.");
                            }
                            bpVar2.OooO0o0();
                            viewGroup = viewGroup2;
                            size6 = i11;
                            zContainsValue = z5;
                            viewGroup2 = viewGroup;
                            arrayList3 = arrayList7;
                            i8 = i;
                            z4 = z2;
                        } else {
                            boolean z6 = ei1Var7.OooO00o == 3;
                            if (z6) {
                                arrayList5.remove(ei1Var7);
                            }
                            View view = o10Var3.Oooo0;
                            viewGroup2.startViewTransition(view);
                            ViewGroup viewGroup3 = viewGroup2;
                            animator.addListener(new zo(viewGroup3, view, z6, ei1Var7, bpVar2));
                            animator.setTarget(view);
                            animator.start();
                            if (k20.Oooo000(2)) {
                                Log.v("FragmentManager", "Animator from operation " + ei1Var7 + " has started.");
                            }
                            ((ib) bpVar2.OooO0o0).OooO00o(new e81(animator, ei1Var7, 11));
                            size6 = i11;
                            zContainsValue = z5;
                            viewGroup2 = viewGroup3;
                            arrayList3 = arrayList7;
                            i8 = i;
                            z4 = true;
                        }
                    }
                }
                z2 = z4;
                i = i9;
                viewGroup = viewGroup2;
                size6 = i11;
                zContainsValue = z5;
                viewGroup2 = viewGroup;
                arrayList3 = arrayList7;
                i8 = i;
                z4 = z2;
            }
        }
        boolean z7 = zContainsValue;
        boolean z8 = z4;
        ViewGroup viewGroup4 = viewGroup2;
        int size7 = arrayList6.size();
        int i12 = 0;
        while (i12 < size7) {
            Object obj7 = arrayList6.get(i12);
            i12++;
            bp bpVar3 = (bp) obj7;
            ei1 ei1Var8 = (ei1) bpVar3.OooO0Oo;
            o10 o10Var4 = ei1Var8.OooO0OO;
            if (z7) {
                if (k20.Oooo000(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + o10Var4 + " as Animations cannot run alongside Transitions.");
                }
                bpVar3.OooO0o0();
            } else if (z8) {
                if (k20.Oooo000(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + o10Var4 + " as Animations cannot run alongside Animators.");
                }
                bpVar3.OooO0o0();
            } else {
                View view2 = o10Var4.Oooo0;
                e81 e81VarOooOOo02 = bpVar3.OooOOo0(context);
                e81VarOooOOo02.getClass();
                Animation animation = (Animation) e81VarOooOOo02.OooO0o0;
                animation.getClass();
                int i13 = size7;
                if (ei1Var8.OooO00o != 1) {
                    view2.startAnimation(animation);
                    bpVar3.OooO0o0();
                } else {
                    viewGroup4.startViewTransition(view2);
                    r10 r10Var = new r10(animation, viewGroup4, view2);
                    r10Var.setAnimationListener(new ap(ei1Var8, viewGroup4, view2, bpVar3));
                    view2.startAnimation(r10Var);
                    if (k20.Oooo000(2)) {
                        Log.v("FragmentManager", "Animation from operation " + ei1Var8 + " has started.");
                    }
                }
                ViewGroup viewGroup5 = viewGroup4;
                ((ib) bpVar3.OooO0o0).OooO00o(new ho1(view2, viewGroup5, bpVar3, ei1Var8, 7));
                size7 = i13;
                viewGroup4 = viewGroup5;
            }
        }
        int size8 = arrayList5.size();
        int i14 = 0;
        while (i14 < size8) {
            Object obj8 = arrayList5.get(i14);
            i14++;
            ei1 ei1Var9 = (ei1) obj8;
            px0.OooO00o(ei1Var9.OooO0OO.Oooo0, ei1Var9.OooO00o);
        }
        arrayList5.clear();
        if (k20.Oooo000(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + ei1Var + " to " + ei1Var2);
        }
    }

    public final void OooO0OO() {
        if (this.OooO0o0) {
            return;
        }
        ViewGroup viewGroup = this.OooO00o;
        WeakHashMap weakHashMap = nt1.OooO00o;
        if (!viewGroup.isAttachedToWindow()) {
            OooO0o0();
            this.OooO0Oo = false;
            return;
        }
        synchronized (this.OooO0O0) {
            try {
                if (!this.OooO0O0.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.OooO0OO);
                    this.OooO0OO.clear();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ei1 ei1Var = (ei1) obj;
                        if (k20.Oooo000(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + ei1Var);
                        }
                        ei1Var.OooO00o();
                        if (!ei1Var.OooO0oO) {
                            this.OooO0OO.add(ei1Var);
                        }
                    }
                    OooO0oO();
                    ArrayList arrayList2 = new ArrayList(this.OooO0O0);
                    this.OooO0O0.clear();
                    this.OooO0OO.addAll(arrayList2);
                    if (k20.Oooo000(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        ((ei1) obj2).OooO0Oo();
                    }
                    OooO0O0(arrayList2, this.OooO0Oo);
                    this.OooO0Oo = false;
                    if (k20.Oooo000(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ei1 OooO0Oo(o10 o10Var) {
        ArrayList arrayList = this.OooO0O0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ei1 ei1Var = (ei1) obj;
            o10 o10Var2 = ei1Var.OooO0OO;
            o10Var2.getClass();
            if (o10Var2 == o10Var && !ei1Var.OooO0o) {
                return ei1Var;
            }
        }
        return null;
    }

    public final void OooO0o0() {
        String str;
        String str2;
        if (k20.Oooo000(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.OooO00o;
        WeakHashMap weakHashMap = nt1.OooO00o;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.OooO0O0) {
            try {
                OooO0oO();
                ArrayList arrayList = this.OooO0O0;
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((ei1) obj).OooO0Oo();
                }
                ArrayList arrayList2 = new ArrayList(this.OooO0OO);
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    ei1 ei1Var = (ei1) obj2;
                    if (k20.Oooo000(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (zIsAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.OooO00o + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(ei1Var);
                        Log.v("FragmentManager", sb.toString());
                    }
                    ei1Var.OooO00o();
                }
                ArrayList arrayList3 = new ArrayList(this.OooO0O0);
                int size3 = arrayList3.size();
                while (i < size3) {
                    Object obj3 = arrayList3.get(i);
                    i++;
                    ei1 ei1Var2 = (ei1) obj3;
                    if (k20.Oooo000(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (zIsAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.OooO00o + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(ei1Var2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    ei1Var2.OooO00o();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0oO() {
        ArrayList arrayList = this.OooO0O0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ei1 ei1Var = (ei1) obj;
            if (ei1Var.OooO0O0 == 2) {
                ei1Var.OooO0OO(px0.OooO0O0(ei1Var.OooO0OO.OoooO00().getVisibility()), 1);
            }
        }
    }
}
