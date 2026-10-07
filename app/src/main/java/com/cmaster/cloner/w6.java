package com.cmaster.cloner;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class w6 implements Cloneable {
    public int OooO0Oo;
    public int OooO0oO;
    public boolean OooOO0o;
    public boolean OooOOOo;
    public boolean OooOOo0;
    public boolean OooOOoo;
    public vr OooO0o0 = vr.OooO0OO;
    public t41 OooO0o = t41.OooO0o;
    public boolean OooO0oo = true;
    public int OooO = -1;
    public int OooOO0 = -1;
    public zk0 OooOO0O = rv.OooO0O0;
    public xz0 OooOOO0 = new xz0();
    public ea OooOOO = new ea(0);
    public Class OooOOOO = Object.class;
    public boolean OooOOo = true;

    public static boolean OooO0oO(int i, int i2) {
        return (i & i2) != 0;
    }

    public final w6 OooO(int i, int i2) {
        if (this.OooOOo0) {
            return clone().OooO(i, i2);
        }
        this.OooOO0 = i;
        this.OooO = i2;
        this.OooO0Oo |= 512;
        OooOO0o();
        return this;
    }

    public w6 OooO00o(w6 w6Var) {
        if (this.OooOOo0) {
            return clone().OooO00o(w6Var);
        }
        int i = w6Var.OooO0Oo;
        if (OooO0oO(w6Var.OooO0Oo, 1048576)) {
            this.OooOOoo = w6Var.OooOOoo;
        }
        if (OooO0oO(w6Var.OooO0Oo, 4)) {
            this.OooO0o0 = w6Var.OooO0o0;
        }
        if (OooO0oO(w6Var.OooO0Oo, 8)) {
            this.OooO0o = w6Var.OooO0o;
        }
        if (OooO0oO(w6Var.OooO0Oo, 16)) {
            this.OooO0Oo &= -33;
        }
        if (OooO0oO(w6Var.OooO0Oo, 32)) {
            this.OooO0Oo &= -17;
        }
        if (OooO0oO(w6Var.OooO0Oo, 64)) {
            this.OooO0oO = 0;
            this.OooO0Oo &= -129;
        }
        if (OooO0oO(w6Var.OooO0Oo, 128)) {
            this.OooO0oO = w6Var.OooO0oO;
            this.OooO0Oo &= -65;
        }
        if (OooO0oO(w6Var.OooO0Oo, 256)) {
            this.OooO0oo = w6Var.OooO0oo;
        }
        if (OooO0oO(w6Var.OooO0Oo, 512)) {
            this.OooOO0 = w6Var.OooOO0;
            this.OooO = w6Var.OooO;
        }
        if (OooO0oO(w6Var.OooO0Oo, 1024)) {
            this.OooOO0O = w6Var.OooOO0O;
        }
        if (OooO0oO(w6Var.OooO0Oo, 4096)) {
            this.OooOOOO = w6Var.OooOOOO;
        }
        if (OooO0oO(w6Var.OooO0Oo, 8192)) {
            this.OooO0Oo &= -16385;
        }
        if (OooO0oO(w6Var.OooO0Oo, UnixStat.DIR_FLAG)) {
            this.OooO0Oo &= -8193;
        }
        if (OooO0oO(w6Var.OooO0Oo, 131072)) {
            this.OooOO0o = w6Var.OooOO0o;
        }
        if (OooO0oO(w6Var.OooO0Oo, 2048)) {
            this.OooOOO.putAll(w6Var.OooOOO);
            this.OooOOo = w6Var.OooOOo;
        }
        this.OooO0Oo |= w6Var.OooO0Oo;
        this.OooOOO0.OooO0O0.OooO0oO(w6Var.OooOOO0.OooO0O0);
        OooOO0o();
        return this;
    }

    @Override // 
    /* renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public w6 clone() {
        try {
            w6 w6Var = (w6) super.clone();
            xz0 xz0Var = new xz0();
            w6Var.OooOOO0 = xz0Var;
            xz0Var.OooO0O0.OooO0oO(this.OooOOO0.OooO0O0);
            ea eaVar = new ea(0);
            w6Var.OooOOO = eaVar;
            eaVar.putAll(this.OooOOO);
            w6Var.OooOOOo = false;
            w6Var.OooOOo0 = false;
            return w6Var;
        } catch (CloneNotSupportedException e) {
            sa.OooOO0(e);
            return null;
        }
    }

    public final w6 OooO0OO(Class cls) {
        if (this.OooOOo0) {
            return clone().OooO0OO(cls);
        }
        this.OooOOOO = cls;
        this.OooO0Oo |= 4096;
        OooOO0o();
        return this;
    }

    public final w6 OooO0Oo(vr vrVar) {
        if (this.OooOOo0) {
            return clone().OooO0Oo(vrVar);
        }
        this.OooO0o0 = vrVar;
        this.OooO0Oo |= 4;
        OooOO0o();
        return this;
    }

    public final boolean OooO0o(w6 w6Var) {
        w6Var.getClass();
        if (Float.compare(1.0f, 1.0f) != 0) {
            return false;
        }
        char[] cArr = pr1.OooO00o;
        return this.OooO0oO == w6Var.OooO0oO && this.OooO0oo == w6Var.OooO0oo && this.OooO == w6Var.OooO && this.OooOO0 == w6Var.OooOO0 && this.OooOO0o == w6Var.OooOO0o && this.OooO0o0.equals(w6Var.OooO0o0) && this.OooO0o == w6Var.OooO0o && this.OooOOO0.equals(w6Var.OooOOO0) && this.OooOOO.equals(w6Var.OooOOO) && this.OooOOOO.equals(w6Var.OooOOOO) && this.OooOO0O.equals(w6Var.OooOO0O);
    }

    public final w6 OooO0o0() {
        if (this.OooOOo0) {
            return clone().OooO0o0();
        }
        this.OooO0Oo = (this.OooO0Oo | 32) & (-17);
        OooOO0o();
        return this;
    }

    public final w6 OooO0oo(ss ssVar, m8 m8Var) {
        if (this.OooOOo0) {
            return clone().OooO0oo(ssVar, m8Var);
        }
        OooOOO0(ss.OooO0oO, ssVar);
        return OooOOo0(m8Var, false);
    }

    public final w6 OooOO0(int i) {
        if (this.OooOOo0) {
            return clone().OooOO0(i);
        }
        this.OooO0oO = i;
        this.OooO0Oo = (this.OooO0Oo | 128) & (-65);
        OooOO0o();
        return this;
    }

    public final w6 OooOO0O() {
        if (this.OooOOo0) {
            return clone().OooOO0O();
        }
        this.OooO0o = t41.OooO0oO;
        this.OooO0Oo |= 8;
        OooOO0o();
        return this;
    }

    public final void OooOO0o() {
        if (this.OooOOOo) {
            qa.OooO0o("You cannot modify locked T, consider clone()");
        }
    }

    public final w6 OooOOO(by0 by0Var) {
        if (this.OooOOo0) {
            return clone().OooOOO(by0Var);
        }
        this.OooOO0O = by0Var;
        this.OooO0Oo |= 1024;
        OooOO0o();
        return this;
    }

    public final w6 OooOOO0(tz0 tz0Var, ss ssVar) {
        if (this.OooOOo0) {
            return clone().OooOOO0(tz0Var, ssVar);
        }
        zx2.OooO0O0(tz0Var);
        this.OooOOO0.OooO0O0.put(tz0Var, ssVar);
        OooOO0o();
        return this;
    }

    public final w6 OooOOOO(boolean z) {
        if (this.OooOOo0) {
            return clone().OooOOOO(true);
        }
        this.OooO0oo = !z;
        this.OooO0Oo |= 256;
        OooOO0o();
        return this;
    }

    public final w6 OooOOOo(dd ddVar) {
        ss ssVar = ss.OooO0OO;
        if (this.OooOOo0) {
            return clone().OooOOOo(ddVar);
        }
        OooOOO0(ss.OooO0oO, ssVar);
        return OooOOo0(ddVar, true);
    }

    public final w6 OooOOo(Class cls, no1 no1Var, boolean z) {
        if (this.OooOOo0) {
            return clone().OooOOo(cls, no1Var, z);
        }
        zx2.OooO0O0(no1Var);
        this.OooOOO.put(cls, no1Var);
        int i = this.OooO0Oo;
        this.OooO0Oo = 67584 | i;
        this.OooOOo = false;
        if (z) {
            this.OooO0Oo = i | 198656;
            this.OooOO0o = true;
        }
        OooOO0o();
        return this;
    }

    public final w6 OooOOo0(no1 no1Var, boolean z) {
        if (this.OooOOo0) {
            return clone().OooOOo0(no1Var, z);
        }
        ws wsVar = new ws(no1Var, z);
        OooOOo(Bitmap.class, no1Var, z);
        OooOOo(Drawable.class, wsVar, z);
        OooOOo(BitmapDrawable.class, wsVar, z);
        OooOOo(x40.class, new z40(no1Var), z);
        OooOO0o();
        return this;
    }

    public final w6 OooOOoo() {
        if (this.OooOOo0) {
            return clone().OooOOoo();
        }
        this.OooOOoo = true;
        this.OooO0Oo |= 1048576;
        OooOO0o();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof w6) {
            return OooO0o((w6) obj);
        }
        return false;
    }

    public int hashCode() {
        char[] cArr = pr1.OooO00o;
        return pr1.OooO0oo(pr1.OooO0oo(pr1.OooO0oo(pr1.OooO0oo(pr1.OooO0oo(pr1.OooO0oo(pr1.OooO0oo(pr1.OooO0oO(0, pr1.OooO0oO(0, pr1.OooO0oO(1, pr1.OooO0oO(this.OooOO0o ? 1 : 0, pr1.OooO0oO(this.OooOO0, pr1.OooO0oO(this.OooO, pr1.OooO0oO(this.OooO0oo ? 1 : 0, pr1.OooO0oo(pr1.OooO0oO(0, pr1.OooO0oo(pr1.OooO0oO(this.OooO0oO, pr1.OooO0oo(pr1.OooO0oO(0, pr1.OooO0oO(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.OooO0o0), this.OooO0o), this.OooOOO0), this.OooOOO), this.OooOOOO), this.OooOO0O), null);
    }
}
