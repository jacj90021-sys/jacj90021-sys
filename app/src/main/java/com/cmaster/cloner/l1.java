package com.cmaster.cloner;

import android.animation.ValueAnimator;
import android.app.job.JobParameters;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import com.google.android.gms.internal.ads.zzbcj;
import com.google.android.gms.internal.ads.zzbuh;
import com.google.android.gms.internal.ads.zzcfg;
import com.google.android.gms.internal.ads.zzdso;
import com.google.android.material.appbar.AppBarLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class l1 implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public Object OooO0o;
    public Object OooO0o0;
    public Object OooO0oO;

    public /* synthetic */ l1(c03 c03Var, er1 er1Var, String str) {
        this.OooO0Oo = 21;
        this.OooO0o0 = c03Var;
        this.OooO0o = er1Var;
        this.OooO0oO = str;
    }

    private final void OooO00o() {
        i12 i12Var = (i12) this.OooO0oO;
        Context context = (Context) this.OooO0o0;
        Uri uri = (Uri) this.OooO0o;
        File file = new File(context.getCacheDir(), "backup.zip");
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            file.getParentFile().mkdirs();
            file.delete();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ct2.OooO0O0(inputStreamOpenInputStream, fileOutputStream);
            fileOutputStream.close();
            i12Var.OooOOO0(file);
        } catch (IOException e) {
            i12Var.OooOO0(wa1.OooO0OO(e));
        } finally {
            file.delete();
        }
    }

    private final void OooO0O0() {
        rl1 rl1Var = (rl1) this.OooO0o0;
        Bundle bundle = (Bundle) this.OooO0o;
        ea2 ea2Var = (ea2) this.OooO0oO;
        p93 p93Var = ya3.OooOooO.OooO0o;
        Context context = rl1Var.OooO00o;
        CookieManager cookieManagerOooO0oo = p93Var.OooO0oo();
        bundle.putBoolean("accept_3p_cookie", cookieManagerOooO0oo != null ? cookieManagerOooO0oo.acceptThirdPartyCookies(rl1Var.OooO0O0) : false);
        a61.OooO00o(context, new oO000((oO0000o0) new oO0000o0(0).OooO0O0(bundle)), ea2Var);
    }

    private final void OooO0OO() {
        JSONObject jSONObject;
        String str = (String) this.OooO0o0;
        if (TextUtils.isEmpty(str)) {
            Log.d("UserMessagingPlatform", "Error on action: empty action name");
            return;
        }
        String str2 = (String) this.OooO0o;
        String lowerCase = str.toLowerCase();
        if (TextUtils.isEmpty(str2)) {
            jSONObject = new JSONObject();
        } else {
            try {
                jSONObject = new JSONObject(str2);
            } catch (JSONException unused) {
                Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: failed to parse args: " + str2);
                return;
            }
        }
        ge2[] ge2VarArr = (ge2[]) this.OooO0oO;
        Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: " + jSONObject.toString());
        for (ge2 ge2Var : ge2VarArr) {
            FutureTask futureTask = new FutureTask(new j42(ge2Var, lowerCase, jSONObject, 2));
            ge2Var.zza().execute(futureTask);
            try {
            } catch (InterruptedException e) {
                Log.d("UserMessagingPlatform", "Thread interrupted for Action[" + lowerCase + "]: ", e);
            } catch (ExecutionException e2) {
                Log.d("UserMessagingPlatform", px0.OooOOOO("Failed to run Action[", lowerCase, "]: "), e2.getCause());
            }
            if (((Boolean) futureTask.get()).booleanValue()) {
                return;
            }
        }
    }

    private final void OooO0Oo() {
        k23 k23Var = (k23) this.OooO0o0;
        Object obj = this.OooO0o;
        Pair pair = (Pair) this.OooO0oO;
        boolean zAcceptThirdPartyCookies = false;
        if (obj instanceof WebView) {
            Context context = k23Var.OooO0OO;
            CookieManager cookieManagerOooO0oo = ya3.OooOooO.OooO0o.OooO0oo();
            if (cookieManagerOooO0oo != null) {
                zAcceptThirdPartyCookies = cookieManagerOooO0oo.acceptThirdPartyCookies((WebView) obj);
            }
        }
        HashMap map = k23Var.OooO00o;
        Boolean boolValueOf = Boolean.valueOf(zAcceptThirdPartyCookies);
        z43 z43Var = (z43) map.get(boolValueOf);
        if (z43Var != null) {
            ya3.OooOooO.OooOO0O.getClass();
            if (z43Var.OooO0OO > System.currentTimeMillis()) {
                k23Var.OooO0Oo(z43Var, pair, true);
                return;
            }
        }
        HashMap map2 = k23Var.OooO0O0;
        List arrayList = (List) map2.get(boolValueOf);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map2.put(boolValueOf, arrayList);
        }
        arrayList.add(pair);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void OooO0o() {
        k42 k42Var = (k42) this.OooO0o0;
        a02 a02Var = (a02) this.OooO0o;
        aa aaVar = (aa) this.OooO0oO;
        Object[] objArr = 0;
        ((Handler) k42Var.OooO0o0).post(new l83(a02Var, 0));
        if (aaVar.OooO0o0 != 2) {
            h92 h92Var = (h92) k42Var.OooO0oo;
            o92 o92Var = (o92) h92Var.OooO0OO.get();
            if (o92Var == null) {
                Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
                return;
            }
            k42 k42Var2 = (k42) ((na1) h92Var.OooO00o.zza()).OooO0o0;
            zf2 zf2VarOooO00o = zf2.OooO00o(new na1((uf) k42Var2.OooO0o0, 14));
            uf ufVar = new uf(o92Var);
            na1 na1Var = new na1(15);
            uf ufVar2 = (uf) k42Var2.OooO0o0;
            zf2 zf2Var = (zf2) k42Var2.OooO;
            n52 n52Var = (n52) k42Var2.OooOO0O;
            zf2 zf2Var2 = (zf2) k42Var2.OooO0o;
            zf2 zf2VarOooO00o2 = zf2.OooO00o(new oO0Ooooo(ufVar2, (zf2) k42Var2.OooO0oO, zf2VarOooO00o, zf2Var2, ufVar, new vr1(zf2VarOooO00o, new oO0Ooooo(ufVar2, zf2VarOooO00o, zf2Var, n52Var, na1Var, zf2Var2, 8), 7), 7));
            if (((zf2) na1Var.OooO0o0) != null) {
                ra.OooO0O0();
                return;
            }
            na1Var.OooO0o0 = zf2VarOooO00o2;
            q72 q72Var = (q72) na1Var.zza();
            q72Var.OooOO0o = true;
            kd2.OooO00o.post(new bf1(h92Var, q72Var, 11, objArr == true ? 1 : 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void OooO0o0() {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.l1.OooO0o0():void");
    }

    private final void OooO0oO() {
        u12 u12Var = (u12) this.OooO0o0;
        String str = (String) this.OooO0o;
        HashMap map = (HashMap) this.OooO0oO;
        zzcfg zzcfgVar = (zzcfg) u12Var.OooO0oO;
        if (zzcfgVar != null) {
            zzcfgVar.zzd(str, map);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable th;
        FileOutputStream fileOutputStream;
        Bitmap bitmap;
        OverScroller overScroller;
        int i = 26;
        String canonicalPath = null;
        Object objCall = null;
        iBinderAsBinder = null;
        iBinderAsBinder = null;
        iBinderAsBinder = null;
        iBinderAsBinder = null;
        IBinder iBinderAsBinder = null;
        FileInputStream fileInputStream = null;
        canonicalPath = null;
        boolean zBooleanValue = true;
        Object[] objArr = 0;
        switch (this.OooO0Oo) {
            case 0:
                int i2 = 5;
                try {
                    ((Runnable) this.OooO0o0).run();
                    return;
                } finally {
                    h1.OooO0O0.execute(new o00OOO00(this, i2));
                }
            case 1:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.OooO0oO;
                Context context = (Context) this.OooO0o;
                Intent intent = (Intent) this.OooO0o0;
                try {
                    boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    ep0.OooO0oO().OooO0Oo(ConstraintProxyUpdateReceiver.OooO00o, "Updating proxies: BatteryNotLowProxy enabled (" + booleanExtra + "), BatteryChargingProxy enabled (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy enabled (" + booleanExtra4 + ")", new Throwable[0]);
                    v01.OooO00o(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    v01.OooO00o(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    v01.OooO00o(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    v01.OooO00o(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 2:
                Executor executor = y52.OooO0O0;
                sl slVar = (sl) this.OooO0oO;
                try {
                    boolean z = slVar.OooOo0O;
                    wu1 wu1Var = slVar.OooOo0o;
                    m1 m1Var = slVar.OooOo00;
                    Object obj = slVar.OooOoO0;
                    if (z) {
                        if (obj instanceof Bitmap) {
                            bitmap = (Bitmap) obj;
                        } else {
                            zx2.OooO0OO(m1Var, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
                            x91 x91VarOooO0Oo = com.bumptech.glide.OooO00o.OooO00o(m1Var).OooO0oo.OooO0Oo(m1Var);
                            x91VarOooO0Oo.getClass();
                            p91 p91VarOooOoO = new p91(x91VarOooO0Oo.OooO0Oo, x91VarOooO0Oo, File.class, x91VarOooO0Oo.OooO0o0).OooO00o(x91.OooOOOO).OooOoO(obj);
                            p91VarOooOoO.getClass();
                            t91 t91Var = new t91(Integer.MIN_VALUE, Integer.MIN_VALUE);
                            p91VarOooOoO.OooOoO0(t91Var, t91Var, p91VarOooOoO, executor);
                            File file = (File) t91Var.get();
                            zx2.OooO0OO(m1Var, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
                            x91 x91VarOooO0Oo2 = com.bumptech.glide.OooO00o.OooO00o(m1Var).OooO0oo.OooO0Oo(m1Var);
                            x91VarOooO0Oo2.getClass();
                            p91 p91VarOooOoO2 = new p91(x91VarOooO0Oo2.OooO0Oo, x91VarOooO0Oo2, Bitmap.class, x91VarOooO0Oo2.OooO0o0).OooO00o(x91.OooOOO).OooOoO(file);
                            p91VarOooOoO2.getClass();
                            t91 t91Var2 = new t91(256, 256);
                            p91VarOooOoO2.OooOoO0(t91Var2, t91Var2, p91VarOooOoO2, executor);
                            bitmap = (Bitmap) t91Var2.get();
                        }
                        hz.OooO00o(m1Var, ((PackageInfo) this.OooO0o0).packageName, (String) slVar.OooOo0.OooO0o0, bitmap, wu1Var.OooOOO);
                        return;
                    }
                    if (!Objects.equals(obj, wu1Var.OooO0Oo()) && obj != null) {
                        zx2.OooO0OO(m1Var, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
                        x91 x91VarOooO0Oo3 = com.bumptech.glide.OooO00o.OooO00o(m1Var).OooO0oo.OooO0Oo(m1Var);
                        x91VarOooO0Oo3.getClass();
                        p91 p91VarOooOoO3 = new p91(x91VarOooO0Oo3.OooO0Oo, x91VarOooO0Oo3, File.class, x91VarOooO0Oo3.OooO0o0).OooO00o(x91.OooOOOO).OooOoO(obj);
                        p91VarOooOoO3.getClass();
                        t91 t91Var3 = new t91(Integer.MIN_VALUE, Integer.MIN_VALUE);
                        p91VarOooOoO3.OooOoO0(t91Var3, t91Var3, p91VarOooOoO3, executor);
                        File file2 = (File) t91Var3.get();
                        if (!file2.exists()) {
                            e2.OooO0Oo(sn2.OooO00o("AAiBTBhYyCI7FoULOArqLDs=\n", "SWXgK314mEM=\n"));
                        }
                        File file3 = new File(new File(m1Var.getFilesDir(), sn2.OooO00o("t5wYikl4DqaolgWQTw==\n", "wfVq/jwZYok=\n")), UUID.randomUUID().toString());
                        file3.getParentFile().mkdirs();
                        try {
                            FileInputStream fileInputStream2 = new FileInputStream(file2);
                            try {
                                fileOutputStream = new FileOutputStream(file3);
                                try {
                                    byte[] bArr = new byte[4096];
                                    while (true) {
                                        int i3 = fileInputStream2.read(bArr);
                                        if (i3 != -1) {
                                            fileOutputStream.write(bArr, 0, i3);
                                        } else {
                                            try {
                                                fileInputStream2.close();
                                            } catch (IOException unused) {
                                            }
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException unused2) {
                                            }
                                            if (!file3.exists()) {
                                                e2.OooO0Oo(sn2.OooO00o("FiYK4Bcb8b8tOA6nN0nTsS0=\n", "X0trh3I7od4=\n"));
                                            }
                                            canonicalPath = file3.getCanonicalPath();
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileInputStream = fileInputStream2;
                                    if (fileInputStream != null) {
                                        try {
                                            fileInputStream.close();
                                        } catch (IOException unused3) {
                                        }
                                    }
                                    if (fileOutputStream == null) {
                                        throw th;
                                    }
                                    try {
                                        fileOutputStream.close();
                                        throw th;
                                    } catch (IOException unused4) {
                                        throw th;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                fileOutputStream = null;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            fileOutputStream = null;
                        }
                    }
                    h1.OooO0O0.execute(new pi2((Object) this, (Object) canonicalPath, 15, (boolean) (objArr == true ? 1 : 0)));
                    return;
                } catch (Throwable unused5) {
                    return;
                }
            case 3:
                xo xoVar = (xo) this.OooO0o0;
                g5 g5Var = (g5) this.OooO0o;
                String str = g5Var.OooO00o;
                x4 x4Var = (x4) this.OooO0oO;
                Logger logger = xo.OooO0o;
                try {
                    gp1 gp1VarOooO00o = xoVar.OooO0OO.OooO00o(str);
                    if (gp1VarOooO00o == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        xoVar.OooO0o0.OooO(new hx2(xoVar, g5Var, ((bc) gp1VarOooO00o).OooO00o(x4Var), 7));
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    return;
                }
            case 4:
                mx mxVar = (mx) this.OooO0oO;
                lx lxVar = (lx) this.OooO0o0;
                JobParameters jobParameters = (JobParameters) this.OooO0o;
                ix1 ix1Var = (ix1) mxVar;
                ix1Var.getClass();
                Intent intent2 = new Intent();
                intent2.setComponent(lxVar.OooO.OooO0o.getService());
                hx1 hx1VarO0000o0O = hx1.o0000o0O();
                int i4 = lxVar.OooO.OooO0OO;
                hx1VarO0000o0O.getClass();
                ResolveInfo resolveInfoO000OoOo = ox1.o0O0ooO().o000OoOo(null, intent2, null, 0, i4);
                ServiceInfo serviceInfo = resolveInfoO000OoOo != null ? resolveInfoO000OoOo.serviceInfo : null;
                if (serviceInfo == null) {
                    u7.OooO00o(new byte[]{-74, -95, -96, -10, -112, -42, 4, 30, -116, -17, -93, -3, -110, -41, 4, 0, -116, -83, -31, -25, -103, -63, 82, 3, -128, -86, -31}, new byte[]{-29, -49, -63, -108, -4, -77, 36, 106});
                    Objects.toString(intent2);
                    u7.OooO00o(new byte[]{8, -5, -31}, new byte[]{40, -82, -36, 3, 16, -77, -94, -121});
                    u7.OooO00o(new byte[]{0, -113, 20, -69, -106, 75, 54, -13, 79, -63, 30}, new byte[]{58, -81, 122, -44, -30, 107, 80, -100});
                    int i5 = fp0.OooO00o;
                } else {
                    b51 b51VarOooO0oo = oO00OOo0.OooO0Oo().OooO0oo(i4, serviceInfo.applicationInfo.packageName, serviceInfo.processName);
                    if (b51VarOooO0oo == null || b51VarOooO0oo.OooOOoo.OooOO0O == null) {
                        u7.OooO00o(new byte[]{52, 80, 31, 18, 82, 94, -74, 33, 14, 30, 18, 17, 75, 85, -11, 61, 65, 95, 14, 0, 30}, new byte[]{97, 62, 126, 112, 62, 59, -106, 85});
                        String str3 = serviceInfo.applicationInfo.packageName;
                        u7.OooO00o(new byte[]{-16}, new byte[]{-33, 62, -14, 34, -98, -122, 5, -58});
                        int i6 = serviceInfo.applicationInfo.uid;
                        u7.OooO00o(new byte[]{101, 99, 101, -104, 103, -91, 89, 112, 101, 118, 111, -104, 49, -90, 85, 119, 101}, new byte[]{69, 5, 10, -22, 71, -49, 54, 18});
                        Objects.toString(intent2);
                        u7.OooO00o(new byte[]{-59, 0, 122, -84, 58, 102, 30, 13, -116, 0, 99, -83, 117, 103, 26, 26}, new byte[]{-1, 32, 10, -34, 85, 5, 123, 126});
                        int i7 = fp0.OooO00o;
                    } else {
                        try {
                            w90 w90Var = b51VarOooO0oo.OooOOoo.OooOO0O;
                            if (w90Var != null && w90Var.o000O000(intent2, lxVar, i4)) {
                                iBinderAsBinder = w90Var.asBinder();
                            }
                        } catch (Exception unused6) {
                        }
                    }
                }
                if (iBinderAsBinder == null) {
                    ix1Var.OooO00o(jobParameters, true);
                    return;
                } else {
                    lxVar.OooO0oo = iBinderAsBinder;
                    return;
                }
            case 5:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.OooO0o0;
                k70 k70Var = (k70) this.OooO0oO;
                View view = (View) this.OooO0o;
                if (view == null || (overScroller = k70Var.OooO0Oo) == null) {
                    return;
                }
                if (overScroller.computeScrollOffset()) {
                    k70Var.OooOoOO(coordinatorLayout, view, k70Var.OooO0Oo.getCurrY());
                    view.postOnAnimation(this);
                    return;
                }
                AppBarLayout appBarLayout = (AppBarLayout) view;
                ((AppBarLayout.BaseBehavior) k70Var).Oooo00O(coordinatorLayout, appBarLayout);
                if (appBarLayout.OooOOO) {
                    appBarLayout.OooO0o0(appBarLayout.OooO0o(AppBarLayout.BaseBehavior.OooOooO(coordinatorLayout)));
                    return;
                }
                return;
            case 6:
                try {
                    zBooleanValue = ((Boolean) ((uf1) this.OooO0oO).get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused7) {
                }
                ((g51) this.OooO0o0).OooO0O0((String) this.OooO0o, zBooleanValue);
                return;
            case 7:
                try {
                    objCall = ((u00) this.OooO0o0).call();
                } catch (Exception unused8) {
                }
                ((Handler) this.OooO0oO).post(new pi2((v00) this.OooO0o, objCall, i));
                return;
            case 8:
                ((q02) this.OooO0o0).OooO0o.OooO0oO((String) this.OooO0o, (a02) this.OooO0oO);
                return;
            case 9:
                ((yi1) this.OooO0oO).onReceive((Context) this.OooO0o0, (Intent) this.OooO0o);
                return;
            case 10:
                SQLiteDatabase writableDatabase = ((iv1) this.OooO0oO).OooO00o.getWritableDatabase();
                writableDatabase.beginTransaction();
                String str4 = (String) this.OooO0o0;
                if (str4 == null) {
                    str4 = "#";
                }
                String str5 = (String) this.OooO0o;
                writableDatabase.delete("items", " _module = ? and _key = ?", new String[]{str4, str5 != null ? str5 : "#"});
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                return;
            case 11:
                w02 w02VarOooO0oo = ((WorkDatabase) this.OooO0o0).OooOo0o().OooO0oo((String) this.OooO0o);
                if (w02VarOooO0oo == null || !w02VarOooO0oo.OooO0O0()) {
                    return;
                }
                synchronized (((fl1) this.OooO0oO).OooO0o) {
                    ((fl1) this.OooO0oO).OooO.put((String) this.OooO0o, w02VarOooO0oo);
                    ((fl1) this.OooO0oO).OooOO0.add(w02VarOooO0oo);
                    fl1 fl1Var = (fl1) this.OooO0oO;
                    fl1Var.OooOO0O.OooO0O0(fl1Var.OooOO0);
                }
                return;
            case 12:
                sw1 sw1Var = (sw1) this.OooO0oO;
                try {
                    ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback();
                    if (Build.VERSION.SDK_INT >= 26) {
                        sw1Var.OooO0o0.registerDefaultNetworkCallback(networkCallback, sw1Var.OooO00o);
                    }
                    NetworkRequest networkRequest = (NetworkRequest) sw1Var.OooO0Oo.OooO0O0(networkCallback);
                    sw1Var.OooO0o0.unregisterNetworkCallback(networkCallback);
                    ((NetworkRequest[]) this.OooO0o0)[0] = networkRequest;
                } catch (Throwable unused9) {
                }
                ((ConditionVariable) this.OooO0o).open();
                return;
            case 13:
                uy1.OooO0oo((View) this.OooO0o0, (vr1) this.OooO0o);
                ((ValueAnimator) this.OooO0oO).start();
                return;
            case 14:
                uf1 uf1Var = (uf1) this.OooO0o;
                d12 d12Var = (d12) this.OooO0oO;
                try {
                    ((nn0) this.OooO0o0).get();
                    ep0.OooO0oO().OooO0Oo(d12.OooOo0o, "Starting work for " + d12Var.OooO0oo.OooO0OO, new Throwable[0]);
                    nn0 nn0VarStartWork = d12Var.OooO.startWork();
                    d12Var.OooOo0 = nn0VarStartWork;
                    uf1Var.OooOO0(nn0VarStartWork);
                    return;
                } catch (Throwable th5) {
                    uf1Var.OooO(th5);
                    return;
                }
            case 15:
                String str6 = (String) this.OooO0o;
                d12 d12Var2 = (d12) this.OooO0oO;
                try {
                    try {
                        rn0 rn0Var = (rn0) ((uf1) this.OooO0o0).get();
                        if (rn0Var == null) {
                            ep0.OooO0oO().OooO0o(d12.OooOo0o, d12Var2.OooO0oo.OooO0OO + " returned a null result. Treating it as a failure.", new Throwable[0]);
                        } else {
                            ep0.OooO0oO().OooO0Oo(d12.OooOo0o, String.format("%s returned a %s result.", d12Var2.OooO0oo.OooO0OO, rn0Var), new Throwable[0]);
                            d12Var2.OooOO0O = rn0Var;
                        }
                    } catch (Throwable th6) {
                        d12Var2.OooO0O0();
                        throw th6;
                    }
                } catch (InterruptedException e2) {
                    e = e2;
                    ep0.OooO0oO().OooO0o(d12.OooOo0o, str6 + " failed because it threw an exception/error", e);
                } catch (CancellationException e3) {
                    ep0.OooO0oO().OooO0oo(d12.OooOo0o, str6 + " was cancelled", e3);
                } catch (ExecutionException e4) {
                    e = e4;
                    ep0.OooO0oO().OooO0o(d12.OooOo0o, str6 + " failed because it threw an exception/error", e);
                }
                d12Var2.OooO0O0();
                return;
            case 16:
                OooO00o();
                return;
            case 17:
                new zzbuh((Context) this.OooO0o0, o0OOOO00.BANNER, ((oO000) this.OooO0o).OooO00o, null).zzb((b61) this.OooO0oO);
                return;
            case 18:
                OooO0O0();
                return;
            case 19:
                OooO0OO();
                return;
            case 20:
                OooO0Oo();
                return;
            case zzbcj.zzt.zzm /* 21 */:
                OooO0o0();
                return;
            case 22:
                OooO0o();
                return;
            case 23:
                OooO0oO();
                return;
            default:
                zzdso zzdsoVar = (zzdso) this.OooO0o0;
                String str7 = (String) this.OooO0o;
                Pair[] pairArr = (Pair[]) this.OooO0oO;
                ConcurrentHashMap concurrentHashMapZzc = zzdsoVar.zzc();
                if (!TextUtils.isEmpty("action") && !TextUtils.isEmpty(str7)) {
                    concurrentHashMapZzc.put("action", str7);
                }
                for (Pair pair : pairArr) {
                    String str8 = (String) pair.first;
                    String str9 = (String) pair.second;
                    if (!TextUtils.isEmpty(str8) && !TextUtils.isEmpty(str9)) {
                        concurrentHashMapZzc.put(str8, str9);
                    }
                }
                zzdsoVar.zzg(concurrentHashMapZzc);
                return;
        }
    }

    public /* synthetic */ l1(int i) {
        this.OooO0Oo = i;
    }

    public /* synthetic */ l1(Object obj, Object obj2, Object obj3, int i) {
        this.OooO0Oo = i;
        this.OooO0oO = obj;
        this.OooO0o0 = obj2;
        this.OooO0o = obj3;
    }

    public /* synthetic */ l1(Object obj, Object obj2, Object obj3, int i, boolean z) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
        this.OooO0o = obj2;
        this.OooO0oO = obj3;
    }

    public l1(View view, yy1 yy1Var, vr1 vr1Var, ValueAnimator valueAnimator) {
        this.OooO0Oo = 13;
        this.OooO0o0 = view;
        this.OooO0o = vr1Var;
        this.OooO0oO = valueAnimator;
    }
}
