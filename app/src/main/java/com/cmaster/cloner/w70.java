package com.cmaster.cloner;

import android.app.ActivityManager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class w70 implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ g80 OooO0o0;

    public /* synthetic */ w70(g80 g80Var, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = g80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map mapOooOooO;
        Map mapOooOooO2;
        int i = this.OooO0Oo;
        g80 g80Var = this.OooO0o0;
        switch (i) {
            case 0:
                AtomicLong atomicLong = new AtomicLong();
                ArrayList arrayList = new ArrayList();
                try {
                    mapOooOooO = a02.OooO0oo.OooOooO();
                } catch (Exception unused) {
                    mapOooOooO = Collections.EMPTY_MAP;
                }
                for (Integer num : mapOooOooO.keySet()) {
                    Map map = (Map) mapOooOooO.get(num);
                    if (map != null) {
                        Iterator it = map.keySet().iterator();
                        while (it.hasNext()) {
                            List list = (List) map.get((String) it.next());
                            int[] iArr = new int[list.size()];
                            for (int i2 = 0; i2 < list.size(); i2++) {
                                iArr[i2] = ((Integer) list.get(i2)).intValue();
                            }
                            long totalPss = 0;
                            for (int i3 = 0; i3 < ((ActivityManager) oOO0OO.OooO0Oo.getSystemService(sn2.OooO00o("IwvYRcg9mFI=\n", "QmisLL5U7Cs=\n"))).getProcessMemoryInfo(iArr).length; i3++) {
                                totalPss += r11[i3].getTotalPss();
                            }
                            if (totalPss > 0) {
                                num.getClass();
                                ns0 ns0Var = new ns0();
                                ns0Var.OooO00o = totalPss;
                                arrayList.add(ns0Var);
                            }
                        }
                    }
                }
                int size = arrayList.size();
                long j = 0;
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    j += ((ns0) obj).OooO00o;
                }
                atomicLong.set(j / 1024);
                try {
                    mapOooOooO2 = a02.OooO0oo.OooOooO();
                } catch (Exception unused2) {
                    mapOooOooO2 = Collections.EMPTY_MAP;
                }
                sn2.OooO00o("+Msm/XnWk4HxyRPffMvVxrGAew==\n", "n65Srwy4/eg=\n");
                mapOooOooO2.getClass();
                Iterator it2 = mapOooOooO2.keySet().iterator();
                while (it2.hasNext()) {
                    int iIntValue = ((Number) it2.next()).intValue();
                    Map map2 = (Map) mapOooOooO2.get(Integer.valueOf(iIntValue));
                    if (map2 != null) {
                        Iterator it3 = map2.keySet().iterator();
                        while (it3.hasNext()) {
                            try {
                                a02.OooO0oo.Oooo00O(iIntValue, (String) it3.next(), sn2.OooO00o("f430/aj9yJ9JlbHM5NvFhA==\n", "Kv6Rj4i+pPY=\n"));
                            } catch (Exception unused3) {
                            }
                        }
                    }
                }
                oOOO00 oooo00OooO0oo = g80Var.OooO0oo();
                if (oooo00OooO0oo != null) {
                    oooo00OooO0oo.runOnUiThread(new oO000o00(g80Var, atomicLong, 2));
                    break;
                }
                break;
            default:
                m1 m1VarOoooOOO = g80Var.OoooOOO();
                Bundle bundle = new Bundle();
                bundle.putBoolean(sn2.OooO00o("yxKo01+vpJvKErrTRLi+gdcB\n", "mVf5hhb94cQ=\n"), true);
                j1.OooO0Oo(m1VarOoooOOO, OooO00o.class, bundle);
                break;
        }
    }
}
