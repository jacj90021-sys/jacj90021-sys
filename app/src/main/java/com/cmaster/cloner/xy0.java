package com.cmaster.cloner;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xy0 {
    public final Runnable OooO00o;
    public final e3 OooO0O0 = new e3();
    public d20 OooO0OO;
    public final OnBackInvokedCallback OooO0Oo;
    public boolean OooO0o;
    public OnBackInvokedDispatcher OooO0o0;
    public boolean OooO0oO;

    public xy0(Runnable runnable) {
        OnBackInvokedCallback onBackInvokedCallbackOooO00o;
        this.OooO00o = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                onBackInvokedCallbackOooO00o = ty0.OooO00o.OooO00o(new py0(this, 0), new py0(this, 1), new qy0(this, 0), new qy0(this, 1));
            } else {
                onBackInvokedCallbackOooO00o = ry0.OooO00o.OooO00o(new qy0(this, 2));
            }
            this.OooO0Oo = onBackInvokedCallbackOooO00o;
        }
    }

    public final void OooO00o() {
        Object objPrevious;
        e3 e3Var = this.OooO0O0;
        ListIterator listIterator = e3Var.listIterator(e3Var.OooO00o());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((d20) objPrevious).OooO00o) {
                    break;
                }
            }
        }
        d20 d20Var = (d20) objPrevious;
        this.OooO0OO = null;
        if (d20Var == null) {
            this.OooO00o.run();
            return;
        }
        k20 k20Var = d20Var.OooO0Oo;
        k20Var.OooOo(true);
        if (k20Var.OooO0oo.OooO00o) {
            k20Var.Oooo0o();
        } else {
            k20Var.OooO0oO.OooO00o();
        }
    }

    public final void OooO0O0(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.OooO0o0;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.OooO0Oo) == null) {
            return;
        }
        ry0 ry0Var = ry0.OooO00o;
        if (z && !this.OooO0o) {
            ry0Var.OooO0O0(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.OooO0o = true;
        } else {
            if (z || !this.OooO0o) {
                return;
            }
            ry0Var.OooO0OO(onBackInvokedDispatcher, onBackInvokedCallback);
            this.OooO0o = false;
        }
    }

    public final void OooO0OO() {
        boolean z = this.OooO0oO;
        boolean z2 = false;
        e3 e3Var = this.OooO0O0;
        if (e3Var == null || !e3Var.isEmpty()) {
            Iterator<E> it = e3Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((d20) it.next()).OooO00o) {
                    z2 = true;
                    break;
                }
            }
        }
        this.OooO0oO = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        OooO0O0(z2);
    }
}
