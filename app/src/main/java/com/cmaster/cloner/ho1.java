package com.cmaster.cloner;

import android.app.Notification;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonWriter;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.IconCompat;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.material.appbar.AppBarLayout;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ho1 implements xs1, hb, bh0, iy, ge2, av2 {
    public static ho1 OooO;
    public static final vu0 OooOO0 = new vu0(10);
    public static final wq1 OooOO0O = new wq1(2);
    public static ho1 OooOO0o;
    public static final /* synthetic */ int OooOOO0 = 0;
    public final /* synthetic */ int OooO0Oo;
    public Object OooO0o;
    public Object OooO0o0;
    public Object OooO0oO;
    public Object OooO0oo;

    /* JADX WARN: Multi-variable type inference failed */
    public ho1(nx0 nx0Var) {
        int i;
        ArrayList arrayList;
        int i2;
        this.OooO0Oo = 12;
        new ArrayList();
        this.OooO0oo = new Bundle();
        this.OooO0oO = nx0Var;
        Context context = nx0Var.OooO00o;
        ArrayList arrayList2 = nx0Var.OooOOo0;
        ArrayList arrayList3 = nx0Var.OooO0OO;
        ArrayList arrayList4 = nx0Var.OooO0Oo;
        this.OooO0o0 = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.OooO0o = cj.OooO00o(context, nx0Var.OooOOO);
        } else {
            this.OooO0o = new Notification.Builder(context);
        }
        Notification notification = nx0Var.OooOOOo;
        Context context2 = null;
        ((Notification.Builder) this.OooO0o).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(nx0Var.OooO0o0).setContentText(nx0Var.OooO0o).setContentInfo(null).setContentIntent(nx0Var.OooO0oO).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        Notification.Builder builder = (Notification.Builder) this.OooO0o;
        IconCompat iconCompat = nx0Var.OooO0oo;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.OooO0oO(context));
        ((Notification.Builder) this.OooO0o).setSubText(null).setUsesChronometer(false).setPriority(nx0Var.OooO);
        ArrayList arrayList5 = nx0Var.OooO0O0;
        int size = arrayList5.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList5.get(i3);
            i3++;
            ix0 ix0Var = (ix0) obj;
            if (ix0Var.OooO0O0 == null && (i2 = ix0Var.OooO0o0) != 0) {
                ix0Var.OooO0O0 = IconCompat.OooO0O0(i2);
            }
            IconCompat iconCompat2 = ix0Var.OooO0O0;
            boolean z = ix0Var.OooO0OO;
            Bundle bundle = ix0Var.OooO00o;
            ArrayList arrayList6 = arrayList5;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompat2 != null ? iconCompat2.OooO0oO(context2) : null, ix0Var.OooO0o, ix0Var.OooO0oO);
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putBoolean("android.support.allowGeneratedReplies", z);
            builder2.setAllowGeneratedReplies(z);
            bundle2.putInt("android.support.action.semanticAction", 0);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 28) {
                ep.OooOOOO(builder2);
            }
            if (i4 >= 29) {
                b2.OooOO0(builder2);
            }
            if (i4 >= 31) {
                qx0.OooO00o(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", ix0Var.OooO0Oo);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.OooO0o).addAction(builder2.build());
            arrayList5 = arrayList6;
            context2 = null;
        }
        Bundle bundle3 = nx0Var.OooOOO0;
        if (bundle3 != null) {
            ((Bundle) this.OooO0oo).putAll(bundle3);
        }
        ((Notification.Builder) this.OooO0o).setShowWhen(nx0Var.OooOO0);
        ((Notification.Builder) this.OooO0o).setLocalOnly(nx0Var.OooOO0o);
        ((Notification.Builder) this.OooO0o).setGroup(null);
        ((Notification.Builder) this.OooO0o).setSortKey(null);
        ((Notification.Builder) this.OooO0o).setGroupSummary(false);
        ((Notification.Builder) this.OooO0o).setCategory(null);
        ((Notification.Builder) this.OooO0o).setColor(0);
        ((Notification.Builder) this.OooO0o).setVisibility(0);
        ((Notification.Builder) this.OooO0o).setPublicVersion(null);
        ((Notification.Builder) this.OooO0o).setSound(notification.sound, notification.audioAttributes);
        if (Build.VERSION.SDK_INT < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    throw px0.OooOO0o(it);
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    m3 m3Var = new m3(arrayList2.size() + arrayList.size());
                    m3Var.addAll(arrayList);
                    m3Var.addAll(arrayList2);
                    arrayList2 = new ArrayList(m3Var);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size2 = arrayList2.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj2 = arrayList2.get(i5);
                i5++;
                ((Notification.Builder) this.OooO0o).addPerson((String) obj2);
            }
        }
        if (arrayList4.size() > 0) {
            if (nx0Var.OooOOO0 == null) {
                nx0Var.OooOOO0 = new Bundle();
            }
            Bundle bundle4 = nx0Var.OooOOO0.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            for (int i6 = 0; i6 < arrayList4.size(); i6++) {
                String string = Integer.toString(i6);
                ix0 ix0Var2 = (ix0) arrayList4.get(i6);
                Bundle bundle7 = new Bundle();
                if (ix0Var2.OooO0O0 == null && (i = ix0Var2.OooO0o0) != 0) {
                    ix0Var2.OooO0O0 = IconCompat.OooO0O0(i);
                }
                IconCompat iconCompat3 = ix0Var2.OooO0O0;
                Bundle bundle8 = ix0Var2.OooO00o;
                bundle7.putInt("icon", iconCompat3 != null ? iconCompat3.OooO0OO() : 0);
                bundle7.putCharSequence("title", ix0Var2.OooO0o);
                bundle7.putParcelable("actionIntent", ix0Var2.OooO0oO);
                Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
                bundle9.putBoolean("android.support.allowGeneratedReplies", ix0Var2.OooO0OO);
                bundle7.putBundle("extras", bundle9);
                bundle7.putParcelableArray("remoteInputs", null);
                bundle7.putBoolean("showsUserInterface", ix0Var2.OooO0Oo);
                bundle7.putInt("semanticAction", 0);
                bundle6.putBundle(string, bundle7);
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (nx0Var.OooOOO0 == null) {
                nx0Var.OooOOO0 = new Bundle();
            }
            nx0Var.OooOOO0.putBundle("android.car.EXTENSIONS", bundle4);
            ((Bundle) this.OooO0oo).putBundle("android.car.EXTENSIONS", bundle5);
        }
        ((Notification.Builder) this.OooO0o).setExtras(nx0Var.OooOOO0);
        ((Notification.Builder) this.OooO0o).setRemoteInputHistory(null);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            cj.OooOO0((Notification.Builder) this.OooO0o);
            cj.OooOOoo((Notification.Builder) this.OooO0o);
            cj.OooOo00((Notification.Builder) this.OooO0o);
            cj.OooOo0o((Notification.Builder) this.OooO0o);
            cj.OooOOO((Notification.Builder) this.OooO0o);
            if (!TextUtils.isEmpty(nx0Var.OooOOO)) {
                ((Notification.Builder) this.OooO0o).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i7 >= 28) {
            Iterator it2 = arrayList3.iterator();
            if (it2.hasNext()) {
                throw px0.OooOO0o(it2);
            }
        }
        if (i7 >= 29) {
            b2.OooO0oo((Notification.Builder) this.OooO0o, nx0Var.OooOOOO);
            b2.OooO((Notification.Builder) this.OooO0o);
        }
        if (i7 >= 36) {
            o000O00.OooO0o0((Notification.Builder) this.OooO0o);
        }
    }

    public static b51 OooO0o(ho1 ho1Var, b51 b51Var, ActivityInfo activityInfo) {
        ho1Var.getClass();
        String str = null;
        if (b51Var == null) {
            u7.OooO00o(new byte[]{34, 120, -84, 15, -44, 45, -54, 104, 63, 120, -74, 6, -48, 106, -38, 38, 59, 119, -68, 16, -44, 38, -61, 104, 52, 118, -67, 68}, new byte[]{82, 25, -49, 100, -75, 74, -81, 72});
            Objects.toString(activityInfo);
            int i = fp0.OooO00o;
            return null;
        }
        if (activityInfo != null && (str = activityInfo.processName) == null) {
            ApplicationInfo applicationInfo = activityInfo.applicationInfo;
            str = applicationInfo != null ? applicationInfo.processName : activityInfo.packageName;
        }
        if (!TextUtils.equals(str, b51Var.OooOO0O)) {
            oO00OOo0 oo00ooo0OooO0Oo = oO00OOo0.OooO0Oo();
            String str2 = activityInfo.applicationInfo.packageName;
            int i2 = b51Var.OooO0o0;
            u7.OooO00o(new byte[]{61, -122, 93}, new byte[]{78, -39, 47, 7, 66, 119, -101, -50});
            b51Var = oo00ooo0OooO0Oo.OooO0oo(i2, str2, str);
            if (b51Var == null) {
                u7.OooO00o(new byte[]{11, 34, -104, -74, -8, 120, 101, 95, 49, 108, -107, -75, -31, 115, 38, 67, 126, 45, -119, -92, -76}, new byte[]{94, 76, -7, -44, -108, 29, 69, 43});
                String str3 = activityInfo.applicationInfo.packageName;
                u7.OooO00o(new byte[]{-114}, new byte[]{-95, -72, 27, -36, 25, -53, -86, -53});
                int i3 = activityInfo.applicationInfo.uid;
                u7.OooO00o(new byte[]{77, -69, 27, -99, -128, -48, 83, 123, 8, -76, 2, -118, -46, -126}, new byte[]{109, -35, 116, -17, -96, -94, 54, 24});
                activityInfo.toString();
                u7.OooO00o(new byte[]{-42, -44, -82, 66, -34, -84, -105, 34, -119, -44}, new byte[]{-6, -12, -34, 48, -79, -49, -14, 81});
                u7.OooO00o(new byte[]{73, -11, -116, 114, 108, 2, -104, 60, 0, -11, -107, 115, 35, 3, -100, 43}, new byte[]{115, -43, -4, 0, 3, 97, -3, 79});
                int i4 = fp0.OooO00o;
            }
        }
        return b51Var;
    }

    public static synchronized ho1 OooOoO(Context context, zl1 zl1Var) {
        try {
            if (OooO == null) {
                ho1 ho1Var = new ho1(0, false);
                Context applicationContext = context.getApplicationContext();
                ho1Var.OooO0o0 = new p7(applicationContext, zl1Var);
                ho1Var.OooO0o = new q7(applicationContext, zl1Var);
                ho1Var.OooO0oO = new zw0(applicationContext, zl1Var);
                ho1Var.OooO0oo = new gj1(applicationContext, zl1Var);
                OooO = ho1Var;
            }
        } catch (Throwable th) {
            throw th;
        }
        return OooO;
    }

    public static ho1 OooOoO0() {
        if (OooOO0o == null) {
            OooOO0o = new ho1(17);
        }
        return OooOO0o;
    }

    public static ho1 OooOoo(LayoutInflater layoutInflater) throws Resources.NotFoundException {
        View viewInflate = layoutInflater.inflate(R.layout.activity_main, (ViewGroup) null, false);
        int i = R.id.appbar;
        AppBarLayout appBarLayout = (AppBarLayout) l53.OooO00o(viewInflate, R.id.appbar);
        if (appBarLayout != null) {
            i = R.id.content;
            FrameLayout frameLayout = (FrameLayout) l53.OooO00o(viewInflate, R.id.content);
            if (frameLayout != null) {
                i = R.id.toolbar;
                Toolbar toolbar = (Toolbar) l53.OooO00o(viewInflate, R.id.toolbar);
                if (toolbar != null) {
                    return new ho1((CoordinatorLayout) viewInflate, appBarLayout, frameLayout, toolbar, 4);
                }
            }
        }
        qa.OooOOO0(sn2.OooO00o("4OxCx66Rerjf4EDBro14/I3zWNGw32rx2e0R/YPFPQ==\n", "rYUxtMf/HZg=\n").concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public static String OooOooo(int i, String str) {
        return px0.OooOOOo(new byte[]{-50}, new byte[]{-29, 97, -110, 22, -103, -125, 76, 2}, rj.OooOO0(str), i);
    }

    public static ho1 Oooo0O0(Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra(u7.OooO00o(new byte[]{-11, 74, 103, -65, -61, -120, -22, 49, -3, 74, 119, -88, -62, -107, -96, 122, -20, 80, 113, -84, -126, -77, -53, 89, -47, 118, 81, -120, -2}, new byte[]{-108, 36, 3, -51, -84, -31, -114, 31}));
        if (bundleExtra == null) {
            return null;
        }
        return new ho1(bundleExtra);
    }

    public void OooO(o10 o10Var) {
        if (((ArrayList) this.OooO0o0).contains(o10Var)) {
            ra.OooO0o0(o10Var, "Fragment already added: ");
            return;
        }
        synchronized (((ArrayList) this.OooO0o0)) {
            ((ArrayList) this.OooO0o0).add(o10Var);
        }
        o10Var.OooOOO = true;
    }

    @Override // com.cmaster.cloner.bh0
    public void OooO00o(an1 an1Var) {
        zh1 zh1Var = an1Var.OooO0o0;
        os osVarOooO00o = cc1.OooO00o(an1Var);
        if (an1Var.OooO0Oo.OooO0o0 != 6) {
            ra.OooOOO0(u7.OooO00o(new byte[]{2, -88, -3, -87, 83, -74, -124, 92, 5, -32, -6, -67, 79, -94, -113, 21}, new byte[]{113, -64, -110, -36, 63, -46, -22, 123}));
            return;
        }
        u81 u81VarOooOoOO = OooOoOO();
        if (osVarOooO00o.OooO0o0 != (u81VarOooOoOO != null)) {
            qa.OooOO0O(u7.OooO00o(new byte[]{101, -85, -113, -48, -9, 12, -17, 68, 68, -27, -114, -37, -92, 14, -22, 68, 3, -88, -109, -56, -78, 86, -12, 85, 95, -80, -112, -54, -6, 11, -11, 85, 89, -95, -109, -98, -70, 18, -11, 93, 77, -79, -97, -42}, new byte[]{44, -59, -4, -66, -41, 123, -122, 48}), an1Var);
        } else {
            OooOO0((ke) this.OooO0oO);
            OooOO0(new hh1(osVarOooO00o, zh1Var, dc1.OooO00o(an1Var, u81VarOooOoOO)));
        }
    }

    @Override // com.cmaster.cloner.bh0
    public void OooO0O0(y21 y21Var) {
        zm hh1Var;
        bc1 bc1Var = y21Var.OooO0Oo;
        u81 u81Var = y21Var.OooO0o;
        int i = bc1Var.OooO00o;
        if (i == 54 || i == 56) {
            return;
        }
        zh1 zh1Var = y21Var.OooO0o0;
        os osVarOooO00o = cc1.OooO00o(y21Var);
        int i2 = bc1Var.OooO0o0;
        if (i2 == 1 || i2 == 2) {
            hh1Var = new hh1(osVarOooO00o, zh1Var, dc1.OooO00o(y21Var, u81Var));
        } else {
            if (i2 == 3) {
                return;
            }
            if (i2 != 4) {
                if (i2 != 6) {
                    ra.OooOOO0(u7.OooO00o(new byte[]{-102, -28, -81, 107, -60, -98, -108, 87, -99, -84, -88, 127, -40, -118, -97, 30}, new byte[]{-23, -116, -64, 30, -88, -6, -6, 112}));
                    return;
                }
                hh1Var = new hh1(osVarOooO00o, zh1Var, dc1.OooO00o(y21Var, u81Var));
            } else {
                hh1Var = new ul1(osVarOooO00o, zh1Var, dc1.OooO00o(y21Var, u81Var), ((ke[]) ((dc1) this.OooO0oo).OooO0O0.OooO0o0)[((i7) this.OooO0o).OooO0OO.OooO0o(1)]);
            }
        }
        OooOO0(hh1Var);
    }

    @Override // com.cmaster.cloner.bh0
    public void OooO0OO(zm1 zm1Var) {
        zh1 zh1Var = zm1Var.OooO0o0;
        os osVarOooO00o = cc1.OooO00o(zm1Var);
        bc1 bc1Var = zm1Var.OooO0Oo;
        oh ohVar = zm1Var.OooO0oo;
        int i = bc1Var.OooO0o0;
        int i2 = bc1Var.OooO00o;
        if (i != 6) {
            throw new RuntimeException(u7.OooO00o(new byte[]{31, -73, -106, -69, 97, -90, -49, 23, 122, -115, -76, -97, 76, -111, -30, 44, 14, -121, -76, -111, 85, -14, -51, 28, 46, -17}, new byte[]{90, -49, -26, -34, 2, -46, -86, 115}) + bc1Var.OooO0o0);
        }
        OooOO0((ke) this.OooO0oO);
        if (bc1Var.OooO0o) {
            OooOO0(new bl(osVarOooO00o, zh1Var, zm1Var.OooO0oO, ohVar));
            return;
        }
        u81 u81VarOooOoOO = OooOoOO();
        v81 v81VarOooO00o = dc1.OooO00o(zm1Var, u81VarOooOoOO);
        if ((osVarOooO00o.OooO0o0 || i2 == 43) == (u81VarOooOoOO != null)) {
            OooOO0((i2 != 41 || osVarOooO00o.OooO00o == 35) ? new bl(osVarOooO00o, zh1Var, v81VarOooO00o, ohVar) : new hh1(osVarOooO00o, zh1Var, v81VarOooO00o));
        } else {
            qa.OooOO0O(u7.OooO00o(new byte[]{72, -115, -101, -2, 63, 35, -24, -17, 105, -61, -102, -11, 108, 33, -19, -17, 46, -114, -121, -26, 122, 121, -13, -2, 114, -106, -124, -28, 50, 36, -14, -2, 116, -121, -121, -80, 114, 61, -14, -10, 96, -105, -117, -8, 63}, new byte[]{1, -29, -24, -112, 31, 84, -127, -101}), zm1Var);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:72:0x0219. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0306 A[PHI: r20
      0x0306: PHI (r20v3 java.lang.String) = (r20v1 java.lang.String), (r20v4 java.lang.String) binds: [B:88:0x0260, B:73:0x021c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0262  */
    @Override // com.cmaster.cloner.ge2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean OooO0Oo(java.lang.String r20, org.json.JSONObject r21) {
        /*
            Method dump skipped, instructions count: 1136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.ho1.OooO0Oo(java.lang.String, org.json.JSONObject):boolean");
    }

    @Override // com.cmaster.cloner.bh0
    public void OooO0o0(x21 x21Var) {
        zh1 zh1Var = x21Var.OooO0o0;
        oh ohVar = x21Var.OooO0oo;
        u81 u81Var = x21Var.OooO0o;
        os osVarOooO00o = cc1.OooO00o(x21Var);
        bc1 bc1Var = x21Var.OooO0Oo;
        int i = bc1Var.OooO00o;
        if (bc1Var.OooO0o0 != 1) {
            ra.OooOOO0(u7.OooO00o(new byte[]{21, -35, 93, 93, -73, 39, 18, 92, 18, -107, 90, 73, -85, 51, 25, 21}, new byte[]{102, -75, 50, 40, -37, 67, 124, 123}));
            return;
        }
        if (i != 3) {
            OooOO0(new bl(osVarOooO00o, zh1Var, dc1.OooO00o(x21Var, u81Var), ohVar));
            return;
        }
        dc1 dc1Var = (dc1) this.OooO0oo;
        if (dc1Var.OooO0oo) {
            return;
        }
        OooOO0(new hh1(osVarOooO00o, zh1Var, v81.OooOO0(u81Var, u81.OooO0Oo((dc1Var.OooO0o0 - dc1Var.OooO0oO) + ((cl) ohVar).OooO0Oo, u81Var.OooO0o0.getType()))));
    }

    @Override // com.cmaster.cloner.av2
    public void OooO0oO(JsonWriter jsonWriter) throws IOException {
        String str = (String) this.OooO0o0;
        String str2 = (String) this.OooO0o;
        Map map = (Map) this.OooO0oO;
        byte[] bArr = (byte[]) this.OooO0oo;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        fx2.OooO0o0(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64.encodeToString(bArr, 0));
        }
        jsonWriter.endObject();
    }

    public synchronized void OooO0oo(zk0 zk0Var, qw qwVar) {
        o00OOO0 o00ooo0 = (o00OOO0) ((HashMap) this.OooO0o).put(zk0Var, new o00OOO0(zk0Var, qwVar, (ReferenceQueue) this.OooO0oO));
        if (o00ooo0 != null) {
            o00ooo0.OooO0OO = null;
            o00ooo0.clear();
        }
    }

    public void OooOO0(zm zmVar) {
        ((b01) ((e81) this.OooO0o0).OooO0o0).OooO00o(zmVar);
    }

    public synchronized iu0 OooOO0O(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) this.OooO0o0;
            int size = arrayList2.size();
            boolean z = false;
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                zu0 zu0Var = (zu0) obj;
                if (((HashSet) this.OooO0oO).contains(zu0Var)) {
                    z = true;
                } else if (zu0Var.OooO00o.isAssignableFrom(cls) && zu0Var.OooO0O0.isAssignableFrom(cls2)) {
                    ((HashSet) this.OooO0oO).add(zu0Var);
                    arrayList.add(zu0Var.OooO0OO.OooOo00(this));
                    ((HashSet) this.OooO0oO).remove(zu0Var);
                }
            }
            if (arrayList.size() > 1) {
                vu0 vu0Var = (vu0) this.OooO0o;
                hx2 hx2Var = (hx2) this.OooO0oo;
                vu0Var.getClass();
                return new t3(arrayList, hx2Var, 3);
            }
            if (arrayList.size() == 1) {
                return (iu0) arrayList.get(0);
            }
            if (z) {
                return OooOO0O;
            }
            throw new x81("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            ((HashSet) this.OooO0oO).clear();
            throw th;
        }
    }

    public ho1 OooOO0o() {
        if (((URL) this.OooO0o0) != null) {
            return new ho1(this);
        }
        qa.OooO0o(u7.OooO00o(new byte[]{-101, -39, -33, -97, -46, 126, 86, -54, -101, -57, -33}, new byte[]{-18, -85, -77, -65, -17, 67, 118, -92}));
        return null;
    }

    public boolean OooOOO(uh1 uh1Var, int i) {
        c7 c7Var = (c7) uh1Var.OooO00o.get();
        if (c7Var == null) {
            return false;
        }
        ((Handler) this.OooO0o).removeCallbacksAndMessages(uh1Var);
        Handler handler = f7.OooOo0o;
        handler.sendMessage(handler.obtainMessage(1, i, 0, c7Var.OooO00o));
        return true;
    }

    public synchronized ArrayList OooOOO0(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) this.OooO0o0;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                zu0 zu0Var = (zu0) obj;
                if (!((HashSet) this.OooO0oO).contains(zu0Var) && zu0Var.OooO00o.isAssignableFrom(cls)) {
                    ((HashSet) this.OooO0oO).add(zu0Var);
                    arrayList.add(zu0Var.OooO0OO.OooOo00(this));
                    ((HashSet) this.OooO0oO).remove(zu0Var);
                }
            }
        } finally {
        }
        return arrayList;
    }

    public void OooOOOO(o00OOO0 o00ooo0) {
        fa1 fa1Var;
        synchronized (this) {
            ((HashMap) this.OooO0o).remove(o00ooo0.OooO00o);
            if (o00ooo0.OooO0O0 && (fa1Var = o00ooo0.OooO0OO) != null) {
                ((kw) this.OooO0oo).OooO0o0(o00ooo0.OooO00o, new qw(fa1Var, true, false, o00ooo0.OooO00o, (kw) this.OooO0oo));
            }
        }
    }

    public void OooOOOo(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            ra.OooOOO0("This graph contains cyclic dependencies");
            return;
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((gh1) this.OooO0o).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                OooOOOo(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public o10 OooOOo(String str) {
        for (r20 r20Var : (java.util.Collection<r20>) ((HashMap) this.OooO0o).values()) {
            if (r20Var != null) {
                o10 o10VarOooOOo = r20Var.OooO0OO;
                if (!str.equals(o10VarOooOOo.OooO0oo)) {
                    o10VarOooOOo = o10VarOooOOo.OooOo0o.OooO0OO.OooOOo(str);
                }
                if (o10VarOooOOo != null) {
                    return o10VarOooOOo;
                }
            }
        }
        return null;
    }

    public o10 OooOOo0(String str) {
        r20 r20Var = (r20) ((HashMap) this.OooO0o).get(str);
        if (r20Var != null) {
            return r20Var.OooO0OO;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0212, code lost:
    
        r2 = r5.size();
        r3 = 0;
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0218, code lost:
    
        if (r3 >= r2) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x021a, code lost:
    
        r5 = (com.cmaster.cloner.zm) r1.OooO0O0.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0224, code lost:
    
        if ((r5 instanceof com.cmaster.cloner.ul1) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0227, code lost:
    
        r6 = r5.OooO0O0;
        r7 = (com.cmaster.cloner.ul1) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0232, code lost:
    
        if (r6.OooO0Oo.OooO0O0(r7) == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0239, code lost:
    
        if (r6.OooO0O0 != 40) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x023b, code lost:
    
        r4 = r1.OooO0o0(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x023f, code lost:
    
        if (r4 == null) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0241, code lost:
    
        r1.OooO0O0.set(r3, r5.OooO(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x024b, code lost:
    
        com.cmaster.cloner.sa.OooO0oO(com.cmaster.cloner.u7.OooO00o(new byte[]{-84, 120, -45, 56, 109, -101, -55, -65, -82, 114, -121, 60, 109, -111, -114}, new byte[]{-63, 29, -89, 80, 2, -1, -23, -53}));
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0260, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0261, code lost:
    
        r5 = r3 + 1;
        r4 = (com.cmaster.cloner.ke) r1.OooO0O0.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x026b, code lost:
    
        r1.OooO0O0.set(r3, new com.cmaster.cloner.ul1(com.cmaster.cloner.ps.Oooo0, r7.OooO0OO, com.cmaster.cloner.v81.OooO0o, r7.OooO0o0));
        r1.OooO0O0.add(r3, r7.OooOOOO(r4));
        r2 = r2 + 1;
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0289, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x028b, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0291, code lost:
    
        com.cmaster.cloner.qa.OooO0o(com.cmaster.cloner.u7.OooO00o(new byte[]{-58, -19, 7, -36, -36, 85, 92, -31, -109, -41, 22, -49, -46, 66, 77, -52, -35, -16, 25}, new byte[]{-77, -125, 119, -67, -75, 39, 57, -123}));
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02a6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02a7, code lost:
    
        com.cmaster.cloner.qa.OooO0o(com.cmaster.cloner.u7.OooO00o(new byte[]{60, 11, 71, 53, -12, -30, 94, 18, 105, 49, 86, 38, -6, -11, 79, 63, 39, 22, 89, 116, -75, -12, 90, 24, 46, 9, 94, 58, -6, -71}, new byte[]{73, 101, 55, 84, -99, -112, 59, 118}));
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02ba, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x034d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v5, types: [com.cmaster.cloner.aq1] */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void OooOOoo() {
        /*
            Method dump skipped, instructions count: 1668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.ho1.OooOOoo():void");
    }

    public List OooOo() {
        ArrayList arrayList;
        if (((ArrayList) this.OooO0o0).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.OooO0o0)) {
            arrayList = new ArrayList((ArrayList) this.OooO0o0);
        }
        return arrayList;
    }

    public ArrayList OooOo0() {
        ArrayList arrayList = new ArrayList();
        for (r20 r20Var : (java.util.Collection<r20>) ((HashMap) this.OooO0o).values()) {
            if (r20Var != null) {
                arrayList.add(r20Var);
            }
        }
        return arrayList;
    }

    public bk1 OooOo00(o00OO0O0 o00oo0o0) {
        ArrayList arrayList = (ArrayList) this.OooO0oO;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bk1 bk1Var = (bk1) arrayList.get(i);
            if (bk1Var != null && bk1Var.OooO0O0 == o00oo0o0) {
                return bk1Var;
            }
        }
        bk1 bk1Var2 = new bk1((Context) this.OooO0o, o00oo0o0);
        arrayList.add(bk1Var2);
        return bk1Var2;
    }

    public ArrayList OooOo0O() {
        ArrayList arrayList = new ArrayList();
        for (r20 r20Var : (java.util.Collection<r20>) ((HashMap) this.OooO0o).values()) {
            if (r20Var != null) {
                arrayList.add(r20Var.OooO0OO);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public synchronized ArrayList OooOo0o(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) this.OooO0o0;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            zu0 zu0Var = (zu0) obj;
            if (!arrayList.contains(zu0Var.OooO0O0) && zu0Var.OooO00o.isAssignableFrom(cls)) {
                arrayList.add(zu0Var.OooO0O0);
            }
        }
        return arrayList;
    }

    public u81 OooOoOO() {
        int i = ((i7) this.OooO0o).OooO0Oo;
        if (i < 0) {
            return null;
        }
        ch0 ch0Var = (ch0) ((j7) ((dc1) this.OooO0oo).OooO00o.OooO0o0).OooOO0(i).OooO0O0.OooO0o0(0);
        if (ch0Var.OooO0Oo.OooO00o != 56) {
            return null;
        }
        return ch0Var.OooO0o;
    }

    public yt1 OooOoo0(rd rdVar, String str) {
        yt1 yt1Var;
        yt1 yt1VarOooO0OO;
        synchronized (((s60) this.OooO0oo)) {
            try {
                du1 du1Var = (du1) this.OooO0o0;
                du1Var.getClass();
                yt1Var = (yt1) du1Var.OooO00o.get(str);
                if (rdVar.OooO0OO(yt1Var)) {
                    bu1 bu1Var = (bu1) this.OooO0o;
                    if (bu1Var instanceof kd1) {
                        kd1 kd1Var = (kd1) bu1Var;
                        yt1Var.getClass();
                        jm0 jm0Var = kd1Var.OooO0oO;
                        if (jm0Var != null) {
                            o0O000O o0o000o = kd1Var.OooO0oo;
                            o0o000o.getClass();
                            hv2.OooO00o(yt1Var, o0o000o, jm0Var);
                        }
                    }
                    yt1Var.getClass();
                } else {
                    fv0 fv0Var = new fv0((nk) this.OooO0oO);
                    fv0Var.OooO00o.put(cu1.OooO0O0, str);
                    bu1 bu1Var2 = (bu1) this.OooO0o;
                    bu1Var2.getClass();
                    try {
                        try {
                            yt1VarOooO0OO = bu1Var2.OooO0Oo(rdVar, fv0Var);
                        } catch (AbstractMethodError unused) {
                            Class cls = rdVar.OooO00o;
                            cls.getClass();
                            yt1VarOooO0OO = bu1Var2.OooOOO(cls, fv0Var);
                        }
                    } catch (AbstractMethodError unused2) {
                        Class cls2 = rdVar.OooO00o;
                        cls2.getClass();
                        yt1VarOooO0OO = bu1Var2.OooO0OO(cls2);
                    }
                    yt1Var = yt1VarOooO0OO;
                    du1 du1Var2 = (du1) this.OooO0o0;
                    du1Var2.getClass();
                    yt1Var.getClass();
                    yt1 yt1Var2 = (yt1) du1Var2.OooO00o.put(str, yt1Var);
                    if (yt1Var2 != null) {
                        yt1Var2.OooO00o();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yt1Var;
    }

    public boolean OooOooO(c7 c7Var) {
        uh1 uh1Var = (uh1) this.OooO0oO;
        return (uh1Var == null || c7Var == null || uh1Var.OooO00o.get() != c7Var) ? false : true;
    }

    public void Oooo(String str) {
        try {
            this.OooO0o0 = new URL(str.regionMatches(true, 0, u7.OooO00o(new byte[]{88, -73, 20}, new byte[]{47, -60, 46, -36, 66, -4, -108, 13}), 0, 3) ? u7.OooO00o(new byte[]{58, 102, 121, -87, -54}, new byte[]{82, 18, 13, -39, -16, 59, 14, -125}).concat(str.substring(3)) : str.regionMatches(true, 0, u7.OooO00o(new byte[]{-49, -71, -34, 14}, new byte[]{-72, -54, -83, 52, 76, -74, -36, -38}), 0, 4) ? u7.OooO00o(new byte[]{-10, -15, 5, -101, -126, -22}, new byte[]{-98, -123, 113, -21, -15, -48, 127, -10}).concat(str.substring(4)) : str);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            sa.OooOO0(e);
        }
    }

    public boolean Oooo0(o00OO0O0 o00oo0o0, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.OooO0o0;
        bk1 bk1VarOooOo00 = OooOo00(o00oo0o0);
        gh1 gh1Var = (gh1) this.OooO0oo;
        Menu lt0Var = (Menu) gh1Var.get(menu);
        if (lt0Var == null) {
            lt0Var = new lt0((Context) this.OooO0o, (ss0) menu);
            gh1Var.put(menu, lt0Var);
        }
        return callback.onCreateActionMode(bk1VarOooOo00, lt0Var);
    }

    public void Oooo000(r20 r20Var) {
        o10 o10Var = r20Var.OooO0OO;
        String str = o10Var.OooO0oo;
        HashMap map = (HashMap) this.OooO0o;
        if (map.get(str) != null) {
            return;
        }
        map.put(o10Var.OooO0oo, r20Var);
        if (k20.Oooo000(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + o10Var);
        }
    }

    public void Oooo00O(r20 r20Var) {
        o10 o10Var = r20Var.OooO0OO;
        if (o10Var.OooOooO) {
            ((n20) this.OooO0oo).OooO0oO(o10Var);
        }
        if (((r20) ((HashMap) this.OooO0o).put(o10Var.OooO0oo, null)) != null && k20.Oooo000(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + o10Var);
        }
    }

    public boolean Oooo00o(o00OO0O0 o00oo0o0, MenuItem menuItem) {
        return ((ActionMode.Callback) this.OooO0o0).onActionItemClicked(OooOo00(o00oo0o0), new zs0((Context) this.OooO0o, (gk1) menuItem));
    }

    public void Oooo0OO(c7 c7Var) {
        synchronized (this.OooO0o0) {
            try {
                if (OooOooO(c7Var)) {
                    uh1 uh1Var = (uh1) this.OooO0oO;
                    if (!uh1Var.OooO0OO) {
                        uh1Var.OooO0OO = true;
                        ((Handler) this.OooO0o).removeCallbacksAndMessages(uh1Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void Oooo0o(uh1 uh1Var) {
        Handler handler = (Handler) this.OooO0o;
        int i = uh1Var.OooO0O0;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        handler.removeCallbacksAndMessages(uh1Var);
        handler.sendMessageDelayed(Message.obtain(handler, 0, uh1Var), i);
    }

    public void Oooo0o0(c7 c7Var) {
        synchronized (this.OooO0o0) {
            try {
                if (OooOooO(c7Var)) {
                    uh1 uh1Var = (uh1) this.OooO0oO;
                    if (uh1Var.OooO0OO) {
                        uh1Var.OooO0OO = false;
                        Oooo0o(uh1Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void Oooo0oO() {
        uh1 uh1Var = (uh1) this.OooO0oo;
        if (uh1Var != null) {
            this.OooO0oO = uh1Var;
            this.OooO0oo = null;
            c7 c7Var = (c7) uh1Var.OooO00o.get();
            if (c7Var == null) {
                this.OooO0oO = null;
            } else {
                Handler handler = f7.OooOo0o;
                handler.sendMessage(handler.obtainMessage(0, c7Var.OooO00o));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void Oooo0oo(b51 b51Var) {
        boolean zIsEmpty;
        String strOooOooo = OooOooo(b51Var.OooO0o0, b51Var.OooO0Oo.packageName);
        aj1 aj1Var = (aj1) ((HashMap) this.OooO0oo).get(strOooOooo);
        if (aj1Var == null) {
            return;
        }
        int i = aj1.OooOO0o;
        synchronized (aj1Var) {
            zIsEmpty = false;
            Object[] objArr = null;
            if (aj1Var.OooO.remove(b51Var)) {
                aj1Var.execute(new zi1(aj1Var, b51Var, 1));
                zIsEmpty = aj1Var.OooO.isEmpty();
            }
        }
        if (zIsEmpty) {
            ((HashMap) this.OooO0oo).remove(strOooOooo);
        }
    }

    @Override // com.cmaster.cloner.q51
    public Object get() {
        return new ho1((Executor) ((q51) this.OooO0o0).get(), (qc1) ((q51) this.OooO0o).get(), (a02) ((a02) this.OooO0oO).get(), (qc1) ((q51) this.OooO0oo).get(), 22);
    }

    @Override // com.cmaster.cloner.xs1
    public View getRoot() {
        return (CoordinatorLayout) this.OooO0o0;
    }

    @Override // com.cmaster.cloner.hb
    public void onCancel() {
        View view = (View) this.OooO0o0;
        view.clearAnimation();
        ((ViewGroup) this.OooO0o).endViewTransition(view);
        ((bp) this.OooO0oO).OooO0o0();
        if (k20.Oooo000(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((ei1) this.OooO0oo) + " has been cancelled.");
        }
    }

    public String toString() {
        switch (this.OooO0Oo) {
            case 15:
                return u7.OooO00o(new byte[]{-109, -49, -107, -61, -2, -101, 94, 94, -85, -44, -124, -43, -28, -108, 97, 94, -82, -55, -114, -62, -83}, new byte[]{-38, -95, -31, -90, -112, -17, 12, 59}) + ((String) this.OooO0o) + u7.OooO00o(new byte[]{-22, -79, -87, -86, -28, -8}, new byte[]{-58, -111, -36, -40, -120, -59, -114, -118}) + ((URL) this.OooO0o0) + u7.OooO00o(new byte[]{2, -61, 14, 14, 40, 39, 15}, new byte[]{46, -29, 122, 111, 79, 84, 50, 51}) + ((Map) this.OooO0oo) + '}';
            default:
                return super.toString();
        }
    }

    @Override // com.cmaster.cloner.ge2
    public Executor zza() {
        return (Executor) this.OooO0oo;
    }

    public /* synthetic */ ho1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
        this.OooO0o = obj2;
        this.OooO0oO = obj3;
        this.OooO0oo = obj4;
    }

    public ho1(Bundle bundle) {
        this.OooO0Oo = 5;
        this.OooO0o = bundle.getBinder(u7.OooO00o(new byte[]{-1, 8, -50, 115, 82, -78, -44, -116, -9, 8, -34, 100, 83, -81, -98, -57, -26, 18, -40, 96, 19, -105, -1, -31, -33, 42, -11, 78, 115, -105, -23}, new byte[]{-98, 102, -86, 1, 61, -37, -80, -94}));
        this.OooO0o0 = bundle.getBinder(u7.OooO00o(new byte[]{-48, 93, 41, 4, -87, -115, -67, 45, -40, 93, 57, 19, -88, -112, -9, 102, -55, 71, 63, 23, -24, -106, -68, 110, -34, 71, 40, 41, -81, -118, -83, 102, -33, 71, 18, 2, -87, -113, -68, 109}, new byte[]{-79, 51, 77, 118, -58, -28, -39, 3}));
        this.OooO0oO = (Intent) bundle.getParcelable(u7.OooO00o(new byte[]{12, 116, -120, -64, 10, 16, 109, -43, 4, 116, -104, -41, 11, 13, 39, -98, 21, 110, -98, -45, 75, 48, 71, -81, 40, 84, -72}, new byte[]{109, 26, -20, -78, 101, 121, 9, -5}));
        this.OooO0oo = (ActivityInfo) bundle.getParcelable(u7.OooO00o(new byte[]{-23, 88, 92, 69, 38, 2, -69, -128, -31, 88, 76, 82, 39, 31, -15, -53, -16, 66, 74, 86, 103, 57, -102, -24, -51, 100, 106, 114, 27}, new byte[]{-120, 54, 56, 55, 73, 107, -33, -82}));
        bundle.getInt(u7.OooO00o(new byte[]{3, 63, 126, -69, -35, -78, 38, 111, 11, 63, 110, -84, -36, -81, 108, 36, 26, 37, 104, -88, -100, -114, 17, 4, 48}, new byte[]{98, 81, 26, -55, -78, -37, 66, 65}));
    }

    public ho1(WorkDatabase_Impl workDatabase_Impl) {
        this.OooO0Oo = 24;
        this.OooO0o0 = workDatabase_Impl;
        this.OooO0o = new sp(workDatabase_Impl, 4);
        this.OooO0oO = new hl1(workDatabase_Impl, 1);
        this.OooO0oo = new hl1(workDatabase_Impl, 2);
    }

    public ho1(int i) {
        this.OooO0Oo = i;
        int i2 = 0;
        switch (i) {
            case 8:
                this.OooO0o0 = new s31(10);
                this.OooO0o = new gh1(0);
                this.OooO0oO = new ArrayList();
                this.OooO0oo = new HashSet();
                break;
            case 9:
                this.OooO0o0 = new ArrayList();
                this.OooO0o = new HashMap();
                this.OooO0oO = new HashMap();
                break;
            case 14:
                this.OooO0oo = Collections.EMPTY_MAP;
                this.OooO0o = u7.OooO00o(new byte[]{-41, 35, 109}, new byte[]{-112, 102, 57, 125, -37, -88, 104, 125});
                this.OooO0oO = new xb1(18);
                break;
            case 17:
                this.OooO0o0 = new Object();
                this.OooO0o = new Handler(Looper.getMainLooper(), new c50(this, 2));
                break;
            case 20:
                this.OooO0o0 = new k3(0);
                this.OooO0o = new SparseArray();
                this.OooO0oO = new gp0();
                this.OooO0oo = new k3(0);
                break;
            default:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new o00OO(i2));
                this.OooO0o = new HashMap();
                this.OooO0oO = new ReferenceQueue();
                this.OooO0o0 = executorServiceNewSingleThreadExecutor;
                executorServiceNewSingleThreadExecutor.execute(new o00OOO00(this, i2));
                break;
        }
    }

    public ho1(du1 du1Var, bu1 bu1Var, nk nkVar) {
        this.OooO0Oo = 21;
        du1Var.getClass();
        bu1Var.getClass();
        nkVar.getClass();
        this.OooO0o0 = du1Var;
        this.OooO0o = bu1Var;
        this.OooO0oO = nkVar;
        this.OooO0oo = new s60();
    }

    public ho1(hx2 hx2Var) {
        this.OooO0Oo = 1;
        this.OooO0o0 = new ArrayList();
        this.OooO0oO = new HashSet();
        this.OooO0oo = hx2Var;
        this.OooO0o = OooOO0;
    }

    public ho1(ArrayList arrayList, dn1 dn1Var, jp0 jp0Var, ContentResolver contentResolver) {
        this.OooO0Oo = 2;
        this.OooO0o0 = dn1Var;
        this.OooO0o = jp0Var;
        this.OooO0oO = contentResolver;
        this.OooO0oo = arrayList;
    }

    public ho1(ho1 ho1Var) {
        Map mapUnmodifiableMap;
        this.OooO0Oo = 15;
        this.OooO0o0 = (URL) ho1Var.OooO0o0;
        this.OooO0o = (String) ho1Var.OooO0o;
        xb1 xb1Var = (xb1) ho1Var.OooO0oO;
        xb1Var.getClass();
        this.OooO0oO = new n70(xb1Var);
        Map map = (Map) ho1Var.OooO0oo;
        Pattern pattern = qr1.OooO00o;
        if (map.isEmpty()) {
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        this.OooO0oo = mapUnmodifiableMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ho1(Context context) {
        this.OooO0Oo = 18;
        HandlerThread handlerThread = new HandlerThread(u7.OooO00o(new byte[]{75, -37, 55, 111, -61, -120, -90, -128, 89, -63, 50, 105, -59, -126, -67, -115, 79, -42, 54, 116, -38, -124, -80}, new byte[]{10, -107, 115, 61, -116, -63, -30, -33}));
        this.OooO0oo = new HashMap();
        this.OooO0o0 = context;
        pw1.o00O0000();
        this.OooO0o = ox1.o0O0ooO();
        handlerThread.start();
        this.OooO0oO = new xi1(handlerThread.getLooper(), 0, false);
    }

    public /* synthetic */ ho1(int i, boolean z) {
        this.OooO0Oo = i;
    }

    public ho1(Typeface typeface, qt0 qt0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.OooO0Oo = 11;
        this.OooO0oo = typeface;
        this.OooO0o0 = qt0Var;
        this.OooO0oO = new rt0(1024);
        int iOooO00o = qt0Var.OooO00o(6);
        if (iOooO00o != 0) {
            int i5 = iOooO00o + qt0Var.OooO0Oo;
            i = ((ByteBuffer) qt0Var.OooO0oO).getInt(((ByteBuffer) qt0Var.OooO0oO).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.OooO0o = new char[i * 2];
        int iOooO00o2 = qt0Var.OooO00o(6);
        if (iOooO00o2 != 0) {
            int i6 = iOooO00o2 + qt0Var.OooO0Oo;
            i2 = ((ByteBuffer) qt0Var.OooO0oO).getInt(((ByteBuffer) qt0Var.OooO0oO).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            nq1 nq1Var = new nq1(this, i7);
            pt0 pt0VarOooO0O0 = nq1Var.OooO0O0();
            int iOooO00o3 = pt0VarOooO0O0.OooO00o(4);
            Character.toChars(iOooO00o3 != 0 ? ((ByteBuffer) pt0VarOooO0O0.OooO0oO).getInt(iOooO00o3 + pt0VarOooO0O0.OooO0Oo) : 0, (char[]) this.OooO0o, i7 * 2);
            pt0 pt0VarOooO0O02 = nq1Var.OooO0O0();
            int iOooO00o4 = pt0VarOooO0O02.OooO00o(16);
            if (iOooO00o4 != 0) {
                int i8 = iOooO00o4 + pt0VarOooO0O02.OooO0Oo;
                i3 = ((ByteBuffer) pt0VarOooO0O02.OooO0oO).getInt(((ByteBuffer) pt0VarOooO0O02.OooO0oO).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            if (i3 > 0) {
                rt0 rt0Var = (rt0) this.OooO0oO;
                pt0 pt0VarOooO0O03 = nq1Var.OooO0O0();
                int iOooO00o5 = pt0VarOooO0O03.OooO00o(16);
                if (iOooO00o5 != 0) {
                    int i9 = iOooO00o5 + pt0VarOooO0O03.OooO0Oo;
                    i4 = ((ByteBuffer) pt0VarOooO0O03.OooO0oO).getInt(((ByteBuffer) pt0VarOooO0O03.OooO0oO).getInt(i9) + i9);
                } else {
                    i4 = 0;
                }
                rt0Var.OooO00o(nq1Var, 0, i4 - 1);
            } else {
                ra.OooOOO("invalid metadata codepoint length");
                throw null;
            }
        }
    }

    public ho1(Context context, View view) {
        this.OooO0Oo = 13;
        this.OooO0o = view;
        ss0 ss0Var = new ss0(context);
        this.OooO0o0 = ss0Var;
        ss0Var.OooO0oo = new nz0(this, 1);
        ct0 ct0Var = new ct0(context, ss0Var, view, false, R.attr.popupMenuStyle, 0);
        this.OooO0oO = ct0Var;
        ct0Var.OooO0o = 0;
        ct0Var.OooOO0 = new u31();
    }

    public ho1(Context context, ActionMode.Callback callback) {
        this.OooO0Oo = 19;
        this.OooO0o = context;
        this.OooO0o0 = callback;
        this.OooO0oO = new ArrayList();
        this.OooO0oo = new gh1(0);
    }

    public ho1(dc1 dc1Var, e81 e81Var) {
        this.OooO0Oo = 16;
        this.OooO0oo = dc1Var;
        this.OooO0o0 = e81Var;
    }
}
