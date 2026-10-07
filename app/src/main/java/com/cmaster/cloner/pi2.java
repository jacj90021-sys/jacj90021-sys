package com.cmaster.cloner;

import android.app.Application;
import android.app.job.JobParameters;
import android.content.pm.ProviderInfo;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.ConditionVariable;
import android.os.IBinder;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.bumptech.matrix.ui.qrcode.ActivityBarCodeHistory;
import com.bumptech.matrix.ui.qrcode.ActivityBarCodePreview;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.internal.ads.zzbcj;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class pi2 implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final Object OooO0o;
    public Object OooO0o0;

    public pi2(dp dpVar, ArrayList arrayList, ei1 ei1Var) {
        this.OooO0Oo = 16;
        this.OooO0o0 = arrayList;
        this.OooO0o = ei1Var;
    }

    private final void OooO00o() {
        im2 im2Var;
        wz0 wz0Var = (wz0) this.OooO0o0;
        r51 r51Var = (r51) this.OooO0o;
        if (wz0Var.OooO0O0 != pg.OooO0OO) {
            qa.OooO0o("provide() can be called only once.");
            return;
        }
        synchronized (wz0Var) {
            im2Var = wz0Var.OooO00o;
            wz0Var.OooO00o = null;
            wz0Var.OooO0O0 = r51Var;
        }
        im2Var.getClass();
    }

    private final void OooO0O0() {
        ml0 ml0Var = (ml0) this.OooO0o0;
        r51 r51Var = (r51) this.OooO0o;
        synchronized (ml0Var) {
            try {
                if (ml0Var.OooO0O0 == null) {
                    ml0Var.OooO00o.add(r51Var);
                } else {
                    ml0Var.OooO0O0.add(r51Var.get());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void OooO0OO() {
        synchronized (((ConstraintTrackingWorker) this.OooO0o).OooOO0) {
            boolean z = ((ConstraintTrackingWorker) this.OooO0o).OooOO0O;
            uf1 uf1Var = ((ConstraintTrackingWorker) this.OooO0o).OooOO0o;
            if (z) {
                uf1Var.OooO0oo(new pn0());
            } else {
                uf1Var.OooOO0((nn0) this.OooO0o0);
            }
        }
    }

    private final void OooO0Oo() {
        synchronized (((mx) this.OooO0o).OooO0Oo) {
            ((mx) this.OooO0o).OooO0Oo.remove(((lx) this.OooO0o0).OooO0Oo);
        }
        lx lxVar = (lx) this.OooO0o0;
        hx1 hx1VarO0000o0O = hx1.o0000o0O();
        IBinder iBinder = lxVar.OooO0oo;
        int i = lxVar.OooO0o;
        hx1VarO0000o0O.getClass();
        if (iBinder != null) {
            try {
                o0O0oo00.o0000o0O(iBinder).o000OO0O(lxVar, i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private final void OooO0o() {
        synchronized (((o01) ((xb1) this.OooO0o).OooO0o0).OooOOOO) {
            try {
                ((o01) ((xb1) this.OooO0o).OooO0o0).OooOOOO.remove(((t01) this.OooO0o0).OooO0oo);
                ((o01) ((xb1) this.OooO0o).OooO0o0).o000oooo((t01) this.OooO0o0);
                File fileO00O0000 = ((o01) ((xb1) this.OooO0o).OooO0o0).o00O0000(((t01) this.OooO0o0).OooO0oo);
                if (fileO00O0000.exists()) {
                    fileO00O0000.delete();
                }
                ((o01) ((xb1) this.OooO0o).OooO0o0).o00O00O();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void OooO0o0() {
        RecyclerView recyclerView = ((vj0) this.OooO0o).OooOo0;
        if (recyclerView == null || !recyclerView.OooOo0O) {
            return;
        }
        sj0 sj0Var = (sj0) this.OooO0o0;
        if (sj0Var.OooOO0O || sj0Var.OooO0o0.OooO0O0() == -1) {
            return;
        }
        f71 itemAnimator = ((vj0) this.OooO0o).OooOo0.getItemAnimator();
        if (itemAnimator == null || !itemAnimator.OooO0o()) {
            ArrayList arrayList = ((vj0) this.OooO0o).OooOOoo;
            int size = arrayList.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                if (((sj0) arrayList.get(i2)).OooOO0o) {
                }
            }
            o00Oo00 o00oo00 = ((vj0) this.OooO0o).OooOOOo;
            y71 y71Var = ((sj0) this.OooO0o0).OooO0o0;
            o00oo00.getClass();
            int iOooO0OO = y71Var.OooO0OO();
            s5 s5Var = (s5) ((ActivityBarCodeHistory) o00oo00.OooO0oO).Oooo000.get(iOooO0OO);
            oo00oO oo00oo = (oo00oO) o00oo00.OooO0o;
            oo00oo.OooO0Oo.remove(iOooO0OO);
            oo00oo.OooO00o.OooO0o(iOooO0OO, 1);
            v5 v5VarOooO0OO = v5.OooO0OO();
            synchronized (v5VarOooO0OO) {
                v5VarOooO0OO.OooO00o.remove(s5Var);
                o00OOOO0 o00oooo0 = v5VarOooO0OO.OooO0O0;
                if (o00oooo0 != null) {
                    ActivityBarCodeHistory activityBarCodeHistory = (ActivityBarCodeHistory) o00oooo0.OooO0Oo;
                    oo00oO oo00oo2 = (oo00oO) o00oooo0.OooO0o0;
                    int i3 = ActivityBarCodeHistory.Oooo00O;
                    activityBarCodeHistory.Oooo000 = v5.OooO0OO().OooO00o;
                    activityBarCodeHistory.runOnUiThread(new o00OOOOo(oo00oo2, i));
                }
                synchronized (v5VarOooO0OO) {
                    p41.OooO00o(v5VarOooO0OO.OooO00o);
                }
                return;
            }
            return;
        }
        ((vj0) this.OooO0o).OooOo0.post(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        IBinder iBinderOooO00o;
        pi2 pi2Var;
        qs0 qs0Var;
        int i;
        int i2;
        int i3;
        int[] iArr;
        String strOooO00o;
        pi2 pi2Var2 = this;
        int i4 = 1;
        int i5 = 0;
        switch (pi2Var2.OooO0Oo) {
            case 0:
                Object obj = ((nj2) pi2Var2.OooO0o0).OooO0Oo;
                Throwable th = obj instanceof dh2 ? ((dh2) obj).OooO00o : null;
                if (th != null) {
                    ((vc3) pi2Var2.OooO0o).OooO00o(th);
                    return;
                }
                try {
                    nj2 nj2Var = (nj2) pi2Var2.OooO0o0;
                    if (!nj2Var.isDone()) {
                        throw new IllegalStateException(g73.OooO00o("Future was expected to be done: %s", nj2Var));
                    }
                    boolean z = false;
                    while (true) {
                        try {
                            Object obj2 = nj2Var.get();
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            vc3 vc3Var = (vc3) pi2Var2.OooO0o;
                            Float f = (Float) obj2;
                            if (f.floatValue() >= 1.0f) {
                                wc3 wc3Var = vc3Var.OooO0o0;
                                float fFloatValue = f.floatValue();
                                synchronized (wc3Var.OooO0OO) {
                                    wc3Var.OooOO0 = fFloatValue;
                                    wc3Var.OooO0o0(false);
                                }
                                vc3Var.OooO0o0.OooO0Oo(vc3Var.OooO00o, vc3Var.OooO0O0, f.floatValue(), vc3Var.OooO0OO);
                            }
                            vc3Var.OooO0o0.OooO0O0.set(false);
                            return;
                        } catch (InterruptedException unused) {
                            z = true;
                        } catch (Throwable th2) {
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th2;
                        }
                    }
                } catch (ExecutionException e) {
                    ((vc3) pi2Var2.OooO0o).OooO00o(e.getCause());
                    return;
                } catch (Throwable th3) {
                    ((vc3) pi2Var2.OooO0o).OooO00o(th3);
                    return;
                }
            case 1:
                o00O0OO0 o00o0oo0 = (o00O0OO0) pi2Var2.OooO0o0;
                o00O0OOO o00o0ooo = (o00O0OOO) pi2Var2.OooO0o;
                ss0 ss0Var = o00o0ooo.OooO0o;
                if (ss0Var != null && (qs0Var = ss0Var.OooO0oo) != null) {
                    qs0Var.OooOO0(ss0Var);
                }
                View view = (View) o00o0ooo.OooOO0O;
                if (view != null && view.getWindowToken() != null) {
                    if (o00o0oo0.OooO0O0()) {
                        o00o0ooo.OooOo0O = o00o0oo0;
                    } else if (o00o0oo0.OooO0o0 != null) {
                        o00o0oo0.OooO0Oo(0, 0, false, false);
                        o00o0ooo.OooOo0O = o00o0oo0;
                    }
                }
                o00o0ooo.OooOo = null;
                return;
            case 2:
                ActivityBarCodePreview activityBarCodePreview = (ActivityBarCodePreview) pi2Var2.OooO0o;
                Uri uri = (Uri) pi2Var2.OooO0o0;
                String str = ActivityBarCodePreview.Oooo0OO;
                try {
                    new b6(activityBarCodePreview, null).OooO00o(ug0.OooO00o(uri, activityBarCodePreview)).OooO0O0(am1.OooO00o, new o0O0o(activityBarCodePreview));
                    return;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            case 3:
                ((o0oO0Ooo) pi2Var2.OooO0o0).OooO0Oo = pi2Var2.OooO0o;
                return;
            case 4:
                ((Application) pi2Var2.OooO0o0).unregisterActivityLifecycleCallbacks((o0oO0Ooo) pi2Var2.OooO0o);
                return;
            case 5:
                Object obj3 = pi2Var2.OooO0o;
                Object obj4 = pi2Var2.OooO0o0;
                try {
                    Method method = o0O00o00.OooO0Oo;
                    if (method != null) {
                        method.invoke(obj4, obj3, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        o0O00o00.OooO0o0.invoke(obj4, obj3, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e3) {
                    if (e3.getClass() == RuntimeException.class && e3.getMessage() != null && e3.getMessage().startsWith("Unable to stop")) {
                        throw e3;
                    }
                    return;
                } catch (Throwable th4) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th4);
                    return;
                }
            case 6:
                ConditionVariable conditionVariable = (ConditionVariable) ((o0O0oo00) pi2Var2.OooO0o).OooO0Oo.OooO0O0.get(((ProviderInfo) pi2Var2.OooO0o0).authority);
                if (conditionVariable != null) {
                    conditionVariable.open();
                    return;
                }
                return;
            case 7:
                try {
                    Object obj5 = oO00OOo0.OooO0o0;
                    synchronized (obj5) {
                        w90 w90Var = ((oO00OOO) pi2Var2.OooO0o).OooO.OooOO0O;
                        if (!oO00OOO.OooO0Oo(w90Var)) {
                            oO00Oo0 oo00oo0 = ((oO00OOO) pi2Var2.OooO0o).OooO;
                            oo00oo0.getClass();
                            try {
                                iBinderOooO00o = l82.OooO00o(oo00oo0.OooO0Oo);
                                oo00oo0.OooOO0O.asBinder();
                            } catch (Throwable unused2) {
                            }
                            if (iBinderOooO00o == null) {
                                u7.OooO00o(new byte[]{-104, -15, 80, 126, -80, -26, -81, -72, -71, -112, 98, 94, -7, -6, -93, -78}, new byte[]{-34, -80, 4, 63, -112, -106, -58, -42});
                                int i6 = fp0.OooO00o;
                            }
                            Object obj6 = oO00OOo0.OooO0o0;
                            synchronized (obj6) {
                                w90 w90Var2 = ((oO00OOO) pi2Var2.OooO0o).OooO.OooOO0O;
                                boolean zOooO0Oo = oO00OOO.OooO0Oo(w90Var2);
                                oO00OO0O oo00oo0o = (oO00OO0O) pi2Var2.OooO0o0;
                                if (zOooO0Oo) {
                                    oo00oo0o.OooO0Oo(w90Var2);
                                    boolean zOooO0O0 = ((oO00OO0O) pi2Var2.OooO0o0).OooO0O0();
                                    pi2Var2 = pi2Var2;
                                    if (!zOooO0O0) {
                                        synchronized (obj6) {
                                            ((oO00OO0O) pi2Var2.OooO0o0).OooO0Oo(null);
                                        }
                                        byte[] bArr = {-79, 35, 35, 20, -108, -103, -7, -98};
                                        u7.OooO00o(new byte[]{-9, 98, 119, 85, -76, -23, -112, -16, -42, 3, 69, 117, -3, -11, -100, -6}, bArr);
                                        pi2Var = bArr;
                                    }
                                    return;
                                }
                                oo00oo0o.OooO0Oo(null);
                                boolean zOooO0O02 = ((oO00OO0O) pi2Var2.OooO0o0).OooO0O0();
                                pi2Var2 = pi2Var2;
                                if (!zOooO0O02) {
                                    synchronized (obj6) {
                                        ((oO00OO0O) pi2Var2.OooO0o0).OooO0Oo(null);
                                    }
                                    byte[] bArr2 = {-38, -10, -9, 107, -78, 48, -13, -39};
                                    u7.OooO00o(new byte[]{-100, -73, -93, 42, -110, 64, -102, -73, -67, -42, -111, 10, -37, 92, -106, -67}, bArr2);
                                    pi2Var = bArr2;
                                }
                                return;
                            }
                        }
                        ((oO00OO0O) pi2Var2.OooO0o0).OooO0Oo(w90Var);
                        if (((oO00OO0O) pi2Var2.OooO0o0).OooO0O0()) {
                            return;
                        }
                        synchronized (obj5) {
                            ((oO00OO0O) pi2Var2.OooO0o0).OooO0Oo(null);
                        }
                        byte[] bArr3 = {-122, 2, 44, 22, -9, -31, -127, -36};
                        u7.OooO00o(new byte[]{-64, 67, 120, 87, -41, -111, -24, -78, -31, 34, 74, 119, -98, -115, -28, -72}, bArr3);
                        pi2Var = bArr3;
                    }
                    int i7 = fp0.OooO00o;
                    pi2Var2 = pi2Var;
                    return;
                } catch (Throwable th5) {
                    if (!((oO00OO0O) pi2Var2.OooO0o0).OooO0O0()) {
                        synchronized (oO00OOo0.OooO0o0) {
                            ((oO00OO0O) pi2Var2.OooO0o0).OooO0Oo(null);
                            u7.OooO00o(new byte[]{-34, -123, -4, 28, -101, 83, -57, -68, -1, -28, -50, 60, -46, 79, -53, -74}, new byte[]{-104, -60, -88, 93, -69, 35, -82, -46});
                            int i8 = fp0.OooO00o;
                        }
                    }
                    throw th5;
                }
            case 8:
                List<cc> list = ((k2) pi2Var2.OooO0o).OooO0o.OooO0o0.OooO0o;
                boolean z2 = !((List) pi2Var2.OooO0o0).isEmpty() ? !list.isEmpty() : list.isEmpty();
                for (cc ccVar : list) {
                    if (ccVar instanceof wu1) {
                    }
                }
                if (z2) {
                    yu1 yu1Var = yu1.OooOOO0;
                    if (yu1Var.OooO0o.OooO0Oo() == Boolean.TRUE) {
                        return;
                    }
                    yu1Var.OooO0o0.OooOO0o(new ArrayList(yu1Var.OooO0oO.values()));
                    return;
                }
                return;
            case 9:
                u3 u3Var = (u3) pi2Var2.OooO0o;
                w3 w3Var = u3Var.OooO0oo;
                if (w3Var.OooO0oO == u3Var.OooO0o) {
                    ArrayList arrayList = u3Var.OooO0o0;
                    gr grVar = (gr) pi2Var2.OooO0o0;
                    Runnable runnable = u3Var.OooO0oO;
                    w3Var.OooO0o0 = arrayList;
                    w3Var.OooO0o = Collections.unmodifiableList(arrayList);
                    oe oeVar = w3Var.OooO00o;
                    int[] iArr2 = grVar.OooO0O0;
                    ArrayList arrayList2 = grVar.OooO00o;
                    int i9 = grVar.OooO0o0;
                    ay1 ay1Var = grVar.OooO0Oo;
                    m7 m7Var = new m7(oeVar);
                    ArrayDeque arrayDeque = new ArrayDeque();
                    int i10 = grVar.OooO0o;
                    int size = arrayList2.size() - 1;
                    int i11 = i10;
                    int i12 = i9;
                    while (size >= 0) {
                        fr frVar = (fr) arrayList2.get(size);
                        int i13 = frVar.OooO00o;
                        int i14 = i4;
                        int i15 = frVar.OooO0OO;
                        int i16 = i13 + i15;
                        int i17 = frVar.OooO0O0;
                        Runnable runnable2 = runnable;
                        int i18 = i17 + i15;
                        while (i12 > i16) {
                            i12--;
                            int i19 = iArr2[i12];
                            if ((i19 & 12) != 0) {
                                i2 = i13;
                                int i20 = i19 >> 4;
                                i3 = i16;
                                iArr = iArr2;
                                hr hrVarOooO00o = gr.OooO00o(arrayDeque, i20, false);
                                if (hrVarOooO00o != null) {
                                    int i21 = (i9 - hrVarOooO00o.OooO0O0) - 1;
                                    m7Var.OooO00o(i12, i21);
                                    if ((i19 & 4) != 0) {
                                        ay1Var.OooO(i12, i20);
                                        m7Var.OooO0Oo(i21, i14, null);
                                    }
                                } else {
                                    boolean z3 = i14;
                                    arrayDeque.add(new hr(i12, (i9 - i12) - (z3 ? 1 : 0), z3));
                                }
                            } else {
                                i2 = i13;
                                i3 = i16;
                                iArr = iArr2;
                                m7Var.OooO0OO(i12, i14);
                                i9--;
                            }
                            i13 = i2;
                            i16 = i3;
                            iArr2 = iArr;
                            i14 = 1;
                        }
                        int i22 = i13;
                        int[] iArr3 = iArr2;
                        while (i11 > i18) {
                            i11--;
                            int i23 = grVar.OooO0OO[i11];
                            if ((i23 & 12) != 0) {
                                int i24 = i23 >> 4;
                                i = i18;
                                hr hrVarOooO00o2 = gr.OooO00o(arrayDeque, i24, true);
                                if (hrVarOooO00o2 == null) {
                                    arrayDeque.add(new hr(i11, i9 - i12, false));
                                } else {
                                    m7Var.OooO00o((i9 - hrVarOooO00o2.OooO0O0) - 1, i12);
                                    if ((i23 & 4) != 0) {
                                        ay1Var.OooO(i24, i11);
                                        m7Var.OooO0Oo(i12, 1, null);
                                    }
                                }
                            } else {
                                i = i18;
                                m7Var.OooO0O0(i12, 1);
                                i9++;
                            }
                            i18 = i;
                        }
                        int i25 = i17;
                        int i26 = i22;
                        for (int i27 = 0; i27 < i15; i27++) {
                            if ((iArr3[i26] & 15) == 2) {
                                ay1Var.OooO(i26, i25);
                                m7Var.OooO0Oo(i26, 1, null);
                            }
                            i26++;
                            i25++;
                        }
                        size--;
                        runnable = runnable2;
                        i4 = 1;
                        i11 = i17;
                        i12 = i22;
                        iArr2 = iArr3;
                    }
                    Runnable runnable3 = runnable;
                    m7Var.OooO0o0();
                    Iterator it = w3Var.OooO0Oo.iterator();
                    if (it.hasNext()) {
                        throw px0.OooOO0o(it);
                    }
                    if (runnable3 != null) {
                        runnable3.run();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                nz0 nz0Var = (nz0) pi2Var2.OooO0o0;
                Typeface typeface = (Typeface) pi2Var2.OooO0o;
                py2 py2Var = (py2) nz0Var.OooO0o0;
                if (py2Var != null) {
                    py2Var.OooO0OO(typeface);
                    return;
                }
                return;
            case 11:
                pi2Var2.OooO00o();
                return;
            case 12:
                pi2Var2.OooO0O0();
                return;
            case 13:
                ArrayList arrayList3 = (ArrayList) pi2Var2.OooO0o0;
                int size2 = arrayList3.size();
                while (i5 < size2) {
                    Object obj7 = arrayList3.get(i5);
                    i5++;
                    sh shVar = (sh) obj7;
                    Object obj8 = ((gi) pi2Var2.OooO0o).OooO0o0;
                    shVar.OooO0O0 = obj8;
                    shVar.OooO0Oo(shVar.OooO0Oo, obj8);
                }
                return;
            case 14:
                pi2Var2.OooO0OO();
                return;
            case 15:
                l1 l1Var = (l1) pi2Var2.OooO0o;
                String str2 = (String) l1Var.OooO0o;
                sl slVar = (sl) l1Var.OooO0oO;
                String str3 = (String) pi2Var2.OooO0o0;
                if (str3 != null) {
                    strOooO00o = slVar.OooOo0o.OooOOO0.OooO00o(sn2.OooO00o("7jqQeuNGE5r4NotlrAETgOU=\n", "i0LkCIJocO8=\n"));
                    wu1 wu1Var = slVar.OooOo0o;
                    qj0 qj0Var = wu1Var.OooOOO0;
                    qj0Var.OooO0Oo(qj0.OooO0oo, str3);
                    qj0Var.OooO0OO();
                    wu1Var.OooO0OO(0);
                    i5 = 1;
                } else {
                    strOooO00o = null;
                }
                if (!TextUtils.equals(str2, (CharSequence) slVar.OooOo0o.OooO0o.OooO0o0)) {
                    wu1 wu1Var2 = slVar.OooOo0o;
                    qj0 qj0Var2 = wu1Var2.OooOOO0;
                    qj0Var2.OooO0Oo(qj0.OooO0oO, str2);
                    qj0Var2.OooO0OO();
                    wu1Var2.OooO0oO();
                    i5 = 1;
                }
                if (i5 != 0) {
                    if (strOooO00o != null) {
                        try {
                            new File(strOooO00o).delete();
                        } catch (Exception unused3) {
                        }
                    }
                    xj0 xj0Var = slVar.OooOoO;
                    int iOooO0O0 = xj0Var.OooO0O0();
                    qe qeVar = xj0Var.OooOo0;
                    if (qeVar != null) {
                        qeVar.OooO00o.OooO0Oo(iOooO0O0, 1, null);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                ArrayList arrayList4 = (ArrayList) pi2Var2.OooO0o0;
                ei1 ei1Var = (ei1) pi2Var2.OooO0o;
                if (arrayList4.contains(ei1Var)) {
                    arrayList4.remove(ei1Var);
                    px0.OooO00o(ei1Var.OooO0OO.Oooo0, ei1Var.OooO00o);
                    return;
                }
                return;
            case 17:
                ep0 ep0VarOooO0oO = ep0.OooO0oO();
                String str4 = kp.OooO0Oo;
                w02 w02Var = (w02) pi2Var2.OooO0o0;
                ep0VarOooO0oO.OooO0Oo(str4, rj.OooO0OO("Scheduling work ", w02Var.OooO00o), new Throwable[0]);
                ((kp) pi2Var2.OooO0o).OooO00o.OooO0o0(w02Var);
                return;
            case 18:
                lx lxVar = (lx) pi2Var2.OooO0o0;
                JobParameters jobParameters = (JobParameters) pi2Var2.OooO0o;
                try {
                    u7.OooO00o(new byte[]{114, -86, 57}, new byte[]{24, -59, 91, -103, -117, -42, -79, -102});
                    u7.OooO00o(new byte[]{-128, -56, 102, -87, -115, 97, -74, 119, -100, -34, 51, -7}, new byte[]{-13, -68, 9, -39, -52, 17, -58, 61});
                    Objects.toString(jobParameters);
                    int i28 = fp0.OooO00o;
                    lxVar.OooOO0.stopJob(jobParameters);
                    return;
                } catch (Throwable unused4) {
                    u7.OooO00o(new byte[]{-90, 91, 104}, new byte[]{-52, 52, 10, 118, 40, 46, -109, 23});
                    u7.OooO00o(new byte[]{-21, -58, 55, 58, -80, -79, -20, 49, -9, -48, 120, 47, -125, -77, -13, 9, -94, -110}, new byte[]{-104, -78, 88, 74, -15, -63, -100, 123});
                    Objects.toString(jobParameters);
                    int i29 = fp0.OooO00o;
                    mx mxVar = lxVar.OooOO0O;
                    mxVar.getClass();
                    mx.OooO0o0.execute(new pi2(mxVar, lxVar, jobParameters, true));
                    return;
                }
            case 19:
                pi2Var2.OooO0Oo();
                return;
            case 20:
                h70 h70VarOooO00o = h70.OooO00o();
                h70VarOooO00o.getClass();
                pr1.OooO00o();
                h70VarOooO00o.OooO0Oo.set(true);
                ((b00) pi2Var2.OooO0o).OooO0o0.OooO0o0 = true;
                ((b00) pi2Var2.OooO0o).OooO0Oo.getViewTreeObserver().removeOnDrawListener((b00) pi2Var2.OooO0o0);
                ((b00) pi2Var2.OooO0o).OooO0o0.OooO0Oo.clear();
                return;
            case zzbcj.zzt.zzm /* 21 */:
                p50 p50Var = (p50) pi2Var2.OooO0o;
                if (p50Var.OooO0Oo) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) pi2Var2.OooO0o0).run();
                    return;
                } catch (Throwable th6) {
                    p50Var.OooO0OO.getClass();
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th6);
                        return;
                    }
                    return;
                }
            case 22:
                pi2Var2.OooO0o0();
                return;
            case 23:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) pi2Var2.OooO0o0;
                JobParameters jobParameters2 = (JobParameters) pi2Var2.OooO0o;
                int i30 = JobInfoSchedulerService.OooO0Oo;
                jobInfoSchedulerService.jobFinished(jobParameters2, false);
                return;
            case 24:
                nm0 nm0Var = (nm0) pi2Var2.OooO0o;
                zj zjVar = nm0Var.OooO0o;
                while (true) {
                    try {
                        ((Runnable) pi2Var2.OooO0o0).run();
                    } catch (Throwable th7) {
                        qp2.OooO00o(lv.OooO0Oo, th7);
                    }
                    Runnable runnableOooOOoo = nm0Var.OooOOoo();
                    if (runnableOooOOoo == null) {
                        return;
                    }
                    pi2Var2.OooO0o0 = runnableOooOOoo;
                    i5++;
                    if (i5 >= 16 && zjVar.OooOOo()) {
                        zjVar.OooOOOO(nm0Var, pi2Var2);
                        return;
                    }
                }
                break;
            case 25:
                pi2Var2.OooO0o();
                return;
            case 26:
                ((v00) pi2Var2.OooO0o0).accept(pi2Var2.OooO0o);
                return;
            case 27:
                ze1 ze1Var = (ze1) pi2Var2.OooO0o;
                AtomicInteger atomicInteger = ze1Var.OooO0oO;
                try {
                    ThreadLocal threadLocal = ze1.OooO0oo;
                    threadLocal.set(ze1Var);
                    ((Runnable) pi2Var2.OooO0o0).run();
                    threadLocal.remove();
                    atomicInteger.decrementAndGet();
                    ze1Var.OooO0O0();
                    return;
                } catch (Throwable th8) {
                    ze1.OooO0oo.remove();
                    atomicInteger.decrementAndGet();
                    ze1Var.OooO0O0();
                    throw th8;
                }
            case 28:
                ye1 ye1Var = (ye1) pi2Var2.OooO0o;
                AtomicInteger atomicInteger2 = ye1Var.OooO0oO;
                try {
                    ThreadLocal threadLocal2 = ye1.OooO0oo;
                    threadLocal2.set(ye1Var);
                    ((Runnable) pi2Var2.OooO0o0).run();
                    threadLocal2.remove();
                    atomicInteger2.decrementAndGet();
                    ye1Var.OooO00o();
                    return;
                } catch (Throwable th9) {
                    ye1.OooO0oo.remove();
                    atomicInteger2.decrementAndGet();
                    ye1Var.OooO00o();
                    throw th9;
                }
            default:
                af1 af1Var = (af1) pi2Var2.OooO0o0;
                try {
                    ((Runnable) pi2Var2.OooO0o).run();
                    return;
                } finally {
                    af1Var.OooO00o();
                }
        }
    }

    public String toString() {
        switch (this.OooO0Oo) {
            case 0:
                hx2 hx2Var = new hx2(pi2.class.getSimpleName());
                vc3 vc3Var = (vc3) this.OooO0o;
                er1 er1Var = new er1(6);
                ((er1) hx2Var.OooO0oO).OooO0o = er1Var;
                hx2Var.OooO0oO = er1Var;
                er1Var.OooO0o0 = vc3Var;
                return hx2Var.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ pi2(Object obj, Object obj2, int i, boolean z) {
        this.OooO0Oo = i;
        this.OooO0o = obj;
        this.OooO0o0 = obj2;
    }

    public /* synthetic */ pi2(Object obj, Object obj2, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
        this.OooO0o = obj2;
    }

    public pi2(mx mxVar, lx lxVar, JobParameters jobParameters, boolean z) {
        this.OooO0Oo = 19;
        this.OooO0o = mxVar;
        this.OooO0o0 = lxVar;
    }

    public pi2(vj0 vj0Var, sj0 sj0Var, int i) {
        this.OooO0Oo = 22;
        this.OooO0o = vj0Var;
        this.OooO0o0 = sj0Var;
    }

    public pi2(xb1 xb1Var, t01 t01Var, boolean z) {
        this.OooO0Oo = 25;
        this.OooO0o = xb1Var;
        this.OooO0o0 = t01Var;
    }
}
