package com.cmaster.cloner;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.zzaqh;
import com.google.android.gms.internal.ads.zzaqm;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class vr1 implements zzaqh, dg2 {
    public final /* synthetic */ int OooO0Oo;
    public Object OooO0o;
    public Object OooO0o0;

    public vr1(int i) {
        this.OooO0Oo = i;
        switch (i) {
            case 4:
                this.OooO0o0 = Collections.synchronizedMap(new WeakHashMap());
                this.OooO0o = Collections.synchronizedMap(new WeakHashMap());
                break;
            case 11:
                break;
            default:
                this.OooO0o0 = new gh1(0);
                this.OooO0o = new gp0();
                break;
        }
    }

    public static void OooO00o(nq nqVar, oh ohVar) {
        if (!(ohVar instanceof tk)) {
            nqVar.OooO0O0(ohVar);
            return;
        }
        sk skVar = ((tk) ohVar).OooO0Oo;
        int length = skVar.OooO0o0.length;
        for (int i = 0; i < length; i++) {
            OooO00o(nqVar, (oh) skVar.OooO0o0(i));
        }
    }

    public static int OooO0OO(oh ohVar) {
        if (ohVar instanceof vk) {
            return 0;
        }
        if (ohVar instanceof ll) {
            return 2;
        }
        if (ohVar instanceof wk) {
            return 3;
        }
        if (ohVar instanceof cl) {
            return 4;
        }
        if (ohVar instanceof hl) {
            return 6;
        }
        if (ohVar instanceof zk) {
            return 16;
        }
        if (ohVar instanceof xk) {
            return 17;
        }
        if (ohVar instanceof ml) {
            return 23;
        }
        if (ohVar instanceof nl) {
            return 24;
        }
        if (ohVar instanceof yk) {
            return 25;
        }
        if (ohVar instanceof jl) {
            return 26;
        }
        if (ohVar instanceof tk) {
            return 28;
        }
        if (ohVar instanceof dl) {
            return 30;
        }
        if (ohVar instanceof uk) {
            return 31;
        }
        ra.OooOOO0(u7.OooO00o(new byte[]{-48, -16, -21, -59, 89, 90, -91, 53, -9, -72, -20, -47, 69, 78, -82, 124}, new byte[]{-125, -104, -124, -80, 53, 62, -53, 18}));
        return 0;
    }

    public void OooO(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.OooO0o0)) {
            map = new HashMap((Map) this.OooO0o0);
        }
        synchronized (((Map) this.OooO0o)) {
            map2 = new HashMap((Map) this.OooO0o);
        }
        for (Map.Entry entry : (java.util.Set<Map.Entry>) map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                ra.OooOO0o();
                return;
            }
        }
        for (Map.Entry entry2 : (java.util.Set<Map.Entry>) map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((yl1) entry2.getKey()).OooO0OO(new oOO00(status));
            }
        }
    }

    public void OooO0O0(y71 y71Var, qw0 qw0Var) {
        gh1 gh1Var = (gh1) this.OooO0o0;
        wt1 wt1VarOooO00o = (wt1) gh1Var.get(y71Var);
        if (wt1VarOooO00o == null) {
            wt1VarOooO00o = wt1.OooO00o();
            gh1Var.put(y71Var, wt1VarOooO00o);
        }
        wt1VarOooO00o.OooO0OO = qw0Var;
        wt1VarOooO00o.OooO00o |= 8;
    }

    public ArrayList OooO0Oo(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.OooO0o0;
        wb1 wb1VarOooO0OO = wb1.OooO0OO(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            wb1VarOooO0OO.OooO0O0(1);
        } else {
            wb1VarOooO0OO.OooO0Oo(1, str);
        }
        workDatabase_Impl.OooO0O0();
        Cursor cursorOooO0OO = aq2.OooO0OO(workDatabase_Impl, wb1VarOooO0OO);
        try {
            ArrayList arrayList = new ArrayList(cursorOooO0OO.getCount());
            while (cursorOooO0OO.moveToNext()) {
                arrayList.add(cursorOooO0OO.getString(0));
            }
            return arrayList;
        } finally {
            cursorOooO0OO.close();
            wb1VarOooO0OO.OooO0o();
        }
    }

    public void OooO0o(y71 y71Var) {
        wt1 wt1Var = (wt1) ((gh1) this.OooO0o0).get(y71Var);
        if (wt1Var == null) {
            return;
        }
        wt1Var.OooO00o &= -2;
    }

    public qw0 OooO0o0(y71 y71Var, int i) {
        wt1 wt1Var;
        qw0 qw0Var;
        gh1 gh1Var = (gh1) this.OooO0o0;
        int iOooO0Oo = gh1Var.OooO0Oo(y71Var);
        if (iOooO0Oo >= 0 && (wt1Var = (wt1) gh1Var.OooOO0(iOooO0Oo)) != null) {
            int i2 = wt1Var.OooO00o;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                wt1Var.OooO00o = i3;
                if (i == 4) {
                    qw0Var = wt1Var.OooO0O0;
                } else if (i == 8) {
                    qw0Var = wt1Var.OooO0OO;
                } else {
                    ra.OooOOO("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    gh1Var.OooO0oo(iOooO0Oo);
                    wt1Var.OooO00o = 0;
                    wt1Var.OooO0O0 = null;
                    wt1Var.OooO0OO = null;
                    wt1.OooO0Oo.OooO0O0(wt1Var);
                }
                return qw0Var;
            }
        }
        return null;
    }

    public void OooO0oO(y71 y71Var) {
        gp0 gp0Var = (gp0) this.OooO0o;
        int iOooO0o0 = gp0Var.OooO0o0() - 1;
        while (true) {
            if (iOooO0o0 < 0) {
                break;
            }
            if (y71Var == gp0Var.OooO0o(iOooO0o0)) {
                Object[] objArr = gp0Var.OooO0o;
                Object obj = objArr[iOooO0o0];
                Object obj2 = o62.OooO00o;
                if (obj != obj2) {
                    objArr[iOooO0o0] = obj2;
                    gp0Var.OooO0Oo = true;
                }
            } else {
                iOooO0o0--;
            }
        }
        wt1 wt1Var = (wt1) ((gh1) this.OooO0o0).remove(y71Var);
        if (wt1Var != null) {
            wt1Var.OooO00o = 0;
            wt1Var.OooO0O0 = null;
            wt1Var.OooO0OO = null;
            wt1.OooO0Oo.OooO0O0(wt1Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void OooO0oo(com.cmaster.cloner.tk r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.vr1.OooO0oo(com.cmaster.cloner.tk, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.ArrayList] */
    public o0O00000 OooOO0(Activity activity, oOO0OO ooo0oo) throws PackageManager.NameNotFoundException, hm2 {
        Bundle bundle;
        String string;
        Collection collection;
        PackageInfo packageInfo;
        Application application = (Application) this.OooO0o0;
        boolean z = false;
        boolean z2 = o73.OooO00o() || new ArrayList().contains(rc2.OooO00o(application.getApplicationContext()));
        o0O00000 o0o00000 = new o0O00000();
        o0o00000.OooO0oo = Collections.EMPTY_MAP;
        o0o00000.OooOO0o = Collections.EMPTY_LIST;
        if (TextUtils.isEmpty(null)) {
            try {
                bundle = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            string = bundle != null ? bundle.getString("com.google.android.gms.ads.APPLICATION_ID") : null;
            if (TextUtils.isEmpty(string)) {
                throw new hm2(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        } else {
            string = null;
        }
        o0o00000.OooO0Oo = string;
        if (z2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ub2.OooO0Oo);
            collection = arrayList;
        } else {
            collection = Collections.EMPTY_LIST;
        }
        o0o00000.OooOO0o = collection;
        o0o00000.OooO0oo = ((s52) this.OooO0o).OooO00o();
        o0o00000.OooO0oO = Boolean.FALSE;
        o0o00000.OooO0o = Locale.getDefault().toLanguageTag();
        o00Oo00 o00oo00 = new o00Oo00(8);
        o00oo00.OooO0o0 = 1;
        int i = Build.VERSION.SDK_INT;
        o00oo00.OooO0oO = Integer.valueOf(i);
        o00oo00.OooO0o = Build.MODEL;
        o00oo00.OooO0o0 = 2;
        o0o00000.OooO0o0 = o00oo00;
        Configuration configuration = application.getResources().getConfiguration();
        application.getResources().getConfiguration();
        ho1 ho1Var = new ho1(26, z);
        Object arrayList2 = Collections.EMPTY_LIST;
        ho1Var.OooO0oo = arrayList2;
        ho1Var.OooO0o0 = Integer.valueOf(configuration.screenWidthDp);
        ho1Var.OooO0o = Integer.valueOf(configuration.screenHeightDp);
        ho1Var.OooO0oO = Double.valueOf(application.getResources().getDisplayMetrics().density);
        if (i >= 28) {
            Window window = activity == null ? null : activity.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
            if (displayCutout != null) {
                displayCutout.getSafeInsetBottom();
                arrayList2 = new ArrayList();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    if (rect != null) {
                        zb2 zb2Var = new zb2();
                        zb2Var.OooO0O0 = Integer.valueOf(rect.left);
                        zb2Var.OooO0OO = Integer.valueOf(rect.right);
                        zb2Var.OooO00o = Integer.valueOf(rect.top);
                        zb2Var.OooO0Oo = Integer.valueOf(rect.bottom);
                        arrayList2.add(zb2Var);
                    }
                }
            }
        }
        ho1Var.OooO0oo = arrayList2;
        o0o00000.OooO = ho1Var;
        try {
            packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        a02 a02Var = new a02(27, z);
        a02Var.OooO0o = application.getPackageName();
        CharSequence applicationLabel = application.getPackageManager().getApplicationLabel(application.getApplicationInfo());
        a02Var.OooO0o0 = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            a02Var.OooO0oO = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        }
        o0o00000.OooOO0 = a02Var;
        o0o00000.OooOO0O = new gu0(16);
        return o0o00000;
    }

    public String toString() {
        switch (this.OooO0Oo) {
            case 2:
                return "Bounds{lower=" + ((zg0) this.OooO0o0) + " upper=" + ((zg0) this.OooO0o) + "}";
            default:
                return super.toString();
        }
    }

    @Override // com.cmaster.cloner.lg2
    public Object zza() {
        switch (this.OooO0Oo) {
            case 7:
                qa2 qa2Var = (qa2) ((zf2) this.OooO0o0).zza();
                Handler handler = kd2.OooO00o;
                u73.OooO00o(handler);
                return new ha2(qa2Var, handler, ((oO0Ooooo) this.OooO0o).OooOO0());
            default:
                return new ix2((Application) ((uf) this.OooO0o0).OooO0Oo, (d52) ((zf2) this.OooO0o).zza());
        }
    }

    public /* synthetic */ vr1(Object obj, Object obj2, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
        this.OooO0o = obj2;
    }

    public vr1(Context context) {
        this.OooO0Oo = 12;
        this.OooO0o = new AtomicLong(-1L);
        this.OooO0o0 = new s22(context, s22.OooOO0o, new hm1("mlkit:vision"), a60.OooO0O0);
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public void zza(zzaqm zzaqmVar) {
        String str = "Failed to load URL: " + ((String) this.OooO0o0) + "\n" + zzaqmVar.toString();
        int i = uh2.OooO0O0;
        uh2.OooOO0(str);
        ((r82) this.OooO0o).zzc(null);
    }

    public vr1(g92 g92Var, String str, r82 r82Var) {
        this.OooO0Oo = 6;
        this.OooO0o0 = str;
        this.OooO0o = r82Var;
    }

    public vr1(WorkDatabase_Impl workDatabase_Impl) {
        this.OooO0Oo = 3;
        this.OooO0o0 = workDatabase_Impl;
        this.OooO0o = new sp(workDatabase_Impl, 6);
    }

    public vr1(u91 u91Var, AlertDialog alertDialog) {
        this.OooO0Oo = 5;
        this.OooO0o = u91Var;
        this.OooO0o0 = alertDialog;
    }

    public vr1(nq nqVar, q9 q9Var) {
        this.OooO0Oo = 0;
        if (nqVar != null) {
            this.OooO0o0 = nqVar;
            this.OooO0o = q9Var;
        } else {
            qa.OooOOO0(u7.OooO00o(new byte[]{-125, 101, 70, 85, 60, 81, 30, -14, -117, 121, 70, 92}, new byte[]{-27, 12, 42, 48, 28, 108, 35, -46}));
            throw null;
        }
    }
}
