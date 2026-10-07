package com.cmaster.cloner;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class r20 {
    public final o0O000O OooO00o;
    public final ho1 OooO0O0;
    public final o10 OooO0OO;
    public boolean OooO0Oo = false;
    public int OooO0o0 = -1;

    public r20(o0O000O o0o000o, ho1 ho1Var, ClassLoader classLoader, f20 f20Var, q20 q20Var) {
        this.OooO00o = o0o000o;
        this.OooO0O0 = ho1Var;
        o10 o10VarOooO00o = f20Var.OooO00o(q20Var.OooO0Oo);
        Bundle bundle = q20Var.OooOOO0;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        o10VarOooO00o.OoooO0O(bundle);
        o10VarOooO00o.OooO0oo = q20Var.OooO0o0;
        o10VarOooO00o.OooOOOo = q20Var.OooO0o;
        o10VarOooO00o.OooOOo = true;
        o10VarOooO00o.OooOoO0 = q20Var.OooO0oO;
        o10VarOooO00o.OooOoO = q20Var.OooO0oo;
        o10VarOooO00o.OooOoOO = q20Var.OooO;
        o10VarOooO00o.OooOooO = q20Var.OooOO0;
        o10VarOooO00o.OooOOOO = q20Var.OooOO0O;
        o10VarOooO00o.OooOoo = q20Var.OooOO0o;
        o10VarOooO00o.OooOoo0 = q20Var.OooOOO;
        o10VarOooO00o.OoooO00 = xl0.values()[q20Var.OooOOOO];
        Bundle bundle2 = q20Var.OooOOOo;
        if (bundle2 != null) {
            o10VarOooO00o.OooO0o0 = bundle2;
        } else {
            o10VarOooO00o.OooO0o0 = new Bundle();
        }
        this.OooO0OO = o10VarOooO00o;
        if (k20.Oooo000(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + o10VarOooO00o);
        }
    }

    public final void OooO() {
        boolean zOooo000 = k20.Oooo000(3);
        o10 o10Var = this.OooO0OO;
        if (zOooo000) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + o10Var);
        }
        o10Var.OooO0Oo = -1;
        o10Var.Oooo00O = false;
        o10Var.OooOooO();
        o10Var.Oooo0oO = null;
        if (!o10Var.Oooo00O) {
            throw new zj1(rj.OooO0O0("Fragment ", o10Var, " did not call through to super.onDetach()"));
        }
        k20 k20Var = o10Var.OooOo0o;
        if (!k20Var.Oooo00O) {
            k20Var.OooOO0O();
            o10Var.OooOo0o = new k20();
        }
        this.OooO00o.OooOOO(false);
        o10Var.OooO0Oo = -1;
        o10Var.OooOo0O = null;
        o10Var.OooOo = null;
        o10Var.OooOo0 = null;
        if (!o10Var.OooOOOO || o10Var.OooOo0()) {
            n20 n20Var = (n20) this.OooO0O0.OooO0oo;
            if (!((n20Var.OooO0o0.containsKey(o10Var.OooO0oo) && n20Var.OooO0oo) ? n20Var.OooO : true)) {
                return;
            }
        }
        if (k20.Oooo000(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + o10Var);
        }
        o10Var.OooOOo();
    }

    public final void OooO00o() {
        boolean zOooo000 = k20.Oooo000(3);
        o10 o10Var = this.OooO0OO;
        if (zOooo000) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + o10Var);
        }
        Bundle bundle = o10Var.OooO0o0;
        o10Var.OooOo0o.Oooo0o0();
        o10Var.OooO0Oo = 3;
        o10Var.Oooo00O = false;
        o10Var.OooOo0O();
        if (!o10Var.Oooo00O) {
            throw new zj1(rj.OooO0O0("Fragment ", o10Var, " did not call through to super.onActivityCreated()"));
        }
        if (k20.Oooo000(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + o10Var);
        }
        View view = o10Var.Oooo0;
        if (view != null) {
            Bundle bundle2 = o10Var.OooO0o0;
            SparseArray<Parcelable> sparseArray = o10Var.OooO0o;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                o10Var.OooO0o = null;
            }
            if (o10Var.Oooo0 != null) {
                o10Var.OoooO0O.OooO0oo.OooOo0(o10Var.OooO0oO);
                o10Var.OooO0oO = null;
            }
            o10Var.Oooo00O = false;
            o10Var.Oooo0o0(bundle2);
            if (!o10Var.Oooo00O) {
                throw new zj1(rj.OooO0O0("Fragment ", o10Var, " did not call through to super.onViewStateRestored()"));
            }
            if (o10Var.Oooo0 != null) {
                o10Var.OoooO0O.OooO0o0(wl0.ON_CREATE);
            }
        }
        o10Var.OooO0o0 = null;
        k20 k20Var = o10Var.OooOo0o;
        k20Var.OooOooo = false;
        k20Var.Oooo000 = false;
        k20Var.Oooo0o0.OooOO0 = false;
        k20Var.OooOo00(4);
        this.OooO00o.OooOO0(false);
    }

    public final void OooO0O0() {
        View view;
        View view2;
        ArrayList arrayList = (ArrayList) this.OooO0O0.OooO0o0;
        o10 o10Var = this.OooO0OO;
        ViewGroup viewGroup = o10Var.Oooo00o;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(o10Var);
            int i = iIndexOf - 1;
            while (true) {
                if (i < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        o10 o10Var2 = (o10) arrayList.get(iIndexOf);
                        if (o10Var2.Oooo00o == viewGroup && (view = o10Var2.Oooo0) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    o10 o10Var3 = (o10) arrayList.get(i);
                    if (o10Var3.Oooo00o == viewGroup && (view2 = o10Var3.Oooo0) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i--;
                }
            }
        }
        o10Var.Oooo00o.addView(o10Var.Oooo0, iIndexOfChild);
    }

    public final void OooO0OO() {
        boolean zOooo000 = k20.Oooo000(3);
        o10 o10Var = this.OooO0OO;
        if (zOooo000) {
            Log.d("FragmentManager", "moveto ATTACHED: " + o10Var);
        }
        o10 o10Var2 = o10Var.OooOO0;
        r20 r20Var = null;
        ho1 ho1Var = this.OooO0O0;
        if (o10Var2 != null) {
            r20 r20Var2 = (r20) ((HashMap) ho1Var.OooO0o).get(o10Var2.OooO0oo);
            if (r20Var2 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(o10Var);
                o10 o10Var3 = o10Var.OooOO0;
                sb.append(" declared target fragment ");
                sb.append(o10Var3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            o10Var.OooOO0O = o10Var.OooOO0.OooO0oo;
            o10Var.OooOO0 = null;
            r20Var = r20Var2;
        } else {
            String str = o10Var.OooOO0O;
            if (str != null && (r20Var = (r20) ((HashMap) ho1Var.OooO0o).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(o10Var);
                sb2.append(" declared target fragment ");
                qa.OooO0o(rj.OooO0oO(sb2, o10Var.OooOO0O, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (r20Var != null) {
            r20Var.OooOO0O();
        }
        k20 k20Var = o10Var.OooOo0;
        o10Var.OooOo0O = k20Var.OooOo00;
        o10Var.OooOo = k20Var.OooOo0O;
        o0O000O o0o000o = this.OooO00o;
        o0o000o.OooOOOo(false);
        ArrayList arrayList = o10Var.OoooOOO;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((l10) obj).OooO00o();
        }
        arrayList.clear();
        o10Var.OooOo0o.OooO0O0(o10Var.OooOo0O, o10Var.OooO0o0(), o10Var);
        o10Var.OooO0Oo = 0;
        o10Var.Oooo00O = false;
        o10Var.OooOo(o10Var.OooOo0O.OooO0o0);
        if (!o10Var.Oooo00O) {
            throw new zj1(rj.OooO0O0("Fragment ", o10Var, " did not call through to super.onAttach()"));
        }
        Iterator it = o10Var.OooOo0.OooOOO0.iterator();
        while (it.hasNext()) {
            ((o20) it.next()).OooO00o();
        }
        k20 k20Var2 = o10Var.OooOo0o;
        k20Var2.OooOooo = false;
        k20Var2.Oooo000 = false;
        k20Var2.Oooo0o0.OooOO0 = false;
        k20Var2.OooOo00(0);
        o0o000o.OooOO0O(false);
    }

    public final int OooO0Oo() {
        ei1 ei1Var;
        o10 o10Var = this.OooO0OO;
        if (o10Var.OooOo0 == null) {
            return o10Var.OooO0Oo;
        }
        int iMin = this.OooO0o0;
        int iOrdinal = o10Var.OoooO00.ordinal();
        int i = 0;
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (o10Var.OooOOOo) {
            boolean z = o10Var.OooOOo0;
            int i2 = this.OooO0o0;
            if (z) {
                iMin = Math.max(i2, 2);
                View view = o10Var.Oooo0;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = i2 < 4 ? Math.min(iMin, o10Var.OooO0Oo) : Math.min(iMin, 1);
            }
        }
        if (!o10Var.OooOOO) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = o10Var.Oooo00o;
        if (viewGroup != null) {
            dp dpVarOooO0o = dp.OooO0o(viewGroup, o10Var.OooOOO0().OooOooO());
            ei1 ei1VarOooO0Oo = dpVarOooO0o.OooO0Oo(o10Var);
            int i3 = ei1VarOooO0Oo != null ? ei1VarOooO0Oo.OooO0O0 : 0;
            ArrayList arrayList = dpVarOooO0o.OooO0OO;
            int size = arrayList.size();
            while (true) {
                if (i >= size) {
                    ei1Var = null;
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                ei1Var = (ei1) obj;
                o10 o10Var2 = ei1Var.OooO0OO;
                o10Var2.getClass();
                if (o10Var2 == o10Var && !ei1Var.OooO0o) {
                    break;
                }
            }
            i = (ei1Var == null || !(i3 == 0 || i3 == 1)) ? i3 : ei1Var.OooO0O0;
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (o10Var.OooOOOO) {
            iMin = o10Var.OooOo0() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (o10Var.Oooo0O0 && o10Var.OooO0Oo < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (k20.Oooo000(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + o10Var);
        }
        return iMin;
    }

    public final void OooO0o() throws Resources.NotFoundException {
        String resourceName;
        o10 o10Var = this.OooO0OO;
        if (o10Var.OooOOOo) {
            return;
        }
        if (k20.Oooo000(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + o10Var);
        }
        LayoutInflater layoutInflaterOooOooo = o10Var.OooOooo(o10Var.OooO0o0);
        o10Var.Oooo0oO = layoutInflaterOooOooo;
        ViewGroup viewGroup = o10Var.Oooo00o;
        if (viewGroup == null) {
            int i = o10Var.OooOoO;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    ra.OooOOO(rj.OooO0O0("Cannot create fragment ", o10Var, " for a container view with no id"));
                    return;
                }
                viewGroup = (ViewGroup) o10Var.OooOo0.OooOo0.OooO0O0(i);
                if (viewGroup == null) {
                    if (!o10Var.OooOOo) {
                        try {
                            resourceName = o10Var.OooOOO().getResourceName(o10Var.OooOoO);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(o10Var.OooOoO) + " (" + resourceName + ") for fragment " + o10Var);
                    }
                } else if (!(viewGroup instanceof s10)) {
                    s20 s20Var = t20.OooO00o;
                    t20.OooO0O0(new u20(o10Var, viewGroup, 1));
                    t20.OooO00o(o10Var).getClass();
                }
            }
        }
        o10Var.Oooo00o = viewGroup;
        o10Var.Oooo0o(layoutInflaterOooOooo, viewGroup, o10Var.OooO0o0);
        View view = o10Var.Oooo0;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            o10Var.Oooo0.setTag(R.id.fragment_container_view_tag, o10Var);
            if (viewGroup != null) {
                OooO0O0();
            }
            if (o10Var.OooOoo0) {
                o10Var.Oooo0.setVisibility(8);
            }
            View view2 = o10Var.Oooo0;
            WeakHashMap weakHashMap = nt1.OooO00o;
            boolean zIsAttachedToWindow = view2.isAttachedToWindow();
            View view3 = o10Var.Oooo0;
            if (zIsAttachedToWindow) {
                dt1.OooO0OO(view3);
            } else {
                view3.addOnAttachStateChangeListener(new rb(view3, 2));
            }
            o10Var.Oooo0OO(o10Var.OooO0o0);
            o10Var.OooOo0o.OooOo00(2);
            this.OooO00o.OooOo0O(false);
            int visibility = o10Var.Oooo0.getVisibility();
            o10Var.OooO0oO().OooOO0 = o10Var.Oooo0.getAlpha();
            if (o10Var.Oooo00o != null && visibility == 0) {
                View viewFindFocus = o10Var.Oooo0.findFocus();
                if (viewFindFocus != null) {
                    o10Var.OooO0oO().OooOO0O = viewFindFocus;
                    if (k20.Oooo000(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + o10Var);
                    }
                }
                o10Var.Oooo0.setAlpha(0.0f);
            }
        }
        o10Var.OooO0Oo = 2;
    }

    public final void OooO0o0() {
        Parcelable parcelable;
        int i = 3;
        boolean zOooo000 = k20.Oooo000(3);
        o10 o10Var = this.OooO0OO;
        if (zOooo000) {
            Log.d("FragmentManager", "moveto CREATED: " + o10Var);
        }
        boolean z = o10Var.Oooo0oo;
        Bundle bundle = o10Var.OooO0o0;
        if (z) {
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                o10Var.OooOo0o.OoooO00(parcelable);
                k20 k20Var = o10Var.OooOo0o;
                k20Var.OooOooo = false;
                k20Var.Oooo000 = false;
                k20Var.Oooo0o0.OooOO0 = false;
                k20Var.OooOo00(1);
            }
            o10Var.OooO0Oo = 1;
            return;
        }
        o0O000O o0o000o = this.OooO00o;
        o0o000o.OooOOo0(false);
        Bundle bundle2 = o10Var.OooO0o0;
        o10Var.OooOo0o.Oooo0o0();
        o10Var.OooO0Oo = 1;
        o10Var.Oooo00O = false;
        o10Var.OoooO0.OooO0OO(new v61(o10Var, i));
        o10Var.o000oOoO.OooOo0(bundle2);
        o10Var.OooOoO0(bundle2);
        o10Var.Oooo0oo = true;
        if (!o10Var.Oooo00O) {
            throw new zj1(rj.OooO0O0("Fragment ", o10Var, " did not call through to super.onCreate()"));
        }
        o10Var.OoooO0.OooO(wl0.ON_CREATE);
        o0o000o.OooOO0o(false);
    }

    public final void OooO0oO() {
        o10 o10VarOooOOo0;
        boolean zOooo000 = k20.Oooo000(3);
        o10 o10Var = this.OooO0OO;
        if (zOooo000) {
            Log.d("FragmentManager", "movefrom CREATED: " + o10Var);
        }
        boolean zIsChangingConfigurations = true;
        int i = 0;
        boolean z = o10Var.OooOOOO && !o10Var.OooOo0();
        ho1 ho1Var = this.OooO0O0;
        if (z) {
        }
        if (!z) {
            n20 n20Var = (n20) ho1Var.OooO0oo;
            if (!((n20Var.OooO0o0.containsKey(o10Var.OooO0oo) && n20Var.OooO0oo) ? n20Var.OooO : true)) {
                String str = o10Var.OooOO0O;
                if (str != null && (o10VarOooOOo0 = ho1Var.OooOOo0(str)) != null && o10VarOooOOo0.OooOooO) {
                    o10Var.OooOO0 = o10VarOooOOo0;
                }
                o10Var.OooO0Oo = 0;
                return;
            }
        }
        q10 q10Var = o10Var.OooOo0O;
        if (q10Var != null) {
            zIsChangingConfigurations = ((n20) ho1Var.OooO0oo).OooO;
        } else {
            oOOO00 oooo00 = q10Var.OooO0o0;
            if (oooo00 != null) {
                zIsChangingConfigurations = true ^ oooo00.isChangingConfigurations();
            }
        }
        if (z || zIsChangingConfigurations) {
            ((n20) ho1Var.OooO0oo).OooO0OO(o10Var);
        }
        o10Var.OooOo0o.OooOO0O();
        o10Var.OoooO0.OooO(wl0.ON_DESTROY);
        o10Var.OooO0Oo = 0;
        o10Var.Oooo00O = false;
        o10Var.Oooo0oo = false;
        o10Var.OooOoo0();
        if (!o10Var.Oooo00O) {
            throw new zj1(rj.OooO0O0("Fragment ", o10Var, " did not call through to super.onDestroy()"));
        }
        this.OooO00o.OooOOO0(false);
        ArrayList arrayListOooOo0 = ho1Var.OooOo0();
        int size = arrayListOooOo0.size();
        while (i < size) {
            Object obj = arrayListOooOo0.get(i);
            i++;
            r20 r20Var = (r20) obj;
            if (r20Var != null) {
                o10 o10Var2 = r20Var.OooO0OO;
                if (o10Var.OooO0oo.equals(o10Var2.OooOO0O)) {
                    o10Var2.OooOO0 = o10Var;
                    o10Var2.OooOO0O = null;
                }
            }
        }
        String str2 = o10Var.OooOO0O;
        if (str2 != null) {
            o10Var.OooOO0 = ho1Var.OooOOo0(str2);
        }
        ho1Var.Oooo00O(this);
    }

    public final void OooO0oo() {
        View view;
        boolean zOooo000 = k20.Oooo000(3);
        o10 o10Var = this.OooO0OO;
        if (zOooo000) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + o10Var);
        }
        ViewGroup viewGroup = o10Var.Oooo00o;
        if (viewGroup != null && (view = o10Var.Oooo0) != null) {
            viewGroup.removeView(view);
        }
        o10Var.OooOo0o.OooOo00(1);
        if (o10Var.Oooo0 != null) {
            w20 w20Var = o10Var.OoooO0O;
            w20Var.OooO0oO();
            if (w20Var.OooO0oO.OooO0o.compareTo(xl0.OooO0o) >= 0) {
                o10Var.OoooO0O.OooO0o0(wl0.ON_DESTROY);
            }
        }
        o10Var.OooO0Oo = 1;
        o10Var.Oooo00O = false;
        o10Var.OooOoo();
        if (!o10Var.Oooo00O) {
            throw new zj1(rj.OooO0O0("Fragment ", o10Var, " did not call through to super.onDestroyView()"));
        }
        du1 du1VarOooO0OO = o10Var.OooO0OO();
        du1VarOooO0OO.getClass();
        mk mkVar = mk.OooO0O0;
        mkVar.getClass();
        ho1 ho1Var = new ho1(du1VarOooO0OO, bo0.OooO0o, mkVar);
        rd rdVarOooO00o = r81.OooO00o(bo0.class);
        String strOooO0O0 = rdVarOooO00o.OooO0O0();
        if (strOooO0O0 == null) {
            ra.OooOOO("Local and anonymous classes can not be ViewModels");
            return;
        }
        ci1 ci1Var = ((bo0) ho1Var.OooOoo0(rdVarOooO00o, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strOooO0O0))).OooO0o0;
        if (ci1Var.OooO0o > 0) {
            throw px0.OooOO0O(ci1Var.OooO0o0[0]);
        }
        o10Var.OooOOoo = false;
        this.OooO00o.OooOo0o(false);
        o10Var.Oooo00o = null;
        o10Var.Oooo0 = null;
        o10Var.OoooO0O = null;
        o10Var.OoooO.OooOO0o(null);
        o10Var.OooOOo0 = false;
    }

    public final void OooOO0() {
        o10 o10Var = this.OooO0OO;
        if (o10Var.OooOOOo && o10Var.OooOOo0 && !o10Var.OooOOoo) {
            if (k20.Oooo000(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + o10Var);
            }
            LayoutInflater layoutInflaterOooOooo = o10Var.OooOooo(o10Var.OooO0o0);
            o10Var.Oooo0oO = layoutInflaterOooOooo;
            o10Var.Oooo0o(layoutInflaterOooOooo, null, o10Var.OooO0o0);
            View view = o10Var.Oooo0;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                o10Var.Oooo0.setTag(R.id.fragment_container_view_tag, o10Var);
                if (o10Var.OooOoo0) {
                    o10Var.Oooo0.setVisibility(8);
                }
                o10Var.Oooo0OO(o10Var.OooO0o0);
                o10Var.OooOo0o.OooOo00(2);
                this.OooO00o.OooOo0O(false);
                o10Var.OooO0Oo = 2;
            }
        }
    }

    public final void OooOO0O() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ho1 ho1Var = this.OooO0O0;
        boolean z = this.OooO0Oo;
        o10 o10Var = this.OooO0OO;
        if (z) {
            if (k20.Oooo000(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + o10Var);
                return;
            }
            return;
        }
        try {
            this.OooO0Oo = true;
            boolean z2 = false;
            while (true) {
                int iOooO0Oo = OooO0Oo();
                int i = o10Var.OooO0Oo;
                if (iOooO0Oo == i) {
                    if (!z2 && i == -1 && o10Var.OooOOOO && !o10Var.OooOo0()) {
                        if (k20.Oooo000(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + o10Var);
                        }
                        ((n20) ho1Var.OooO0oo).OooO0OO(o10Var);
                        ho1Var.Oooo00O(this);
                        if (k20.Oooo000(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + o10Var);
                        }
                        o10Var.OooOOo();
                    }
                    if (o10Var.Oooo0o) {
                        if (o10Var.Oooo0 != null && (viewGroup = o10Var.Oooo00o) != null) {
                            dp dpVarOooO0o = dp.OooO0o(viewGroup, o10Var.OooOOO0().OooOooO());
                            if (o10Var.OooOoo0) {
                                if (k20.Oooo000(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + o10Var);
                                }
                                dpVarOooO0o.OooO00o(3, 1, this);
                            } else {
                                if (k20.Oooo000(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + o10Var);
                                }
                                dpVarOooO0o.OooO00o(2, 1, this);
                            }
                        }
                        k20 k20Var = o10Var.OooOo0;
                        if (k20Var != null && o10Var.OooOOO && k20.Oooo00O(o10Var)) {
                            k20Var.OooOooO = true;
                        }
                        o10Var.Oooo0o = false;
                        o10Var.OooOo0o.OooOOO();
                    }
                    this.OooO0Oo = false;
                    return;
                }
                if (iOooO0Oo <= i) {
                    switch (i - 1) {
                        case -1:
                            OooO();
                            break;
                        case 0:
                            OooO0oO();
                            break;
                        case 1:
                            OooO0oo();
                            o10Var.OooO0Oo = 1;
                            break;
                        case 2:
                            o10Var.OooOOo0 = false;
                            o10Var.OooO0Oo = 2;
                            break;
                        case 3:
                            if (k20.Oooo000(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + o10Var);
                            }
                            if (o10Var.Oooo0 != null && o10Var.OooO0o == null) {
                                OooOOOO();
                            }
                            if (o10Var.Oooo0 != null && (viewGroup2 = o10Var.Oooo00o) != null) {
                                dp dpVarOooO0o2 = dp.OooO0o(viewGroup2, o10Var.OooOOO0().OooOooO());
                                if (k20.Oooo000(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + o10Var);
                                }
                                dpVarOooO0o2.OooO00o(1, 3, this);
                            }
                            o10Var.OooO0Oo = 3;
                            break;
                        case 4:
                            OooOOo0();
                            break;
                        case 5:
                            o10Var.OooO0Oo = 5;
                            break;
                        case 6:
                            OooOO0o();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            OooO0OO();
                            break;
                        case 1:
                            OooO0o0();
                            break;
                        case 2:
                            OooOO0();
                            OooO0o();
                            break;
                        case 3:
                            OooO00o();
                            break;
                        case 4:
                            if (o10Var.Oooo0 != null && (viewGroup3 = o10Var.Oooo00o) != null) {
                                dp dpVarOooO0o3 = dp.OooO0o(viewGroup3, o10Var.OooOOO0().OooOooO());
                                int iOooO0O0 = px0.OooO0O0(o10Var.Oooo0.getVisibility());
                                if (k20.Oooo000(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + o10Var);
                                }
                                dpVarOooO0o3.OooO00o(iOooO0O0, 2, this);
                            }
                            o10Var.OooO0Oo = 4;
                            break;
                        case 5:
                            OooOOOo();
                            break;
                        case 6:
                            o10Var.OooO0Oo = 6;
                            break;
                        case 7:
                            OooOOO();
                            break;
                    }
                }
                z2 = true;
            }
        } catch (Throwable th) {
            this.OooO0Oo = false;
            throw th;
        }
    }

    public final void OooOO0o() {
        boolean zOooo000 = k20.Oooo000(3);
        o10 o10Var = this.OooO0OO;
        if (zOooo000) {
            Log.d("FragmentManager", "movefrom RESUMED: " + o10Var);
        }
        o10Var.OooOo0o.OooOo00(5);
        if (o10Var.Oooo0 != null) {
            o10Var.OoooO0O.OooO0o0(wl0.ON_PAUSE);
        }
        o10Var.OoooO0.OooO(wl0.ON_PAUSE);
        o10Var.OooO0Oo = 6;
        o10Var.Oooo00O = true;
        this.OooO00o.OooOOOO(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOOO() {
        /*
            r7 = this;
            r0 = 3
            boolean r0 = com.cmaster.cloner.k20.Oooo000(r0)
            java.lang.String r1 = "FragmentManager"
            com.cmaster.cloner.o10 r2 = r7.OooO0OO
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "moveto RESUMED: "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1c:
            com.cmaster.cloner.n10 r0 = r2.Oooo0o0
            r3 = 0
            if (r0 != 0) goto L23
            r0 = r3
            goto L25
        L23:
            android.view.View r0 = r0.OooOO0O
        L25:
            if (r0 == 0) goto L7d
            android.view.View r4 = r2.Oooo0
            if (r0 != r4) goto L2c
            goto L36
        L2c:
            android.view.ViewParent r4 = r0.getParent()
        L30:
            if (r4 == 0) goto L7d
            android.view.View r5 = r2.Oooo0
            if (r4 != r5) goto L78
        L36:
            boolean r4 = r0.requestFocus()
            r5 = 2
            boolean r5 = com.cmaster.cloner.k20.Oooo000(r5)
            if (r5 == 0) goto L7d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "requestFocus: Restoring focused view "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = " "
            r5.append(r0)
            if (r4 == 0) goto L55
            java.lang.String r0 = "succeeded"
            goto L57
        L55:
            java.lang.String r0 = "failed"
        L57:
            r5.append(r0)
            java.lang.String r0 = " on Fragment "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = " resulting in focused view "
            r5.append(r0)
            android.view.View r0 = r2.Oooo0
            android.view.View r0 = r0.findFocus()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.v(r1, r0)
            goto L7d
        L78:
            android.view.ViewParent r4 = r4.getParent()
            goto L30
        L7d:
            com.cmaster.cloner.n10 r0 = r2.OooO0oO()
            r0.OooOO0O = r3
            com.cmaster.cloner.k20 r0 = r2.OooOo0o
            r0.Oooo0o0()
            com.cmaster.cloner.k20 r0 = r2.OooOo0o
            r1 = 1
            r0.OooOo(r1)
            r0 = 7
            r2.OooO0Oo = r0
            r4 = 0
            r2.Oooo00O = r4
            r2.Oooo00O = r1
            boolean r1 = r2.Oooo00O
            if (r1 == 0) goto Lc5
            com.cmaster.cloner.jm0 r1 = r2.OoooO0
            com.cmaster.cloner.wl0 r5 = com.cmaster.cloner.wl0.ON_RESUME
            r1.OooO(r5)
            android.view.View r1 = r2.Oooo0
            if (r1 == 0) goto Lac
            com.cmaster.cloner.w20 r1 = r2.OoooO0O
            com.cmaster.cloner.jm0 r1 = r1.OooO0oO
            r1.OooO(r5)
        Lac:
            com.cmaster.cloner.k20 r1 = r2.OooOo0o
            r1.OooOooo = r4
            r1.Oooo000 = r4
            com.cmaster.cloner.n20 r5 = r1.Oooo0o0
            r5.OooOO0 = r4
            r1.OooOo00(r0)
            com.cmaster.cloner.o0O000O r7 = r7.OooO00o
            r7.OooOOo(r4)
            r2.OooO0o0 = r3
            r2.OooO0o = r3
            r2.OooO0oO = r3
            return
        Lc5:
            com.cmaster.cloner.zj1 r7 = new com.cmaster.cloner.zj1
            java.lang.String r0 = "Fragment "
            java.lang.String r1 = " did not call through to super.onResume()"
            java.lang.String r0 = com.cmaster.cloner.rj.OooO0O0(r0, r2, r1)
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.r20.OooOOO():void");
    }

    public final void OooOOO0(ClassLoader classLoader) {
        o10 o10Var = this.OooO0OO;
        Bundle bundle = o10Var.OooO0o0;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        o10Var.OooO0o = o10Var.OooO0o0.getSparseParcelableArray("android:view_state");
        o10Var.OooO0oO = o10Var.OooO0o0.getBundle("android:view_registry_state");
        String string = o10Var.OooO0o0.getString("android:target_state");
        o10Var.OooOO0O = string;
        if (string != null) {
            o10Var.OooOO0o = o10Var.OooO0o0.getInt("android:target_req_state", 0);
        }
        boolean z = o10Var.OooO0o0.getBoolean("android:user_visible_hint", true);
        o10Var.Oooo0OO = z;
        if (z) {
            return;
        }
        o10Var.Oooo0O0 = true;
    }

    public final void OooOOOO() {
        o10 o10Var = this.OooO0OO;
        if (o10Var.Oooo0 == null) {
            return;
        }
        if (k20.Oooo000(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + o10Var + " with view " + o10Var.Oooo0);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        o10Var.Oooo0.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            o10Var.OooO0o = sparseArray;
        }
        Bundle bundle = new Bundle();
        o10Var.OoooO0O.OooO0oo.OooOo0O(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        o10Var.OooO0oO = bundle;
    }

    public final void OooOOOo() {
        boolean zOooo000 = k20.Oooo000(3);
        o10 o10Var = this.OooO0OO;
        if (zOooo000) {
            Log.d("FragmentManager", "moveto STARTED: " + o10Var);
        }
        o10Var.OooOo0o.Oooo0o0();
        o10Var.OooOo0o.OooOo(true);
        o10Var.OooO0Oo = 5;
        o10Var.Oooo00O = false;
        o10Var.Oooo0();
        if (!o10Var.Oooo00O) {
            throw new zj1(rj.OooO0O0("Fragment ", o10Var, " did not call through to super.onStart()"));
        }
        jm0 jm0Var = o10Var.OoooO0;
        wl0 wl0Var = wl0.ON_START;
        jm0Var.OooO(wl0Var);
        if (o10Var.Oooo0 != null) {
            o10Var.OoooO0O.OooO0oO.OooO(wl0Var);
        }
        k20 k20Var = o10Var.OooOo0o;
        k20Var.OooOooo = false;
        k20Var.Oooo000 = false;
        k20Var.Oooo0o0.OooOO0 = false;
        k20Var.OooOo00(5);
        this.OooO00o.OooOo00(false);
    }

    public final void OooOOo0() {
        boolean zOooo000 = k20.Oooo000(3);
        o10 o10Var = this.OooO0OO;
        if (zOooo000) {
            Log.d("FragmentManager", "movefrom STARTED: " + o10Var);
        }
        k20 k20Var = o10Var.OooOo0o;
        k20Var.Oooo000 = true;
        k20Var.Oooo0o0.OooOO0 = true;
        k20Var.OooOo00(4);
        if (o10Var.Oooo0 != null) {
            o10Var.OoooO0O.OooO0o0(wl0.ON_STOP);
        }
        o10Var.OoooO0.OooO(wl0.ON_STOP);
        o10Var.OooO0Oo = 4;
        o10Var.Oooo00O = false;
        o10Var.Oooo0O0();
        if (!o10Var.Oooo00O) {
            throw new zj1(rj.OooO0O0("Fragment ", o10Var, " did not call through to super.onStop()"));
        }
        this.OooO00o.OooOo0(false);
    }

    public r20(o0O000O o0o000o, ho1 ho1Var, o10 o10Var) {
        this.OooO00o = o0o000o;
        this.OooO0O0 = ho1Var;
        this.OooO0OO = o10Var;
    }

    public r20(o0O000O o0o000o, ho1 ho1Var, o10 o10Var, q20 q20Var) {
        this.OooO00o = o0o000o;
        this.OooO0O0 = ho1Var;
        this.OooO0OO = o10Var;
        o10Var.OooO0o = null;
        o10Var.OooO0oO = null;
        o10Var.OooOo00 = 0;
        o10Var.OooOOo0 = false;
        o10Var.OooOOO = false;
        o10 o10Var2 = o10Var.OooOO0;
        o10Var.OooOO0O = o10Var2 != null ? o10Var2.OooO0oo : null;
        o10Var.OooOO0 = null;
        Bundle bundle = q20Var.OooOOOo;
        if (bundle != null) {
            o10Var.OooO0o0 = bundle;
        } else {
            o10Var.OooO0o0 = new Bundle();
        }
    }
}
