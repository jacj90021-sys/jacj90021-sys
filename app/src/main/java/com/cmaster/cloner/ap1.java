package com.cmaster.cloner;

import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ap1 {
    public static final o4 OooO00o;
    public static final ThreadLocal OooO0O0;
    public static final ArrayList OooO0OO;

    static {
        o4 o4Var = new o4();
        o4Var.OooOooO = new ArrayList();
        o4Var.Oooo00O = false;
        o4Var.Oooo00o = 0;
        o4Var.OooOooo = false;
        o4Var.Oooo0(new ny(2));
        o4Var.Oooo0(new lc());
        o4Var.Oooo0(new ny(1));
        OooO00o = o4Var;
        OooO0O0 = new ThreadLocal();
        OooO0OO = new ArrayList();
    }

    public static void OooO00o(FrameLayout frameLayout, vo1 vo1Var) {
        ArrayList arrayList = OooO0OO;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (vo1Var == null) {
            vo1Var = OooO00o;
        }
        vo1 vo1VarClone = vo1Var.clone();
        ArrayList arrayList2 = (ArrayList) OooO0O0().get(frameLayout);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((vo1) obj).OooOo0o(frameLayout);
            }
        }
        vo1VarClone.OooO0oo(frameLayout, true);
        if (frameLayout.getTag(R.id.transition_current_scene) != null) {
            ra.OooOO0o();
            return;
        }
        frameLayout.setTag(R.id.transition_current_scene, null);
        zo1 zo1Var = new zo1();
        zo1Var.OooO0Oo = vo1VarClone;
        zo1Var.OooO0o0 = frameLayout;
        frameLayout.addOnAttachStateChangeListener(zo1Var);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(zo1Var);
    }

    public static k3 OooO0O0() {
        k3 k3Var;
        ThreadLocal threadLocal = OooO0O0;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (k3Var = (k3) weakReference.get()) != null) {
            return k3Var;
        }
        k3 k3Var2 = new k3(0);
        threadLocal.set(new WeakReference(k3Var2));
        return k3Var2;
    }
}
