package com.cmaster.cloner;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.SystemClock;
import android.util.ArrayMap;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class kf1 extends Binder {
    public final ServiceInfo OooO;
    public final pw1 OooO0Oo;
    public final ComponentName OooO0o;
    public final ComponentName OooO0o0;
    public final String OooO0oO;
    public final Intent.FilterComparison OooO0oo;
    public final ApplicationInfo OooOO0;
    public final int OooOO0O;
    public final String OooOO0o;
    public final long OooOOO;
    public final String OooOOO0;
    public long OooOOo;
    public b51 OooOOo0;
    public long OooOOoo;
    public int OooOo;
    public boolean OooOo0;
    public int OooOo00;
    public int OooOo0O;
    public boolean OooOo0o;
    public Notification OooOoO0;
    public final ArrayMap OooOOOO = new ArrayMap();
    public final ArrayMap OooOOOo = new ArrayMap();
    public final ArrayList OooOoO = new ArrayList();
    public final ArrayList OooOoOO = new ArrayList();

    public kf1(pw1 pw1Var, ComponentName componentName, ComponentName componentName2, Intent.FilterComparison filterComparison, ServiceInfo serviceInfo, int i) {
        this.OooO0Oo = pw1Var;
        this.OooO0o0 = componentName;
        this.OooO0o = componentName2;
        this.OooO0oO = componentName2.flattenToShortString();
        this.OooO0oo = filterComparison;
        this.OooO = serviceInfo;
        ApplicationInfo applicationInfo = serviceInfo.applicationInfo;
        this.OooOO0 = applicationInfo;
        this.OooOO0o = applicationInfo.packageName;
        int i2 = serviceInfo.flags & 2;
        String str = serviceInfo.processName;
        if (i2 != 0) {
            StringBuilder sbOooOO0 = rj.OooOO0(str);
            sbOooOO0.append(u7.OooO00o(new byte[]{-43}, new byte[]{-17, 66, -61, -21, -48, -21, -35, 3}));
            sbOooOO0.append(componentName2.getClassName());
            this.OooOOO0 = sbOooOO0.toString();
        } else {
            this.OooOOO0 = str;
        }
        this.OooOOO = SystemClock.elapsedRealtime();
        this.OooOOo = SystemClock.uptimeMillis();
        this.OooOO0O = i;
    }

    public final jf1 OooO00o(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.OooOoO;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            jf1 jf1Var = (jf1) arrayList.get(i2);
            if (jf1Var.OooO0O0 == i && !z) {
                if (z2) {
                    arrayList.remove(i2);
                }
                return jf1Var;
            }
        }
        return null;
    }

    public final boolean OooO0O0() {
        ArrayMap arrayMap = this.OooOOOo;
        int size = arrayMap.size() - 1;
        while (true) {
            if (size < 0) {
                return false;
            }
            ArrayList arrayList = (ArrayList) arrayMap.valueAt(size);
            for (int i = 0; i < arrayList.size(); i++) {
                if ((((fh) arrayList.get(i)).OooO0OO & 1) != 0) {
                    return true;
                }
            }
            size--;
        }
    }
}
