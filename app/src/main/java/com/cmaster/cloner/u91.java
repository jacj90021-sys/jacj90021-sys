package com.cmaster.cloner;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.work.Worker;
import com.google.android.gms.internal.ads.zzbac;
import com.google.android.gms.internal.ads.zzbcj;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbmk;
import com.google.android.gms.internal.ads.zzbxc;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class u91 implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final Object OooO0o0;

    public u91(o12 o12Var, oOo000Oo ooo000oo) {
        this.OooO0Oo = 18;
        this.OooO0o0 = ooo000oo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Cursor cursorRawQuery;
        yo yoVar;
        int i = 3;
        int i2 = 0;
        int i3 = 8;
        switch (this.OooO0Oo) {
            case 0:
                x91 x91Var = (x91) this.OooO0o0;
                x91Var.OooO0o.OooO0O0(x91Var);
                return;
            case 1:
                ((hf1) this.OooO0o0).o0000o0O(e92.OooO00o);
                ka kaVarOooO0O0 = ka.OooO0O0();
                String strOooO00o = u7.OooO00o(new byte[]{114, 124, -1, 71}, new byte[]{55, 46, -81, 5, -101, 103, 124, 23});
                kaVarOooO0O0.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt(u7.OooO00o(new byte[]{60, 29, -57}, new byte[]{95, 112, -93, -68, -114, -98, 97, 42}), 6);
                bundle.putString(u7.OooO00o(new byte[]{-124, -98, -110, 63, 124, -92, -91, 81, -94, -83, -89, 10, 88, -43, -69, 81, -84, -93}, new byte[]{-31, -26, -26, 77, 29, -118, -11, 16}), strOooO00o);
                bundle.putBundle(u7.OooO00o(new byte[]{-45, 60, 77, -22, 127, 99}, new byte[]{-74, 68, 57, -104, 30, 16, 32, 118}), null);
                ka.OooO00o(bundle, u7.OooO00o(new byte[]{30, -74, 99, 2}, new byte[]{112, -41, 14, 103, -49, -40, -40, 47}));
                return;
            case 2:
                ((StaggeredGridLayoutManager) this.OooO0o0).o000000O();
                return;
            case 3:
                iv1 iv1Var = (iv1) this.OooO0o0;
                if (iv1Var.OooO0o0) {
                    return;
                }
                LinkedHashMap linkedHashMap = iv1Var.OooO0OO;
                try {
                    cursorRawQuery = iv1Var.OooO00o.getWritableDatabase().rawQuery("select * from items ".concat(";"), new String[0]);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    cursorRawQuery.moveToFirst();
                    while (!cursorRawQuery.isAfterLast()) {
                        int columnIndex = cursorRawQuery.getColumnIndex("_module");
                        if (columnIndex != -1) {
                            String string = cursorRawQuery.getString(columnIndex);
                            int columnIndex2 = cursorRawQuery.getColumnIndex("_key");
                            if (columnIndex2 != -1) {
                                String string2 = cursorRawQuery.getString(columnIndex2);
                                int columnIndex3 = cursorRawQuery.getColumnIndex("_value");
                                if (columnIndex3 != -1) {
                                    byte[] blob = cursorRawQuery.getBlob(columnIndex3);
                                    try {
                                        Map linkedHashMap2 = (Map) linkedHashMap.get(string);
                                        if (linkedHashMap2 == null) {
                                            linkedHashMap2 = new LinkedHashMap();
                                            linkedHashMap.put(string, linkedHashMap2);
                                        }
                                        linkedHashMap2.put(string2, iv1Var.OooO00o(string2, blob));
                                    } catch (Throwable th) {
                                        th.printStackTrace();
                                    }
                                }
                            }
                        }
                        cursorRawQuery.moveToNext();
                    }
                    cursorRawQuery.close();
                    iv1Var.OooO0o0 = true;
                    Map map = (Map) iv1Var.OooO0OO.get(sn2.OooO00o("Z1+ik2M=\n", "RDbM9Qz9mBo=\n"));
                    if (map != null) {
                        ArrayList arrayList = new ArrayList(map.values());
                        int size = arrayList.size();
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            qj0 qj0Var = (qj0) obj;
                            qj0Var.getClass();
                            String str = qj0Var.OooO0O0;
                            String str2 = qj0Var.OooO00o;
                            if (!sn2.OooO00o("Z8DzcE8=\n", "RKOSAiskCSU=\n").equals(str2)) {
                                if (TextUtils.isEmpty(str)) {
                                    iv1Var.OooO0O0(sn2.OooO00o("z8e63bY=\n", "7K7Uu9n8tJM=\n"), str2);
                                } else if (qj0Var.OooO0O0() == 2) {
                                    try {
                                        a02.OooO0oo.OoooOO0(qj0Var.OooO0OO, str);
                                    } catch (Exception unused) {
                                    }
                                    iv1Var.OooO0O0(sn2.OooO00o("McmF8yY=\n", "EqDrlUl2OLM=\n"), str2);
                                }
                            }
                        }
                    }
                    iv1Var.OooO0O0.open();
                    return;
                } finally {
                }
            case 4:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.OooO0o0).OooO0o.OooOO0;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 5:
                ((Toolbar) this.OooO0o0).OooOo0();
                return;
            case 6:
                sn1 sn1Var = (sn1) this.OooO0o0;
                Window.Callback callback = sn1Var.OooO0O0;
                Menu menuOooOOo = sn1Var.OooOOo();
                ss0 ss0Var = menuOooOOo instanceof ss0 ? (ss0) menuOooOOo : null;
                if (ss0Var != null) {
                    ss0Var.OooOo0o();
                }
                try {
                    menuOooOOo.clear();
                    if (!callback.onCreatePanelMenu(0, menuOooOOo) || !callback.onPreparePanel(0, null, menuOooOOo)) {
                        menuOooOOo.clear();
                    }
                    if (ss0Var != null) {
                        ss0Var.OooOo0O();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (ss0Var != null) {
                        ss0Var.OooOo0O();
                    }
                    throw th2;
                }
            case 7:
                synchronized (this) {
                    ((rt1) this.OooO0o0).OooO0o = false;
                }
                while (true) {
                    Reference referencePoll = rt1.OooOOOO.poll();
                    if (referencePoll == null) {
                        boolean zIsAttachedToWindow = ((rt1) this.OooO0o0).OooO0oo.isAttachedToWindow();
                        rt1 rt1Var = (rt1) this.OooO0o0;
                        if (!zIsAttachedToWindow) {
                            View view = rt1Var.OooO0oo;
                            pt1 pt1Var = rt1.OooOOOo;
                            view.removeOnAttachStateChangeListener(pt1Var);
                            ((rt1) this.OooO0o0).OooO0oo.addOnAttachStateChangeListener(pt1Var);
                            return;
                        }
                        if (rt1Var.OooO) {
                            rt1Var.OooO();
                            return;
                        } else {
                            if (rt1Var.OooO0o0()) {
                                rt1Var.OooO = true;
                                rt1Var.OooO0Oo();
                                rt1Var.OooO = false;
                                return;
                            }
                            return;
                        }
                    }
                    if (referencePoll instanceof yx1) {
                        ((yx1) referencePoll).OooO00o();
                    }
                }
            case 8:
                ((st1) this.OooO0o0).OooOOO(0);
                return;
            case 9:
                wu1 wu1Var = (wu1) ((a02) this.OooO0o0).OooO0oO;
                k63.OooO0O0(2, wu1Var.OooOOO, null, null, wu1Var.OooO0o0);
                return;
            case 10:
                zu1 zu1Var = (zu1) this.OooO0o0;
                while (i2 < zu1Var.OooO0o0.getValue()) {
                    zu1Var.OooO0Oo.OoooOoo(-10000, zu1Var.OooO0o.OooO0o0);
                    i2++;
                }
                return;
            case 11:
                gv1 gv1Var = (gv1) this.OooO0o0;
                fv1 fv1Var = gv1Var.OooO0o0;
                PackageInfo packageInfoOooO00o = k63.OooO00o(0, fv1Var.OooOo, fv1Var.OooOo0o);
                if (packageInfoOooO00o == null || (yoVar = gv1Var.OooO0Oo) == null) {
                    return;
                }
                ((ConstraintLayout) yoVar.OooO0Oo).post(new bf1(this, packageInfoOooO00o, i));
                return;
            case 12:
                ox1 ox1Var = (ox1) this.OooO0o0;
                ((f21) ox1Var.OooOO0O.OooO0o).OooO0O0();
                g gVar = new g(ox1Var);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(u7.OooO00o(new byte[]{87, 23, 119, 20, 80, -59, -99, -42, 95, 23, 103, 3, 81, -40, -41, -103, 85, 13, 122, 9, 81, -126, -87, -71, 117, 50, 82, 33, 122, -13, -85, -67, 102, 53, 82, 37, 122, -24}, new byte[]{54, 121, 19, 102, 63, -84, -7, -8}));
                intentFilter.addAction(u7.OooO00o(new byte[]{1, 60, 22, -123, -75, -55, -92, 80, 9, 60, 6, -110, -76, -44, -18, 31, 3, 38, 27, -104, -76, -114, -112, 63, 35, 25, 51, -80, -97, -1, -110, 59, 45, 29, 36, -78, -98}, new byte[]{96, 82, 114, -9, -38, -96, -64, 126}));
                intentFilter.addDataScheme(u7.OooO00o(new byte[]{-94, -25, -65, 0, 12, -94, -115}, new byte[]{-46, -122, -36, 107, 109, -59, -24, 57}));
                if (yn2.OooO0oo()) {
                    e92.OooO00o.registerReceiver(gVar, intentFilter, 2);
                } else {
                    e92.OooO00o.registerReceiver(gVar, intentFilter);
                }
                p80 p80Var = p80.OooO0OO;
                p80Var.getClass();
                PackageManager packageManager = p80Var.OooO00o;
                PackageInfo packageInfoOooO0O0 = w01.OooO0O0(packageManager, u7.OooO00o(new byte[]{85, 17, 97, -77, 23, -60, -83, 64, 90, 27, 34, -4, 30, -49, -80, 72, 95, 26, 34, -19, 17, -56, -87, 70, 81, 27, 101, -13, 3, -33, -93, 75, 90, 27, 126}, new byte[]{54, 126, 12, -99, 112, -85, -62, 39}), 0);
                if (packageInfoOooO0O0 == null) {
                    packageInfoOooO0O0 = w01.OooO0O0(packageManager, u7.OooO00o(new byte[]{-124, -29, 57, -68, 61, 33, 50, 5, -120, -27, 48, -68, 44, 46, 53, 28, -122, -21, 49, -5, 50, 60, 34, 22, -117, -32, 49, -32}, new byte[]{-25, -116, 84, -110, 92, 79, 86, 119}), 0);
                }
                ox1Var.OooOOo0 = packageInfoOooO0O0 != null ? packageInfoOooO0O0.packageName : null;
                HashSet hashSet = ox1Var.OooOOoo;
                hashSet.clear();
                PackageInfo packageInfoOooO0O02 = w01.OooO0O0(packageManager, ox1Var.OooO0o.getPackageName(), 4096);
                if (packageInfoOooO0O02 != null && !fn2.OooO0o0(packageInfoOooO0O02.requestedPermissions)) {
                    String[] strArr = packageInfoOooO0O02.requestedPermissions;
                    int length = strArr.length;
                    while (i2 < length) {
                        hashSet.add(strArr[i2]);
                        i2++;
                    }
                }
                b4 b4Var = b4.OooO0Oo;
                if (b4Var.OooO0OO == null) {
                    b4Var.OooO0OO = new a4();
                }
                ox1Var.OooOOO.open();
                return;
            case 13:
                ho1 ho1Var = (ho1) this.OooO0o0;
                ((qc1) ho1Var.OooO0oo).OooO(new na1(ho1Var, i3));
                return;
            case 14:
                Worker worker = (Worker) this.OooO0o0;
                try {
                    worker.OooO.OooO0oo(worker.doWork());
                    return;
                } catch (Throwable th3) {
                    worker.OooO.OooO(th3);
                    return;
                }
            case 15:
                ((s12) this.OooO0o0).OooO0o0();
                return;
            case 16:
                oOO000 ooo000 = ((s12) ((vk1) this.OooO0o0).OooO0o0).OooO0o0;
                ooo000.disconnect(ooo000.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 17:
                ((e22) this.OooO0o0).OooOO0O.OooO00o(new gh(4));
                return;
            case 18:
                throw null;
            case 19:
                e72 e72Var = (e72) this.OooO0o0;
                e72Var.zzb = Thread.currentThread();
                e72Var.zza();
                return;
            case 20:
                p32 p32Var = (p32) this.OooO0o0;
                if (p32Var.OooOO0) {
                    p32Var.OooO0o0.finish();
                    return;
                }
                return;
            case zzbcj.zzt.zzm /* 21 */:
                hm2 hm2Var = new hm2(4, "Web view timed out.");
                j72 j72Var = (j72) ((q72) this.OooO0o0).OooO.getAndSet(null);
                if (j72Var == null) {
                    return;
                }
                j72Var.OooO0O0(hm2Var.OooO00o());
                return;
            case 22:
                ((lz2) this.OooO0o0).zzc();
                return;
            case 23:
                u82 u82Var = ((uk2) this.OooO0o0).OooO0Oo.OooO0Oo;
                if (u82Var != null) {
                    try {
                        u82Var.zze(1);
                        return;
                    } catch (RemoteException e2) {
                        uh2.OooOO0O("Could not notify onAdFailedToLoad event.", e2);
                        return;
                    }
                }
                return;
            case 24:
                u82 u82Var2 = ((cl2) this.OooO0o0).OooO0Oo;
                if (u82Var2 != null) {
                    try {
                        u82Var2.zze(1);
                        return;
                    } catch (RemoteException e3) {
                        uh2.OooOO0O("Could not notify onAdFailedToLoad event.", e3);
                        return;
                    }
                }
                return;
            case 25:
                zzbmk zzbmkVar = ((hl2) this.OooO0o0).OooO0Oo;
                if (zzbmkVar != null) {
                    try {
                        zzbmkVar.zzb(Collections.EMPTY_LIST);
                        return;
                    } catch (RemoteException e4) {
                        uh2.OooOO0O("Could not notify onComplete event.", e4);
                        return;
                    }
                }
                return;
            case 26:
                zzbxc zzbxcVar = (zzbxc) this.OooO0o0;
                if (zzbxcVar != null) {
                    try {
                        zzbxcVar.zze(1);
                        return;
                    } catch (RemoteException e5) {
                        uh2.OooOO0o("#007 Could not call remote method.", e5);
                        return;
                    }
                }
                return;
            case 27:
                synchronized (((he2) this.OooO0o0).OooO0oO) {
                    ((yy0) ((he2) this.OooO0o0).OooO0o).OooO0oO();
                }
                return;
            case 28:
                ts2 ts2Var = (ts2) this.OooO0o0;
                if (ts2Var.OooO0O0) {
                    if (!(ts2Var.OooO() && ts2Var.OooOO0()) && ((Boolean) zzbev.zzb.zze()).booleanValue()) {
                        synchronized (ts2Var.OooO00o) {
                            try {
                                if (Looper.getMainLooper() == null) {
                                    return;
                                }
                                if (ts2Var.OooO0o0 == null) {
                                    ts2Var.OooO0o0 = new zzbac();
                                }
                                ts2Var.OooO0o0.zzd();
                                int i4 = uh2.OooO0O0;
                                uh2.OooO("start fetching content...");
                                return;
                            } finally {
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                Context context = (Context) ((hx2) this.OooO0o0).OooO0o0;
                long j = hx2.OooOooo(context).getLong("app_set_id_last_used_time", -1L);
                long j2 = j != -1 ? j + 33696000000L : -1L;
                if (j2 == -1 || System.currentTimeMillis() <= j2) {
                    return;
                }
                if (!hx2.OooOooo(context).edit().remove("app_set_id").commit()) {
                    String strValueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", strValueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(strValueOf) : new String("Failed to clear app set ID generated for App "));
                }
                if (context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                    return;
                }
                String strValueOf2 = String.valueOf(context.getPackageName());
                Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(strValueOf2) : new String("Failed to clear app set ID last used time for App "));
                return;
        }
    }

    public /* synthetic */ u91(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }
}
