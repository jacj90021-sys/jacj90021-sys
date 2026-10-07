package com.cmaster.cloner;

import java.util.Formatter;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ms0 extends tq1 {
    @Override // com.cmaster.cloner.tq1
    public final void OooOOO0() {
        if (OooO0Oo().size() <= 65536) {
            Iterator it = OooO0Oo().iterator();
            int i = 0;
            while (it.hasNext()) {
                ((ls0) it.next()).OooO0oO(i);
                i++;
            }
            return;
        }
        TreeMap treeMap = new TreeMap();
        Iterator it2 = OooO0Oo().iterator();
        while (it2.hasNext()) {
            String str = ((ls0) it2.next()).OooO0o0.OooO0o().OooO0Oo;
            int iLastIndexOf = str.lastIndexOf(47);
            String strOooO00o = iLastIndexOf == -1 ? u7.OooO00o(new byte[]{51, 33, 69, -120, 7, -84, 85}, new byte[]{87, 68, 35, -23, 114, -64, 33, 112}) : str.substring(str.lastIndexOf(91) + 2, iLastIndexOf).replace('/', '.');
            AtomicInteger atomicInteger = (AtomicInteger) treeMap.get(strOooO00o);
            if (atomicInteger == null) {
                atomicInteger = new AtomicInteger();
                treeMap.put(strOooO00o, atomicInteger);
            }
            atomicInteger.incrementAndGet();
        }
        Formatter formatter = new Formatter();
        try {
            formatter.format(u7.OooO00o(new byte[]{8, -110, -102, -17, -41, -91, 64, -12, 124, -40, -60, -21, -55, -28, 92, -24, 58, -104, -121, -86, -44, -89, 75, -2, 124, -119, -102, -17, -36, -83, 90, -83, 53, -109, -43, -96, -44, -95, 14, -23, 57, -123, -43, -87, -45, -88, 75, -73, 124, -40, -57, -21, -34, -1, 14, -32, 61, -123, -43, -90, -55, -28, 11, -66, 120, -103, -37, -22, -44, -99, 65, -8, 124, -112, -108, -74, -102, -80, 92, -12, 124, -120, -122, -90, -44, -93, 14, -32, 41, -111, -127, -90, -105, -96, 75, -11, 114, -35, -68, -87, -102, -87, 91, -31, 40, -108, -40, -85, -33, -68, 14, -28, 47, -35, -112, -95, -37, -90, 66, -24, 56, -35, -127, -89, -33, -86, 14, -7, 52, -104, -43, -93, -45, -73, 90, -83, 51, -101, -43, -84, -42, -91, 93, -2, 57, -114, -43, -87, -43, -74, 14, -7, 52, -104, -43, -94, -37, -83, 64, -83, 56, -104, -115, -17, -42, -83, 93, -7, 124, -108, -122, -17, -50, -85, 65, -83, 48, -100, -121, -88, -33, -22, 11, -29, 14, -104, -109, -86, -56, -95, 64, -18, 57, -114, -43, -83, -61, -28, 94, -20, 63, -106, -108, -88, -33, -2}, new byte[]{92, -3, -11, -49, -70, -60, 46, -115}), this instanceof vt0 ? u7.OooO00o(new byte[]{-30, 90, -87, -56, 70, -5}, new byte[]{-113, 63, -35, -96, 41, -97, 96, 42}) : u7.OooO00o(new byte[]{61, 30, 85, -116, 55}, new byte[]{91, 119, 48, -32, 83, 9, 67, 53}), Integer.valueOf(OooO0Oo().size()), 65536);
            for (Map.Entry entry : treeMap.entrySet()) {
                formatter.format(u7.OooO00o(new byte[]{66, -60, -49, 116, 37, -41, -117, -113}, new byte[]{103, -86, -22, 66, 65, -9, -82, -4}), Integer.valueOf(((AtomicInteger) entry.getValue()).get()), entry.getKey());
            }
            String string = formatter.toString();
            formatter.close();
            throw new qq(string, null);
        } catch (Throwable th) {
            formatter.close();
            throw th;
        }
    }
}
