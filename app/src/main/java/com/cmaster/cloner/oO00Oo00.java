package com.cmaster.cloner;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class oO00Oo00 extends LinkedHashMap implements IBinder.DeathRecipient {
    public static final Handler OooOOoo;
    public final ComponentName OooO;
    public final ComponentName OooO0Oo;
    public final ComponentName OooO0o;
    public final ComponentName OooO0o0;
    public final ComponentName OooO0oO;
    public final ComponentName OooO0oo;
    public final ComponentName OooOO0;
    public final ComponentName OooOO0O;
    public final ComponentName OooOO0o;
    public final ComponentName OooOOO;
    public final ComponentName OooOOO0;
    public final ComponentName OooOOOO;
    public final mf0 OooOOOo;
    public final ConcurrentHashMap OooOOo = new ConcurrentHashMap(10);
    public final String OooOOo0;

    public oO00Oo00(IBinder iBinder, String str) throws RemoteException {
        ActivityManager.RecentTaskInfo taskInfo;
        ComponentName component;
        this.OooOOo0 = str;
        this.OooOOOo = tg1.o0000o0O(iBinder);
        iBinder.linkToDeath(this, 0);
        this.OooOO0 = new ComponentName(str, jx1.OooO0Oo(""));
        this.OooOO0O = new ComponentName(str, jx1.OooO0Oo(u7.OooO00o(new byte[]{-94}, new byte[]{-10, -84, 99, -76, 51, -100, 108, -79})));
        this.OooOO0o = new ComponentName(str, jx1.OooO0Oo(u7.OooO00o(new byte[]{86}, new byte[]{19, 98, 0, 18, 103, 4, 108, -27})));
        this.OooO0Oo = new ComponentName(str, jx1.OooO0Oo(u7.OooO00o(new byte[]{-45}, new byte[]{-97, -123, -66, -16, 18, 14, 38, 48})));
        this.OooO0o0 = new ComponentName(str, jx1.OooO0Oo(u7.OooO00o(new byte[]{-125, 69}, new byte[]{-49, 17, -10, -98, -51, -92, -91, 7})));
        this.OooO0o = new ComponentName(str, jx1.OooO0Oo(u7.OooO00o(new byte[]{-97, -3}, new byte[]{-45, -72, 96, 70, -30, -114, 92, 26})));
        this.OooO0oO = new ComponentName(str, jx1.OooO0Oo(u7.OooO00o(new byte[]{84}, new byte[]{4, -11, 66, -70, 20, -34, -9, 99})));
        this.OooO0oo = new ComponentName(str, jx1.OooO0Oo(u7.OooO00o(new byte[]{-58, -32}, new byte[]{-106, -76, -1, -25, -16, -6, -66, 66})));
        this.OooO = new ComponentName(str, jx1.OooO0Oo(u7.OooO00o(new byte[]{-73, -110}, new byte[]{-25, -41, -86, -36, -69, -107, -27, -63})));
        this.OooOOO0 = new ComponentName(str, jx1.OooO0Oo(u7.OooO00o(new byte[]{-64}, new byte[]{-126, 91, -35, 84, -127, -72, 39, -35})));
        this.OooOOO = new ComponentName(str, jx1.OooO0Oo(u7.OooO00o(new byte[]{-21, 42}, new byte[]{-87, 126, 66, -90, 26, -28, 63, 122})));
        this.OooOOOO = new ComponentName(str, jx1.OooO0Oo(u7.OooO00o(new byte[]{-90, 91}, new byte[]{-28, 30, 53, 113, 119, 11, -44, 17})));
        new ComponentName(str, jx1.OooO0oO());
        try {
            for (ActivityManager.AppTask appTask : OooO00o()) {
                try {
                    taskInfo = appTask.getTaskInfo();
                } catch (Throwable unused) {
                    taskInfo = null;
                }
                if (taskInfo != null) {
                    Intent intent = taskInfo.baseIntent;
                    int i = jx1.OooO00o;
                    if ((TextUtils.equals(intent.getAction(), o0O0o000.OooO0o0) && (component = intent.getComponent()) != null) ? TextUtils.equals(component.getClassName(), jx1.OooO0oO()) ? true : TextUtils.equals(component.getClassName(), jx1.OooO0oo()) : false) {
                        appTask.finishAndRemoveTask();
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        LinkedHashMap linkedHashMapOooO0O0 = OooO0O0();
        int i2 = 0;
        while (true) {
            int i3 = jx1.OooO00o;
            if (i2 >= 300) {
                this.OooO0Oo();
                return;
            }
            String strOooOOOo = px0.OooOOOo(new byte[]{14, 42, -23, 42, -89, -94}, new byte[]{52, 75, -114, 79, -55, -42, 67, 50}, rj.OooOO0(str), i2);
            String strOooO0O0 = jx1.OooO0O0(i2, str);
            oO00Oo00 oo00oo00 = this;
            oO00Oo0 oo00oo0 = new oO00Oo0(oo00oo00, i2, strOooO0O0, strOooOOOo, new ComponentName(str, jx1.OooO00o(i2)));
            oo00oo00.put(strOooO0O0, oo00oo0);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) linkedHashMapOooO0O0.get(strOooOOOo);
            if (runningAppProcessInfo != null) {
                oo00oo0.OooOO0o = 4;
                try {
                    oo00oo00.OooOOOo.o0000oOo(runningAppProcessInfo.pid);
                } catch (Throwable unused3) {
                }
                oo00oo00.OooOOo.put(strOooOOOo, oo00oo0);
            }
            i2++;
            this = oo00oo00;
        }
    }

    public final native List OooO00o();

    public final native LinkedHashMap OooO0O0();

    public final native void OooO0OO(oO00Oo0 oo00oo0);

    public final native void OooO0Oo();

    @Override // android.os.IBinder.DeathRecipient
    public final native void binderDied();

    static {
        DexUtils.classesInit0(22);
        OooOOoo = new Handler(cx1.OooO0OO.getLooper());
    }
}
