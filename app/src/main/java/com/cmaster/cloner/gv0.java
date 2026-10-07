package com.cmaster.cloner;

import android.os.Looper;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class gv0 {
    public static final Object OooOOO = new Object();
    public volatile Object OooO;
    public final Object OooO0Oo;
    public int OooO0o;
    public final wc1 OooO0o0;
    public boolean OooO0oO;
    public volatile Object OooO0oo;
    public int OooOO0;
    public boolean OooOO0O;
    public boolean OooOO0o;
    public final o00OOO00 OooOOO0;

    public gv0(int i) {
        Boolean bool = Boolean.TRUE;
        this.OooO0Oo = new Object();
        this.OooO0o0 = new wc1();
        this.OooO0o = 0;
        this.OooO = OooOOO;
        this.OooOOO0 = new o00OOO00(this, 25);
        this.OooO0oo = bool;
        this.OooOO0 = 0;
    }

    public static void OooO00o(String str) {
        y2.OooO00o().OooO00o.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        qa.OooO0o(px0.OooOOOO("Cannot invoke ", str, " on a background thread"));
    }

    public void OooO() {
    }

    public final void OooO0O0(wn0 wn0Var) {
        if (wn0Var.OooO0o0) {
            if (!wn0Var.OooO0Oo()) {
                wn0Var.OooO00o(false);
                return;
            }
            int i = wn0Var.OooO0o;
            int i2 = this.OooOO0;
            if (i >= i2) {
                return;
            }
            wn0Var.OooO0o = i2;
            wn0Var.OooO0Oo.OooO00o(this.OooO0oo);
        }
    }

    public final void OooO0OO(wn0 wn0Var) {
        if (this.OooOO0O) {
            this.OooOO0o = true;
            return;
        }
        this.OooOO0O = true;
        do {
            this.OooOO0o = false;
            if (wn0Var != null) {
                OooO0O0(wn0Var);
                wn0Var = null;
            } else {
                wc1 wc1Var = this.OooO0o0;
                wc1Var.getClass();
                uc1 uc1Var = new uc1(wc1Var);
                wc1Var.OooO0o.put(uc1Var, Boolean.FALSE);
                while (uc1Var.hasNext()) {
                    OooO0O0((wn0) ((Map.Entry) uc1Var.next()).getValue());
                    if (this.OooOO0o) {
                        break;
                    }
                }
            }
        } while (this.OooOO0o);
        this.OooOO0O = false;
    }

    public Object OooO0Oo() {
        Object obj = this.OooO0oo;
        if (obj != OooOOO) {
            return obj;
        }
        return null;
    }

    public void OooO0o0(hm0 hm0Var, iy0 iy0Var) {
        Object obj;
        OooO00o("observe");
        if (hm0Var.OooO0o().OooO0o == xl0.OooO0Oo) {
            return;
        }
        vn0 vn0Var = new vn0(this, hm0Var, iy0Var);
        wc1 wc1Var = this.OooO0o0;
        tc1 tc1VarOooO00o = wc1Var.OooO00o(iy0Var);
        if (tc1VarOooO00o != null) {
            obj = tc1VarOooO00o.OooO0o0;
        } else {
            tc1 tc1Var = new tc1(iy0Var, vn0Var);
            wc1Var.OooO0oO++;
            tc1 tc1Var2 = wc1Var.OooO0o0;
            if (tc1Var2 == null) {
                wc1Var.OooO0Oo = tc1Var;
                wc1Var.OooO0o0 = tc1Var;
            } else {
                tc1Var2.OooO0o = tc1Var;
                tc1Var.OooO0oO = tc1Var2;
                wc1Var.OooO0o0 = tc1Var;
            }
            obj = null;
        }
        wn0 wn0Var = (wn0) obj;
        if (wn0Var != null && !wn0Var.OooO0OO(hm0Var)) {
            ra.OooOOO("Cannot add the same observer with different lifecycles");
        } else {
            if (wn0Var != null) {
                return;
            }
            hm0Var.OooO0o().OooO0OO(vn0Var);
        }
    }

    public void OooO0oO(iy0 iy0Var) {
        Object obj;
        OooO00o("observeForever");
        un0 un0Var = new un0(this, iy0Var);
        wc1 wc1Var = this.OooO0o0;
        tc1 tc1VarOooO00o = wc1Var.OooO00o(iy0Var);
        if (tc1VarOooO00o != null) {
            obj = tc1VarOooO00o.OooO0o0;
        } else {
            tc1 tc1Var = new tc1(iy0Var, un0Var);
            wc1Var.OooO0oO++;
            tc1 tc1Var2 = wc1Var.OooO0o0;
            if (tc1Var2 == null) {
                wc1Var.OooO0Oo = tc1Var;
                wc1Var.OooO0o0 = tc1Var;
            } else {
                tc1Var2.OooO0o = tc1Var;
                tc1Var.OooO0oO = tc1Var2;
                wc1Var.OooO0o0 = tc1Var;
            }
            obj = null;
        }
        wn0 wn0Var = (wn0) obj;
        if (wn0Var instanceof vn0) {
            ra.OooOOO("Cannot add the same observer with different lifecycles");
        } else {
            if (wn0Var != null) {
                return;
            }
            un0Var.OooO00o(true);
        }
    }

    public void OooO0oo() {
    }

    public void OooOO0(Object obj) {
        boolean z;
        synchronized (this.OooO0Oo) {
            z = this.OooO == OooOOO;
            this.OooO = obj;
        }
        if (z) {
            y2 y2VarOooO00o = y2.OooO00o();
            o00OOO00 o00ooo00 = this.OooOOO0;
            fp fpVar = y2VarOooO00o.OooO00o;
            if (fpVar.OooO0OO == null) {
                synchronized (fpVar.OooO00o) {
                    try {
                        if (fpVar.OooO0OO == null) {
                            fpVar.OooO0OO = fp.OooO00o(Looper.getMainLooper());
                        }
                    } finally {
                    }
                }
            }
            fpVar.OooO0OO.post(o00ooo00);
        }
    }

    public void OooOO0O(iy0 iy0Var) {
        OooO00o("removeObserver");
        wn0 wn0Var = (wn0) this.OooO0o0.OooO0O0(iy0Var);
        if (wn0Var == null) {
            return;
        }
        wn0Var.OooO0O0();
        wn0Var.OooO00o(false);
    }

    public void OooOO0o(Object obj) {
        OooO00o("setValue");
        this.OooOO0++;
        this.OooO0oo = obj;
        OooO0OO(null);
    }

    public gv0() {
        this.OooO0Oo = new Object();
        this.OooO0o0 = new wc1();
        this.OooO0o = 0;
        Object obj = OooOOO;
        this.OooO = obj;
        this.OooOOO0 = new o00OOO00(this, 25);
        this.OooO0oo = obj;
        this.OooOO0 = -1;
    }
}
