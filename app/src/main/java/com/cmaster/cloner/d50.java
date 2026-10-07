package com.cmaster.cloner;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class d50 {
    public b50 OooO;
    public final ni1 OooO00o;
    public final Handler OooO0O0;
    public final ArrayList OooO0OO;
    public final x91 OooO0Oo;
    public boolean OooO0o;
    public final k8 OooO0o0;
    public boolean OooO0oO;
    public p91 OooO0oo;
    public boolean OooOO0;
    public b50 OooOO0O;
    public Bitmap OooOO0o;
    public int OooOOO;
    public b50 OooOOO0;
    public int OooOOOO;
    public int OooOOOo;

    public d50(com.bumptech.glide.OooO00o oooO00o, ni1 ni1Var, int i, int i2, Bitmap bitmap) {
        k8 k8Var = oooO00o.OooO0Oo;
        j50 j50Var = oooO00o.OooO0o;
        Context baseContext = j50Var.getBaseContext();
        zx2.OooO0OO(baseContext, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        x91 x91VarOooO0OO = com.bumptech.glide.OooO00o.OooO00o(baseContext).OooO0oo.OooO0OO(baseContext);
        Context baseContext2 = j50Var.getBaseContext();
        zx2.OooO0OO(baseContext2, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        x91 x91VarOooO0OO2 = com.bumptech.glide.OooO00o.OooO00o(baseContext2).OooO0oo.OooO0OO(baseContext2);
        x91VarOooO0OO2.getClass();
        p91 p91VarOooOo0 = new p91(x91VarOooO0OO2.OooO0Oo, x91VarOooO0OO2, Bitmap.class, x91VarOooO0OO2.OooO0o0).OooO00o(x91.OooOOO).OooO00o(((aa1) ((aa1) ((aa1) new aa1().OooO0Oo(vr.OooO00o)).OooOOoo()).OooOOOO(true)).OooO(i, i2));
        this.OooO0OO = new ArrayList();
        this.OooO0Oo = x91VarOooO0OO;
        Handler handler = new Handler(Looper.getMainLooper(), new c50(this, 0));
        this.OooO0o0 = k8Var;
        this.OooO0O0 = handler;
        this.OooO0oo = p91VarOooOo0;
        this.OooO00o = ni1Var;
        OooO0OO(xq1.OooO0O0, bitmap);
    }

    public final void OooO00o() {
        int i;
        if (!this.OooO0o || this.OooO0oO) {
            return;
        }
        b50 b50Var = this.OooOOO0;
        if (b50Var != null) {
            this.OooOOO0 = null;
            OooO0O0(b50Var);
            return;
        }
        this.OooO0oO = true;
        ni1 ni1Var = this.OooO00o;
        int i2 = ni1Var.OooOO0o.OooO0OO;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((i2 <= 0 || (i = ni1Var.OooOO0O) < 0) ? 0 : (i < 0 || i >= i2) ? -1 : ((a50) r3.OooO0o0.get(i)).OooO);
        int i3 = (ni1Var.OooOO0O + 1) % ni1Var.OooOO0o.OooO0OO;
        ni1Var.OooOO0O = i3;
        this.OooOO0O = new b50(this.OooO0O0, i3, jUptimeMillis);
        p91 p91VarOooOoO = this.OooO0oo.OooO00o((aa1) new aa1().OooOOO(new by0(Double.valueOf(Math.random())))).OooOoO(ni1Var);
        p91VarOooOoO.OooOoO0(this.OooOO0O, null, p91VarOooOoO, y52.OooO00o);
    }

    public final void OooO0O0(b50 b50Var) {
        this.OooO0oO = false;
        boolean z = this.OooOO0;
        Handler handler = this.OooO0O0;
        if (z) {
            handler.obtainMessage(2, b50Var).sendToTarget();
            return;
        }
        if (!this.OooO0o) {
            this.OooOOO0 = b50Var;
            return;
        }
        if (b50Var.OooOO0 != null) {
            Bitmap bitmap = this.OooOO0o;
            if (bitmap != null) {
                this.OooO0o0.OooO0O0(bitmap);
                this.OooOO0o = null;
            }
            b50 b50Var2 = this.OooO;
            this.OooO = b50Var;
            ArrayList arrayList = this.OooO0OO;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                x40 x40Var = (x40) arrayList.get(size);
                Object callback = x40Var.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    x40Var.stop();
                    x40Var.invalidateSelf();
                } else {
                    x40Var.invalidateSelf();
                    b50 b50Var3 = ((d50) x40Var.OooO0Oo.OooO0O0).OooO;
                    if ((b50Var3 != null ? b50Var3.OooO0oo : -1) == r5.OooO00o.OooOO0o.OooO0OO - 1) {
                        x40Var.OooO++;
                    }
                    int i = x40Var.OooOO0;
                    if (i != -1 && x40Var.OooO >= i) {
                        x40Var.stop();
                    }
                }
            }
            if (b50Var2 != null) {
                handler.obtainMessage(2, b50Var2).sendToTarget();
            }
        }
        OooO00o();
    }

    public final void OooO0OO(no1 no1Var, Bitmap bitmap) {
        zx2.OooO0OO(no1Var, "Argument must not be null");
        zx2.OooO0OO(bitmap, "Argument must not be null");
        this.OooOO0o = bitmap;
        this.OooO0oo = this.OooO0oo.OooO00o(new aa1().OooOOo0(no1Var, true));
        this.OooOOO = pr1.OooO0OO(bitmap);
        this.OooOOOO = bitmap.getWidth();
        this.OooOOOo = bitmap.getHeight();
    }
}
