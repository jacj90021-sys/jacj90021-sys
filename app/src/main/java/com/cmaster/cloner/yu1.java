package com.cmaster.cloner;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class yu1 extends g7 {
    public static final yu1 OooOOO0 = new yu1();
    public final gv0 OooO0o0 = new gv0();
    public final gv0 OooO0o = new gv0(0);
    public final ConcurrentHashMap OooO0oO = new ConcurrentHashMap();
    public final ConcurrentHashMap OooO0oo = new ConcurrentHashMap();
    public final ye1 OooO = new ye1(1);
    public final jv1 OooOO0 = jv1.OooO0O0;
    public final gv0 OooOO0O = new gv0();
    public boolean OooOO0o = true;

    public static void OooO0Oo(yu1 yu1Var) {
        int[] iArrOooOo;
        List<String> listOooOo0O;
        Bundle bundleOooOoo0;
        String str = null;
        try {
            iArrOooOo = a02.OooO0oo.OooOo(null);
        } catch (Exception unused) {
            iArrOooOo = new int[0];
        }
        if (iArrOooOo == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int i2 = 1;
            if (i >= iArrOooOo.length) {
                h1.OooO0O0.execute(new bf1(yu1Var, arrayList, i2));
                return;
            }
            int i3 = iArrOooOo[i];
            k2 k2Var = (k2) yu1Var.OooO0oO.get(Integer.valueOf(i3));
            if (k2Var == null) {
                synchronized (yu1Var.OooO0oO) {
                    try {
                        k2Var = (k2) yu1Var.OooO0oO.get(Integer.valueOf(i3));
                        if (k2Var == null) {
                            yu1Var.OooOO0.OooO00o(i3, sn2.OooO00o("EfwpC1E=\n", "Mp9IeTUA3fQ=\n"));
                            k2Var = new k2(i3, yu1Var.OooOO0o);
                            yu1Var.OooO0oO.put(Integer.valueOf(i3), k2Var);
                        }
                    } finally {
                    }
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                listOooOo0O = a02.OooO0oo.OooOo0O(iArrOooOo[i]);
            } catch (Exception unused2) {
                listOooOo0O = Collections.EMPTY_LIST;
            }
            if (listOooOo0O == null) {
                listOooOo0O = Collections.EMPTY_LIST;
            }
            for (String str2 : listOooOo0O) {
                if (!hz.OooO0OO.contains(str2)) {
                    int i4 = iArrOooOo[i];
                    qj0 qj0VarOooO00o = yu1Var.OooOO0.OooO00o(i4, str2);
                    wu1 wu1Var = (wu1) yu1Var.OooO0oo.get(qj0VarOooO00o.OooO00o);
                    if (wu1Var == null) {
                        synchronized (yu1Var.OooO0oo) {
                            try {
                                wu1Var = (wu1) yu1Var.OooO0oo.get(qj0VarOooO00o.OooO00o);
                                if (wu1Var == null) {
                                    wu1Var = new wu1(qj0VarOooO00o, i4);
                                    yu1Var.OooO0oo.put(qj0VarOooO00o.OooO00o, wu1Var);
                                }
                            } finally {
                            }
                        }
                    }
                    PackageInfo packageInfoOooO00o = k63.OooO00o(0, iArrOooOo[i], str2);
                    boolean z = packageInfoOooO00o != null && new File(packageInfoOooO00o.applicationInfo.sourceDir).exists();
                    if (!z) {
                        k63.OooO0O0(2, iArrOooOo[i], str, str, str2);
                        packageInfoOooO00o = k63.OooO00o(0, iArrOooOo[i], str2);
                        z = packageInfoOooO00o != null && new File(packageInfoOooO00o.applicationInfo.sourceDir).exists();
                    }
                    if (z) {
                        qj0 qj0Var = wu1Var.OooOOO0;
                        String str3 = qj0.OooO;
                        if (TextUtils.equals(qj0Var.OooO00o(str3), packageInfoOooO00o.applicationInfo.sourceDir)) {
                            String str4 = qj0.OooOO0;
                            if (TextUtils.isEmpty(qj0Var.OooO00o(str4))) {
                                qj0Var.OooO0Oo(str4, String.valueOf(packageInfoOooO00o.applicationInfo.loadLabel(e2.OooO0O0())));
                                qj0Var.OooO0OO();
                            }
                        } else {
                            qj0Var.OooO0Oo(str3, packageInfoOooO00o.applicationInfo.sourceDir);
                            CharSequence charSequenceLoadLabel = packageInfoOooO00o.applicationInfo.loadLabel(e2.OooO0O0());
                            if (charSequenceLoadLabel.length() == 0) {
                                try {
                                    charSequenceLoadLabel = e2.OooO0O0().getApplicationInfo(qj0Var.OooO0O0, 0).loadLabel(e2.OooO0O0());
                                } catch (PackageManager.NameNotFoundException unused3) {
                                }
                            }
                            qj0Var.OooO0Oo(qj0.OooOO0, String.valueOf(charSequenceLoadLabel));
                            qj0Var.OooO0OO();
                        }
                    }
                    try {
                        bundleOooOoo0 = a02.OooO0oo.OooOoo0(iArrOooOo[i], str2);
                    } catch (Exception unused4) {
                    }
                    boolean z2 = bundleOooOoo0 == null || bundleOooOoo0.getBoolean(qn2.OooO00o("L9aL90Dax7UZ+r7JbavDtA7r\n", "Sq7/hSH0jvs=\n"));
                    boolean z3 = packageInfoOooO00o == null || !new File(packageInfoOooO00o.applicationInfo.sourceDir).exists();
                    wu1Var.OooOO0o = packageInfoOooO00o;
                    wu1Var.OooO0oO();
                    wu1Var.OooOOOo = z3;
                    wu1Var.OooOOOO = z2;
                    wu1Var.OooO0o0();
                    linkedHashMap.put(str2, wu1Var);
                    str = null;
                }
            }
            arrayList.add(k2Var);
            k2Var.OooO0oO = linkedHashMap;
            h1.OooO0OO.execute(new o00OOO00(k2Var, 6));
            i++;
            str = null;
        }
    }
}
