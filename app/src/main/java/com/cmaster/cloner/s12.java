package com.cmaster.cloner;

import android.content.Context;
import android.content.res.Resources;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class s12 implements f60, g60 {
    public final oOO0O0 OooO0o;
    public final oOO000 OooO0o0;
    public final vr1 OooO0oO;
    public final int OooOO0;
    public final e22 OooOO0O;
    public boolean OooOO0o;
    public final /* synthetic */ h60 OooOOOo;
    public final LinkedList OooO0Oo = new LinkedList();
    public final HashSet OooO0oo = new HashSet();
    public final HashMap OooO = new HashMap();
    public final ArrayList OooOOO0 = new ArrayList();
    public gh OooOOO = null;
    public int OooOOOO = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public s12(h60 h60Var, b60 b60Var) {
        this.OooOOOo = h60Var;
        xi1 xi1Var = h60Var.OooOOOo;
        Looper looper = xi1Var.getLooper();
        hx2 hx2VarOooO0O0 = b60Var.OooO0O0();
        oO0Ooooo oo0ooooo = new oO0Ooooo((m3) hx2VarOooO0O0.OooO0o0, (String) hx2VarOooO0O0.OooO0o, (String) hx2VarOooO0O0.OooO0oO);
        m12 m12Var = (m12) b60Var.OooO0o.OooO0o0;
        by2.OooO0oo(m12Var);
        oOO000 ooo000OooO00o = m12Var.OooO00o(b60Var.OooO0Oo, looper, oo0ooooo, b60Var.OooO0oO, this, this);
        String str = b60Var.OooO0o0;
        if (str != null && (ooo000OooO00o instanceof m6)) {
            ((m6) ooo000OooO00o).setAttributionTag(str);
        }
        if (str != null && (ooo000OooO00o instanceof dx0)) {
            if (ooo000OooO00o == 0) {
                throw null;
            }
            ra.OooOO0o();
            throw null;
        }
        this.OooO0o0 = ooo000OooO00o;
        this.OooO0o = b60Var.OooO0oo;
        this.OooO0oO = new vr1(4);
        this.OooOO0 = b60Var.OooO;
        if (!ooo000OooO00o.requiresSignIn()) {
            this.OooOO0O = null;
            return;
        }
        Context context = h60Var.OooO0oo;
        hx2 hx2VarOooO0O02 = b60Var.OooO0O0();
        this.OooOO0O = new e22(context, xi1Var, new oO0Ooooo((m3) hx2VarOooO0O02.OooO0o0, (String) hx2VarOooO0O02.OooO0o, (String) hx2VarOooO0O02.OooO0oO));
    }

    public final boolean OooO(gh ghVar) {
        synchronized (h60.OooOo00) {
        }
        return false;
    }

    public final void OooO00o(gh ghVar) {
        HashSet hashSet = this.OooO0oo;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else if (it.next() != null) {
            ra.OooOO0o();
        } else {
            if (uw2.OooO00o(ghVar, gh.OooO0oo)) {
                this.OooO0o0.getEndpointPackageName();
            }
            throw null;
        }
    }

    public final void OooO0O0(Status status) {
        by2.OooO0OO(this.OooOOOo.OooOOOo);
        OooO0OO(status, null, false);
    }

    public final void OooO0OO(Status status, Exception exc, boolean z) {
        by2.OooO0OO(this.OooOOOo.OooOOOo);
        if ((status == null) == (exc == null)) {
            ra.OooOOO("Status XOR exception should be null");
            return;
        }
        Iterator it = this.OooO0Oo.iterator();
        while (it.hasNext()) {
            z12 z12Var = (z12) it.next();
            if (!z || z12Var.OooO00o == 2) {
                if (status != null) {
                    z12Var.OooO0OO(status);
                } else {
                    z12Var.OooO0Oo(exc);
                }
                it.remove();
            }
        }
    }

    public final void OooO0Oo() {
        LinkedList linkedList = this.OooO0Oo;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            z12 z12Var = (z12) arrayList.get(i);
            if (!this.OooO0o0.isConnected()) {
                return;
            }
            if (OooO0oo(z12Var)) {
                linkedList.remove(z12Var);
            }
        }
    }

    public final void OooO0o(int i) {
        h60 h60Var = this.OooOOOo;
        xi1 xi1Var = h60Var.OooOOOo;
        by2.OooO0OO(h60Var.OooOOOo);
        this.OooOOO = null;
        this.OooOO0o = true;
        String lastDisconnectMessage = this.OooO0o0.getLastDisconnectMessage();
        vr1 vr1Var = this.OooO0oO;
        vr1Var.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (lastDisconnectMessage != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(lastDisconnectMessage);
        }
        vr1Var.OooO(true, new Status(20, sb.toString(), null, null));
        oOO0O0 ooo0o0 = this.OooO0o;
        xi1Var.sendMessageDelayed(Message.obtain(xi1Var, 9, ooo0o0), 5000L);
        xi1Var.sendMessageDelayed(Message.obtain(xi1Var, 11, ooo0o0), 120000L);
        ((SparseIntArray) h60Var.OooOO0.OooO0o0).clear();
        Iterator it = this.OooO.values().iterator();
        while (it.hasNext()) {
            ((d22) it.next()).getClass();
        }
    }

    public final void OooO0o0() {
        h60 h60Var = this.OooOOOo;
        by2.OooO0OO(h60Var.OooOOOo);
        this.OooOOO = null;
        OooO00o(gh.OooO0oo);
        xi1 xi1Var = h60Var.OooOOOo;
        if (this.OooOO0o) {
            oOO0O0 ooo0o0 = this.OooO0o;
            xi1Var.removeMessages(11, ooo0o0);
            xi1Var.removeMessages(9, ooo0o0);
            this.OooOO0o = false;
        }
        Iterator it = this.OooO.values().iterator();
        if (it.hasNext()) {
            throw null;
        }
        OooO0Oo();
        OooO0oO();
    }

    public final void OooO0oO() {
        h60 h60Var = this.OooOOOo;
        xi1 xi1Var = h60Var.OooOOOo;
        oOO0O0 ooo0o0 = this.OooO0o;
        xi1Var.removeMessages(12, ooo0o0);
        xi1Var.sendMessageDelayed(xi1Var.obtainMessage(12, ooo0o0), h60Var.OooO0Oo);
    }

    public final boolean OooO0oo(z12 z12Var) throws Resources.NotFoundException {
        iz izVar;
        if (z12Var == null) {
            vr1 vr1Var = this.OooO0oO;
            oOO000 ooo000 = this.OooO0o0;
            z12Var.OooO0o(vr1Var, ooo000.requiresSignIn());
            try {
                z12Var.OooO0o0(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                ooo000.disconnect("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        iz[] izVarArrOooO0O0 = z12Var.OooO0O0(this);
        if (izVarArrOooO0O0 == null || izVarArrOooO0O0.length == 0) {
            izVar = null;
        } else {
            iz[] availableFeatures = this.OooO0o0.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new iz[0];
            }
            k3 k3Var = new k3(availableFeatures.length);
            for (iz izVar2 : availableFeatures) {
                k3Var.put(izVar2.OooO0Oo, Long.valueOf(izVar2.OooO00o()));
            }
            int length = izVarArrOooO0O0.length;
            for (int i = 0; i < length; i++) {
                izVar = izVarArrOooO0O0[i];
                Long l = (Long) k3Var.get(izVar.OooO0Oo);
                if (l == null || l.longValue() < izVar.OooO00o()) {
                    break;
                }
            }
            izVar = null;
        }
        if (izVar == null) {
            vr1 vr1Var2 = this.OooO0oO;
            oOO000 ooo0002 = this.OooO0o0;
            z12Var.OooO0o(vr1Var2, ooo0002.requiresSignIn());
            try {
                z12Var.OooO0o0(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                ooo0002.disconnect("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.OooO0o0.getClass().getName() + " could not execute call because it requires feature (" + izVar.OooO0Oo + ", " + izVar.OooO00o() + ").");
        if (!this.OooOOOo.OooOOo0 || !z12Var.OooO00o(this)) {
            z12Var.OooO0Oo(new cr1(izVar));
            return true;
        }
        t12 t12Var = new t12(this.OooO0o, izVar);
        int iIndexOf = this.OooOOO0.indexOf(t12Var);
        ArrayList arrayList = this.OooOOO0;
        if (iIndexOf >= 0) {
            t12 t12Var2 = (t12) arrayList.get(iIndexOf);
            this.OooOOOo.OooOOOo.removeMessages(15, t12Var2);
            xi1 xi1Var = this.OooOOOo.OooOOOo;
            xi1Var.sendMessageDelayed(Message.obtain(xi1Var, 15, t12Var2), 5000L);
        } else {
            arrayList.add(t12Var);
            xi1 xi1Var2 = this.OooOOOo.OooOOOo;
            xi1Var2.sendMessageDelayed(Message.obtain(xi1Var2, 15, t12Var), 5000L);
            xi1 xi1Var3 = this.OooOOOo.OooOOOo;
            xi1Var3.sendMessageDelayed(Message.obtain(xi1Var3, 16, t12Var), 120000L);
            gh ghVar = new gh(2, null);
            if (!OooO(ghVar)) {
                this.OooOOOo.OooO0O0(ghVar, this.OooOO0);
            }
        }
        return false;
    }

    public final void OooOO0() {
        int iOooO0OO;
        h60 h60Var = this.OooOOOo;
        by2.OooO0OO(h60Var.OooOOOo);
        oOO000 ooo000 = this.OooO0o0;
        if (ooo000.isConnected() || ooo000.isConnecting()) {
            return;
        }
        try {
            er1 er1Var = h60Var.OooOO0;
            Context context = h60Var.OooO0oo;
            SparseIntArray sparseIntArray = (SparseIntArray) er1Var.OooO0o0;
            by2.OooO0oo(context);
            if (ooo000.requiresGooglePlayServices()) {
                int minApkVersion = ooo000.getMinApkVersion();
                iOooO0OO = ((SparseIntArray) er1Var.OooO0o0).get(minApkVersion, -1);
                if (iOooO0OO == -1) {
                    int i = 0;
                    while (true) {
                        if (i >= sparseIntArray.size()) {
                            iOooO0OO = -1;
                            break;
                        }
                        int iKeyAt = sparseIntArray.keyAt(i);
                        if (iKeyAt > minApkVersion && sparseIntArray.get(iKeyAt) == 0) {
                            iOooO0OO = 0;
                            break;
                        }
                        i++;
                    }
                    if (iOooO0OO == -1) {
                        iOooO0OO = ((d60) er1Var.OooO0o).OooO0OO(context, minApkVersion);
                    }
                    sparseIntArray.put(minApkVersion, iOooO0OO);
                }
            } else {
                iOooO0OO = 0;
            }
            if (iOooO0OO != 0) {
                gh ghVar = new gh(iOooO0OO, null);
                Log.w("GoogleApiManager", "The service for " + ooo000.getClass().getName() + " is not available: " + ghVar.toString());
                OooOO0o(ghVar, null);
                return;
            }
            u12 u12Var = new u12();
            u12Var.OooO = h60Var;
            u12Var.OooO0oO = null;
            u12Var.OooO0oo = null;
            u12Var.OooO0Oo = false;
            u12Var.OooO0o0 = ooo000;
            u12Var.OooO0o = this.OooO0o;
            if (ooo000.requiresSignIn()) {
                e22 e22Var = this.OooOO0O;
                by2.OooO0oo(e22Var);
                Handler handler = e22Var.OooO0o;
                oO0Ooooo oo0ooooo = e22Var.OooO;
                bh1 bh1Var = e22Var.OooOO0;
                if (bh1Var != null) {
                    bh1Var.disconnect();
                }
                oo0ooooo.OooOO0 = Integer.valueOf(System.identityHashCode(e22Var));
                e22Var.OooOO0 = (bh1) e22Var.OooO0oO.OooO00o(e22Var.OooO0o0, handler.getLooper(), oo0ooooo, (ch1) oo0ooooo.OooO, e22Var, e22Var);
                e22Var.OooOO0O = u12Var;
                Set set = e22Var.OooO0oo;
                if (set == null || set.isEmpty()) {
                    handler.post(new u91(e22Var, 17));
                } else {
                    bh1 bh1Var2 = e22Var.OooOO0;
                    bh1Var2.getClass();
                    bh1Var2.connect(new xb1(bh1Var2, 6));
                }
            }
            try {
                ooo000.connect(u12Var);
            } catch (SecurityException e) {
                OooOO0o(new gh(10), e);
            }
        } catch (IllegalStateException e2) {
            OooOO0o(new gh(10), e2);
        }
    }

    public final void OooOO0O(z12 z12Var) {
        by2.OooO0OO(this.OooOOOo.OooOOOo);
        boolean zIsConnected = this.OooO0o0.isConnected();
        LinkedList linkedList = this.OooO0Oo;
        if (zIsConnected) {
            if (OooO0oo(z12Var)) {
                OooO0oO();
                return;
            } else {
                linkedList.add(z12Var);
                return;
            }
        }
        linkedList.add(z12Var);
        gh ghVar = this.OooOOO;
        if (ghVar == null || ghVar.OooO0o0 == 0 || ghVar.OooO0o == null) {
            OooOO0();
        } else {
            OooOO0o(ghVar, null);
        }
    }

    public final void OooOO0o(gh ghVar, RuntimeException runtimeException) {
        bh1 bh1Var;
        by2.OooO0OO(this.OooOOOo.OooOOOo);
        e22 e22Var = this.OooOO0O;
        if (e22Var != null && (bh1Var = e22Var.OooOO0) != null) {
            bh1Var.disconnect();
        }
        by2.OooO0OO(this.OooOOOo.OooOOOo);
        this.OooOOO = null;
        ((SparseIntArray) this.OooOOOo.OooOO0.OooO0o0).clear();
        OooO00o(ghVar);
        if ((this.OooO0o0 instanceof u22) && ghVar.OooO0o0 != 24) {
            h60 h60Var = this.OooOOOo;
            h60Var.OooO0o0 = true;
            xi1 xi1Var = h60Var.OooOOOo;
            xi1Var.sendMessageDelayed(xi1Var.obtainMessage(19), 300000L);
        }
        if (ghVar.OooO0o0 == 4) {
            OooO0O0(h60.OooOOoo);
            return;
        }
        if (this.OooO0Oo.isEmpty()) {
            this.OooOOO = ghVar;
            return;
        }
        h60 h60Var2 = this.OooOOOo;
        if (runtimeException != null) {
            by2.OooO0OO(h60Var2.OooOOOo);
            OooO0OO(null, runtimeException, false);
            return;
        }
        boolean z = h60Var2.OooOOo0;
        oOO0O0 ooo0o0 = this.OooO0o;
        if (!z) {
            OooO0O0(h60.OooO0OO(ooo0o0, ghVar));
            return;
        }
        OooO0OO(h60.OooO0OO(ooo0o0, ghVar), null, true);
        if (this.OooO0Oo.isEmpty() || OooO(ghVar) || this.OooOOOo.OooO0O0(ghVar, this.OooOO0)) {
            return;
        }
        if (ghVar.OooO0o0 == 18) {
            this.OooOO0o = true;
        }
        if (!this.OooOO0o) {
            OooO0O0(h60.OooO0OO(this.OooO0o, ghVar));
            return;
        }
        h60 h60Var3 = this.OooOOOo;
        oOO0O0 ooo0o02 = this.OooO0o;
        xi1 xi1Var2 = h60Var3.OooOOOo;
        xi1Var2.sendMessageDelayed(Message.obtain(xi1Var2, 9, ooo0o02), 5000L);
    }

    public final void OooOOO() {
        by2.OooO0OO(this.OooOOOo.OooOOOo);
        Status status = h60.OooOOo;
        OooO0O0(status);
        this.OooO0oO.OooO(false, status);
        for (sn0 sn0Var : (sn0[]) this.OooO.keySet().toArray(new sn0[0])) {
            OooOO0O(new o22(null, new yl1()));
        }
        OooO00o(new gh(4));
        oOO000 ooo000 = this.OooO0o0;
        if (ooo000.isConnected()) {
            ooo000.onUserSignOut(new vk1(this, 3));
        }
    }

    public final void OooOOO0(gh ghVar) {
        by2.OooO0OO(this.OooOOOo.OooOOOo);
        oOO000 ooo000 = this.OooO0o0;
        ooo000.disconnect("onSignInFailed for " + ooo000.getClass().getName() + " with " + String.valueOf(ghVar));
        OooOO0o(ghVar, null);
    }

    @Override // com.cmaster.cloner.f60
    public final void o0000o0O() {
        Looper looperMyLooper = Looper.myLooper();
        xi1 xi1Var = this.OooOOOo.OooOOOo;
        if (looperMyLooper == xi1Var.getLooper()) {
            OooO0o0();
        } else {
            xi1Var.post(new u91(this, 15));
        }
    }

    @Override // com.cmaster.cloner.g60
    public final void onConnectionFailed(gh ghVar) {
        OooOO0o(ghVar, null);
    }

    @Override // com.cmaster.cloner.f60
    public final void onConnectionSuspended(int i) {
        Looper looperMyLooper = Looper.myLooper();
        xi1 xi1Var = this.OooOOOo.OooOOOo;
        if (looperMyLooper == xi1Var.getLooper()) {
            OooO0o(i);
        } else {
            xi1Var.post(new oa(i, 3, this));
        }
    }
}
