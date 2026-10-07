package com.cmaster.cloner;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class sp0 {
    public int OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public Object OooO0oO;

    public sp0() {
        if (oOO0OO.OooO0oo == null) {
            oOO0OO.OooO0oo = new oOO0OO();
        }
    }

    public int OooO00o(int i) {
        if (i < this.OooO0o) {
            return ((ByteBuffer) this.OooO0oO).getShort(this.OooO0o0 + i);
        }
        return 0;
    }

    public void OooO0O0() {
        if (((tp0) this.OooO0oO).OooOO0O == this.OooO0o) {
            return;
        }
        sa.OooO0O0();
    }

    public abstract Object OooO0OO(View view);

    public abstract void OooO0Oo(View view, Object obj);

    public void OooO0o(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.OooO0o0) {
            OooO0Oo(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.OooO0o0) {
            tag = OooO0OO(view);
        } else {
            tag = view.getTag(this.OooO0Oo);
            if (!((Class) this.OooO0oO).isInstance(tag)) {
                tag = null;
            }
        }
        if (OooO0oO(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateOooO0Oo = nt1.OooO0Oo(view);
            o0000O00 o0000o00 = accessibilityDelegateOooO0Oo != null ? accessibilityDelegateOooO0Oo instanceof o0000 ? ((o0000) accessibilityDelegateOooO0Oo).OooO00o : new o0000O00(accessibilityDelegateOooO0Oo) : null;
            if (o0000o00 == null) {
                o0000o00 = new o0000O00();
            }
            nt1.OooOOO0(view, o0000o00);
            view.setTag(this.OooO0Oo, obj);
            nt1.OooO0oo(view, this.OooO0o);
        }
    }

    public void OooO0o0() {
        while (true) {
            int i = this.OooO0Oo;
            tp0 tp0Var = (tp0) this.OooO0oO;
            if (i >= tp0Var.OooO || tp0Var.OooO0o[i] >= 0) {
                return;
            } else {
                this.OooO0Oo = i + 1;
            }
        }
    }

    public abstract boolean OooO0oO(Object obj, Object obj2);

    public boolean hasNext() {
        return this.OooO0Oo < ((tp0) this.OooO0oO).OooO;
    }

    public void remove() {
        tp0 tp0Var = (tp0) this.OooO0oO;
        OooO0O0();
        if (this.OooO0o0 == -1) {
            qa.OooO0o("Call next() before removing element from the iterator.");
            return;
        }
        tp0Var.OooO0OO();
        tp0Var.OooOO0O(this.OooO0o0);
        this.OooO0o0 = -1;
        this.OooO0o = tp0Var.OooOO0O;
    }
}
