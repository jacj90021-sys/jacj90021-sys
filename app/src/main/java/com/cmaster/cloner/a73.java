package com.cmaster.cloner;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbef;
import com.google.android.gms.internal.ads.zzbwa;
import com.google.android.gms.internal.ads.zzcex;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzchc;
import com.google.android.gms.internal.ads.zzdpm;
import com.google.android.gms.internal.ads.zzdsi;
import com.google.android.gms.internal.ads.zzdsj;
import com.google.android.gms.internal.ads.zzfca;
import com.google.android.gms.internal.ads.zzfcd;
import com.google.android.gms.internal.ads.zzfva;
import com.google.android.gms.internal.ads.zzfwe;
import com.google.android.gms.internal.ads.zzfwg;
import com.google.android.gms.internal.ads.zzhhh;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class a73 {
    public static final yj2 OooOO0o = new yj2(Looper.getMainLooper());
    public String OooO0oO;
    public volatile String OooO0oo;
    public final AtomicReference OooO00o = new AtomicReference(null);
    public final AtomicReference OooO0O0 = new AtomicReference(null);
    public final AtomicReference OooO0OO = new AtomicReference(new Bundle());
    public final AtomicBoolean OooO0Oo = new AtomicBoolean();
    public boolean OooO0o0 = true;
    public final Object OooO0o = new Object();
    public boolean OooO = false;
    public boolean OooOO0 = false;
    public final ExecutorService OooOO0O = Executors.newSingleThreadExecutor();

    public static final void OooO(View view, int i) {
        String strZza;
        int i2;
        int iHeight;
        int iWidth;
        String str;
        zzfca zzfcaVarZzD;
        zzfcd zzfcdVarZzR;
        View childAt = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = childAt.getContext().getPackageName();
            if (childAt instanceof zzdpm) {
                childAt = ((zzdpm) childAt).getChildAt(0);
            }
            if (childAt instanceof zv0) {
                strZza = "NATIVE";
                i2 = 1;
            } else {
                strZza = "UNKNOWN";
                i2 = 0;
            }
            if (childAt.getLocalVisibleRect(rect)) {
                iWidth = rect.width();
                iHeight = rect.height();
            } else {
                iHeight = 0;
                iWidth = 0;
            }
            a73 a73Var = ya3.OooOooO.OooO0OO;
            long jOooo0OO = Oooo0OO(childAt);
            childAt.getLocationOnScreen(iArr);
            int i3 = iArr[0];
            int i4 = iArr[1];
            String str2 = "none";
            if (!(childAt instanceof zzcgj) || (zzfcdVarZzR = ((zzcgj) childAt).zzR()) == null) {
                str = "none";
            } else {
                str = zzfcdVarZzR.zzb;
                childAt.setContentDescription(str + ":" + childAt.hashCode());
            }
            if ((childAt instanceof zzcex) && (zzfcaVarZzD = ((zzcex) childAt).zzD()) != null) {
                strZza = zzfca.zza(zzfcaVarZzD.zzb);
                i2 = zzfcaVarZzD.zze;
                str2 = zzfcaVarZzD.zzE;
            }
            Locale locale = Locale.US;
            String str3 = "<Ad hashCode=" + childAt.hashCode() + ", package=" + packageName + ", adNetCls=" + str2 + ", gwsQueryId=" + str + ", format=" + strZza + ", impType=" + i2 + ", class=" + childAt.getClass().getName() + ", x=" + i3 + ", y=" + i4 + ", width=" + childAt.getWidth() + ", height=" + childAt.getHeight() + ", vWidth=" + iWidth + ", vHeight=" + iHeight + ", alpha=" + jOooo0OO + ", state=" + Integer.toString(i, 2) + ">";
            int i5 = uh2.OooO0O0;
            uh2.OooO(str3);
        } catch (Exception e) {
            int i6 = uh2.OooO0O0;
            uh2.OooO0oo("Failure getting view location.", e);
        }
    }

    public static final s92 OooO00o(Context context) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objNewInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(null).newInstance(null);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
                return iInterfaceQueryLocalInterface instanceof s92 ? (s92) iInterfaceQueryLocalInterface : new k92(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            }
            int i = uh2.OooO0O0;
            uh2.OooO0oO("Instantiated WorkManagerUtil not instance of IBinder.");
            return null;
        } catch (Exception e) {
            ya3.OooOooO.OooO0oo.zzw(e, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean OooO0O0(Context context, String str) {
        Context contextZza = zzbwa.zza(context);
        return e12.OooO00o(contextZza).OooO0o0.getPackageManager().checkPermission(str, contextZza.getPackageName()) == 0;
    }

    public static final boolean OooO0OO(Context context) {
        try {
            if (eq2.OooO0o == null) {
                eq2.OooO0o = Boolean.valueOf(vx2.OooO0O0() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE"));
            }
            return eq2.OooO0o.booleanValue();
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean OooO0Oo(String str) {
        if (!fx2.OooO0OO()) {
            return false;
        }
        zzbcv zzbcvVar = zzbde.zzfv;
        u72 u72Var = u72.OooO0Oo;
        if (!((Boolean) u72Var.OooO0OO.zzb(zzbcvVar)).booleanValue()) {
            return false;
        }
        String str2 = (String) u72Var.OooO0OO.zzb(zzbde.zzfx);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzfw);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean OooO0o(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean OooO0o0(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            int i = uh2.OooO0O0;
            uh2.OooO0oo("Error loading class.", th);
            ya3.OooOooO.OooO0oo.zzw(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean OooO0oO(Context context) {
        try {
            Bundle bundleOooOo0 = OooOo0(context);
            String string = bundleOooOo0.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
            if (TextUtils.isEmpty(OooOo0O(bundleOooOo0))) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    public static final boolean OooO0oo(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final AlertDialog.Builder OooOO0(Context context) {
        p93 p93Var = ya3.OooOooO.OooO0o;
        return new AlertDialog.Builder(context, android.R.style.Theme.Material.Dialog.Alert);
    }

    public static final boolean OooOO0O(zzfca zzfcaVar) {
        return ((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zznJ)).booleanValue() && zzfcaVar != null && zzfcaVar.zze == 4;
    }

    public static final int OooOO0o(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            String strConcat = "Could not parse value:".concat(e.toString());
            int i = uh2.OooO0O0;
            uh2.OooOO0(strConcat);
            return 0;
        }
    }

    public static final int[] OooOOO(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(android.R.id.content)) == null) ? new int[]{0, 0} : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    public static final HashMap OooOOO0(Uri uri) {
        String encodedQuery;
        if (uri == null) {
            return null;
        }
        if (!((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzr)).booleanValue()) {
            HashMap map = new HashMap();
            for (String str : uri.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(str)) {
                    map.put(str, uri.getQueryParameter(str));
                }
            }
            return map;
        }
        HashMap map2 = new HashMap();
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            int i = 0;
            while (true) {
                int iIndexOf = encodedQuery.indexOf(38, i);
                int length = encodedQuery.length();
                if (iIndexOf != -1) {
                    length = iIndexOf;
                }
                int iIndexOf2 = encodedQuery.indexOf(61, i);
                if (iIndexOf2 > length || iIndexOf2 == -1) {
                    iIndexOf2 = length;
                }
                map2.put(Uri.decode(encodedQuery.substring(i, iIndexOf2)), iIndexOf2 == length ? "" : Uri.decode(encodedQuery.substring(iIndexOf2 + 1, length)));
                if (iIndexOf == -1) {
                    break;
                }
                i = iIndexOf + 1;
            }
        }
        return map2;
    }

    public static final int[] OooOOOO(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        int[] iArr = (window == null || (viewFindViewById = window.findViewById(android.R.id.content)) == null) ? new int[]{0, 0} : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        p72 p72Var = p72.OooO0o;
        return new int[]{p72Var.OooO00o.OooO0oo(activity, iArr[0]), p72Var.OooO00o.OooO0oo(activity, iArr[1])};
    }

    public static final boolean OooOOOo(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z = ya3.OooOooO.OooO0OO.OooO0o0 || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || OooOooo(view);
        long jOooo0OO = Oooo0OO(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z)) {
            zzbcv zzbcvVar = zzbde.zzby;
            u72 u72Var = u72.OooO0Oo;
            zzbdc zzbdcVar = u72Var.OooO0OO;
            zzbdc zzbdcVar2 = u72Var.OooO0OO;
            if ((!((Boolean) zzbdcVar.zzb(zzbcvVar)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) && (!((Boolean) zzbdcVar2.zzb(zzbde.zzkZ)).booleanValue() || jOooo0OO >= ((Integer) zzbdcVar2.zzb(zzbde.zzlb)).intValue())) {
                return true;
            }
        }
        return false;
    }

    public static final void OooOOo(Uri uri, Context context) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            Oooo000(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String str = "Opening " + uri.toString() + " in a new browser.";
            int i = uh2.OooO0O0;
            uh2.OooO0o0(str);
        } catch (ActivityNotFoundException e) {
            int i2 = uh2.OooO0O0;
            uh2.OooO0oo("No browser is found.", e);
        }
    }

    public static final void OooOOo0(Context context, Intent intent) {
        if (!((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzlw)).booleanValue()) {
            try {
                context.startActivity(intent);
                return;
            } catch (Throwable unused) {
                intent.addFlags(268435456);
                context.startActivity(intent);
                return;
            }
        }
        try {
            try {
                context.startActivity(intent);
            } catch (Throwable unused2) {
                intent.addFlags(268435456);
                context.startActivity(intent);
            }
        } catch (SecurityException e) {
            int i = uh2.OooO0O0;
            uh2.OooOO0O("", e);
            ya3.OooOooO.OooO0oo.zzw(e, "AdUtil.startActivityWithUnknownContext");
        }
    }

    public static final void OooOOoo(Context context, Intent intent, zzdsj zzdsjVar, String str) {
        zzbcv zzbcvVar = zzbde.zznx;
        u72 u72Var = u72.OooO0Oo;
        if (!((Boolean) u72Var.OooO0OO.zzb(zzbcvVar)).booleanValue() || !(context instanceof zzchc)) {
            OooOOo0(context, intent);
            return;
        }
        try {
            Uri data = intent.getData();
            if (data != null && data.toString() != null) {
                if (data.toString().matches((String) u72Var.OooO0OO.zzb(zzbde.zznz))) {
                    ((zzchc) context).zzc(intent, 236);
                    if (!((Boolean) u72Var.OooO0OO.zzb(zzbde.zzny)).booleanValue() || zzdsjVar == null) {
                        return;
                    }
                    zzdsi zzdsiVarZza = zzdsjVar.zza();
                    zzdsiVarZza.zzb("action", "hila");
                    zzdsiVarZza.zzb("gqi", zzfwg.zzc(str));
                    zzdsiVarZza.zzi();
                    return;
                }
            }
            OooOOo0(context, intent);
        } catch (ActivityNotFoundException e) {
            e = e;
            int i = uh2.OooO0O0;
            uh2.OooO0oo("Error occurred while starting activity for result", e);
            ya3.OooOooO.OooO0oo.zzw(e, "AdUtil.startActivityForResult");
            OooOOo0(context, intent);
        } catch (SecurityException e2) {
            e = e2;
            int i2 = uh2.OooO0O0;
            uh2.OooO0oo("Error occurred while starting activity for result", e);
            ya3.OooOooO.OooO0oo.zzw(e, "AdUtil.startActivityForResult");
            OooOOo0(context, intent);
        } catch (Exception e3) {
            int i3 = uh2.OooO0O0;
            uh2.OooO0oo("Error occurred while starting activity for result", e3);
            ya3.OooOooO.OooO0oo.zzw(e3, "AdUtil.startActivityForResult");
            OooOOo0(context, intent);
        }
    }

    public static final String OooOo(Context context, String str) throws PackageManager.NameNotFoundException {
        Context contextCreatePackageContext;
        if (str == null) {
            return Oooo00o();
        }
        String strOooo00o = null;
        try {
            if (cv.OooO0o0 == null) {
                cv.OooO0o0 = new cv();
            }
            cv cvVar = cv.OooO0o0;
            if (TextUtils.isEmpty(cvVar.OooO0Oo)) {
                AtomicBoolean atomicBoolean = n60.OooO00o;
                try {
                    contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                } catch (PackageManager.NameNotFoundException unused) {
                    contextCreatePackageContext = null;
                }
                cvVar.OooO0Oo = (String) j73.OooO00o(context, new b32(contextCreatePackageContext, context, 2));
            }
            strOooo00o = cvVar.OooO0Oo;
        } catch (Exception unused2) {
        }
        if (TextUtils.isEmpty(strOooo00o)) {
            strOooo00o = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(strOooo00o)) {
            strOooo00o = Oooo00o();
        }
        String strOooO0Oo = rj.OooO0Oo(strOooo00o, " (Mobile; ", str);
        try {
            if (e12.OooO00o(context).OooO0oo()) {
                strOooO0Oo = strOooO0Oo.concat(";aia");
            }
        } catch (Exception e) {
            ya3.OooOooO.OooO0oo.zzw(e, "AdUtil.getUserAgent");
        }
        return strOooO0Oo.concat(")");
    }

    public static Bundle OooOo0(Context context) {
        try {
            return e12.OooO00o(context).OooO0o0(128, context.getPackageName()).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            uh2.OooO0O0("Error getting metadata", e);
            return null;
        }
    }

    public static int OooOo00(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i <= 0) {
            return 60000;
        }
        String strOooO00o = rj.OooO00o(i, "HTTP timeout too low: ", " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        int i2 = uh2.OooO0O0;
        uh2.OooOO0(strOooO00o);
        return 60000;
    }

    public static String OooOo0O(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return !TextUtils.isEmpty(string) ? (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "" : "";
    }

    public static boolean OooOo0o(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern patternCompile = (Pattern) atomicReference.get();
            if (patternCompile == null || !str2.equals(patternCompile.pattern())) {
                patternCompile = Pattern.compile(str2);
                atomicReference.set(patternCompile);
            }
            return patternCompile.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static ArrayList OooOoO() {
        zzbcv zzbcvVar = zzbde.zza;
        List listZzb = u72.OooO0Oo.OooO00o.zzb();
        ArrayList arrayList = new ArrayList();
        Iterator it = listZzb.iterator();
        while (it.hasNext()) {
            Iterator it2 = zzfwe.zzb(zzfva.zzc(',')).zzd((String) it.next()).iterator();
            while (it2.hasNext()) {
                try {
                    arrayList.add(Long.valueOf((String) it2.next()));
                } catch (NumberFormatException unused) {
                    uh2.OooO00o("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean OooOooo(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L9
        L7:
            r2 = r0
            goto L13
        L9:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L7
            android.app.Activity r2 = (android.app.Activity) r2
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.a73.OooOooo(android.view.View):boolean");
    }

    public static final String Oooo0() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : rj.OooO0Oo(str, " ", str2);
    }

    public static final void Oooo000(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String Oooo00O(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return OooOo0O(OooOo0(context));
    }

    public static final String Oooo00o() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final HashMap Oooo0O0(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                HashSet hashSet = new HashSet();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                if (jSONArrayOptJSONArray != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i);
                        if (strOptString != null) {
                            hashSet.add(strOptString);
                        }
                    }
                    map.put(next, hashSet);
                }
            }
            return map;
        } catch (JSONException e) {
            ya3.OooOooO.OooO0oo.zzw(e, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long Oooo0OO(View view) {
        float fMin = Float.MAX_VALUE;
        do {
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            fMin = Math.min(fMin, view2.getAlpha());
            view = view2.getParent();
        } while (fMin > 0.0f);
        return Math.round((fMin >= 0.0f ? fMin : 0.0f) * 100.0f);
    }

    public final String OooOoO0(Context context, String str) {
        if (((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzlI)).booleanValue()) {
            if (this.OooO0oo != null) {
                return this.OooO0oo;
            }
            this.OooO0oo = OooOo(context, str);
            return this.OooO0oo;
        }
        synchronized (this.OooO0o) {
            try {
                String str2 = this.OooO0oO;
                if (str2 != null) {
                    return str2;
                }
                String strOooOo = OooOo(context, str);
                this.OooO0oO = strOooOo;
                return strOooOo;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooOoOO(Context context, String str, HttpURLConnection httpURLConnection, int i) {
        int iOooOo00 = OooOo00(i);
        String strOooO00o = rj.OooO00o(iOooOo00, "HTTP timeout: ", " milliseconds.");
        int i2 = uh2.OooO0O0;
        uh2.OooO(strOooO00o);
        httpURLConnection.setConnectTimeout(iOooOo00);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(iOooOo00);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", OooOoO0(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final void OooOoo(Context context) {
        if (this.OooO) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        zzbde.zza(context);
        if (!((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzlv)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new g(this, 7), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new g(this, 7), intentFilter, 4);
        }
        this.OooO = true;
    }

    public final void OooOoo0(Context context) {
        if (this.OooOO0) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        zzbde.zza(context);
        if (!((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzlv)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new p33(), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new p33(), intentFilter, 4);
        }
        this.OooOO0 = true;
    }

    public final int OooOooO(Uri uri, Context context) {
        if (context == null) {
            uh2.OooO00o("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!(context instanceof Activity)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return 2;
        }
        zzbcv zzbcvVar = zzbde.zzeT;
        u72 u72Var = u72.OooO0Oo;
        zzbdc zzbdcVar = u72Var.OooO0OO;
        zzbdc zzbdcVar2 = u72Var.OooO0OO;
        if (((Boolean) zzbdcVar.zzb(zzbcvVar)).booleanValue()) {
            o0O000O o0o000oOooO0O0 = new km(ya3.OooOooO.OooOOO.zza()).OooO0O0();
            Intent intent2 = (Intent) o0o000oOooO0O0.OooO0o0;
            if (((Boolean) zzbdcVar2.zzb(zzbde.zzff)).booleanValue()) {
                zj2 zj2Var = p72.OooO0o.OooO00o;
                if (zj2.OooOOO()) {
                    return 5;
                }
            }
            intent2.setPackage(zzhhh.zza(context));
            intent2.setData(uri);
            context.startActivity(intent2, (Bundle) o0o000oOooO0O0.OooO0o);
            return 5;
        }
        if (((Boolean) zzbdcVar2.zzb(zzbde.zzeR)).booleanValue()) {
            zzbef zzbefVar = new zzbef();
            zzbefVar.zze(new a02(this, zzbefVar, context, uri, 29));
            zzbefVar.zzb((Activity) context);
            return 5;
        }
        Intent intent3 = new Intent("android.intent.action.VIEW");
        intent3.setData(uri);
        intent3.addFlags(268435456);
        context.startActivity(intent3);
        return 9;
    }
}
