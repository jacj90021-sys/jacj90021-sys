package com.cmaster.cloner;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class h60 implements Handler.Callback {
    public static h60 OooOo0;
    public final d60 OooO;
    public long OooO0Oo;
    public gm1 OooO0o;
    public boolean OooO0o0;
    public s22 OooO0oO;
    public final Context OooO0oo;
    public final er1 OooOO0;
    public final AtomicInteger OooOO0O;
    public final AtomicInteger OooOO0o;
    public final m3 OooOOO;
    public final ConcurrentHashMap OooOOO0;
    public final m3 OooOOOO;
    public final xi1 OooOOOo;
    public volatile boolean OooOOo0;
    public static final Status OooOOo = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status OooOOoo = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object OooOo00 = new Object();

    public h60(Context context, Looper looper) {
        d60 d60Var = d60.OooO0Oo;
        this.OooO0Oo = 10000L;
        this.OooO0o0 = false;
        this.OooOO0O = new AtomicInteger(1);
        this.OooOO0o = new AtomicInteger(0);
        this.OooOOO0 = new ConcurrentHashMap(5, 0.75f, 1);
        this.OooOOO = new m3(0);
        this.OooOOOO = new m3(0);
        this.OooOOo0 = true;
        this.OooO0oo = context;
        xi1 xi1Var = new xi1(looper, this, 2);
        Looper.getMainLooper();
        this.OooOOOo = xi1Var;
        this.OooO = d60Var;
        this.OooOO0 = new er1(5);
        PackageManager packageManager = context.getPackageManager();
        if (eq2.OooO0o0 == null) {
            eq2.OooO0o0 = Boolean.valueOf(vx2.OooO00o() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (eq2.OooO0o0.booleanValue()) {
            this.OooOOo0 = false;
        }
        xi1Var.sendMessage(xi1Var.obtainMessage(6));
    }

    public static Status OooO0OO(oOO0O0 ooo0o0, gh ghVar) {
        return new Status(17, rj.OooO0o0("API: ", (String) ooo0o0.OooO0O0.OooO0o, " is not available on this device. Connection failed with: ", String.valueOf(ghVar)), ghVar.OooO0o, ghVar);
    }

    public static h60 OooO0o0(Context context) {
        h60 h60Var;
        HandlerThread handlerThread;
        synchronized (OooOo00) {
            if (OooOo0 == null) {
                synchronized (v50.OooO00o) {
                    try {
                        handlerThread = v50.OooO0OO;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            v50.OooO0OO = handlerThread2;
                            handlerThread2.start();
                            handlerThread = v50.OooO0OO;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = d60.OooO0OO;
                OooOo0 = new h60(applicationContext, looper);
            }
            h60Var = OooOo0;
        }
        return h60Var;
    }

    public final boolean OooO00o() {
        if (this.OooO0o0) {
            return false;
        }
        yb1 yb1Var = (yb1) xb1.OooOooO().OooO0o0;
        if (yb1Var != null && !yb1Var.OooO0o0) {
            return false;
        }
        int i = ((SparseIntArray) this.OooOO0.OooO0o0).get(203400000, -1);
        return i == -1 || i == 0;
    }

    public final boolean OooO0O0(gh ghVar, int i) throws Resources.NotFoundException {
        d60 d60Var = this.OooO;
        d60Var.getClass();
        Context context = this.OooO0oo;
        if (!hh0.OooO00o(context)) {
            int i2 = ghVar.OooO0o0;
            PendingIntent activity = ghVar.OooO0o;
            if (!((i2 == 0 || activity == null) ? false : true)) {
                activity = null;
                Intent intentOooO0O0 = d60Var.OooO0O0(context, null, i2);
                if (intentOooO0O0 != null) {
                    activity = PendingIntent.getActivity(context, 0, intentOooO0O0, 201326592);
                }
            }
            if (activity != null) {
                int i3 = GoogleApiActivity.OooO0o0;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                d60Var.OooO0oO(context, i2, PendingIntent.getActivity(context, 0, intent, t22.OooO00o | 134217728));
                return true;
            }
        }
        return false;
    }

    public final s12 OooO0Oo(b60 b60Var) {
        oOO0O0 ooo0o0 = b60Var.OooO0oo;
        ConcurrentHashMap concurrentHashMap = this.OooOOO0;
        s12 s12Var = (s12) concurrentHashMap.get(ooo0o0);
        if (s12Var == null) {
            s12Var = new s12(this, b60Var);
            concurrentHashMap.put(ooo0o0, s12Var);
        }
        if (s12Var.OooO0o0.requiresSignIn()) {
            this.OooOOOO.add(ooo0o0);
        }
        s12Var.OooOO0();
        return s12Var;
    }

    public final void OooO0o(gh ghVar, int i) {
        if (OooO0O0(ghVar, i)) {
            return;
        }
        xi1 xi1Var = this.OooOOOo;
        xi1Var.sendMessage(xi1Var.obtainMessage(5, i, 0, ghVar));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        s12 s12Var;
        iz[] izVarArrOooO0O0;
        int i = message.what;
        switch (i) {
            case 1:
                this.OooO0Oo = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.OooOOOo.removeMessages(12);
                for (oOO0O0 ooo0o0 : this.OooOOO0.keySet()) {
                    xi1 xi1Var = this.OooOOOo;
                    xi1Var.sendMessageDelayed(xi1Var.obtainMessage(12, ooo0o0), this.OooO0Oo);
                }
                return true;
            case 2:
                throw px0.OooOO0O(message.obj);
            case 3:
                for (s12 s12Var2 : this.OooOOO0.values()) {
                    by2.OooO0OO(s12Var2.OooOOOo.OooOOOo);
                    s12Var2.OooOOO = null;
                    s12Var2.OooOO0();
                }
                return true;
            case 4:
            case 8:
            case 13:
                c22 c22Var = (c22) message.obj;
                s12 s12VarOooO0Oo = (s12) this.OooOOO0.get(c22Var.OooO0OO.OooO0oo);
                if (s12VarOooO0Oo == null) {
                    s12VarOooO0Oo = OooO0Oo(c22Var.OooO0OO);
                }
                if (!s12VarOooO0Oo.OooO0o0.requiresSignIn() || this.OooOO0o.get() == c22Var.OooO0O0) {
                    s12VarOooO0Oo.OooOO0O(c22Var.OooO00o);
                    return true;
                }
                c22Var.OooO00o.OooO0OO(OooOOo);
                s12VarOooO0Oo.OooOOO();
                return true;
            case 5:
                int i2 = message.arg1;
                gh ghVar = (gh) message.obj;
                Iterator it = this.OooOOO0.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        s12Var = (s12) it.next();
                        if (s12Var.OooOO0 == i2) {
                        }
                    } else {
                        s12Var = null;
                    }
                }
                if (s12Var == null) {
                    Log.wtf("GoogleApiManager", rj.OooO00o(i2, "Could not find API instance ", " while trying to fail enqueued calls."), new Exception());
                    return true;
                }
                int i3 = ghVar.OooO0o0;
                if (i3 != 13) {
                    s12Var.OooO0O0(OooO0OO(s12Var.OooO0o, ghVar));
                    return true;
                }
                this.OooO.getClass();
                AtomicBoolean atomicBoolean = n60.OooO00o;
                s12Var.OooO0O0(new Status(17, rj.OooO0o0("Error resolution was canceled by the user, original error message: ", gh.OooO00o(i3), ": ", ghVar.OooO0oO), null, null));
                return true;
            case 6:
                if (this.OooO0oo.getApplicationContext() instanceof Application) {
                    Application application = (Application) this.OooO0oo.getApplicationContext();
                    n5 n5Var = n5.OooO0oo;
                    synchronized (n5Var) {
                        try {
                            if (!n5Var.OooO0oO) {
                                application.registerActivityLifecycleCallbacks(n5Var);
                                application.registerComponentCallbacks(n5Var);
                                n5Var.OooO0oO = true;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    r12 r12Var = new r12(this);
                    synchronized (n5Var) {
                        n5Var.OooO0o.add(r12Var);
                    }
                    AtomicBoolean atomicBoolean2 = n5Var.OooO0Oo;
                    AtomicBoolean atomicBoolean3 = n5Var.OooO0o0;
                    if (!atomicBoolean3.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean3.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean2.set(true);
                        }
                    }
                    if (!atomicBoolean2.get()) {
                        this.OooO0Oo = 300000L;
                        return true;
                    }
                }
                return true;
            case 7:
                OooO0Oo((b60) message.obj);
                return true;
            case 9:
                if (this.OooOOO0.containsKey(message.obj)) {
                    s12 s12Var3 = (s12) this.OooOOO0.get(message.obj);
                    by2.OooO0OO(s12Var3.OooOOOo.OooOOOo);
                    if (s12Var3.OooOO0o) {
                        s12Var3.OooOO0();
                        return true;
                    }
                }
                return true;
            case 10:
                m3 m3Var = this.OooOOOO;
                m3Var.getClass();
                h3 h3Var = new h3(m3Var);
                while (h3Var.hasNext()) {
                    s12 s12Var4 = (s12) this.OooOOO0.remove((oOO0O0) h3Var.next());
                    if (s12Var4 != null) {
                        s12Var4.OooOOO();
                    }
                }
                this.OooOOOO.clear();
                return true;
            case 11:
                if (this.OooOOO0.containsKey(message.obj)) {
                    s12 s12Var5 = (s12) this.OooOOO0.get(message.obj);
                    h60 h60Var = s12Var5.OooOOOo;
                    by2.OooO0OO(h60Var.OooOOOo);
                    boolean z = s12Var5.OooOO0o;
                    if (z) {
                        oOO0O0 ooo0o02 = s12Var5.OooO0o;
                        xi1 xi1Var2 = s12Var5.OooOOOo.OooOOOo;
                        if (z) {
                            xi1Var2.removeMessages(11, ooo0o02);
                            xi1Var2.removeMessages(9, ooo0o02);
                            s12Var5.OooOO0o = false;
                        }
                        s12Var5.OooO0O0(h60Var.OooO.OooO0OO(h60Var.OooO0oo, e60.OooO00o) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        s12Var5.OooO0o0.disconnect("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (this.OooOOO0.containsKey(message.obj)) {
                    s12 s12Var6 = (s12) this.OooOOO0.get(message.obj);
                    by2.OooO0OO(s12Var6.OooOOOo.OooOOOo);
                    oOO000 ooo000 = s12Var6.OooO0o0;
                    if (ooo000.isConnected() && s12Var6.OooO.isEmpty()) {
                        vr1 vr1Var = s12Var6.OooO0oO;
                        if (((Map) vr1Var.OooO0o0).isEmpty() && ((Map) vr1Var.OooO0o).isEmpty()) {
                            ooo000.disconnect("Timing out service connection.");
                            return true;
                        }
                        s12Var6.OooO0oO();
                    }
                    return true;
                }
                return true;
            case 14:
                throw px0.OooOO0O(message.obj);
            case 15:
                t12 t12Var = (t12) message.obj;
                if (this.OooOOO0.containsKey(t12Var.OooO00o)) {
                    s12 s12Var7 = (s12) this.OooOOO0.get(t12Var.OooO00o);
                    if (s12Var7.OooOOO0.contains(t12Var) && !s12Var7.OooOO0o) {
                        if (s12Var7.OooO0o0.isConnected()) {
                            s12Var7.OooO0Oo();
                            return true;
                        }
                        s12Var7.OooOO0();
                        return true;
                    }
                }
                return true;
            case 16:
                t12 t12Var2 = (t12) message.obj;
                if (this.OooOOO0.containsKey(t12Var2.OooO00o)) {
                    s12 s12Var8 = (s12) this.OooOOO0.get(t12Var2.OooO00o);
                    ArrayList arrayList = s12Var8.OooOOO0;
                    h60 h60Var2 = s12Var8.OooOOOo;
                    LinkedList<z12> linkedList = s12Var8.OooO0Oo;
                    if (arrayList.remove(t12Var2)) {
                        h60Var2.OooOOOo.removeMessages(15, t12Var2);
                        h60Var2.OooOOOo.removeMessages(16, t12Var2);
                        iz izVar = t12Var2.OooO0O0;
                        ArrayList arrayList2 = new ArrayList(linkedList.size());
                        for (z12 z12Var : linkedList) {
                            if (z12Var != null && (izVarArrOooO0O0 = z12Var.OooO0O0(s12Var8)) != null) {
                                int length = izVarArrOooO0O0.length;
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= length) {
                                        break;
                                    }
                                    if (!uw2.OooO00o(izVarArrOooO0O0[i4], izVar)) {
                                        i4++;
                                    } else if (i4 >= 0) {
                                        arrayList2.add(z12Var);
                                    }
                                }
                            }
                        }
                        int size = arrayList2.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            z12 z12Var2 = (z12) arrayList2.get(i5);
                            linkedList.remove(z12Var2);
                            z12Var2.OooO0Oo(new cr1(izVar));
                        }
                    }
                }
                return true;
            case 17:
                gm1 gm1Var = this.OooO0o;
                if (gm1Var != null) {
                    if (gm1Var.OooO0Oo > 0 || OooO00o()) {
                        if (this.OooO0oO == null) {
                            this.OooO0oO = new s22(this.OooO0oo, s22.OooOO0o, hm1.OooO0OO, a60.OooO0O0);
                        }
                        this.OooO0oO.OooO0o0(gm1Var);
                    }
                    this.OooO0o = null;
                    return true;
                }
                return true;
            case 18:
                b22 b22Var = (b22) message.obj;
                if (b22Var.OooO0OO == 0) {
                    gm1 gm1Var2 = new gm1(b22Var.OooO0O0, Arrays.asList(b22Var.OooO00o));
                    if (this.OooO0oO == null) {
                        this.OooO0oO = new s22(this.OooO0oo, s22.OooOO0o, hm1.OooO0OO, a60.OooO0O0);
                    }
                    this.OooO0oO.OooO0o0(gm1Var2);
                    return true;
                }
                gm1 gm1Var3 = this.OooO0o;
                if (gm1Var3 != null) {
                    List list = gm1Var3.OooO0o0;
                    if (gm1Var3.OooO0Oo != b22Var.OooO0O0 || (list != null && list.size() >= b22Var.OooO0Oo)) {
                        this.OooOOOo.removeMessages(17);
                        gm1 gm1Var4 = this.OooO0o;
                        if (gm1Var4 != null) {
                            if (gm1Var4.OooO0Oo > 0 || OooO00o()) {
                                if (this.OooO0oO == null) {
                                    this.OooO0oO = new s22(this.OooO0oo, s22.OooOO0o, hm1.OooO0OO, a60.OooO0O0);
                                }
                                this.OooO0oO.OooO0o0(gm1Var4);
                            }
                            this.OooO0o = null;
                        }
                    } else {
                        gm1 gm1Var5 = this.OooO0o;
                        wt0 wt0Var = b22Var.OooO00o;
                        if (gm1Var5.OooO0o0 == null) {
                            gm1Var5.OooO0o0 = new ArrayList();
                        }
                        gm1Var5.OooO0o0.add(wt0Var);
                    }
                }
                if (this.OooO0o == null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(b22Var.OooO00o);
                    this.OooO0o = new gm1(b22Var.OooO0O0, arrayList3);
                    xi1 xi1Var3 = this.OooOOOo;
                    xi1Var3.sendMessageDelayed(xi1Var3.obtainMessage(17), b22Var.OooO0OO);
                    return true;
                }
                return true;
            case 19:
                this.OooO0o0 = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i);
                return false;
        }
    }
}
