package com.cmaster.cloner;

import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class k20 {
    public boolean OooO0O0;
    public ArrayList OooO0Oo;
    public ArrayList OooO0o0;
    public xy0 OooO0oO;
    public final o0O000O OooOO0o;
    public final b20 OooOOO;
    public final CopyOnWriteArrayList OooOOO0;
    public final b20 OooOOOO;
    public final b20 OooOOOo;
    public final e20 OooOOo;
    public final b20 OooOOo0;
    public int OooOOoo;
    public final f20 OooOo;
    public ds2 OooOo0;
    public q10 OooOo00;
    public o10 OooOo0O;
    public o10 OooOo0o;
    public o0O0OOO0 OooOoO;
    public final s60 OooOoO0;
    public o0O0OOO0 OooOoOO;
    public ArrayDeque OooOoo;
    public o0O0OOO0 OooOoo0;
    public boolean OooOooO;
    public boolean OooOooo;
    public ArrayList Oooo0;
    public boolean Oooo000;
    public boolean Oooo00O;
    public boolean Oooo00o;
    public ArrayList Oooo0O0;
    public ArrayList Oooo0OO;
    public final o00OOO00 Oooo0o;
    public n20 Oooo0o0;
    public final ArrayList OooO00o = new ArrayList();
    public final ho1 OooO0OO = new ho1(9);
    public final a20 OooO0o = new a20(this);
    public final d20 OooO0oo = new d20(this);
    public final AtomicInteger OooO = new AtomicInteger();
    public final Map OooOO0 = Collections.synchronizedMap(new HashMap());
    public final Map OooOO0O = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [com.cmaster.cloner.b20] */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.cmaster.cloner.b20] */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.cmaster.cloner.b20] */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.cmaster.cloner.b20] */
    public k20() {
        Collections.synchronizedMap(new HashMap());
        this.OooOO0o = new o0O000O(this);
        this.OooOOO0 = new CopyOnWriteArrayList();
        final int i = 0;
        this.OooOOO = new mi(this) { // from class: com.cmaster.cloner.b20
            public final /* synthetic */ k20 OooO0O0;

            {
                this.OooO0O0 = this;
            }

            @Override // com.cmaster.cloner.mi
            public final void accept(Object obj) {
                int i2 = i;
                k20 k20Var = this.OooO0O0;
                switch (i2) {
                    case 0:
                        if (k20Var.Oooo00o()) {
                            k20Var.OooO0oo(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (k20Var.Oooo00o() && num.intValue() == 80) {
                            k20Var.OooOO0o(false);
                            break;
                        }
                        break;
                    case 2:
                        dv0 dv0Var = (dv0) obj;
                        if (k20Var.Oooo00o()) {
                            boolean z = dv0Var.OooO00o;
                            k20Var.OooOOO0(false);
                            break;
                        }
                        break;
                    default:
                        w21 w21Var = (w21) obj;
                        if (k20Var.Oooo00o()) {
                            boolean z2 = w21Var.OooO00o;
                            k20Var.OooOOo(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.OooOOOO = new mi(this) { // from class: com.cmaster.cloner.b20
            public final /* synthetic */ k20 OooO0O0;

            {
                this.OooO0O0 = this;
            }

            @Override // com.cmaster.cloner.mi
            public final void accept(Object obj) {
                int i22 = i2;
                k20 k20Var = this.OooO0O0;
                switch (i22) {
                    case 0:
                        if (k20Var.Oooo00o()) {
                            k20Var.OooO0oo(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (k20Var.Oooo00o() && num.intValue() == 80) {
                            k20Var.OooOO0o(false);
                            break;
                        }
                        break;
                    case 2:
                        dv0 dv0Var = (dv0) obj;
                        if (k20Var.Oooo00o()) {
                            boolean z = dv0Var.OooO00o;
                            k20Var.OooOOO0(false);
                            break;
                        }
                        break;
                    default:
                        w21 w21Var = (w21) obj;
                        if (k20Var.Oooo00o()) {
                            boolean z2 = w21Var.OooO00o;
                            k20Var.OooOOo(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.OooOOOo = new mi(this) { // from class: com.cmaster.cloner.b20
            public final /* synthetic */ k20 OooO0O0;

            {
                this.OooO0O0 = this;
            }

            @Override // com.cmaster.cloner.mi
            public final void accept(Object obj) {
                int i22 = i3;
                k20 k20Var = this.OooO0O0;
                switch (i22) {
                    case 0:
                        if (k20Var.Oooo00o()) {
                            k20Var.OooO0oo(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (k20Var.Oooo00o() && num.intValue() == 80) {
                            k20Var.OooOO0o(false);
                            break;
                        }
                        break;
                    case 2:
                        dv0 dv0Var = (dv0) obj;
                        if (k20Var.Oooo00o()) {
                            boolean z = dv0Var.OooO00o;
                            k20Var.OooOOO0(false);
                            break;
                        }
                        break;
                    default:
                        w21 w21Var = (w21) obj;
                        if (k20Var.Oooo00o()) {
                            boolean z2 = w21Var.OooO00o;
                            k20Var.OooOOo(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.OooOOo0 = new mi(this) { // from class: com.cmaster.cloner.b20
            public final /* synthetic */ k20 OooO0O0;

            {
                this.OooO0O0 = this;
            }

            @Override // com.cmaster.cloner.mi
            public final void accept(Object obj) {
                int i22 = i4;
                k20 k20Var = this.OooO0O0;
                switch (i22) {
                    case 0:
                        if (k20Var.Oooo00o()) {
                            k20Var.OooO0oo(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (k20Var.Oooo00o() && num.intValue() == 80) {
                            k20Var.OooOO0o(false);
                            break;
                        }
                        break;
                    case 2:
                        dv0 dv0Var = (dv0) obj;
                        if (k20Var.Oooo00o()) {
                            boolean z = dv0Var.OooO00o;
                            k20Var.OooOOO0(false);
                            break;
                        }
                        break;
                    default:
                        w21 w21Var = (w21) obj;
                        if (k20Var.Oooo00o()) {
                            boolean z2 = w21Var.OooO00o;
                            k20Var.OooOOo(false);
                            break;
                        }
                        break;
                }
            }
        };
        this.OooOOo = new e20(this);
        this.OooOOoo = -1;
        this.OooOo = new f20(this);
        this.OooOoO0 = new s60();
        this.OooOoo = new ArrayDeque();
        this.Oooo0o = new o00OOO00(this, 23);
    }

    public static boolean Oooo0(o10 o10Var) {
        if (o10Var == null) {
            return true;
        }
        if (o10Var.Oooo000) {
            return o10Var.OooOo0 == null || Oooo0(o10Var.OooOo);
        }
        return false;
    }

    public static boolean Oooo000(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean Oooo00O(o10 o10Var) {
        if (o10Var.OooOooo && o10Var.Oooo000) {
            return true;
        }
        ArrayList arrayListOooOo0O = o10Var.OooOo0o.OooO0OO.OooOo0O();
        int size = arrayListOooOo0O.size();
        boolean zOooo00O = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayListOooOo0O.get(i);
            i++;
            o10 o10Var2 = (o10) obj;
            if (o10Var2 != null) {
                zOooo00O = Oooo00O(o10Var2);
            }
            if (zOooo00O) {
                return true;
            }
        }
        return false;
    }

    public static boolean Oooo0O0(o10 o10Var) {
        if (o10Var == null) {
            return true;
        }
        k20 k20Var = o10Var.OooOo0;
        return o10Var == k20Var.OooOo0o && Oooo0O0(k20Var.OooOo0O);
    }

    public static void OoooOOo(o10 o10Var) {
        if (Oooo000(2)) {
            Log.v("FragmentManager", "show: " + o10Var);
        }
        if (o10Var.OooOoo0) {
            o10Var.OooOoo0 = false;
            o10Var.Oooo0o = !o10Var.Oooo0o;
        }
    }

    public final boolean OooO() {
        if (this.OooOOoo >= 1) {
            for (o10 o10Var : this.OooO0OO.OooOo()) {
                if (o10Var != null) {
                    if (!o10Var.OooOoo0 ? o10Var.OooOo0o.OooO() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final r20 OooO00o(o10 o10Var) {
        String str = o10Var.Oooo;
        if (str != null) {
            t20.OooO0OO(o10Var, str);
        }
        if (Oooo000(2)) {
            Log.v("FragmentManager", "add: " + o10Var);
        }
        r20 r20VarOooO0o = OooO0o(o10Var);
        o10Var.OooOo0 = this;
        ho1 ho1Var = this.OooO0OO;
        ho1Var.Oooo000(r20VarOooO0o);
        if (!o10Var.OooOoo) {
            ho1Var.OooO(o10Var);
            o10Var.OooOOOO = false;
            if (o10Var.Oooo0 == null) {
                o10Var.Oooo0o = false;
            }
            if (Oooo00O(o10Var)) {
                this.OooOooO = true;
            }
        }
        return r20VarOooO0o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0O0(q10 q10Var, ds2 ds2Var, o10 o10Var) {
        if (this.OooOo00 != null) {
            qa.OooO0o("Already attached");
            return;
        }
        this.OooOo00 = q10Var;
        this.OooOo0 = ds2Var;
        this.OooOo0O = o10Var;
        CopyOnWriteArrayList copyOnWriteArrayList = this.OooOOO0;
        if (o10Var != 0) {
            copyOnWriteArrayList.add(new g20(o10Var));
        } else if (q10Var != null) {
            copyOnWriteArrayList.add(q10Var);
        }
        if (this.OooOo0O != null) {
            OoooOoo();
        }
        if (q10Var != null) {
            xy0 xy0VarOooOO0 = q10Var.OooO0oo.OooOO0();
            this.OooO0oO = xy0VarOooOO0;
            q10 q10Var2 = o10Var != 0 ? o10Var : q10Var;
            xy0VarOooOO0.getClass();
            d20 d20Var = this.OooO0oo;
            d20Var.getClass();
            jm0 jm0VarOooO0o = q10Var2.OooO0o();
            if (jm0VarOooO0o.OooO0o != xl0.OooO0Oo) {
                d20Var.OooO0O0.add(new uy0(xy0VarOooOO0, jm0VarOooO0o, d20Var));
                xy0VarOooOO0.OooO0OO();
                d20Var.OooO0OO = new wy0(0, xy0VarOooOO0, xy0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 0);
            }
        }
        if (o10Var != 0) {
            n20 n20Var = o10Var.OooOo0.Oooo0o0;
            HashMap map = n20Var.OooO0o;
            n20 n20Var2 = (n20) map.get(o10Var.OooO0oo);
            if (n20Var2 == null) {
                n20Var2 = new n20(n20Var.OooO0oo);
                map.put(o10Var.OooO0oo, n20Var2);
            }
            this.Oooo0o0 = n20Var2;
        } else if (q10Var != null) {
            du1 du1VarOooO0OO = q10Var.OooO0oo.OooO0OO();
            du1VarOooO0OO.getClass();
            mk mkVar = mk.OooO0O0;
            mkVar.getClass();
            ho1 ho1Var = new ho1(du1VarOooO0OO, n20.OooOO0O, mkVar);
            rd rdVarOooO00o = r81.OooO00o(n20.class);
            String strOooO0O0 = rdVarOooO00o.OooO0O0();
            if (strOooO0O0 == null) {
                ra.OooOOO("Local and anonymous classes can not be ViewModels");
                return;
            }
            this.Oooo0o0 = (n20) ho1Var.OooOoo0(rdVarOooO00o, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strOooO0O0));
        } else {
            this.Oooo0o0 = new n20(false);
        }
        n20 n20Var3 = this.Oooo0o0;
        n20Var3.OooOO0 = this.OooOooo || this.Oooo000;
        this.OooO0OO.OooO0oo = n20Var3;
        q10 q10Var3 = this.OooOo00;
        if (q10Var3 != null && o10Var == 0) {
            o0O000O o0o000oOooO0Oo = q10Var3.OooO0Oo();
            o0o000oOooO0Oo.o000oOoO("android:support:fragments", new c20(this, 0));
            Bundle bundleOooO0o = o0o000oOooO0Oo.OooO0o("android:support:fragments");
            if (bundleOooO0o != null) {
                OoooO00(bundleOooO0o);
            }
        }
        q10 q10Var4 = this.OooOo00;
        if (q10Var4 != null) {
            zf zfVar = q10Var4.OooO0oo.OooOOOO;
            String strConcat = "FragmentManager:".concat(o10Var != 0 ? rj.OooO0oO(new StringBuilder(), o10Var.OooO0oo, ":") : "");
            this.OooOoO = zfVar.OooO0OO(strConcat.concat("StartActivityForResult"), new o0O0O0o0(2), new xb1(this, 16));
            this.OooOoOO = zfVar.OooO0OO(strConcat.concat("StartIntentSenderForResult"), new o0O0O0o0(3), new o00OO000(this, 15));
            this.OooOoo0 = zfVar.OooO0OO(strConcat.concat("RequestPermissions"), new o0O0O0o0(1), new ay1(this, 21));
        }
        q10 q10Var5 = this.OooOo00;
        if (q10Var5 != null) {
            q10Var5.OooO0oo.OooO0oo(this.OooOOO);
        }
        q10 q10Var6 = this.OooOo00;
        if (q10Var6 != null) {
            q10Var6.OooO0oo.OooOOo0.add(this.OooOOOO);
        }
        q10 q10Var7 = this.OooOo00;
        if (q10Var7 != null) {
            q10Var7.OooO0oo.OooOOoo.add(this.OooOOOo);
        }
        q10 q10Var8 = this.OooOo00;
        if (q10Var8 != null) {
            q10Var8.OooO0oo.OooOo00.add(this.OooOOo0);
        }
        q10 q10Var9 = this.OooOo00;
        if (q10Var9 == null || o10Var != 0) {
            return;
        }
        a02 a02Var = q10Var9.OooO0oo.OooO0o;
        ((CopyOnWriteArrayList) a02Var.OooO0o).add(this.OooOOo);
        ((Runnable) a02Var.OooO0o0).run();
    }

    public final void OooO0OO(o10 o10Var) {
        if (Oooo000(2)) {
            Log.v("FragmentManager", "attach: " + o10Var);
        }
        if (o10Var.OooOoo) {
            o10Var.OooOoo = false;
            if (o10Var.OooOOO) {
                return;
            }
            this.OooO0OO.OooO(o10Var);
            if (Oooo000(2)) {
                Log.v("FragmentManager", "add from attach: " + o10Var);
            }
            if (Oooo00O(o10Var)) {
                this.OooOooO = true;
            }
        }
    }

    public final void OooO0Oo() {
        this.OooO0O0 = false;
        this.Oooo0O0.clear();
        this.Oooo0.clear();
    }

    public final r20 OooO0o(o10 o10Var) {
        String str = o10Var.OooO0oo;
        ho1 ho1Var = this.OooO0OO;
        r20 r20Var = (r20) ((HashMap) ho1Var.OooO0o).get(str);
        if (r20Var != null) {
            return r20Var;
        }
        r20 r20Var2 = new r20(this.OooOO0o, ho1Var, o10Var);
        r20Var2.OooOOO0(this.OooOo00.OooO0o0.getClassLoader());
        r20Var2.OooO0o0 = this.OooOOoo;
        return r20Var2;
    }

    public final HashSet OooO0o0() {
        HashSet hashSet = new HashSet();
        ArrayList arrayListOooOo0 = this.OooO0OO.OooOo0();
        int size = arrayListOooOo0.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListOooOo0.get(i);
            i++;
            ViewGroup viewGroup = ((r20) obj).OooO0OO.Oooo00o;
            if (viewGroup != null) {
                hashSet.add(dp.OooO0o(viewGroup, OooOooO()));
            }
        }
        return hashSet;
    }

    public final void OooO0oO(o10 o10Var) {
        if (Oooo000(2)) {
            Log.v("FragmentManager", "detach: " + o10Var);
        }
        if (o10Var.OooOoo) {
            return;
        }
        o10Var.OooOoo = true;
        if (o10Var.OooOOO) {
            if (Oooo000(2)) {
                Log.v("FragmentManager", "remove from detach: " + o10Var);
            }
            ho1 ho1Var = this.OooO0OO;
            synchronized (((ArrayList) ho1Var.OooO0o0)) {
                ((ArrayList) ho1Var.OooO0o0).remove(o10Var);
            }
            o10Var.OooOOO = false;
            if (Oooo00O(o10Var)) {
                this.OooOooO = true;
            }
            OoooOOO(o10Var);
        }
    }

    public final void OooO0oo(boolean z) {
        if (z && this.OooOo00 != null) {
            OoooOoO(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (o10 o10Var : this.OooO0OO.OooOo()) {
            if (o10Var != null) {
                o10Var.Oooo00O = true;
                if (z) {
                    o10Var.OooOo0o.OooO0oo(true);
                }
            }
        }
    }

    public final boolean OooOO0(Menu menu, MenuInflater menuInflater) {
        boolean zOooOO0;
        boolean z;
        if (this.OooOOoo < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (o10 o10Var : this.OooO0OO.OooOo()) {
            if (o10Var != null && Oooo0(o10Var)) {
                if (o10Var.OooOoo0) {
                    zOooOO0 = false;
                } else {
                    if (o10Var.OooOooo && o10Var.Oooo000) {
                        o10Var.OooOoO(menu, menuInflater);
                        z = true;
                    } else {
                        z = false;
                    }
                    zOooOO0 = z | o10Var.OooOo0o.OooOO0(menu, menuInflater);
                }
                if (zOooOO0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(o10Var);
                    z2 = true;
                }
            }
        }
        if (this.OooO0o0 != null) {
            for (int i = 0; i < this.OooO0o0.size(); i++) {
                o10 o10Var2 = (o10) this.OooO0o0.get(i);
                if (arrayList == null || !arrayList.contains(o10Var2)) {
                    o10Var2.getClass();
                }
            }
        }
        this.OooO0o0 = arrayList;
        return z2;
    }

    public final void OooOO0O() {
        boolean zIsChangingConfigurations = true;
        this.Oooo00O = true;
        OooOo(true);
        Iterator it = OooO0o0().iterator();
        while (it.hasNext()) {
            ((dp) it.next()).OooO0o0();
        }
        q10 q10Var = this.OooOo00;
        ho1 ho1Var = this.OooO0OO;
        if (q10Var != null) {
            zIsChangingConfigurations = ((n20) ho1Var.OooO0oo).OooO;
        } else {
            oOOO00 oooo00 = q10Var.OooO0o0;
            if (oooo00 != null) {
                zIsChangingConfigurations = true ^ oooo00.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it2 = this.OooOO0.values().iterator();
            while (it2.hasNext()) {
                ArrayList arrayList = ((m5) it2.next()).OooO0Oo;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    String str = (String) obj;
                    n20 n20Var = (n20) ho1Var.OooO0oo;
                    n20Var.getClass();
                    if (Oooo000(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    n20Var.OooO0o0(str);
                }
            }
        }
        OooOo00(-1);
        q10 q10Var2 = this.OooOo00;
        if (q10Var2 != null) {
            q10Var2.OooO0oo.OooOOo0.remove(this.OooOOOO);
        }
        q10 q10Var3 = this.OooOo00;
        if (q10Var3 != null) {
            q10Var3.OooO0oo.OooOOOo.remove(this.OooOOO);
        }
        q10 q10Var4 = this.OooOo00;
        if (q10Var4 != null) {
            q10Var4.OooO0oo.OooOOoo.remove(this.OooOOOo);
        }
        q10 q10Var5 = this.OooOo00;
        if (q10Var5 != null) {
            q10Var5.OooO0oo.OooOo00.remove(this.OooOOo0);
        }
        q10 q10Var6 = this.OooOo00;
        if (q10Var6 != null) {
            a02 a02Var = q10Var6.OooO0oo.OooO0o;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) a02Var.OooO0o;
            e20 e20Var = this.OooOOo;
            copyOnWriteArrayList.remove(e20Var);
            if (((HashMap) a02Var.OooO0oO).remove(e20Var) == null) {
                ((Runnable) a02Var.OooO0o0).run();
            } else {
                ra.OooOO0o();
            }
        }
        this.OooOo00 = null;
        this.OooOo0 = null;
        this.OooOo0O = null;
        if (this.OooO0oO != null) {
            Iterator it3 = this.OooO0oo.OooO0O0.iterator();
            while (it3.hasNext()) {
                ((eb) it3.next()).cancel();
            }
            this.OooO0oO = null;
        }
        o0O0OOO0 o0o0ooo0 = this.OooOoO;
        if (o0o0ooo0 != null) {
            o0o0ooo0.OooO0Oo.OooO0o0(o0o0ooo0.OooO0O0);
            o0O0OOO0 o0o0ooo02 = this.OooOoOO;
            o0o0ooo02.OooO0Oo.OooO0o0(o0o0ooo02.OooO0O0);
            o0O0OOO0 o0o0ooo03 = this.OooOoo0;
            o0o0ooo03.OooO0Oo.OooO0o0(o0o0ooo03.OooO0O0);
        }
    }

    public final void OooOO0o(boolean z) {
        if (z && this.OooOo00 != null) {
            OoooOoO(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (o10 o10Var : this.OooO0OO.OooOo()) {
            if (o10Var != null) {
                o10Var.Oooo00O = true;
                if (z) {
                    o10Var.OooOo0o.OooOO0o(true);
                }
            }
        }
    }

    public final void OooOOO() {
        ArrayList arrayListOooOo0O = this.OooO0OO.OooOo0O();
        int size = arrayListOooOo0O.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListOooOo0O.get(i);
            i++;
            o10 o10Var = (o10) obj;
            if (o10Var != null) {
                o10Var.OooOo00();
                o10Var.OooOo0o.OooOOO();
            }
        }
    }

    public final void OooOOO0(boolean z) {
        if (z && this.OooOo00 != null) {
            OoooOoO(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (o10 o10Var : this.OooO0OO.OooOo()) {
            if (o10Var != null && z) {
                o10Var.OooOo0o.OooOOO0(true);
            }
        }
    }

    public final boolean OooOOOO(MenuItem menuItem) {
        boolean zOooOOOO;
        if (this.OooOOoo >= 1) {
            for (o10 o10Var : this.OooO0OO.OooOo()) {
                if (o10Var != null) {
                    if (o10Var.OooOoo0) {
                        zOooOOOO = false;
                    } else {
                        if (o10Var.OooOooo && o10Var.Oooo000) {
                            o10Var.Oooo000(menuItem);
                        }
                        zOooOOOO = o10Var.OooOo0o.OooOOOO(menuItem);
                    }
                    if (zOooOOOO) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void OooOOOo() {
        if (this.OooOOoo < 1) {
            return;
        }
        for (o10 o10Var : this.OooO0OO.OooOo()) {
            if (o10Var != null && !o10Var.OooOoo0) {
                o10Var.OooOo0o.OooOOOo();
            }
        }
    }

    public final void OooOOo(boolean z) {
        if (z && this.OooOo00 != null) {
            OoooOoO(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (o10 o10Var : this.OooO0OO.OooOo()) {
            if (o10Var != null && z) {
                o10Var.OooOo0o.OooOOo(true);
            }
        }
    }

    public final void OooOOo0(o10 o10Var) {
        if (o10Var != null) {
            if (o10Var != this.OooO0OO.OooOOo0(o10Var.OooO0oo)) {
                return;
            }
            o10Var.OooOo0.getClass();
            boolean zOooo0O0 = Oooo0O0(o10Var);
            Boolean bool = o10Var.OooOOO0;
            if (bool == null || bool.booleanValue() != zOooo0O0) {
                o10Var.OooOOO0 = Boolean.valueOf(zOooo0O0);
                k20 k20Var = o10Var.OooOo0o;
                k20Var.OoooOoo();
                k20Var.OooOOo0(k20Var.OooOo0o);
            }
        }
    }

    public final boolean OooOOoo(Menu menu) {
        boolean zOooOOoo;
        boolean z;
        if (this.OooOOoo < 1) {
            return false;
        }
        boolean z2 = false;
        for (o10 o10Var : this.OooO0OO.OooOo()) {
            if (o10Var != null && Oooo0(o10Var)) {
                if (o10Var.OooOoo0) {
                    zOooOOoo = false;
                } else {
                    if (o10Var.OooOooo && o10Var.Oooo000) {
                        o10Var.Oooo00O(menu);
                        z = true;
                    } else {
                        z = false;
                    }
                    zOooOOoo = o10Var.OooOo0o.OooOOoo(menu) | z;
                }
                if (zOooOOoo) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final boolean OooOo(boolean z) {
        boolean zOooO00o;
        ArrayList arrayList;
        OooOo0o(z);
        boolean z2 = false;
        while (true) {
            ArrayList arrayList2 = this.Oooo0;
            ArrayList arrayList3 = this.Oooo0O0;
            synchronized (this.OooO00o) {
                if (this.OooO00o.isEmpty()) {
                    zOooO00o = false;
                } else {
                    try {
                        int size = this.OooO00o.size();
                        int i = 0;
                        zOooO00o = false;
                        while (true) {
                            arrayList = this.OooO00o;
                            if (i >= size) {
                                break;
                            }
                            zOooO00o |= ((i20) arrayList.get(i)).OooO00o(arrayList2, arrayList3);
                            i++;
                        }
                        arrayList.clear();
                        this.OooOo00.OooO0o.removeCallbacks(this.Oooo0o);
                    } finally {
                    }
                }
            }
            if (!zOooO00o) {
                break;
            }
            z2 = true;
            this.OooO0O0 = true;
            try {
                Oooo(this.Oooo0, this.Oooo0O0);
            } finally {
                OooO0Oo();
            }
        }
        OoooOoo();
        if (this.Oooo00o) {
            this.Oooo00o = false;
            OoooOo0();
        }
        ((HashMap) this.OooO0OO.OooO0o).values().removeAll(Collections.singleton(null));
        return z2;
    }

    public final void OooOo0(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        ho1 ho1Var = this.OooO0OO;
        ArrayList arrayList = (ArrayList) ho1Var.OooO0o0;
        String str3 = str + "    ";
        HashMap map = (HashMap) ho1Var.OooO0o;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (r20 r20Var : map.values()) {
                printWriter.print(str);
                if (r20Var != null) {
                    o10 o10Var = r20Var.OooO0OO;
                    printWriter.println(o10Var);
                    o10Var.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(o10Var.OooOoO0));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(o10Var.OooOoO));
                    printWriter.print(" mTag=");
                    printWriter.println(o10Var.OooOoOO);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(o10Var.OooO0Oo);
                    printWriter.print(" mWho=");
                    printWriter.print(o10Var.OooO0oo);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(o10Var.OooOo00);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(o10Var.OooOOO);
                    printWriter.print(" mRemoving=");
                    printWriter.print(o10Var.OooOOOO);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(o10Var.OooOOOo);
                    printWriter.print(" mInLayout=");
                    printWriter.println(o10Var.OooOOo0);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(o10Var.OooOoo0);
                    printWriter.print(" mDetached=");
                    printWriter.print(o10Var.OooOoo);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(o10Var.Oooo000);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(o10Var.OooOooo);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(o10Var.OooOooO);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(o10Var.Oooo0OO);
                    if (o10Var.OooOo0 != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(o10Var.OooOo0);
                    }
                    if (o10Var.OooOo0O != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(o10Var.OooOo0O);
                    }
                    if (o10Var.OooOo != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(o10Var.OooOo);
                    }
                    if (o10Var.OooO != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(o10Var.OooO);
                    }
                    if (o10Var.OooO0o0 != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(o10Var.OooO0o0);
                    }
                    if (o10Var.OooO0o != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(o10Var.OooO0o);
                    }
                    if (o10Var.OooO0oO != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(o10Var.OooO0oO);
                    }
                    Object objOooOOOO = o10Var.OooOOOO(false);
                    if (objOooOOOO != null) {
                        printWriter.print(str3);
                        printWriter.print("mTarget=");
                        printWriter.print(objOooOOOO);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(o10Var.OooOO0o);
                    }
                    printWriter.print(str3);
                    printWriter.print("mPopDirection=");
                    n10 n10Var = o10Var.Oooo0o0;
                    printWriter.println(n10Var == null ? false : n10Var.OooO00o);
                    n10 n10Var2 = o10Var.Oooo0o0;
                    if ((n10Var2 == null ? 0 : n10Var2.OooO0O0) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        n10 n10Var3 = o10Var.Oooo0o0;
                        printWriter.println(n10Var3 == null ? 0 : n10Var3.OooO0O0);
                    }
                    n10 n10Var4 = o10Var.Oooo0o0;
                    if ((n10Var4 == null ? 0 : n10Var4.OooO0OO) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        n10 n10Var5 = o10Var.Oooo0o0;
                        printWriter.println(n10Var5 == null ? 0 : n10Var5.OooO0OO);
                    }
                    n10 n10Var6 = o10Var.Oooo0o0;
                    if ((n10Var6 == null ? 0 : n10Var6.OooO0Oo) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        n10 n10Var7 = o10Var.Oooo0o0;
                        printWriter.println(n10Var7 == null ? 0 : n10Var7.OooO0Oo);
                    }
                    n10 n10Var8 = o10Var.Oooo0o0;
                    if ((n10Var8 == null ? 0 : n10Var8.OooO0o0) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        n10 n10Var9 = o10Var.Oooo0o0;
                        printWriter.println(n10Var9 == null ? 0 : n10Var9.OooO0o0);
                    }
                    if (o10Var.Oooo00o != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(o10Var.Oooo00o);
                    }
                    if (o10Var.Oooo0 != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(o10Var.Oooo0);
                    }
                    if (o10Var.OooOO0() != null) {
                        du1 du1VarOooO0OO = o10Var.OooO0OO();
                        m20 m20Var = bo0.OooO0o;
                        du1VarOooO0OO.getClass();
                        mk mkVar = mk.OooO0O0;
                        mkVar.getClass();
                        ho1 ho1Var2 = new ho1(du1VarOooO0OO, m20Var, mkVar);
                        rd rdVarOooO00o = r81.OooO00o(bo0.class);
                        String strOooO0O0 = rdVarOooO00o.OooO0O0();
                        if (strOooO0O0 != null) {
                            ci1 ci1Var = ((bo0) ho1Var2.OooOoo0(rdVarOooO00o, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strOooO0O0))).OooO0o0;
                            if (ci1Var.OooO0o > 0) {
                                printWriter.print(str3);
                                printWriter.println("Loaders:");
                                if (ci1Var.OooO0o > 0) {
                                    if (ci1Var.OooO0o0[0] == null) {
                                        printWriter.print(str3);
                                        printWriter.print("  #");
                                        printWriter.print(ci1Var.OooO0Oo[0]);
                                        printWriter.print(": ");
                                        throw null;
                                    }
                                    ra.OooOO0o();
                                }
                            }
                        } else {
                            ra.OooOOO("Local and anonymous classes can not be ViewModels");
                        }
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + o10Var.OooOo0o + ":");
                    o10Var.OooOo0o.OooOo0(str3.concat("  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                o10 o10Var2 = (o10) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(o10Var2.toString());
            }
        }
        ArrayList arrayList2 = this.OooO0o0;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                o10 o10Var3 = (o10) this.OooO0o0.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(o10Var3.toString());
            }
        }
        ArrayList arrayList3 = this.OooO0Oo;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                k5 k5Var = (k5) this.OooO0Oo.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(k5Var.toString());
                k5Var.OooO0o(str2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.OooO.get());
        synchronized (this.OooO00o) {
            try {
                int size4 = this.OooO00o.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (i20) this.OooO00o.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.OooOo00);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.OooOo0);
        if (this.OooOo0O != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.OooOo0O);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.OooOOoo);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.OooOooo);
        printWriter.print(" mStopped=");
        printWriter.print(this.Oooo000);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.Oooo00O);
        if (this.OooOooO) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.OooOooO);
        }
    }

    public final void OooOo00(int i) {
        try {
            this.OooO0O0 = true;
            for (r20 r20Var : ((HashMap) this.OooO0OO.OooO0o).values()) {
                if (r20Var != null) {
                    r20Var.OooO0o0 = i;
                }
            }
            Oooo0OO(i, false);
            Iterator it = OooO0o0().iterator();
            while (it.hasNext()) {
                ((dp) it.next()).OooO0o0();
            }
            this.OooO0O0 = false;
            OooOo(true);
        } catch (Throwable th) {
            this.OooO0O0 = false;
            throw th;
        }
    }

    public final void OooOo0O(i20 i20Var, boolean z) {
        if (!z) {
            if (this.OooOo00 == null) {
                if (this.Oooo00O) {
                    qa.OooO0o("FragmentManager has been destroyed");
                    return;
                } else {
                    qa.OooO0o("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (this.OooOooo || this.Oooo000) {
                qa.OooO0o("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.OooO00o) {
            try {
                if (this.OooOo00 == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.OooO00o.add(i20Var);
                    OoooO0O();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooOo0o(boolean z) {
        if (this.OooO0O0) {
            qa.OooO0o("FragmentManager is already executing transactions");
            return;
        }
        if (this.OooOo00 == null) {
            if (this.Oooo00O) {
                qa.OooO0o("FragmentManager has been destroyed");
                return;
            } else {
                qa.OooO0o("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.OooOo00.OooO0o.getLooper()) {
            qa.OooO0o("Must be called from main thread of fragment host");
            return;
        }
        if (!z && (this.OooOooo || this.Oooo000)) {
            qa.OooO0o("Can not perform this action after onSaveInstanceState");
        } else if (this.Oooo0 == null) {
            this.Oooo0 = new ArrayList();
            this.Oooo0O0 = new ArrayList();
        }
    }

    public final o10 OooOoO(int i) {
        ho1 ho1Var = this.OooO0OO;
        ArrayList arrayList = (ArrayList) ho1Var.OooO0o0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            o10 o10Var = (o10) arrayList.get(size);
            if (o10Var != null && o10Var.OooOoO0 == i) {
                return o10Var;
            }
        }
        for (r20 r20Var : ((HashMap) ho1Var.OooO0o).values()) {
            if (r20Var != null) {
                o10 o10Var2 = r20Var.OooO0OO;
                if (o10Var2.OooOoO0 == i) {
                    return o10Var2;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0232 A[PHI: r14
      0x0232: PHI (r14v19 int) = (r14v18 int), (r14v20 int) binds: [B:103:0x0222, B:108:0x022e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOoO0(java.util.ArrayList r24, java.util.ArrayList r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 1284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.k20.OooOoO0(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public final o10 OooOoOO(String str) {
        ho1 ho1Var = this.OooO0OO;
        ArrayList arrayList = (ArrayList) ho1Var.OooO0o0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            o10 o10Var = (o10) arrayList.get(size);
            if (o10Var != null && str.equals(o10Var.OooOoOO)) {
                return o10Var;
            }
        }
        for (r20 r20Var : ((HashMap) ho1Var.OooO0o).values()) {
            if (r20Var != null) {
                o10 o10Var2 = r20Var.OooO0OO;
                if (str.equals(o10Var2.OooOoOO)) {
                    return o10Var2;
                }
            }
        }
        return null;
    }

    public final f20 OooOoo() {
        o10 o10Var = this.OooOo0O;
        return o10Var != null ? o10Var.OooOo0.OooOoo() : this.OooOo;
    }

    public final ViewGroup OooOoo0(o10 o10Var) {
        ViewGroup viewGroup = o10Var.Oooo00o;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (o10Var.OooOoO <= 0 || !this.OooOo0.OooO0o0()) {
            return null;
        }
        View viewOooO0O0 = this.OooOo0.OooO0O0(o10Var.OooOoO);
        if (viewOooO0O0 instanceof ViewGroup) {
            return (ViewGroup) viewOooO0O0;
        }
        return null;
    }

    public final s60 OooOooO() {
        o10 o10Var = this.OooOo0O;
        return o10Var != null ? o10Var.OooOo0.OooOooO() : this.OooOoO0;
    }

    public final void OooOooo(o10 o10Var) {
        if (Oooo000(2)) {
            Log.v("FragmentManager", "hide: " + o10Var);
        }
        if (o10Var.OooOoo0) {
            return;
        }
        o10Var.OooOoo0 = true;
        o10Var.Oooo0o = true ^ o10Var.Oooo0o;
        OoooOOO(o10Var);
    }

    public final void Oooo(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            qa.OooO0o("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((k5) arrayList.get(i)).OooOOOo) {
                if (i2 != i) {
                    OooOoO0(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((k5) arrayList.get(i2)).OooOOOo) {
                        i2++;
                    }
                }
                OooOoO0(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            OooOoO0(arrayList, arrayList2, i2, size);
        }
    }

    public final boolean Oooo00o() {
        o10 o10Var = this.OooOo0O;
        if (o10Var == null) {
            return true;
        }
        return o10Var.OooOOoo() && this.OooOo0O.OooOOO0().Oooo00o();
    }

    public final void Oooo0OO(int i, boolean z) {
        q10 q10Var;
        if (this.OooOo00 == null && i != -1) {
            qa.OooO0o("No activity");
            return;
        }
        if (z || i != this.OooOOoo) {
            this.OooOOoo = i;
            ho1 ho1Var = this.OooO0OO;
            HashMap map = (HashMap) ho1Var.OooO0o;
            ArrayList arrayList = (ArrayList) ho1Var.OooO0o0;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                r20 r20Var = (r20) map.get(((o10) obj).OooO0oo);
                if (r20Var != null) {
                    r20Var.OooOO0O();
                }
            }
            for (r20 r20Var2 : map.values()) {
                if (r20Var2 != null) {
                    r20Var2.OooOO0O();
                    o10 o10Var = r20Var2.OooO0OO;
                    if (o10Var.OooOOOO && !o10Var.OooOo0()) {
                        ho1Var.Oooo00O(r20Var2);
                    }
                }
            }
            OoooOo0();
            if (this.OooOooO && (q10Var = this.OooOo00) != null && this.OooOOoo == 7) {
                q10Var.OooO0oo.invalidateOptionsMenu();
                this.OooOooO = false;
            }
        }
    }

    public final boolean Oooo0o() {
        OooOo(false);
        OooOo0o(true);
        o10 o10Var = this.OooOo0o;
        if (o10Var != null && o10Var.OooO().Oooo0o()) {
            return true;
        }
        boolean zOooo0oO = Oooo0oO(this.Oooo0, this.Oooo0O0, -1, 0);
        if (zOooo0oO) {
            this.OooO0O0 = true;
            try {
                Oooo(this.Oooo0, this.Oooo0O0);
            } finally {
                OooO0Oo();
            }
        }
        OoooOoo();
        if (this.Oooo00o) {
            this.Oooo00o = false;
            OoooOo0();
        }
        ((HashMap) this.OooO0OO.OooO0o).values().removeAll(Collections.singleton(null));
        return zOooo0oO;
    }

    public final void Oooo0o0() {
        if (this.OooOo00 == null) {
            return;
        }
        this.OooOooo = false;
        this.Oooo000 = false;
        this.Oooo0o0.OooOO0 = false;
        for (o10 o10Var : this.OooO0OO.OooOo()) {
            if (o10Var != null) {
                o10Var.OooOo0o.Oooo0o0();
            }
        }
    }

    public final boolean Oooo0oO(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        ArrayList arrayList3 = this.OooO0Oo;
        int size = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                size = z ? 0 : this.OooO0Oo.size() - 1;
            } else {
                int size2 = this.OooO0Oo.size() - 1;
                while (size2 >= 0) {
                    k5 k5Var = (k5) this.OooO0Oo.get(size2);
                    if (i >= 0 && i == k5Var.OooOOoo) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z) {
                    size = size2;
                    while (size > 0) {
                        k5 k5Var2 = (k5) this.OooO0Oo.get(size - 1);
                        if (i < 0 || i != k5Var2.OooOOoo) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.OooO0Oo.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.OooO0Oo.size() - 1; size3 >= size; size3--) {
            arrayList.add((k5) this.OooO0Oo.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void Oooo0oo(o10 o10Var) {
        if (Oooo000(2)) {
            Log.v("FragmentManager", "remove: " + o10Var + " nesting=" + o10Var.OooOo00);
        }
        boolean zOooOo0 = o10Var.OooOo0();
        if (o10Var.OooOoo && zOooOo0) {
            return;
        }
        ho1 ho1Var = this.OooO0OO;
        synchronized (((ArrayList) ho1Var.OooO0o0)) {
            ((ArrayList) ho1Var.OooO0o0).remove(o10Var);
        }
        o10Var.OooOOO = false;
        if (Oooo00O(o10Var)) {
            this.OooOooO = true;
        }
        o10Var.OooOOOO = true;
        OoooOOO(o10Var);
    }

    public final void OoooO(o10 o10Var, boolean z) {
        ViewGroup viewGroupOooOoo0 = OooOoo0(o10Var);
        if (viewGroupOooOoo0 == null || !(viewGroupOooOoo0 instanceof s10)) {
            return;
        }
        ((s10) viewGroupOooOoo0).setDrawDisappearingViewsLast(!z);
    }

    public final Bundle OoooO0() {
        int i;
        ArrayList arrayList;
        l5[] l5VarArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = OooO0o0().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            dp dpVar = (dp) it.next();
            if (dpVar.OooO0o0) {
                if (Oooo000(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                dpVar.OooO0o0 = false;
                dpVar.OooO0OO();
            }
        }
        Iterator it2 = OooO0o0().iterator();
        while (it2.hasNext()) {
            ((dp) it2.next()).OooO0o0();
        }
        OooOo(true);
        this.OooOooo = true;
        this.Oooo0o0.OooOO0 = true;
        ho1 ho1Var = this.OooO0OO;
        ho1Var.getClass();
        HashMap map = (HashMap) ho1Var.OooO0o;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it3 = map.values().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            r20 r20Var = (r20) it3.next();
            if (r20Var != null) {
                o10 o10Var = r20Var.OooO0OO;
                q20 q20Var = new q20(o10Var);
                if (o10Var.OooO0Oo <= -1 || q20Var.OooOOOo != null) {
                    q20Var.OooOOOo = o10Var.OooO0o0;
                } else {
                    Bundle bundle2 = new Bundle();
                    o10Var.Oooo00o(bundle2);
                    o10Var.o000oOoO.OooOo0O(bundle2);
                    bundle2.putParcelable("android:support:fragments", o10Var.OooOo0o.OoooO0());
                    r20Var.OooO00o.OooOOoo(false);
                    Bundle bundle3 = bundle2.isEmpty() ? null : bundle2;
                    if (o10Var.Oooo0 != null) {
                        r20Var.OooOOOO();
                    }
                    if (o10Var.OooO0o != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putSparseParcelableArray("android:view_state", o10Var.OooO0o);
                    }
                    if (o10Var.OooO0oO != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBundle("android:view_registry_state", o10Var.OooO0oO);
                    }
                    if (!o10Var.Oooo0OO) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBoolean("android:user_visible_hint", o10Var.Oooo0OO);
                    }
                    q20Var.OooOOOo = bundle3;
                    if (o10Var.OooOO0O != null) {
                        if (bundle3 == null) {
                            q20Var.OooOOOo = new Bundle();
                        }
                        q20Var.OooOOOo.putString("android:target_state", o10Var.OooOO0O);
                        int i2 = o10Var.OooOO0o;
                        if (i2 != 0) {
                            q20Var.OooOOOo.putInt("android:target_req_state", i2);
                        }
                    }
                }
                arrayList2.add(o10Var.OooO0oo);
                if (Oooo000(2)) {
                    Log.v("FragmentManager", "Saved state of " + o10Var + ": " + o10Var.OooO0o0);
                }
            }
        }
        ho1 ho1Var2 = this.OooO0OO;
        ho1Var2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) ho1Var2.OooO0oO).values());
        if (!arrayList3.isEmpty()) {
            ho1 ho1Var3 = this.OooO0OO;
            synchronized (((ArrayList) ho1Var3.OooO0o0)) {
                try {
                    if (((ArrayList) ho1Var3.OooO0o0).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) ho1Var3.OooO0o0).size());
                        ArrayList arrayList4 = (ArrayList) ho1Var3.OooO0o0;
                        int size2 = arrayList4.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj = arrayList4.get(i3);
                            i3++;
                            o10 o10Var2 = (o10) obj;
                            arrayList.add(o10Var2.OooO0oo);
                            if (Oooo000(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + o10Var2.OooO0oo + "): " + o10Var2);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList5 = this.OooO0Oo;
            if (arrayList5 == null || (size = arrayList5.size()) <= 0) {
                l5VarArr = null;
            } else {
                l5VarArr = new l5[size];
                for (int i4 = 0; i4 < size; i4++) {
                    l5VarArr[i4] = new l5((k5) this.OooO0Oo.get(i4));
                    if (Oooo000(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i4 + ": " + this.OooO0Oo.get(i4));
                    }
                }
            }
            l20 l20Var = new l20();
            l20Var.OooO0oo = null;
            ArrayList arrayList6 = new ArrayList();
            l20Var.OooO = arrayList6;
            ArrayList arrayList7 = new ArrayList();
            l20Var.OooOO0 = arrayList7;
            l20Var.OooO0Oo = arrayList2;
            l20Var.OooO0o0 = arrayList;
            l20Var.OooO0o = l5VarArr;
            l20Var.OooO0oO = this.OooO.get();
            o10 o10Var3 = this.OooOo0o;
            if (o10Var3 != null) {
                l20Var.OooO0oo = o10Var3.OooO0oo;
            }
            arrayList6.addAll(this.OooOO0.keySet());
            arrayList7.addAll(this.OooOO0.values());
            l20Var.OooOO0O = new ArrayList(this.OooOoo);
            bundle.putParcelable("state", l20Var);
            for (String str : this.OooOO0O.keySet()) {
                bundle.putBundle(rj.OooO0OO("result_", str), (Bundle) this.OooOO0O.get(str));
            }
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj2 = arrayList3.get(i);
                i++;
                q20 q20Var2 = (q20) obj2;
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("state", q20Var2);
                bundle.putBundle("fragment_" + q20Var2.OooO0o0, bundle4);
            }
        } else if (Oooo000(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final void OoooO00(Parcelable parcelable) {
        o0O000O o0o000o;
        int i;
        boolean z;
        int i2;
        r20 r20Var;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.OooOo00.OooO0o0.getClassLoader());
                this.OooOO0O.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.OooOo00.OooO0o0.getClassLoader());
                arrayList.add((q20) bundle.getParcelable("state"));
            }
        }
        ho1 ho1Var = this.OooO0OO;
        HashMap map = (HashMap) ho1Var.OooO0oO;
        HashMap map2 = (HashMap) ho1Var.OooO0o;
        map.clear();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            q20 q20Var = (q20) obj;
            map.put(q20Var.OooO0o0, q20Var);
        }
        l20 l20Var = (l20) bundle3.getParcelable("state");
        if (l20Var == null) {
            return;
        }
        map2.clear();
        ArrayList arrayList2 = l20Var.OooO0Oo;
        int size2 = arrayList2.size();
        int i4 = 0;
        while (true) {
            o0o000o = this.OooOO0o;
            i = 2;
            if (i4 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i4);
            i4++;
            q20 q20Var2 = (q20) ((HashMap) ho1Var.OooO0oO).remove((String) obj2);
            if (q20Var2 != null) {
                o10 o10Var = (o10) this.Oooo0o0.OooO0o0.get(q20Var2.OooO0o0);
                if (o10Var != null) {
                    if (Oooo000(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + o10Var);
                    }
                    r20Var = new r20(o0o000o, ho1Var, o10Var, q20Var2);
                } else {
                    r20Var = new r20(this.OooOO0o, this.OooO0OO, this.OooOo00.OooO0o0.getClassLoader(), OooOoo(), q20Var2);
                }
                o10 o10Var2 = r20Var.OooO0OO;
                o10Var2.OooOo0 = this;
                if (Oooo000(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + o10Var2.OooO0oo + "): " + o10Var2);
                }
                r20Var.OooOOO0(this.OooOo00.OooO0o0.getClassLoader());
                ho1Var.Oooo000(r20Var);
                r20Var.OooO0o0 = this.OooOOoo;
            }
        }
        n20 n20Var = this.Oooo0o0;
        n20Var.getClass();
        ArrayList arrayList3 = new ArrayList(n20Var.OooO0o0.values());
        int size3 = arrayList3.size();
        int i5 = 0;
        while (true) {
            z = true;
            if (i5 >= size3) {
                break;
            }
            Object obj3 = arrayList3.get(i5);
            i5++;
            o10 o10Var3 = (o10) obj3;
            if (map2.get(o10Var3.OooO0oo) == null) {
                if (Oooo000(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + o10Var3 + " that was not found in the set of active Fragments " + l20Var.OooO0Oo);
                }
                this.Oooo0o0.OooO0oO(o10Var3);
                o10Var3.OooOo0 = this;
                r20 r20Var2 = new r20(o0o000o, ho1Var, o10Var3);
                r20Var2.OooO0o0 = 1;
                r20Var2.OooOO0O();
                o10Var3.OooOOOO = true;
                r20Var2.OooOO0O();
            }
        }
        ArrayList arrayList4 = l20Var.OooO0o0;
        ((ArrayList) ho1Var.OooO0o0).clear();
        if (arrayList4 != null) {
            int size4 = arrayList4.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList4.get(i6);
                i6++;
                String str3 = (String) obj4;
                o10 o10VarOooOOo0 = ho1Var.OooOOo0(str3);
                if (o10VarOooOOo0 == null) {
                    qa.OooO0o(px0.OooOOOO("No instantiated fragment for (", str3, ")"));
                    return;
                }
                if (Oooo000(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + o10VarOooOOo0);
                }
                ho1Var.OooO(o10VarOooOOo0);
            }
        }
        if (l20Var.OooO0o != null) {
            this.OooO0Oo = new ArrayList(l20Var.OooO0o.length);
            int i7 = 0;
            while (true) {
                l5[] l5VarArr = l20Var.OooO0o;
                if (i7 >= l5VarArr.length) {
                    break;
                }
                l5 l5Var = l5VarArr[i7];
                ArrayList arrayList5 = l5Var.OooO0o0;
                k5 k5Var = new k5(this);
                int[] iArr = l5Var.OooO0Oo;
                int i8 = 0;
                int i9 = 0;
                while (i8 < iArr.length) {
                    v20 v20Var = new v20();
                    int i10 = i8 + 1;
                    int i11 = i;
                    v20Var.OooO00o = iArr[i8];
                    if (Oooo000(i11)) {
                        Log.v("FragmentManager", "Instantiate " + k5Var + " op #" + i9 + " base fragment #" + iArr[i10]);
                    }
                    v20Var.OooO0oo = xl0.values()[l5Var.OooO0o[i9]];
                    v20Var.OooO = xl0.values()[l5Var.OooO0oO[i9]];
                    int i12 = i8 + 2;
                    v20Var.OooO0OO = iArr[i10] != 0 ? z : false;
                    int i13 = iArr[i12];
                    v20Var.OooO0Oo = i13;
                    int i14 = iArr[i8 + 3];
                    v20Var.OooO0o0 = i14;
                    int i15 = i8 + 5;
                    int i16 = iArr[i8 + 4];
                    v20Var.OooO0o = i16;
                    i8 += 6;
                    int[] iArr2 = iArr;
                    int i17 = iArr2[i15];
                    v20Var.OooO0oO = i17;
                    k5Var.OooO0O0 = i13;
                    k5Var.OooO0OO = i14;
                    k5Var.OooO0Oo = i16;
                    k5Var.OooO0o0 = i17;
                    k5Var.OooO0O0(v20Var);
                    i9++;
                    i = i11;
                    iArr = iArr2;
                    z = true;
                }
                int i18 = i;
                k5Var.OooO0o = l5Var.OooO0oo;
                k5Var.OooO = l5Var.OooO;
                k5Var.OooO0oO = true;
                k5Var.OooOO0 = l5Var.OooOO0O;
                k5Var.OooOO0O = l5Var.OooOO0o;
                k5Var.OooOO0o = l5Var.OooOOO0;
                k5Var.OooOOO0 = l5Var.OooOOO;
                k5Var.OooOOO = l5Var.OooOOOO;
                k5Var.OooOOOO = l5Var.OooOOOo;
                k5Var.OooOOOo = l5Var.OooOOo0;
                k5Var.OooOOoo = l5Var.OooOO0;
                for (int i19 = 0; i19 < arrayList5.size(); i19++) {
                    String str4 = (String) arrayList5.get(i19);
                    if (str4 != null) {
                        ((v20) k5Var.OooO00o.get(i19)).OooO0O0 = ho1Var.OooOOo0(str4);
                    }
                }
                k5Var.OooO0OO(1);
                if (Oooo000(i18)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i7 + " (index " + k5Var.OooOOoo + "): " + k5Var);
                    PrintWriter printWriter = new PrintWriter(new dp0());
                    k5Var.OooO0o("  ", printWriter, false);
                    printWriter.close();
                }
                this.OooO0Oo.add(k5Var);
                i7++;
                i = i18;
                z = true;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.OooO0Oo = null;
        }
        this.OooO.set(l20Var.OooO0oO);
        String str5 = l20Var.OooO0oo;
        if (str5 != null) {
            o10 o10VarOooOOo02 = ho1Var.OooOOo0(str5);
            this.OooOo0o = o10VarOooOOo02;
            OooOOo0(o10VarOooOOo02);
        }
        ArrayList arrayList6 = l20Var.OooO;
        if (arrayList6 != null) {
            while (i2 < arrayList6.size()) {
                this.OooOO0.put((String) arrayList6.get(i2), (m5) l20Var.OooOO0.get(i2));
                i2++;
            }
        }
        this.OooOoo = new ArrayDeque(l20Var.OooOO0O);
    }

    public final void OoooO0O() {
        synchronized (this.OooO00o) {
            try {
                if (this.OooO00o.size() == 1) {
                    this.OooOo00.OooO0o.removeCallbacks(this.Oooo0o);
                    this.OooOo00.OooO0o.post(this.Oooo0o);
                    OoooOoo();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OoooOO0(o10 o10Var, xl0 xl0Var) {
        if (o10Var == this.OooO0OO.OooOOo0(o10Var.OooO0oo) && (o10Var.OooOo0O == null || o10Var.OooOo0 == this)) {
            o10Var.OoooO00 = xl0Var;
        } else {
            ra.OooO0oo("Fragment ", o10Var, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final void OoooOOO(o10 o10Var) {
        ViewGroup viewGroupOooOoo0 = OooOoo0(o10Var);
        if (viewGroupOooOoo0 != null) {
            n10 n10Var = o10Var.Oooo0o0;
            if ((n10Var == null ? 0 : n10Var.OooO0o0) + (n10Var == null ? 0 : n10Var.OooO0Oo) + (n10Var == null ? 0 : n10Var.OooO0OO) + (n10Var == null ? 0 : n10Var.OooO0O0) > 0) {
                if (viewGroupOooOoo0.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupOooOoo0.setTag(R.id.visible_removing_fragment_view_tag, o10Var);
                }
                o10 o10Var2 = (o10) viewGroupOooOoo0.getTag(R.id.visible_removing_fragment_view_tag);
                n10 n10Var2 = o10Var.Oooo0o0;
                boolean z = n10Var2 != null ? n10Var2.OooO00o : false;
                if (o10Var2.Oooo0o0 == null) {
                    return;
                }
                o10Var2.OooO0oO().OooO00o = z;
            }
        }
    }

    public final void OoooOo0() {
        ArrayList arrayListOooOo0 = this.OooO0OO.OooOo0();
        int size = arrayListOooOo0.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListOooOo0.get(i);
            i++;
            r20 r20Var = (r20) obj;
            o10 o10Var = r20Var.OooO0OO;
            if (o10Var.Oooo0O0) {
                if (this.OooO0O0) {
                    this.Oooo00o = true;
                } else {
                    o10Var.Oooo0O0 = false;
                    r20Var.OooOO0O();
                }
            }
        }
    }

    public final void OoooOoO(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new dp0());
        q10 q10Var = this.OooOo00;
        if (q10Var == null) {
            try {
                OooOo0("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            q10Var.OooO0oo.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw illegalStateException;
        }
    }

    public final void OoooOoo() {
        synchronized (this.OooO00o) {
            try {
                if (!this.OooO00o.isEmpty()) {
                    d20 d20Var = this.OooO0oo;
                    d20Var.OooO00o = true;
                    p30 p30Var = d20Var.OooO0OO;
                    if (p30Var != null) {
                        p30Var.OooO00o();
                    }
                    return;
                }
                d20 d20Var2 = this.OooO0oo;
                ArrayList arrayList = this.OooO0Oo;
                d20Var2.OooO00o = (arrayList != null ? arrayList.size() : 0) > 0 && Oooo0O0(this.OooOo0O);
                p30 p30Var2 = d20Var2.OooO0OO;
                if (p30Var2 != null) {
                    p30Var2.OooO00o();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o000oOoO(o10 o10Var) {
        if (o10Var != null) {
            if (o10Var != this.OooO0OO.OooOOo0(o10Var.OooO0oo) || (o10Var.OooOo0O != null && o10Var.OooOo0 != this)) {
                ra.OooO0oo("Fragment ", o10Var, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        o10 o10Var2 = this.OooOo0o;
        this.OooOo0o = o10Var;
        OooOOo0(o10Var2);
        OooOOo0(this.OooOo0o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        o10 o10Var = this.OooOo0O;
        if (o10Var != null) {
            sb.append(o10Var.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.OooOo0O)));
            sb.append("}");
        } else {
            q10 q10Var = this.OooOo00;
            if (q10Var != null) {
                sb.append(q10Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.OooOo00)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }
}
