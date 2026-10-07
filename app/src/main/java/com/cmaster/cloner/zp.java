package com.cmaster.cloner;

import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class zp {
    public static final String OooO0OO = u7.OooO00o(new byte[]{121, -115, -18, 22, -43, 42, 105, -105, 113, -123, -67, 71, -126, 123, 58, -58, 46, -44, -75, 79, -118, 115, 50, -50, 38, -52, -83, 87, -110, 107, 42, -42, 62, -60, -91, 95, -96, 93, 28, -28, 12, -6, -101, 109, -88, 85, 20, -20, 4, -14, -109, 117, -80, 77, 12, -12, 28, -22, -117, 125, -72, 69}, new byte[]{73, -68, -36, 37, -31, 31, 95, -96});
    public final HashSet OooO00o;
    public final o80 OooO0O0;

    public zp(o80 o80Var) {
        HashSet hashSet = new HashSet();
        this.OooO00o = hashSet;
        this.OooO0O0 = o80Var;
        hashSet.add(o80Var.OooO0o0);
        hashSet.add(o80Var.OooO0o);
    }

    public final String OooO00o(Random random) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 12; i++) {
            int iNextInt = random.nextInt(16);
            if (iNextInt < 10) {
                sb.append(iNextInt);
            } else {
                sb.append((char) (iNextInt + 87));
            }
            if ((i & 1) != 0 && i != 11) {
                sb.append(u7.OooO00o(new byte[]{-43}, new byte[]{-17, 37, 100, 20, 93, 52, 101, 107}));
            }
        }
        String string = sb.toString();
        HashSet hashSet = this.OooO00o;
        if (hashSet.contains(string)) {
            return OooO00o(random);
        }
        hashSet.add(string);
        return string;
    }

    public final String OooO0O0(Random random, int i, boolean z) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(OooO0OO.charAt(z ? random.nextInt(10) : random.nextInt(16)));
        }
        String string = sb.toString();
        HashSet hashSet = this.OooO00o;
        if (hashSet.contains(string)) {
            return OooO0O0(random, i, z);
        }
        hashSet.add(string);
        return string;
    }

    public final void OooO0OO(aq aqVar) {
        Bundle bundle = aqVar.OooO0Oo;
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            this.OooO00o.remove(String.valueOf(bundle.get(it.next())));
        }
    }
}
