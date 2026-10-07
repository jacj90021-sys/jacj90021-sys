package com.cmaster.cloner;

import android.content.pm.ApplicationInfo;
import android.os.Binder;
import android.util.ArraySet;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class b51 extends Binder {
    public final String OooO;
    public final ApplicationInfo OooO0Oo;
    public final int OooO0o0;
    public final int OooO0oO;
    public final int OooO0oo;
    public final String OooOO0;
    public final String OooOO0O;
    public int OooOO0o;
    public boolean OooOOO;
    public final boolean OooOOO0;
    public String OooOOOO;
    public oO00Oo0 OooOOoo;
    public final c21 OooOo00;
    public final HashSet OooO0o = new HashSet();
    public final CopyOnWriteArrayList OooOOOo = new CopyOnWriteArrayList();
    public final ArraySet OooOOo0 = new ArraySet();
    public final ArraySet OooOOo = new ArraySet();

    public b51(c21 c21Var, ApplicationInfo applicationInfo, String str, int i, int i2, int i3, boolean z) {
        new ArraySet();
        this.OooOo00 = c21Var;
        this.OooO0Oo = applicationInfo;
        this.OooO = c21Var.OooOOoo.OooO0O0();
        this.OooOO0O = str;
        this.OooO0o0 = i;
        this.OooO0oO = i2;
        this.OooO0oo = i3;
        this.OooOO0 = applicationInfo.packageName;
        this.OooOOO0 = z;
    }

    public final String toString() {
        String str = this.OooOOOO;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append(u7.OooO00o(new byte[]{-113, 17, 65, 102, -110, 117, -39, 41, -70, 0, 65, 119, -109, 125}, new byte[]{-33, 99, 46, 5, -9, 6, -86, 123}));
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(' ');
        sb.append(this.OooOO0o);
        sb.append(':');
        sb.append(this.OooOO0O);
        sb.append(':');
        sb.append(this.OooOOoo.OooO0o0);
        sb.append("/u");
        sb.append(this.OooO0o0);
        sb.append('a');
        sb.append(this.OooO0oO);
        sb.append('}');
        String string = sb.toString();
        this.OooOOOO = string;
        return string;
    }
}
