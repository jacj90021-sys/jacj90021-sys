package com.cmaster.cloner;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class jm0 {
    public boolean OooO;
    public final boolean OooO0Oo;
    public xl0 OooO0o;
    public zy OooO0o0;
    public final WeakReference OooO0oO;
    public int OooO0oo;
    public boolean OooOO0;
    public final ArrayList OooOO0O;
    public final si1 OooOO0o;

    public jm0(hm0 hm0Var) {
        hm0Var.getClass();
        new AtomicReference(null);
        this.OooO0Oo = true;
        this.OooO0o0 = new zy();
        xl0 xl0Var = xl0.OooO0o0;
        this.OooO0o = xl0Var;
        this.OooOO0O = new ArrayList();
        this.OooO0oO = new WeakReference(hm0Var);
        this.OooOO0o = new si1(xl0Var);
    }

    public final void OooO(wl0 wl0Var) {
        wl0Var.getClass();
        OooO0oo("handleLifecycleEvent");
        OooOOO(wl0Var.OooO00o());
    }

    public final void OooO0OO(gm0 gm0Var) {
        cm0 soVar;
        Object obj;
        hm0 hm0Var;
        gm0Var.getClass();
        OooO0oo("addObserver");
        xl0 xl0Var = this.OooO0o;
        xl0 xl0Var2 = xl0.OooO0Oo;
        if (xl0Var != xl0Var2) {
            xl0Var2 = xl0.OooO0o0;
        }
        im0 im0Var = new im0();
        HashMap map = mm0.OooO00o;
        boolean z = gm0Var instanceof cm0;
        boolean z2 = gm0Var instanceof tu;
        int i = 2;
        if (z && z2) {
            soVar = new so((tu) gm0Var, (cm0) gm0Var);
        } else if (z2) {
            soVar = new so((tu) gm0Var, (cm0) null);
        } else if (z) {
            soVar = (cm0) gm0Var;
        } else {
            Class<?> cls = gm0Var.getClass();
            if (mm0.OooO0O0(cls) == 2) {
                Object obj2 = mm0.OooO0O0.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() == 1) {
                    mm0.OooO00o((Constructor) list.get(0), gm0Var);
                    throw null;
                }
                int size = list.size();
                p40[] p40VarArr = new p40[size];
                if (size > 0) {
                    mm0.OooO00o((Constructor) list.get(0), gm0Var);
                    throw null;
                }
                soVar = new v61(p40VarArr, i);
            } else {
                soVar = new so(gm0Var);
            }
        }
        im0Var.OooO0O0 = soVar;
        im0Var.OooO00o = xl0Var2;
        zy zyVar = this.OooO0o0;
        tc1 tc1VarOooO00o = zyVar.OooO00o(gm0Var);
        if (tc1VarOooO00o != null) {
            obj = tc1VarOooO00o.OooO0o0;
        } else {
            HashMap map2 = zyVar.OooO0oo;
            tc1 tc1Var = new tc1(gm0Var, im0Var);
            zyVar.OooO0oO++;
            tc1 tc1Var2 = zyVar.OooO0o0;
            if (tc1Var2 == null) {
                zyVar.OooO0Oo = tc1Var;
                zyVar.OooO0o0 = tc1Var;
            } else {
                tc1Var2.OooO0o = tc1Var;
                tc1Var.OooO0oO = tc1Var2;
                zyVar.OooO0o0 = tc1Var;
            }
            map2.put(gm0Var, tc1Var);
            obj = null;
        }
        if (((im0) obj) == null && (hm0Var = (hm0) this.OooO0oO.get()) != null) {
            boolean z3 = this.OooO0oo != 0 || this.OooO;
            xl0 xl0VarOooO0o = OooO0o(gm0Var);
            this.OooO0oo++;
            while (im0Var.OooO00o.compareTo(xl0VarOooO0o) < 0 && this.OooO0o0.OooO0oo.containsKey(gm0Var)) {
                xl0 xl0Var3 = im0Var.OooO00o;
                ArrayList arrayList = this.OooOO0O;
                arrayList.add(xl0Var3);
                ul0 ul0Var = wl0.Companion;
                xl0 xl0Var4 = im0Var.OooO00o;
                ul0Var.getClass();
                xl0Var4.getClass();
                int iOrdinal = xl0Var4.ordinal();
                wl0 wl0Var = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : wl0.ON_RESUME : wl0.ON_START : wl0.ON_CREATE;
                if (wl0Var == null) {
                    sa.OooOOO(im0Var.OooO00o, "no event up from ");
                    return;
                } else {
                    im0Var.OooO00o(hm0Var, wl0Var);
                    arrayList.remove(arrayList.size() - 1);
                    xl0VarOooO0o = OooO0o(gm0Var);
                }
            }
            if (!z3) {
                OooOOo();
            }
            this.OooO0oo--;
        }
    }

    public final xl0 OooO0o(gm0 gm0Var) {
        HashMap map = this.OooO0o0.OooO0oo;
        tc1 tc1Var = map.containsKey(gm0Var) ? ((tc1) map.get(gm0Var)).OooO0oO : null;
        xl0 xl0Var = tc1Var != null ? ((im0) tc1Var.OooO0o0).OooO00o : null;
        ArrayList arrayList = this.OooOO0O;
        xl0 xl0Var2 = arrayList.isEmpty() ? null : (xl0) arrayList.get(arrayList.size() - 1);
        xl0 xl0Var3 = this.OooO0o;
        xl0Var3.getClass();
        if (xl0Var == null || xl0Var.compareTo(xl0Var3) >= 0) {
            xl0Var = xl0Var3;
        }
        return (xl0Var2 == null || xl0Var2.compareTo(xl0Var) >= 0) ? xl0Var : xl0Var2;
    }

    public final void OooO0oo(String str) {
        if (this.OooO0Oo) {
            y2.OooO00o().OooO00o.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(px0.OooOOOO("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void OooOOO(xl0 xl0Var) {
        if (this.OooO0o == xl0Var) {
            return;
        }
        hm0 hm0Var = (hm0) this.OooO0oO.get();
        xl0 xl0Var2 = this.OooO0o;
        xl0Var2.getClass();
        xl0 xl0Var3 = xl0.OooO0o0;
        xl0 xl0Var4 = xl0.OooO0Oo;
        if (xl0Var2 == xl0Var3 && xl0Var == xl0Var4) {
            throw new IllegalStateException(("State must be at least '" + xl0.OooO0o + "' to be moved to '" + xl0Var + "' in component " + hm0Var).toString());
        }
        if (xl0Var2 == xl0Var4 && xl0Var2 != xl0Var) {
            throw new IllegalStateException(("State is '" + xl0Var4 + "' and cannot be moved to `" + xl0Var + "` in component " + hm0Var).toString());
        }
        this.OooO0o = xl0Var;
        if (this.OooO || this.OooO0oo != 0) {
            this.OooOO0 = true;
            return;
        }
        this.OooO = true;
        OooOOo();
        this.OooO = false;
        if (this.OooO0o == xl0Var4) {
            this.OooO0o0 = new zy();
        }
    }

    public final void OooOOOO(gm0 gm0Var) {
        gm0Var.getClass();
        OooO0oo("removeObserver");
        this.OooO0o0.OooO0O0(gm0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r11.OooOO0 = false;
        r0 = r11.OooO0o;
        r11 = r11.OooOO0o;
        r11.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        r0 = com.cmaster.cloner.k72.OooO00o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        r11.OooO00o(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOOo() {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.jm0.OooOOo():void");
    }
}
