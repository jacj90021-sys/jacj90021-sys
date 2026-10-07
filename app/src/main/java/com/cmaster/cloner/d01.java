package com.cmaster.cloner;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class d01 {
    public static final m3 OooOO0;
    public final hx2 OooO00o;
    public final gv0 OooO0O0;
    public final gv0 OooO0OO;
    public volatile Map OooO0Oo;
    public boolean OooO0o;
    public final ye1 OooO0o0;
    public String OooO0oO;
    public final gv0 OooO0oo;
    public static final String OooOO0O = sn2.OooO00o("6Btp\n", "oFQ96iNqVeY=\n");
    public static final d01 OooO = new d01();

    static {
        m3 m3Var = new m3(10);
        OooOO0 = m3Var;
        m3Var.add(sn2.OooO00o("SBCRRb2THlBEFphFqpgURkIRmw==\n", "K3/8a9z9eiI=\n"));
        m3Var.add(sn2.OooO00o("xgSQafqyfpDKAplp+LRojcgO\n", "pWv9R5vcGuI=\n"));
        m3Var.add(sn2.OooO00o("UwliZjfb1GtVCHtmLtM=\n", "MGYPSEO+ugg=\n"));
        m3Var.add(sn2.OooO00o("JBCPhu2wBs4iEZaG9LoKxCsak9k=\n", "R3/iqJnVaK0=\n"));
        m3Var.add(sn2.OooO00o("x3xlHywB2TLXcnhB\n", "pBMIMVtpuEY=\n"));
        m3Var.add(sn2.OooO00o("P1HvLtQerj89SvFhwww=\n", "XD6CALN82Vc=\n"));
        m3Var.add(sn2.OooO00o("WE4WJ2wg4XhIQAt5NT+0bg==\n", "OyF7CRtIgAw=\n"));
        m3Var.add(sn2.OooO00o("3lcfJ6mzJMHfVx1i4bkm0NxWEw==\n", "vThyCc/SR6Q=\n"));
        m3Var.add(sn2.OooO00o("v1myacPVRom+WbAsi9tXj70=\n", "3DbfR6W0Jew=\n"));
        m3Var.add(sn2.OooO00o("5glSlS3f2B7nCVDQZdLSD+A=\n", "hWY/u0u+u3s=\n"));
        m3Var.add(sn2.OooO00o("DhWTBT2RcMIfVIhEIog=\n", "bXr+K0v4Eqc=\n"));
        m3Var.add(sn2.OooO00o("uA/t/ahFJKK4COGn9UortqkP6bc=\n", "22CA09srRdI=\n"));
        m3Var.add(sn2.OooO00o("35Y+93Gje/zQnH24eKhm9NWdfbhmvGe1zJE8rXm/\n", "vPlT2RbMFJs=\n"));
        m3Var.add(sn2.OooO00o("Vz1xHVVZZytYNzJSXFJ6I102MlJCRntiWjBpHVRfZClH\n", "NFIcMzI2CEw=\n"));
        m3Var.add(sn2.OooO00o("Sb2YG4Bj6yBGt9tUiWj2KEO221KK\n", "KtL1NecMhEc=\n"));
        m3Var.add(sn2.OooO00o("hGaEYxrSnTKLbMcsE9mAOo5txzQSyIYghWw=\n", "5wnpTX298lU=\n"));
        m3Var.add(sn2.OooO00o("FdhTP1XeLFId2FV8D9YlRAnPWnZEyQ==\n", "eqo0ESG7QDc=\n"));
        m3Var.add(sn2.OooO00o("L9YhSrKqEFEsiH9ErqUc\n", "RaYPId3EcTw=\n"));
        m3Var.add(sn2.OooO00o("ULEciaF1xyYUrVuJpS3DOl6zXY6k\n", "OsEy58ADolQ=\n"));
        m3Var.add(sn2.OooO00o("vIQZsDy6haS+jAb/OPqXvruZG/cx\n", "3+t0nlXU9tA=\n"));
    }

    public d01() {
        lh lhVar = new lh();
        this.OooO00o = new hx2(e2.OooO.OooO00o);
        this.OooO0O0 = new gv0(0);
        this.OooO0OO = new gv0();
        this.OooO0Oo = Collections.EMPTY_MAP;
        this.OooO0o0 = new ye1(1);
        this.OooO0oo = new gv0();
        lhVar.OooO0oO(new k1(this, 13));
        OooO0O0();
    }

    public final void OooO00o() {
        Map map = this.OooO0Oo;
        ArrayList arrayList = new ArrayList(map.size());
        ArrayList arrayList2 = new ArrayList(map.keySet());
        Collections.sort(arrayList2);
        String str = OooOO0O;
        arrayList2.remove(str);
        arrayList2.add(0, str);
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            String str2 = (String) obj;
            List<o2> list = (List) map.get(str2);
            if (list != null && !list.isEmpty()) {
                ArrayList arrayList3 = new ArrayList(list.size());
                for (o2 o2Var : list) {
                    if (!OooOO0O.equals(str2)) {
                        int i2 = o2Var.OooO0o0.applicationInfo.flags;
                        boolean z = (i2 & 128) == 0 ? (i2 & 1) != 0 : true;
                        if (this.OooO0o || !z) {
                        }
                    }
                    String str3 = this.OooO0oO;
                    if (TextUtils.isEmpty(str3) || String.valueOf(o2Var.OooO0Oo()).toLowerCase().contains(str3)) {
                        arrayList3.add(o2Var);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    rl0 rl0Var = new rl0();
                    rl0Var.OooO0o0 = str2;
                    arrayList.add(rl0Var);
                    arrayList.addAll(arrayList3);
                }
            }
        }
        this.OooO0OO.OooOO0o(arrayList);
    }

    public final void OooO0O0() {
        this.OooO0O0.OooOO0(Boolean.TRUE);
        this.OooO0o0.execute(new c01(this, 0));
    }
}
