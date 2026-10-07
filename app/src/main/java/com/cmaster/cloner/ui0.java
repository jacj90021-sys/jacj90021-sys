package com.cmaster.cloner;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.ArrayMap;
import android.util.ArraySet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ui0 extends Binder {
    public boolean OooO;
    public final kf1 OooO0Oo;
    public final ArrayMap OooO0o = new ArrayMap();
    public final Intent.FilterComparison OooO0o0;
    public IBinder OooO0oO;
    public boolean OooO0oo;
    public boolean OooOO0;
    public boolean OooOO0O;
    public String OooOO0o;

    public ui0(kf1 kf1Var, Intent.FilterComparison filterComparison) {
        this.OooO0Oo = kf1Var;
        this.OooO0o0 = filterComparison;
    }

    public final String toString() {
        String str = this.OooOO0o;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append(u7.OooO00o(new byte[]{-93, 114, 62, 96, -87, -46, -116, 74, -124, 120, 24, 96, -92, -55, -68, 71, -111}, new byte[]{-22, 28, 74, 5, -57, -90, -50, 35}));
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(' ');
        ArrayMap arrayMap = this.OooO0o;
        int i = 0;
        for (int size = arrayMap.size() - 1; size >= 0; size--) {
            ArraySet arraySet = ((ooooO0O0) arrayMap.valueAt(size)).OooO0Oo;
            for (int size2 = arraySet.size() - 1; size2 >= 0; size2--) {
                i |= ((fh) arraySet.valueAt(size2)).OooO0OO;
            }
        }
        if ((i & 1) != 0) {
            sb.append(u7.OooO00o(new byte[]{98, 95, 101}, new byte[]{33, 13, 69, -92, 52, 94, 12, 51}));
        }
        sb.append(this.OooO0Oo.OooO0oO);
        sb.append(':');
        Intent.FilterComparison filterComparison = this.OooO0o0;
        if (filterComparison != null) {
            sb.append(filterComparison);
        }
        sb.append('}');
        String string = sb.toString();
        this.OooOO0o = string;
        return string;
    }
}
